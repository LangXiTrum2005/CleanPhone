package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0670y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f31095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f31097c;

    public C0670y3() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.f31095a;
    }

    public final String b() {
        return this.f31096b;
    }

    public final Integer c() {
        return this.f31097c;
    }

    public final Boolean d() {
        return this.f31095a;
    }

    public final Integer e() {
        return this.f31097c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0670y3)) {
            return false;
        }
        C0670y3 c0670y3 = (C0670y3) obj;
        return kotlin.jvm.internal.n.a(this.f31095a, c0670y3.f31095a) && kotlin.jvm.internal.n.a(this.f31096b, c0670y3.f31096b) && kotlin.jvm.internal.n.a(this.f31097c, c0670y3.f31097c);
    }

    public final String f() {
        return this.f31096b;
    }

    public int hashCode() {
        Boolean bool = this.f31095a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f31096b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f31097c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CappingConfig2(enabled=" + this.f31095a + ", unit=" + this.f31096b + ", maxImpressions=" + this.f31097c + ")";
    }

    public C0670y3(Boolean bool, String str, Integer num) {
        this.f31095a = bool;
        this.f31096b = str;
        this.f31097c = num;
    }

    public final C0670y3 a(Boolean bool, String str, Integer num) {
        return new C0670y3(bool, str, num);
    }

    public static /* synthetic */ C0670y3 a(C0670y3 c0670y3, Boolean bool, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = c0670y3.f31095a;
        }
        if ((i10 & 2) != 0) {
            str = c0670y3.f31096b;
        }
        if ((i10 & 4) != 0) {
            num = c0670y3.f31097c;
        }
        return c0670y3.a(bool, str, num);
    }

    public /* synthetic */ C0670y3(Boolean bool, String str, Integer num, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num);
    }
}
