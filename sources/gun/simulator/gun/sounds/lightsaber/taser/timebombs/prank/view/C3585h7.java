package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3585h7 {
    public static final C3585h7 e = new C3585h7(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4446a;
    public final int b;
    public final int c;
    public final int d;

    public C3585h7(int i, int i2, int i3) {
        this.f4446a = i;
        this.b = i2;
        this.c = i3;
        this.d = Ug0.I(i3) ? Ug0.z(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3585h7)) {
            return false;
        }
        C3585h7 c3585h7 = (C3585h7) obj;
        return this.f4446a == c3585h7.f4446a && this.b == c3585h7.b && this.c == c3585h7.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4446a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f4446a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return DM.k(sb, this.c, ']');
    }
}
