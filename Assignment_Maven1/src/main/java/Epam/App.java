package Epam;

import Epam.chocolate.Cadbury;
import Epam.chocolate.Hersheys;
import Epam.chocolate.Nestle;
import Epam.gift.Gift;
import Epam.sweets.ghevar;
import Epam.sweets.Jalebi;
import Epam.sweets.Kheer;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        Cadbury cadbury =new Cadbury();

        Hersheys hersheys =new Hersheys();

        Nestle nestle =new Nestle();

        Kheer kheer =new Kheer();

        ghevar ghevar =new ghevar();

        Jalebi jalebi =new Jalebi();

        Gift gift=new Gift();

        gift.addSweets(kheer);

        gift.addSweets(ghevar);

        gift.addSweets(jalebi);

        gift.addChocolates(cadbury);

        gift.addChocolates(hersheys);

        gift.addChocolates(nestle);

        gift.sort();

        gift.showChocolates();

        gift.showSweets();

        System.out.println(gift.totalWeight());

        sc.close();
    }
}
