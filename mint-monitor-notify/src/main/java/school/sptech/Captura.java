package school.sptech;

import java.time.LocalDateTime;
import java.util.Random;

public class Captura {
        public static final Random rand = new Random();

        public String[] capturarLogs(int qtdCapturas, int intervaloMs) throws InterruptedException {

            String[] logs = new String[qtdCapturas];
            Notificacao notificacao = new Notificacao();

            for (int i = 0; i < qtdCapturas; i++) {
                double cpu = 10 + rand.nextDouble() * 80;
                double ram = 20 + rand.nextDouble() * 70;
                double disco = 30 + rand.nextDouble() * 60;

                LocalDateTime datahora = LocalDateTime.now();

                String log = String.format("""
                        -------------------------------------------------------------
                        [%d] CPU: %.1f%% | RAM: %.1f%% | Disco: %.1f%% |
                        Data da captura: %5$td/%5$tm/%5$tY ás %5$tH:%5$tM:%5$tS\"""", i + 1, cpu, ram, disco, datahora);

                System.out.println(log);
                logs[i] = log;

                notificacao.dispararNotificacao(cpu, ram, disco);

                Thread.sleep(intervaloMs);
            }

            return logs;
        }

    }
