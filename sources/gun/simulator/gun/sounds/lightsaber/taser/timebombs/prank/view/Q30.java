package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Q30 {
    public static final Q30 c = new Q30(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3588a;
    public final long b;

    public Q30(long j, long j2) {
        this.f3588a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q30.class != obj.getClass()) {
            return false;
        }
        Q30 q30 = (Q30) obj;
        return this.f3588a == q30.f3588a && this.b == q30.b;
    }

    public final int hashCode() {
        return (((int) this.f3588a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f3588a);
        sb.append(", position=");
        return AbstractC3950lJ.s(sb, this.b, "]");
    }
}
