package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2907a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f = "";

    public C5(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f2907a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5)) {
            return false;
        }
        C5 c5 = (C5) obj;
        return AbstractC2995aW.i(this.f2907a, c5.f2907a) && AbstractC2995aW.i(this.b, c5.b) && AbstractC2995aW.i(this.c, c5.c) && AbstractC2995aW.i(this.d, c5.d) && AbstractC2995aW.i(this.e, c5.e) && AbstractC2995aW.i(this.f, c5.f);
    }

    public final int hashCode() {
        int iHashCode = this.f2907a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return this.f.hashCode() + ((iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AppInfoResourcePushInner(packageName=" + this.f2907a + ", icon=" + this.b + ", bigIcon=" + this.c + ", title=" + this.d + ", content=" + this.e + ", utmPushInner=" + this.f + ")";
    }
}
