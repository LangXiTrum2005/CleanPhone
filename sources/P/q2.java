package p;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f47783b;

    public /* synthetic */ q2(Toolbar toolbar, int i10) {
        this.f47782a = i10;
        this.f47783b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f47782a;
        Toolbar toolbar = this.f47783b;
        switch (i10) {
            case 0:
                s2 s2Var = toolbar.L;
                o.o oVar = s2Var == null ? null : s2Var.f47809b;
                if (oVar != null) {
                    oVar.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
