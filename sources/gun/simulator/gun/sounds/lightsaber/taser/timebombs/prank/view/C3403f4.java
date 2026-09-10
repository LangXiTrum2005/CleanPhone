package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3403f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4348a;
    public final Gc0 b;
    public final int c;
    public final C5186zO d;
    public final long e;
    public final Gc0 f;
    public final int g;
    public final C5186zO h;
    public final long i;
    public final long j;

    public C3403f4(long j, Gc0 gc0, int i, C5186zO c5186zO, long j2, Gc0 gc1, int i2, C5186zO c5186zO2, long j3, long j4) {
        this.f4348a = j;
        this.b = gc0;
        this.c = i;
        this.d = c5186zO;
        this.e = j2;
        this.f = gc1;
        this.g = i2;
        this.h = c5186zO2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3403f4.class != obj.getClass()) {
            return false;
        }
        C3403f4 c3403f4 = (C3403f4) obj;
        return this.f4348a == c3403f4.f4348a && this.c == c3403f4.c && this.e == c3403f4.e && this.g == c3403f4.g && this.i == c3403f4.i && this.j == c3403f4.j && FW.B(this.b, c3403f4.b) && FW.B(this.d, c3403f4.d) && FW.B(this.f, c3403f4.f) && FW.B(this.h, c3403f4.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4348a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
