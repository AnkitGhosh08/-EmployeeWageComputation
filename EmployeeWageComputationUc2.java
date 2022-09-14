public class EmployeeWageComputationUc2
{
    public static void main (String[] args)
    {
        int IS_FULL_TIME =1;
        int empRatePerHrs = 20;
        int empHrs = 8;
        int empWage=0;

        double empCheck = Math.floor ( Math.random() * 10 ) %2;
        if(empCheck == IS_FULL_TIME)
        {
            empHrs = 8;
        }
        else
        {
            empHrs = 0;
        }
        empWage = (empHrs * empRatePerHrs);
        System.out.println("employee daily wage is :" + empWage);
    }
}
