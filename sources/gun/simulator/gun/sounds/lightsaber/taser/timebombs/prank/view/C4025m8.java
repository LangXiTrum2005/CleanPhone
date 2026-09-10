package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4025m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4683a;
    public final long b;
    public final long c;

    public C4025m8(long j, long j2, long j3) {
        this.f4683a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4025m8)) {
            return false;
        }
        C4025m8 c4025m8 = (C4025m8) obj;
        return this.f4683a == c4025m8.f4683a && this.b == c4025m8.b && this.c == c4025m8.c;
    }

    public final int hashCode() {
        long j = this.f4683a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f4683a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return AbstractC3950lJ.s(sb, this.c, "}");
    }
}
