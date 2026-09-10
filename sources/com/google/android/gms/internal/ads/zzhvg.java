package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvg implements zzhaq {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final Provider zzh;

    private zzhvg(RSAPublicKey rSAPublicKey, zzhtg zzhtgVar, zzhtg zzhtgVar2, int i2, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!zzhtgVar.equals(zzhtgVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhxa.zzc(rSAPublicKey.getModulus().bitLength());
        zzhxa.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhtgVar);
        this.zze = zzd(zzhtgVar, zzhtgVar2, i2);
        this.zzf = bArr;
        this.zzg = bArr2;
        this.zzh = provider;
    }

    @Nullable
    public static Provider zzb() {
        if (!zzhkl.zzc() || zzhkl.zzd().intValue() > 23) {
            return zzhhf.zza();
        }
        return null;
    }

    public static String zzc(zzhtg zzhtgVar) {
        if (zzhtgVar == zzhtg.zza) {
            return "SHA256withRSA/PSS";
        }
        if (zzhtgVar == zzhtg.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzhtgVar == zzhtg.zzc) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(zzhtgVar)));
    }

    public static PSSParameterSpec zzd(zzhtg zzhtgVar, zzhtg zzhtgVar2, int i2) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhtg zzhtgVar3 = zzhtg.zza;
        if (zzhtgVar == zzhtgVar3) {
            str = "SHA-256";
        } else if (zzhtgVar == zzhtg.zzb) {
            str = "SHA-384";
        } else {
            if (zzhtgVar != zzhtg.zzc) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(zzhtgVar)));
            }
            str = "SHA-512";
        }
        if (zzhtgVar2 == zzhtgVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhtgVar2 == zzhtg.zzb) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhtgVar2 != zzhtg.zzc) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(zzhtgVar2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i2, 1);
    }

    public static zzhaq zze(zzhtm zzhtmVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerZzb).generatePublic(new RSAPublicKeySpec(zzhtmVar.zzd(), zzhtmVar.zzf().zzd()));
        zzhti zzhtiVarZzf = zzhtmVar.zzf();
        return new zzhvg(rSAPublicKey, zzhtiVarZzf.zzf(), zzhtiVarZzf.zzg(), zzhtiVarZzf.zzh(), zzhtmVar.zze().zzc(), zzhtmVar.zzf().zze().equals(zzhth.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!zzhkl.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzh;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
