
public class IP_Cutter {
    String ip;
    IP_Cutter(String ip){
        this.ip=ip;
    }
    public int cut(){
        int[] Newip = new int[4];
		
        String[] parts = ip.split("\\.");
	if (parts.length != 4) {
	System.err.println("IP error ");
	} 
        else {	
            for (int i = 0; i < parts.length; i++) {
		Newip[i] = Integer.parseInt(parts[i]);
			}
		}
	return Newip;
    }
    
}
