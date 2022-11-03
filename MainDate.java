public class MainDate{
    public static void main(String[] args){
        Date today=new Date(3,11,2022);
        Date yesterday=new Date(2,11,2022);
        System.out.println(today.isSameDay(yesterday));
    }
}
