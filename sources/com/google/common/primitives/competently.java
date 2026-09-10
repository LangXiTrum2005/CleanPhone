package com.google.common.primitives;

import com.google.common.base.formularize;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: UnsignedBytes.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently {
    public static byte attabal(long j) {
        formularize.taiyuan((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static int saneness(byte b) {
        return b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }
}
