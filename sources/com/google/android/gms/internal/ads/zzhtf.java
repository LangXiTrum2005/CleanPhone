package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtf {
    private static final BigInteger zzg;
    private static final BigInteger zzh;

    @Nullable
    private Integer zza = null;

    @Nullable
    private BigInteger zzb = zzhti.zza;

    @Nullable
    private zzhtg zzc = null;

    @Nullable
    private zzhtg zzd = null;

    @Nullable
    private Integer zze = null;
    private zzhth zzf = zzhth.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zzg = bigIntegerValueOf;
        zzh = bigIntegerValueOf.pow(256);
    }

    private zzhtf() {
    }

    public final zzhtf zza(int i2) {
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzhtf zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhtf zzc(zzhth zzhthVar) {
        this.zzf = zzhthVar;
        return this;
    }

    public final zzhtf zzd(zzhtg zzhtgVar) {
        this.zzc = zzhtgVar;
        return this;
    }

    public final zzhtf zze(zzhtg zzhtgVar) {
        this.zzd = zzhtgVar;
        return this;
    }

    public final zzhtf zzf(int i2) throws GeneralSecurityException {
        if (i2 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i2)));
        }
        this.zze = Integer.valueOf(i2);
        return this;
    }

    public final zzhti zzg() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.zzf == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.zze == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.zza, Integer.valueOf(com.p004ironsource.mediationsdk.metadata.a.f25965n)));
        }
        if (this.zzc != this.zzd) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.zzb;
        int iCompareTo = bigInteger.compareTo(zzhti.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zzg).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzh) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhti(this.zza.intValue(), this.zzb, this.zzf, this.zzc, this.zzd, this.zze.intValue(), null);
    }

    public /* synthetic */ zzhtf(byte[] bArr) {
    }
}
