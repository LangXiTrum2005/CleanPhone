package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class G00 {
    public static final byte[] g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3098a;
    public final byte b;
    public final int c;
    public final long d;
    public final int e;
    public final byte[] f;

    public G00(F00 f00) {
        this.f3098a = f00.f3049a;
        this.b = f00.b;
        this.c = f00.c;
        this.d = f00.d;
        this.e = f00.e;
        int length = f00.f.length;
        this.f = f00.g;
    }

    public static int a(int i) {
        return FW.O(i + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G00.class != obj.getClass()) {
            return false;
        }
        G00 g00 = (G00) obj;
        return this.b == g00.b && this.c == g00.c && this.f3098a == g00.f3098a && this.d == g00.d && this.e == g00.e;
    }

    public final int hashCode() {
        int i = (((((527 + this.b) * 31) + this.c) * 31) + (this.f3098a ? 1 : 0)) * 31;
        long j = this.d;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f3098a)};
        int i = Ug0.f3833a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
