package com.bl.d3;

public class Company {

    public String company ;
    public int wagePerHrs ;
    public int numOfWorkinDays ;
    public int maxHrsPerMonth ;
    public int totalEmpWage;

    public Company(String company, int wagePerHrs, int numOfWorkinDays, int maxHrsPerMonth) {
        this.company = company;
        this.wagePerHrs = wagePerHrs;
        this.numOfWorkinDays = numOfWorkinDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                ", wagePerHrs=" + wagePerHrs +
                ", numOfWorkinDays=" + numOfWorkinDays +
                ", maxHrsPerMonth=" + maxHrsPerMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }

//    @Override
//    public String toString() {
//        return  "company Name ='" + company + '\'' +
//                ", \nTotal Emploee Wage =" + totalEmpWage +
//                "\n---------------------------------------------------------------------" ;
}