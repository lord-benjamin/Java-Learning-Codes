class Student {
    int rollNo;
    String name;
    int marks;
}

public class Array {
    public static void main(String[] args) {
        // 1D array
        System.out.println("1D Array:");
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int numbers[] = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // 2D array
        System.out.println("2D Array:");
        int arr2[][] = new int[2][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int element[] : arr2) {     // for-each loop (enhanced for loop)
            for (int e : element) {     // for-each loop (enhanced for loop)
                System.out.print(e + " ");
            }
            System.out.println();
        }

        // jagged array
        System.out.println("Jagged Array:");
        int jaggedArr[][] = new int[3][]; // jagged array (array of arrays with different lengths)
        jaggedArr[0] = new int[3];
        jaggedArr[1] = new int[2];
        jaggedArr[2] = new int[4];
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                jaggedArr[i][j] = (int)(Math.random() * 10);
            }
        }
        for (int element[] : jaggedArr) {
            for (int e : element) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

        // 3D array
        System.out.println("3D Array:");
        int arr3[][][] = new int[2][4][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    arr3[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }
        for (int element[][] : arr3) {
            for (int e[] : element) {
                for (int num : e) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // array of objects
        System.out.println("Array of Objects:");
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Alice";
        s1.marks = 85;
        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Bob";
        s2.marks = 90;
        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Charlie";
        s3.marks = 95;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student s : students) {
            System.out.println("Roll No: " + s.rollNo + ", Name: " + s.name + ", Marks: " + s.marks);
        }
    }
}
