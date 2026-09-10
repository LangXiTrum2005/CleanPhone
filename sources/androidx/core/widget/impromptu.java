package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: EdgeEffectCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final EdgeEffect f9509attabal;

    /* JADX INFO: compiled from: EdgeEffectCompat.java */
    public static class attabal {
        public static void attabal(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: compiled from: EdgeEffectCompat.java */
    public static class saneness {
        public static EdgeEffect attabal(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float dern(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        public static float saneness(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
    }

    @Deprecated
    public impromptu(Context context) {
        this.f9509attabal = new EdgeEffect(context);
    }

    public static EdgeEffect attabal(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? saneness.attabal(context, attributeSet) : new EdgeEffect(context);
    }

    public static void dern(EdgeEffect edgeEffect, float f, float f2) {
        attabal.attabal(edgeEffect, f, f2);
    }

    public static float saneness(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? saneness.saneness(edgeEffect) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static float wireman(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return saneness.dern(edgeEffect, f, f2);
        }
        dern(edgeEffect, f, f2);
        return f;
    }
}
