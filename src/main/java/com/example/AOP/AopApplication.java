package com.example.AOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Arrays;

import static java.util.List.of;

@SpringBootApplication
public class AopApplication {

@Autowired
private static Car car;

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = context.getBean("car", Car.class);
		//joint point
		car.car();

		NewCar newCar = context.getBean("newCar", NewCar.class);
		//joint point

		newCar.car();


//		List<Integer> list = new ArrayList<>();
//		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
//
//		System.out.println(list);
//
//		int totalSize = list.size();
//		System.out.println("size" + totalSize);
//		int cr = 6;
//
//		int start = cr+1;
//		int end = totalSize-1;
//
//
//
//		for(int i = cr+1; i < list.size(); i = i+2){
//
//			int startVal = list.get(start);
//			int endVal = list.get(end);
//			list.set(start,endVal);
//			list.set(end,startVal);
//			start++;
//			end--;
//		}
//
//
//		System.out.println(list);

//		return min+max;0 2 3

//		[[0,0,0,0],[0,4,5,2],[0,3,1,5]]
////		[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//
//		int[][] matrix = new int[][] {
//				new int[] { 0, 1, 1, 0 },
//				new int[] { 1, 4, 5, 2 },
//				new int[] { 1, 3, 1, 5 },
//		};
//
//		int n  = matrix[0].length;
//		int m = matrix.length;
//
//		System.out.println(n + "  " + m);
//
//
//		  for(int i = 0; i < m;i++){
//
//			  for(int j = 0; j< n;j++){
//
//				  System.out.println(matrix[i][j]);
//
//				  if(matrix[i][j] == 0){
//					  makeItNegative(matrix,i,j);
//
//				  }
//			  }
//		  }
//
//		System.out.println(Arrays.deepToString(matrix));
//		  makeItZero(matrix);
//		System.out.println(Arrays.deepToString(matrix));
//
//
//	}

//	private static void makeItZero(int[][] matrix) {
//
//		int n  = matrix[0].length;
//		int m = matrix.length;
//		for(int i = 0; i < m;i++){
//
//			for(int j = 0; j< n;j++){
//
//
//				if(matrix[i][j] == -1){
//					matrix[i][j] =0;
//
//				}
//			}
//		}
//
//	}

//	private static void makeItNegative(int[][] matrix, int x, int y) {
//
//
//		System.out.println(x +" " + y);
//		int n  = matrix[0].length;
//		int m = matrix.length;
//		for(int i = 0; i < m;i++){
//
//			for(int j = 0; j< n;j++){
//
//				if(i == x && matrix[i][j] != 0){
//					matrix[i][j] = -1;
//				}
//				if(j == y && matrix[i][j] != 0){
//					matrix[i][j] = -1;
//				}
//
//			}
//		}
//
//	}

	}

}



