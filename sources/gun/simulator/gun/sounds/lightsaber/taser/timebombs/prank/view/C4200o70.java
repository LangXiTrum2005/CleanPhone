package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4200o70 implements InterfaceC3760j70 {
    public static final Executor g = AsyncTask.SERIAL_EXECUTOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4779a;
    public final InterfaceC4161nj b;
    public final InterfaceC3656hy c;
    public volatile boolean d;
    public volatile boolean e;
    public final C4024m70 f = new C4024m70(this, 0);

    public C4200o70(Context context, C4351pr c4351pr, C3674i70 c3674i70) {
        this.f4779a = context.getApplicationContext();
        this.c = c4351pr;
        this.b = c3674i70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3760j70
    public final void a() {
        g.execute(new RunnableC4112n70(this, 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3760j70
    public final boolean b() {
        g.execute(new RunnableC4112n70(this, 0));
        return true;
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.get()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            return true;
        }
    }
}
