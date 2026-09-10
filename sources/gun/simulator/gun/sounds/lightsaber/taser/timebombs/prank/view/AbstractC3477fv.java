package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3477fv implements InterfaceC2303Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4391a;
    public final R7 b;
    public final P0 c;

    public AbstractC3477fv(ContextWrapper contextWrapper) {
        AbstractC2995aW.q(contextWrapper, "activity");
        this.f4391a = contextWrapper;
        boolean z = contextWrapper instanceof LifecycleOwner;
        this.b = new R7(contextWrapper, (LifecycleOwner) (!z ? null : contextWrapper), null, 4);
        AbstractC2277Aa.a(this, (LifecycleOwner) (z ? contextWrapper : null));
        this.c = new P0(this, 12);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void b(LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        AbstractC2995aW.q(lifecycleOwner, "source");
        AbstractC2995aW.q(state, "targetState");
    }

    public abstract void c();

    public abstract void d(boolean z);
}
