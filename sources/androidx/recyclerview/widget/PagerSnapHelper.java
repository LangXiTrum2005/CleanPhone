package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class PagerSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrientationHelper f8086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OrientationHelper f8087b;

    public static int a(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.e(view) / 2) + orientationHelper.g(view)) - ((orientationHelper.n() / 2) + orientationHelper.m());
    }

    public static View b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iN = (orientationHelper.n() / 2) + orientationHelper.m();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int iAbs = Math.abs(((orientationHelper.e(childAt) / 2) + orientationHelper.g(childAt)) - iN);
            if (iAbs < i2) {
                view = childAt;
                i2 = iAbs;
            }
        }
        return view;
    }

    public final OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f8087b;
        if (orientationHelper == null || orientationHelper.f8083a != layoutManager) {
            this.f8087b = new OrientationHelper.AnonymousClass1(layoutManager);
        }
        return this.f8087b;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(view, c(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(view, d(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final int calculateTimeForScrolling(int i2) {
                    return Math.min(100, super.calculateTimeForScrolling(i2));
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                    int[] iArrCalculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
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

    public final OrientationHelper d(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f8086a;
        if (orientationHelper == null || orientationHelper.f8083a != layoutManager) {
            this.f8086a = new OrientationHelper.AnonymousClass2(layoutManager);
        }
        return this.f8086a;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return b(layoutManager, d(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return b(layoutManager, c(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (itemCount != 0) {
            View view = null;
            OrientationHelper orientationHelperD = layoutManager.canScrollVertically() ? d(layoutManager) : layoutManager.canScrollHorizontally() ? c(layoutManager) : null;
            if (orientationHelperD != null) {
                int childCount = layoutManager.getChildCount();
                boolean z2 = false;
                int i4 = Integer.MAX_VALUE;
                int i5 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = layoutManager.getChildAt(i6);
                    if (childAt != null) {
                        int iA = a(childAt, orientationHelperD);
                        if (iA <= 0 && iA > i5) {
                            view2 = childAt;
                            i5 = iA;
                        }
                        if (iA >= 0 && iA < i4) {
                            view = childAt;
                            i4 = iA;
                        }
                    }
                }
                boolean z3 = !layoutManager.canScrollHorizontally() ? i3 <= 0 : i2 <= 0;
                if (z3 && view != null) {
                    return layoutManager.getPosition(view);
                }
                if (!z3 && view2 != null) {
                    return layoutManager.getPosition(view2);
                }
                if (z3) {
                    view = view2;
                }
                if (view != null) {
                    int position = layoutManager.getPosition(view);
                    int itemCount2 = layoutManager.getItemCount();
                    if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z2 = true;
                    }
                    int i7 = position + (z2 == z3 ? -1 : 1);
                    if (i7 >= 0 && i7 < itemCount) {
                        return i7;
                    }
                }
            }
        }
        return -1;
    }
}
