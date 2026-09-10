package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3675i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4490a;
    public final Sd0 b;
    public final Y7 c;

    public C3675i8(long j, Sd0 sd0, Y7 y7) {
        this.f4490a = j;
        if (sd0 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = sd0;
        this.c = y7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3675i8)) {
            return false;
        }
        C3675i8 c3675i8 = (C3675i8) obj;
        return this.f4490a == c3675i8.f4490a && this.b.equals(c3675i8.b) && this.c.equals(c3675i8.c);
    }

    public final int hashCode() {
        long j = this.f4490a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f4490a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
