package com.Selenium;

public class PartyOutcome {
    public static int party(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0; // Bad
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2; // Great
        } else {
            return 1; // Good
        }
    }

    public static void main(String[] args) {
        System.out.println(party(6, 8)); // 1 (Good)
        System.out.println(party(10, 3)); // 0 (Bad)
        System.out.println(party(5, 10)); // 2 (Great)
    }
}