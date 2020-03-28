package com.epaam.junit;

public class DeleteAinFirsttwoPlaces {

	public String Delete(String string) {
		
		String result = string;
		char firstChar=string.charAt(0);
		char secondChar=string.charAt(1);
		if(firstChar=='A')
		{
			if(secondChar=='A')
			{
				result=string.substring(2,string.length());
			}
			else
			{
				result=string.substring(1,string.length());
				}
		}
		else if(firstChar!='A')
		{
			if(secondChar=='A')
			result=firstChar+string.substring(2,string.length());
		}
		else
		{
			
		}
		
		
		return result;
	}

}
