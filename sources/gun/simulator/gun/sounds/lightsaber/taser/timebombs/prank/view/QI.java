package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;

/* JADX INFO: loaded from: classes4.dex */
public final class QI implements O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SI f3597a;

    public QI(SI si) {
        this.f3597a = si;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void h(boolean z) {
        if (z) {
            SI si = this.f3597a;
            AbstractC3651ht.b(si);
            C5055xs c5055xs = si.i;
            if (c5055xs != null) {
                c5055xs.a();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdClosed() {
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new A8(2, null), 2);
        MediaPlayer mediaPlayer = BF.g;
        if (mediaPlayer != null) {
            MediaPlayer mediaPlayer2 = mediaPlayer.isPlaying() ^ true ? mediaPlayer : null;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdShowed() {
        MediaPlayer mediaPlayer;
        SI si = this.f3597a;
        int i = si.f;
        if (i > 0 && si.d != null) {
            S3.b("unlock_weapon_results", "display_again");
        } else if (si.d != null && i == 0) {
            S3.b("unlock_weapon_results", "display");
        }
        MediaPlayer mediaPlayer2 = BF.g;
        if (mediaPlayer2 == null || !mediaPlayer2.isPlaying() || (mediaPlayer = BF.g) == null) {
            return;
        }
        mediaPlayer.pause();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdClicked() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdImpression() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void d(A70 a70) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void e(InterfaceC3240dB interfaceC3240dB) {
    }
}
