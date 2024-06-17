public class Main {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    public Main(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void computeEmpWage(){
        int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while (totalEmpHours <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
        totalEmpWage = totalEmpHours * empRatePerHour;
        System.out.println("Total Employee wage for "+company+" company is " + totalEmpWage);
    }
    @Override
    public String toString(){
            return "Total employee wage for Company: "+ company + " is: "+ totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation problem.");
        Main inAndOut = new Main("IN&OUT", 20, 2, 10);
        Main adani = new Main("Adani", 10,4,20);
        inAndOut.computeEmpWage();
        adani.computeEmpWage();
        System.out.println(adani);
        System.out.println(inAndOut);
    }
}