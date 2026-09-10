package supplicat;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: GeometryUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "digits", "", "attabal", "(FI)Ljava/lang/String;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class dern {
    public static final String attabal(float f, int i) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i2 = (int) f2;
        if (f2 - i2 >= 0.5f) {
            i2++;
        }
        float f3 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }
}
