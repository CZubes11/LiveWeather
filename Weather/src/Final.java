import java.io.IOException;
import org.jsoup.Jsoup;
public class Final {
	public static void main(String[] args) throws IOException 
	{
		String urltemp = "http://www.timeanddate.com/weather/usa/denver";
		org.jsoup.nodes.Document document1 = Jsoup.connect(urltemp).get();
		String temp = document1.select("p").get(1).text();
		System.out.println("The current local weather:");
		System.out.println(temp);
		String url = "http://www.weather.gov/forecastmaps";
		org.jsoup.nodes.Document document = Jsoup.connect(url).get();
		String weather = document.select("p").get(1).text();
		System.out.println("The current national weather:");
		System.out.println(weather);
		System.out.println("Heve a nice day!");
	}
}