package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3233d7 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4259a;
    public final /* synthetic */ C3409f7 b;

    public C3233d7(C3409f7 c3409f7, Handler handler) {
        this.b = c3409f7;
        this.f4259a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f4259a.post(new RunnableC4757uZ(i, 1, this));
    }
}
