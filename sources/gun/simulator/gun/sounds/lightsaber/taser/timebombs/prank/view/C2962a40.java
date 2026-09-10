package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2962a40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4107a;
    public final long b;

    public C2962a40(long j, long j2) {
        this.f4107a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2962a40.class != obj.getClass()) {
            return false;
        }
        C2962a40 c2962a40 = (C2962a40) obj;
        return this.f4107a == c2962a40.f4107a && this.b == c2962a40.b;
    }

    public final int hashCode() {
        return (((int) this.f4107a) * 31) + ((int) this.b);
    }
}
