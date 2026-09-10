package com.google.android.gms.internal.play_billing;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzfw {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzbq.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzfw(Object obj) {
        this.zzk = obj;
    }
}
