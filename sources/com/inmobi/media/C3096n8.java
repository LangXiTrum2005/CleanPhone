package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3096n8 implements Hj {
    public final /* synthetic */ C3121o8 a;

    public C3096n8(C3121o8 c3121o8) {
        this.a = c3121o8;
    }

    @Override // com.inmobi.media.Hj
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        C3121o8 c3121o8 = this.a;
        Surface surface3 = c3121o8.e;
        if (surface3 != null) {
            surface3.release();
        }
        c3121o8.e = surface2;
        Ij ij = this.a.f;
        if (ij != null) {
            ij.c();
        }
    }

    @Override // com.inmobi.media.Hj
    public final void a() {
        this.a.b.clearVideoSurface();
        this.a.b.setVideoSurface(null);
        Surface surface = this.a.e;
        if (surface != null) {
            surface.release();
        }
        this.a.e = null;
    }
}
