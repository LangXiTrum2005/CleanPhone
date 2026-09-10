package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26315a;

    public J0(long j10) {
        this.f26315a = j10;
    }

    public final long a() {
        return this.f26315a;
    }

    public final long b() {
        return this.f26315a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J0) && this.f26315a == ((J0) obj).f26315a;
    }

    public int hashCode() {
        return Long.hashCode(this.f26315a);
    }

    public String toString() {
        return defpackage.e.j(this.f26315a, "AdUnitInteractionData(impressionTimeout=", ")");
    }

    public final J0 a(long j10) {
        return new J0(j10);
    }

    public static /* synthetic */ J0 a(J0 j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j11 = j10.f26315a;
        }
        return j10.a(j11);
    }
}
