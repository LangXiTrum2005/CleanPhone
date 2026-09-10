package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ih implements InterfaceC3216s4 {
    @Override // com.inmobi.media.InterfaceC3216s4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Jb jb = Jh.b;
        if (jb != null) {
            jb.g.set(true);
        }
        Jh.b = null;
        AbstractC2984il.a(new Hh(null));
    }
}
