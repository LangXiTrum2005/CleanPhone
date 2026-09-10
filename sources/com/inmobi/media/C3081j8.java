package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3081j8 extends ViewGroup {
    public C3081j8(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        Intrinsics.f(p2, "p");
        return p2 instanceof C3065i8;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        Intrinsics.f(p2, "p");
        return new C3065i8(p2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.d(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C3065i8 c3065i8 = (C3065i8) layoutParams;
                int i7 = c3065i8.f23692a;
                childAt.layout(i7, c3065i8.f23693b, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + c3065i8.f23693b);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChildren(i2, i3);
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.d(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C3065i8 c3065i8 = (C3065i8) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + c3065i8.f23692a;
                int measuredHeight = childAt.getMeasuredHeight() + c3065i8.f23693b;
                iMax2 = Math.max(iMax2, measuredWidth);
                iMax = Math.max(iMax, measuredHeight);
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(iMax2, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(iMax, getSuggestedMinimumHeight()), i3));
    }
}
