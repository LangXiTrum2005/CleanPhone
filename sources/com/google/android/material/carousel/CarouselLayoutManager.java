package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19174Y;
    public int Z;
    public final DebugItemDecoration e0;
    public final MultiBrowseCarouselStrategy f0;
    public KeylineStateList g0;
    public KeylineState h0;
    public int i0;
    public HashMap j0;
    public CarouselOrientationHelper k0;
    public final View.OnLayoutChangeListener l0;
    public int m0;
    public int n0;
    public final int o0;

    public static final class ChildCalculations {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f19176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f19178c;
        public final KeylineRange d;

        public ChildCalculations(View view, float f, float f2, KeylineRange keylineRange) {
            this.f19176a = view;
            this.f19177b = f;
            this.f19178c = f2;
            this.d = keylineRange;
        }
    }

    public static class DebugItemDecoration extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f19179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f19180b;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.f19179a = paint;
            this.f19180b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Canvas canvas2;
            super.onDrawOver(canvas, recyclerView, state);
            Paint paint = this.f19179a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.f19180b) {
                paint.setColor(ColorUtils.b(keyline.f19199c, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).q()) {
                    float fI = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k0.i();
                    float fD = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k0.d();
                    float f = keyline.f19198b;
                    float f2 = keyline.f19198b;
                    canvas2 = canvas;
                    canvas2.drawLine(f, fI, f2, fD, paint);
                } else {
                    float f3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k0.f();
                    float fG = ((CarouselLayoutManager) recyclerView.getLayoutManager()).k0.g();
                    float f4 = keyline.f19198b;
                    float f5 = keyline.f19198b;
                    canvas2 = canvas;
                    canvas2.drawLine(f3, f5, fG, f4, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public static class KeylineRange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeylineState.Keyline f19181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KeylineState.Keyline f19182b;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            if (keyline.f19197a > keyline2.f19197a) {
                throw new IllegalArgumentException();
            }
            this.f19181a = keyline;
            this.f19182b = keyline2;
        }
    }

    public static class LayoutDirection {
    }

    public CarouselLayoutManager() {
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = new MultiBrowseCarouselStrategy();
        this.e0 = new DebugItemDecoration();
        this.i0 = 0;
        this.l0 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager carouselLayoutManager = this.X;
                if (i2 == i6 && i3 == i7 && i4 == i8 && i5 == i9) {
                    return;
                }
                view.post(new c0.a(carouselLayoutManager, 18));
            }
        };
        this.n0 = -1;
        this.o0 = 0;
        this.f0 = multiBrowseCarouselStrategy;
        w();
        setOrientation(0);
    }

    public static KeylineRange p(List list, float f, boolean z2) {
        float f2 = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < list.size(); i6++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list.get(i6);
            float f6 = z2 ? keyline.f19198b : keyline.f19197a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i2 = i6;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i4 = i6;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i3 = i6;
                f5 = f6;
            }
            if (f6 > f3) {
                i5 = i6;
                f3 = f6;
            }
        }
        if (i2 == -1) {
            i2 = i3;
        }
        if (i4 == -1) {
            i4 = i5;
        }
        return new KeylineRange((KeylineState.Keyline) list.get(i2), (KeylineState.Keyline) list.get(i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return !q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || this.g0 == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.g0.f19202a.f19188a / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.X;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.Z - this.f19174Y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i2) {
        if (this.g0 == null) {
            return null;
        }
        int iN = n(i2, l(i2)) - this.X;
        return q() ? new PointF(iN, 0.0f) : new PointF(0.0f, iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || this.g0 == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.g0.f19202a.f19188a / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.X;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return this.Z - this.f19174Y;
    }

    public final void d(View view, int i2, ChildCalculations childCalculations) {
        float f = this.h0.f19188a / 2.0f;
        addView(view, i2);
        float f2 = childCalculations.f19178c;
        this.k0.j((int) (f2 - f), (int) (f2 + f), view);
        y(view, childCalculations.f19177b, childCalculations.d);
    }

    public final float e(float f, float f2) {
        return r() ? f - f2 : f + f2;
    }

    public final void f(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float fI = i(i2);
        while (i2 < state.b()) {
            ChildCalculations childCalculationsU = u(recycler, fI, i2);
            float f = childCalculationsU.f19178c;
            KeylineRange keylineRange = childCalculationsU.d;
            if (s(f, keylineRange)) {
                return;
            }
            fI = e(fI, this.h0.f19188a);
            if (!t(f, keylineRange)) {
                d(childCalculationsU.f19176a, -1, childCalculationsU);
            }
            i2++;
        }
    }

    public final void g(int i2, RecyclerView.Recycler recycler) {
        float fI = i(i2);
        while (i2 >= 0) {
            ChildCalculations childCalculationsU = u(recycler, fI, i2);
            KeylineRange keylineRange = childCalculationsU.d;
            float f = childCalculationsU.f19178c;
            if (t(f, keylineRange)) {
                return;
            }
            float f2 = this.h0.f19188a;
            fI = r() ? fI + f2 : fI - f2;
            if (!s(f, keylineRange)) {
                d(childCalculationsU.f19176a, 0, childCalculationsU);
            }
            i2--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (q()) {
            fCenterY = rect.centerX();
        }
        KeylineRange keylineRangeP = p(this.h0.f19189b, fCenterY, true);
        KeylineState.Keyline keyline = keylineRangeP.f19181a;
        float f = keyline.d;
        KeylineState.Keyline keyline2 = keylineRangeP.f19182b;
        float fB = AnimationUtils.b(f, keyline2.d, keyline.f19198b, keyline2.f19198b, fCenterY);
        float fWidth = q() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = q() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public final float h(View view, float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f19181a;
        float f2 = keyline.f19198b;
        KeylineState.Keyline keyline2 = keylineRange.f19182b;
        float f3 = keyline2.f19198b;
        float f4 = keyline.f19197a;
        float f5 = keyline2.f19197a;
        float fB = AnimationUtils.b(f2, f3, f4, f5, f);
        if (keyline2 != this.h0.b() && keyline != this.h0.d()) {
            return fB;
        }
        return (((1.0f - keyline2.f19199c) + (this.k0.b((RecyclerView.LayoutParams) view.getLayoutParams()) / this.h0.f19188a)) * (f - f5)) + fB;
    }

    public final float i(int i2) {
        return e(this.k0.h() - this.X, this.h0.f19188a * i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final void j(RecyclerView.Recycler recycler, RecyclerView.State state) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            float fCenterX = q() ? rect.centerX() : rect.centerY();
            if (!t(fCenterX, p(this.h0.f19189b, fCenterX, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            float fCenterX2 = q() ? rect2.centerX() : rect2.centerY();
            if (!s(fCenterX2, p(this.h0.f19189b, fCenterX2, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
        if (getChildCount() == 0) {
            g(this.i0 - 1, recycler);
            f(this.i0, recycler, state);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            g(position - 1, recycler);
            f(position2 + 1, recycler, state);
        }
    }

    public final int k() {
        return q() ? getWidth() : getHeight();
    }

    public final KeylineState l(int i2) {
        KeylineState keylineState;
        HashMap map = this.j0;
        return (map == null || (keylineState = (KeylineState) map.get(Integer.valueOf(MathUtils.b(i2, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.g0.f19202a : keylineState;
    }

    public final int m(int i2) {
        int iN = n(i2, this.g0.b(this.X, this.f19174Y, this.Z, true)) - this.X;
        if (this.j0 != null) {
            n(i2, l(i2));
        }
        return iN;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i2, int i3) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i4 = rect.left + rect.right + i2;
        int i5 = rect.top + rect.bottom + i3;
        KeylineStateList keylineStateList = this.g0;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i4, (int) ((keylineStateList == null || this.k0.f19183a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : keylineStateList.f19202a.f19188a), q()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i5, (int) ((keylineStateList == null || this.k0.f19183a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : keylineStateList.f19202a.f19188a), canScrollVertically()));
    }

    public final int n(int i2, KeylineState keylineState) {
        if (!r()) {
            return (int) ((keylineState.f19188a / 2.0f) + ((i2 * keylineState.f19188a) - keylineState.a().f19197a));
        }
        float fK = k() - keylineState.c().f19197a;
        float f = keylineState.f19188a;
        return (int) ((fK - (i2 * f)) - (f / 2.0f));
    }

    public final int o(int i2, KeylineState keylineState) {
        int i3 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.f19189b.subList(keylineState.f19190c, keylineState.d + 1)) {
            float f = keylineState.f19188a;
            float f2 = (f / 2.0f) + (i2 * f);
            int iK = (r() ? (int) ((k() - keyline.f19197a) - f2) : (int) (f2 - keyline.f19197a)) - this.X;
            if (Math.abs(i3) > Math.abs(iK)) {
                i3 = iK;
            }
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.f0;
        Context context = recyclerView.getContext();
        float dimension = multiBrowseCarouselStrategy.f19186a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        multiBrowseCarouselStrategy.f19186a = dimension;
        float dimension2 = multiBrowseCarouselStrategy.f19187b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        multiBrowseCarouselStrategy.f19187b = dimension2;
        w();
        recyclerView.addOnLayoutChangeListener(this.l0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.l0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        byte b2;
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = this.k0.f19183a;
        if (i2 == 1) {
            b2 = -1;
        } else if (i2 == 2) {
            b2 = 1;
        } else if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i2);
                    } else if (i3 == 1) {
                        b2 = 1;
                    }
                    b2 = -2147483648;
                } else if (i3 != 0) {
                    b2 = -2147483648;
                } else if (r()) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
            } else if (i3 == 1) {
                b2 = -1;
            } else {
                b2 = -2147483648;
            }
        } else if (i3 != 0) {
            b2 = -2147483648;
        } else if (r()) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == -2147483648) {
            return null;
        }
        if (b2 == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            int position = getPosition(getChildAt(0)) - 1;
            if (position >= 0 && position < getItemCount()) {
                ChildCalculations childCalculationsU = u(recycler, i(position), position);
                d(childCalculationsU.f19176a, 0, childCalculationsU);
            }
            return getChildAt(r() ? getChildCount() - 1 : 0);
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
        if (position2 >= 0 && position2 < getItemCount()) {
            ChildCalculations childCalculationsU2 = u(recycler, i(position2), position2);
            d(childCalculationsU2.f19176a, -1, childCalculationsU2);
        }
        return getChildAt(r() ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        super.onItemsAdded(recyclerView, i2, i3);
        int itemCount = getItemCount();
        int i4 = this.m0;
        if (itemCount == i4 || this.g0 == null) {
            return;
        }
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.f0;
        if ((i4 < multiBrowseCarouselStrategy.f19207c && getItemCount() >= multiBrowseCarouselStrategy.f19207c) || (i4 >= multiBrowseCarouselStrategy.f19207c && getItemCount() < multiBrowseCarouselStrategy.f19207c)) {
            w();
        }
        this.m0 = itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        super.onItemsRemoved(recyclerView, i2, i3);
        int itemCount = getItemCount();
        int i4 = this.m0;
        if (itemCount == i4 || this.g0 == null) {
            return;
        }
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.f0;
        if ((i4 < multiBrowseCarouselStrategy.f19207c && getItemCount() >= multiBrowseCarouselStrategy.f19207c) || (i4 >= multiBrowseCarouselStrategy.f19207c && getItemCount() < multiBrowseCarouselStrategy.f19207c)) {
            w();
        }
        this.m0 = itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f;
        if (state.b() <= 0 || k() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.i0 = 0;
            return;
        }
        boolean zR = r();
        boolean z2 = this.g0 == null;
        if (z2) {
            v(recycler);
        }
        KeylineStateList keylineStateList = this.g0;
        boolean zR2 = r();
        KeylineState keylineStateA = zR2 ? keylineStateList.a() : keylineStateList.c();
        float f2 = (zR2 ? keylineStateA.c() : keylineStateA.a()).f19197a;
        float f3 = keylineStateA.f19188a / 2.0f;
        int iH = (int) (this.k0.h() - (r() ? f2 + f3 : f2 - f3));
        KeylineStateList keylineStateList2 = this.g0;
        boolean zR3 = r();
        KeylineState keylineStateC = zR3 ? keylineStateList2.c() : keylineStateList2.a();
        KeylineState.Keyline keylineA = zR3 ? keylineStateC.a() : keylineStateC.c();
        int iB = (int) (((((state.b() - 1) * keylineStateC.f19188a) * (zR3 ? -1.0f : 1.0f)) - (keylineA.f19197a - this.k0.h())) + (this.k0.e() - keylineA.f19197a) + (zR3 ? -keylineA.g : keylineA.f19201h));
        int iMin = zR3 ? Math.min(0, iB) : Math.max(0, iB);
        this.f19174Y = zR ? iMin : iH;
        if (zR) {
            iMin = iH;
        }
        this.Z = iMin;
        if (z2) {
            this.X = iH;
            KeylineStateList keylineStateList3 = this.g0;
            int itemCount = getItemCount();
            int i2 = this.f19174Y;
            int i3 = this.Z;
            boolean zR4 = r();
            KeylineState keylineState = keylineStateList3.f19202a;
            HashMap map = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                f = keylineState.f19188a;
                if (i4 >= itemCount) {
                    break;
                }
                int i6 = zR4 ? (itemCount - i4) - 1 : i4;
                float f4 = i6 * f * (zR4 ? -1 : 1);
                float f5 = i3 - keylineStateList3.g;
                List list = keylineStateList3.f19204c;
                if (f4 > f5 || i4 >= itemCount - list.size()) {
                    map.put(Integer.valueOf(i6), (KeylineState) list.get(MathUtils.b(i5, 0, list.size() - 1)));
                    i5++;
                }
                i4++;
            }
            int i7 = 0;
            for (int i8 = itemCount - 1; i8 >= 0; i8--) {
                int i9 = zR4 ? (itemCount - i8) - 1 : i8;
                float f6 = i9 * f * (zR4 ? -1 : 1);
                float f7 = i2 + keylineStateList3.f;
                List list2 = keylineStateList3.f19203b;
                if (f6 < f7 || i8 < list2.size()) {
                    map.put(Integer.valueOf(i9), (KeylineState) list2.get(MathUtils.b(i7, 0, list2.size() - 1)));
                    i7++;
                }
            }
            this.j0 = map;
            int i10 = this.n0;
            if (i10 != -1) {
                this.X = n(i10, l(i10));
            }
        }
        int i11 = this.X;
        int i12 = this.f19174Y;
        int i13 = this.Z;
        this.X = (i11 < i12 ? i12 - i11 : i11 > i13 ? i13 - i11 : 0) + i11;
        this.i0 = MathUtils.b(this.i0, 0, state.b());
        z(this.g0);
        detachAndScrapAttachedViews(recycler);
        j(recycler, state);
        this.m0 = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        if (getChildCount() == 0) {
            this.i0 = 0;
        } else {
            this.i0 = getPosition(getChildAt(0));
        }
    }

    public final boolean q() {
        return this.k0.f19183a == 0;
    }

    public final boolean r() {
        return q() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iO;
        if (this.g0 == null || (iO = o(getPosition(view), l(getPosition(view)))) == 0) {
            return false;
        }
        int i2 = this.X;
        int i3 = this.f19174Y;
        int i4 = this.Z;
        int i5 = i2 + iO;
        if (i5 < i3) {
            iO = i3 - i2;
        } else if (i5 > i4) {
            iO = i4 - i2;
        }
        int iO2 = o(getPosition(view), this.g0.b(i2 + iO, i3, i4, false));
        if (q()) {
            recyclerView.scrollBy(iO2, 0);
            return true;
        }
        recyclerView.scrollBy(0, iO2);
        return true;
    }

    public final boolean s(float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f19181a;
        float f2 = keyline.d;
        KeylineState.Keyline keyline2 = keylineRange.f19182b;
        float fB = AnimationUtils.b(f2, keyline2.d, keyline.f19198b, keyline2.f19198b, f) / 2.0f;
        float f3 = r() ? f + fB : f - fB;
        if (r()) {
            return f3 < 0.0f;
        }
        return f3 > ((float) k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (q()) {
            return x(i2, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i2) {
        this.n0 = i2;
        if (this.g0 == null) {
            return;
        }
        this.X = n(i2, l(i2));
        this.i0 = MathUtils.b(i2, 0, Math.max(0, getItemCount() - 1));
        z(this.g0);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return x(i2, recycler, state);
        }
        return 0;
    }

    public final void setOrientation(int i2) {
        CarouselOrientationHelper carouselOrientationHelper;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper2 = this.k0;
        if (carouselOrientationHelper2 == null || i2 != carouselOrientationHelper2.f19183a) {
            if (i2 == 0) {
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
                    {
                        super(0);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
                        float f = rectF2.left;
                        float f2 = rectF3.left;
                        if (f < f2 && rectF2.right > f2) {
                            float f3 = f2 - f;
                            rectF.left += f3;
                            rectF2.left += f3;
                        }
                        float f4 = rectF2.right;
                        float f5 = rectF3.right;
                        if (f4 <= f5 || rectF2.left >= f5) {
                            return;
                        }
                        float f6 = f4 - f5;
                        rectF.right = Math.max(rectF.right - f6, rectF.left);
                        rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final float b(RecyclerView.LayoutParams layoutParams) {
                        return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final RectF c(float f, float f2, float f3, float f4) {
                        return new RectF(f4, 0.0f, f2 - f4, f);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int d() {
                        CarouselLayoutManager carouselLayoutManager = this.f19185b;
                        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int e() {
                        CarouselLayoutManager carouselLayoutManager = this.f19185b;
                        if (carouselLayoutManager.r()) {
                            return 0;
                        }
                        return carouselLayoutManager.getWidth();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int f() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int g() {
                        return this.f19185b.getWidth();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int h() {
                        CarouselLayoutManager carouselLayoutManager = this.f19185b;
                        if (carouselLayoutManager.r()) {
                            return carouselLayoutManager.getWidth();
                        }
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int i() {
                        return this.f19185b.getPaddingTop();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void j(int i3, int i4, View view) {
                        CarouselLayoutManager carouselLayoutManager = this.f19185b;
                        int paddingTop = carouselLayoutManager.getPaddingTop();
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                        this.f19185b.layoutDecoratedWithMargins(view, i3, paddingTop, i4, carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + paddingTop);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
                        if (rectF2.right <= rectF3.left) {
                            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                            rectF.right = fFloor;
                            rectF.left = Math.min(rectF.left, fFloor);
                        }
                        if (rectF2.left >= rectF3.right) {
                            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                            rectF.left = fCeil;
                            rectF.right = Math.max(fCeil, rectF.right);
                        }
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void l(View view, Rect rect, float f, float f2) {
                        view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
                    }
                };
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
                    {
                        super(1);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
                        float f = rectF2.top;
                        float f2 = rectF3.top;
                        if (f < f2 && rectF2.bottom > f2) {
                            float f3 = f2 - f;
                            rectF.top += f3;
                            rectF3.top += f3;
                        }
                        float f4 = rectF2.bottom;
                        float f5 = rectF3.bottom;
                        if (f4 <= f5 || rectF2.top >= f5) {
                            return;
                        }
                        float f6 = f4 - f5;
                        rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
                        rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final float b(RecyclerView.LayoutParams layoutParams) {
                        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final RectF c(float f, float f2, float f3, float f4) {
                        return new RectF(0.0f, f3, f2, f - f3);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int d() {
                        return this.f19184b.getHeight();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int e() {
                        return this.f19184b.getHeight();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int f() {
                        return this.f19184b.getPaddingLeft();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int g() {
                        CarouselLayoutManager carouselLayoutManager = this.f19184b;
                        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int h() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int i() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void j(int i3, int i4, View view) {
                        CarouselLayoutManager carouselLayoutManager = this.f19184b;
                        int paddingLeft = carouselLayoutManager.getPaddingLeft();
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                        this.f19184b.layoutDecoratedWithMargins(view, paddingLeft, i3, carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + paddingLeft, i4);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
                        if (rectF2.bottom <= rectF3.top) {
                            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                            rectF.bottom = fFloor;
                            rectF.top = Math.min(rectF.top, fFloor);
                        }
                        if (rectF2.top >= rectF3.bottom) {
                            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                            rectF.top = fCeil;
                            rectF.bottom = Math.max(fCeil, rectF.bottom);
                        }
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void l(View view, Rect rect, float f, float f2) {
                        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
                    }
                };
            }
            this.k0 = carouselOrientationHelper;
            w();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final int calculateDxToMakeVisible(View view, int i3) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (carouselLayoutManager.g0 == null || !carouselLayoutManager.q()) {
                    return 0;
                }
                int position = carouselLayoutManager.getPosition(view);
                return (int) (carouselLayoutManager.X - carouselLayoutManager.n(position, carouselLayoutManager.l(position)));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final int calculateDyToMakeVisible(View view, int i3) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (carouselLayoutManager.g0 == null || carouselLayoutManager.q()) {
                    return 0;
                }
                int position = carouselLayoutManager.getPosition(view);
                return (int) (carouselLayoutManager.X - carouselLayoutManager.n(position, carouselLayoutManager.l(position)));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public final PointF computeScrollVectorForPosition(int i3) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i3);
            }
        };
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    public final boolean t(float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f19181a;
        float f2 = keyline.d;
        KeylineState.Keyline keyline2 = keylineRange.f19182b;
        float fE = e(f, AnimationUtils.b(f2, keyline2.d, keyline.f19198b, keyline2.f19198b, f) / 2.0f);
        if (r()) {
            return fE > ((float) k());
        }
        return fE < 0.0f;
    }

    public final ChildCalculations u(RecyclerView.Recycler recycler, float f, int i2) {
        View view = recycler.l(i2, Long.MAX_VALUE).itemView;
        measureChildWithMargins(view, 0, 0);
        float fE = e(f, this.h0.f19188a / 2.0f);
        KeylineRange keylineRangeP = p(this.h0.f19189b, fE, false);
        return new ChildCalculations(view, fE, h(view, fE, keylineRangeP), keylineRangeP);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0458 A[PHI: r24
  0x0458: PHI (r24v1 float) = (r24v3 float), (r24v4 float) binds: [B:116:0x0456, B:112:0x044e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x045c  */
    /* JADX WARN: Code duplicated, block: B:149:0x054c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0557 A[LOOP:5: B:148:0x054a->B:152:0x0557, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0561  */
    /* JADX WARN: Code duplicated, block: B:158:0x0568  */
    /* JADX WARN: Code duplicated, block: B:161:0x0577  */
    /* JADX WARN: Code duplicated, block: B:164:0x058f  */
    /* JADX WARN: Code duplicated, block: B:166:0x059d  */
    /* JADX WARN: Code duplicated, block: B:169:0x05a8 A[LOOP:6: B:165:0x059b->B:169:0x05a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:175:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:178:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:180:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:183:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:185:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:187:0x0622  */
    /* JADX WARN: Code duplicated, block: B:189:0x0630  */
    /* JADX WARN: Code duplicated, block: B:192:0x0643 A[LOOP:8: B:188:0x062e->B:192:0x0643, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x064f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0669  */
    /* JADX WARN: Code duplicated, block: B:201:0x0673  */
    /* JADX WARN: Code duplicated, block: B:218:0x055a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x055b A[EDGE_INSN: B:219:0x055b->B:154:0x055b BREAK  A[LOOP:5: B:148:0x054a->B:152:0x0557], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x05ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x05ad A[EDGE_INSN: B:221:0x05ad->B:171:0x05ad BREAK  A[LOOP:6: B:165:0x059b->B:169:0x05a8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0640 A[EDGE_INSN: B:226:0x0640->B:191:0x0640 BREAK  A[LOOP:8: B:188:0x062e->B:192:0x0643], SYNTHETIC] */
    public final void v(RecyclerView.Recycler recycler) {
        KeylineState keylineStateD;
        int i2;
        int paddingTop;
        int paddingBottom;
        List list;
        float f;
        int i3;
        int i4;
        ArrayList arrayList;
        int size;
        int height;
        float f2;
        int height2;
        int i5;
        float f3;
        float f4;
        float f5;
        int i6;
        KeylineState keylineState;
        int i7;
        int i8;
        int i9;
        float f6;
        int i10;
        float f7;
        KeylineState.Keyline keylineC;
        int size2;
        KeylineState.Keyline keyline;
        float f8;
        boolean z2;
        KeylineState.Keyline keyline2;
        int i11;
        int i12;
        View view = recycler.l(0, Long.MAX_VALUE).itemView;
        measureChildWithMargins(view, 0, 0);
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.f0;
        multiBrowseCarouselStrategy.getClass();
        float height3 = getHeight();
        if (q()) {
            height3 = getWidth();
        }
        float f9 = height3;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (q()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = f10;
        float f12 = multiBrowseCarouselStrategy.f19186a + f11;
        float fMax = Math.max(multiBrowseCarouselStrategy.f19187b + f11, f12);
        float fMin = Math.min(measuredHeight + f11, f9);
        float fA = MathUtils.a((measuredHeight / 3.0f) + f11, f12 + f11, fMax + f11);
        float f13 = (fMin + fA) / 2.0f;
        int[] iArrA = MultiBrowseCarouselStrategy.d;
        if (f9 < f12 * 2.0f) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = MultiBrowseCarouselStrategy.f19206e;
        if (this.o0 == 1) {
            iArrA = CarouselStrategy.a(iArrA);
            iArrA2 = CarouselStrategy.a(iArrA2);
        }
        int iMax = (int) Math.max(1.0d, Math.floor(((f9 - (CarouselStrategyHelper.c(iArrA2) * f13)) - (CarouselStrategyHelper.c(iArrA) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f9 / fMin);
        int i13 = (iCeil - iMax) + 1;
        int[] iArr = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i14] = iCeil - i14;
        }
        Arrangement arrangementA = Arrangement.a(f9, fA, f12, fMax, iArrA, f13, iArrA2, fMin, iArr);
        int i15 = arrangementA.f19171c + arrangementA.d;
        int i16 = arrangementA.g;
        multiBrowseCarouselStrategy.f19207c = i15 + i16;
        int itemCount = getItemCount();
        int i17 = arrangementA.f19171c;
        int i18 = arrangementA.d;
        int i19 = ((i17 + i18) + i16) - itemCount;
        boolean z3 = i19 > 0 && (i17 > 0 || i18 > 1);
        while (i19 > 0) {
            int i20 = arrangementA.f19171c;
            if (i20 > 0) {
                arrangementA.f19171c = i20 - 1;
            } else {
                int i21 = arrangementA.d;
                if (i21 > 1) {
                    arrangementA.d = i21 - 1;
                }
            }
            i19--;
        }
        if (z3) {
            arrangementA = Arrangement.a(f9, fA, f12, fMax, new int[]{arrangementA.f19171c}, f13, new int[]{arrangementA.d}, fMin, new int[]{i16});
        }
        Context context = view.getContext();
        if (this.o0 == 1) {
            float fMin2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f11, arrangementA.f);
            float f14 = fMin2 / 2.0f;
            float f15 = 0.0f - f14;
            float fB = CarouselStrategyHelper.b(arrangementA.f19171c, 0.0f, arrangementA.f19170b);
            float fD = CarouselStrategyHelper.d(0.0f, CarouselStrategyHelper.a((int) Math.floor(arrangementA.f19171c / 2.0f), fB, arrangementA.f19170b), arrangementA.f19170b, arrangementA.f19171c);
            float fB2 = CarouselStrategyHelper.b(arrangementA.d, fD, arrangementA.f19172e);
            float fD2 = CarouselStrategyHelper.d(fD, CarouselStrategyHelper.a((int) Math.floor(arrangementA.d / 2.0f), fB2, arrangementA.f19172e), arrangementA.f19172e, arrangementA.d);
            float f16 = arrangementA.f;
            int i22 = arrangementA.g;
            float fB3 = CarouselStrategyHelper.b(i22, fD2, f16);
            float fD3 = CarouselStrategyHelper.d(fD2, CarouselStrategyHelper.a(i22, fB3, arrangementA.f), arrangementA.f, i22);
            float fB4 = CarouselStrategyHelper.b(arrangementA.d, fD3, arrangementA.f19172e);
            float fB5 = CarouselStrategyHelper.b(arrangementA.f19171c, CarouselStrategyHelper.d(fD3, CarouselStrategyHelper.a((int) Math.ceil(arrangementA.d / 2.0f), fB4, arrangementA.f19172e), arrangementA.f19172e, arrangementA.d), arrangementA.f19170b);
            float f17 = f14 + f9;
            float fB6 = CarouselStrategy.b(fMin2, arrangementA.f, f11);
            float fB7 = CarouselStrategy.b(arrangementA.f19170b, arrangementA.f, f11);
            float fB8 = CarouselStrategy.b(arrangementA.f19172e, arrangementA.f, f11);
            KeylineState.Builder builder = new KeylineState.Builder(arrangementA.f, f9);
            builder.a(f15, fB6, fMin2, false, true);
            int i23 = arrangementA.f19171c;
            if (i23 > 0) {
                builder.c(fB, fB7, (int) Math.floor(i23 / 2.0f), false, arrangementA.f19170b);
            }
            int i24 = arrangementA.d;
            if (i24 > 0) {
                builder.c(fB2, fB8, (int) Math.floor(i24 / 2.0f), false, arrangementA.f19172e);
            }
            builder.c(fB3, 0.0f, arrangementA.g, true, arrangementA.f);
            int i25 = arrangementA.d;
            if (i25 > 0) {
                builder.c(fB4, fB8, (int) Math.ceil(i25 / 2.0f), false, arrangementA.f19172e);
            }
            int i26 = arrangementA.f19171c;
            if (i26 > 0) {
                builder.c(fB5, fB7, (int) Math.ceil(i26 / 2.0f), false, arrangementA.f19170b);
            }
            builder.a(f17, fB6, fMin2, false, true);
            keylineStateD = builder.d();
        } else {
            float fMin3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f11, arrangementA.f);
            float f18 = fMin3 / 2.0f;
            float f19 = 0.0f - f18;
            float f20 = arrangementA.f;
            int i27 = arrangementA.g;
            float fB9 = CarouselStrategyHelper.b(i27, 0.0f, f20);
            float fD4 = CarouselStrategyHelper.d(0.0f, CarouselStrategyHelper.a(i27, fB9, arrangementA.f), arrangementA.f, i27);
            float fB10 = CarouselStrategyHelper.b(arrangementA.d, fD4, arrangementA.f19172e);
            float fB11 = CarouselStrategyHelper.b(arrangementA.f19171c, CarouselStrategyHelper.d(fD4, fB10, arrangementA.f19172e, arrangementA.d), arrangementA.f19170b);
            float f21 = f18 + f9;
            float fB12 = CarouselStrategy.b(fMin3, arrangementA.f, f11);
            float fB13 = CarouselStrategy.b(arrangementA.f19170b, arrangementA.f, f11);
            float fB14 = CarouselStrategy.b(arrangementA.f19172e, arrangementA.f, f11);
            KeylineState.Builder builder2 = new KeylineState.Builder(arrangementA.f, f9);
            builder2.a(f19, fB12, fMin3, false, true);
            builder2.c(fB9, 0.0f, arrangementA.g, true, arrangementA.f);
            if (arrangementA.d > 0) {
                builder2.a(fB10, fB14, arrangementA.f19172e, false, false);
            }
            int i28 = arrangementA.f19171c;
            if (i28 > 0) {
                builder2.c(fB11, fB13, i28, false, arrangementA.f19170b);
            }
            builder2.a(f21, fB12, fMin3, false, true);
            keylineStateD = builder2.d();
        }
        if (r()) {
            float fK = k();
            KeylineState.Builder builder3 = new KeylineState.Builder(keylineStateD.f19188a, fK);
            float f22 = (fK - keylineStateD.d().f19198b) - (keylineStateD.d().d / 2.0f);
            List list2 = keylineStateD.f19189b;
            int size3 = list2.size() - 1;
            while (size3 >= 0) {
                KeylineState.Keyline keyline3 = (KeylineState.Keyline) list2.get(size3);
                float f23 = keyline3.d;
                builder3.a((f23 / 2.0f) + f22, keyline3.f19199c, f23, size3 >= keylineStateD.f19190c && size3 <= keylineStateD.d, keyline3.f19200e);
                f22 += keyline3.d;
                size3--;
            }
            keylineStateD = builder3.d();
        }
        KeylineState keylineState2 = keylineStateD;
        if (getChildCount() > 0) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
            if (this.k0.f19183a == 0) {
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                i12 = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                i12 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            }
            i2 = i12 + i11;
        } else {
            i2 = 0;
        }
        float f24 = i2;
        if (getClipToPadding()) {
            paddingTop = 0;
        } else {
            this.f0.getClass();
            paddingTop = this.k0.f19183a == 1 ? getPaddingTop() : getPaddingLeft();
        }
        float f25 = paddingTop;
        if (getClipToPadding()) {
            paddingBottom = 0;
        } else {
            this.f0.getClass();
            paddingBottom = this.k0.f19183a == 1 ? getPaddingBottom() : getPaddingRight();
        }
        float f26 = paddingBottom;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(keylineState2);
        int i29 = 0;
        while (true) {
            list = keylineState2.f19189b;
            if (i29 >= list.size()) {
                i29 = -1;
                break;
            } else if (!((KeylineState.Keyline) list.get(i29)).f19200e) {
                break;
            } else {
                i29++;
            }
        }
        float width = q() ? getWidth() : getHeight();
        float f27 = keylineState2.a().f19198b - (keylineState2.a().d / 2.0f);
        int i30 = keylineState2.d;
        int i31 = keylineState2.f19190c;
        if (f27 >= 0.0f) {
            KeylineState.Keyline keylineA = keylineState2.a();
            f = 0.0f;
            int i32 = 0;
            while (true) {
                if (i32 >= list.size()) {
                    keyline2 = null;
                    break;
                }
                keyline2 = (KeylineState.Keyline) list.get(i32);
                if (!keyline2.f19200e) {
                    break;
                } else {
                    i32++;
                }
            }
            if (keylineA == keyline2) {
                if (f25 > f) {
                    arrayList2.add(KeylineStateList.g(keylineState2, f25, width, true, f24));
                }
                i3 = i30;
                i4 = i31;
            }
            arrayList = new ArrayList();
            arrayList.add(keylineState2);
            size = list.size() - 1;
            while (true) {
                if (size >= 0) {
                    size = -1;
                    break;
                } else if (!((KeylineState.Keyline) list.get(size)).f19200e) {
                    break;
                } else {
                    size--;
                }
            }
            if (q()) {
                height = getWidth();
            } else {
                height = getHeight();
            }
            f2 = height;
            height2 = getHeight();
            if (q()) {
                height2 = getWidth();
            }
            if ((keylineState2.c().d / 2.0f) + keylineState2.c().f19198b <= height2) {
                keylineC = keylineState2.c();
                size2 = list.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        keyline = null;
                        break;
                    }
                    keyline = (KeylineState.Keyline) list.get(size2);
                    if (!keyline.f19200e) {
                        break;
                    } else {
                        size2--;
                    }
                }
                if (keylineC == keyline) {
                    if (f26 > f) {
                        arrayList.add(KeylineStateList.g(keylineState2, f26, f2, false, f24));
                    }
                } else if (size == -1) {
                    i5 = size - i3;
                    f3 = keylineState2.b().f19198b - (keylineState2.b().d / 2.0f);
                    if (i5 <= 0 || keylineState2.c().f <= f) {
                        f4 = f2;
                        f5 = f;
                        i6 = 0;
                        while (i6 < i5) {
                            keylineState = (KeylineState) android.support.v4.media.a.d(1, arrayList);
                            i7 = i5;
                            int i33 = size - i6;
                            f5 += ((KeylineState.Keyline) list.get(i33)).f;
                            i8 = i33 + 1;
                            float f28 = f3;
                            if (i8 < list.size()) {
                                f6 = ((KeylineState.Keyline) list.get(i8)).f19199c;
                                i10 = keylineState.f19190c - 1;
                                while (true) {
                                    if (i10 < 0) {
                                        i10 = 0;
                                        break;
                                    }
                                    f7 = f6;
                                    if (f7 == ((KeylineState.Keyline) keylineState.f19189b.get(i10)).f19199c) {
                                        break;
                                    }
                                    i10--;
                                    f6 = f7;
                                }
                                i9 = i10 + 1;
                            } else {
                                i9 = 0;
                            }
                            int i34 = size;
                            KeylineState keylineStateF = KeylineStateList.f(keylineState, i34, i9, f28 - f5, i4 + i6 + 1, i3 + i6 + 1, f4);
                            float f29 = f4;
                            if (i6 != i7 - 1 && f26 > f) {
                                keylineStateF = KeylineStateList.g(keylineStateF, f26, f29, false, f24);
                            }
                            arrayList.add(keylineStateF);
                            i6++;
                            i5 = i7;
                            f4 = f29;
                            size = i34;
                            f3 = f28;
                        }
                    } else {
                        arrayList.add(KeylineStateList.f(keylineState2, 0, 0, f3 - keylineState2.c().f, keylineState2.f19190c, keylineState2.d, f2));
                    }
                } else if (f26 > f) {
                    arrayList.add(KeylineStateList.g(keylineState2, f26, f2, false, f24));
                }
            } else if (size == -1) {
                i5 = size - i3;
                f3 = keylineState2.b().f19198b - (keylineState2.b().d / 2.0f);
                if (i5 <= 0) {
                    f4 = f2;
                    f5 = f;
                    i6 = 0;
                    while (i6 < i5) {
                        keylineState = (KeylineState) android.support.v4.media.a.d(1, arrayList);
                        i7 = i5;
                        int i35 = size - i6;
                        f5 += ((KeylineState.Keyline) list.get(i35)).f;
                        i8 = i35 + 1;
                        float f210 = f3;
                        if (i8 < list.size()) {
                            f6 = ((KeylineState.Keyline) list.get(i8)).f19199c;
                            i10 = keylineState.f19190c - 1;
                            while (true) {
                                if (i10 < 0) {
                                    i10 = 0;
                                    break;
                                }
                                f7 = f6;
                                if (f7 == ((KeylineState.Keyline) keylineState.f19189b.get(i10)).f19199c) {
                                    break;
                                    break;
                                } else {
                                    i10--;
                                    f6 = f7;
                                }
                            }
                            i9 = i10 + 1;
                        } else {
                            i9 = 0;
                        }
                        int i36 = size;
                        KeylineState keylineStateF2 = KeylineStateList.f(keylineState, i36, i9, f210 - f5, i4 + i6 + 1, i3 + i6 + 1, f4);
                        float f211 = f4;
                        if (i6 != i7 - 1) {
                        }
                        arrayList.add(keylineStateF2);
                        i6++;
                        i5 = i7;
                        f4 = f211;
                        size = i36;
                        f3 = f210;
                    }
                } else {
                    f4 = f2;
                    f5 = f;
                    i6 = 0;
                    while (i6 < i5) {
                        keylineState = (KeylineState) android.support.v4.media.a.d(1, arrayList);
                        i7 = i5;
                        int i37 = size - i6;
                        f5 += ((KeylineState.Keyline) list.get(i37)).f;
                        i8 = i37 + 1;
                        float f212 = f3;
                        if (i8 < list.size()) {
                            f6 = ((KeylineState.Keyline) list.get(i8)).f19199c;
                            i10 = keylineState.f19190c - 1;
                            while (true) {
                                if (i10 < 0) {
                                    i10 = 0;
                                    break;
                                }
                                f7 = f6;
                                if (f7 == ((KeylineState.Keyline) keylineState.f19189b.get(i10)).f19199c) {
                                    break;
                                    break;
                                } else {
                                    i10--;
                                    f6 = f7;
                                }
                            }
                            i9 = i10 + 1;
                        } else {
                            i9 = 0;
                        }
                        int i38 = size;
                        KeylineState keylineStateF3 = KeylineStateList.f(keylineState, i38, i9, f212 - f5, i4 + i6 + 1, i3 + i6 + 1, f4);
                        float f213 = f4;
                        if (i6 != i7 - 1) {
                        }
                        arrayList.add(keylineStateF3);
                        i6++;
                        i5 = i7;
                        f4 = f213;
                        size = i38;
                        f3 = f212;
                    }
                }
            } else if (f26 > f) {
                arrayList.add(KeylineStateList.g(keylineState2, f26, f2, false, f24));
            }
            this.g0 = new KeylineStateList(keylineState2, arrayList2, arrayList);
        }
        f = 0.0f;
        if (i29 == -1) {
            if (f25 > f) {
                arrayList2.add(KeylineStateList.g(keylineState2, f25, width, true, f24));
            }
            i3 = i30;
            i4 = i31;
        } else {
            int i39 = i31 - i29;
            float f30 = keylineState2.b().f19198b - (keylineState2.b().d / 2.0f);
            if (i39 > 0 || keylineState2.a().f <= f) {
                i3 = i30;
                i4 = i31;
                float f31 = width;
                float f32 = f;
                int i40 = 0;
                while (i40 < i39) {
                    KeylineState keylineState3 = (KeylineState) android.support.v4.media.a.d(1, arrayList2);
                    int i41 = i29;
                    int i42 = i41 + i40;
                    int size4 = list.size() - 1;
                    float f33 = f32 + ((KeylineState.Keyline) list.get(i42)).f;
                    int i43 = i42 - 1;
                    if (i43 >= 0) {
                        float f34 = ((KeylineState.Keyline) list.get(i43)).f19199c;
                        int i44 = keylineState3.d;
                        while (true) {
                            List list3 = keylineState3.f19189b;
                            f8 = f33;
                            if (i44 >= list3.size()) {
                                int size5 = list3.size();
                                z2 = true;
                                i44 = size5 - 1;
                                break;
                            } else if (f34 == ((KeylineState.Keyline) list3.get(i44)).f19199c) {
                                z2 = true;
                                break;
                            } else {
                                i44++;
                                f33 = f8;
                            }
                        }
                        size4 = i44 - 1;
                    } else {
                        f8 = f33;
                        z2 = true;
                    }
                    KeylineState keylineStateF4 = KeylineStateList.f(keylineState3, i41, size4, f30 + f8, (i4 - i40) - 1, (i3 - i40) - 1, f31);
                    float f35 = f31;
                    if (i40 == i39 - 1 && f25 > f) {
                        keylineStateF4 = KeylineStateList.g(keylineStateF4, f25, f35, z2, f24);
                    }
                    arrayList2.add(keylineStateF4);
                    i40++;
                    f31 = f35;
                    i29 = i41;
                    i39 = i39;
                    f32 = f8;
                }
            } else {
                i4 = i31;
                i3 = i30;
                arrayList2.add(KeylineStateList.f(keylineState2, 0, 0, f30 + keylineState2.a().f, keylineState2.f19190c, keylineState2.d, width));
            }
        }
        arrayList = new ArrayList();
        arrayList.add(keylineState2);
        size = list.size() - 1;
        while (true) {
            if (size >= 0) {
                size = -1;
                break;
            } else {
                if (!((KeylineState.Keyline) list.get(size)).f19200e) {
                    break;
                    break;
                }
                size--;
            }
        }
        if (q()) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        f2 = height;
        height2 = getHeight();
        if (q()) {
            height2 = getWidth();
        }
        if ((keylineState2.c().d / 2.0f) + keylineState2.c().f19198b <= height2) {
            keylineC = keylineState2.c();
            size2 = list.size() - 1;
            while (true) {
                if (size2 >= 0) {
                    keyline = null;
                    break;
                }
                keyline = (KeylineState.Keyline) list.get(size2);
                if (!keyline.f19200e) {
                    break;
                    break;
                }
                size2--;
            }
            if (keylineC == keyline) {
                if (f26 > f) {
                    arrayList.add(KeylineStateList.g(keylineState2, f26, f2, false, f24));
                }
            } else if (size == -1) {
                i5 = size - i3;
                f3 = keylineState2.b().f19198b - (keylineState2.b().d / 2.0f);
                if (i5 <= 0) {
                    f4 = f2;
                    f5 = f;
                    i6 = 0;
                    while (i6 < i5) {
                        keylineState = (KeylineState) android.support.v4.media.a.d(1, arrayList);
                        i7 = i5;
                        int i310 = size - i6;
                        f5 += ((KeylineState.Keyline) list.get(i310)).f;
                        i8 = i310 + 1;
                        float f214 = f3;
                        if (i8 < list.size()) {
                            f6 = ((KeylineState.Keyline) list.get(i8)).f19199c;
                            i10 = keylineState.f19190c - 1;
                            while (true) {
                                if (i10 < 0) {
                                    i10 = 0;
                                    break;
                                }
                                f7 = f6;
                                if (f7 == ((KeylineState.Keyline) keylineState.f19189b.get(i10)).f19199c) {
                                    break;
                                    break;
                                } else {
                                    i10--;
                                    f6 = f7;
                                }
                            }
                            i9 = i10 + 1;
                        } else {
                            i9 = 0;
                        }
                        int i311 = size;
                        KeylineState keylineStateF5 = KeylineStateList.f(keylineState, i311, i9, f214 - f5, i4 + i6 + 1, i3 + i6 + 1, f4);
                        float f215 = f4;
                        if (i6 != i7 - 1) {
                        }
                        arrayList.add(keylineStateF5);
                        i6++;
                        i5 = i7;
                        f4 = f215;
                        size = i311;
                        f3 = f214;
                    }
                } else {
                    f4 = f2;
                    f5 = f;
                    i6 = 0;
                    while (i6 < i5) {
                        keylineState = (KeylineState) android.support.v4.media.a.d(1, arrayList);
                        i7 = i5;
                        int i312 = size - i6;
                        f5 += ((KeylineState.Keyline) list.get(i312)).f;
                        i8 = i312 + 1;
                        float f216 = f3;
                        if (i8 < list.size()) {
                            f6 = ((KeylineState.Keyline) list.get(i8)).f19199c;
                            i10 = keylineState.f19190c - 1;
                            while (true) {
                                if (i10 < 0) {
                                    i10 = 0;
                                    break;
                                }
                                f7 = f6;
                                if (f7 == ((KeylineState.Keyline) keylineState.f19189b.get(i10)).f19199c) {
                                    break;
                                    break;
                                } else {
                                    i10--;
                                    f6 = f7;
                                }
                            }
                            i9 = i10 + 1;
                        } else {
                            i9 = 0;
                        }
                        int i313 = size;
                        KeylineState keylineStateF6 = KeylineStateList.f(keylineState, i313, i9, f216 - f5, i4 + i6 + 1, i3 + i6 + 1, f4);
                        float f217 = f4;
                        if (i6 != i7 - 1) {
                        }
                        arrayList.add(keylineStateF6);
                        i6++;
                        i5 = i7;
                        f4 = f217;
                        size = i313;
                        f3 = f216;
                    }
                }
            } else if (f26 > f) {
                arrayList.add(KeylineStateList.g(keylineState2, f26, f2, false, f24));
            }
        } else if (size == -1) {
            i5 = size - i3;
            f3 = keylineState2.b().f19198b - (keylineState2.b().d / 2.0f);
            if (i5 <= 0) {
                f4 = f2;
                f5 = f;
                i6 = 0;
                while (i6 < i5) {
                    keylineState = (KeylineState) android.support.v4.media.a.d(1, arrayList);
                    i7 = i5;
                    int i314 = size - i6;
                    f5 += ((KeylineState.Keyline) list.get(i314)).f;
                    i8 = i314 + 1;
                    float f218 = f3;
                    if (i8 < list.size()) {
                        f6 = ((KeylineState.Keyline) list.get(i8)).f19199c;
                        i10 = keylineState.f19190c - 1;
                        while (true) {
                            if (i10 < 0) {
                                i10 = 0;
                                break;
                            }
                            f7 = f6;
                            if (f7 == ((KeylineState.Keyline) keylineState.f19189b.get(i10)).f19199c) {
                                break;
                                break;
                            } else {
                                i10--;
                                f6 = f7;
                            }
                        }
                        i9 = i10 + 1;
                    } else {
                        i9 = 0;
                    }
                    int i315 = size;
                    KeylineState keylineStateF7 = KeylineStateList.f(keylineState, i315, i9, f218 - f5, i4 + i6 + 1, i3 + i6 + 1, f4);
                    float f219 = f4;
                    if (i6 != i7 - 1) {
                    }
                    arrayList.add(keylineStateF7);
                    i6++;
                    i5 = i7;
                    f4 = f219;
                    size = i315;
                    f3 = f218;
                }
            } else {
                f4 = f2;
                f5 = f;
                i6 = 0;
                while (i6 < i5) {
                    keylineState = (KeylineState) android.support.v4.media.a.d(1, arrayList);
                    i7 = i5;
                    int i316 = size - i6;
                    f5 += ((KeylineState.Keyline) list.get(i316)).f;
                    i8 = i316 + 1;
                    float f2110 = f3;
                    if (i8 < list.size()) {
                        f6 = ((KeylineState.Keyline) list.get(i8)).f19199c;
                        i10 = keylineState.f19190c - 1;
                        while (true) {
                            if (i10 < 0) {
                                i10 = 0;
                                break;
                            }
                            f7 = f6;
                            if (f7 == ((KeylineState.Keyline) keylineState.f19189b.get(i10)).f19199c) {
                                break;
                                break;
                            } else {
                                i10--;
                                f6 = f7;
                            }
                        }
                        i9 = i10 + 1;
                    } else {
                        i9 = 0;
                    }
                    int i317 = size;
                    KeylineState keylineStateF8 = KeylineStateList.f(keylineState, i317, i9, f2110 - f5, i4 + i6 + 1, i3 + i6 + 1, f4);
                    float f2111 = f4;
                    if (i6 != i7 - 1) {
                    }
                    arrayList.add(keylineStateF8);
                    i6++;
                    i5 = i7;
                    f4 = f2111;
                    size = i317;
                    f3 = f2110;
                }
            }
        } else if (f26 > f) {
            arrayList.add(KeylineStateList.g(keylineState2, f26, f2, false, f24));
        }
        this.g0 = new KeylineStateList(keylineState2, arrayList2, arrayList);
    }

    public final void w() {
        this.g0 = null;
        requestLayout();
    }

    public final int x(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        if (this.g0 == null) {
            v(recycler);
        }
        int i3 = this.X;
        int i4 = this.f19174Y;
        int i5 = this.Z;
        int i6 = i3 + i2;
        if (i6 < i4) {
            i2 = i4 - i3;
        } else if (i6 > i5) {
            i2 = i5 - i3;
        }
        this.X = i3 + i2;
        z(this.g0);
        float f = this.h0.f19188a / 2.0f;
        float fI = i(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f2 = r() ? this.h0.c().f19198b : this.h0.a().f19198b;
        float f3 = Float.MAX_VALUE;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float fE = e(fI, f);
            KeylineRange keylineRangeP = p(this.h0.f19189b, fE, false);
            float fH = h(childAt, fE, keylineRangeP);
            super.getDecoratedBoundsWithMargins(childAt, rect);
            y(childAt, fE, keylineRangeP);
            this.k0.l(childAt, rect, f, fH);
            float fAbs = Math.abs(f2 - fH);
            if (fAbs < f3) {
                this.n0 = getPosition(childAt);
                f3 = fAbs;
            }
            fI = e(fI, this.h0.f19188a);
        }
        j(recycler, state);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(View view, float f, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.f19181a;
            float f2 = keyline.f19199c;
            KeylineState.Keyline keyline2 = keylineRange.f19182b;
            float fB = AnimationUtils.b(f2, keyline2.f19199c, keyline.f19197a, keyline2.f19197a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFC = this.k0.c(height, width, AnimationUtils.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), AnimationUtils.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fH = h(view, f, keylineRange);
            RectF rectF = new RectF(fH - (rectFC.width() / 2.0f), fH - (rectFC.height() / 2.0f), (rectFC.width() / 2.0f) + fH, (rectFC.height() / 2.0f) + fH);
            RectF rectF2 = new RectF(this.k0.f(), this.k0.i(), this.k0.g(), this.k0.d());
            this.f0.getClass();
            this.k0.a(rectFC, rectF, rectF2);
            this.k0.k(rectFC, rectF, rectF2);
            ((Maskable) view).setMaskRectF(rectFC);
        }
    }

    public final void z(KeylineStateList keylineStateList) {
        int i2 = this.Z;
        int i3 = this.f19174Y;
        if (i2 <= i3) {
            this.h0 = r() ? keylineStateList.a() : keylineStateList.c();
        } else {
            this.h0 = keylineStateList.b(this.X, i3, i2, false);
        }
        List list = this.h0.f19189b;
        DebugItemDecoration debugItemDecoration = this.e0;
        debugItemDecoration.getClass();
        debugItemDecoration.f19180b = Collections.unmodifiableList(list);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.e0 = new DebugItemDecoration();
        this.i0 = 0;
        this.l0 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                CarouselLayoutManager carouselLayoutManager = this.X;
                if (i4 == i8 && i5 == i9 && i6 == i10 && i7 == i11) {
                    return;
                }
                view.post(new c0.a(carouselLayoutManager, 18));
            }
        };
        this.n0 = -1;
        this.o0 = 0;
        this.f0 = new MultiBrowseCarouselStrategy();
        w();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f19069e);
            this.o0 = typedArrayObtainStyledAttributes.getInt(0, 0);
            w();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
