package juliaoStore;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class SitioCSV {
    // Caminho do arquivo
    private static final String rotaArquivo = "./data/sitiossudeste.csv";

    //metodo para adicionar um sitio ao arquivo csv
    public static void AdicionarSitio(Site f) {
        try {
            // verificar se arquivo existe
            boolean arquivoExiste = new File(rotaArquivo).exists();

            //Abre o escritor para adicionar dados ao arquivo
            var escritor = getEscritor(f, arquivoExiste);
            //escrever todos os dados do buffer no arquivo imediatamente
            escritor.flush();
            //fechar o recurso de escrita
            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static FileWriter getEscritor(Site f, boolean arquivoExiste) throws IOException {
        FileWriter escritor = new FileWriter(rotaArquivo, StandardCharsets.UTF_8, true);
        if (!arquivoExiste) {
            escritor.write("ID;UF;MUNICIPIO;ENDEREÇO;TIPO;CEP;LATITUDE;LONGITUDE;VISITADO\n");
        }
        //escrever dados do ativo no formato apropriado
        escritor.write(f.getId() + ";" + f.getUf() + ";" + f.getMunicipio() + ";" + f.getEndereco() + ";" + f.getTipo() + ";" + f.getCep() + ";" + f.getLatitude() + ";" + f.getLongitude() + ";" + f.isVisitado() + "\n");
        return escritor;
    }

    // metodo para listar sites do arquivo sitioscsv
    public static ArrayList<Site> ListarSite() {

        ArrayList<Site> lista1 = new ArrayList<>();
        try {
            //abrir um leitor de arquivo
            BufferedReader leitor = new BufferedReader(new FileReader(rotaArquivo));
            String linha;
            boolean primeiraLinha = true;
            
            while ((linha = leitor.readLine()) != null) {
                //ignora header
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }
                //divir linha como separador '; '
                String[] partes = linha.split(";");
                String id = partes[0];
                String uf = partes[1];
                String municipio = partes[2];
                String endereco = partes[3];
                String tipo = partes[4];
                double cep = Double.parseDouble(partes[5]);
                double latitude = Double.parseDouble(partes[6]);
                double longitude = Double.parseDouble(partes[7]);
                boolean visitado = Boolean.parseBoolean(partes[8]);

                //criando objeto site
                Site s;
                s = new Site(id, uf, municipio, endereco, tipo, cep, latitude, longitude, visitado);

                // adiciona a lista
                lista1.add(s);

                //imprimir site
                System.out.println("ID: " + id + "UF: " + uf + "MUNICIPIO: " + municipio);


            }

            leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista1;
    }

}