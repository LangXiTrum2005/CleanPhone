package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f4634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4635b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4634a.equals(((AudioAttributesImplApi21) obj).f4634a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4634a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4634a;
    }
}
