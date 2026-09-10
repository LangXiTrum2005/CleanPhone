package com.smartdigimkt.w3;

import android.util.Pair;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f39262a = new a();

    public class a extends e0 {
        @Override // com.smartdigimkt.w3.e0
        public int a() {
            return 0;
        }

        @Override // com.smartdigimkt.w3.e0
        public int b() {
            return 0;
        }

        @Override // com.smartdigimkt.w3.e0
        public int a(Object obj) {
            return -1;
        }

        @Override // com.smartdigimkt.w3.e0
        public c a(int i2, c cVar, boolean z2, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.smartdigimkt.w3.e0
        public b a(int i2, b bVar, boolean z2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f39263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f39264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39265c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f39266e;
        private com.smartdigimkt.k4.a f;

        public b a(Object obj, Object obj2, int i2, long j, long j2) {
            return a(obj, obj2, i2, j, j2, com.smartdigimkt.k4.a.k);
        }

        public long b(int i2) {
            return this.f.f36184b[i2];
        }

        public long c() {
            return com.smartdigimkt.w3.b.b(this.d);
        }

        public long d() {
            return this.d;
        }

        public long e() {
            return com.smartdigimkt.w3.b.b(this.f39266e);
        }

        public long f() {
            return this.f39266e;
        }

        public b a(Object obj, Object obj2, int i2, long j, long j2, com.smartdigimkt.k4.a aVar) {
            this.f39263a = obj;
            this.f39264b = obj2;
            this.f39265c = i2;
            this.d = j;
            this.f39266e = j2;
            this.f = aVar;
            return this;
        }

        public int b(int i2, int i3) {
            return this.f.f36185c[i2].a(i3);
        }

        public int c(int i2) {
            return this.f.f36185c[i2].a();
        }

        public boolean d(int i2) {
            return !this.f.f36185c[i2].b();
        }

        public int b(long j) {
            return this.f.b(j);
        }

        public boolean c(int i2, int i3) {
            com.smartdigimkt.k4.a.C0518a c0518a = this.f.f36185c[i2];
            return (c0518a.f36187a == -1 || c0518a.f36189c[i3] == 0) ? false : true;
        }

        public long b() {
            return this.f.d;
        }

        public int a() {
            return this.f.f36183a;
        }

        public int a(long j) {
            return this.f.a(j);
        }

        public int a(int i2) {
            return this.f.f36185c[i2].f36187a;
        }

        public long a(int i2, int i3) {
            com.smartdigimkt.k4.a.C0518a c0518a = this.f.f36185c[i2];
            if (c0518a.f36187a != -1) {
                return c0518a.d[i3];
            }
            return -9223372036854775807L;
        }
    }

    public abstract int a();

    public int a(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == b(z2)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == b(z2) ? a(z2) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public abstract int a(Object obj);

    public abstract b a(int i2, b bVar, boolean z2);

    public abstract c a(int i2, c cVar, boolean z2, long j);

    public abstract int b();

    public int b(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == a(z2)) {
                return -1;
            }
            return i2 - 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == a(z2) ? b(z2) : i2 - 1;
        }
        throw new IllegalStateException();
    }

    public final boolean c() {
        return b() == 0;
    }

    public int a(boolean z2) {
        return c() ? -1 : 0;
    }

    public int b(boolean z2) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final c a(int i2, c cVar) {
        return a(i2, cVar, false);
    }

    public final boolean b(int i2, b bVar, c cVar, int i3, boolean z2) {
        return a(i2, bVar, cVar, i3, z2) == -1;
    }

    public final c a(int i2, c cVar, boolean z2) {
        return a(i2, cVar, z2, 0L);
    }

    public final int a(int i2, b bVar, c cVar, int i3, boolean z2) {
        int i4 = a(i2, bVar).f39265c;
        if (a(i4, cVar).g != i2) {
            return i2 + 1;
        }
        int iA = a(i4, i3, z2);
        if (iA == -1) {
            return -1;
        }
        return a(iA, cVar).f;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f39267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f39268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f39269c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39270e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f39271h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f39272i;
        public long j;

        public c a(Object obj, long j, long j2, boolean z2, boolean z3, long j3, long j4, int i2, int i3, long j5) {
            this.f39267a = obj;
            this.f39268b = j;
            this.f39269c = j2;
            this.d = z2;
            this.f39270e = z3;
            this.f39271h = j3;
            this.f39272i = j4;
            this.f = i2;
            this.g = i3;
            this.j = j5;
            return this;
        }

        public long b() {
            return this.f39271h;
        }

        public long c() {
            return com.smartdigimkt.w3.b.b(this.f39272i);
        }

        public long d() {
            return this.f39272i;
        }

        public long e() {
            return com.smartdigimkt.w3.b.b(this.j);
        }

        public long f() {
            return this.j;
        }

        public long a() {
            return com.smartdigimkt.w3.b.b(this.f39271h);
        }
    }

    public final Pair<Integer, Long> a(c cVar, b bVar, int i2, long j) {
        return a(cVar, bVar, i2, j, 0L);
    }

    public final Pair<Integer, Long> a(c cVar, b bVar, int i2, long j, long j2) {
        com.smartdigimkt.p4.a.a(i2, 0, b());
        a(i2, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = cVar.f;
        long jF = cVar.f() + j;
        long jD = a(i3, bVar).d();
        while (jD != -9223372036854775807L && jF >= jD && i3 < cVar.g) {
            jF -= jD;
            i3++;
            jD = a(i3, bVar).d();
        }
        return Pair.create(Integer.valueOf(i3), Long.valueOf(jF));
    }

    public final b a(int i2, b bVar) {
        return a(i2, bVar, false);
    }
}
