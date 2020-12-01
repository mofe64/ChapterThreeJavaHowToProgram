package com.company;

public class Date {
    int month;
    int day;
    int year;

    public Date(int month, int day, int year) {
        boolean validMonthRange = month > 0 && month < 13;
        boolean validYearRange = year > 1899 && year < 2100;
        boolean monthIs30DayMonth = month == 4 || month == 6 || month == 9 || month == 11;
        boolean yearIsLeapYear = year % 4 == 0;
        boolean validDayRangeForLeapYearFebruary = day > 0 && day < 29;
        boolean validDayRangeForNonLeapYearFebruary = day > 0 && day < 28;
        boolean monthIsFebruary = month == 2;
        boolean validDayRangeFor30DayMonth = day > 0 && day < 31;

        if (validMonthRange) {
            this.month = month;
        }
        if (validYearRange) {
            this.year = year;
        }
        if (monthIs30DayMonth) {
            if (validDayRangeFor30DayMonth) {
                this.day = day;
            }
        }
        if (monthIsFebruary) {
            if (yearIsLeapYear) {
                if (validDayRangeForLeapYearFebruary) {
                    this.day = day;
                }
            }
            if (!yearIsLeapYear) {
                if (validDayRangeForNonLeapYearFebruary) {
                    this.day = day;
                }
            }
        }
        if (!monthIs30DayMonth && !monthIsFebruary) {
            boolean validDayRangeFor31DayMonth = day > 0 && day < 32;
            if (validDayRangeFor31DayMonth) {
                this.day = day;
            }
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        boolean validMonthRange = month > 0 && month < 13;
        if (validMonthRange) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        boolean monthIs30DayMonth = month == 4 || month == 6 || month == 9 || month == 11;
        boolean yearIsLeapYear = year % 4 == 0;
        boolean validDayRangeForLeapYearFebruary = day > 0 && day < 29;
        boolean validDayRangeForNonLeapYearFebruary = day > 0 && day < 28;
        boolean monthIsFebruary = month == 2;
        boolean validDayRangeFor30DayMonth = day > 0 && day < 31;
        if (monthIs30DayMonth) {
            if (validDayRangeFor30DayMonth) {
                this.day = day;
            }
        }
        if (monthIsFebruary) {
            if (yearIsLeapYear) {
                if (validDayRangeForLeapYearFebruary) {
                    this.day = day;
                }
            }
            if (!yearIsLeapYear) {
                if (validDayRangeForNonLeapYearFebruary) {
                    this.day = day;
                }
            }
        }
        if (!monthIs30DayMonth && !monthIsFebruary) {
            boolean validDayRangeFor31DayMonth = day > 0 && day < 32;
            if (validDayRangeFor31DayMonth) {
                this.day = day;
            }
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        boolean validYearRange = year > 1899 && year < 2100;
        if (validYearRange) {
            this.year = year;
        }
    }

    public void displayDate(){
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}
