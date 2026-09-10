package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends SnapHelper {
    private RecyclerView lnr;
    private OrientationHelper qdl;
    private OrientationHelper ud;

    private OrientationHelper ud(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.ud;
        if (orientationHelper == null || orientationHelper.f8083a != layoutManager) {
            this.ud = OrientationHelper.a(layoutManager);
        }
        return this.ud;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        this.lnr = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = {0, 0};
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = qdl(view, ud(layoutManager));
            return iArr;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = qdl(view, qdl(layoutManager));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.lnr.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.qdl.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int calculateTimeForScrolling(int i2) {
                    return Math.min(100, super.calculateTimeForScrolling(i2));
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    qdl qdlVar = qdl.this;
                    int[] iArrCalculateDistanceToFinalSnap = qdlVar.calculateDistanceToFinalSnap(qdlVar.lnr.getLayoutManager(), view);
                    int i2 = iArrCalculateDistanceToFinalSnap[0];
                    int i3 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i2), Math.abs(i3)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.b(i2, i3, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
                OrientationHelper orientationHelperQdl = qdl(layoutManager);
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = linearLayoutManager.getChildAt(i3);
                    int iAbs = Math.abs(orientationHelperQdl.g(childAt));
                    if (iAbs < i2) {
                        view = childAt;
                        i2 = iAbs;
                    }
                }
                return view;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        View viewFindSnapView = findSnapView(layoutManager);
        int i4 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = layoutManager.getPosition(viewFindSnapView);
        if (layoutManager.canScrollVertically()) {
            i4 = i3 < 0 ? position - 1 : position + 1;
        }
        return Math.min(layoutManager.getItemCount() - 1, Math.max(i4, 0));
    }

    private int qdl(View view, OrientationHelper orientationHelper) {
        int iG = orientationHelper.g(view);
        return iG >= orientationHelper.m() / 2 ? iG - orientationHelper.m() : iG;
    }

    private OrientationHelper qdl(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.qdl;
        if (orientationHelper == null || orientationHelper.f8083a != layoutManager) {
            this.qdl = OrientationHelper.c(layoutManager);
        }
        return this.qdl;
    }
}
