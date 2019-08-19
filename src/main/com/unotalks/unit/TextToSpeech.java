package com.unotalks.unit;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import com.voicerss.tts.AudioCodec;
import com.voicerss.tts.AudioFormat;
import com.voicerss.tts.Languages;
import com.voicerss.tts.VoiceParameters;
import com.voicerss.tts.VoiceProvider;

public class TextToSpeech {

    public void sayMessage(String message) throws Exception {
        VoiceProvider tts = new VoiceProvider("66e9e1454bda4e3b98283fc8e07c1798");

        VoiceParameters params = new VoiceParameters(message, Languages.Spanish_Mexico);
        params.setCodec(AudioCodec.WAV);
        params.setFormat(AudioFormat.Format_44KHZ.AF_44khz_16bit_stereo);
        params.setBase64(false);
        params.setSSML(false);
        params.setRate(0);

        byte[] voice = tts.speech(params);

        FileOutputStream fos = new FileOutputStream("D:\\voice.mp3");
        fos.write(voice, 0, voice.length);
        fos.flush();
        fos.close();

        tts.speechAsync(params);
        Desktop d = Desktop.getDesktop();
        File f = new File("D:\\voice.mp3");
        d.open(f);
    }
}
