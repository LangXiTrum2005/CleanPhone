package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcc {

    @Nullable
    private zzhck zza = null;

    @Nullable
    private zzhxe zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhcc() {
    }

    public final zzhcc zza(zzhck zzhckVar) {
        this.zza = zzhckVar;
        return this;
    }

    public final zzhcc zzb(zzhxe zzhxeVar) {
        this.zzb = zzhxeVar;
        return this;
    }

    public final zzhcc zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhcd zzd() throws GeneralSecurityException {
        zzhxe zzhxeVar;
        zzhxc zzhxcVarZzb;
        zzhck zzhckVar = this.zza;
        if (zzhckVar == null || (zzhxeVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhckVar.zzc() != zzhxeVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhckVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhcj.zzc) {
            zzhxcVarZzb = zzhjf.zza;
        } else if (this.zza.zzd() == zzhcj.zzb) {
            zzhxcVarZzb = zzhjf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhcj.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzhxcVarZzb = zzhjf.zzb(this.zzc.intValue());
        }
        return new zzhcd(this.zza, this.zzb, zzhxcVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhcc(byte[] bArr) {
    }
}
