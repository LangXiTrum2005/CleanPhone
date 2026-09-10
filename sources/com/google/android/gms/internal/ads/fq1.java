package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fq1 implements hf1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f14508g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f14509h = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f14510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f14512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f14515f;

    public fq1(RSAPublicKey rSAPublicKey, lp1 lp1Var, lp1 lp1Var2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!jc1.e(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!lp1Var.equals(lp1Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        ic1.i(rSAPublicKey.getModulus().bitLength());
        ic1.k(rSAPublicKey.getPublicExponent());
        this.f14510a = rSAPublicKey;
        this.f14511b = b(lp1Var);
        this.f14512c = c(lp1Var, lp1Var2, i10);
        this.f14513d = bArr;
        this.f14514e = bArr2;
        this.f14515f = provider;
    }

    public static String b(lp1 lp1Var) {
        if (lp1Var == lp1.f17093b) {
            return "SHA256withRSA/PSS";
        }
        if (lp1Var == lp1.f17094c) {
            return "SHA384withRSA/PSS";
        }
        if (lp1Var == lp1.f17095d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(lp1Var)));
    }

    public static PSSParameterSpec c(lp1 lp1Var, lp1 lp1Var2, int i10) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        lp1 lp1Var3 = lp1.f17095d;
        lp1 lp1Var4 = lp1.f17094c;
        lp1 lp1Var5 = lp1.f17093b;
        if (lp1Var == lp1Var5) {
            str = "SHA-256";
        } else if (lp1Var == lp1Var4) {
            str = "SHA-384";
        } else {
            if (lp1Var != lp1Var3) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(lp1Var)));
            }
            str = "SHA-512";
        }
        if (lp1Var2 == lp1Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (lp1Var2 == lp1Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (lp1Var2 != lp1Var3) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(lp1Var2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i10, 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    public static fq1 d(pp1 pp1Var) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerD;
        int i10 = rj1.f19601a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            providerD = (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() > 23 ? v71.d() : null;
        }
        Provider provider = providerD;
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = pp1Var.f18758c;
        np1 np1Var = pp1Var.f18757b;
        return new fq1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, np1Var.f17885b)), np1Var.f17887d, np1Var.f17888e, np1Var.f17889f, pp1Var.f18759d.b(), np1Var.f17886c.equals(mp1.f17510d) ? f14509h : f14508g, provider);
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14513d;
        if (!rj1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f14511b, this.f14515f);
        signature.initVerify(this.f14510a);
        signature.setParameter(this.f14512c);
        signature.update(bArr2);
        byte[] bArr4 = this.f14514e;
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
