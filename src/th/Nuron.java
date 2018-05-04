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
public class Nuron {
    int[] H, T;
            
    public Nuron(int[] H, int[] T){
        this.H = H;
        this.T = T;
    }
    
    public int getOutput(int[] i){
        int hDist=0;
        int tDist=0;
        
        for(int x=0; x<i.length; x++){
            if(H[x]!=i[x]){
                hDist++;
            }
            if(T[x]!=i[x]){
                tDist++;
            }
        }
        
        //System.out.println(hDist);
        //System.out.println(tDist);
        
        if(hDist<tDist){
            return H[3];
        }else if(tDist<hDist){
            return T[3];
        }else{
            return 2; //undefined
        }
    }
}
