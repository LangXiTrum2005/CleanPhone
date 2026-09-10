package com.smartdigimkt.v0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38963a = "ViewUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f38964b = false;

    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab A[SYNTHETIC] */
    public static boolean a(View view, int i2) {
        if (view.getVisibility() != 0) {
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            return true;
        }
        Rect rect = new Rect();
        if (!(view.getGlobalVisibleRect(rect) && ((((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) > (((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * (i2 == 1 ? 0.0f : 0.5f)) ? 1 : (((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) == (((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * (i2 == 1 ? 0.0f : 0.5f)) ? 0 : -1)) >= 0))) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int iA = a(view2, viewGroup) + 1; iA < viewGroup.getChildCount(); iA++) {
                View childAt = viewGroup.getChildAt(iA);
                if (childAt.getVisibility() == 0 && a(view, childAt)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            boolean zB = b(view, viewGroup2);
                            f38964b = false;
                            if (zB) {
                                return true;
                            }
                        } else if (a(childAt)) {
                            return true;
                        }
                    } else if (a(childAt)) {
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        return false;
    }

    private static boolean b(View view, ViewGroup viewGroup) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0 && a(view, childAt)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    f38964b = true;
                }
                if (a(childAt)) {
                    f38964b = true;
                }
                if (f38964b) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    b(view, (ViewGroup) childAt);
                }
            }
        }
        return f38964b;
    }

    public static boolean a(View view) {
        return view.getAlpha() > 0.5f && view.getBackground() != null && view.getBackground().getAlpha() > 127;
    }

    private static boolean a(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (Rect.intersects(rect, rect2)) {
            return ((Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)) * (Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left))) * 2 >= view.getMeasuredWidth() * view.getMeasuredHeight();
        }
        return false;
    }

    private static int a(View view, ViewGroup viewGroup) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount() && viewGroup.getChildAt(i2) != view) {
            i2++;
        }
        return i2;
    }
}
