package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjf {
    public static final zzhxc zza = zzhxc.zza(new byte[0]);

    public static final zzhxc zza(int i2) {
        return zzhxc.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i2).array());
    }

    public static final zzhxc zzb(int i2) {
        return zzhxc.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i2).array());
    }
}
