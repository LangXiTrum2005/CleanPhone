package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0465md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f29259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f29261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f29263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f29264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0670y3 f29265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Yc f29266h;

    public C0465md() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer a() {
        return this.f29259a;
    }

    public final String b() {
        return this.f29260b;
    }

    public final Boolean c() {
        return this.f29261c;
    }

    public final String d() {
        return this.f29262d;
    }

    public final Integer e() {
        return this.f29263e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0465md)) {
            return false;
        }
        C0465md c0465md = (C0465md) obj;
        return kotlin.jvm.internal.n.a(this.f29259a, c0465md.f29259a) && kotlin.jvm.internal.n.a(this.f29260b, c0465md.f29260b) && kotlin.jvm.internal.n.a(this.f29261c, c0465md.f29261c) && kotlin.jvm.internal.n.a(this.f29262d, c0465md.f29262d) && kotlin.jvm.internal.n.a(this.f29263e, c0465md.f29263e) && kotlin.jvm.internal.n.a(this.f29264f, c0465md.f29264f) && kotlin.jvm.internal.n.a(this.f29265g, c0465md.f29265g) && kotlin.jvm.internal.n.a(this.f29266h, c0465md.f29266h);
    }

    public final Boolean f() {
        return this.f29264f;
    }

    public final C0670y3 g() {
        return this.f29265g;
    }

    public final Yc h() {
        return this.f29266h;
    }

    public int hashCode() {
        Integer num = this.f29259a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f29260b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f29261c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f29262d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f29263e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f29264f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C0670y3 c0670y3 = this.f29265g;
        int iHashCode7 = (iHashCode6 + (c0670y3 == null ? 0 : c0670y3.hashCode())) * 31;
        Yc yc2 = this.f29266h;
        return iHashCode7 + (yc2 != null ? yc2.hashCode() : 0);
    }

    public final C0670y3 i() {
        return this.f29265g;
    }

    public final Boolean j() {
        return this.f29264f;
    }

    public final Yc k() {
        return this.f29266h;
    }

    public final Integer l() {
        return this.f29259a;
    }

    public final String m() {
        return this.f29260b;
    }

    public final Integer n() {
        return this.f29263e;
    }

    public final String o() {
        return this.f29262d;
    }

    public final Boolean p() {
        return this.f29261c;
    }

    public String toString() {
        return "PlacementConfig2(placementId=" + this.f29259a + ", placementName=" + this.f29260b + ", isDefault=" + this.f29261c + ", virtualItemName=" + this.f29262d + ", virtualItemCount=" + this.f29263e + ", delivery=" + this.f29264f + ", capping=" + this.f29265g + ", pacing=" + this.f29266h + ")";
    }

    public C0465md(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0670y3 c0670y3, Yc yc2) {
        this.f29259a = num;
        this.f29260b = str;
        this.f29261c = bool;
        this.f29262d = str2;
        this.f29263e = num2;
        this.f29264f = bool2;
        this.f29265g = c0670y3;
        this.f29266h = yc2;
    }

    public final C0465md a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0670y3 c0670y3, Yc yc2) {
        return new C0465md(num, str, bool, str2, num2, bool2, c0670y3, yc2);
    }

    public static /* synthetic */ C0465md a(C0465md c0465md, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0670y3 c0670y3, Yc yc2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = c0465md.f29259a;
        }
        if ((i10 & 2) != 0) {
            str = c0465md.f29260b;
        }
        if ((i10 & 4) != 0) {
            bool = c0465md.f29261c;
        }
        if ((i10 & 8) != 0) {
            str2 = c0465md.f29262d;
        }
        if ((i10 & 16) != 0) {
            num2 = c0465md.f29263e;
        }
        if ((i10 & 32) != 0) {
            bool2 = c0465md.f29264f;
        }
        if ((i10 & 64) != 0) {
            c0670y3 = c0465md.f29265g;
        }
        if ((i10 & 128) != 0) {
            yc2 = c0465md.f29266h;
        }
        C0670y3 c0670y4 = c0670y3;
        Yc yc3 = yc2;
        Integer num3 = num2;
        Boolean bool3 = bool2;
        return c0465md.a(num, str, bool, str2, num3, bool3, c0670y4, yc3);
    }

    public /* synthetic */ C0465md(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0670y3 c0670y3, Yc yc2, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : bool2, (i10 & 64) != 0 ? null : c0670y3, (i10 & 128) != 0 ? null : yc2);
    }
}
