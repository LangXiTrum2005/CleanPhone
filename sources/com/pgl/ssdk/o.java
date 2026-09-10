package com.pgl.ssdk;

/* JADX INFO: loaded from: classes5.dex */
public final class o<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f33480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f33481b;

    public o(A a2, B b2) {
        this.f33480a = a2;
        this.f33481b = b2;
    }

    public static <A, B> o<A, B> a(A a2, B b2) {
        return new o<>(a2, b2);
    }

    public B b() {
        return this.f33481b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a2 = this.f33480a;
        if (a2 == null) {
            if (oVar.f33480a != null) {
                return false;
            }
        } else if (!a2.equals(oVar.f33480a)) {
            return false;
        }
        B b2 = this.f33481b;
        if (b2 == null) {
            if (oVar.f33481b != null) {
                return false;
            }
        } else if (!b2.equals(oVar.f33481b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a2 = this.f33480a;
        int iHashCode = ((a2 == null ? 0 : a2.hashCode()) + 31) * 31;
        B b2 = this.f33481b;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public A a() {
        return this.f33480a;
    }
}
