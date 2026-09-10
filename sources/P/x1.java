package p;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f47853a;

    public x1(a2 a2Var) {
        this.f47853a = a2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        a2 a2Var = this.f47853a;
        if (a2Var.f47617y.isShowing()) {
            a2Var.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f47853a.dismiss();
    }
}
