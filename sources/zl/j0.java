package zl;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum j0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(d.f55026a),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55065a;

    j0(Object obj) {
        this.f55065a = obj;
    }
}
