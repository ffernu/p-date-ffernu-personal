class Date{
    private int day;
    private int month;
    private int year;
     
    public Date(int day, int month, int year){
         this.day=day;
         this.month=month;
         this.year=year;
        
    }



    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
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
        if(this.year==another.getYear() && this.month==another.getMonth() && this.day==another.getDay()){
            return true;
        }
        return false;
    }











    private String whatMOnth(int month){
        String whatMonth="";
        switch(month){
            case(1):
            whatMonth="enero";
            break;
            case(2):
            whatMonth="febrero";
            break;
            case(3):
            whatMonth="marzo";
            break;
            case(4):
            whatMonth="abril";
            break;
            case(5):
            whatMonth="mayo";
            break;
            case(6):
            whatMonth="junio";
            break;
            case(7):
            whatMonth="julio";
            break;
            case(8):
            whatMonth="agosto";
            break;
            case(9):
            whatMonth="septiembre";
            break;
            case(10):
            whatMonth="octubre";
            break;
            case(11):
            whatMonth="noviembre";
            break;
            case(12):
            whatMonth="diciembre";
            break;
        }
        return whatMonth;
    }
    public String whatMonth(){
        return this.whatMOnth(this.month);
    }











    public int howMuchDaysEachMonth(){
        int howMuchDaysEachMonth=0;
        switch(this.month){
            case 1: //next
            case 3: //next
            case 5: //next
            case 7: //next
            case 8: //next
            case 10: //next
            case 12: //next
            howMuchDaysEachMonth=31;
            break;
            case 4: //next
            case 6: //next
            case 9: //next
            case 11: //next
            howMuchDaysEachMonth=30;
            break;
            case 2:
            howMuchDaysEachMonth=28;
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
            case 1: //next
            case 2: //next
            case 3: //next
            whatSeasonIsInThisMonth="Invierno";
            break;
            case 4: //next
            case 5: //next
            case 6: //next
            whatSeasonIsInThisMonth="Primavera";
            break;
            case 7: //next
            case 8: //next
            case 9: //next
            whatSeasonIsInThisMonth="Verano";
            break;
            case 10: //next
            case 11: //next
            case 12: //next
            whatSeasonIsInThisMonth="Otonio";
            break;
        }
        return whatSeasonIsInThisMonth;
    }





    public String monthUntillEndYear() {
        String monthUntillEndYear="";
        StringBuffer salida = new StringBUffer()
        for(int i=this.month;i<=12;i+1) {
            salida.append(whatMonth(i) + " ");
        }
    }//Arreglar para que funcione, de aqui para abajo, este incluido





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
            daysSinceBeginningYear=daysSinceBeginningYear + howMuchDaysEachMonth(i); 
        }
        return daysSinceBeginningYear;
    }




    public int dayOfTheWeek(int weekDayFirstDayOfYear){
        int dayOfTheWeek=1;
        int dayOfTheWeek = (daysSinceBeginningYear() % 7) + weekDayFirstDayOfYear;
        if(dayOfTheWeek>7){
            dayOfTheWeek= dayOfTheWeek-7;
            return dayOfTheWeek();
        }
        return dayOfTheWeek();
    }



    public randomDateEqual(){
        
    }
}