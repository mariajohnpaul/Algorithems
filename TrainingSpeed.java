package hackerrank;

public class TrainingSpeed {
	
	public static void main(String[] args)
	{
		
	String jsonmj = "{\"device\":{\"deviceid\":\"MomeDongle_40\",\"vin\":\"MJCOSEBGXFR726087\"},\"generator\":{\"timestamp\":\"Fri Oct 21 11:32:23 CDT 2016\",\"version\":{\"major\":1,\"minor\":0}},\"systems\":[{\"avid\":0,\"communication\":{\"servicecalls\":[{\"request\":\"09 02\",\"responses\":[{\"ecuaddress\":\"7e8\",\"mask\":\"FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF\",\"pattern\":\"49 02 01 4D 4A 43 4F 53 45 42 47 58 46 52 37 32 36 30 38 37\"}]}]},\"decode\":{\"absbytepos\":3,\"bigendian\":true,\"bitlen\":136,\"bitpos\":0,\"signed\":false},\"name\":\"VIN\",\"uuid\":\"075761fe-9f5a-452b-a019-403e44fad757\"},{\"avid\":1,\"communication\":{\"servicecalls\":[{\"request\":\"01 2F\",\"responses\":[{\"ecuaddress\":\"7e8\",\"mask\":\"FF FF\",\"pattern\":\"41 2F\"}]}]},\"decode\":{\"absbytepos\":2,\"bigendian\":true,\"bitlen\":8,\"bitpos\":0,\"signed\":true},\"formula\":\"y\u003d100*x/255\",\"name\":\"FLI\",\"unit\":\"@11054\",\"uuid\":\"0250a9c3-2214-4f05-ab0c-8bc28e8ea44f\"},{\"avid\":2,\"communication\":{\"servicecalls\":[{\"request\":\"01 0D\",\"responses\":[{\"ecuaddress\":\"7e8\",\"mask\":\"FF FF\",\"pattern\":\"41 0D\"}]}]},\"decode\":{\"absbytepos\":2,\"bigendian\":true,\"bitlen\":8,\"bitpos\":0,\"signed\":true},\"formula\":\"y\u003dx\",\"name\":\"VSS\",\"unit\":\"@11066\",\"uuid\":\"0238ab35-8664-48ad-a21d-be742e3f7737\"}],\"connection\":{\"ktsconnect\":{\"bustype\":\"OBDCAN\",\"filter\":\"phc3\",\"ph\":\"phc_3.dl\",\"pins\":[{\"type\":\"PLUS\",\"value\":6},{\"type\":\"MINUS\",\"value\":14}],\"pp\":\"ppc_3_1.dl\",\"preblocks\":[],\"timeout\":30000},\"standardconnect\":{\"bus\":\"ISO_11898_2_DWCAN\",\"bustype\":\"OBDCAN\",\"comparams\":[],\"pins\":[{\"type\":\"PLUS\",\"value\":6},{\"type\":\"MINUS\",\"value\":14}],\"protocol\":\"ISO_OBD_on_ISO_15765_4\",\"timeout\":30000}},\"name\":\"OBDII\",\"systemid\":1,\"type\":\"OBD2\"},{\"avs\":[{\"avid\":0,\"communication\":{\"servicecalls\":[{\"request\":\"21 01\",\"responses\":[{\"ecuaddress\":\"763\",\"mask\":\"FF\",\"pattern\":\"61\"}]}]},\"decode\":{\"absbytepos\":9,\"bigendian\":true,\"bitlen\":24,\"bitpos\":0,\"signed\":false},\"formula\":\"y\u003dx*1\",\"name\":\"AV_MILEAGE\",\"unit\":\"\",\"uuid\":\"02a0e12c-9d5f-499e-a654-0f26b4ec72d7\"}],\"connection\":{\"ktsconnect\":{\"bustype\":\"CAN\",\"filter\":\"phc6\",\"ph\":\"phc_6.dl\",\"pins\":[{\"type\":\"PLUS\",\"value\":6},{\"type\":\"MINUS\",\"value\":14}],\"pp\":\"ppc_6_1.dl\",\"preblocks\":[\"00000000| 00 00 07 02 43 07 63 07 00 00 03 03 10 C0 03 05 |....C.c.........\n00000010| 3E 01 03 06 20 10                               |\u003e.....\"],\"timeout\":30000},\"standardconnect\":{\"bus\":\"ISO_11898_2_DWCAN\",\"bustype\":\"CAN\",\"comparams\":[{\"name\":\"CP_Baudrate\",\"value\":\"500000\"},{\"name\":\"CP_CanPhysReqId\",\"value\":\"1859\"},{\"name\":\"CP_CanRespUSDTId\",\"value\":\"1891\"},{\"name\":\"CP_CanPhysReqFormat\",\"value\":\"5\"},{\"name\":\"CP_CanRespUSDTFormat\",\"value\":\"5\"},{\"name\":\"CP_CanFillerByteHandling\",\"value\":\"1\"}],\"pins\":[{\"type\":\"PLUS\",\"value\":6},{\"type\":\"MINUS\",\"value\":14}],\"protocol\":\"ISO_15765_3_on_ISO_15765_2\",\"timeout\":30000}},\"name\":\"77846_METER\",\"systemid\":2,\"type\":\"OE\",\"variant\":\"Var_3\"}]}";
	
	System.out.println(addspeed(jsonmj));
		
		
	}
	
	 public static String addspeed(String jsonmj) {

	        //String vss = "{\"avid\":0,\"communication\":{\"servicecalls\":[{\"request\":\"01 0D\",\"responses\":[{\"ecuaddress\":\"7e8\",\"mask\":\"FF FF\",\"pattern\":\"41 0D\"}]}]},\"decode\":{\"absbytepos\":2,\"bigendian\":true,\"bitlen\":8,\"bitpos\":0,\"signed\":true},\"formula\":\"y\u003dx\",\"name\":\"VSS\",\"unit\":\"@11066\",\"uuid\":\"0238ab35-8664-48ad-a21d-be742e3f7737\"},";

	        
	        int vssst =  jsonmj.indexOf("avid\":2");
	        int vssend = jsonmj.indexOf("\"0238ab35-8664-48ad-a21d-be742e3f7737\"}",vssst);	       
	        String vss = jsonmj.substring(vssst-2, vssend+39)+",";      
	        
	        //System.out.println(vss);        
	        
	        
	        
	        int indstart = jsonmj.indexOf("avid\":0");

	        String temp = jsonmj.substring(0,indstart-2)+vss+jsonmj.substring(indstart-2,vssst-3)+jsonmj.substring(vssend+39);

	        //System.out.println(temp);
	        return temp;
	    }

}
