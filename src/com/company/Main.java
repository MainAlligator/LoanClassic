package com.company;

public class Main {

    public static void main(String[] args) {

        int totalCredit = 50_000;

        final double stavka = 0.22;
        final int timeCredit = 12;

        final double vozvratCredita = (double) totalCredit / timeCredit;
        System.out.println("Сумма, которая идет на погашение тела  кредита =  " + vozvratCredita);

        double ostatok1procent = totalCredit * stavka / timeCredit;

        System.out.println("1 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok1procent);
        // write your code here
        double telo1credita = totalCredit - vozvratCredita;
        double ostatok2procent = (telo1credita * stavka) / timeCredit;

        System.out.println("2 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok2procent);
        // write your code here
        double telo2credita = telo1credita - vozvratCredita;
        double ostatok3procent = (telo2credita * stavka) / timeCredit;

        System.out.println("3 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok3procent);
        // write your code here
        double telo3credita = telo2credita - vozvratCredita;
        double ostatok4procent = (telo3credita * stavka) / timeCredit;

        System.out.println("4 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok4procent);
        double telo4credita = telo3credita - vozvratCredita;
        double ostatok5procent = (telo4credita * stavka) / timeCredit;

        System.out.println("5 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok5procent);
        double telo5credita = telo4credita - vozvratCredita;
        double ostatok6procent = (telo5credita * stavka) / timeCredit;

        System.out.println("6 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok6procent);
        double telo6credita = telo5credita - vozvratCredita;
        double ostatok7procent = (telo6credita * stavka) / timeCredit;

        System.out.println("7 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok7procent);
        double telo7credita = telo6credita - vozvratCredita;
        double ostatok8procent = (telo7credita * stavka) / timeCredit;

        System.out.println("8 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok8procent);
        double telo8credita = telo7credita - vozvratCredita;
        double ostatok9procent = (telo8credita * stavka) / timeCredit;

        System.out.println("9 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok9procent);
        double telo9credita = telo8credita - vozvratCredita;
        double ostatok10procent = (telo9credita * stavka) / timeCredit;

        System.out.println("10 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok10procent);
        double telo10credita = telo9credita - vozvratCredita;
        double ostatok11procent = (telo10credita * stavka) / timeCredit;

        System.out.println("11 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok11procent);
        double telo11credita = telo10credita - vozvratCredita;
        double ostatok12procent = (telo11credita * stavka) / timeCredit;

        System.out.println("12 расчетный период. Сумма, которая идет на погашение  процентов по   кредиту =  " + ostatok12procent);

        double summaPereplaty = ostatok1procent + ostatok2procent + ostatok3procent + ostatok4procent + ostatok5procent + ostatok6procent + ostatok7procent + ostatok8procent + ostatok9procent + ostatok10procent + ostatok11procent + ostatok12procent;
        System.out.println("Сумма переплаты за 12 месяцев : " + summaPereplaty);
    }
}
