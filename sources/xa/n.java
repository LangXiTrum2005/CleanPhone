package xa;

import eb.e0;
import eb.j0;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb.c f53720c;

    public n(byte[] bArr, lb.a aVar, int i10) {
        this.f53720c = android.support.v4.media.session.a.k(hb.a.t0(hb.b.b(bArr.length), new s4.i(lb.a.a(bArr))));
        this.f53718a = aVar.b();
        this.f53719b = i10;
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        int i10 = this.f53719b;
        int i11 = i10 + 12;
        byte[] bArrA = e0.a(i11);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, i10);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i10, i11);
        byte[] bArrC = c(bArrCopyOf);
        if (!defpackage.e.d(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        co.c cVar = d.f53687a;
        kb.m.a(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrC, "AES");
        byte[] bArr3 = this.f53718a;
        int length = bArr3.length + i10 + bArrCopyOfRange.length;
        if (bArrCopyOfRange.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = d.a(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        Cipher cipher = (Cipher) d.f53687a.get();
        cipher.init(1, secretKeySpec, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        if (outputSize > Integer.MAX_VALUE - length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[length + outputSize];
        if (cipher.doFinal(bArr, 0, bArr.length, bArr4, length) != outputSize) {
            throw new GeneralSecurityException("not enough data written");
        }
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArr4, bArr3.length, bArrA.length);
        return bArr4;
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f53718a;
        int length2 = bArr3.length;
        int i10 = this.f53719b;
        if (length < length2 + i10 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!j0.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length3 = bArr3.length + i10;
        byte[] bArrC = c(Arrays.copyOfRange(bArr, bArr3.length, length3));
        if (!defpackage.e.d(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        co.c cVar = d.f53687a;
        kb.m.a(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrC, "AES");
        int i11 = length3 + 12;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, i11);
        if (bArrCopyOfRange.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr.length < length3 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = d.a(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        Cipher cipher = (Cipher) d.f53687a.get();
        cipher.init(2, secretKeySpec, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i11, bArr.length - i11);
    }

    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        hb.c cVar = this.f53720c;
        System.arraycopy(cVar.q(16, bArr2), 0, bArr4, 0, 16);
        System.arraycopy(cVar.q(16, bArr3), 0, bArr4, 16, 16);
        return bArr4;
    }
}
