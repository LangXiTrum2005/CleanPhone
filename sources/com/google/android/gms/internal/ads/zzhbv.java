package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbv extends zzhbe {
    private final zzhcb zza;
    private final zzhxe zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhbv(zzhcb zzhcbVar, zzhxe zzhxeVar, zzhxc zzhxcVar, Integer num, byte[] bArr) {
        this.zza = zzhcbVar;
        this.zzb = zzhxeVar;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhbu zzd() {
        return new zzhbu(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final zzhxc zzc() {
        return this.zzc;
    }

    public final zzhxe zze() {
        return this.zzb;
    }

    public final zzhcb zzf() {
        return this.zza;
    }
}
