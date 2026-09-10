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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class P4 implements W4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23065a;

    @Override // com.inmobi.media.ff
    public final boolean a(View view, View view2, int i2, Object obj) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = view2 instanceof GestureDetectorOnGestureListenerC3005ec ? (GestureDetectorOnGestureListenerC3005ec) view2 : null;
                if (gestureDetectorOnGestureListenerC3005ec == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC3005ec.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC3005ec.getHeight() <= 0 || gestureDetectorOnGestureListenerC3005ec.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!gestureDetectorOnGestureListenerC3005ec.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f23065a = ((long) rect.height()) * ((long) rect.width());
                if (gestureDetectorOnGestureListenerC3005ec.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC3005ec.setConfiguredArea(gestureDetectorOnGestureListenerC3005ec.getHeight() * gestureDetectorOnGestureListenerC3005ec.getWidth());
                }
                if (gestureDetectorOnGestureListenerC3005ec.getArea() > 0) {
                    if (((long) 100) * this.f23065a >= gestureDetectorOnGestureListenerC3005ec.getConfiguredArea() * ((long) i2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    @Override // com.inmobi.media.ff
    public final boolean a(View rootView, View adView, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.f(rootView, "rootView");
        Intrinsics.f(adView, "adView");
        ViewParent parent = rootView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z6 = viewGroup == null || a(viewGroup, adView, i2);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int iIndexOfChild = viewGroup.indexOfChild(rootView) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                View childAt = viewGroup.getChildAt(iIndexOfChild);
                Intrinsics.e(childAt, "getChildAt(...)");
                if (childAt.getVisibility() == 0) {
                    if (adView instanceof GestureDetectorOnGestureListenerC3005ec) {
                        if (!(childAt instanceof C3287w7)) {
                            if (!(childAt instanceof C3117lc)) {
                                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) adView;
                                Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC3005ec.getFriendlyViews();
                                if (!(friendlyViews != null ? friendlyViews.containsKey(childAt) : false)) {
                                    Rect rect = new Rect();
                                    adView.getGlobalVisibleRect(rect);
                                    Rect rect2 = new Rect();
                                    childAt.getGlobalVisibleRect(rect2);
                                    Rect rect3 = new Rect();
                                    boolean intersect = rect3.setIntersect(rect, rect2);
                                    int i3 = ((rect.bottom - rect.top) * (rect.right - rect.left)) - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                    float configuredArea = (i2 / 100) * gestureDetectorOnGestureListenerC3005ec.getConfiguredArea();
                                    if (intersect && i3 < configuredArea) {
                                        if (childAt.getAlpha() > 0.3f) {
                                            if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                                if (childAt.getBackground() instanceof ColorDrawable) {
                                                    Drawable background = childAt.getBackground();
                                                    Intrinsics.d(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) background).getColor() == 0) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                } else if (childAt.getBackground() == null) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (childAt.getForeground() instanceof ColorDrawable) {
                                                    Drawable foreground = childAt.getForeground();
                                                    Intrinsics.d(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) foreground).getColor() == 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                } else if (childAt.getForeground() == null) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z4 && z5) {
                                                    z3 = true;
                                                }
                                            }
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        if (!z3) {
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return false;
                    }
                }
            }
        }
        return z6;
    }
}
