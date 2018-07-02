package converters;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * 
 * @author Administrator
 * 
 */
public class StringToDate implements Converter<String, Date> {

	private String format;

	public StringToDate() {
	}

	public StringToDate(String format) {
		this.format = format;
	}
	
	public Date convert(String str) {
		Date date = null;
		try {
			date = new SimpleDateFormat(format).parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

}