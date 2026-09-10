package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.shadow.okio.Segment;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends m0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f4798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f4799e = new i1(this);

    public j1(RecyclerView recyclerView) {
        this.f4798d = recyclerView;
    }

    @Override // m0.b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f4798d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().N(accessibilityEvent);
        }
    }

    @Override // m0.b
    public final void b(View view, n0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f46334a;
        this.f45679a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f4798d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        r0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4906b;
        y0 y0Var = recyclerView2.mRecycler;
        e1 e1Var = recyclerView2.mState;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f4906b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(Segment.SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f4906b.canScrollVertically(1) || layoutManager.f4906b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.E(y0Var, e1Var), layoutManager.x(y0Var, e1Var), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r3
  0x0056: PHI (r3v11 int) = (r3v7 int), (r3v15 int) binds: [B:27:0x0072, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // m0.b
    public final boolean c(View view, int i10, Bundle bundle) {
        int iB;
        int iZ;
        if (super.c(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f4798d;
        if (!recyclerView.hasPendingAdapterUpdates() && recyclerView.getLayoutManager() != null) {
            r0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f4906b;
            y0 y0Var = recyclerView2.mRecycler;
            if (i10 == 4096) {
                iB = recyclerView2.canScrollVertically(1) ? (layoutManager.f4918o - layoutManager.B()) - layoutManager.y() : 0;
                if (layoutManager.f4906b.canScrollHorizontally(1)) {
                    iZ = (layoutManager.f4917n - layoutManager.z()) - layoutManager.A();
                } else {
                    iZ = 0;
                }
            } else if (i10 != 8192) {
                iB = 0;
                iZ = 0;
            } else {
                iB = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f4918o - layoutManager.B()) - layoutManager.y()) : 0;
                if (layoutManager.f4906b.canScrollHorizontally(-1)) {
                    iZ = -((layoutManager.f4917n - layoutManager.z()) - layoutManager.A());
                } else {
                    iZ = 0;
                }
            }
            if (iB != 0 || iZ != 0) {
                layoutManager.f4906b.smoothScrollBy(iZ, iB);
                return true;
            }
        }
        return false;
    }
}
