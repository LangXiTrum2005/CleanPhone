package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2967a7 extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceHolderCallbackC2658Os f4109a;
    public final Handler b;
    public final /* synthetic */ C4288p70 c;

    public RunnableC2967a7(C4288p70 c4288p70, Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os) {
        this.c = c4288p70;
        this.b = handler;
        this.f4109a = surfaceHolderCallbackC2658Os;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.c) {
            this.f4109a.f3526a.N(-1, 3, false);
        }
    }
}
