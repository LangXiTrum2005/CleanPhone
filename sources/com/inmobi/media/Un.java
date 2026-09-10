package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Un {
    public static final boolean a(View adView, C3392z5 minDimension) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (adView.getVisibility() == 0 && adView.getParent() != null && adView.isShown() && adView.getWidth() >= minDimension.a && adView.getHeight() >= minDimension.b) {
            if (adView.getHeight() * adView.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(View adView, Rect adViewRect, int i, C3392z5 minDimension) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (a(adView, minDimension)) {
            return ((long) 100) * (((long) adViewRect.height()) * ((long) adViewRect.width())) >= ((long) (i * (adView.getHeight() * adView.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    public static final boolean a(View adView, Rect adViewRect, int i, List friendlyViews) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        float height = (i / 100.0f) * adView.getHeight() * adView.getWidth();
        View view = adView;
        while (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            Intrinsics.competently(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            Iterable iterableMonoploid = wireman.monoploid(viewGroup.indexOfChild(view) + 1, viewGroup.getChildCount());
            if (!(iterableMonoploid instanceof Collection) || !((Collection) iterableMonoploid).isEmpty()) {
                Iterator it = iterableMonoploid.iterator();
                while (it.hasNext()) {
                    View childAt = viewGroup.getChildAt(((kattegat) it).nextInt());
                    if (childAt.getVisibility() == 0) {
                        Intrinsics.beachfront(childAt);
                        if (friendlyViews.contains(childAt)) {
                            continue;
                        } else {
                            Rect rect = new Rect();
                            childAt.getGlobalVisibleRect(rect);
                            Rect rect2 = new Rect();
                            boolean intersect = rect2.setIntersect(adViewRect, rect);
                            Intrinsics.checkNotNullParameter(adViewRect, "<this>");
                            int i2 = (adViewRect.bottom - adViewRect.top) * (adViewRect.right - adViewRect.left);
                            Intrinsics.checkNotNullParameter(rect2, "<this>");
                            int i3 = i2 - ((rect2.bottom - rect2.top) * (rect2.right - rect2.left));
                            if (intersect && i3 < height) {
                                Intrinsics.checkNotNullParameter(childAt, "<this>");
                                if (childAt.getAlpha() > 0.3f) {
                                    if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                        if (childAt.getBackground() instanceof ColorDrawable) {
                                            Drawable background = childAt.getBackground();
                                            Intrinsics.competently(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) background).getColor() == 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else if (childAt.getBackground() == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (childAt.getForeground() instanceof ColorDrawable) {
                                            Drawable foreground = childAt.getForeground();
                                            Intrinsics.competently(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) foreground).getColor() == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else if (childAt.getForeground() == null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z || !z2) {
                                        }
                                    }
                                    return false;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            view = viewGroup;
        }
        return true;
    }
}
