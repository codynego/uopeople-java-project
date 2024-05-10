package data_analysis_unit4;
import java.util.ArrayList;

public class DataAnalysis {
	
	public static int averageStockPrice(int[] stockPrices) {
		int arrayLenght = stockPrices.length;
		int totalPrice = 0;
		
		for (int i = 0; i < arrayLenght; i++) {
			totalPrice = totalPrice + stockPrices[i];
		};
		return (totalPrice / arrayLenght);
	}
	
	public static int maxStockPrice(int[] stockPrices) {
		int arrayLenght = stockPrices.length;
		int maxPrice = 0;
		
		for (int i = 0; i < arrayLenght; i++) {
			if (stockPrices[i] > maxPrice) {
				maxPrice = stockPrices[i];
			}
		};
		return (maxPrice);
	}
	
	public static int occurenceCount(int[] stockPrices, int targetPrice) {
		int arrayLenght = stockPrices.length;
		int count = 0;
		
		for (int i = 0; i < arrayLenght; i++) {
			if (stockPrices[i] == targetPrice) {
				count++;
			}
		};
		return (count);
	}
	
	public static int cummulativeSum(ArrayList<Integer> stockPrices) {
		int arrayLenght = stockPrices.size();
		int sumPrices = 0;
		
		for (int i = 0; i < arrayLenght; i++) {
			sumPrices = sumPrices + stockPrices.get(i);
		};
		return (sumPrices);
	}
}
