package Server;

class MacEncrypt
{
	private LicenseKey lk;
	private Encryption e;
	private String ACode = "";

	public String getEncrypted(String license, String mac)
	{
		lk = new LicenseKey(license);
		e = new Encryption();
		int code[] = lk.getInsideCode();
		String moded[] = new String[6];
		String normal[] = new String[6];
		
		normal[0] = ""+mac.charAt(0)+mac.charAt(1);
		normal[1] = ""+mac.charAt(3)+mac.charAt(4);
		normal[2] = ""+mac.charAt(6)+mac.charAt(7);
		normal[3] = ""+mac.charAt(9)+mac.charAt(10);
		normal[4] = ""+mac.charAt(12)+mac.charAt(13);
		normal[5] = ""+mac.charAt(15)+mac.charAt(16);
		//enc
		for(int i = 0 ; i < code.length ; i++)
		{
			moded[code[i]-1] = normal[i]; 
		}
		
		String temp = moded[0]+moded[1]+moded[2]+moded[3]+moded[4]+moded[5];
		temp = e.encrypt(temp);
		System.out.println("Encrypted : "+temp);
		return temp;
//		System.out.print("\tNormal MAC :");
//		for(String m : normal)
//		{
//			System.out.print(" "+m);
//		}
//		System.out.print("\tJMAC : ");
//		for(String m : moded)
//		{
//			System.out.print(" "+m);
//		}
//		System.out.print("\tSequence  : ");
//		for(int m : code)
//		{
//			System.out.print(" "+m);
//		}
	}
}