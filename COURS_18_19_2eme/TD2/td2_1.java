/// Ecrire un programme qui saisit 6 entiers et les stocke dans un 
/// tableau, puis affiche le
/// contenu de ce tableau une fois qu’il est rempli.
///


public class td2_1 {

	public static void main(String[] args) {
		int x = 40;
		int m[] = new int[x];
		int sum = 0;
		
		if (x>=1) {
		
			m[0]=1;
			
			for(int i =1; i<=x; i++)
			{							
				if(i==1){					
					System.out.print(m[i-1] + "\n");
					m[1]=1;					
				}				
				else{					
					if(i==2){						
						System.out.print(m[1]);						
					}					
					else{					
						sum = m[i-3] + m[i-2];
						m[i-1]= sum;
						System.out.print("\n" + m[i-1]);						
					}					
				}										
			}			
		}			
		else {			
			System.out.println("Introduzca un número mayor o igual a la unidad.");
		}		
	}
}
   