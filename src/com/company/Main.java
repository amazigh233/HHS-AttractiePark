package com.company;

import AttractiePark.AttractiePark;
import Bezoeker.Bezoeker;
import Bezoeker.NormaleBezoeker;
import Bezoeker.BezoekerList;

import java.util.ArrayList;
import java.util.List;

public class  Main {

    public static void main(String[] args) {
	// write your code here
       BezoekerList bezoekerList = new BezoekerList();
        //System.out.println(bezoekerList.getBezoekersMemberType() +  " " + bezoekerList.getBezoekersNaam());
        AttractiePark attractiePark = AttractiePark.getInstance();
        System.out.println(attractiePark.checkIfVol());


    }
}
