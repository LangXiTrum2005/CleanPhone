package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtm extends zzhtu {
    private final zzhti zza;
    private final BigInteger zzb;
    private final zzhxc zzc;

    @Nullable
    private final Integer zzd;

    public /* synthetic */ zzhtm(zzhti zzhtiVar, BigInteger bigInteger, zzhxc zzhxcVar, Integer num, byte[] bArr) {
        this.zza = zzhtiVar;
        this.zzb = bigInteger;
        this.zzc = zzhxcVar;
        this.zzd = num;
    }

    public static zzhtl zzc() {
        return new zzhtl(null);
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

    public final zzhti zzf() {
        return this.zza;
    }
}
