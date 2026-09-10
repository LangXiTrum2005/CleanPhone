package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4178nu extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4765a;

    public C4178nu(Context context) {
        this.f4765a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C4266ou.j) {
            try {
                Iterator it = C4266ou.k.values().iterator();
                while (it.hasNext()) {
                    ((C4266ou) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4765a.unregisterReceiver(this);
    }
}
