import java.util.Scanner;

public class EnemyMove {
    public static void main(String[] args) {
        Scanner sc_object = new Scanner(System.in);
        int cases = sc_object.nextInt();

        for(int i = 0; i < cases; i++){
            double startX = sc_object.nextDouble();
            double startY = sc_object.nextDouble();

            double speed = sc_object.nextDouble();

            double endX = sc_object.nextDouble();
            double endY= sc_object.nextDouble();
            
            move(startX, startY, speed, endX, endY);
        }
        
    }

    public static void move(double x1, double y1, double speed, double x2, double y2){
        double distance = Math.sqrt((Math.pow((x2- x1), 2)) + Math.pow((y2-y1), 2));
        if(distance > speed){
            double ratio = speed / distance;
            double movex = ratio * (x2-x1);
            double movey = ratio * (y2-y1);

            x1 = x1 + movex;
            y1 = y1 + movey;
        }
        else{
            x1 = x2;
            y1 = y2;
        }
        System.out.printf("x=%.1f, y=%.1f\n", x1, y1);
    }
}
