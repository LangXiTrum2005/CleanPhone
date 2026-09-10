package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdp extends zzhbe {
    private final zzhdt zza;
    private final zzhxc zzb;

    @Nullable
    private final Integer zzc;

    private zzhdp(zzhdt zzhdtVar, zzhxc zzhxcVar, @Nullable Integer num) {
        this.zza = zzhdtVar;
        this.zzb = zzhxcVar;
        this.zzc = num;
    }

    public static zzhdp zzd(zzhdt zzhdtVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhxc zzhxcVarZzb;
        if (zzhdtVar.zzc() == zzhds.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzhxcVarZzb = zzhjf.zza;
        } else {
            if (zzhdtVar.zzc() != zzhds.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzhdtVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzhxcVarZzb = zzhjf.zzb(num.intValue());
        }
        return new zzhdp(zzhdtVar, zzhxcVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final zzhxc zzc() {
        return this.zzb;
    }

    public final zzhdt zze() {
        return this.zza;
    }
}
