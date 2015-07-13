package Day02;

import java.util.*;
public class Homework2 {
	public void way(){
		int arr[][]=new int[20][5];
		Random rand=new Random();
		int i,j;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				arr[i][j]=rand.nextInt(100);
			}
		}
		System.out.println("            coreC++  coreHava  Servlet    JSP      EJB");
		for(i=0;i<arr.length;i++){
			System.out.print("第"+(i+1)+"学员的成绩");
			for(int d:arr[i])
				System.out.print("   "+d+"     ");
			System.out.println();
		}
		int all[]=new int[20];
		for(i=0;i<arr.length;i++){
			all[i]=arr[i][0]+arr[i][1]+arr[i][2]+arr[i][3]+arr[i][4];
		}
		System.out.print("每个学员的总分：");
		for(int num1:all){
			System.out.print(num1+"   ");
		}
		System.out.println();
		int aver[]=new int[5];
		for(j=0;j<arr[i-1].length;j++){
			for(i=0;i<arr.length;i++){
				aver[j]=aver[j]+arr[i][j];
			}
			aver[j]=aver[j]/20;
		}
		System.out.print("每门课程的平均分");
		for(int num2:aver){
			System.out.print(num2+"  ");
		}
	}
	public static void main(String[] args) {
		Homework2 p=new Homework2();
		p.way();
	}

}

