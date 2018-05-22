package com.strings_arrays;

public class TwentyPercenty {
	public static void main (String [] args) {
		
		String str ="the dog is";
		 char [] arr = str.toCharArray();
		 int spaceCount=0;
		 for (int i=0;i<arr.length;i++) {
			 if(arr[i]==' ') spaceCount++;
		 }
		 
		 int newLength=arr.length+(spaceCount*2);
		 char [] newArr = new char [newLength];
		// newArr[newLength]='\0';
		 
		 for (int j=arr.length-1;j>=0;j--) {
			 if (arr[j]==' ') {
				 newArr[newLength-1]='0';
				 newArr[newLength-2]='2';
				 newArr[newLength-3]='%';
				 newLength=newLength-3;
			 }else {
				 newArr[newLength-1]=arr[j];
				 newLength--;
			 }
		 }
		 
		 System.out.println(newArr);
		 
		 
		 
		 
		
	}

}
