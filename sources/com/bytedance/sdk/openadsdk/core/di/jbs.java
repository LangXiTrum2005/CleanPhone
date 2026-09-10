package com.bytedance.sdk.openadsdk.core.di;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    private static ViewGroup.LayoutParams lr(View view, ViewGroup.LayoutParams layoutParams) {
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

    public static int ri(int i) {
        return ((i & 3) == 3 || (i & 5) == 5) ? i | 8388608 : i;
    }

    private static void ri(ViewGroup.LayoutParams layoutParams) {
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
            layoutParams2.gravity = ri(layoutParams2.gravity);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = ri(layoutParams3.gravity);
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
            int i = rules[0];
            if (i != 0) {
                layoutParams4.addRule(16, i);
            }
            int i2 = rules[1];
            if (i2 != 0) {
                layoutParams4.addRule(17, i2);
            }
            int i3 = rules[5];
            if (i3 != 0) {
                layoutParams4.addRule(18, i3);
            }
            int i4 = rules[7];
            if (i4 != 0) {
                layoutParams4.addRule(19, i4);
            }
        }
    }

    public static ViewGroup.LayoutParams ri(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsLr = lr(view, layoutParams);
        if (layoutParamsLr != null) {
            layoutParams = layoutParamsLr;
        }
        ri(layoutParams);
        return layoutParams;
    }
}
