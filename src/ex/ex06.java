package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021059 王俊鑌
 */

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {105021051, 102015022, 106010201, 101010111, 104010501};
        //泡沫排序法
        for (int i=0;i<a.length-1;i++)  
        {
             for (int j=0;j<a.length-i-1;j++)  
             {
                  if (a[j+1]>a[j])
                  {
                      int temp = a[j+1];  
                      a[j+1]=a[j];
                      a[j]= temp;
                  }
             }
        }
        
        for (int i=0;i<a.length;i++)
              System.out.print(a[i]+"   ");
        System.out.println();
       
        
	}

}
