public class RemoveMiddleSpaces {

	public static void main(String[] args) {
		String str = "           Mexico     Is My    Country                        ";  
        //1st way  
        //String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        //System.out.println(noSpaceStr);  
        
		//2nd way  
		int indexOfLastLetter = 0;
		
		char[] strArray = str.toCharArray(); 
        
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer lastSpacesBuffer = new StringBuffer();
        
        //DIVIDED IN 3 PARTS:
        //1 - Find all first spaces and save them in a buffer
        //2 - Remove all the middle spaces
        //3 - Find all the last spaces and save them in a buffer
        
        //1 - Here I add to the buffer until I find the first actual letter (while the first characters are spaces)
        int j = 0;
        while((j < strArray.length) && (strArray[j] == ' ')) {
        	stringBuffer.append(strArray[j]);
        	j++;
        	indexOfLastLetter++;
        }
        
        String firstSpaces = stringBuffer.toString();
        
        
        
        //2 - Remove all the middle spaces
        for (int i = 0; i < strArray.length; i++) {
        	if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);
                indexOfLastLetter++;
            }  
        }
        
        System.out.println("array length: " + strArray.length);
        System.out.println("index of last actual character: " + indexOfLastLetter);
        
      //3 - Find all the last spaces and save them in a buffer
        for (int k = indexOfLastLetter; k < strArray.length; k++) {
        	if(strArray[k] == ' ')
        		lastSpacesBuffer.append(strArray[k]);
        }
        
        //Print out all 3 parts
        System.out.println("first, middle and last: " + firstSpaces + stringBuffer.toString() + lastSpacesBuffer.toString());
   
    }  
}
