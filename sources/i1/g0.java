package i1;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f42543d = new g0(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42546c;

    static {
        l1.y.G(0);
        l1.y.G(1);
    }

    public g0(float f10) {
        this(f10, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f42544a == g0Var.f42544a && this.f42545b == g0Var.f42545b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f42545b) + ((Float.floatToRawIntBits(this.f42544a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f42544a), Float.valueOf(this.f42545b)};
        String str = l1.y.f44830a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public g0(float f10, float f11) {
        go.k.i(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        go.k.i(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f42544a = f10;
        this.f42545b = f11;
        this.f42546c = Math.round(f10 * 1000.0f);
    }
}
