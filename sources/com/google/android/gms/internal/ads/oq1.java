package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 implements xe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq1 f18336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vq1 f18337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18339d;

    public oq1(iq1 iq1Var, vq1 vq1Var, int i10, byte[] bArr) {
        this.f18336a = iq1Var;
        this.f18337b = vq1Var;
        this.f18338c = i10;
        this.f18339d = bArr;
    }

    public static oq1 b(of1 of1Var) {
        byte[] bArrB = ((zq1) of1Var.f18251c.f20839b).b();
        uf1 uf1Var = of1Var.f18250b;
        iq1 iq1Var = new iq1(bArrB, uf1Var.f20766c);
        String strValueOf = String.valueOf(uf1Var.f20769f);
        vc vcVar = new vc("HMAC".concat(strValueOf), new SecretKeySpec(((zq1) of1Var.f18252d.f20839b).b(), "HMAC"));
        int i10 = uf1Var.f20767d;
        return new oq1(iq1Var, new vq1(vcVar, i10), i10, of1Var.f18253e.b());
    }

    @Override // com.google.android.gms.internal.ads.xe1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f18339d;
        int length2 = bArr3.length;
        int i10 = this.f18338c;
        if (length < i10 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!rj1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrF = jc1.f(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8));
        vq1 vq1Var = this.f18337b;
        int i12 = vq1Var.f21256b;
        ok1 ok1Var = vq1Var.f21255a;
        byte[] bArr4 = vq1Var.f21257c;
        byte[] bArr5 = vq1Var.f21258d;
        if (!MessageDigest.isEqual(bArr5.length > 0 ? jc1.f(bArr4, ok1Var.a(i12, jc1.f(bArrF, bArr5))) : jc1.f(bArr4, ok1Var.a(i12, bArrF)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        iq1 iq1Var = this.f18336a;
        int i13 = iq1Var.f15829b;
        if (length3 < i13) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i13];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i13);
        int i14 = length3 - i13;
        byte[] bArr7 = new byte[i14];
        Cipher cipher = (Cipher) iq1.f15827d.get();
        byte[] bArr8 = new byte[iq1Var.f15830c];
        System.arraycopy(bArr6, 0, bArr8, 0, i13);
        cipher.init(2, iq1Var.f15828a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i13, i14, bArr7, 0) == i14) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
