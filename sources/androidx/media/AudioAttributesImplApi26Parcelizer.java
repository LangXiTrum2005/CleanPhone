package androidx.media;

import android.media.AudioAttributes;
import q4.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4634a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f4634a, 1);
        audioAttributesImplApi26.f4635b = bVar.f(audioAttributesImplApi26.f4635b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f4634a, 1);
        bVar.j(audioAttributesImplApi26.f4635b, 2);
    }
}
