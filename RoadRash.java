import java.util.*;
import java.lang.*;
public class RoadRash{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int car = sc.nextInt();
		sc.nextLine();
		HashMap<Double,Integer> carTime = new HashMap<Double,Integer>();
		while(car-->0){
			String a[]  = sc.nextLine().split(" ");
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			int speed = Integer.parseInt(a[2]);
			
			double time = (Math.sqrt(x*x + y*y))/speed;
			if(!carTime.containsKey(time)){
				carTime.put(time,1);
			}
			else{
				carTime.put(time, carTime.get(time)+1);
			}
			
			
		}
		int sum =0;
		for(double k: carTime.keySet()){
			//System.out.println(k+"       "+carTime.get(k));
			
			if(carTime.get(k) > 1){
				int num= carTime.get(k);
				sum += num*(num-1)/2;
			}
		}
		
		System.out.println(sum);
	}
}