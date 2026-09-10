package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5091yH implements YY, InterfaceC3656hy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5270a;
    public final Object b;

    public /* synthetic */ C5091yH(Object obj, Object obj2) {
        this.b = obj;
        this.f5270a = obj2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3656hy
    public final Object get() {
        return (ConnectivityManager) ((Context) this.f5270a).getSystemService("connectivity");
    }

    public C5091yH(Qm0 qm0) {
        this.f5270a = new HashMap();
        this.b = qm0;
    }
}
