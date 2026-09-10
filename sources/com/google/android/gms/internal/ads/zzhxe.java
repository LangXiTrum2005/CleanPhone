package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxe {
    private final zzhxc zza;

    private zzhxe(zzhxc zzhxcVar) {
        this.zza = zzhxcVar;
    }

    public static zzhxe zza(byte[] bArr, zzhar zzharVar) {
        return new zzhxe(zzhxc.zza(bArr));
    }

    public static zzhxe zzb(int i2) {
        return new zzhxe(zzhxc.zza(zzhkc.zza(i2)));
    }

    public final byte[] zzc(zzhar zzharVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
