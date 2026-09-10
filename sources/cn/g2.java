package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g2 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6715b = 0;

    static {
        new g2();
    }

    @Override // cn.w
    public final void p(ak.k kVar, Runnable runnable) {
        k2 k2Var = (k2) kVar.get(k2.f6728b);
        if (k2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        k2Var.f6729a = true;
    }

    @Override // cn.w
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
