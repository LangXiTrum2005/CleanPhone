package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbl extends zzhbe {
    private final zzhbt zza;
    private final zzhxe zzb;
    private final zzhxe zzc;
    private final zzhxc zzd;

    @Nullable
    private final Integer zze;

    public /* synthetic */ zzhbl(zzhbt zzhbtVar, zzhxe zzhxeVar, zzhxe zzhxeVar2, zzhxc zzhxcVar, Integer num, byte[] bArr) {
        this.zza = zzhbtVar;
        this.zzb = zzhxeVar;
        this.zzc = zzhxeVar2;
        this.zzd = zzhxcVar;
        this.zze = num;
    }

    public static zzhbk zzd() {
        return new zzhbk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final zzhxc zzc() {
        return this.zzd;
    }

    public final zzhxe zze() {
        return this.zzb;
    }

    public final zzhxe zzf() {
        return this.zzc;
    }

    public final zzhbt zzg() {
        return this.zza;
    }
}
