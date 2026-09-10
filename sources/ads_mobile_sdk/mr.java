package ads_mobile_sdk;

import saneness.attraction;
import saneness.polder;
import saneness.transpositive;

/* JADX INFO: loaded from: classes.dex */
public abstract class mr extends polder {
    public static final boolean b = n53.e;
    public nr a;

    public static long b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int c(int i) {
        return h(i) + 4;
    }

    public static int d(int i) {
        return h(i) + 8;
    }

    public static int e(int i) {
        return h(i) + 4;
    }

    public static int f(int i) {
        return h(i) + 4;
    }

    public static int g(int i) {
        return h(i) + 8;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public final void a() {
        if (b() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (b() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void a(byte b2);

    public abstract void a(int i, boolean z);

    public abstract void a(String str);

    public abstract void a(byte[] bArr, int i);

    public abstract int b();

    public abstract void b(int i, kn knVar);

    public abstract void b(kn knVar);

    public abstract void b(String str, int i);

    public abstract void b(transpositive transpositiveVar);

    public abstract void c(long j);

    public abstract void d(int i, long j);

    public abstract void d(long j);

    public abstract void e(int i, int i2);

    public abstract void e(int i, long j);

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void k(int i);

    public abstract void l(int i);

    public abstract void m(int i);

    public static int b(int i) {
        return h(i) + 8;
    }

    public static int c(int i, int i2) {
        return i(j(i2)) + h(i);
    }

    public static int d(int i, int i2) {
        return i(i2) + h(i);
    }

    public static int b(int i, int i2) {
        return a(i2) + h(i);
    }

    public static int c(int i, long j) {
        return a(j) + h(i);
    }

    public static int a(int i) {
        return h(i) + 1;
    }

    public static int b(int i, long j) {
        return a(b(j)) + h(i);
    }

    public static int a(int i, kn knVar) {
        return a(knVar) + h(i);
    }

    public static int a(kn knVar) {
        int size = knVar.size();
        return i(size) + size;
    }

    public static int a(int i, int i2) {
        return a(i2) + h(i);
    }

    public static int a(int i, long j) {
        return a(j) + h(i);
    }

    public static int a(transpositive transpositiveVar) {
        int iA = ((xm0) transpositiveVar).a((attraction) null);
        return i(iA) + iA;
    }

    public static int a(String str, int i) {
        int iH = h(i);
        int iA = t63.a(str);
        return i(iA) + iA + iH;
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }
}
