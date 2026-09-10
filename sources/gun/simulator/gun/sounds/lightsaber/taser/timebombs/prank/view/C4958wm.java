package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4958wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f5196a;
    public long b;

    public final void a(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f5196a == null) {
            this.f5196a = exc;
            this.b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.b) {
            Exception exc2 = this.f5196a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f5196a;
            this.f5196a = null;
            throw exc3;
        }
    }
}
