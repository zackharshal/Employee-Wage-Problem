// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation problem.");
        int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalEmpHours += empHrs;
            System.out.println("Day " + totalWorkingDays + " Employee hours : " + empHrs);
        }
        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee wage: " + totalEmpWage);
    }
        
}