package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.adultoid;
import java.util.ArrayList;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3121o8 {
    public final saran a;
    public final adultoid b;
    public final ArrayList c;
    public final P7 d;
    public Surface e;
    public Ij f;
    public boolean g;
    public final C3096n8 h;

    public C3121o8(saran coroutineScope, adultoid mediaPlayer, G1 mediaPlayerLayout, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        this.a = coroutineScope;
        this.b = mediaPlayer;
        this.c = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.d = new P7(new C2944h5(context), mediaPlayerLayout, mediaPlayer, interfaceC3072m9);
        this.h = new C3096n8(this);
    }

    public final void a() {
        P4.a(this.c);
        P7 p7 = this.d;
        p7.e = null;
        p7.a.setSurfaceTextureListener(null);
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.e = null;
        this.f = null;
    }
}
