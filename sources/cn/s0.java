package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f6761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f6762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(w0 w0Var, long j10, l lVar) {
        super(j10);
        this.f6762d = w0Var;
        this.f6761c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6761c.C(this.f6762d, wj.r.f53297a);
    }

    @Override // cn.u0
    public final String toString() {
        return super.toString() + this.f6761c;
    }
}
