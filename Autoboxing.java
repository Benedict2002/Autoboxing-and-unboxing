package AutoandUnboxing;

import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Double;

class IntClass{
    private int myintvalue;

    public IntClass(int myintvalue) {
        this.myintvalue = myintvalue;
    }

    public int getMyintvalue() {
        return myintvalue;
    }

    public void setMyintvalue(int myintvalue) {
        this.myintvalue = myintvalue;
    }
}


public class Autoboxing {


    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Ben");
       // ArrayList<int> intArrylist = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = Integer.valueOf(55);
        Double dbd = 12.56; //new Double(12.54);
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for(int i=0;i<=10;i++){
            integerArrayList.add(Integer.valueOf(i));
        }
        for(int i=0;i<=10;i++){
            int value = integerArrayList.get(i).intValue();
            System.out.println(i+" ----> "+ value);
        }
        ArrayList<Double> doubleArrayList1 = new ArrayList<>();
        for (double dbl =0.0; dbl<10;dbl+=0.5){
            doubleArrayList1.add(Double.valueOf(dbl));
        }
        for(int i =0; i<doubleArrayList1.size();i++){
            double value = doubleArrayList1.get(i).doubleValue();
            System.out.println(i + " ----> "+value);
        }


    }
}
