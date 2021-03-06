public class EmployeeWageBuilder {
    // declaring instance variables
    private static final int ABSENT = 0;
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;
    private final String companyName;
    private final int wagePerHour;
    private final int numberOfWorkingDays;
    private final int maxWorkingHours;

    // creating constructor
    private EmployeeWageBuilder(String companyName, int wagePerHour,
                                int numberOfWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Checks employee attendance and calculates Salary
    private static void employeeAttendanceChecker(String company, int hourlyWage, int totalDays, int maxHours) {
        int absentCount = 0;
        int fullTimeCount = 0;
        int partTimeCount = 0;
        int totalWorkingHours = 0;
        int totalEmpWage = 0;

        // checks attendance and calculates salary for month or total working days
        for (int i = 1; i <= totalDays; i++) {

            int empHrs = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case ABSENT -> {
                    absentCount++;
                    empHrs = 0;
                }

                case FULL_TIME -> {
                    fullTimeCount++;
                    empHrs = 8;
                }

                case PART_TIME -> {
                    partTimeCount++;
                    empHrs = 4;
                }
            }
            totalWorkingHours += empHrs;

            if (totalWorkingHours >= maxHours) {
                totalWorkingHours = maxHours;
                break;
            }

            int wageForTheDay = wageCalculator(hourlyWage, empHrs);
            totalEmpWage += wageForTheDay;
        }
        displayInfo(company, absentCount, fullTimeCount, partTimeCount, totalWorkingHours, totalEmpWage);
    }

    // displays all information on console
    public static void displayInfo(String cName, int aCount, int fTCount,
                                   int pTCount, int tHours, int totalEmpWage) {

        System.out.println("Following gives the Employee Wage Details for the company : " + cName);
        System.out.println("Employee Absent : " + aCount + " days");
        System.out.println("Employee Full Time : " + fTCount + " days");
        System.out.println("Employee Part Time : " + pTCount + " days");
        System.out.println("Total Working Hours : " + tHours + " hours");
        System.out.println("Employee total wage is : " + totalEmpWage + " Rs /-");
    }
    // returns wage for the day
    public static int wageCalculator(int hourlyWage, int empHrs) {
        return hourlyWage * empHrs;
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program !!! ");

        // creating object for Dmart company and storing their details regarding employee wage
        EmployeeWageBuilder dmart = new EmployeeWageBuilder("D-MART", 20, 20, 100);

        // creating object for Reliance Retail company and storing their details regarding employee wage
        EmployeeWageBuilder reliance = new EmployeeWageBuilder("Reliance Retail", 10, 30, 200);

        employeeAttendanceChecker(dmart.companyName, dmart.wagePerHour,
                dmart.numberOfWorkingDays, dmart.maxWorkingHours);
        System.out.println();
        employeeAttendanceChecker(reliance.companyName, reliance.wagePerHour,
                reliance.numberOfWorkingDays, reliance.maxWorkingHours);
    }
}