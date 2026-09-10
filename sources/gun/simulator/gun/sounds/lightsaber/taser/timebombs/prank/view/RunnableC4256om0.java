package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.om0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4256om0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4806a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ AbstractC4783um0 c;

    public /* synthetic */ RunnableC4256om0(AbstractC4783um0 abstractC4783um0, boolean z, int i) {
        this.f4806a = i;
        this.c = abstractC4783um0;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4806a;
        boolean z = this.b;
        AbstractC4783um0 abstractC4783um0 = this.c;
        switch (i) {
            case 0:
                if (!abstractC4783um0.OY() && abstractC4783um0.lc != null) {
                    try {
                        abstractC4783um0.KPU = z;
                        MediaPlayer mediaPlayer = ((OG) abstractC4783um0.lc).i;
                        if (mediaPlayer != null) {
                            if (z) {
                                mediaPlayer.setVolume(0.0f, 0.0f);
                            } else {
                                mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                if (abstractC4783um0.lc != null) {
                    ((OG) abstractC4783um0.lc).h = z;
                }
                break;
        }
    }
}
