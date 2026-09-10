package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5226zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RW f5344a;
    public final int b;
    public final int c;

    public C5226zo(Class cls, int i, int i2) {
        this(RW.a(cls), i, i2);
    }

    public static C5226zo a(Class cls) {
        return new C5226zo(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5226zo)) {
            return false;
        }
        C5226zo c5226zo = (C5226zo) obj;
        return this.f5344a.equals(c5226zo.f5344a) && this.b == c5226zo.b && this.c == c5226zo.c;
    }

    public final int hashCode() {
        return ((((this.f5344a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f5344a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = com.umeng.analytics.pro.f.M;
        } else {
            if (i2 != 2) {
                throw new AssertionError(AbstractC3950lJ.p("Unsupported injection: ", i2));
            }
            str2 = "deferred";
        }
        return DM.m(sb, str2, "}");
    }

    public C5226zo(RW rw, int i, int i2) {
        this.f5344a = rw;
        this.b = i;
        this.c = i2;
    }
}
