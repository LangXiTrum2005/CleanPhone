package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.VideoView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C4100n10 implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4724a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C4100n10(Object obj, int i) {
        this.f4724a = i;
        this.b = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.f4724a;
        Object obj = this.b;
        switch (i) {
            case 0:
                VideoView videoView = (VideoView) obj;
                int i2 = RussianRouletteActivity.t;
                AbstractC2995aW.q(videoView, "$this_apply");
                videoView.start();
                break;
            case 1:
                VideoView videoView2 = (VideoView) obj;
                Zb0 zb0 = WeaponUseActivity.n;
                AbstractC2995aW.q(videoView2, "$this_apply");
                videoView2.start();
                break;
            default:
                C2612My c2612My = (C2612My) obj;
                AbstractC2995aW.q(c2612My, "this$0");
                ActivityGunBinding activityGunBindingV = c2612My.v();
                TextureView textureView = activityGunBindingV != null ? activityGunBindingV.tvVideo : null;
                if (textureView != null) {
                    textureView.setVisibility(8);
                }
                ActivityGunBinding activityGunBindingV2 = c2612My.v();
                ImageView imageView = activityGunBindingV2 != null ? activityGunBindingV2.ivBoom : null;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                MediaPlayer mediaPlayer2 = c2612My.I;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.stop();
                }
                MediaPlayer mediaPlayer3 = c2612My.I;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
                c2612My.I = null;
                Surface surface = c2612My.J;
                if (surface != null) {
                    surface.release();
                }
                c2612My.J = null;
                break;
        }
    }
}
