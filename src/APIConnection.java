package WeatherAPI;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class APIConnection {
    public static String getConnection(String city){
        String res= null;
        try {
            res = URLEncoder.encode(city,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String url="http://v.juhe.cn/weather/index";
        String parameter="cityname="+res+"&dtype=&format=&key=e53075f94647f1a4f45d84d85e5f21a6";

        String location=url+"?"+parameter;
        URLConnection conn =null;
        try {
            URL realurl=new URL(location);
            conn=(HttpURLConnection) realurl.openConnection();
            conn.setDoOutput(false);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Charset", "utf-8");
            conn.setRequestProperty("Accept-Charset", "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
                String result="";
            try {
                StringBuffer buffer = new StringBuffer();
                conn.connect();
                InputStream is = conn.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String str = null;
                while ((str = br.readLine()) != null) {
                    buffer.append(str);
                }
                br.close();
                isr.close();
                is.close();
                result=buffer.toString();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                return result;
            }

        }
        }

    }

