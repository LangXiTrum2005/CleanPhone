package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC3340eN implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4317a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ ServiceConnectionC3340eN(Cp0 cp0) {
        this.b = cp0;
    }

    public final boolean a() {
        AbstractC3950lJ.z(this.b);
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.f4317a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread.currentThread();
                AbstractC3950lJ.z(obj);
                throw null;
            default:
                Cp0 cp0 = (Cp0) obj;
                cp0.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cp0.a().post(new zp0(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 1;
        int i2 = this.f4317a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                Thread.currentThread();
                AbstractC3950lJ.z(obj);
                throw null;
            default:
                Cp0 cp0 = (Cp0) obj;
                cp0.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cp0.a().post(new Ap0(this, i));
                return;
        }
    }
}
