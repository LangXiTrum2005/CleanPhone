package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcl {

    @Nullable
    private zzhct zza = null;

    @Nullable
    private zzhxe zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhcl() {
    }

    public final zzhcl zza(zzhct zzhctVar) {
        this.zza = zzhctVar;
        return this;
    }

    public final zzhcl zzb(zzhxe zzhxeVar) {
        this.zzb = zzhxeVar;
        return this;
    }

    public final zzhcl zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhcm zzd() throws GeneralSecurityException {
        zzhxe zzhxeVar;
        zzhxc zzhxcVarZzb;
        zzhct zzhctVar = this.zza;
        if (zzhctVar == null || (zzhxeVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhctVar.zzc() != zzhxeVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhctVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhcs.zzc) {
            zzhxcVarZzb = zzhjf.zza;
        } else if (this.zza.zzd() == zzhcs.zzb) {
            zzhxcVarZzb = zzhjf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhcs.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzhxcVarZzb = zzhjf.zzb(this.zzc.intValue());
        }
        return new zzhcm(this.zza, this.zzb, zzhxcVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhcl(byte[] bArr) {
    }
}
