package br.com.geanluccazappe.projetointermediario;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ProjetoService {

    private final WebClient webClient = WebClient.create("https://cataas.com");

    public String consulta() {
        String url = webClient.get()
            .uri("https://cataas.com/api/tags")
            .retrieve()
            .bodyToMono(String.class)
            .block();
    
        return url;
    }

    public String processamento(String dados) {
        // implementar lógica de processamento
        return "Resultado do processamento"; // substitua esta linha pela sua lógica de processamento
    }

    public byte[] getGato(String tipo) {
        byte[] imageBytes = webClient.get()
            .uri("cat/" + tipo + "?width=750")
            .retrieve()
            .bodyToMono(byte[].class)
            .block();
    
        return imageBytes;
    }
}
