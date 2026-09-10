package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0282c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f28368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28369c;

    /* JADX INFO: renamed from: com.ironsource.c9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f28370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f28371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f28372c;

        public a(long j10, long j11, long j12) {
            this.f28370a = j10;
            this.f28371b = j11;
            this.f28372c = j12;
        }

        public final long a() {
            return this.f28370a;
        }

        public final long b() {
            return this.f28371b;
        }

        public final long c() {
            return this.f28372c;
        }

        public final long d() {
            return this.f28370a;
        }

        public final long e() {
            return this.f28371b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28370a == aVar.f28370a && this.f28371b == aVar.f28371b && this.f28372c == aVar.f28372c;
        }

        public final long f() {
            return this.f28372c;
        }

        public int hashCode() {
            return Long.hashCode(this.f28372c) + com.applovin.impl.ca.j(this.f28371b, Long.hashCode(this.f28370a) * 31, 31);
        }

        public String toString() {
            long j10 = this.f28370a;
            long j11 = this.f28371b;
            long j12 = this.f28372c;
            StringBuilder sbL = wi.d.l(j10, "Memory(javaHeapKb=", ", nativeHeapKb=");
            sbL.append(j11);
            sbL.append(", sharedOtherKb=");
            sbL.append(j12);
            sbL.append(")");
            return sbL.toString();
        }

        public final a a(long j10, long j11, long j12) {
            return new a(j10, j11, j12);
        }

        public static /* synthetic */ a a(a aVar, long j10, long j11, long j12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = aVar.f28370a;
            }
            long j13 = j10;
            if ((i10 & 2) != 0) {
                j11 = aVar.f28371b;
            }
            long j14 = j11;
            if ((i10 & 4) != 0) {
                j12 = aVar.f28372c;
            }
            return aVar.a(j13, j14, j12);
        }
    }

    public C0282c9(long j10, a memory, long j11) {
        kotlin.jvm.internal.n.f(memory, "memory");
        this.f28367a = j10;
        this.f28368b = memory;
        this.f28369c = j11;
    }

    public final long a() {
        return this.f28367a;
    }

    public final a b() {
        return this.f28368b;
    }

    public final long c() {
        return this.f28369c;
    }

    public final long d() {
        return this.f28369c;
    }

    public final a e() {
        return this.f28368b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0282c9)) {
            return false;
        }
        C0282c9 c0282c9 = (C0282c9) obj;
        return this.f28367a == c0282c9.f28367a && kotlin.jvm.internal.n.a(this.f28368b, c0282c9.f28368b) && this.f28369c == c0282c9.f28369c;
    }

    public final long f() {
        return this.f28367a;
    }

    public int hashCode() {
        return Long.hashCode(this.f28369c) + ((this.f28368b.hashCode() + (Long.hashCode(this.f28367a) * 31)) * 31);
    }

    public String toString() {
        return "InitParsingMetrics(parsingDurationMs=" + this.f28367a + ", memory=" + this.f28368b + ", initResponseJsonSizeKb=" + this.f28369c + ")";
    }

    public final C0282c9 a(long j10, a memory, long j11) {
        kotlin.jvm.internal.n.f(memory, "memory");
        return new C0282c9(j10, memory, j11);
    }

    public static /* synthetic */ C0282c9 a(C0282c9 c0282c9, long j10, a aVar, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c0282c9.f28367a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            aVar = c0282c9.f28368b;
        }
        a aVar2 = aVar;
        if ((i10 & 4) != 0) {
            j11 = c0282c9.f28369c;
        }
        return c0282c9.a(j12, aVar2, j11);
    }
}
