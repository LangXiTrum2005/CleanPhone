package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f34107a = false;

    private static int a(View view, ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) == view) {
                return i10;
            }
        }
        return -1;
    }

    private static boolean a(View view, View view2, float f10) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (rect3.setIntersect(rect, rect2)) {
            int iHeight = rect3.height() * rect3.width();
            int iHeight2 = rect.height() * rect.width();
            int measuredHeight = view.getMeasuredHeight() * view.getMeasuredWidth();
            if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return iHeight2 < measuredHeight || iHeight >= measuredHeight;
            }
            float f11 = measuredHeight * f10;
            float f12 = iHeight;
            if (f12 >= f11) {
                return true;
            }
            int i10 = iHeight2 - iHeight;
            if (iHeight + i10 >= measuredHeight) {
                return f12 > f11;
            }
            if (i10 <= f11) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(View view, ViewGroup viewGroup, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            q0.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && a(view, childAt, f10)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    q0.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f34107a = true;
                }
                if (a(childAt)) {
                    q0.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f34107a = true;
                }
                if (f34107a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, f10);
                }
            }
        }
        return f34107a;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0129 A[SYNTHETIC] */
    public static boolean a(View view, int i10) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            q0.b("ViewUtils", "View Judge : View's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            q0.b("ViewUtils", "View Judge : View's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() == null) {
            q0.b("ViewUtils", "View Judge : view has no parent");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            q0.b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        float f10 = i10 == 1 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.5f;
        boolean z10 = ((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) > ((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * f10;
        boolean z11 = globalVisibleRect && z10;
        q0.b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z10);
        StringBuilder sb2 = new StringBuilder("View Judge : totalViewVisible is ");
        sb2.append(z11);
        q0.b("ViewUtils", sb2.toString());
        if (!z11) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iA = a(view2, viewGroup);
            for (int i11 = iA + 1; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    boolean zA = a(view, childAt, f10);
                    q0.b("ViewUtils", "View Judge : " + iA + "  intersects " + zA + " currentParent " + viewGroup + "currentView " + childAt);
                    if (!zA) {
                        continue;
                    } else if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            q0.b("ViewUtils", "View Judge : Covered by ViewGroup.");
                            boolean zA2 = a(view, viewGroup2, f10);
                            f34107a = false;
                            if (zA2) {
                                return true;
                            }
                        } else if (a(childAt)) {
                            q0.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                            return true;
                        }
                    } else if (a(childAt)) {
                        q0.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        q0.b("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    public static boolean a(View view) {
        if (view == null) {
            return true;
        }
        if (!((view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getAlpha() > 0.5f) {
            return view.getBackground() == null || view.getBackground().getAlpha() > 127;
        }
        return false;
    }
}
