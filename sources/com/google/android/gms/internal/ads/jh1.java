package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f16098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16099b;

    public jh1(byte[] bArr, int i10, int i11) throws InvalidKeyException {
        switch (i11) {
            case 1:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f16098a = xa.j.e(bArr);
                this.f16099b = i10;
                return;
            default:
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f16098a = hh1.c(bArr);
                this.f16099b = i10;
                return;
        }
    }

    public ByteBuffer a(int i10, byte[] bArr) {
        int[] iArrB = b(i10, xa.j.e(bArr));
        int[] iArr = (int[]) iArrB.clone();
        xa.j.d(iArr);
        for (int i11 = 0; i11 < iArrB.length; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] b(int i10, int[] iArr);

    public abstract int c();

    public void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != c()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + c());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(this.f16099b + i12, bArr);
            if (i12 == i10) {
                x7.a.R(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                x7.a.R(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int[] e(int i10, int[] iArr);

    public abstract int f();

    public ByteBuffer g(int i10, byte[] bArr) {
        int[] iArrE = e(i10, hh1.c(bArr));
        int[] iArr = (int[]) iArrE.clone();
        hh1.a(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrE[i11] = iArrE[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrE, 0, 16);
        return byteBufferOrder;
    }
}
