package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4718b;

    public a1(RecyclerView recyclerView) {
        this.f4718b = recyclerView;
    }

    public final void a() {
        boolean z10 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f4718b;
        if (!z10 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = m0.s0.f45746a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // androidx.recyclerview.widget.i0
    public final void onChanged() {
        RecyclerView recyclerView = this.f4718b;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f4754f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.i0
    public final void onItemRangeChanged(int i10, int i11, Object obj) {
        RecyclerView recyclerView = this.f4718b;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f4720b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(bVar.h(4, i10, i11, obj));
        bVar.f4724f |= 4;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.i0
    public final void onItemRangeInserted(int i10, int i11) {
        RecyclerView recyclerView = this.f4718b;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f4720b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(bVar.h(1, i10, i11, null));
        bVar.f4724f |= 1;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.i0
    public final void onItemRangeMoved(int i10, int i11, int i12) {
        RecyclerView recyclerView = this.f4718b;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f4720b;
        if (i10 == i11) {
            return;
        }
        arrayList.add(bVar.h(8, i10, i11, null));
        bVar.f4724f |= 8;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.i0
    public final void onItemRangeRemoved(int i10, int i11) {
        RecyclerView recyclerView = this.f4718b;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f4720b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(bVar.h(2, i10, i11, null));
        bVar.f4724f |= 2;
        if (arrayList.size() == 1) {
            a();
        }
    }
}
