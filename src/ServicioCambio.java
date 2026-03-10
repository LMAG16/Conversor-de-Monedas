import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.text.DecimalFormat;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class ServicioCambio {

    String apiKey = "10f67b88b22626305595d8e4";

    ArrayList<String> historial = new ArrayList<>();

    public void convertir(int opcion, double valor){

        String base = "";
        String destino = "";

        switch(opcion){
            case 1:
                base = "USD";
                destino = "ARS";
                break;
            case 2:
                base = "ARS";
                destino = "USD";
                break;
            case 3:
                base = "USD";
                destino = "BRL";
                break;
            case 4:
                base = "BRL";
                destino = "USD";
                break;
            case 5:
                base = "USD";
                destino = "COP";
                break;
            case 6:
                base = "COP";
                destino = "USD";
                break;
        }

        try {

            String url = "https://v6.exchangerate-api.com/v6/"
                    + apiKey + "/pair/" + base + "/" + destino;

            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    cliente.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            double tasa = json.get("conversion_rate").getAsDouble();

            double resultado = valor * tasa;

            DecimalFormat df = new DecimalFormat("#.00");

            System.out.println("Tasa actual: 1 " + base + " = " + df.format(tasa) + " " + destino);

            System.out.println(df.format(valor) + " " + base +
                    " equivalen a " + df.format(resultado) + " " + destino);

            String registro = df.format(valor) + " " + base +
                    " -> " + df.format(resultado) + " " + destino;

            historial.add(registro);
            System.out.println("\nHistorial de conversiones:");

            for(String h : historial){
                System.out.println(h);
            }

        } catch (Exception e) {
            System.out.println("Error en la conversión: " + e.getMessage());
        }
    }

    public void mostrarHistorial(){

        System.out.println("\nHistorial de conversiones:");

        for(String h : historial){
            System.out.println(h);
        }

    }
}