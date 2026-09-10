package com.bytedance.sdk.openadsdk.core.mo;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
public class tvp {
    public static int qdl(int i2) {
        return ((i2 & 3) == 3 || (i2 & 5) == 5) ? i2 | 8388608 : i2;
    }

    private static ViewGroup.LayoutParams ud(View view, ViewGroup.LayoutParams layoutParams) {
        ViewParent parent;
        ViewGroup.LayoutParams layoutParams2;
        if (view == null || layoutParams == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (!(parent instanceof LinearLayout)) {
            layoutParams2 = null;
        } else {
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        }
        if (parent instanceof RelativeLayout) {
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new RelativeLayout.LayoutParams(layoutParams);
        }
        if (!(parent instanceof FrameLayout)) {
            return layoutParams2;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return null;
        }
        return new FrameLayout.LayoutParams(layoutParams);
    }

    private static void qdl(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
            marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = qdl(layoutParams2.gravity);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = qdl(layoutParams3.gravity);
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
            int[] rules = layoutParams4.getRules();
            if (rules[9] != 0) {
                layoutParams4.addRule(20);
            }
            if (rules[11] != 0) {
                layoutParams4.addRule(21);
            }
            int i2 = rules[0];
            if (i2 != 0) {
                layoutParams4.addRule(16, i2);
            }
            int i3 = rules[1];
            if (i3 != 0) {
                layoutParams4.addRule(17, i3);
            }
            int i4 = rules[5];
            if (i4 != 0) {
                layoutParams4.addRule(18, i4);
            }
            int i5 = rules[7];
            if (i5 != 0) {
                layoutParams4.addRule(19, i5);
            }
        }
    }

    public static ViewGroup.LayoutParams qdl(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsUd = ud(view, layoutParams);
        if (layoutParamsUd != null) {
            layoutParams = layoutParamsUd;
        }
        qdl(layoutParams);
        return layoutParams;
    }
}
