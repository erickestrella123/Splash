/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pk_Frames;

/**
 *
 * @author Erick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jfrm_Barra1 bar=new Jfrm_Barra1();
        bar.setVisible(true);
        Jfrm_Presentacion1 pre=new Jfrm_Presentacion1();
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                bar.porcentaje.setText(Integer.toString(i)+"%");
                bar.barra.setValue(i);
                
                if(i==100){
                    bar.setVisible(false);
                    pre.setVisible(true);
                }
            }
        }catch(InterruptedException e){
            
        }
        
    }
    
}
