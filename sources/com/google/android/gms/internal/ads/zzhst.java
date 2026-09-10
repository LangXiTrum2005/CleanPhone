package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhst {
    private static final BigInteger zze;
    private static final BigInteger zzf;

    @Nullable
    private Integer zza = null;

    @Nullable
    private BigInteger zzb = zzhsw.zza;

    @Nullable
    private zzhsu zzc = null;
    private zzhsv zzd = zzhsv.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zze = bigIntegerValueOf;
        zzf = bigIntegerValueOf.pow(256);
    }

    private zzhst() {
    }

    public final zzhst zza(int i2) {
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzhst zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhst zzc(zzhsv zzhsvVar) {
        this.zzd = zzhsvVar;
        return this;
    }

    public final zzhst zzd(zzhsu zzhsuVar) {
        this.zzc = zzhsuVar;
        return this;
    }

    public final zzhsw zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zza));
        }
        BigInteger bigInteger = this.zzb;
        int iCompareTo = bigInteger.compareTo(zzhsw.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zze).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzf) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhsw(this.zza.intValue(), this.zzb, this.zzd, this.zzc, null);
    }

    public /* synthetic */ zzhst(byte[] bArr) {
    }
}
