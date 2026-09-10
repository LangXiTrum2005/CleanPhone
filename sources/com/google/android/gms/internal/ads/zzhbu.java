package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbu {

    @Nullable
    private zzhcb zza = null;

    @Nullable
    private zzhxe zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhbu() {
    }

    public final zzhbu zza(zzhcb zzhcbVar) {
        this.zza = zzhcbVar;
        return this;
    }

    public final zzhbu zzb(zzhxe zzhxeVar) {
        this.zzb = zzhxeVar;
        return this;
    }

    public final zzhbu zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhbv zzd() throws GeneralSecurityException {
        zzhxe zzhxeVar;
        zzhxc zzhxcVarZzb;
        zzhcb zzhcbVar = this.zza;
        if (zzhcbVar == null || (zzhxeVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhcbVar.zzc() != zzhxeVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhcbVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhca.zzc) {
            zzhxcVarZzb = zzhjf.zza;
        } else if (this.zza.zze() == zzhca.zzb) {
            zzhxcVarZzb = zzhjf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhca.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhxcVarZzb = zzhjf.zzb(this.zzc.intValue());
        }
        return new zzhbv(this.zza, this.zzb, zzhxcVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhbu(byte[] bArr) {
    }
}
