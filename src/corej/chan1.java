package corej;

import java.util.Scanner;

public class chan1 {
int p, t, r;
double si, ci;
Scanner s;
 void input() {
	 s =new Scanner (System.in);5
	 System.out.println("enter the pricipal amount");
	 p=s.nextInt(); 
	 System.out.println("enter no of years");
	 t=s.nextInt(); 
	 System.out.println("enter rate of interest");
	 r=s.nextInt(); 
	 
 }
void compute() {
	si=(p*t*r)/100;
	ci=p*Math.pow(1+(r/100),t);
	
	
}
void display() {
	System.out.println("simple intrest is " +si);
	System.out.println("compound intrest is " +ci);
	
}
	public static void main(String[] args) {
		 chan1 x = new chan1();
		 x.input();
		x.compute();
		x.display();

	}

}
