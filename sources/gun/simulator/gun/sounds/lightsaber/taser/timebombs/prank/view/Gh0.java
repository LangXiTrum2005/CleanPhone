package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class Gh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3131a;
    public final Hh0 b;

    public Gh0(Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os) {
        this.f3131a = handler;
        this.b = surfaceHolderCallbackC2658Os;
    }

    public final void a(C2599Ml c2599Ml) {
        synchronized (c2599Ml) {
        }
        Handler handler = this.f3131a;
        if (handler != null) {
            handler.post(new Fh0(this, c2599Ml, 0));
        }
    }
}
