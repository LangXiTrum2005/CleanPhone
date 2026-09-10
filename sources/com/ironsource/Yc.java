package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f28029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f28030b;

    public Yc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.f28029a;
    }

    public final Integer b() {
        return this.f28030b;
    }

    public final Boolean c() {
        return this.f28029a;
    }

    public final Integer d() {
        return this.f28030b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yc)) {
            return false;
        }
        Yc yc2 = (Yc) obj;
        return kotlin.jvm.internal.n.a(this.f28029a, yc2.f28029a) && kotlin.jvm.internal.n.a(this.f28030b, yc2.f28030b);
    }

    public int hashCode() {
        Boolean bool = this.f28029a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f28030b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PacingConfig2(enabled=" + this.f28029a + ", minTimeBetweenShowsSeconds=" + this.f28030b + ")";
    }

    public Yc(Boolean bool, Integer num) {
        this.f28029a = bool;
        this.f28030b = num;
    }

    public final Yc a(Boolean bool, Integer num) {
        return new Yc(bool, num);
    }

    public /* synthetic */ Yc(Boolean bool, Integer num, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : num);
    }

    public static /* synthetic */ Yc a(Yc yc2, Boolean bool, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = yc2.f28029a;
        }
        if ((i10 & 2) != 0) {
            num = yc2.f28030b;
        }
        return yc2.a(bool, num);
    }
}
