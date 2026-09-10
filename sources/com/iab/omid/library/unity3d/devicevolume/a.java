package com.iab.omid.library.unity3d.devicevolume;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public float a(int i10, int i11) {
        if (i11 <= 0 || i10 <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = i10 / i11;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }
}
