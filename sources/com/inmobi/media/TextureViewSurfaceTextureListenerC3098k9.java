package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class TextureViewSurfaceTextureListenerC3098k9 implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3114l9 f23748a;

    public TextureViewSurfaceTextureListenerC3098k9(C3114l9 c3114l9) {
        this.f23748a = c3114l9;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture texture, int i2, int i3) {
        Intrinsics.f(texture, "texture");
        this.f23748a.f23775b = new Surface(texture);
        this.f23748a.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture texture) {
        Intrinsics.f(texture, "texture");
        Surface surface = this.f23748a.f23775b;
        if (surface != null) {
            surface.release();
        }
        C3114l9 c3114l9 = this.f23748a;
        c3114l9.f23775b = null;
        C3002e9 c3002e9 = c3114l9.f23781n;
        if (c3002e9 != null) {
            c3002e9.c();
        }
        this.f23748a.g();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i2, int i3) {
        G8 g8;
        Intrinsics.f(surface, "surface");
        G8 mediaPlayer = this.f23748a.getMediaPlayer();
        boolean z2 = false;
        boolean z3 = mediaPlayer != null && mediaPlayer.f22845b == 3;
        if (i2 > 0 && i3 > 0) {
            z2 = true;
        }
        if (z3 && z2) {
            Object tag = this.f23748a.getTag();
            if (tag instanceof C2968c9) {
                Object obj = ((C2968c9) tag).t.get("seekPosition");
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != 0) {
                    C3114l9 c3114l9 = this.f23748a;
                    if (c3114l9.a() && (g8 = c3114l9.f23776c) != null) {
                        g8.seekTo(iIntValue);
                    }
                }
            }
            this.f23748a.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture texture) {
        Intrinsics.f(texture, "texture");
    }
}
