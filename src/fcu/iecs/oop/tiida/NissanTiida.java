package fcu.iecs.oop.tiida;

public class NissanTiida {

	private int count=0;//���A�� private ��p���� �u�������O�����i��
	
	public void tiida(){
		
		this.count++;
		
		for(int i=0;i<this.count;i++){ 
			for(int j=0;j<this.count;j++){ 
				
				System.out.print("*"); 
			} 
			
			System.out.println(); 
		} 
		
		System.out.print("\n\n"); 
	} 

}
	

