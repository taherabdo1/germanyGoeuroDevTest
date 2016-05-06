package mainPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import entities.CityInfo;

public class App {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) {

		if (args.length == 0 || args[0].equals("")) {
			System.out.println("please, give a city name...");
		} else if (!args[0].equals("")) {
			callService(args[0]);
		}

	}

	static void callService(String cityName) {
		File outCSVFile = null;
		PrintWriter pw = null;

		try {
			URL url = new URL(
					"http://api.goeuro.com/api/v2/position/suggest/en/"
							+ cityName);
			outCSVFile = new File(cityName + ".csv");
		
			pw = new PrintWriter(outCSVFile);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			/**
			 * jackson
			 */
			ObjectMapper mapper = new ObjectMapper();
			CityInfo[] objs = mapper.readValue(url, CityInfo[].class);
			if (objs.length == 0)
				pw.print("no data recieved for this city..");

			// set headers
			pw.print("_id,");
			pw.print("Name,");
			pw.print("Type,");
			pw.print("Latitude,");
			pw.println("Longitude");

			for (CityInfo city : objs) {
				pw.print(city.get_id() + ",");
				pw.print(city.getName() + ",");
				pw.print(city.getType() + ",");
				pw.print(city.getGeo_position().getLatitude() + ",");
				pw.println(city.getGeo_position().getLongitude());
			}

			// close resources
			pw.flush();
			pw.close();
			conn.disconnect();

		} catch(FileNotFoundException e){
			System.out.println("File is found before and opened by another process, kindly close the other process and re-run");
		}
		catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}
