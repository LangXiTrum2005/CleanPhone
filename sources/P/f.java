package p;

import android.content.Context;
import android.view.View;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o.w {
    public final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f47644m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, o.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f47644m = jVar;
        this.f47026f = 8388613;
        am.e eVar = jVar.f47691w;
        this.f47028h = eVar;
        o.u uVar = this.f47029i;
        if (uVar != null) {
            uVar.e(eVar);
        }
    }

    @Override // o.w
    public final void c() {
        switch (this.l) {
            case 0:
                j jVar = this.f47644m;
                jVar.f47688t = null;
                jVar.getClass();
                super.c();
                break;
            default:
                j jVar2 = this.f47644m;
                o.m mVar = jVar2.f47672c;
                if (mVar != null) {
                    mVar.c(true);
                }
                jVar2.f47687s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, o.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f47644m = jVar;
        if ((e0Var.A.f47007x & 32) != 32) {
            View view2 = jVar.f47678i;
            this.f47025e = view2 == null ? (View) jVar.f47677h : view2;
        }
        am.e eVar = jVar.f47691w;
        this.f47028h = eVar;
        o.u uVar = this.f47029i;
        if (uVar != null) {
            uVar.e(eVar);
        }
    }
}
