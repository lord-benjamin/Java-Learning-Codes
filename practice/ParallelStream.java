import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        // What is Parallel Stream?
        // A parallel stream is a stream that can process its elements in parallel, using multiple threads.
        // This can improve the performance of certain operations on large data sets, as it can take advantage of multiple CPU cores.
        // However, it is important to note that not all operations can be parallelized, and that the performance benefits of parallel streams can vary depending on the size of the data set and the nature of the operations being performed.
        
        int size = 10_000;   // Working with parallel stream requires large data set to see the benefits of parallelism, otherwise the overhead of creating and managing threads will outweigh the benefits
        List<Integer> nums = new ArrayList<>(size);

        Random rand = new Random();
        for(int i=0; i<size; ++i){
            nums.add(rand.nextInt(100));
        }

        
        int s1 = nums.stream()
                    .map(n-> n*2)
                    .reduce(0,(a,b) -> a+b);


        // Without delay, the time taken by stream and parallel stream will be very close (maybe for parallel stream it will be slightly more because of the overhead of creating and managing threads)
        long startStreamBefore = System.currentTimeMillis();  // Gives the current time in milliseconds
        int s2 = nums.stream()
                    .map(n -> n*2)
                    .mapToInt(n -> n)  // converts the stream to IntStream, without any operation, so that we can use the sum() method which is more efficient than reduce() for summing up integers
                    .sum();
        long endStreamBefore = System.currentTimeMillis();

        long startParallelStreamBefore = System.currentTimeMillis();
        int s3 = nums.parallelStream()
                    .map(n -> n*2)
                    .mapToInt(n -> n)
                    .sum();
        long endParallelStreamBefore = System.currentTimeMillis();


        // With delay, the time taken by parallel stream will be significantly less than the time taken by stream, as it will allow multiple threads to process the elements in parallel, reducing the overall time taken to process the stream
        long startStreamAfter = System.currentTimeMillis();  // Gives the current time in milliseconds
        int s4 = nums.stream()
                    .map(n-> {
                        try{
                            Thread.sleep(1);  // Simulating a time-consuming operation by adding a delay of 1 millisecond for each element in the stream to show the benefits of parallelism, as it will allow multiple threads to process the elements in parallel, reducing the overall time taken to process the stream
                        } catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        return n*2;
                    }                     
                    )
                    .mapToInt(n -> n)
                    .sum();
        long endStreamAfter = System.currentTimeMillis();

        long startParallelStreamAfter = System.currentTimeMillis();
        int s5 = nums.parallelStream()
                    .map(n-> {
                        try{
                            Thread.sleep(1);  // Simulating a time-consuming operation by adding a delay of 1 millisecond for each element in the stream to show the benefits of parallelism, as it will allow multiple threads to process the elements in parallel, reducing the overall time taken to process the stream
                        } catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        return n*2;
                    }                     
                    )
                    .mapToInt(n -> n)
                    .sum();
        long endParallelStreamAfter = System.currentTimeMillis();
        

        System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
        System.out.println("Time taken by stream: "+(endStreamBefore - startStreamBefore)+" ms");
        System.out.println("Time taken by parallel stream: "+(endParallelStreamBefore - startParallelStreamBefore)+" ms");
        System.out.println("Time taken by stream after delay: "+(endStreamAfter - startStreamAfter)+" ms");
        System.out.println("Time taken by parallel stream after delay: "+(endParallelStreamAfter - startParallelStreamAfter)+" ms");
    }
}
