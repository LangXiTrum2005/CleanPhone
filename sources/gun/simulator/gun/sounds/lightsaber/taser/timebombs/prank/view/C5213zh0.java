package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5213zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2764Su f5337a;
    public final InterfaceC4861vh0 b;
    public final ChoreographerFrameCallbackC5125yh0 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    public C5213zh0(Context context) {
        InterfaceC4861vh0 c5037xh0;
        DisplayManager displayManager;
        C2764Su c2764Su = new C2764Su();
        c2764Su.f3741a = new C2738Ru();
        c2764Su.b = new C2738Ru();
        c2764Su.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f5337a = c2764Su;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            c5037xh0 = (Ug0.f3833a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new C5037xh0(displayManager);
            if (c5037xh0 == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    c5037xh0 = new C4949wh0(windowManager);
                } else {
                    c5037xh0 = null;
                }
            }
        } else {
            c5037xh0 = null;
        }
        this.b = c5037xh0;
        this.c = c5037xh0 != null ? ChoreographerFrameCallbackC5125yh0.e : null;
        this.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Ug0.f3833a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        AbstractC4773uh0.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    public final void b() {
        float f;
        float f2;
        if (Ug0.f3833a < 30 || this.e == null) {
            return;
        }
        C2764Su c2764Su = this.f5337a;
        if (!c2764Su.f3741a.a()) {
            f = this.f;
        } else if (c2764Su.f3741a.a()) {
            C2738Ru c2738Ru = c2764Su.f3741a;
            long j = c2738Ru.e;
            f = (float) (1.0E9d / (j != 0 ? c2738Ru.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (c2764Su.f3741a.a()) {
                if ((c2764Su.f3741a.a() ? c2764Su.f3741a.f : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) < f2) {
                return;
            }
        } else if (f == -1.0f && c2764Su.e < 30) {
            return;
        }
        this.g = f;
        c(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public final void c(boolean z) {
        Surface surface;
        float f;
        if (Ug0.f3833a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            AbstractC4773uh0.a(surface, f);
        }
    }
}
