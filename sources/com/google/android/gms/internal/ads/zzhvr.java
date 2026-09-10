package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvr {
    private final byte[] zza;
    private final byte[] zzb;

    private zzhvr(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzhvr zzc() throws GeneralSecurityException {
        byte[] bArrZza = zzhkc.zza(32);
        if (bArrZza.length == 32) {
            return new zzhvr(zzhhm.zza(zzhhm.zzb(bArrZza)), bArrZza);
        }
        throw new IllegalArgumentException("Given secret seed length is not 32");
    }

    public final byte[] zza() {
        return Arrays.copyOf(this.zza, 32);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
