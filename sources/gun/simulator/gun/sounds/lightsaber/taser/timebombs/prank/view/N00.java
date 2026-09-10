package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class N00 implements Runnable, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3434a = Ug0.m(null);
    public boolean b;
    public final /* synthetic */ R00 c;

    public N00(R00 r00) {
        this.c = r00;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b = false;
        this.f3434a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        R00 r00 = this.c;
        A70 a70 = r00.h;
        a70.k(a70.e(4, r00.l, C4405qY.g, r00.i));
        this.f3434a.postDelayed(this, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
