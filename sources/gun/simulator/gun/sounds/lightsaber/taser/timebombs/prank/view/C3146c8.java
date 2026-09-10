package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3146c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4207a;
    public final long b;
    public final long c;

    public C3146c8(String str, long j, long j2) {
        this.f4207a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3146c8)) {
            return false;
        }
        C3146c8 c3146c8 = (C3146c8) obj;
        return this.f4207a.equals(c3146c8.f4207a) && this.b == c3146c8.b && this.c == c3146c8.c;
    }

    public final int hashCode() {
        int iHashCode = (this.f4207a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f4207a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return AbstractC3950lJ.s(sb, this.c, "}");
    }
}
