package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dq1 implements hf1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f13634f = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f13635g = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f13636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f13640e;

    public dq1(RSAPublicKey rSAPublicKey, ep1 ep1Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!jc1.e(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        ic1.i(rSAPublicKey.getModulus().bitLength());
        ic1.k(rSAPublicKey.getPublicExponent());
        this.f13636a = rSAPublicKey;
        this.f13637b = b(ep1Var);
        this.f13638c = bArr;
        this.f13639d = bArr2;
        this.f13640e = provider;
    }

    public static String b(ep1 ep1Var) throws GeneralSecurityException {
        if (ep1Var == ep1.f14042b) {
            return "SHA256withRSA";
        }
        if (ep1Var == ep1.f14043c) {
            return "SHA384withRSA";
        }
        if (ep1Var == ep1.f14044d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static dq1 c(ip1 ip1Var, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = ip1Var.f15814c;
        gp1 gp1Var = ip1Var.f15813b;
        return new dq1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, gp1Var.f14927b)), gp1Var.f14929d, ip1Var.f15815d.b(), gp1Var.f14928c.equals(fp1.f14503d) ? f13635g : f13634f, provider);
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f13638c;
        if (!rj1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f13637b, this.f13640e);
        signature.initVerify(this.f13636a);
        signature.update(bArr2);
        byte[] bArr4 = this.f13639d;
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
