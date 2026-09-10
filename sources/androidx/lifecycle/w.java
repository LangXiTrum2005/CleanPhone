package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f4602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f4603b;

    public final void a(v vVar, m mVar) {
        n nVarD = mVar.d();
        n state1 = this.f4602a;
        kotlin.jvm.internal.n.f(state1, "state1");
        if (nVarD.compareTo(state1) < 0) {
            state1 = nVarD;
        }
        this.f4602a = state1;
        this.f4603b.onStateChanged(vVar, mVar);
        this.f4602a = nVarD;
    }
}
