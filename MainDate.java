public class MainDate{
    public static void main(String[] args){
        Date today=new Date(3,11,2022);
        Date yesterday=new Date(2,11,2022);

        System.out.println(today.isSameDay(yesterday));
        System.out.println(today.isSameMonth(yesterday));
        System.out.println(today.isSameYear(yesterday));
        System.out.println(today.isSame(yesterday));

        System.out.println(today.whatMonth());
        System.out.println(today.isDayValid());
        System.out.println(today.whatSeasonIsInThisMonth());

        System.out.println(today.monthUntillEndYear());
        System.out.println(today.dateToString());
        System.out.println(today.monthsSameDays());
        System.out.println(today.daysUntilEndMonth());
        System.out.println(today.daysSinceBeginningYear());
        



    }
}
