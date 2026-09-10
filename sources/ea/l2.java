package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f39551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f39552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f39553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2 f39554e;

    public /* synthetic */ l2(p2 p2Var, y1 y1Var, long j10, boolean z10, int i10) {
        this.f39550a = i10;
        this.f39551b = y1Var;
        this.f39552c = j10;
        this.f39553d = z10;
        this.f39554e = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39550a) {
            case 0:
                p2 p2Var = this.f39554e;
                y1 y1Var = this.f39551b;
                p2Var.g1(y1Var);
                p2Var.W0(y1Var, this.f39552c, this.f39553d);
                break;
            default:
                p2 p2Var2 = this.f39554e;
                y1 y1Var2 = this.f39551b;
                p2Var2.g1(y1Var2);
                p2Var2.W0(y1Var2, this.f39552c, this.f39553d);
                break;
        }
    }
}
