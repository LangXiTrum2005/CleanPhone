package com.google.zxing.common;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class BitMatrix implements Cloneable {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f21346Y;
    public final int Z;
    public final int[] e0;

    public BitMatrix(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.X = i2;
        this.f21346Y = i3;
        int i4 = (i2 + 31) / 32;
        this.Z = i4;
        this.e0 = new int[i4 * i3];
    }

    public final boolean b(int i2, int i3) {
        return ((this.e0[(i2 / 32) + (i3 * this.Z)] >>> (i2 & 31)) & 1) != 0;
    }

    public final void c(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i5 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i6 = i4 + i2;
        int i7 = i5 + i3;
        if (i7 > this.f21346Y || i6 > this.X) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i3 < i7) {
            int i8 = this.Z * i3;
            for (int i9 = i2; i9 < i6; i9++) {
                int i10 = (i9 / 32) + i8;
                int[] iArr = this.e0;
                iArr[i10] = iArr[i10] | (1 << (i9 & 31));
            }
            i3++;
        }
    }

    public final Object clone() {
        return new BitMatrix((int[]) this.e0.clone(), this.X, this.f21346Y, this.Z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.X == bitMatrix.X && this.f21346Y == bitMatrix.f21346Y && this.Z == bitMatrix.Z && Arrays.equals(this.e0, bitMatrix.e0);
    }

    public final int hashCode() {
        int i2 = this.X;
        return Arrays.hashCode(this.e0) + (((((((i2 * 31) + i2) * 31) + this.f21346Y) * 31) + this.Z) * 31);
    }

    public final String toString() {
        int i2 = this.X;
        int i3 = this.f21346Y;
        StringBuilder sb = new StringBuilder((i2 + 1) * i3);
        for (int i4 = 0; i4 < i3; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                sb.append(b(i5, i4) ? "X " : "  ");
            }
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public BitMatrix(int[] iArr, int i2, int i3, int i4) {
        this.X = i2;
        this.f21346Y = i3;
        this.Z = i4;
        this.e0 = iArr;
    }
}
