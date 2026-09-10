package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class QN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3600a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final FC i;
    public final PN j;

    public QN(ON on, FC fc, PN pn) {
        this.f3600a = on.f3502a;
        this.b = on.b;
        this.c = on.c;
        this.d = on.d;
        this.f = on.g;
        this.g = on.h;
        this.e = on.f;
        this.h = on.i;
        this.i = fc;
        this.j = pn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QN.class != obj.getClass()) {
            return false;
        }
        QN qn = (QN) obj;
        if (this.f3600a.equals(qn.f3600a) && this.b == qn.b && this.c.equals(qn.c) && this.d == qn.d && this.e == qn.e) {
            FC fc = this.i;
            fc.getClass();
            if (FW.D(fc, qn.i) && this.j.equals(qn.j) && Ug0.a(this.f, qn.f) && Ug0.a(this.g, qn.g) && Ug0.a(this.h, qn.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + ((this.i.hashCode() + ((((DM.d(this.c, (DM.d(this.f3600a, EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, 31) + this.b) * 31, 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
