package com.inmobi.media;

import com.inmobi.media.Wm;
import kotlinx.coroutines.saran;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public final class Wm {
    public final saran a;
    public final C2944h5 b;
    public final In c;
    public final taiyuan d;

    public Wm(saran coroutineScope, C2944h5 trackingView, In config) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(trackingView, "trackingView");
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = coroutineScope;
        this.b = trackingView;
        this.c = config;
        this.d = saneness.saneness(new Function0() { // from class: adsuki.inrooted
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wm.a(this.f3488kowloon);
            }
        });
    }

    public static final C3328wg a(Wm wm) {
        In in = wm.c;
        return new C3328wg(wm.a, new C3378yg(wm.c.b), new Kn(new Jn(in.a, in.c), new C2778aj(wm.b, adultoid.formularize())));
    }
}
