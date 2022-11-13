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
        if(this.year==another.getYear()){
            return true;
        }
        return false;
    }
    public boolean isSame(Date another){
        if(this.Year==another.getYear() && this.month==another.getMonth() && this.day==another.getDay()){
            return true;
        }
        return false;
    }




    public String whatMonth(){
        String whatMonth="";
        switch(this.month){
            case(1):
            whatMonth="enero";
            case(2):
            whatMonth="febrero";
            case(3):
            whatMonth="marzo";
            case(4):
            whatMonth="abril";
            case(5):
            whatMonth="mayo";
            case(6):
            whatMonth="junio";
            case(7):
            whatMonth="julio";
            case(8):
            whatMonth="agosto";
            case(9):
            whatMonth="septiembre";
            case(10):
            whatMonth="octubre";
            case(11):
            whatMonth="noviembre";
            case(12):
            whatMonth="diciembre";
            break;
        }
        return whatMonth;
    }





    public int howMuchDaysEachMonth(){
        int howMuchDaysEachMonth=0;
        switch(this.month){
            case(1,3,5,7,8,10,12):
            howMuchDaysEachMonth=31
            case(4,6,9,11):
            howMuchDaysEachMonth=30
            case(2):
            howMuchDaysEachMonth=28
            break;
        }
        return howMuchDaysEachMonth;
    }
     public boolean isDayValid() {
        if(this.day>howMuchDaysEachMonth() || this.day<=0){
            return false;
        }
        return true;
    }





    public String whatSeasonIsInThisMonth() {
        String whatSeasonIsInThisMonth="";
        switch(this.month) {
            case(1,2,3):
            whatSeasonIsInThisMonth="Invierno";
            case(4,5,6):
            whatSeasonIsInThisMonth="Primavera";
            case(7,8,9):
            whatSeasonIsInThisMonth="Verano";
            case(10,11,12):
            whatSeasonIsInThisMonth="Otonio";
        }
        return whatSeasonIsInThisMonth;
    }





    public monthUntillEndYear() {
        for(int i=this.month;i<=12;i+1) {
            System.out.println(whatMonth(i) + " ");
        }
    } //el whatMonth(i) es suspicious, mirar a ver como huevos se pone eso bien





	public String dateToString() {
        String dateToString="";
		StringBuffer salida = new StringBuffer();
		salida.append(this.day);
		salida.append(" de " + whatMonth());
		salida.append(" del anio " + this.year);
		return salida.dateToString();
    }




    public String monthsSameDays(){
        String monthsSameDays="";
        int thisMonthDays= howMuchDaysEachMonth();
        StringBuffer salida = new StringBuffer();
        salida.append("Los meses con los mismos dias que el mes " + this.month + " son los meses ");
        for(int i=1;i<=12;i+1){
            if(thisMonthDays==howMuchDaysEachMonth(i)){
               salida.append(i + " ")
            }
        }
        return salida.monthsSameDays();
    }




    public String daysUntilEndMonth(){
        String daysUntilEndMonth="";
        int thisMonthDays= howMuchDaysEachMonth();
        StringBuffer salida=new StringBuffer();
        salida.append("Las fechas hasta fin de mes son: ");
        for(int i=this.day;i<=int thisMOnthDays; i+1){
            salida.append(i + "/" + this.month + "/" + this.year + " ");
        }
        return salida.daysUntilEndMonth();
    }




    public int daysSinceBeginningYear(){
        int daysSinceBeginningYear=this.day;
        for(int i=this.month-1;i>0;i-1){
            daysSinceBeginningYear=daysSinceBeginningYear+ howMuchDaysEachMonth(i)//again, esa i da mal rollo, preguntar si esta bien y rezar para que la solucian que me den sea sencilla 
        }
        return daysSinceBeginningYear;
    }
}