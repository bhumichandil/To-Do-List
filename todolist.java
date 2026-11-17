package todolist;
import java.util.Scanner;
// import java.util.*;
import java.util.ArrayList;


public class todolist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> tasks = new ArrayList<>();

        boolean istrue = true;
        while(istrue){
            System.out.println("-----Menu----");
            System.out.println("1:----Add Task----");
            System.out.println("2:----View Task----");
            System.out.println("3:----Remove Task----");
            System.out.println("4:----Exit----");
            System.out.println("which operation do you want to perform : " );

            int choice = sc.nextInt();
            sc.nextLine();// consume

            switch (choice) {
                case 1: 
                System.out.print("enter task = ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("task added");    
                break; 
                
                case 2 :
                    if(tasks.size()==0){
                        System.out.println("list is empty");
                    }
                    else { 
                System.out.println("your task ");
                for(int i =0 ;i<tasks.size();i++){
                    System.out.println(tasks.get(i));
                }
                    }
                break;

                case 3 :
                    System.out.print("enter number of task which you want to delete");
                    int index =sc.nextInt();
                    index = index-1;
                    if(index <  0 || index>tasks.size()){
                        System.out.println("invalid input");
                    } 
                    else{
                        tasks.remove(index);
                         System.out.println("task deleted");
                    }
                    // tasks.remove(index);
                    // System.out.println("task deleted");
                    break;

                case 4 :
                    istrue = false;
                    System.out.println("good bye :)");
                    break;
                    default:
                        System.out.println("wrong number");
            }




        }
        sc.close();
    }
}
