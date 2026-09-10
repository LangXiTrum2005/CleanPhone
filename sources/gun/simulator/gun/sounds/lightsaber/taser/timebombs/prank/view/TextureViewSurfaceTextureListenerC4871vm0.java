package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC4871vm0 extends TextureView implements TextureView.SurfaceTextureListener, TG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GK f5153a;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG
    public final void Lxb(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG
    public final void a(GK gk) {
        this.f5153a = gk;
        setSurfaceTextureListener(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        GK gk = this.f5153a;
        if (gk != null) {
            gk.Lxb(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        GK gk = this.f5153a;
        if (gk != null) {
            return gk.Lxb(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setWindowVisibilityChangedListener(IG ig) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
