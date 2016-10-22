package fcu.iecs.oop.tiida;

public class NissanTiida {

	private int count=0;//型態為 private 表私有的 只有此類別成員可用
	
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
	

