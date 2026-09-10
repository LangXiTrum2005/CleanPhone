package xa;

import eb.e0;
import eb.j0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements va.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f53692d = a.a.k("7a806c");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f53693e = a.a.k("46bb91c3c5");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f53694f = a.a.k("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f53695g = a.a.k("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f53696h = a.a.k("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f53697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f53698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f53699c;

    public f(byte[] bArr, byte[] bArr2, b bVar) throws InvalidAlgorithmParameterException {
        this.f53699c = bArr2;
        kb.m.a(bArr.length);
        this.f53698b = new SecretKeySpec(bArr, "AES");
        this.f53697a = bVar;
    }

    public static boolean c(Cipher cipher) {
        try {
            byte[] bArr = f53695g;
            cipher.init(2, new SecretKeySpec(f53694f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f53693e);
            byte[] bArr2 = f53696h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f53692d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f53697a.getClass();
        Cipher cipherC = b.c();
        int length = bArr.length;
        byte[] bArr3 = this.f53699c;
        if (length > 2147483619 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrA = e0.a(12);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        cipherC.init(1, this.f53698b, new GCMParameterSpec(128, bArrA, 0, bArrA.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        int iDoFinal = cipherC.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(defpackage.e.h(iDoFinal - bArr.length, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f53699c;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!j0.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f53697a.getClass();
        Cipher cipherC = b.c();
        cipherC.init(2, this.f53698b, new GCMParameterSpec(128, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherC.updateAAD(bArr2);
        }
        return cipherC.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
