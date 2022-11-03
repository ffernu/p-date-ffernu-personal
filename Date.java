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





    public whatMonth(month){
        switch(month){
            case(1):
            System.out.println("enero");
            case(2):
            System.out.println("febrero");
            case(3):
            System.out.println("marzo");
            case(4):
            System.out.println("abril");
            case(5):
            System.out.println("mayo");
            case(6):
            System.out.println("junio");
            case(7):
            System.out.println("julio");
            case(8):
            System.out.println("agosto");
            case(9):
            System.out.println("septiembre");
            case(10):
            System.out.println("octubre");
            case(11):
            System.out.println("noviembre");
            case(12):
            System.out.println("diciembre");
            break;
            System.out.println("Mes no existente");
        }
    }




    public howMuchDaysEachMonth(month){
        switch(month){
            case(1,3,5,7,8,10,12):
            case(4,6,9,11):
            case(2):
            break;
            
        }
    }





    private boolean isDayValid(day, month){
        switch(month){
            case(1):
            if(day>31||day<0){

            }
            case(2):
            
            case(3):
            
            case(4):
            
            case(5):
            
            case(6):
            
            case(7):
            
            case(8):
            
            case(9):
            
            case(10):
            
            case(11):
            
            case(12):
            
            break;
        }
    }

}