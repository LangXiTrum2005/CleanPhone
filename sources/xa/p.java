package xa;

import eb.e0;
import eb.j0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f53726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f53727c;

    public p(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f53725a = bArr;
        this.f53726b = bArr2;
        this.f53727c = provider;
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = e0.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(j.a(this.f53725a, bArrA), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArrA, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        byte[] bArr4 = h.f53704d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f53727c);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr5 = this.f53726b;
        if (outputSize > 2147483623 - bArr5.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr5.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr5.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f53726b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!j0.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(j.a(this.f53725a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        byte[] bArr6 = h.f53704d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f53727c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }
}
