package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15390d;

    public ht0(int i10) {
        switch (i10) {
            case 1:
                this.f15387a = new long[10];
                this.f15388b = new Object[10];
                break;
            default:
                this.f15387a = new long[10];
                this.f15388b = new Object[10];
                break;
        }
    }

    public synchronized void a(long j10, Object obj) {
        int i10 = this.f15390d;
        if (i10 > 0) {
            if (j10 <= this.f15387a[((this.f15389c + i10) - 1) % this.f15388b.length]) {
                synchronized (this) {
                    this.f15389c = 0;
                    this.f15390d = 0;
                    Arrays.fill(this.f15388b, (Object) null);
                }
            }
        }
        b();
        int i11 = this.f15389c;
        int i12 = this.f15390d;
        Object[] objArr = this.f15388b;
        int length = (i11 + i12) % objArr.length;
        this.f15387a[length] = j10;
        objArr[length] = obj;
        this.f15390d = i12 + 1;
    }

    public void b() {
        int length = this.f15388b.length;
        if (this.f15390d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f15389c;
        int i12 = length - i11;
        System.arraycopy(this.f15387a, i11, jArr, 0, i12);
        System.arraycopy(this.f15388b, this.f15389c, objArr, 0, i12);
        int i13 = this.f15389c;
        if (i13 > 0) {
            System.arraycopy(this.f15387a, 0, jArr, i12, i13);
            System.arraycopy(this.f15388b, 0, objArr, i12, this.f15389c);
        }
        this.f15387a = jArr;
        this.f15388b = objArr;
        this.f15389c = 0;
    }

    public synchronized Object c() {
        return this.f15390d == 0 ? null : e();
    }

    public synchronized Object d(long j10) {
        Object objE;
        objE = null;
        while (this.f15390d > 0 && j10 - this.f15387a[this.f15389c] >= 0) {
            objE = e();
        }
        return objE;
    }

    public Object e() {
        go.k.t(this.f15390d > 0);
        Object[] objArr = this.f15388b;
        int i10 = this.f15389c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f15389c = (i10 + 1) % objArr.length;
        this.f15390d--;
        return obj;
    }

    public synchronized int f() {
        return this.f15390d;
    }

    public synchronized void g(long j10, Object obj) {
        try {
            int i10 = this.f15390d;
            if (i10 > 0) {
                if (j10 <= this.f15387a[((this.f15389c + i10) - 1) % this.f15388b.length]) {
                    synchronized (this) {
                        this.f15389c = 0;
                        this.f15390d = 0;
                        Arrays.fill(this.f15388b, (Object) null);
                    }
                }
            }
            int length = this.f15388b.length;
            if (this.f15390d >= length) {
                int i11 = length + length;
                long[] jArr = new long[i11];
                Object[] objArr = new Object[i11];
                int i12 = this.f15389c;
                int i13 = length - i12;
                System.arraycopy(this.f15387a, i12, jArr, 0, i13);
                System.arraycopy(this.f15388b, this.f15389c, objArr, 0, i13);
                int i14 = this.f15389c;
                if (i14 > 0) {
                    System.arraycopy(this.f15387a, 0, jArr, i13, i14);
                    System.arraycopy(this.f15388b, 0, objArr, i13, this.f15389c);
                }
                this.f15387a = jArr;
                this.f15388b = objArr;
                this.f15389c = 0;
            }
            int i15 = this.f15389c;
            int i16 = this.f15390d;
            Object[] objArr2 = this.f15388b;
            int length2 = (i15 + i16) % objArr2.length;
            this.f15387a[length2] = j10;
            objArr2[length2] = obj;
            this.f15390d = i16 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int h() {
        return this.f15390d;
    }

    public synchronized Object i() {
        if (this.f15390d == 0) {
            return null;
        }
        return k();
    }

    public synchronized Object j(long j10) {
        Object objK;
        objK = null;
        while (this.f15390d > 0 && j10 - this.f15387a[this.f15389c] >= 0) {
            objK = k();
        }
        return objK;
    }

    public Object k() {
        ps1.c0(this.f15390d > 0);
        Object[] objArr = this.f15388b;
        int i10 = this.f15389c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f15389c = (i10 + 1) % objArr.length;
        this.f15390d--;
        return obj;
    }
}
