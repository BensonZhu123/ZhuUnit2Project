import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinate 1: ");
        String coor1 = scan.nextLine();
        int len1 = coor1.length();
        int x1 = Integer.parseInt(coor1.substring(1, coor1.indexOf(",")));
        int y1 = Integer.parseInt(coor1.substring(coor1.indexOf(",")+2, len1-1));
        System.out.print("Enter coordinate 2: ");
        String coor2 = scan.nextLine();
        int len2 = coor2.length();
        int x2 = Integer.parseInt(coor2.substring(1, coor2.indexOf(",")));
        int y2 = Integer.parseInt(coor2.substring(coor2.indexOf(",")+2, len2-1));
        LinearEquation eq1 = new LinearEquation(x1,y1,x2,y2);


    }
}
