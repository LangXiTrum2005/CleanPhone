package com.google.android.material.carousel;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes4.dex */
public class CarouselSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselSnapHelper$1, reason: invalid class name */
    class AnonymousClass1 extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
        int iM = carouselLayoutManager.m(carouselLayoutManager.getPosition(view));
        if (((CarouselLayoutManager) layoutManager).q()) {
            return new int[]{iM, 0};
        }
        return layoutManager.canScrollVertically() ? new int[]{0, iM} : new int[]{0, 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            throw null;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = layoutManager.getChildAt(i3);
                int iAbs = Math.abs(carouselLayoutManager.m(layoutManager.getPosition(childAt)));
                if (iAbs < i2) {
                    view = childAt;
                    i2 = iAbs;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i2, int i3) {
        return -1;
    }
}
