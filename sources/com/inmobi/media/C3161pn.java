package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3161pn {
    public final saran a;
    public final MediaPlayer b;
    public final C3097n9 c;
    public final AtomicBoolean d;
    public final ArrayList e;
    public final Ud f;
    public Surface g;
    public Ij h;
    public final Wm i;
    public final C3136on j;

    public C3161pn(saran coroutineScope, MediaPlayer mediaPlayer, RelativeLayout mediaPlayerLayout, Qm config, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = coroutineScope;
        this.b = mediaPlayer;
        this.c = c3097n9;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C2944h5 c2944h5 = new C2944h5(context);
        this.f = new Ud(c2944h5, mediaPlayerLayout, mediaPlayer, c3097n9);
        this.i = new Wm(coroutineScope, c2944h5, config.e);
        this.j = new C3136on(this);
    }

    public final void a() {
        if (this.g != null && this.d.get()) {
            C3328wg c3328wg = (C3328wg) this.i.d.getValue();
            c3328wg.f.set(false);
            c3328wg.a();
        } else {
            C3328wg c3328wg2 = (C3328wg) this.i.d.getValue();
            c3328wg2.b.setValue(Mn.HIDDEN);
            c3328wg2.f.set(true);
            H6.a(c3328wg2.e);
            c3328wg2.e = null;
        }
    }

    public final void b() {
        P4.a(this.e);
        Ud ud = this.f;
        ud.e = null;
        ud.a.setSurfaceTextureListener(null);
        ud.c.setOnVideoSizeChangedListener(null);
        C3328wg c3328wg = (C3328wg) this.i.d.getValue();
        c3328wg.f.set(true);
        H6.a(c3328wg.e);
        c3328wg.e = null;
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }
}
