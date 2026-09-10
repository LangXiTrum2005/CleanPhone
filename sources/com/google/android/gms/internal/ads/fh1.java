package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fh1 implements xe1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f14429d = jd1.d("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f14430e = jd1.d("070000004041424344454647");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f14431f = jd1.d("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f14432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f14434c;

    public fh1(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f14432a = new SecretKeySpec(bArr, "ChaCha20");
        this.f14433b = bArr2;
        this.f14434c = provider;
    }

    public static Cipher b() {
        Cipher cipher = (Cipher) qq1.f19163b.f19169a.zza("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f14430e);
            byte[] bArr = f14429d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f14431f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    @Override // com.google.android.gms.internal.ads.xe1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f14433b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!rj1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f14434c);
        cipher.init(2, this.f14432a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
