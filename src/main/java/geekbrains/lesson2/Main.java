package geekbrains.lesson2;

public class Main {
    static class Human{
        private Transport currentTransport;
        public void stop(){
            if(currentTransport != null){
                currentTransport.stop();
                currentTransport = null;
            } else System.out.println("I'm not going anywhere");
        }

        public void drive(Transport transport){
            transport.start();
            this.currentTransport = transport;
        }

        public void skateboardParkAction(){
            if(!(currentTransport instanceof Skateboard)){
                System.out.println("Not skateboard");
                return;
            }
            Skateboard skateboard = (Skateboard) currentTransport;
        }

    }

    static class Car implements Transport {

        @Override
        public void start() {
            System.out.println("Car start");
        }

        @Override
        public void stop() {
            System.out.println("Car stop");
        }
    }

    static class Skateboard implements Transport {

        @Override
        public void start() {
            System.out.println("Skate start");
        }

        @Override
        public void stop() {
            System.out.println("Skate stop");
        }
    }

    static class Bicycle implements Transport {

        @Override
        public void start() {
            System.out.println("Bicycle start");
        }

        @Override
        public void stop() {
            System.out.println("Bicycle stop");
        }
    }

    static class Moto implements Transport {

        @Override
        public void start() {
            System.out.println("Moto start");
        }

        @Override
        public void stop() {
            System.out.println("Moto stop");
        }
    }

    public static void main(String[] args) {
        Flyable[] flyables = { new Duck(), new Airplane()};

        for (Flyable flyable : flyables){
            flyable.fly();
        }

        Flyable somethingFly = new Duck();
        somethingFly.fly();

        Transport transport = new Car();
        Human human = new Human();
        human.stop();
        human.drive(transport);
        human.stop();
    }
}
