package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }
        int daysInMonth;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    daysInMonth = 29; // leap year
                } else {
                    daysInMonth = 28; // not a leap year
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }
        System.out.println("Number of days in month " + month + " of year " + year + ": " + daysInMonth);
    }

}
