import java.util.Scanner;
public class AndrewGitSample3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println(":)");
		int[] ar=new int[5];
		
		System.out.println("input array");
			for(int i=0;i<ar.length;i++) {
				ar[i] = sc.nextInt();
			}	
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i] + " ");
	}

}
