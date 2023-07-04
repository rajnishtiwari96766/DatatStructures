//find the day if the year from the given gregorian calendar... "2019-01-09"
package com.company;
public class day_ofyr {
    static int dayOfYr(String date){
        int [] days={31,28,31,30,31,30,
                     31,30,31,30,31,30};

        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));


        if(month>2 && year%4==0 &&
                (year%100!=0 || year%400==0)){
            ++day;
        }

        //adding the days in the previous month
        while (--month>0){
            day=day+days[month-1];
        }
        return day;
    }
    public static void main(String[] args) {
        String date="2019-01-9";
        System.out.println(dayOfYr(date));
    }
}
