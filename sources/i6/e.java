package i6;

import a7.l;
import g6.a0;
import g6.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f42897d;

    @Override // a7.l
    public final int c(Object obj) {
        a0 a0Var = (a0) obj;
        if (a0Var == null) {
            return 1;
        }
        return a0Var.getSize();
    }

    @Override // a7.l
    public final void d(Object obj, Object obj2) {
        a0 a0Var = (a0) obj2;
        m mVar = this.f42897d;
        if (mVar == null || a0Var == null) {
            return;
        }
        mVar.f41653e.e(a0Var, true);
    }
}
