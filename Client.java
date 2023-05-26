import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class Client {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:5000");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setReadTimeout(5000);

        try(BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            in.readLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            con.disconnect();
        }
    }
}