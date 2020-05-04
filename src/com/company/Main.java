package com.company;

import Attractie.Entrance;
import Attractie.AttractieList;
import AttractiePark.AttractiePark;
import Bezoeker.Bezoeker;
import Bezoeker.NormaleBezoeker;
import Bezoeker.BezoekerList;
import Menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class  Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu();
       //ystem.out.println(menu.intro());
        //menu.werkNemerMenu();
        //AttractieList attractieList = new AttractieList();
        //attractieList.addAttracties();
        //System.out.println(attractieList.totaalAantalAttracties());
        //menu.intro();
       // AttractiePark attractiePark = AttractiePark.getInstance();
        menu.menu();
    }
}
