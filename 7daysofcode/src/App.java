import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        String apiKey = "k_of61l3eg";
        String movieName = "shrek2";
        
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://imdb-api.com/en/API/Search/"+apiKey+"/"+movieName)).build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpResponse<String> respose = httpClient.send(request, BodyHandlers.ofString());

        String body = respose.body();
    }
}
