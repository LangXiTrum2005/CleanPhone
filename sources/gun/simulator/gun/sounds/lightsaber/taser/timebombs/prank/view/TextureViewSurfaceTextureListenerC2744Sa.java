package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.AnimatorSet;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class TextureViewSurfaceTextureListenerC2744Sa implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3355eb f3721a;
    public final /* synthetic */ C2770Ta b;

    public TextureViewSurfaceTextureListenerC2744Sa(C3355eb c3355eb, C2770Ta c2770Ta) {
        this.f3721a = c3355eb;
        this.b = c2770Ta;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC2995aW.q(surfaceTexture, "surface");
        Surface surface = new Surface(surfaceTexture);
        final C3355eb c3355eb = this.f3721a;
        c3355eb.C = surface;
        WeaponUseActivity weaponUseActivity = c3355eb.f4847a;
        final C2770Ta c2770Ta = this.b;
        c3355eb.B = MediaPlayer.create(weaponUseActivity, c2770Ta.f3777a);
        MediaPlayer mediaPlayer = c3355eb.B;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(c3355eb.C);
            mediaPlayer.setOnPreparedListener(new C2692Qa(c3355eb, 0));
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ra
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    ImageView imageView;
                    C3355eb c3355eb2 = c3355eb;
                    AbstractC2995aW.q(c3355eb2, "this$0");
                    C2770Ta c2770Ta2 = c2770Ta;
                    AbstractC2995aW.q(c2770Ta2, "this$1");
                    Weapon weapon = c3355eb2.b;
                    if (weapon.getNameId() == R.string.weapon_name_time_bomb_skibidi) {
                        c3355eb2.E = false;
                        ImageView imageView2 = c2770Ta2.e;
                        if (imageView2 != null) {
                            imageView2.setEnabled(true);
                        }
                        if (weapon.getSwitchBoomBrokenScreen() && (imageView = c2770Ta2.e) != null) {
                            Oh0.e(imageView);
                        }
                        TextureView textureView = c2770Ta2.f;
                        if (textureView != null) {
                            textureView.setAlpha(0.0f);
                        }
                    }
                    if (weapon.getSwitchBoomBrokenScreen()) {
                        return;
                    }
                    c2770Ta2.a();
                }
            });
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC2995aW.q(surfaceTexture, "surface");
        C3355eb c3355eb = this.f3721a;
        AnimatorSet animatorSet = c3355eb.z;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        MediaPlayer mediaPlayer = c3355eb.B;
        if (mediaPlayer == null) {
            return true;
        }
        mediaPlayer.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC2995aW.q(surfaceTexture, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        AbstractC2995aW.q(surfaceTexture, "surface");
    }
}
