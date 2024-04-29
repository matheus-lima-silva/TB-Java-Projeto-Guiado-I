package juliaoStore;

public class Main {
    public static void main(String[] args) {
    Site s1 = new Site("MGPAM27","MG","BELO HORIZONTE","R. Irlanda, 146 - Itapoã","ROOFTOP",31710010,-19.840162243543105,-43.96545354415552,true);
    //adicionar site ao arquivo
    SitioCSV.AdicionarSitio(s1);

    //ler sites do arquivo
        SitioCSV.ListarSite();
    }
}
