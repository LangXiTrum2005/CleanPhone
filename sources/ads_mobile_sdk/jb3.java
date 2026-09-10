package ads_mobile_sdk;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum jb3 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(kn.b),
    ENUM(null),
    MESSAGE(null);

    public final Object a;

    jb3(Serializable serializable) {
    }
}
