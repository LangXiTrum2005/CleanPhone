package ads_mobile_sdk;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum e91 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(kn.class, kn.b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object a;

    e91(Class cls, Serializable serializable) {
    }
}
