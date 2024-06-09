// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation problem.");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for(int i = 0; i < NUM_OF_WORKING_DAYS; i++){
            int check = (int) ((Math.random() * 10) % 3);
            switch (check) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee wage: " + empWage);
        }
        System.out.println("Total employee wage : " + totalEmpWage);
    }
}