class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println(modelo + " está acelerando...");
    }

    public void frear() {
        System.out.println(modelo + " está freando...");
    }
}
