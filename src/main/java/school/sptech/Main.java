package school.sptech;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Captura captura = new Captura();

        int qtd = 10;
        int intervaloMs = 1000;

        String[] logs = captura.capturarLogs(qtd, intervaloMs);

        System.out.println("\n-----LOGS CAPTURADOS------");

        for (String log : logs) {
            System.out.println(log);
        }
    }
}

