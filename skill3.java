import java.util.*;
class skill3{
	public static void main(String args[]){
		
			int a[]=new int[8];
			Scanner s=new Scanner(System.in);
			for(int i=0;i<7;i++){
				a[i]=s.nextInt();
			}
			Arrays.sort(a);
			int n=a.length;
			int b[]=new int[n];
			
			int j=0;
			for(int i=0;i<n-1;i++){
				if(a[i]!=a[i+1]){
					b[j++]=a[i];
				}
			}
			b[j++]=a[n-1];
			 for (int i=0; i<j; i++){  
            a[i] = b[i];  
        }  
			int v=b.length;
			System.out.println(j-1);
	}
}
				
				
			