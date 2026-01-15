package br.com.alura.screensound.service;

import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class ConsultaGemini {

    public static String obterInformacao(String texto) {
        // 1. Configuração do "Service" (no LangChain4j é o Model)
        GoogleAiGeminiChatModel model = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("GEMINI_APIKEY"))
                .modelName("gemini-1.5-flash")
                .temperature(0.7)
                .maxOutputTokens(1000)
                .build();

        try {
            String resposta = model.generate("me fale sobre o artista: " + texto);
            return resposta;
        } catch (Exception e) {
            return "Erro ao consultar o Gemini: " + e.getMessage();
        }
    }
}
