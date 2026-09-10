package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafz {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzafz(int i2, byte[] bArr, int i3, int i4) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zza == zzafzVar.zza && this.zzc == zzafzVar.zzc && this.zzd == zzafzVar.zzd && Arrays.equals(this.zzb, zzafzVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i2 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
