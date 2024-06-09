// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation problem.");
        int IS_FULL_TIME = 1;
        int check = (int) ((Math.random() * 10) % 2);
        if (check == IS_FULL_TIME){
            System.out.println("Employee is Present.");
        }else{
            System.out.println("Employee is Absent.");
        }
    }
}