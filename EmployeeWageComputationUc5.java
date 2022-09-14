public class EmployeeWageComputationUc5
{
    public static void main(String[] args)
    {
        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 2;
        int empHrs = 0, empWage = 0, totalEmpWage = 0;

        for (int day=0; day<NUM_OF_WORKING_DAYS; day++)
        {
            int empCheck = (int) Math.floor( Math.random() *10 ) %3;

            switch (empCheck)
            {
                case FULL_TIME :
                    empHrs = 4;
                    break;
                case PART_TIME :
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage = empWage;
            System.out.println( " Emp Wage:" + empHrs );
        }
        System.out.println("total emp wage :"+ totalEmpWage);
    }
}
