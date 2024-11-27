public class Quiz {
    public static void main(String[] args) {
        // int a =calculateWater(150, 200);
        // System.out.println(a);
        // int i =calculateElectric(150, 100);
        // System.out.println(i);
        // int A = calculateBill("Double Bed", 500);
        // System.out.println(A);
        int S = SumPrice(calculateWater(150,200),calculateElectric(150,200) );
        System.out.println("sum "+S);
        int A = calculateBill("Single Bed", S);
        System.out.println(A);
    }
    public static int calculateWater(int Last, int current){
        if(Last<current){
            return  (current-Last)*5;
        }
        return (Integer) null ;
    }


    public static int calculateElectric(int Last, int current){
        if(Last<current){
            return  (current-Last)*6;
        }
        return (Integer) null ;
    }


    public static int SumPrice(int water,int Ele){
        return water+Ele;
    }



    public static int calculateBill(String Roomtype,int priceSum){
        if (Roomtype.equals("Single Bed")){
            return priceSum+1500;
        }
        else if (Roomtype.equals("Double Bed")){
            return priceSum+2000;
        }
        return (Integer) null;
        
    }
   
}
