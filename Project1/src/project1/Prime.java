package project1;

public class Prime {
  //Part 2: Primes
  //Place your methods in here 
  static int num = 2;
	public static boolean isPrime(int p){
		if (p<=1){
			return false;
		}
		else {
			int factor = 2;
			if (p == 2){
				return true;
			}
			else{
				while (factor < p){
					if (p%factor == 0){
						return false;
					}
					else{
						factor += 1;
					}
				}
				factor = 2;
				return true;
			}
		}
	}
	public static int getPrime(){
		int fact = 2;
		boolean primer = false;
		if (num ==2){
			num += 1;
			primer = true;
			return 2;
			}
		while (primer == false){
			while (fact < num){
				if (num%fact == 0){
					num += 1;
				}
				else{
					fact += 1;
				}
			}
			num += 1;
			primer = true;
		}
		return (num-1);
	}
	
	public static void reset() {
		num = 2;
	}
	
	public static void reset(int n) {
		num = n;
	}
	
	public static int sumPrimes(int n) {
		int total = 0;
		int i = 1;
		while (i <= n){
			total += Prime.getPrime();
			i += 1;
		}
		return total;
	}
}
