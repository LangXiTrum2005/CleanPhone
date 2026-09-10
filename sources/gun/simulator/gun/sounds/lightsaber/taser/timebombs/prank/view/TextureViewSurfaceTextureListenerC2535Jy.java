package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class TextureViewSurfaceTextureListenerC2535Jy implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2612My f3292a;
    public final /* synthetic */ int b = R.raw.conventional_explosion;

    public TextureViewSurfaceTextureListenerC2535Jy(C2612My c2612My) {
        this.f3292a = c2612My;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC2995aW.q(surfaceTexture, "surface");
        this.f3292a.z(this.b, surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC2995aW.q(surfaceTexture, "surface");
        C2612My c2612My = this.f3292a;
        MediaPlayer mediaPlayer = c2612My.I;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = c2612My.I;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        c2612My.I = null;
        Surface surface = c2612My.J;
        if (surface != null) {
            surface.release();
        }
        c2612My.J = null;
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
