package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TimedValueQueue<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f5677a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f5678b = new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5679c;
    public int d;

    public final synchronized void a(long j, Object obj) {
        int i2 = this.d;
        if (i2 > 0) {
            if (j <= this.f5677a[((this.f5679c + i2) - 1) % this.f5678b.length]) {
                b();
            }
        }
        c();
        int i3 = this.f5679c;
        int i4 = this.d;
        Object[] objArr = this.f5678b;
        int length = (i3 + i4) % objArr.length;
        this.f5677a[length] = j;
        objArr[length] = obj;
        this.d = i4 + 1;
    }

    public final synchronized void b() {
        this.f5679c = 0;
        this.d = 0;
        Arrays.fill(this.f5678b, (Object) null);
    }

    public final void c() {
        int length = this.f5678b.length;
        if (this.d < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        Object[] objArr = new Object[i2];
        int i3 = this.f5679c;
        int i4 = length - i3;
        System.arraycopy(this.f5677a, i3, jArr, 0, i4);
        System.arraycopy(this.f5678b, this.f5679c, objArr, 0, i4);
        int i5 = this.f5679c;
        if (i5 > 0) {
            System.arraycopy(this.f5677a, 0, jArr, i4, i5);
            System.arraycopy(this.f5678b, 0, objArr, i4, this.f5679c);
        }
        this.f5677a = jArr;
        this.f5678b = objArr;
        this.f5679c = 0;
    }

    public final Object d(long j, boolean z2) {
        Object objG = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.f5677a[this.f5679c];
            if (j3 < 0 && (z2 || (-j3) >= j2)) {
                break;
            }
            objG = g();
            j2 = j3;
        }
        return objG;
    }

    public final synchronized Object e() {
        return this.d == 0 ? null : g();
    }

    public final synchronized Object f(long j) {
        return d(j, true);
    }

    public final Object g() {
        Assertions.e(this.d > 0);
        Object[] objArr = this.f5678b;
        int i2 = this.f5679c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f5679c = (i2 + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public final synchronized int h() {
        return this.d;
    }
}
