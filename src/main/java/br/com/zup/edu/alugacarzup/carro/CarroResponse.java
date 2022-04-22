package br.com.zup.edu.alugacarzup.carro;

public class CarroResponse {

    private String modelo;
    private Integer ano;
    private String marca;
    private String reservado;
    private String reservadoPara;

    public CarroResponse(Carro carro) {
        this.modelo = carro.getModelo();
        this.ano = carro.getAno();
        this.marca = carro.getMarca();
        this.reservado = carro.isDisponivel() ? "Não" : "Sim";
        this.reservadoPara = carro.getReservadoPara();
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getReservado() {
        return reservado;
    }

    public String getReservadoPara() {
        return reservadoPara;
    }
}
