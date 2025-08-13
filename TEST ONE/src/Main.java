import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String[][] speed = {{"128km", "135km", "139km"},
                           {"155km","129km", "175km"},
                           {"129km","130km","185km"},
                           {"195km","155km","221km"},
        };

        String[] months = ("JAN" ,"FEB","MAR")
        System.out.println("%10s, speed");
        System.out.println("********************************");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("********************************");

        for (int i = 0; i < speed.length; i++) {
            System.out.println("i = " + speed.length);
            }

        for (int j = 0; j < months.length;j++);
        System.out.println("j =" + months.length);

                System.out.println("***********************************");
                System.out.println("SPEEDING FINES STATISTICS");
                System.out.println("***********************************");
                System.out.println("Maximum speed captured: 221km");
                System.out.println("Minimum speed captured:128km");
                System.out.println("***********************************");
            }

        }

