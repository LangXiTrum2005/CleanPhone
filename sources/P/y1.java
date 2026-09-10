package p;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f47871a;

    public y1(a2 a2Var) {
        this.f47871a = a2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        a2 a2Var = this.f47871a;
        w1 w1Var = a2Var.f47609q;
        a0 a0Var = a2Var.f47617y;
        if (i10 != 1 || a0Var.getInputMethodMode() == 2 || a0Var.getContentView() == null) {
            return;
        }
        a2Var.f47613u.removeCallbacks(w1Var);
        w1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
