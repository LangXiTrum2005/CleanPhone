package kb;

import eb.e0;
import eb.j0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements va.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final co.c f44551e = new co.c(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f44552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb.c f44553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f44554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44555d;

    public b(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f44555d = i10;
        m.a(bArr.length);
        this.f44554c = new SecretKeySpec(bArr, "AES");
        this.f44553b = android.support.v4.media.session.a.k(hb.a.t0(hb.b.b(bArr.length), new s4.i(lb.a.a(bArr))));
        this.f44552a = bArr2;
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f44552a;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i10 = this.f44555d;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] bArrA = e0.a(i10);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, i10);
        byte[] bArrC = c(0, 0, bArrA.length, bArrA);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, 0, bArr2.length, bArr2);
        Cipher cipher = (Cipher) f44551e.get();
        cipher.init(1, this.f44554c, new IvParameterSpec(bArrC));
        cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + i10);
        byte[] bArrC3 = c(2, bArr3.length + i10, bArr.length, bArrCopyOf);
        int length3 = bArr3.length + bArr.length + i10;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrCopyOf[length3 + i11] = (byte) ((bArrC2[i11] ^ bArrC[i11]) ^ bArrC3[i11]);
        }
        return bArrCopyOf;
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f44552a;
        int length2 = length - bArr3.length;
        int i10 = this.f44555d;
        int i11 = (length2 - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!j0.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(0, bArr3.length, i10, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, 0, bArr2.length, bArr2);
        byte[] bArrC3 = c(2, bArr3.length + i10, i11, bArr);
        int length3 = bArr.length - 16;
        byte b10 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b10 = (byte) (b10 | (((bArr[length3 + i12] ^ bArrC2[i12]) ^ bArrC[i12]) ^ bArrC3[i12]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f44551e.get();
        cipher.init(1, this.f44554c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i10, i11);
    }

    public final byte[] c(int i10, int i11, int i12, byte[] bArr) {
        byte[] bArr2 = new byte[i12 + 16];
        bArr2[15] = (byte) i10;
        System.arraycopy(bArr, i11, bArr2, 16, i12);
        return this.f44553b.q(16, bArr2);
    }
}
