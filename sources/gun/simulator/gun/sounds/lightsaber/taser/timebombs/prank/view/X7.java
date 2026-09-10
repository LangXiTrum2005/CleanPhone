package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class X7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3958a;

    public X7(C4396qP c4396qP) {
        this.f3958a = c4396qP;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X7)) {
            return false;
        }
        X7 x7 = (X7) obj;
        x7.getClass();
        if (this.f3958a.equals(x7.f3958a)) {
            Object obj2 = HV.f3174a;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return HV.f3174a.hashCode() ^ (((1000003 * 1000003) ^ this.f3958a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f3958a + ", priority=" + HV.f3174a + "}";
    }
}
