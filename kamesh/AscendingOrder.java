package com.kamesh;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] value = {0,3,7,89,43,12};
       int temp;
       for(int i=0;i<value.length;i++)
       {
    	   for(int j=i+1;j<value.length;j++)
    	   {
    		   if(value[i]>value[j])
    		   {
    			   temp = value[i];
    			   value[i]= value[j];
    			   value[j]=temp;
    		   }
    	   }
       }
       for(int i=0;i<value.length;i++)
       {
    	   System.out.println(value[i]);
       }
	}

}
