package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhri extends zzhtu {
    private final zzhre zza;
    private final ECPoint zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhri(zzhre zzhreVar, ECPoint eCPoint, zzhxc zzhxcVar, Integer num, byte[] bArr) {
        this.zza = zzhreVar;
        this.zzb = eCPoint;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhrh zzc() {
        return new zzhrh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhtu, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhtu
    public final zzhxc zze() {
        return this.zzc;
    }

    public final zzhre zzf() {
        return this.zza;
    }
}
