package Assignment;

import java.util.*;

class Cab {
    int fare;
    int d;

    public Cab() {
        fare = 30;
    }
    //parameterized constructor
    public Cab(int fare) {
        this.fare = fare;   //"this" gives reference of current object being used
        //ob.fare - fare
    }

    //copy constructor 
}
class Cab2 extends Cab
{
	public Cab2(Cab ob1) {         //ob1 = ob
        fare = ob1.fare;   //ob2.fare = ob.fare
    }
}

public class Day3Assignment 
{
	public static void main(String[] args) 
	{
		int cd; //distance of cab from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();

        if(cd > 5) {
            Cab ob = new Cab(30 + (cd - 5) * 10); //invokes param constructor
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare += 10 * ob.d;

            System.out.println("Total fare: Rs " + ob.fare);

            
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare += 10 * ob.d;

            System.out.println("Total fare: Rs " + ob.fare);

            Cab ob2 = new Cab2(ob);
            System.out.println("Data ob2: " + ob2.fare);
        }

	}

}
