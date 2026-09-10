package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ad0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3006ad0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC3095bd0 f4131a;

    public C3006ad0(RunnableC3095bd0 runnableC3095bd0, RunnableC3095bd0 runnableC3095bd1) {
        this.f4131a = runnableC3095bd1;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        RunnableC3095bd0 runnableC3095bd0 = this.f4131a;
        if (runnableC3095bd0 == null) {
            return;
        }
        if (runnableC3095bd0.c()) {
            Object obj = RunnableC3095bd0.f;
            RunnableC3095bd0 runnableC3095bd1 = this.f4131a;
            runnableC3095bd1.d.f.schedule(runnableC3095bd1, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f4131a = null;
        }
    }
}
