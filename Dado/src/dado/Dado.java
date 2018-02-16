/*
Scrivere un programma che usi la classe Random per simulare il lancio di un
dado, visualizzando un numero casuale compreso tra 1 e 6 ogni volta che viene
eseguito. 
 */
package dado;
import java.util.Random;

public class Dado {   
        Random random = new Random();
        int FacceCubo, numeroLanci,numero;
        
        public void getEstrazioni(){
            for(int i=0;i<numeroLanci;i++){
                numero=random.nextInt(FacceCubo);
                System.out.println("Il numero uscito è: "+numero);
            }
        }
        
        public void setNumeroLanci(int lanci){
            this.numeroLanci=lanci;
        }
        
        public void setNumeroFacce(int facce){
            this.FacceCubo=facce;
        }
    
}
