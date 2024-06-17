public class Main {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static void computeEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth){
        int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
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
        int totalEmpWage = totalEmpHours * empRatePerHour;
        System.out.println("Total Employee wage for "+companyName+" company is " + totalEmpWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation problem.");
        computeEmpWage("In&Out",20, 20, 100);
        computeEmpWage("Adani", 10, 25, 150);
    }
        
}