package data_analysis_unit4;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stocks = {1,2,3,4,5,2,2};
		ArrayList<Integer> stocksList = new ArrayList<Integer>();
		stocksList.add(2);
		stocksList.add(3);
		stocksList.add(4);
		stocksList.add(5);
		
		int averagePrice = DataAnalysis.averageStockPrice(stocks);
		int maxPrice = DataAnalysis.maxStockPrice(stocks);
		int occurenceCount = DataAnalysis.occurenceCount(stocks, 2);
		int cummulativeSum = DataAnalysis.cummulativeSum(stocksList);
		
		
		System.out.println("average price: " + averagePrice);
		System.out.println("max price: " + maxPrice);
		System.out.println("occurence count: " + occurenceCount);
		System.out.println("cummulative sum: " + cummulativeSum);
	}

}
