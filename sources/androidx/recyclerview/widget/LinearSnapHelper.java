package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class LinearSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrientationHelper f8079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OrientationHelper f8080b;

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

    public final int a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i2, int i3) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i2, i3);
        int childCount = layoutManager.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = layoutManager.getChildAt(i6);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i5) {
                        view = childAt;
                        i5 = position;
                    }
                    if (position > i4) {
                        view2 = childAt;
                        i4 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(orientationHelper.d(view), orientationHelper.d(view2)) - Math.min(orientationHelper.g(view), orientationHelper.g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i4 - i5) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / f);
    }

    public final OrientationHelper c(RecyclerView.LayoutManager layoutManager) {
        if (this.f8080b.f8083a != layoutManager) {
            this.f8080b = new OrientationHelper.AnonymousClass1(layoutManager);
        }
        return this.f8080b;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            OrientationHelper orientationHelperC = c(layoutManager);
            iArr[0] = ((orientationHelperC.e(view) / 2) + orientationHelperC.g(view)) - ((orientationHelperC.n() / 2) + orientationHelperC.m());
        } else {
            iArr[0] = 0;
        }
        if (!layoutManager.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        OrientationHelper orientationHelperD = d(layoutManager);
        iArr[1] = ((orientationHelperD.e(view) / 2) + orientationHelperD.g(view)) - ((orientationHelperD.n() / 2) + orientationHelperD.m());
        return iArr;
    }

    public final OrientationHelper d(RecyclerView.LayoutManager layoutManager) {
        if (this.f8079a.f8083a != layoutManager) {
            this.f8079a = new OrientationHelper.AnonymousClass2(layoutManager);
        }
        return this.f8079a;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
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
        int itemCount;
        View viewFindSnapView;
        int position;
        int i4;
        PointF pointFComputeScrollVectorForPosition;
        int iA;
        int iA2;
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (itemCount = layoutManager.getItemCount()) != 0 && (viewFindSnapView = findSnapView(layoutManager)) != null && (position = layoutManager.getPosition(viewFindSnapView)) != -1 && (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition((i4 = itemCount - 1))) != null) {
            if (layoutManager.canScrollHorizontally()) {
                iA = a(layoutManager, c(layoutManager), i2, 0);
                if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                    iA = -iA;
                }
            } else {
                iA = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iA2 = a(layoutManager, d(layoutManager), 0, i3);
                if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                    iA2 = -iA2;
                }
            } else {
                iA2 = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iA = iA2;
            }
            if (iA != 0) {
                int i5 = position + iA;
                int i6 = i5 >= 0 ? i5 : 0;
                return i6 >= itemCount ? i4 : i6;
            }
        }
        return -1;
    }
}
