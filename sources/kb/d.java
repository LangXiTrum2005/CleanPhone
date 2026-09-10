package kb;

import eb.j0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements va.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f44559d = new byte[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f44560e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final co.c f44561f = new co.c(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb.c f44562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f44563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f44564c;

    public d(byte[] bArr, lb.a aVar) throws GeneralSecurityException {
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(l1.d.i(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 32 or 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f44563b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f44562a = android.support.v4.media.session.a.k(hb.a.t0(hb.b.b(bArrCopyOfRange.length), new s4.i(lb.a.a(bArrCopyOfRange))));
        this.f44564c = aVar.b();
    }

    public static void d(int i10) throws GeneralSecurityException {
        if (i10 > 126) {
            throw new GeneralSecurityException(defpackage.e.h(i10, "Too many associated datas: ", " > 126"));
        }
    }

    @Override // va.b
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        d(1);
        int length = bArr.length;
        byte[] bArr4 = this.f44564c;
        if (length > 2147483631 - bArr4.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) f44561f.get();
        byte[][] bArr5 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr5[1] = bArr;
        byte[] bArrC = c(bArr5);
        byte[] bArr6 = (byte[]) bArrC.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f44563b, "AES"), new IvParameterSpec(bArr6));
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + bArrC.length + bArr.length);
        System.arraycopy(bArrC, 0, bArrCopyOf, bArr4.length, bArrC.length);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr4.length + bArrC.length) == bArr.length) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // va.b
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[][] bArr3 = {bArr2};
        d(1);
        int length = bArr.length;
        byte[] bArr4 = this.f44564c;
        if (length < bArr4.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!j0.b(bArr4, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f44561f.get();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f44563b, "AES"), new IvParameterSpec(bArr5));
        int length2 = bArr4.length + 16;
        int length3 = bArr.length - length2;
        byte[] bArrDoFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
        bArr6[1] = bArrDoFinal;
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr6))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] bArrT;
        int length = bArr.length;
        hb.c cVar = this.f44562a;
        if (length == 0) {
            return cVar.q(16, f44560e);
        }
        byte[] bArrQ = cVar.q(16, f44559d);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrQ = x7.a.T(no.b.m(bArrQ), cVar.q(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrQ.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrQ.length;
            bArrT = Arrays.copyOf(bArr3, bArr3.length);
            for (int i11 = 0; i11 < bArrQ.length; i11++) {
                int i12 = length2 + i11;
                bArrT[i12] = (byte) (bArrT[i12] ^ bArrQ[i11]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrT = x7.a.T(bArrCopyOf, no.b.m(bArrQ));
        }
        return cVar.q(16, bArrT);
    }
}
