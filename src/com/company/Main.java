package com.company;

import Attractie.Attractie;
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
        System.out.println(menu.intro());
        menu.werkNemerMenu();
    }
}
