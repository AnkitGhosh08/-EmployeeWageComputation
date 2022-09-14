public class EmployeeWageComputationUc6
{
    public static void main(String[] args)
    {
        final int IS_FULL_TIME = 1;
        final int Is_PART_TIME = 2;
        final int EMP_RATE_PER_HRS = 20;
        final int NUM_OF_WORKING_DAYS = 2;
        final int MAX_HRS_IN_MONTH = 10;
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <  MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
            totalWorkingDays++;
        for (int day = 0; day < NUM_OF_WORKING_DAYS  ; day++)
        {
            int empCheck = (int) Math.floor(Math.random() * 100) % 3;
            switch (empCheck)
            {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case Is_PART_TIME:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println( " Day :" + totalWorkingDays +" emp Hrs :" + empHrs );
        }
        int totalEmpWage= totalEmpHrs * EMP_RATE_PER_HRS;
        System.out.println( " total emp wage : " + totalEmpWage );
    }
}