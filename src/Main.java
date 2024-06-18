public class Main {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray = new CompanyEmpWage[5];
//    public void EmpWageBuilderArray(){
//        companyEmpWageArray = new CompanyEmpWage[5];
//    }
    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDay, int maxHoursPerMonth){
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDay,maxHoursPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage(){
        for(int i = 0; i < numOfCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage){
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while(totalEmpHrs<= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) %3;
            switch (empCheck){
                case IS_PART_TIME -> empHrs = 4;
                case IS_FULL_TIME -> empHrs = 8;
                default -> empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " Employee hours : " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        Main empWageBuilder = new Main();
        empWageBuilder.addCompanyEmpWage("IN&OUT", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Adani", 10,4,20);
        empWageBuilder.computeEmpWage();
    }
}