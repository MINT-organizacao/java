package school.sptech;

public class Notificacao {
    double LIMITE = 80.0;

   public void dispararNotificacao(double cpu, double ram, double disco) {
        if (cpu > LIMITE) {
            System.out.println("[Enviando notificação de CPU no Slack...]");
        }
        if (ram > LIMITE) {
            System.out.println("[Enviando notificação de RAM no Slack...]");
        }
        if (disco > LIMITE) {
            System.out.println("[Enviando notificação de Disco no Slack...]");
        }
    }
}

