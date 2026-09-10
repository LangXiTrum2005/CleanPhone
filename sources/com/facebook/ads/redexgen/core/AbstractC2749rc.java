package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2749rc {
    public static int A00(byte value) {
        return value & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}
