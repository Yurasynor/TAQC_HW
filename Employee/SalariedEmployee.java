package Employee;

import Employee.Employee;

public class SalariedEmployee extends Employee {

    private int federalTaxIdmember;

    private int fixedPeyment;

    public SalariedEmployee(String name, int federalTaxIdmember, int fixedPeyment) {
        super(name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedPeyment = fixedPeyment;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixedPeyment() {
        return fixedPeyment;
    }

    public void setFixedPeyment(int fixedPeyment) {
        this.fixedPeyment = fixedPeyment;
    }

    @Override
    public int calculatePay() {
        return fixedPeyment;
    }

    @Override
    public String toString() {
        return "Employee.SalariedEmployee" + super.toString() + "[federalTaxIdmember=" + federalTaxIdmember + "]";
    }

}