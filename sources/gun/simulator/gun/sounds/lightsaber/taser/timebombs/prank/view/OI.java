package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class OI implements PI {
    public static final C2868Wu d = b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
    public static final C2868Wu e = new C2868Wu(2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0);
    public static final C2868Wu f = new C2868Wu(3, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f3498a;
    public KI b;
    public IOException c;

    public OI(String str) {
        String strI = AbstractC3888ke0.i("ExoPlayer:Loader:", str);
        int i = Ug0.f3833a;
        this.f3498a = Executors.newSingleThreadExecutor(new Qg0(strI));
    }

    public static C2868Wu b(long j, boolean z) {
        return new C2868Wu(z ? 1 : 0, j, 0);
    }

    public final void a() {
        KI ki = this.b;
        FW.t(ki);
        ki.a(false);
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean d() {
        return this.b != null;
    }

    public final void e(MI mi) {
        KI ki = this.b;
        if (ki != null) {
            ki.a(true);
        }
        ExecutorService executorService = this.f3498a;
        if (mi != null) {
            executorService.execute(new TY(mi, 7));
        }
        executorService.shutdown();
    }

    public final long f(LI li, JI ji, int i) {
        Looper looperMyLooper = Looper.myLooper();
        FW.t(looperMyLooper);
        this.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        KI ki = new KI(this, looperMyLooper, li, ji, i, jElapsedRealtime);
        FW.s(this.b == null);
        this.b = ki;
        ki.e = null;
        this.f3498a.execute(ki);
        return jElapsedRealtime;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PI
    public final void maybeThrowError() throws IOException {
        IOException iOException;
        IOException iOException2 = this.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        KI ki = this.b;
        if (ki != null && (iOException = ki.e) != null && ki.f > ki.f3309a) {
            throw iOException;
        }
    }
}
