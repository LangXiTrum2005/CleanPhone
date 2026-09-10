package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 implements ok1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final co.c f18702d = new co.c(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f18703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18705c;

    public pk1(byte[] bArr) throws GeneralSecurityException {
        ic1.c(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f18703a = secretKeySpec;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f18702d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrD = ic1.d(cipher.doFinal(new byte[16]));
        this.f18704b = bArrD;
        this.f18705c = ic1.d(bArrD);
    }

    @Override // com.google.android.gms.internal.ads.ok1
    public final byte[] a(int i10, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrH;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f18702d.get();
        cipher.init(1, this.f18703a);
        int length = bArr.length;
        int i11 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i12 = i11 - 1;
        int i13 = i12 * 16;
        if (i11 * 16 == length) {
            bArrH = jc1.h(bArr, i13, this.f18704b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrH = jc1.h(bArrCopyOf, 0, this.f18705c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i14 * 16;
            for (int i16 = 0; i16 < 16; i16++) {
                bArr3[i16] = (byte) (bArr2[i16] ^ bArr[i16 + i15]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i17 = 0; i17 < 16; i17++) {
            bArr3[i17] = (byte) (bArr2[i17] ^ bArrH[i17]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i10 == 16 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
