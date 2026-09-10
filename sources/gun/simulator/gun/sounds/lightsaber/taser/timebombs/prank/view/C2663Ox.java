package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2663Ox implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2689Px f3528a;

    public C2663Ox(C2689Px c2689Px) {
        this.f3528a = c2689Px;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        C2689Px c2689Px = this.f3528a;
        if (i == 1) {
            c2689Px.b((C2611Mx) message.obj);
            return true;
        }
        if (i != 2) {
            return false;
        }
        c2689Px.d.j((C2611Mx) message.obj);
        return false;
    }
}
