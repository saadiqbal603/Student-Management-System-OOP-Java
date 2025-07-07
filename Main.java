package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);


        int c, usr;
        Management ob = new Management();


        do {
            System.out.println(":::::::::MENU:::::::::");
            //System.out.println("ENTER 1 FOR GENERATION OF ID");
            System.out.println("ENTER 1 FOR ADDING DETAIL");
            System.out.println("ENTER 2 FOR SEARCHING");
            System.out.println("ENTER 3 FOR DELETION");
            System.out.println("ENTER 4 FOR UPDATION");
            System.out.println("ENTER 5 TO REGISTER COURSE");
            System.out.println("ENTER 6 TO EXIT");
            int ch = s.nextInt();
            ob.clearConsole();


            switch (ch) {
//                case 1:
//                    System.out.println("enter the no of entries");
//                    int e=s.nextInt();
//                    for (int i = 0; i < e; i++) {
//                        System.out.println("Registeration ID "+(i+1)+" is ");
//                        ob.id();
//
//                    }
                case 1:
                    System.out.println("HOW MANY ENTRIES YOU WANT TO ENTER: ");
                    usr = s.nextInt();
                    ob.add(usr);
                    break;
                case 2:
                    ob.search();
                    break;
                case 3:
                    ob.delete();
                    break;
                case 4:
                    ob.update();
                    break;
                case 5:
                    ob.enroll();
                    break;
                case 6:
                    System.exit(0);

            }

            System.out.println("press any key other than 6 to do more operations else press 6 to exit");
            c = s.nextInt();
        } while (c != 6);

    }

}
