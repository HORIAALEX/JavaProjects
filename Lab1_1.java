public class Lab1_1{
    public static void main(String[] args) {

        double a = (double) 1 / 2;
        double b = (double) 3/17;
        double c = (double) 5/2;
        double d = Math.sqrt((double) 1 /2);
        double e = (double) 2/Math.pow(7,3);

        double res1 = (a+(b*c)+d)/e;

        double f = (double)9/2;
        double g = (double)3/4;
        double h = (double)1/Math.pow(3,3);
        double res2 = (f+g)/h;

        double result = res1*res2;
        System.out.println(result);
    }
}
//Result is: 40069.97188605145
