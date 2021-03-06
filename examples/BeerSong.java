/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

/**
 * the classic children's favorite song "99 bottles of beer"
 */
public class BeerSong {

    public static void main(String[] args) {
	int beerNum = 99;
	String word = "bottles";
	while (beerNum > 0) { 
	    System.out.print(beerNum + " " + word + " of beer on the wall, ");
	    System.out.println(beerNum + " " + word + " of beer.");
	    System.out.print("Take one down and pass it around, ");
	    
	    beerNum = beerNum - 1;
	    
	    if (beerNum == 1) {
		word = "bottle"; // singular, as in ONE bottle.
	    }
	    
	    if (beerNum > 0) {
		System.out.println(beerNum + " " + word + " of beer on the wall.");
	    } else {
		System.out.println("no more bottles of beer on the wall.");
	    }
	    
	    System.out.println("");
	}
    }
}
