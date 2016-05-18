import java.io.IOException;
import org.jsoup.Jsoup;
public class Final {
	public static void main(String[] args) throws IOException 
	{
	String urltemp = "http://weather.gc.ca/city/pages/on-4_metric_e.html";
	org.jsoup.nodes.Document document1 = Jsoup.connect(urltemp).get();
	String temp = document1.select("p").get(1).text();
	System.out.println("The current local temperature:");
	System.out.println(temp);
	String url = "http://www.weather.gov/forecastmaps";
	org.jsoup.nodes.Document document = Jsoup.connect(url).get();
	String weather = document.select("p").get(1).text();
	System.out.println("The current national weather:");
	System.out.println(weather);
	}
}