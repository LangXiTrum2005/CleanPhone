package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends m0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1 f4792d;

    public i1(j1 j1Var) {
        this.f4792d = j1Var;
    }

    @Override // m0.b
    public final void b(View view, n0.e eVar) {
        this.f45679a.onInitializeAccessibilityNodeInfo(view, eVar.f46334a);
        j1 j1Var = this.f4792d;
        RecyclerView recyclerView = j1Var.f4798d;
        RecyclerView recyclerView2 = j1Var.f4798d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return;
        }
        recyclerView2.getLayoutManager().O(view, eVar);
    }

    @Override // m0.b
    public final boolean c(View view, int i10, Bundle bundle) {
        if (super.c(view, i10, bundle)) {
            return true;
        }
        j1 j1Var = this.f4792d;
        RecyclerView recyclerView = j1Var.f4798d;
        RecyclerView recyclerView2 = j1Var.f4798d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView2.getLayoutManager() != null) {
            y0 y0Var = recyclerView2.getLayoutManager().f4906b.mRecycler;
        }
        return false;
    }
}
