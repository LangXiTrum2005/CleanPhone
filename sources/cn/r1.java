package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ak.f f6760d;

    public r1(ak.k kVar, jk.c cVar) {
        super(kVar, false);
        this.f6760d = com.google.android.gms.internal.play_billing.q1.j(this, this, cVar);
    }

    @Override // cn.q1
    public final void U() throws Throwable {
        try {
            hn.b.h(com.google.android.gms.internal.play_billing.q1.t(this.f6760d), wj.r.f53297a);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof j0) {
                th = ((j0) th).f6722a;
            }
            resumeWith(t9.e.c(th));
            throw th;
        }
    }
}
