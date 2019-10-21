package ui;

import java.util.Arrays;

public class ArraysDemoApp {

	public static void main(String[] args) {
		double[] prices = new double[4];
		prices[0] = 4.99;
				prices[1] = 7.99;
				prices[2] = 25.99;
				prices[3] = 1.99;
				
				
				for (int i = 0; i < prices.length; i++) {
					System.out.println(prices[i]);
				}
				
				
			String[] names = { "sean", "johnny", "matt", "Chea"	, "John", "erin"};
			for (int i=0; i < names.length; i++){
				System.out.println(names[i]);
			}
			int[] nbrs = new int [10];
			for (int i=0; i <10; i++) {
				nbrs[i] = i *10;
			}
			
			for (int i=0; i <10; i++) {
				System.out.println(nbrs[i]);
			}
			
		
			double sum = 0;
			for (int i = 0; i < prices.length; i++) {
				sum+= prices[i];
			}
			System.out.println("sum: " +sum);
			System.out.println("price");
			
			for (int n: nbrs) {
				System.out.println(n);
			}
			
			int idx = Arrays.binarySearch(nbrs, 40);
			System.out.println("posititon 40 in nbrs = "+idx);
			
			
			Arrays.parallelSort(prices);
			for (double d: prices) {
				System.out.println(d);
			}
			Arrays.parallelSort(names);
				for (String s: names) {
					System.out.println(s);
				}
			
				}

}
