import java.util.ArrayList;

interface EmpWage{
    public int computeEmpWage(CompanyEmpWage companyEmpWages);

}
public class Main implements EmpWage {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    private int numOfCompany = 0;
    private ArrayList<CompanyEmpWage> companyEmpWageArray = new ArrayList<>();

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDay, int maxHoursPerMonth){
        companyEmpWageArray.add(new CompanyEmpWage(company, empRatePerHour, numOfWorkingDay, maxHoursPerMonth));
    }
    private void computeEmpWage(){
        for(CompanyEmpWage companyEmployeeWage: companyEmpWageArray){
            int totalWage = this.computeEmpWage(companyEmployeeWage);
            companyEmployeeWage.setTotalEmpWage(totalWage);
            System.out.println(companyEmployeeWage);
        }
    }
    public int computeEmpWage(CompanyEmpWage companyEmpWages){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while(totalEmpHrs<= companyEmpWages.maxHoursPerMonth && totalWorkingDays < companyEmpWages.numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) %3;
            switch (empCheck){
                case IS_PART_TIME -> empHrs = 4;
                case IS_FULL_TIME -> empHrs = 8;
                default -> empHrs = 0;
            }
            companyEmpWages.dailyWage.add(empHrs * companyEmpWages.empRatePerHour);
            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " Employee hours : " + empHrs +"\t Employee Wage that day: "+ companyEmpWages.dailyWage.get(totalWorkingDays-1));
        }
        return totalEmpHrs * companyEmpWages.empRatePerHour;
    }

    public static void main(String[] args) {
        Main empWageBuilder = new Main();
        empWageBuilder.addCompanyEmpWage("IN&OUT", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Adani", 10,4,20);
        empWageBuilder.computeEmpWage();
    }
}