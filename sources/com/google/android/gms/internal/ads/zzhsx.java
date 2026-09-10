package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhsx {

    @Nullable
    private zzhta zza = null;

    @Nullable
    private zzhxd zzb = null;

    @Nullable
    private zzhxd zzc = null;

    @Nullable
    private zzhxd zzd = null;

    @Nullable
    private zzhxd zze = null;

    @Nullable
    private zzhxd zzf = null;

    @Nullable
    private zzhxd zzg = null;

    private zzhsx() {
    }

    public final zzhsx zza(zzhta zzhtaVar) {
        this.zza = zzhtaVar;
        return this;
    }

    public final zzhsx zzb(zzhxd zzhxdVar, zzhxd zzhxdVar2) {
        this.zzc = zzhxdVar;
        this.zzd = zzhxdVar2;
        return this;
    }

    public final zzhsx zzc(zzhxd zzhxdVar) {
        this.zzb = zzhxdVar;
        return this;
    }

    public final zzhsx zzd(zzhxd zzhxdVar, zzhxd zzhxdVar2) {
        this.zze = zzhxdVar;
        this.zzf = zzhxdVar2;
        return this;
    }

    public final zzhsx zze(zzhxd zzhxdVar) {
        this.zzg = zzhxdVar;
        return this;
    }

    public final zzhsy zzf() throws GeneralSecurityException {
        zzhta zzhtaVar = this.zza;
        if (zzhtaVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhtaVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzgzv.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzgzv.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzgzv.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzgzv.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzgzv.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzgzv.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(bigInteger);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(bigInteger)) {
            return new zzhsy(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ zzhsx(byte[] bArr) {
    }
}
