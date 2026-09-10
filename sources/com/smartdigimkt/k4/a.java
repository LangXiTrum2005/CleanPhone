package com.smartdigimkt.k4;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int f = 0;
    public static final int g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f36181h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f36182i = 3;
    public static final int j = 4;
    public static final a k = new a(new long[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f36184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0518a[] f36185c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36186e;

    /* JADX INFO: renamed from: com.smartdigimkt.k4.a$a, reason: collision with other inner class name */
    public static final class C0518a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri[] f36188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f36189c;
        public final long[] d;

        public C0518a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public int a() {
            return a(-1);
        }

        public boolean b() {
            return this.f36187a == -1 || a() < this.f36187a;
        }

        public C0518a c() {
            if (this.f36187a == -1) {
                return new C0518a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f36189c;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = iArrCopyOf[i2];
                if (i3 == 1 || i3 == 0) {
                    iArrCopyOf[i2] = 2;
                }
            }
            return new C0518a(length, iArrCopyOf, this.f36188b, this.d);
        }

        private C0518a(int i2, int[] iArr, Uri[] uriArr, long[] jArr) {
            com.smartdigimkt.p4.a.a(iArr.length == uriArr.length);
            this.f36187a = i2;
            this.f36189c = iArr;
            this.f36188b = uriArr;
            this.d = jArr;
        }

        public int a(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.f36189c;
                if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }

        public C0518a b(int i2) {
            com.smartdigimkt.p4.a.a(this.f36187a == -1 && this.f36189c.length <= i2);
            return new C0518a(i2, a(this.f36189c, i2), (Uri[]) Arrays.copyOf(this.f36188b, i2), a(this.d, i2));
        }

        public C0518a a(Uri uri, int i2) {
            int i3 = this.f36187a;
            com.smartdigimkt.p4.a.a(i3 == -1 || i2 < i3);
            int[] iArrA = a(this.f36189c, i2 + 1);
            com.smartdigimkt.p4.a.a(iArrA[i2] == 0);
            long[] jArrA = this.d;
            if (jArrA.length != iArrA.length) {
                jArrA = a(jArrA, iArrA.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f36188b, iArrA.length);
            uriArr[i2] = uri;
            iArrA[i2] = 1;
            return new C0518a(this.f36187a, iArrA, uriArr, jArrA);
        }

        public C0518a a(int i2, int i3) {
            int i4 = this.f36187a;
            com.smartdigimkt.p4.a.a(i4 == -1 || i3 < i4);
            int[] iArrA = a(this.f36189c, i3 + 1);
            int i5 = iArrA[i3];
            com.smartdigimkt.p4.a.a(i5 == 0 || i5 == 1 || i5 == i2);
            long[] jArrA = this.d;
            if (jArrA.length != iArrA.length) {
                jArrA = a(jArrA, iArrA.length);
            }
            Uri[] uriArr = this.f36188b;
            if (uriArr.length != iArrA.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrA.length);
            }
            iArrA[i3] = i2;
            return new C0518a(this.f36187a, iArrA, uriArr, jArrA);
        }

        public C0518a a(long[] jArr) {
            com.smartdigimkt.p4.a.a(this.f36187a == -1 || jArr.length <= this.f36188b.length);
            int length = jArr.length;
            Uri[] uriArr = this.f36188b;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            }
            return new C0518a(this.f36187a, this.f36189c, this.f36188b, jArr);
        }

        private static int[] a(int[] iArr, int i2) {
            int length = iArr.length;
            int iMax = Math.max(i2, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        private static long[] a(long[] jArr, int i2) {
            int length = jArr.length;
            int iMax = Math.max(i2, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public a(long... jArr) {
        int length = jArr.length;
        this.f36183a = length;
        this.f36184b = Arrays.copyOf(jArr, length);
        this.f36185c = new C0518a[length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f36185c[i2] = new C0518a();
        }
        this.d = 0L;
        this.f36186e = -9223372036854775807L;
    }

    public int a(long j2) {
        int i2 = 0;
        while (true) {
            long[] jArr = this.f36184b;
            if (i2 >= jArr.length) {
                break;
            }
            long j3 = jArr[i2];
            if (j3 == Long.MIN_VALUE || (j2 < j3 && this.f36185c[i2].b())) {
                break;
            }
            i2++;
        }
        if (i2 < this.f36184b.length) {
            return i2;
        }
        return -1;
    }

    public int b(long j2) {
        int length = this.f36184b.length - 1;
        while (length >= 0) {
            long j3 = this.f36184b[length];
            if (j3 != Long.MIN_VALUE && j3 <= j2) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.f36185c[length].b()) {
            return -1;
        }
        return length;
    }

    public a c(int i2, int i3) {
        C0518a[] c0518aArr = this.f36185c;
        C0518a[] c0518aArr2 = (C0518a[]) Arrays.copyOf(c0518aArr, c0518aArr.length);
        c0518aArr2[i2] = c0518aArr2[i2].a(3, i3);
        return new a(this.f36184b, c0518aArr2, this.d, this.f36186e);
    }

    public a d(int i2, int i3) {
        C0518a[] c0518aArr = this.f36185c;
        C0518a[] c0518aArr2 = (C0518a[]) Arrays.copyOf(c0518aArr, c0518aArr.length);
        c0518aArr2[i2] = c0518aArr2[i2].a(2, i3);
        return new a(this.f36184b, c0518aArr2, this.d, this.f36186e);
    }

    public a a(int i2, int i3) {
        com.smartdigimkt.p4.a.a(i3 > 0);
        C0518a[] c0518aArr = this.f36185c;
        if (c0518aArr[i2].f36187a == i3) {
            return this;
        }
        C0518a[] c0518aArr2 = (C0518a[]) Arrays.copyOf(c0518aArr, c0518aArr.length);
        c0518aArr2[i2] = this.f36185c[i2].b(i3);
        return new a(this.f36184b, c0518aArr2, this.d, this.f36186e);
    }

    public a b(int i2, int i3) {
        C0518a[] c0518aArr = this.f36185c;
        C0518a[] c0518aArr2 = (C0518a[]) Arrays.copyOf(c0518aArr, c0518aArr.length);
        c0518aArr2[i2] = c0518aArr2[i2].a(4, i3);
        return new a(this.f36184b, c0518aArr2, this.d, this.f36186e);
    }

    public a c(long j2) {
        return this.d == j2 ? this : new a(this.f36184b, this.f36185c, j2, this.f36186e);
    }

    public a d(long j2) {
        return this.f36186e == j2 ? this : new a(this.f36184b, this.f36185c, this.d, j2);
    }

    private a(long[] jArr, C0518a[] c0518aArr, long j2, long j3) {
        this.f36183a = c0518aArr.length;
        this.f36184b = jArr;
        this.f36185c = c0518aArr;
        this.d = j2;
        this.f36186e = j3;
    }

    public a a(int i2, int i3, Uri uri) {
        C0518a[] c0518aArr = this.f36185c;
        C0518a[] c0518aArr2 = (C0518a[]) Arrays.copyOf(c0518aArr, c0518aArr.length);
        c0518aArr2[i2] = c0518aArr2[i2].a(uri, i3);
        return new a(this.f36184b, c0518aArr2, this.d, this.f36186e);
    }

    public a a(int i2) {
        C0518a[] c0518aArr = this.f36185c;
        C0518a[] c0518aArr2 = (C0518a[]) Arrays.copyOf(c0518aArr, c0518aArr.length);
        c0518aArr2[i2] = c0518aArr2[i2].c();
        return new a(this.f36184b, c0518aArr2, this.d, this.f36186e);
    }

    public a a(long[][] jArr) {
        C0518a[] c0518aArr = this.f36185c;
        C0518a[] c0518aArr2 = (C0518a[]) Arrays.copyOf(c0518aArr, c0518aArr.length);
        for (int i2 = 0; i2 < this.f36183a; i2++) {
            c0518aArr2[i2] = c0518aArr2[i2].a(jArr[i2]);
        }
        return new a(this.f36184b, c0518aArr2, this.d, this.f36186e);
    }
}
