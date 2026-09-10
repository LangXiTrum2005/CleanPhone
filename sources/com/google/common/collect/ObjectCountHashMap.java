package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f19938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f19939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f19940c;
    public transient int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int[] f19941e;
    public transient long[] f;
    public transient float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f19942h;

    public class MapEntry extends Multisets.AbstractEntry<K> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19943Y;

        public MapEntry(int i2) {
            this.X = ObjectCountHashMap.this.f19938a[i2];
            this.f19943Y = i2;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object d() {
            return this.X;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            int i2 = this.f19943Y;
            ObjectCountHashMap objectCountHashMap = ObjectCountHashMap.this;
            Object obj = this.X;
            if (i2 == -1 || i2 >= objectCountHashMap.f19940c || !Objects.a(obj, objectCountHashMap.f19938a[i2])) {
                this.f19943Y = objectCountHashMap.g(obj);
            }
            int i3 = this.f19943Y;
            if (i3 == -1) {
                return 0;
            }
            return objectCountHashMap.f19939b[i3];
        }
    }

    public ObjectCountHashMap(int i2, int i3) {
        h(i2);
    }

    public void a() {
        this.d++;
        Arrays.fill(this.f19938a, 0, this.f19940c, (Object) null);
        Arrays.fill(this.f19939b, 0, this.f19940c, 0);
        Arrays.fill(this.f19941e, -1);
        Arrays.fill(this.f, -1L);
        this.f19940c = 0;
    }

    public final void b(int i2) {
        if (i2 > this.f.length) {
            p(i2);
        }
        if (i2 >= this.f19942h) {
            q(Math.max(2, Integer.highestOneBit(i2 - 1) << 1));
        }
    }

    public int c() {
        return this.f19940c == 0 ? -1 : 0;
    }

    public final int d(Object obj) {
        int iG = g(obj);
        if (iG == -1) {
            return 0;
        }
        return this.f19939b[iG];
    }

    public final Object e(int i2) {
        Preconditions.i(i2, this.f19940c);
        return this.f19938a[i2];
    }

    public final int f(int i2) {
        Preconditions.i(i2, this.f19940c);
        return this.f19939b[i2];
    }

    public final int g(Object obj) {
        int iC = Hashing.c(obj);
        int[] iArr = this.f19941e;
        int i2 = iArr[(iArr.length - 1) & iC];
        while (i2 != -1) {
            long j = this.f[i2];
            if (((int) (j >>> 32)) == iC && Objects.a(obj, this.f19938a[i2])) {
                return i2;
            }
            i2 = (int) j;
        }
        return -1;
    }

    public void h(int i2) {
        Preconditions.e("Initial capacity must be non-negative", i2 >= 0);
        int iA = Hashing.a(i2, 1.0f);
        int[] iArr = new int[iA];
        Arrays.fill(iArr, -1);
        this.f19941e = iArr;
        this.g = 1.0f;
        this.f19938a = new Object[i2];
        this.f19939b = new int[i2];
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.f19942h = Math.max(1, (int) (iA * 1.0f));
    }

    public void i(int i2, int i3, int i4, Object obj) {
        this.f[i2] = (((long) i4) << 32) | 4294967295L;
        this.f19938a[i2] = obj;
        this.f19939b[i2] = i3;
    }

    public void j(int i2) {
        int i3 = this.f19940c - 1;
        if (i2 >= i3) {
            this.f19938a[i2] = null;
            this.f19939b[i2] = 0;
            this.f[i2] = -1;
            return;
        }
        Object[] objArr = this.f19938a;
        objArr[i2] = objArr[i3];
        int[] iArr = this.f19939b;
        iArr[i2] = iArr[i3];
        objArr[i3] = null;
        iArr[i3] = 0;
        long[] jArr = this.f;
        long j = jArr[i3];
        jArr[i2] = j;
        jArr[i3] = -1;
        int[] iArr2 = this.f19941e;
        int length = ((int) (j >>> 32)) & (iArr2.length - 1);
        int i4 = iArr2[length];
        if (i4 == i3) {
            iArr2[length] = i2;
            return;
        }
        while (true) {
            long[] jArr2 = this.f;
            long j2 = jArr2[i4];
            int i5 = (int) j2;
            if (i5 == i3) {
                jArr2[i4] = (j2 & (-4294967296L)) | (4294967295L & ((long) i2));
                return;
            }
            i4 = i5;
        }
    }

    public int k(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f19940c) {
            return i3;
        }
        return -1;
    }

    public int l(int i2, int i3) {
        return i2 - 1;
    }

    public final int m(int i2, Object obj) {
        CollectPreconditions.c(i2, "count");
        long[] jArr = this.f;
        Object[] objArr = this.f19938a;
        int[] iArr = this.f19939b;
        int iC = Hashing.c(obj);
        int[] iArr2 = this.f19941e;
        int length = (iArr2.length - 1) & iC;
        int i3 = this.f19940c;
        int i4 = iArr2[length];
        if (i4 == -1) {
            iArr2[length] = i3;
        } else {
            while (true) {
                long j = jArr[i4];
                if (((int) (j >>> 32)) == iC && Objects.a(obj, objArr[i4])) {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return i5;
                }
                int i6 = (int) j;
                if (i6 == -1) {
                    jArr[i4] = ((-4294967296L) & j) | (4294967295L & ((long) i3));
                    break;
                }
                i4 = i6;
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i3 + 1;
        int length2 = this.f.length;
        if (i7 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i8 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i8 != length2) {
                p(i8);
            }
        }
        i(i3, i2, iC, obj);
        this.f19940c = i7;
        if (i3 >= this.f19942h) {
            q(this.f19941e.length * 2);
        }
        this.d++;
        return 0;
    }

    public final int n(int i2, Object obj) {
        int[] iArr = this.f19941e;
        int length = (iArr.length - 1) & i2;
        int i3 = iArr[length];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (((int) (this.f[i3] >>> 32)) == i2 && Objects.a(obj, this.f19938a[i3])) {
                int i5 = this.f19939b[i3];
                if (i4 == -1) {
                    this.f19941e[length] = (int) this.f[i3];
                } else {
                    long[] jArr = this.f;
                    jArr[i4] = (jArr[i4] & (-4294967296L)) | (((long) ((int) jArr[i3])) & 4294967295L);
                }
                j(i3);
                this.f19940c--;
                this.d++;
                return i5;
            }
            int i6 = (int) this.f[i3];
            if (i6 == -1) {
                return 0;
            }
            i4 = i3;
            i3 = i6;
        }
    }

    public final int o(int i2) {
        return n((int) (this.f[i2] >>> 32), this.f19938a[i2]);
    }

    public void p(int i2) {
        this.f19938a = Arrays.copyOf(this.f19938a, i2);
        this.f19939b = Arrays.copyOf(this.f19939b, i2);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.f = jArrCopyOf;
    }

    public final void q(int i2) {
        if (this.f19941e.length >= 1073741824) {
            this.f19942h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.g)) + 1;
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f;
        int i4 = i2 - 1;
        for (int i5 = 0; i5 < this.f19940c; i5++) {
            int i6 = (int) (jArr[i5] >>> 32);
            int i7 = i6 & i4;
            int i8 = iArr[i7];
            iArr[i7] = i5;
            jArr[i5] = (((long) i6) << 32) | (((long) i8) & 4294967295L);
        }
        this.f19942h = i3;
        this.f19941e = iArr;
    }
}
