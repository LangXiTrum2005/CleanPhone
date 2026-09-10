package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkn extends zzhlk {
    private final zzhku zza;
    private final zzhxe zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhkn(zzhku zzhkuVar, zzhxe zzhxeVar, zzhxc zzhxcVar, Integer num, byte[] bArr) {
        this.zza = zzhkuVar;
        this.zzb = zzhxeVar;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhkm zzc() {
        return new zzhkm(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhxe zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final zzhxc zze() {
        return this.zzc;
    }

    public final zzhku zzf() {
        return this.zza;
    }
}
