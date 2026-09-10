package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhky {

    @Nullable
    private zzhli zza = null;

    @Nullable
    private zzhxe zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhky() {
    }

    public final zzhky zza(zzhli zzhliVar) {
        this.zza = zzhliVar;
        return this;
    }

    public final zzhky zzb(zzhxe zzhxeVar) {
        this.zzb = zzhxeVar;
        return this;
    }

    public final zzhky zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhkz zzd() throws GeneralSecurityException {
        zzhxe zzhxeVar;
        zzhxc zzhxcVarZza;
        zzhli zzhliVar = this.zza;
        if (zzhliVar == null || (zzhxeVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhliVar.zzc() != zzhxeVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhliVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhlh.zzd) {
            zzhxcVarZza = zzhjf.zza;
        } else if (this.zza.zzf() == zzhlh.zzc || this.zza.zzf() == zzhlh.zzb) {
            zzhxcVarZza = zzhjf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhlh.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzhxcVarZza = zzhjf.zzb(this.zzc.intValue());
        }
        return new zzhkz(this.zza, this.zzb, zzhxcVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhky(byte[] bArr) {
    }
}
