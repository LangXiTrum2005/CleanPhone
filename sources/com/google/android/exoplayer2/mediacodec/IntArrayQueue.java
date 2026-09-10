package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class IntArrayQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18162a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18163b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18164c = 0;
    public int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18165e;

    public IntArrayQueue() {
        int[] iArr = new int[16];
        this.d = iArr;
        this.f18165e = iArr.length - 1;
    }

    public final void a(int i2) {
        int i3 = this.f18164c;
        int[] iArr = this.d;
        if (i3 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i4 = this.f18162a;
            int i5 = length2 - i4;
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.d, 0, iArr2, i5, i4);
            this.f18162a = 0;
            this.f18163b = this.f18164c - 1;
            this.d = iArr2;
            this.f18165e = length - 1;
        }
        int i6 = (this.f18163b + 1) & this.f18165e;
        this.f18163b = i6;
        this.d[i6] = i2;
        this.f18164c++;
    }

    public final int b() {
        int i2 = this.f18164c;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.d;
        int i3 = this.f18162a;
        int i4 = iArr[i3];
        this.f18162a = (i3 + 1) & this.f18165e;
        this.f18164c = i2 - 1;
        return i4;
    }
}
