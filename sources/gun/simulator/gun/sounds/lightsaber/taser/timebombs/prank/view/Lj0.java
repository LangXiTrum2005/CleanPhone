package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class Lj0 implements InterfaceC3011ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3109bk0 f3368a;

    public /* synthetic */ Lj0(C3109bk0 c3109bk0) {
        this.f3368a = c3109bk0;
    }

    public void a(int i) {
        LifecycleCoroutineScope lifecycleScope;
        C3109bk0 c3109bk0 = this.f3368a;
        LifecycleOwner lifecycleOwner = c3109bk0.g;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        WD.D(lifecycleScope, null, 0, new Tj0(c3109bk0, i, null), 3);
    }
}
