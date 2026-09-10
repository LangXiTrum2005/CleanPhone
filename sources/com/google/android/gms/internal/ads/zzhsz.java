package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhsz {

    @Nullable
    private zzhsw zza = null;

    @Nullable
    private BigInteger zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhsz() {
    }

    public final zzhsz zza(zzhsw zzhswVar) {
        this.zza = zzhswVar;
        return this;
    }

    public final zzhsz zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhsz zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhta zzd() throws GeneralSecurityException {
        zzhxc zzhxcVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            throw new GeneralSecurityException(p005e.a.a(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length()), iBitLength, "Got modulus size ", iZzc, ", but parameters requires modulus size "));
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhsv.zzd) {
            zzhxcVarZza = zzhjf.zza;
        } else if (this.zza.zze() == zzhsv.zzc || this.zza.zze() == zzhsv.zzb) {
            zzhxcVarZza = zzhjf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhsv.zza) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzhxcVarZza = zzhjf.zzb(this.zzc.intValue());
        }
        return new zzhta(this.zza, this.zzb, zzhxcVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhsz(byte[] bArr) {
    }
}
