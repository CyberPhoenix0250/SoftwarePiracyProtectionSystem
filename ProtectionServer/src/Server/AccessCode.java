package Server;

class AccessCode
{
	public static void main(String args[])
	{
		MacEncrypt me = new MacEncrypt();
		MacDecrypt md = new MacDecrypt();
		String temp;
		temp = me.getEncrypted("QC26P8J58GL404C34R82S721", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "QC26P8J58GL404C34R82S721");
		temp = me.getEncrypted("YB11V0S28SA304M60V25K114", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "YB11V0S28SA304M60V25K114");
		temp = me.getEncrypted("FY82Y2U37TC530L65D71B664", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "FY82Y2U37TC530L65D71B664");
		temp = me.getEncrypted("FC94I3S66TM228U57Y41J573", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "FC94I3S66TM228U57Y41J573");
		temp = me.getEncrypted("NS21H1X29HQ326V67G44L845", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "NS21H1X29HQ326V67G44L845");
		temp = me.getEncrypted("WS46R7F29GP138Z53E43B714", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "WS46R7F29GP138Z53E43B714");
		temp = me.getEncrypted("CW71E5G60YW551X26Q04V433", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "CW71E5G60YW551X26Q04V433");
		temp = me.getEncrypted("EJ91Q8F43RV283N62M83Y505", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "EJ91Q8F43RV283N62M83Y505");
		temp = me.getEncrypted("YZ91R7U65JA535C24A73I164", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "YZ91R7U65JA535C24A73I164");
		temp = me.getEncrypted("BN73S0P40PD138V28B66M625", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "BN73S0P40PD138V28B66M625");
		temp = me.getEncrypted("IE62V5V38TT662D10Z95O594", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "IE62V5V38TT662D10Z95O594");
		temp = me.getEncrypted("GO33R1S23VZ132K53M16C124", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "GO33R1S23VZ132K53M16C124");
		temp = me.getEncrypted("HS74V0C66PI137V30W45E212", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "HS74V0C66PI137V30W45E212");
		temp = me.getEncrypted("OL74Z1M61VF197J57G33M982", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "OL74Z1M61VF197J57G33M982");
		temp = me.getEncrypted("VI31M1N56DK489R38S42H316", "AA:BB:CC:DD:EE:FF");
		md.decrypt(temp, "VI31M1N56DK489R38S42H316");
	}
}