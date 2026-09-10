package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3587h8 extends AbstractC5013xR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC4925wR f4447a;
    public final EnumC4837vR b;

    public C3587h8(EnumC4925wR enumC4925wR, EnumC4837vR enumC4837vR) {
        this.f4447a = enumC4925wR;
        this.b = enumC4837vR;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5013xR)) {
            return false;
        }
        AbstractC5013xR abstractC5013xR = (AbstractC5013xR) obj;
        EnumC4925wR enumC4925wR = this.f4447a;
        if (enumC4925wR != null ? enumC4925wR.equals(((C3587h8) abstractC5013xR).f4447a) : ((C3587h8) abstractC5013xR).f4447a == null) {
            EnumC4837vR enumC4837vR = this.b;
            if (enumC4837vR == null) {
                if (((C3587h8) abstractC5013xR).b == null) {
                    return true;
                }
            } else if (enumC4837vR.equals(((C3587h8) abstractC5013xR).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC4925wR enumC4925wR = this.f4447a;
        int iHashCode = ((enumC4925wR == null ? 0 : enumC4925wR.hashCode()) ^ 1000003) * 1000003;
        EnumC4837vR enumC4837vR = this.b;
        return (enumC4837vR != null ? enumC4837vR.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f4447a + ", mobileSubtype=" + this.b + "}";
    }
}
