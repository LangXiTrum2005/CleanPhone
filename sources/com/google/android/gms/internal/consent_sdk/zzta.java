package com.google.android.gms.internal.consent_sdk;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzta {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzpm.zzb),
    ENUM(null),
    MESSAGE(null);

    zzta(Object obj) {
    }
}
