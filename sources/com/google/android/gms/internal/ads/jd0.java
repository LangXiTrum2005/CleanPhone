package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16049d;

    public jd0(int i10) {
        switch (i10) {
            case 1:
                int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f16049d = iHighestOneBit - 1;
                this.f16046a = new int[iHighestOneBit];
                break;
            default:
                this.f16049d = 7;
                this.f16046a = new int[8];
                break;
        }
    }

    public void a(int i10) {
        int[] iArr = this.f16046a;
        int i11 = this.f16048c;
        iArr[i11] = i10;
        int i12 = this.f16049d & (i11 + 1);
        this.f16048c = i12;
        int i13 = this.f16047b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i15];
            xj.k.f0(0, i13, iArr, iArr2, length);
            xj.k.f0(i14, 0, this.f16046a, iArr2, this.f16047b);
            this.f16046a = iArr2;
            this.f16047b = 0;
            this.f16048c = length;
            this.f16049d = i15 - 1;
        }
    }

    public void b(int i10) {
        int[] iArr = this.f16046a;
        int i11 = this.f16048c;
        iArr[i11] = i10;
        int i12 = this.f16049d & (i11 + 1);
        this.f16048c = i12;
        int i13 = this.f16047b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length + length;
            int[] iArr2 = new int[i15];
            System.arraycopy(iArr, i13, iArr2, 0, i14);
            System.arraycopy(this.f16046a, 0, iArr2, i14, this.f16047b);
            this.f16046a = iArr2;
            this.f16047b = 0;
            this.f16048c = length;
            this.f16049d = i15 - 1;
        }
    }
}
