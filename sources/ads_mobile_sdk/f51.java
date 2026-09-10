package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import complexometry.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f51 {
    public final hj1 a;
    public final adultoid b;
    public final boolean c;

    public f51(hj1 nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.a = nativeAdAssets;
        adultoid adultoidVar = nativeAdAssets.m;
        this.b = adultoidVar;
        this.c = adultoidVar != null;
    }

    public final float a() {
        Float fValueOf;
        Drawable drawable;
        int i;
        ia3 ia3VarE;
        int i2;
        hj1 hj1Var = this.a;
        float f = hj1Var.s;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        er0 er0Var = hj1Var.l;
        if (er0Var != null) {
            return er0Var.a();
        }
        gq0 gq0Var = hj1Var.j;
        if (gq0Var != null && (i2 = (ia3VarE = gq0Var.e()).c) > 0) {
            return ia3VarE.b / i2;
        }
        g61 g61Var = this.a.f;
        if (g61Var != null) {
            int i3 = g61Var.d;
            fValueOf = Float.valueOf((i3 == -1 || (i = g61Var.e) == -1) ? 0.0f : i3 / i);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null && !Intrinsics.saneness(fValueOf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return fValueOf.floatValue();
        }
        g61 g61Var2 = this.a.f;
        if (g61Var2 != null && (drawable = g61Var2.a) != null) {
            Intrinsics.checkNotNullParameter(drawable, "<this>");
            if (drawable.getIntrinsicWidth() != -1 && drawable.getIntrinsicHeight() != -1) {
                return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float b() {
        float f;
        er0 er0Var = this.a.l;
        if (er0Var == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        synchronized (er0Var.f) {
            f = er0Var.g;
        }
        return f;
    }

    public final float c() {
        float f;
        er0 er0Var = this.a.l;
        if (er0Var == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        synchronized (er0Var.f) {
            f = er0Var.c;
        }
        return f;
    }

    public final boolean d() {
        return this.c;
    }

    public final Drawable e() {
        g61 g61Var = this.a.f;
        if (g61Var != null) {
            return g61Var.a;
        }
        return null;
    }

    public final adultoid f() {
        return this.b;
    }
}
