package com.jalaj.firstapp.listsorter;

/**
 * Created by jalajmehta on 7/3/16.
 */

public class Month implements Comparable<Month>
{
    private String monthName;

    public Month(String monthName) {
        this.monthName = monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getMonthName() {
        return monthName;
    }




    @Override
    public int compareTo(Month another) {
       if (MainActivity.order == "A")
        return this.getMonthName().compareTo(another.getMonthName());
        else
           return another.getMonthName().compareTo(this.getMonthName());
    }
}
