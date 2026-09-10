package androidx.media;

import q4.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4636a = bVar.f(audioAttributesImplBase.f4636a, 1);
        audioAttributesImplBase.f4637b = bVar.f(audioAttributesImplBase.f4637b, 2);
        audioAttributesImplBase.f4638c = bVar.f(audioAttributesImplBase.f4638c, 3);
        audioAttributesImplBase.f4639d = bVar.f(audioAttributesImplBase.f4639d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f4636a, 1);
        bVar.j(audioAttributesImplBase.f4637b, 2);
        bVar.j(audioAttributesImplBase.f4638c, 3);
        bVar.j(audioAttributesImplBase.f4639d, 4);
    }
}
