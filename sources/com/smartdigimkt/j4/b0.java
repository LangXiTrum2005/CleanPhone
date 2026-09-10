package com.smartdigimkt.j4;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends com.smartdigimkt.w3.e0 {
    private static final Object k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f35941c;
    private final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f35942e;
    private final long f;
    private final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f35943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f35944i;
    private final Object j;

    public b0(long j, boolean z2, boolean z3) {
        this(j, z2, z3, null);
    }

    @Override // com.smartdigimkt.w3.e0
    public int a() {
        return 1;
    }

    @Override // com.smartdigimkt.w3.e0
    public int b() {
        return 1;
    }

    public b0(long j, boolean z2, boolean z3, Object obj) {
        this(j, j, 0L, 0L, z2, z3, obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[PHI: r1
  0x0031: PHI (r1v4 long) = (r1v3 long), (r1v3 long), (r1v7 long) binds: [B:8:0x0015, B:10:0x001b, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.smartdigimkt.w3.e0
    public com.smartdigimkt.w3.e0.c a(int i2, com.smartdigimkt.w3.e0.c cVar, boolean z2, long j) {
        long j2;
        com.smartdigimkt.p4.a.a(i2, 0, 1);
        Object obj = z2 ? this.j : null;
        long j3 = this.g;
        boolean z3 = this.f35944i;
        if (!z3 || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f35942e;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        return cVar.a(obj, this.f35940b, this.f35941c, this.f35943h, z3, j2, this.f35942e, 0, 0, this.f);
    }

    public b0(long j, long j2, long j3, long j4, boolean z2, boolean z3, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z2, z3, obj);
    }

    public b0(long j, long j2, long j3, long j4, long j5, long j6, boolean z2, boolean z3, Object obj) {
        this.f35940b = j;
        this.f35941c = j2;
        this.d = j3;
        this.f35942e = j4;
        this.f = j5;
        this.g = j6;
        this.f35943h = z2;
        this.f35944i = z3;
        this.j = obj;
    }

    @Override // com.smartdigimkt.w3.e0
    public com.smartdigimkt.w3.e0.b a(int i2, com.smartdigimkt.w3.e0.b bVar, boolean z2) {
        com.smartdigimkt.p4.a.a(i2, 0, 1);
        return bVar.a(null, z2 ? k : null, 0, this.d, -this.f);
    }

    @Override // com.smartdigimkt.w3.e0
    public int a(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }
}
