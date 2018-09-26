package com.revature;

/**
* This is a WorstPerformingStock attempt
*
* This program will attempt to take a 2d array with stock data and return
* the worst performing stock.
*
* @author Jamie Edwards
*/

public static void main (String args[]) 
{	
	int i = 0; //outer array looper
	int k = 0; //inner looper
	double test = 1000000; //holds lowest value, defaulted high so it can easily be replaced
	double [][] stocks = {{1234, 55, 5685, 1288, 123} {1111, 1258, 225, 9632} {1234, 852, 997, 11111}};
    //array to test
	double openPrice = 0; //price at opening
	double closePrice = 0;//price at closing
	double performance = 0;//calculated performance
	
	for(i=0; i<stocks.length; i++) {
		int openPrice = stocks[i][0];//puts the first price in openPrice
		for(k=0; k<stocks[i].length, k++) {int closePrice = stocks[i][k];}
		//puts the last element in stocks[i] in closeprice
		int perform = (openPrice-closePrice)/openPrice;
		if perform < test (test = perform)//find the worst stock		
		}
	for(i=0; i<stocks.length, i++) 
	{	for(k=0; k<stocks[i].length; k++) 
		{	if stocks[i][k] == test
			{system.out.println "The worst stock is in position " +i +" " +k +".";
			break;}
	    }
	}
}
	
	//doesn't work yet but wanted to push anyway.
