package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RejectedExecutionHandlerC4168nm0 implements RejectedExecutionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4344pm0 f4760a;

    public RejectedExecutionHandlerC4168nm0(C4344pm0 c4344pm0) {
        this.f4760a = c4344pm0;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            this.f4760a.offerFirst(runnable);
            No0 no0 = AbstractC4648tE.f5026a;
        } catch (Throwable unused) {
        }
    }
}
