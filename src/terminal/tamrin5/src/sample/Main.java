package sample;

import sample.Circle;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    static int counter = 1;

    static String Name = "c0";
    static Scanner sc = new Scanner(System.in);

    static  LinkedList<String> time = new LinkedList<String>();
    static  LinkedList<Object> list1 = new LinkedList<Object>();
    static linkedList list0 = new linkedList();

    public static void main(String[] args) {

        while(true){

            System.out.println("we have " + Name + " as our head node\n");
            System.out.println("select menu: ");
            System.out.println("1) git commit");
            System.out.println("2) git switch");
            System.out.println("3) node create time");
            System.out.println("4) close program");
            // System.out.println("4) show head and circle we are");


            int n = sc.nextInt();

            switch(n){

                case 1:
                    AddNode();
                    break;
                case 2:
                    ChangeHead();
                    break;
                    case 3:
                        date_created();
                        break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("incorrect");

            }

        }


    }

    private static void date_created() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter node number");
        String name = input.nextLine();
        System.out.println(time.get(Integer.parseInt(name)));


    }

    private static void AddNode() {

        String name = "c" + counter;
        Circle circle = new Circle(name);
        list1.add(circle);

        System.out.println(name + " has ben commited");

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        time.add(timeStamp);

        counter++;


    }


    private static void ChangeHead() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter new head");
        String name = input.nextLine();
        Name = name;


    }

}
