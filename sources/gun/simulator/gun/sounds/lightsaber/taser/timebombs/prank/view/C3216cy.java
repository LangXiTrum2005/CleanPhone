package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3216cy extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4250a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3216cy(R60 r60) {
        super("ExoPlayer:SimpleDecoder");
        this.f4250a = 2;
        this.b = r60;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f4250a) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                try {
                    Process.setThreadPriority(10);
                    break;
                } catch (Throwable unused) {
                }
                super.run();
                return;
            default:
                R60 r60 = (R60) this.b;
                r60.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                    break;
                } while (r60.d());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3216cy(ThreadFactory threadFactory, Runnable runnable, int i) {
        super(runnable);
        this.f4250a = i;
        this.b = threadFactory;
    }
}
