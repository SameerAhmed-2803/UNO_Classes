import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner sc_object = new Scanner(System.in);
        int cases = sc_object.nextInt();
        
        while(cases-- > 0){
            double xOne = sc_object.nextDouble();
            double yOne = sc_object.nextDouble();
            double xTwo = sc_object.nextDouble();
            double yTwo = sc_object.nextDouble();

            double distance = Math.sqrt(Math.pow(xTwo - xOne, 2)+ Math.pow(yTwo - yOne, 2));
            System.out.println(distance);
        }
    }
}
