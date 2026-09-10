package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class N20 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3436a;
    public final Object b;

    public /* synthetic */ N20(Object obj, int i) {
        this.f3436a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f3436a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new TY(runnable, 6));
                break;
            default:
                AbstractC3899kk abstractC3899kk = (AbstractC3899kk) obj;
                C2734Rq c2734Rq = C2734Rq.f3684a;
                if (!abstractC3899kk.isDispatchNeeded(c2734Rq)) {
                    runnable.run();
                } else {
                    abstractC3899kk.dispatch(c2734Rq, runnable);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f3436a) {
            case 1:
                return ((AbstractC3899kk) this.b).toString();
            default:
                return super.toString();
        }
    }
}
