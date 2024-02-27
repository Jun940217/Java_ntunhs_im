package JUN ;

import java.lang.Math;
import java.util.Scanner;

public class HELLO1 {
	static int pv;
	static int fv;
	static final double interest=0.05;
	static int interval;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		System.out.print("PV: ");
		pv=scn.nextInt() ;
		System.out.print("interval:");
		interval=scn.nextInt() ;
	double	fv=pv* Math.pow((1+interest),interval);
		System.out.println("My pv is "+ pv +" and after "+ interval +" year it would be "+ fv);
	}

}
