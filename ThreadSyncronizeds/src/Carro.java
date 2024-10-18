class Carro extends Veiculo implements Runnable {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(modelo + " está se movendo...");
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println(modelo + " foi interrompido.");
                }
            }
        }
    }
}