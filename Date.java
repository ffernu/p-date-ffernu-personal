class Date{
    private int day;
    private int month;
    private int year;
     
    public Date(int day, int month, int year){
         this.day=day;
         this.month=month;
         this.year=year;
    }





    public boolean isSameDay(Date another){
        if(this.day==another.getDay()){
            return true;
        }
        return false;
    }
    public boolean isSameMonth(Date another){
        if(this.month==another.getMonth()){
            return true;
        }
        return false;
    }
    public boolean isSameYear(Date another){
        if(this.Year==another.getYear()){
            return true;
        }
        return false;
    }





    public String whatMonth(month){
        switch(month){
            case(1):
            whatMonth=enero;
            case(2):
            whatMonth=febrero;
            case(3):
            whatMonth=marzo;
            case(4):
            whatMonth=abril;
            case(5):
            whatMonth=mayo;
            case(6):
            whatMonth=junio;
            case(7):
            whatMonth=julio;
            case(8):
            whatMonth=agosto;
            case(9):
            whatMonth=septiembre;
            case(10):
            whatMonth=octubre;
            case(11):
            whatMonth=noviembre;
            case(12):
            whatMonth=diciembre;
        }
    }





    public int howMuchDaysEachMonth(month){
        switch(month){
            case(1,3,5,7,8,10,12):
            howMuchDaysEachMonth=31
            case(4,6,9,11):
            howMuchDaysEachMonth=30
            case(2):
            howMuchDaysEachMonth=28
            break;
        }
    }
     public boolean isDayValid(Date) {
        if(this.day>today.howMuchDaysEachMonth() || this.day<=0){
            return false;
        }
        return true;
    }





    public String whatSeasonIsInThisMonth(month) {
        switch(month) {
            case(1,2,3):
            whatSeasonIsInThisMonth=Invierno;
            case(4,5,6):
            whatSeasonIsInThisMonth=Primavera;
            case(7,8,9):
            whatSeasonIsInThisMonth=Verano;
            case(10,11,12):
            whatSeasonIsInThisMonth=Otonio;
        }
    }





    public monthUntillEndYear(month) {
        for(int i=month;i<=12;i+1) {
            System.out.println(whatMonth(i) + " ");
        }
    }





    dfdfasdfa
}