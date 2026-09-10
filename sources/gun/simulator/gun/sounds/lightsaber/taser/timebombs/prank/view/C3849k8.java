package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3849k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2438Gf f4588a;
    public final Map b;

    public C3849k8(InterfaceC2438Gf interfaceC2438Gf, Map map) {
        if (interfaceC2438Gf == null) {
            throw new NullPointerException("Null clock");
        }
        this.f4588a = interfaceC2438Gf;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    public final long a(HV hv, long j, int i) {
        long jA = j - ((C5211zg0) this.f4588a).a();
        C3937l8 c3937l8 = (C3937l8) this.b.get(hv);
        long j2 = c3937l8.f4634a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jA), c3937l8.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3849k8)) {
            return false;
        }
        C3849k8 c3849k8 = (C3849k8) obj;
        return this.f4588a.equals(c3849k8.f4588a) && this.b.equals(c3849k8.b);
    }

    public final int hashCode() {
        return ((this.f4588a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4588a + ", values=" + this.b + "}";
    }
}
