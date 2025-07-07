package com.company;
import java.util.Random;
import java.util.Scanner;
import java.time.Month;
public class Management extends student {
    int usr;

    Scanner s = new Scanner(System.in);
    int i = 0, c = 0, r = 0;

    public void clearConsole() {
        System.out.println(System.lineSeparator().repeat(100000));
    }

//    public static String id() {
//
//        Random rnd = new Random();
//        int number = rnd.nextInt(9999);
//
//        System.out.println(number);
//        return "  ";
//    }

    Management() {
        roll = new int[25];
        name = new String[25];
        father_name = new String[25];
    }

    public void add(int usr) {
        for (i = 0; i < usr; i++) {
            System.out.println("Enter Name and Father Name: ");
            name[i] = s.next();
            father_name[i] = s.next();

            Random rnd = new Random();
            roll[i] = rnd.nextInt(9999);
            System.out.println("Auto Generated Roll No: "+roll[i]);
        }
        display();
    }

    public void search() {

        System.out.println("Enter the Roll No You Want to Search: ");
        r = s.nextInt();
        for (i = 0; i < roll.length; i++) {
            if (roll[i] == r) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("---DETAILS OF THE SPECIFIED STUDENT IS---");
                System.out.println("NAME      ||      FatherName    ||      Roll No");
                System.out.print(name[i] + "      ||      ");
                System.out.println(father_name[i] + "         ||      " + roll[i]);
                System.out.println(" ");

            }

        }
    }

    public void delete() {
        System.out.println("Enter the Roll No for Data Deletion");
        r = s.nextInt();

        for (i = 0; i < roll.length; i++) {
            if (roll[i] == r) {
                roll[i] = 0;
                name[i] = " ";
                father_name[i] =" ";
            }
        }
        display();

    }

    public void update() {
        System.out.println("Enter the Roll No to be Updated: ");
        r = s.nextInt();

        for (i = 0; i < roll.length; i++) {
            if (roll[i] == r) {
                System.out.println("Enter the Updated Name,Father Name and Roll No: ");
                name[i] = s.next();
                father_name[i] = s.next();
                roll[i] = s.nextInt();

            }

        }
        display();
    }


    void display() {
        System.out.println(" ");
        System.out.println("----THE UPDATED RECORDS OF STUDENTS ARE----");
        System.out.println("NAME      ||      FatherName    ||      Roll No");
        for (i = 0; i < roll.length; i++) {
            if (roll[i] != 0) {
                System.out.print(name[i] + "      ||      ");
                System.out.println(father_name[i]+"         ||      "+roll[i]);
                System.out.println(" ");

            }
        }
    }

