package br.com.geanluccazappe.projetointermediario;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;

@RestController
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/consulta")
        public ResponseEntity<String> consulta() {
        return ResponseEntity.ok(projetoService.consulta());
    }

    @PostMapping("/processamento")
    public ResponseEntity<String> processamento(@RequestBody String dados) {
        return ResponseEntity.ok(projetoService.processamento(dados));
    }

    @GetMapping("/ajuda")
    public ResponseEntity<Ajuda> ajuda() {
        Ajuda ajuda = new Ajuda();
        ajuda.setEstudante("Geanlucca Zappe");
        ajuda.setProjeto("Catos, para seu dia ficar melhor");
        return ResponseEntity.ok(ajuda);
    }

    @GetMapping(value = "/gato", produces = MediaType.IMAGE_JPEG_VALUE)
public ResponseEntity<Resource> gato() {
    byte[] imageBytes = projetoService.getGato("cat");
    final ByteArrayResource byteArrayResource = new ByteArrayResource(imageBytes);

    return ResponseEntity
        .ok()
        .contentType(MediaType.IMAGE_JPEG)
        .body(byteArrayResource);
}
@GetMapping(value = "/sol", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<Resource> sol() {
        byte[] imageBytes = projetoService.getGato("sun");
        final ByteArrayResource byteArrayResource = new ByteArrayResource(imageBytes);

        return ResponseEntity
            .ok()
            .contentType(MediaType.IMAGE_JPEG)
            .body(byteArrayResource);
    }

    @GetMapping(value = "/suave", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<Resource> suave() {
        byte[] imageBytes = projetoService.getGato("chill");
        final ByteArrayResource byteArrayResource = new ByteArrayResource(imageBytes);

        return ResponseEntity
            .ok()
            .contentType(MediaType.IMAGE_JPEG)
            .body(byteArrayResource);   
    }

    @GetMapping(value = "/dorminhoco", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<Resource> dorminhoco() {
        byte[] imageBytes = projetoService.getGato("sleepy");
        final ByteArrayResource byteArrayResource = new ByteArrayResource(imageBytes);

        return ResponseEntity
            .ok()
            .contentType(MediaType.IMAGE_JPEG)
            .body(byteArrayResource);
    }
}