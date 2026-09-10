package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkz extends zzhlk {
    private final zzhli zza;
    private final zzhxe zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhkz(zzhli zzhliVar, zzhxe zzhxeVar, zzhxc zzhxcVar, Integer num, byte[] bArr) {
        this.zza = zzhliVar;
        this.zzb = zzhxeVar;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhky zzc() {
        return new zzhky(null);
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

    public final zzhli zzf() {
        return this.zza;
    }
}
