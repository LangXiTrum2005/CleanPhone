package com.google.zxing.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class BitArray implements Cloneable {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f21345Y = 0;
    public int[] X = new int[1];

    public final void b(boolean z2) {
        d(this.f21345Y + 1);
        if (z2) {
            int[] iArr = this.X;
            int i2 = this.f21345Y;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f21345Y++;
    }

    public final void c(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        d(this.f21345Y + i3);
        while (i3 > 0) {
            boolean z2 = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z2 = false;
            }
            b(z2);
            i3--;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.X.clone();
        int i2 = this.f21345Y;
        BitArray bitArray = new BitArray();
        bitArray.X = iArr;
        bitArray.f21345Y = i2;
        return bitArray;
    }

    public final void d(int i2) {
        int[] iArr = this.X;
        if (i2 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i2 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.X = iArr2;
        }
    }

    public final boolean e(int i2) {
        return ((1 << (i2 & 31)) & this.X[i2 / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.f21345Y == bitArray.f21345Y && Arrays.equals(this.X, bitArray.X);
    }

    public final int f() {
        return (this.f21345Y + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.X) + (this.f21345Y * 31);
    }

    public final String toString() {
        int i2 = this.f21345Y;
        StringBuilder sb = new StringBuilder((i2 / 8) + i2 + 1);
        for (int i3 = 0; i3 < this.f21345Y; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(e(i3) ? 'X' : '.');
        }
        return sb.toString();
    }
}
