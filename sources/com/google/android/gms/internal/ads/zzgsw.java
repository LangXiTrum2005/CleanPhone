package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsw {
    public static int zza(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
