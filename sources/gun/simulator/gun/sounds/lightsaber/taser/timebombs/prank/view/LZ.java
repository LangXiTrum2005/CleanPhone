package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class LZ implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3357a;
    public final Bundle b;
    public final /* synthetic */ ResultReceiver c;

    public LZ(ResultReceiver resultReceiver, int i, Bundle bundle) {
        this.c = resultReceiver;
        this.f3357a = i;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.f3357a, this.b);
    }
}
