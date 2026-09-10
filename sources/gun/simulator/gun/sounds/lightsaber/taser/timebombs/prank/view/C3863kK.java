package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3863kK extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3951lK f4594a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f4594a.f((C3775jK) get());
            } catch (InterruptedException | ExecutionException e) {
                this.f4594a.f(new C3775jK(e));
            }
        } finally {
            this.f4594a = null;
        }
    }
}
