package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Mh0 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3416a;
    public final /* synthetic */ ViewConfiguration b;

    public /* synthetic */ Mh0(ViewConfiguration viewConfiguration, int i) {
        this.f3416a = i;
        this.b = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        int i = this.f3416a;
        ViewConfiguration viewConfiguration = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            default:
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
        }
    }
}
