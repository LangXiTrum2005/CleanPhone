package com.inmobi.media;

import android.graphics.Point;
import android.graphics.RectF;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class H extends Af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f22853a;

    public H(I i2) {
        this.f22853a = i2;
    }

    @Override // com.inmobi.media.Af
    public final void a(WindowInsets insets) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        Intrinsics.f(insets, "insets");
        if (L3.f22938a.A()) {
            RoundedCorner roundedCorner = insets.getRoundedCorner(0);
            int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
            RoundedCorner roundedCorner2 = insets.getRoundedCorner(1);
            int radius2 = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            RoundedCorner roundedCorner3 = insets.getRoundedCorner(2);
            int radius3 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            RoundedCorner roundedCorner4 = insets.getRoundedCorner(3);
            int radius4 = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
            RoundedCorner roundedCorner5 = insets.getRoundedCorner(0);
            RectF rectF4 = null;
            Point center = roundedCorner5 != null ? roundedCorner5.getCenter() : null;
            RoundedCorner roundedCorner6 = insets.getRoundedCorner(1);
            Point center2 = roundedCorner6 != null ? roundedCorner6.getCenter() : null;
            RoundedCorner roundedCorner7 = insets.getRoundedCorner(2);
            Point center3 = roundedCorner7 != null ? roundedCorner7.getCenter() : null;
            RoundedCorner roundedCorner8 = insets.getRoundedCorner(3);
            Point center4 = roundedCorner8 != null ? roundedCorner8.getCenter() : null;
            if (radius <= 0 || center == null) {
                rectF = null;
            } else {
                int i2 = center.x;
                int i3 = center.y;
                rectF = new RectF(i2 - radius, i3 - radius, i2, i3);
            }
            if (radius2 <= 0 || center2 == null) {
                rectF2 = null;
            } else {
                int i4 = center2.x;
                int i5 = center2.y;
                rectF2 = new RectF(i4, i5 - radius, i4 + radius2, i5);
            }
            if (radius4 <= 0 || center4 == null) {
                rectF3 = null;
            } else {
                int i6 = center4.x;
                int i7 = center4.y;
                rectF3 = new RectF(i6 - radius4, i7, i6, i7 + radius4);
            }
            if (radius3 > 0 && center3 != null) {
                int i8 = center3.x;
                int i9 = center3.y;
                rectF4 = new RectF(i8, i9, i8 + radius3, i9 + radius3);
            }
            this.f22853a.g = new B(rectF, rectF2, rectF3, rectF4);
        }
    }
}
