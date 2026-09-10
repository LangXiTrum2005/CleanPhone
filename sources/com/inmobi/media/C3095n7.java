package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3095n7 {
    public long a;

    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    public final boolean a(View rootView, View adView, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(adView, "adView");
        ViewParent parent = rootView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z5 = viewGroup == null || a(viewGroup, adView, i);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int iIndexOfChild = viewGroup.indexOfChild(rootView) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                View childAt = viewGroup.getChildAt(iIndexOfChild);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt.getVisibility() == 0) {
                    if (adView instanceof GestureDetectorOnGestureListenerC2829ci) {
                        if (!(childAt instanceof C2976ic)) {
                            if (!(childAt instanceof C3031ki)) {
                                GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) adView;
                                Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC2829ci.getFriendlyViews();
                                if (!(friendlyViews != null ? friendlyViews.containsKey(childAt) : false)) {
                                    Rect rect = new Rect();
                                    adView.getGlobalVisibleRect(rect);
                                    Rect rect2 = new Rect();
                                    childAt.getGlobalVisibleRect(rect2);
                                    Rect rect3 = new Rect();
                                    boolean intersect = rect3.setIntersect(rect, rect2);
                                    Intrinsics.checkNotNullParameter(rect, "<this>");
                                    int i2 = (rect.bottom - rect.top) * (rect.right - rect.left);
                                    Intrinsics.checkNotNullParameter(rect3, "<this>");
                                    int i3 = i2 - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                    float configuredArea = (i / 100) * gestureDetectorOnGestureListenerC2829ci.getConfiguredArea();
                                    if (intersect && i3 < configuredArea) {
                                        if (childAt.getAlpha() > 0.3f) {
                                            if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                                if (childAt.getBackground() instanceof ColorDrawable) {
                                                    Drawable background = childAt.getBackground();
                                                    Intrinsics.competently(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) background).getColor() == 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } else if (childAt.getBackground() == null) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (childAt.getForeground() instanceof ColorDrawable) {
                                                    Drawable foreground = childAt.getForeground();
                                                    Intrinsics.competently(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) foreground).getColor() == 0) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                } else if (childAt.getForeground() == null) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z3 && z4) {
                                                    z2 = true;
                                                }
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (!z2) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return false;
                    }
                }
            }
        }
        return z5;
    }

    public final boolean b(View view, View view2, int i) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = view2 instanceof GestureDetectorOnGestureListenerC2829ci ? (GestureDetectorOnGestureListenerC2829ci) view2 : null;
                if (gestureDetectorOnGestureListenerC2829ci == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC2829ci.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC2829ci.getHeight() <= 0 || gestureDetectorOnGestureListenerC2829ci.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!gestureDetectorOnGestureListenerC2829ci.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.a = ((long) rect.height()) * ((long) rect.width());
                if (gestureDetectorOnGestureListenerC2829ci.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC2829ci.setConfiguredArea(gestureDetectorOnGestureListenerC2829ci.getHeight() * gestureDetectorOnGestureListenerC2829ci.getWidth());
                }
                if (gestureDetectorOnGestureListenerC2829ci.getArea() > 0) {
                    if (((long) 100) * this.a >= gestureDetectorOnGestureListenerC2829ci.getConfiguredArea() * ((long) i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
