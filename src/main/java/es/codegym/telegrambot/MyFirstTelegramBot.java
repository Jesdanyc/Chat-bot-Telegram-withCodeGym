package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public static final String NAME = "JdYcMaratonBot_bot";
    public static final String TOKEN = "7369275996:AAHSa64TyIuFCo9ngY-RQYat6RAbcKRziOI";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {//reacciona a una interaccion
        // TODO: escribiremos la funcionalidad principal del bot aquí
        // sendTextMessageAsync("Hola programador");
        sendTextMessageAsync("Primero pasos...");
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}