package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3937l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4634a;
    public final long b;
    public final Set c;

    public C3937l8(long j, long j2, Set set) {
        this.f4634a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3937l8)) {
            return false;
        }
        C3937l8 c3937l8 = (C3937l8) obj;
        return this.f4634a == c3937l8.f4634a && this.b == c3937l8.b && this.c.equals(c3937l8.c);
    }

    public final int hashCode() {
        long j = this.f4634a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4634a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
