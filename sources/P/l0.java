package p;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f47716a;

    public l0(n0 n0Var) {
        this.f47716a = n0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        n0 n0Var = this.f47716a;
        q0 q0Var = n0Var.D;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(view, i10, n0Var.A.getItemId(i10));
        }
        n0Var.dismiss();
    }
}
