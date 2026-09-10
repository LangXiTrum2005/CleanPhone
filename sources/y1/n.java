package y1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f54140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54141d;

    public n(i1.p pVar, s sVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + pVar, sVar, pVar.f42643n, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public n(String str, Throwable th2, String str2, boolean z10, m mVar, String str3) {
        super(str, th2);
        this.f54138a = str2;
        this.f54139b = z10;
        this.f54140c = mVar;
        this.f54141d = str3;
    }
}
