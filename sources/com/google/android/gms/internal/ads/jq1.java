package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jq1 implements xe1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final co.c f16151e = new co.c(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok1 f16153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f16154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16155d;

    public jq1(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f16155d = i10;
        int length = bArr.length;
        ic1.c(length);
        this.f16154c = new SecretKeySpec(bArr, "AES");
        this.f16153b = zw1.i(mk1.j(nk1.b(length), new uo0(zq1.a(bArr), 13)));
        this.f16152a = bArr2;
    }

    public static jq1 b(vf1 vf1Var) throws GeneralSecurityException {
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        vf1Var.getClass();
        return new jq1(((zq1) vf1Var.f21163c.f20839b).b(), vf1Var.f21162b.f22229b, vf1Var.f21164d.b());
    }

    @Override // com.google.android.gms.internal.ads.xe1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f16152a;
        int length2 = bArr3.length;
        int i10 = this.f16155d;
        int i11 = ((length - length2) - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!rj1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(0, length2, i10, bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, 0, bArr2.length, bArr2);
        byte[] bArrC3 = c(2, length2 + i10, i11, bArr);
        int i12 = length - 16;
        byte b10 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b10 = (byte) (b10 | (((bArr[i12 + i13] ^ bArrC2[i13]) ^ bArrC[i13]) ^ bArrC3[i13]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f16151e.get();
        cipher.init(1, this.f16154c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i10, i11);
    }

    public final byte[] c(int i10, int i11, int i12, byte[] bArr) {
        byte[] bArr2 = new byte[i12 + 16];
        bArr2[15] = (byte) i10;
        System.arraycopy(bArr, i11, bArr2, 16, i12);
        return this.f16153b.a(16, bArr2);
    }
}
