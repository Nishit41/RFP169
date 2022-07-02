package com.bridgelabz.basics;
public class assignment {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double Checkemp = Math.floor(Math.random() * 10) % 2;
        if (Checkemp == IS_FULL_TIME)
            System.out.println("employee is presrnt");
        else
            System.out.println("employee is absent");
        dailywages();
    }
    static void dailywages()
    {
       int wagesperHour=20;
       int fulldayHour=8;
       int days=20;
       int parttimeHour=8;
       int dailywages= wagesperHour*fulldayHour;
       int formonth= days*fulldayHour*wagesperHour;
        System.out.println("daily wages is "+dailywages);
        System.out.println("for month wages is" +formonth);
    }
}




