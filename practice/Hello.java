public class Hello {
    public static void main(String[] args) {
        byte a = 127;
        short s = 1503;
        int i = 15067;
        long l = 2342342l;

        float f = 3.4f;
        double d = 4.5678;

        char c = 'A';
        String str = "Hello World";

        boolean b = true;
        
        System.out.println(l+","+a+","+s+","+i+","+f+","+d+","+c+","+b+","+str);
        

        byte y = 45;
        int x = 3;
        y = (byte)x;

        System.out.println(y);


        int n1=7,n2=5;
        double result = (double)n1/n2;

        System.out.println(result);


        int num1 = 10; 
        double num2 = 10.01;

        boolean res = num1<=num2;

        System.out.println(res);


        // boolean r = 10<5 & 5>3;    checks all the conditions and gives the result
        boolean r = 10<5 && 5>3;      // short circuit
        System.out.println(r);

        int m,n;
        m = n = 10;
        System.out.println(m+","+n);
    }
}