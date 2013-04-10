public class Rec8 {

	static int gcf(int x, int y){
		int min,max,retval=1;
		if (x<y){
			min=x;
			max=y;

		} else {
			min=y;
			max=x;
		}
		for (int i=1; i<=min; i++) {
			if ((min%i == 0) && (max%i == 0)){
				retval=i;
			}
		}
		return retval;	
	}

	static int[] reduceFraction(int[] frac){
		int num=frac[0], denom=frac[1];
		int gcf=gcf(num,denom);
		int[] retval = new int[frac.length];	
		retval[0]=num/gcf;
		retval[1]=denom/gcf;
		return retval;

	}

	public static void main(String args[]){
		for (int i=0; i<10; i++){
			int x=(int)(Math.random()*10)+1, y=(int)(Math.random()*10)+1;
			System.out.println("x: "+x+" y: "+y+"\nResult: "+gcf(x,y));
		}
		System.out.println("\n\n\n");
		int[] tmp= {90,120}, retval=reduceFraction(tmp);
	
		System.out.println(tmp[0]+"/"+tmp[1]);
		System.out.println(retval[0]+"/"+retval[1]);
	}
}

