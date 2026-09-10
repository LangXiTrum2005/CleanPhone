package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WJ implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3917a;
    public final /* synthetic */ C3160cK b;

    public /* synthetic */ WJ(C3160cK c3160cK, int i) {
        this.f3917a = i;
        this.b = c3160cK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3917a;
        C3160cK c3160cK = this.b;
        switch (i) {
            case 0:
                Semaphore semaphore = c3160cK.K;
                C4948wh c4948wh = c3160cK.o;
                if (c4948wh == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c4948wh.r(c3160cK.b.e());
                    if (C3160cK.Q && c3160cK.I) {
                        if (c3160cK.L == null) {
                            c3160cK.L = new Handler(Looper.getMainLooper());
                            c3160cK.M = new WJ(c3160cK, 1);
                        }
                        c3160cK.L.post(c3160cK.M);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            default:
                Drawable.Callback callback = c3160cK.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(c3160cK);
                    return;
                }
                return;
        }
    }
}
