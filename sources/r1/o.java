package r1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1.p f49327c;

    public o(int i10, i1.p pVar, boolean z10) {
        super(l1.d.e(i10, "AudioTrack write failed: "));
        this.f49326b = z10;
        this.f49325a = i10;
        this.f49327c = pVar;
    }
}
