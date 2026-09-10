package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class N30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q30 f3437a;
    public final Q30 b;

    public N30(Q30 q30, Q30 q31) {
        this.f3437a = q30;
        this.b = q31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N30.class != obj.getClass()) {
            return false;
        }
        N30 n30 = (N30) obj;
        return this.f3437a.equals(n30.f3437a) && this.b.equals(n30.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3437a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        Q30 q30 = this.f3437a;
        sb.append(q30);
        Q30 q31 = this.b;
        if (q30.equals(q31)) {
            str = "";
        } else {
            str = ", " + q31;
        }
        return DM.m(sb, str, "]");
    }
}
