package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cc f13129d = new cc(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13132c;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public cc(float f10, float f11) {
        ps1.v(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ps1.v(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f13130a = f10;
        this.f13131b = f11;
        this.f13132c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cc.class == obj.getClass()) {
            cc ccVar = (cc) obj;
            if (this.f13130a == ccVar.f13130a && this.f13131b == ccVar.f13131b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f13131b) + ((Float.floatToRawIntBits(this.f13130a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f13130a), Float.valueOf(this.f13131b)};
        String str = uu0.f20901a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
