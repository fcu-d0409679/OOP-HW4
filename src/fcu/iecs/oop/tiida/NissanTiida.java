package fcu.iecs.oop.tiida;

public class NissanTiida {

	int count=0;
	
	public void tiida(){
		
		if(count==0){
			
			System.out.println("*");			
			count++;
			System.out.println();
		}
		
		
		else{
			
			for(int i=0;i<=count;i++){
				
				for(int j=0;j<=count;j++){
					
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}
		
		
		
		
		
	}
	
	
	
}
