package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes4.dex */
final class zzapb extends zzaea {
    public zzapb(zzfg zzfgVar, long j, long j2) {
        super(new zzadv(), new zzapa(zzfgVar, null), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static /* synthetic */ int zzh(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
