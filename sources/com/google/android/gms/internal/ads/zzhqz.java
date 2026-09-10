package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqz {
    private zzhrc zza = null;
    private zzhra zzb = null;
    private zzhrb zzc = null;
    private zzhrd zzd = zzhrd.zzd;

    private zzhqz() {
    }

    public final zzhqz zza(zzhrc zzhrcVar) {
        this.zza = zzhrcVar;
        return this;
    }

    public final zzhqz zzb(zzhra zzhraVar) {
        this.zzb = zzhraVar;
        return this;
    }

    public final zzhqz zzc(zzhrb zzhrbVar) {
        this.zzc = zzhrbVar;
        return this;
    }

    public final zzhqz zzd(zzhrd zzhrdVar) {
        this.zzd = zzhrdVar;
        return this;
    }

    public final zzhre zze() throws GeneralSecurityException {
        zzhrc zzhrcVar = this.zza;
        if (zzhrcVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zzhra zzhraVar = this.zzb;
        if (zzhraVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        zzhrb zzhrbVar = this.zzc;
        if (zzhrbVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        zzhrd zzhrdVar = this.zzd;
        if (zzhrdVar == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (zzhraVar == zzhra.zza && zzhrbVar != zzhrb.zza) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zzhraVar == zzhra.zzb && zzhrbVar != zzhrb.zzb && zzhrbVar != zzhrb.zzc) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhraVar != zzhra.zzc || zzhrbVar == zzhrb.zzc) {
            return new zzhre(zzhrcVar, zzhraVar, zzhrbVar, zzhrdVar, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public /* synthetic */ zzhqz(byte[] bArr) {
    }
}
