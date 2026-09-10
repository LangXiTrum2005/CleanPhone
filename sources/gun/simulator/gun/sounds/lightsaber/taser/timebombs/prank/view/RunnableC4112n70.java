package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4112n70 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4730a;
    public final /* synthetic */ C4200o70 b;

    public /* synthetic */ RunnableC4112n70(C4200o70 c4200o70, int i) {
        this.f4730a = i;
        this.b = c4200o70;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4730a) {
            case 0:
                C4200o70 c4200o70 = this.b;
                c4200o70.d = c4200o70.c();
                try {
                    C4200o70 c4200o71 = this.b;
                    c4200o71.f4779a.registerReceiver(c4200o71.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.b.e = true;
                } catch (SecurityException unused) {
                    this.b.e = false;
                    return;
                }
                break;
            case 1:
                if (this.b.e) {
                    this.b.e = false;
                    C4200o70 c4200o72 = this.b;
                    c4200o72.f4779a.unregisterReceiver(c4200o72.f);
                    break;
                }
                break;
            default:
                boolean z = this.b.d;
                C4200o70 c4200o73 = this.b;
                c4200o73.d = c4200o73.c();
                if (z != this.b.d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        boolean z2 = this.b.d;
                    }
                    C4200o70 c4200o74 = this.b;
                    Tg0.f().post(new RunnableC3848k70(1, c4200o74, c4200o74.d));
                }
                break;
        }
    }
}
