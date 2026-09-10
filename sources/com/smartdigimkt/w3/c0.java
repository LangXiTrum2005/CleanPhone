package com.smartdigimkt.w3;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f39230c;
    public static final c0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f39231e;
    public static final c0 f;
    public static final c0 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39233b;

    static {
        c0 c0Var = new c0(0L, 0L);
        f39230c = c0Var;
        d = new c0(Long.MAX_VALUE, Long.MAX_VALUE);
        f39231e = new c0(Long.MAX_VALUE, 0L);
        f = new c0(0L, Long.MAX_VALUE);
        g = c0Var;
    }

    public c0(long j, long j2) {
        com.smartdigimkt.p4.a.a(j >= 0);
        com.smartdigimkt.p4.a.a(j2 >= 0);
        this.f39232a = j;
        this.f39233b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f39232a == c0Var.f39232a && this.f39233b == c0Var.f39233b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f39232a) * 31) + ((int) this.f39233b);
    }
}
