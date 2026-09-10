package ib;

import defpackage.e;
import hb.c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kb.m;
import no.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final co.c f42978d = new co.c(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f42979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f42980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f42981c;

    public a(byte[] bArr) throws GeneralSecurityException {
        m.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f42979a = secretKeySpec;
        if (!e.c(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f42978d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM = b.m(cipher.doFinal(new byte[16]));
        this.f42980b = bArrM;
        this.f42981c = b.m(bArrM);
    }

    @Override // hb.c
    public final byte[] q(int i10, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrT;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!e.c(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f42978d.get();
        cipher.init(1, this.f42979a);
        int length = bArr.length;
        int i11 = length == 0 ? 1 : ((length - 1) / 16) + 1;
        if (i11 * 16 == bArr.length) {
            bArrT = x7.a.S(bArr, (i11 - 1) * 16, 16, this.f42980b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i11 - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrT = x7.a.T(bArrCopyOf, this.f42981c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            int i13 = i12 * 16;
            for (int i14 = 0; i14 < 16; i14++) {
                bArr3[i14] = (byte) (bArr2[i14] ^ bArr[i14 + i13]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i15 = 0; i15 < 16; i15++) {
            bArr3[i15] = (byte) (bArr2[i15] ^ bArrT[i15]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
