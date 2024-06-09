// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation problem.");
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int check = (int) ((Math.random() * 10) % 3);
        if (check == IS_FULL_TIME){
            empHrs = 8;
        }else if(check == IS_PART_TIME){
            empHrs = 4;
        }else{
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage: " + empWage);
    }
}