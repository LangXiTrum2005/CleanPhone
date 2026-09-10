package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhux implements zzhaq {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final Provider zzg;

    private zzhux(RSAPublicKey rSAPublicKey, zzhsu zzhsuVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhxa.zzc(rSAPublicKey.getModulus().bitLength());
        zzhxa.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhsuVar);
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = provider;
    }

    @Nullable
    public static Provider zzb() {
        if (zzhkl.zzc()) {
            zzhkl.zzd().getClass();
        }
        return zzhhf.zza();
    }

    public static String zzc(zzhsu zzhsuVar) throws GeneralSecurityException {
        if (zzhsuVar == zzhsu.zza) {
            return "SHA256withRSA";
        }
        if (zzhsuVar == zzhsu.zzb) {
            return "SHA384withRSA";
        }
        if (zzhsuVar == zzhsu.zzc) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static zzhaq zzd(zzhta zzhtaVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb != null) {
            return zze(zzhtaVar, providerZzb);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static zzhaq zze(zzhta zzhtaVar, Provider provider) throws GeneralSecurityException {
        return new zzhux((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(zzhtaVar.zzd(), zzhtaVar.zzf().zzd())), zzhtaVar.zzf().zzf(), zzhtaVar.zze().zzc(), zzhtaVar.zzf().zze().equals(zzhsv.zzc) ? zzb : zza, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzg;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.zzf;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
