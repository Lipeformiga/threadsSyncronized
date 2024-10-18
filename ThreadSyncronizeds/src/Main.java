public static void main(String[] args) throws InterruptedException {
    Carro carro1 = new Carro("fiesta");
    Carro carro2 = new Carro("onix");

    Thread t1 = new Thread(carro1);
    Thread t2 = new Thread(carro2);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    carro1.acelerar();
    carro2.frear();
}
