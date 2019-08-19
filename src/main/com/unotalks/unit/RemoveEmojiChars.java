package com.unotalks.unit;

public class RemoveEmojiChars {

    public static final String EMOJI_XML_REGEXP = "&#x[A-Fa-f0-9]+;";

    public String cleanMessage(String message) {
        String messageCleaned = message;
        if(null != message) {
            String messageSanitized = message.replaceAll(EMOJI_XML_REGEXP, "");
            messageCleaned = messageSanitized;
        }
        return messageCleaned;
    }
}
