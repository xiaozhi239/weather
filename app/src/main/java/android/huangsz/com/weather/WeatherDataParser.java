package android.huangsz.com.weather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject weather = new JSONObject(weatherJsonStr);
        JSONArray dayList = weather.getJSONArray("list");
        JSONObject day = dayList.getJSONObject(dayIndex);
        return day.getJSONObject("temp").getDouble("max");
    }
}
