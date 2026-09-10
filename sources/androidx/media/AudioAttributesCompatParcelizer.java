package androidx.media;

import q4.b;
import q4.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVarH = audioAttributesCompat.f4633a;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        audioAttributesCompat.f4633a = (AudioAttributesImpl) dVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4633a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
