import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        //tamanho do deslocamento
        int deslocamento = 3;
        //inserindo o nome do arquivo txt em uma variavel
        String nomeArquivo = "textoCriptografado.txt";

        StringBuilder textoCriptografado = new StringBuilder();

        //criptografando
        for (int i = 0; i < frase.length(); i++) {
            textoCriptografado.append((char)(frase.charAt(i) + deslocamento));
        }

        Path arquivo = Paths.get(nomeArquivo);

        //escrevendo no arquivo
        try {
            Files.writeString(arquivo, textoCriptografado);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //mostrando criptografado
        System.out.println(textoCriptografado.toString());

        StringBuilder textoDescriptografado = new StringBuilder();
        String leitura = null;

        //lendo o que esta no arquivo
        try {
            leitura = Files.readString(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //descriptografando
        for (int i = 0; i < leitura.length(); i++) {
            textoDescriptografado.append((char)(leitura.charAt(i) - deslocamento));
        }

        //mostrando criptografado
        System.out.println(leitura);
        //mostrando descriptografado
        System.out.println(textoDescriptografado.toString());
    }
}