//        public void courses() {
//        int sc, size;
//        int sel = 0;
//
//        do {
//            System.out.println("Offered Courses Are: ");
//            System.out.println("1.FOP THEORY\n2.FOP LAB\n3.ITC THEORY\n4.ITC LAB\n5.OOP THEORY\n6.OOP LAB");
//            System.out.println("How Many Courses You Want To Select: ");
//            size = s.nextInt();
//
//            System.out.println("Enter Course No. From 1-6 You Want To Select");
//
//            for (int i = 0; i < size; i++) {
//                    sel = s.nextInt();
//                }
//
//                int c1 = 1800;
//                int c2 = 6500;
//                int c3 = 15600;
//                int c4 = 4600;
//                int c5 = 20000;
//                int c6 = 7600;
//                if (sel == 1) {
//                    System.out.println("Rs." + c1);
//                } else if (sel == 2) {
//                    System.out.println("Rs." + c2);
//                } else if (sel == 3) {
//                    System.out.println("Rs." + c3);
//                } else if (sel == 4) {
//                    System.out.println("Rs." + c4);
//                } else if (sel == 5) {
//                    System.out.println("Rs." + c5);
//                } else if (sel == 6) {
//                    System.out.println("Rs." + c6);
//                }
//                //------------------------------------
//                else if (sel == 1 && sel == 2) {
//                    System.out.println("Rs." + c1 + c2);
//                } else if (sel == 1 && sel == 3) {
//                    System.out.println("Rs." + c1 + c3);
//                } else if (sel == 1 && sel == 4) {
//                    System.out.println("Rs." + c1 + c4);
//                } else if (sel == 1 && sel == 5) {
//                    System.out.println("Rs." + c1 + c5);
//                } else if (sel == 1 && sel == 6) {
//                    System.out.println("Rs." + c1 + c6);
//                }
//                //------------------------------
//                else if (sel == 2 && sel == 1) {
//                    System.out.println("Rs." + c2 + c1);
//                } else if (sel == 2 && sel == 3) {
//                    System.out.println("Rs." + c2 + c3);
//                } else if (sel == 2 && sel == 4) {
//                    System.out.println("Rs." + c2 + c4);
//                } else if (sel == 2 && sel == 5) {
//                    System.out.println("Rs." + c2 + c5);
//                } else if (sel == 2 && sel == 6) {
//                    System.out.println("Rs." + c2 + c6);
//                }
//                //--------------------------------
//                else if (sel == 3 && sel == 1) {
//                    System.out.println("Rs." + c3 + c1);
//                } else if (sel == 3 && sel == 2) {
//                    System.out.println("Rs." + c3 + c2);
//                } else if (sel == 3 && sel == 4) {
//                    System.out.println("Rs." + c3 + c4);
//                } else if (sel == 3 && sel == 5) {
//                    System.out.println("Rs." + c3 + c5);
//                } else if (sel == 3 && sel == 6) {
//                    System.out.println("Rs." + c3 + c6);
//                }
//                //-----------------------------
//                else if (sel == 4 && sel == 1) {
//                    System.out.println("Rs." + c4 + c1);
//                } else if (sel == 4 && sel == 2) {
//                    System.out.println("Rs." + c4 + c2);
//                } else if (sel == 4 && sel == 3) {
//                    System.out.println("Rs." + c4 + c3);
//                } else if (sel == 4 && sel == 5) {
//                    System.out.println("Rs." + c4 + c5);
//                } else if (sel == 4 && sel == 6) {
//                    System.out.println("Rs." + c4 + c6);
//                }
//                //--------------------------------------
//                else if (sel == 5 && sel == 1) {
//                    System.out.println("Rs." + c5 + c1);
//                } else if (sel == 5 && sel == 2) {
//                    System.out.println("Rs." + c5 + c2);
//                } else if (sel == 5 && sel == 3) {
//                    System.out.println("Rs." + c5 + c3);
//                } else if (sel == 5 && sel == 4) {
//                    System.out.println("Rs." + c5 + c4);
//                } else if (sel == 5 && sel == 6) {
//                    System.out.println("Rs." + c5 + c6);
//                }
//                //------------------------------------
//                else if (sel == 6 && sel == 1) {
//                    System.out.println("Rs." + c6 + c1);
//                } else if (sel == 6 && sel == 2) {
//                    System.out.println("Rs." + c6 + c2);
//                } else if (sel == 6 && sel == 3) {
//                    System.out.println("Rs." + c6 + c3);
//                } else if (sel == 6 && sel == 4) {
//                    System.out.println("Rs." + c6 + c4);
//                } else if (sel == 6 && sel == 5) {
//                    System.out.println("Rs." + c6 + c5);
//                }
//                System.out.println("Press Any Key Less Then 7 To Continue");
//                sc = s.nextInt();
//            }
//            while (sc != 7) ;
//        }
    public void enroll() {
        String courses = "";
        int tuitionBalance = 0;
        int costOfCourseLab = 6000;
        int costOfCourseTheory = 18000;
        int sc;
        int theory_credit = 0;
        int lab_credit = 0;

        Scanner depar = new Scanner(System.in);
            System.out.println("Enter Department Name in Which you want to Register: (BS CS / BS MECHATRONICS / BS BE )");
            String depart = depar.nextLine();
            if (depart.equals("BSCS")) {
                System.out.println("Offered Courses Are: ");
                System.out.println("THEORY:      |      LAB:");
                System.out.println("-------           ------");
                System.out.println("FOP THEORY   |   FOP LAB");
                System.out.println("ITC THEORY   |   ITC LAB");
                System.out.println("OOP THEORY   |   OOP LAB");
            } else if (depart.equals("BSM")) {
                System.out.println("Offered Courses Are: ");
                System.out.println("THEORY:                  |   LAB:");
                System.out.println("--------------             ---------");
                System.out.println("ENGINEERING CHEMISTRY    |   MECHATRONICS SYSTEM LAB");
                System.out.println("TECHNICAL COMMUNICATION  |   FACTORY AUTOMATION");
                System.out.println("MATHEMATICS              |   AUTOMATION AND ROBOTICS");
            } else if (depart.equals("BSBE")) {
                System.out.println("Offered Courses Are: ");
                System.out.println("THEORY:              |   LAB:");
                System.out.println("-----------            ---------");
                System.out.println("PHYSICS              |   C++ & DATA STRUCTURE");
                System.out.println("ELECTRONIC CIRCUITS  |   SWITCH THEORY AND LOGICAL DESIGN");
                System.out.println("MATHEMATICS          |   PRACTICAL");
            } else {
                System.out.println("NO DEPARTMENT SELECTED!!");
                return;
            }
            // Get insidealoop,user hits
            do {
                System.out.println("Which Type of Course You Want to Enroll Theory or Lab?( Q to Quit): ");
                Scanner c = new Scanner(System.in);
                String Course_Name = c.nextLine();
                System.out.print("Enter Course Name To Enroll( Q to Quit):");
                Scanner in = new Scanner(System.in);
                String course = in.nextLine();
                if (Course_Name.equals("LAB") && !course.equals("Q")) {
                    courses = courses + "\n" + course;
                    tuitionBalance = tuitionBalance + costOfCourseLab;
                    lab_credit = lab_credit + 1;
                }
                if (Course_Name.equals("THEORY") && !course.equals("Q")) {
                    courses = courses + "\n" + course;
                    tuitionBalance = tuitionBalance + costOfCourseTheory;
                    theory_credit = theory_credit + 3;

                } else if (Course_Name.equals("Q") || course.equals("Q")) {
                    System.out.println("BREAK!");
                    break;
                }
            } while (1 != 0);
            display();
            System.out.println("ENROLLED IN : " + courses);
            System.out.println("Theory Credit Hours: "+theory_credit);
            System.out.println("Lab Credit Hours: "+lab_credit);
            System.out.println("Total Credit Hours: " + (theory_credit + lab_credit));
            System.out.println("TUITION BALANCE : " + tuitionBalance);


    }

}

