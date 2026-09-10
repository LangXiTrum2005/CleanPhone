package ads_mobile_sdk;

import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class qh implements eliminate {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Pair e;
    public final int f;
    public final int g;
    public final float h;
    public final boolean i;
    public final Double j;

    public qh(int i, boolean z, boolean z2, int i2, Pair pair, int i3, int i4, float f, boolean z3, Double d) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = pair;
        this.f = i3;
        this.g = i4;
        this.h = f;
        this.i = z3;
        this.j = d;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.audioMode = this.a;
        signals.isMusicActive = this.b;
        signals.isSpeakerPhoneOn = this.c;
        signals.musicVolume = this.d;
        Pair pair = this.e;
        if (pair != null) {
            signals.minMusicVolume = (Integer) pair.getFirst();
            signals.maxMusicVolume = (Integer) pair.getSecond();
        }
        signals.ringerMode = this.f;
        signals.ringerVolume = this.g;
        signals.appVolume = this.h;
        signals.isAppMuted = this.i;
        signals.musicVolumePercent = this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        return this.a == qhVar.a && this.b == qhVar.b && this.c == qhVar.c && this.d == qhVar.d && Intrinsics.wireman(this.e, qhVar.e) && this.f == qhVar.f && this.g == qhVar.g && Float.compare(this.h, qhVar.h) == 0 && this.i == qhVar.i && Intrinsics.wireman(this.j, qhVar.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z2 = this.c;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iAttabal = bonny.attabal(this.d, (i + r3) * 31, 31);
        Pair pair = this.e;
        int iHashCode2 = (Float.hashCode(this.h) + bonny.attabal(this.g, bonny.attabal(this.f, (iAttabal + (pair == null ? 0 : pair.hashCode())) * 31, 31), 31)) * 31;
        boolean z3 = this.i;
        int i2 = (iHashCode2 + (z3 ? 1 : z3)) * 31;
        Double d = this.j;
        return i2 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "AudioSignal(audioMode=" + this.a + ", isMusicActive=" + this.b + ", isSpeakerPhoneOn=" + this.c + ", musicVolume=" + this.d + ", minMaxMusicVolume=" + this.e + ", ringerMode=" + this.f + ", ringerVolume=" + this.g + ", appVolume=" + this.h + ", isAppMuted=" + this.i + ", musicVolumePercent=" + this.j + ")";
    }
}
