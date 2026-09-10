package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2445Gm implements InterfaceC4249oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3137a;
    public final InterfaceC4161nj b;

    public C2445Gm(Context context, UY uy) {
        this.f3137a = context.getApplicationContext();
        this.b = uy;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStart() {
        C4288p70 c4288p70F = C4288p70.f(this.f3137a);
        InterfaceC4161nj interfaceC4161nj = this.b;
        synchronized (c4288p70F) {
            ((Set) c4288p70F.b).add(interfaceC4161nj);
            if (!c4288p70F.c && !((Set) c4288p70F.b).isEmpty()) {
                c4288p70F.c = ((InterfaceC3760j70) c4288p70F.d).b();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStop() {
        C4288p70 c4288p70F = C4288p70.f(this.f3137a);
        InterfaceC4161nj interfaceC4161nj = this.b;
        synchronized (c4288p70F) {
            ((Set) c4288p70F.b).remove(interfaceC4161nj);
            if (c4288p70F.c && ((Set) c4288p70F.b).isEmpty()) {
                ((InterfaceC3760j70) c4288p70F.d).a();
                c4288p70F.c = false;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onDestroy() {
    }
}
