package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4053a;
    public final long b;

    public Z2(long j, long j2) {
        this.f4053a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z2)) {
            return false;
        }
        Z2 z2 = (Z2) obj;
        return this.f4053a == z2.f4053a && this.b == z2.b;
    }

    public final int hashCode() {
        return (((int) this.f4053a) * 31) + ((int) this.b);
    }
}
