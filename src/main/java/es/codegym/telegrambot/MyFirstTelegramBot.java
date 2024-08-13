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
        // Para negrita : *hola*
        // Para cursiva : _hola_
        // Condicionales
        if (getMessageText().equals("/start")){// equals = a =
            sendTextMessageAsync("_Hola_ *programador* <3");
        }
        if (getMessageText().contains("hola")){//h o H son simbolos diferentes and contains igual pero detecta dentro de todo un texto
            sendTextMessageAsync("_Hola_,como te *llamas?* >.<");
        }
        if (getMessageText().contains("mi nombre es")){
            sendTextMessageAsync("Un placer, yo soy *Gato* =^.^=.\n¿En qué te puedo ayudar?");
        }
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}