package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2692Qa implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3607a;
    public final /* synthetic */ AbstractC4340pk0 b;

    public /* synthetic */ C2692Qa(AbstractC4340pk0 abstractC4340pk0, int i) {
        this.f3607a = i;
        this.b = abstractC4340pk0;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = this.f3607a;
        AbstractC4340pk0 abstractC4340pk0 = this.b;
        switch (i) {
            case 0:
                C3355eb c3355eb = (C3355eb) abstractC4340pk0;
                AbstractC2995aW.q(c3355eb, "this$0");
                c3355eb.D = true;
                break;
            default:
                C2612My c2612My = (C2612My) abstractC4340pk0;
                AbstractC2995aW.q(c2612My, "this$0");
                mediaPlayer.start();
                c2612My.w().k = System.currentTimeMillis();
                break;
        }
    }
}
