package com.demo.java_demo;

public class Selection_sort {

	
		public static void selectionSort(int[] a){  
	        for (int i = 0; i < a.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < a.length; j++){  
	                if (a[j] < a[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = a[index];   
	            a[index] = a[i];  
	            a[i] = smallerNumber;  
	        }  
	    }  
	       
	    public static void main(String a[]){  
	        int[] arr1 = {9,14,3,2,43,11,58,22};  
	        System.out.println("Before Selection Sort :");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        selectionSort(arr1);//sorting array using selection sort  
	         
	        System.out.println("After Selection Sort :");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	    }  
	 
	}


