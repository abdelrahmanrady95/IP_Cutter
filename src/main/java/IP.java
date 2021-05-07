/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rady
 */
public class IP {
    public static void main(String[] args) {
        String ip= "192.168.2.100";
        IP_Cutter NIP= new IP_Cutter(ip);
        
        int [] result = NIP.cut();
        for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);

		}
        
        
        
    }
    
    
}
