package juliaoStore;

public class Site {
    private String id;
    private String uf;
    private String municipio;
    private String endereco;
    private String tipo;
    private double cep;
    private double latitude;
    private double longitude;
    private boolean visitado;

    public Site(String id, String uf, String municipio, String endereco, String tipo, double cep, double latitude, double longitude, boolean visitado) {
        this.id = id;
        this.uf = uf;
        this.municipio = municipio;
        this.endereco = endereco;
        this.tipo = tipo;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
        this.visitado = visitado;
    }

    public String getId() {
        return id;
    }

    public String getUf() {
        return uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCep() {
        return cep;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
}
