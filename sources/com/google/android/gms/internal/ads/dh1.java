package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 implements xe1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f13543d = jd1.d("7a806c");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f13544e = jd1.d("46bb91c3c5");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f13545f = jd1.d("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f13546g = jd1.d("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f13547h = jd1.d("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg1 f13548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f13549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13550c;

    public dh1(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        xg1 xg1Var = xg1.C;
        this.f13550c = bArr2;
        ic1.c(bArr.length);
        this.f13549b = new SecretKeySpec(bArr, "AES");
        this.f13548a = xg1Var;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f13546g;
            cipher.init(2, new SecretKeySpec(f13545f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f13544e);
            byte[] bArr2 = f13547h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f13543d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.xe1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f13550c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!rj1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f13548a.getClass();
        try {
            Cipher cipher = (Cipher) sh1.f19974a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.f13549b, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }
}
