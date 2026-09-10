package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4696tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2833Vl f5051a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public int h;
    public boolean i;

    public C4696tn() {
        C2833Vl c2833Vl = new C2833Vl();
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f5051a = c2833Vl;
        long j = DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
        this.b = Ug0.L(j);
        this.c = Ug0.L(j);
        this.d = Ug0.L(2500);
        this.e = Ug0.L(5000);
        this.f = -1;
        this.h = com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE;
        this.g = Ug0.L(0);
    }

    public static void a(int i, int i2, String str, String str2) {
        FW.i(i >= i2, str + " cannot be less than " + str2);
    }

    public final void b(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.h = i;
        this.i = false;
        if (z) {
            C2833Vl c2833Vl = this.f5051a;
            synchronized (c2833Vl) {
                if (c2833Vl.f3891a) {
                    c2833Vl.a(0);
                }
            }
        }
    }

    public final boolean c(long j, float f) {
        int i;
        C2833Vl c2833Vl = this.f5051a;
        synchronized (c2833Vl) {
            i = c2833Vl.d * c2833Vl.b;
        }
        boolean z = i >= this.h;
        long j2 = this.c;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(Ug0.w(jMin, f), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            boolean z2 = !z;
            this.i = z2;
            if (!z2 && j < 500000) {
                AbstractC4038mJ.f();
            }
        } else if (j >= j2 || z) {
            this.i = false;
        }
        return this.i;
    }
}
