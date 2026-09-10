package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f39911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f39912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f39913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f39914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z2 f39915e;

    public x2(z2 z2Var, w2 w2Var, w2 w2Var2, long j10, boolean z10) {
        this.f39911a = w2Var;
        this.f39912b = w2Var2;
        this.f39913c = j10;
        this.f39914d = z10;
        this.f39915e = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39915e.M0(this.f39911a, this.f39912b, this.f39913c, this.f39914d, null);
    }
}
