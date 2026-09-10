package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbk {

    @Nullable
    private zzhbt zza = null;

    @Nullable
    private zzhxe zzb = null;

    @Nullable
    private zzhxe zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzhbk() {
    }

    public final zzhbk zza(zzhbt zzhbtVar) {
        this.zza = zzhbtVar;
        return this;
    }

    public final zzhbk zzb(zzhxe zzhxeVar) {
        this.zzb = zzhxeVar;
        return this;
    }

    public final zzhbk zzc(zzhxe zzhxeVar) {
        this.zzc = zzhxeVar;
        return this;
    }

    public final zzhbk zzd(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzhbl zze() throws GeneralSecurityException {
        zzhxc zzhxcVarZzb;
        zzhbt zzhbtVar = this.zza;
        if (zzhbtVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzhxe zzhxeVar = this.zzb;
        if (zzhxeVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzhbtVar.zzc() != zzhxeVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzhbtVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzhbs.zzc) {
            zzhxcVarZzb = zzhjf.zza;
        } else if (this.zza.zzg() == zzhbs.zzb) {
            zzhxcVarZzb = zzhjf.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzhbs.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzhxcVarZzb = zzhjf.zzb(this.zzd.intValue());
        }
        return new zzhbl(this.zza, this.zzb, this.zzc, zzhxcVarZzb, this.zzd, null);
    }

    public /* synthetic */ zzhbk(byte[] bArr) {
    }
}
