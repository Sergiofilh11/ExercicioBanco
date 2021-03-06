package exercicio;

public class Endereco {

    private String rua;
    private String bairro;
    private String cep;

    public Endereco(String rua, String bairro, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
