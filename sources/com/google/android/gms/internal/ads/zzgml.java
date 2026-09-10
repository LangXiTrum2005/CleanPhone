package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgml {
    public static final zzgvo zza = zzgvo.zzb(new byte[0]);

    public static final zzgvo zza(int i) {
        return zzgvo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzgvo zzb(int i) {
        return zzgvo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
