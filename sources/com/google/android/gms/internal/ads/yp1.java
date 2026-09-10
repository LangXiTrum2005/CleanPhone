package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yp1 implements gf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f22346a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static yp1 a(xo1 xo1Var) throws GeneralSecurityException {
        Provider providerD = v71.d();
        if (providerD == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        uo0 uo0Var = xo1Var.f21948c;
        zo1 zo1Var = xo1Var.f21947b;
        byte[] bArrB = ((zq1) uo0Var.f20839b).b();
        zo1Var.f22684d.b();
        yp1 yp1Var = new yp1();
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArrB.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", providerD).generatePrivate(new PKCS8EncodedKeySpec(jc1.f(f22346a, bArrB)));
        return yp1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public static yp1 b(op1 op1Var) throws GeneralSecurityException {
        Provider providerD;
        int i10 = rj1.f19601a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            providerD = (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() > 23 ? v71.d() : null;
        }
        if (providerD == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerD);
        pp1 pp1Var = op1Var.f18319b;
        np1 np1Var = pp1Var.f18757b;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(pp1Var.f18758c, np1Var.f17885b, (BigInteger) op1Var.f18320c.f21612b, (BigInteger) op1Var.f18321d.f21612b, (BigInteger) op1Var.f18322e.f21612b, (BigInteger) op1Var.f18323f.f21612b, (BigInteger) op1Var.f18324g.f21612b, (BigInteger) op1Var.f18325h.f21612b));
        lp1 lp1Var = np1Var.f17887d;
        lp1 lp1Var2 = np1Var.f17888e;
        int i11 = np1Var.f17889f;
        pp1Var.f18759d.b();
        yp1 yp1Var = new yp1();
        if (!jc1.e(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        ic1.i(rSAPrivateCrtKey.getModulus().bitLength());
        ic1.k(rSAPrivateCrtKey.getPublicExponent());
        fq1.b(lp1Var);
        fq1.c(lp1Var, lp1Var2, i11);
        return yp1Var;
    }
}
