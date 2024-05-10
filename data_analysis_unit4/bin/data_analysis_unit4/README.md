# A program that performs data analysis on stock prices
A program that takes an array or arrayList as input representing the daily stock prices of a company for a given period.

## Operation
 - calculateAveragePrice: the method takes an array of stock prices
 	- Parameter: an array of stockPrices
 	- Return:
 		returns the AveragePrice
 		
 - maxStockPrice: the method check for the maximum price from the array
 	- Parameter: an array of stockPrices
 	- Return:
 		returns the maximum stock price
 		
 - occurenceCount: the method return the number of time a price occured in the array
 	- Parameter: an array of stockPrices, targetPrice
 	- Return:
 		returns the occurrence count
 		
 - cummulativeSum: the method sums up all prices in the array
 	- Parameter: an array of stockPrices
 	- Return:
 		returns the sum of all prices.
 		
 
## Code Explanation

There are 2 class in the program
1. Main.java
2. DataAnalysis.java

The main.java contains the basic code that implements the method from the DataAnalysis, while the DataAnalysis contains all the method required to perform the operations for this program.

The DataAnalysis.java is a class that contained public and static methods such as:
	- calculateAveragePrice()
	- maxStockPrice()
	- occurenceCount()
	- cummulativeSum()
	
The calculateAveragePrice() method takes an array of stock prices. It also initialized 2 variables; arrayLenght and totalPrice which hold both the array length and total prices respectively.

Then it iterates through the stock prices and updates the totalPrices by add the current price to the totalPrice, the finally returned the totalprice.


While the maxStockPrice method works a little differently, it iterate through the array, then compare it with with maxPrice variable which was originally set to zero. If the current price is greater, the maxPrice is then set to the current price. if not, it continues till the end of the loop.
 