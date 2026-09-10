package p;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends a2 implements b2 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public am.e f47646z;

    @Override // p.a2
    public final n1 n(Context context, boolean z10) {
        e2 e2Var = new e2(context, z10);
        e2Var.setHoverListener(this);
        return e2Var;
    }

    @Override // p.b2
    public final void q(o.m mVar, MenuItem menuItem) {
        am.e eVar = this.f47646z;
        if (eVar != null) {
            eVar.q(mVar, menuItem);
        }
    }

    @Override // p.b2
    public final void t(o.m mVar, o.o oVar) {
        am.e eVar = this.f47646z;
        if (eVar != null) {
            eVar.t(mVar, oVar);
        }
    }
}
