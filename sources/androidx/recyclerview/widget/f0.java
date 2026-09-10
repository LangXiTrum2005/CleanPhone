package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements r1, l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4767a;

    public /* synthetic */ f0(RecyclerView recyclerView) {
        this.f4767a = recyclerView;
    }

    public void a(a aVar) {
        int i10 = aVar.f4701a;
        RecyclerView recyclerView = this.f4767a;
        if (i10 == 1) {
            recyclerView.mLayout.Q(aVar.f4702b, aVar.f4704d);
            return;
        }
        if (i10 == 2) {
            recyclerView.mLayout.T(aVar.f4702b, aVar.f4704d);
        } else if (i10 == 4) {
            recyclerView.mLayout.U(aVar.f4702b, aVar.f4704d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.mLayout.S(aVar.f4702b, aVar.f4704d);
        }
    }

    public void b(int i10) {
        RecyclerView recyclerView = this.f4767a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
