package com.scwang.smart.refresh.layout.wrapper;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.viewpager.widget.ViewPager;
import com.charging.screenshow.battery.animations.themes.R;
import com.scwang.smart.refresh.layout.api.RefreshContent;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.listener.CoordinatorLayoutListener;
import com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider;
import com.scwang.smart.refresh.layout.simple.SimpleBoundaryDecider;
import com.scwang.smart.refresh.layout.util.DesignUtil;
import com.scwang.smart.refresh.layout.util.SmartUtil;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public class RefreshContentWrapper implements RefreshContent, CoordinatorLayoutListener, ValueAnimator.AnimatorUpdateListener {
    public View X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final View f33559Y;
    public View Z;
    public View e0;
    public View f0;
    public int g0 = 0;
    public boolean h0 = true;
    public boolean i0 = true;
    public SimpleBoundaryDecider j0;

    public RefreshContentWrapper(View view) {
        SimpleBoundaryDecider simpleBoundaryDecider = new SimpleBoundaryDecider();
        simpleBoundaryDecider.f33554c = true;
        this.j0 = simpleBoundaryDecider;
        this.Z = view;
        this.f33559Y = view;
        this.X = view;
    }

    public static View a(View view, PointF pointF, View view2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (SmartUtil.f(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && SmartUtil.d(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewA = a(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewA;
                }
            }
        }
        return view2;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final boolean canLoadMore() {
        return this.i0 && this.j0.b(this.X);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final boolean canRefresh() {
        return this.h0 && this.j0.a(this.X);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final View getScrollableView() {
        return this.Z;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final View getView() {
        return this.X;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final void moveSpinner(int i2, int i3, int i4) {
        boolean z2;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z3 = true;
        View view = this.f33559Y;
        if (i3 == -1 || (viewFindViewById2 = view.findViewById(i3)) == null) {
            z2 = false;
        } else if (i2 > 0) {
            viewFindViewById2.setTranslationY(i2);
            z2 = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z2 = false;
        }
        if (i4 == -1 || (viewFindViewById = view.findViewById(i4)) == null) {
            z3 = z2;
        } else if (i2 < 0) {
            viewFindViewById.setTranslationY(i2);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z3 = z2;
        }
        if (z3) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(i2);
        }
        View view2 = this.e0;
        if (view2 != null) {
            view2.setTranslationY(Math.max(0, i2));
        }
        View view3 = this.f0;
        if (view3 != null) {
            view3.setTranslationY(Math.min(0, i2));
        }
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final void onActionDown(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.X.getLeft(), -this.X.getTop());
        View view = this.Z;
        View view2 = this.X;
        if (view != view2) {
            this.Z = a(view2, pointF, view);
        }
        if (this.Z == this.X) {
            this.j0.f33552a = null;
        } else {
            this.j0.f33552a = pointF;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.g0) * this.Z.getScaleY();
            View view = this.Z;
            if (view instanceof AbsListView) {
                float f = SmartUtil.f33556a;
                ((AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.g0 = iIntValue;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int i2) {
        View view = this.Z;
        if (view == null || i2 == 0) {
            return null;
        }
        if ((i2 >= 0 || !view.canScrollVertically(1)) && (i2 <= 0 || !this.Z.canScrollVertically(-1))) {
            return null;
        }
        this.g0 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final void setEnableLoadMoreWhenContentNotFull(boolean z2) {
        this.j0.f33554c = z2;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final void setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        if (scrollBoundaryDecider instanceof SimpleBoundaryDecider) {
            this.j0 = (SimpleBoundaryDecider) scrollBoundaryDecider;
        } else {
            this.j0.f33553b = scrollBoundaryDecider;
        }
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshContent
    public final void setUpComponent(RefreshKernel refreshKernel, View view, View view2) {
        View view3 = this.X;
        boolean zIsInEditMode = view3.isInEditMode();
        View view4 = null;
        while (true) {
            if (view4 != null && (!(view4 instanceof NestedScrollingParent) || (view4 instanceof NestedScrollingChild))) {
                break;
            }
            boolean z2 = view4 == null;
            LinkedList linkedList = new LinkedList();
            linkedList.add(view3);
            View view5 = null;
            while (linkedList.size() > 0 && view5 == null) {
                View view6 = (View) linkedList.poll();
                if (view6 != null) {
                    if ((z2 || view6 != view3) && SmartUtil.d(view6)) {
                        view5 = view6;
                    } else if (view6 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view6;
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            linkedList.add(viewGroup.getChildAt(i2));
                        }
                    }
                }
            }
            if (view5 != null) {
                view3 = view5;
            }
            if (view3 == view4) {
                break;
            }
            if (!zIsInEditMode) {
                DesignUtil.a(view3, refreshKernel, this);
            }
            view4 = view3;
        }
        if (view4 != null) {
            this.Z = view4;
        }
        if (view == null && view2 == null) {
            return;
        }
        this.e0 = view;
        this.f0 = view2;
        FrameLayout frameLayout = new FrameLayout(this.X.getContext());
        int iIndexOfChild = refreshKernel.getRefreshLayout().getLayout().indexOfChild(this.X);
        refreshKernel.getRefreshLayout().getLayout().removeView(this.X);
        frameLayout.addView(this.X, 0, new ViewGroup.LayoutParams(-1, -1));
        refreshKernel.getRefreshLayout().getLayout().addView(frameLayout, iIndexOfChild, this.X.getLayoutParams());
        this.X = frameLayout;
        if (view != null) {
            view.setTag(R.id.srl_tag, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup2.indexOfChild(view);
            viewGroup2.removeView(view);
            layoutParams.height = SmartUtil.g(view);
            viewGroup2.addView(new Space(this.X.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(R.id.srl_tag, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup3.indexOfChild(view2);
            viewGroup3.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = SmartUtil.g(view2);
            viewGroup3.addView(new Space(this.X.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }
}
