package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkm {

    @Nullable
    private zzhku zza = null;

    @Nullable
    private zzhxe zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhkm() {
    }

    public final zzhkm zza(zzhku zzhkuVar) {
        this.zza = zzhkuVar;
        return this;
    }

    public final zzhkm zzb(zzhxe zzhxeVar) throws GeneralSecurityException {
        this.zzb = zzhxeVar;
        return this;
    }

    public final zzhkm zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhkn zzd() throws GeneralSecurityException {
        zzhxe zzhxeVar;
        zzhxc zzhxcVarZza;
        zzhku zzhkuVar = this.zza;
        if (zzhkuVar == null || (zzhxeVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhkuVar.zzc() != zzhxeVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhkuVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhkt.zzd) {
            zzhxcVarZza = zzhjf.zza;
        } else if (this.zza.zzf() == zzhkt.zzc || this.zza.zzf() == zzhkt.zzb) {
            zzhxcVarZza = zzhjf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhkt.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhxcVarZza = zzhjf.zzb(this.zzc.intValue());
        }
        return new zzhkn(this.zza, this.zzb, zzhxcVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhkm(byte[] bArr) {
    }
}
