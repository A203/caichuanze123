package Day03;

import java.util.Scanner;

interface Assaultable{
	void attack();
}
interface Mobile{
	abstract void move();
}
public class Army{
	static int itera=0;
	Weapon w[];
	void army(){
		System.out.println("input the max number of marchine:");
		Scanner scan=new Scanner(System.in);
		int maxArmy=scan.nextInt();
		Weapon[] w=new Weapon[maxArmy];
	}
	void addWeapon(Weapon wa){
		w[itera]=wa;
		itera++;
	}
	void attackAll(){ 
		Tank tank=new Tank();
		tank.attack();
		Flighter flighter=new Flighter();
		flighter.attack();
		Warship warship=new Warship();
		warship.attack();
	}
	void moveAll(){
		Tank tank=new Tank();
		tank.move();
		Flighter flighter=new Flighter();
		flighter.move();
		Warship warship=new Warship();
		warship.move();
	}

	public static void main(String[] args) {
		Army a=new Army();
		Tank t=new Tank();
		Flighter f=new Flighter();
		Warship w=new Warship();
		a.army();
		a.addWeapon(t);
		a.addWeapon(f);
		a.addWeapon(w);
		a.attackAll();
		a.moveAll();
		
	}
	}
	abstract class Weapon implements Assaultable,Mobile{
	
	
//	Weapon[] wa=new Weapon[5];
	
	public void attack(){
		System.out.println("attack");
	}
	public abstract void move();
}
	class Tank extends Weapon{
	{
		System.out.print("Tank 	");
	}
	public void attack(){
		System.out.println("attack");
	}
	public void move(){
		System.out.println("Tank move");
	}
}
	class Flighter extends Weapon{
	{
		System.out.print("Flighter ");
	}
	public void attack(){
		System.out.println("attack");
	}
	public void move(){
		System.out.println("Flighter move");
	}
}
	class Warship extends Weapon{
	{
		System.out.print("Warship ");
	}
	public void attack(){
		System.out.println("attack");
	}
	public void move(){
		System.out.println("Warship move");
	}
}
