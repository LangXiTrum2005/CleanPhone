package xd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f53748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f53749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f53750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f53751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f53752e;

    public /* synthetic */ g(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l) {
        if (31 != (i10 & 31)) {
            rn.k.a(i10, 31, e.f53747a.d());
            throw null;
        }
        this.f53748a = bool;
        this.f53749b = d10;
        this.f53750c = num;
        this.f53751d = num2;
        this.f53752e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.n.a(this.f53748a, gVar.f53748a) && kotlin.jvm.internal.n.a(this.f53749b, gVar.f53749b) && kotlin.jvm.internal.n.a(this.f53750c, gVar.f53750c) && kotlin.jvm.internal.n.a(this.f53751d, gVar.f53751d) && kotlin.jvm.internal.n.a(this.f53752e, gVar.f53752e);
    }

    public final int hashCode() {
        Boolean bool = this.f53748a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f53749b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f53750c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f53751d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f53752e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f53748a + ", sessionSamplingRate=" + this.f53749b + ", sessionTimeoutSeconds=" + this.f53750c + ", cacheDurationSeconds=" + this.f53751d + ", cacheUpdatedTimeSeconds=" + this.f53752e + ')';
    }

    public g(Boolean bool, Double d10, Integer num, Integer num2, Long l) {
        this.f53748a = bool;
        this.f53749b = d10;
        this.f53750c = num;
        this.f53751d = num2;
        this.f53752e = l;
    }
}
