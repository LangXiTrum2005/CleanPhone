package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjz implements zzhke {
    private final String zza;
    private final zzhxc zzb;
    private final zzhzl zzc;
    private final zzhoz zzd;
    private final zzhpw zze;

    @Nullable
    private final Integer zzf;

    private zzhjz(String str, zzhxc zzhxcVar, zzhzl zzhzlVar, zzhoz zzhozVar, zzhpw zzhpwVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzhxcVar;
        this.zzc = zzhzlVar;
        this.zzd = zzhozVar;
        this.zze = zzhpwVar;
        this.zzf = num;
    }

    public static zzhjz zza(String str, zzhzl zzhzlVar, zzhoz zzhozVar, zzhpw zzhpwVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzhpwVar == zzhpw.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzhjz(str, zzhkl.zzb(str), zzhzlVar, zzhozVar, zzhpwVar, num);
    }

    public final zzhzl zzb() {
        return this.zzc;
    }

    public final zzhoz zzc() {
        return this.zzd;
    }

    public final zzhpw zzd() {
        return this.zze;
    }

    @Nullable
    public final Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhke
    public final zzhxc zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zza;
    }
}
