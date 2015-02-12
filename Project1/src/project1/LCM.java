//package project1;

public class LCM {
	private int num;
	
	public LCM(int new_num){		
			num = new_num;
	}

	public int getLCM(int n){//start at the biger num and increment.
		int start;
		int lower;
		int count=0;
		if(n<num){ 
			start = num;
			lower = n;
		}
		else {
			start = n;
			lower = num;
		}

		while(start%lower!=0){
			count++;
			start*=count;
		}
		return start;
	
	}


	public int getGCD(int n){//using euclidean algebra to get the gcd
		int placeholder = num;
		while(placeholder!=n){
			if(n<placeholder){
				placeholder-=n;
			}
			else{
				n-=placeholder;
			}
		}
		return placeholder;
	}


	public int getRatio(int num){
		int lcm = getLCM(num);
		int gcd = getGCD(num);
		int ratio = lcm/gcd;
		return ratio;
	}

	public static void main(String[] args){
		
		LCM test = new LCM(6);

		System.out.println(test.getGCD(15));
		System.out.println(test.getLCM(4));
		System.out.println(test.getRatio(4));
	}
	//Part 3: Number with LCM
	//Note: As per the instructions, make sure this class is instantiable 
}
