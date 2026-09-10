package com.google.android.material.elevation;

import android.content.Context;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes4.dex */
public class ElevationOverlayProvider {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19280c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19281e;

    public ElevationOverlayProvider(Context context) {
        boolean zB = MaterialAttributes.b(context, R.attr.elevationOverlayEnabled, false);
        int iC = MaterialColors.c(context, R.attr.elevationOverlayColor, 0);
        int iC2 = MaterialColors.c(context, R.attr.elevationOverlayAccentColor, 0);
        int iC3 = MaterialColors.c(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f19278a = zB;
        this.f19279b = iC;
        this.f19280c = iC2;
        this.d = iC3;
        this.f19281e = f2;
    }
}
