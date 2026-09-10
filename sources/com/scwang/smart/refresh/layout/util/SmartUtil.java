package com.scwang.smart.refresh.layout.util;

import android.content.res.Resources;
import android.graphics.PointF;
import android.support.v4.media.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.viewpager.widget.ViewPager;
import com.charging.screenshow.battery.animations.themes.R;
import com.scwang.smart.refresh.layout.api.RefreshComponent;

/* JADX INFO: loaded from: classes5.dex */
public class SmartUtil implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f33556a = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f33557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f33558c;

    static {
        float fH = 1.0f / h(1.0f);
        f33557b = fH;
        f33558c = 1.0f - (h(1.0f) * fH);
    }

    public static boolean a(View view, PointF pointF, boolean z2) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !e(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (f(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(R.id.srl_tag);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean zA = a(childAt, pointF, z2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return zA;
                }
            }
        }
        return z2 || view.canScrollVertically(-1);
    }

    public static boolean b(View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (f(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(R.id.srl_tag);
                if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean zB = b(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zB;
            }
        }
        return true;
    }

    public static int c(float f) {
        return (int) ((f * f33556a) + 0.5f);
    }

    public static boolean d(View view) {
        if (view instanceof RefreshComponent) {
            return false;
        }
        return e(view) || (view instanceof ViewPager) || (view instanceof NestedScrollingParent);
    }

    public static boolean e(View view) {
        if (view instanceof RefreshComponent) {
            return false;
        }
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof ScrollingView) || (view instanceof WebView) || (view instanceof NestedScrollingChild);
    }

    public static boolean f(View view, View view2, float f, float f2, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f, f2};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f3 = fArr[0];
        boolean z2 = f3 >= 0.0f && scrollY >= 0.0f && f3 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z2) {
            pointF.set(fArr[0] - f, fArr[1] - f2);
        }
        return z2;
    }

    public static int g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i2 = layoutParams.height;
        view.measure(childMeasureSpec, i2 > 0 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static float h(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : a.a(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fH = h(f) * f33557b;
        return fH > 0.0f ? fH + f33558c : fH;
    }
}
