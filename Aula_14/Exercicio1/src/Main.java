import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Path arquivo = Paths.get("professores_disciplina.txt");
        try {
            List<String> conteudo = Files.readAllLines(arquivo);
            Map<String,String> professores = new HashMap<>();

            conteudo.forEach((linha) -> {
                String[] linhaquebrada = linha.split("=");
                professores.put(linhaquebrada[0],linhaquebrada[1].strip());
            });

            professores.forEach((chave,valor) -> {
                System.out.println(chave + " = " + valor);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}