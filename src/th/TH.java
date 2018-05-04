/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th;

/**
 *
 * @author CST140031
 */
public class TH {
    
    public char calcOutput(int a1[], int a2[], int a3[]){
        int outputs[];
        int oneCount=0;
        
        Nuron N1 = new Nuron(new int[]{1,0,1,0},new int[]{1,1,1,1});
        Nuron N2 = new Nuron(new int[]{1,1,1,0},new int[]{0,1,0,1});
        Nuron N3 = new Nuron(new int[]{1,0,1,0},new int[]{0,1,0,1});
        
        
        int o1 = N1.getOutput(a1);
        int o2 = N2.getOutput(a2);
        int o3 = N3.getOutput(a3);
        
        outputs = new int[]{o1,o2,o3};
        
        
        for(int x : outputs){
            if(x == 1){
                oneCount++;
            }
        }
        
        if(oneCount > 1){
            return('T');
        }else{
            return('H');
        }
    }
    
}
