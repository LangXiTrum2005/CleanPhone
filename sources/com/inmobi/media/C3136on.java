package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3136on implements Hj {
    public final /* synthetic */ C3161pn a;

    public C3136on(C3161pn c3161pn) {
        this.a = c3161pn;
    }

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        C3161pn c3161pn = this.a;
        c3161pn.g = surface2;
        MediaPlayer mediaPlayer = c3161pn.b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(surface2);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
        Ij ij = this.a.h;
        if (ij != null) {
            ij.c();
        }
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        Surface surface = this.a.g;
        if (surface != null) {
            surface.release();
        }
        C3161pn c3161pn = this.a;
        c3161pn.g = null;
        MediaPlayer mediaPlayer = c3161pn.b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(null);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
    }
}
