package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhta extends zzhtu {
    private final zzhsw zza;
    private final BigInteger zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhta(zzhsw zzhswVar, BigInteger bigInteger, zzhxc zzhxcVar, Integer num, byte[] bArr) {
        this.zza = zzhswVar;
        this.zzb = bigInteger;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhsz zzc() {
        return new zzhsz(null);
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

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhtu
    public final zzhxc zze() {
        return this.zzc;
    }

    public final zzhsw zzf() {
        return this.zza;
    }
}
