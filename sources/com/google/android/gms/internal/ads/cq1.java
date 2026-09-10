package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 implements gf1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f13233g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f13234h = {0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f13235i = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f13236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hf1 f13240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f13241f;

    public cq1(RSAPrivateCrtKey rSAPrivateCrtKey, ep1 ep1Var, byte[] bArr, byte[] bArr2, hf1 hf1Var, Provider provider) throws GeneralSecurityException {
        if (!jc1.e(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (ep1Var != ep1.f14042b && ep1Var != ep1.f14043c && ep1Var != ep1.f14044d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(ep1Var)));
        }
        ic1.i(rSAPrivateCrtKey.getModulus().bitLength());
        ic1.k(rSAPrivateCrtKey.getPublicExponent());
        this.f13236a = rSAPrivateCrtKey;
        this.f13237b = dq1.b(ep1Var);
        this.f13238c = bArr;
        this.f13239d = bArr2;
        this.f13240e = hf1Var;
        this.f13241f = provider;
    }
}
