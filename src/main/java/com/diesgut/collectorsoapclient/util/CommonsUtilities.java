package com.diesgut.collectorsoapclient.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.diesgut.collectorsoapclient.bbva.enums.BBVAFieldEnum;
import com.diesgut.collectorsoapclient.scotia.enums.PagoRqFieldEnum;

public class CommonsUtilities {
	
	public static String getStringValueByPosition(String linea, Integer[] posticion) {
        Integer positionIni = posticion[0];
        positionIni--;
        String stringValue = linea.subSequence(positionIni, posticion[1]).toString();
        return stringValue.trim();
    }
    
	public static String getStringValueByPositionZero(String linea, Integer[] posticion) {
        Integer positionIni = posticion[0];
        String stringValue = linea.subSequence(positionIni, posticion[1]).toString();
        return stringValue.trim();
    }
	
	public static String convertDateToString(Date date,String format){
		String strDate = null;
		SimpleDateFormat simpleFormat = new SimpleDateFormat(format);
		try {
			if (date!= null ) {
				strDate = simpleFormat.format(date);
			}
		} catch(Exception ex) {

		}
		return strDate;
	}
	
	public static String castBBVAFieldEnum(String value, BBVAFieldEnum type) {
		Integer dataLength=type.getLength();
		if (value.length() >=dataLength) {
			value = value.substring(0, dataLength);
		}
		return value;
	}
	
}

