package com.inmobi.media;

import android.graphics.Rect;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Kn implements Nn {
    public final Jn a;
    public final C2778aj b;

    public Kn(Jn visibilityConfig, C2778aj simpleViewHolder) {
        Intrinsics.checkNotNullParameter(visibilityConfig, "visibilityConfig");
        Intrinsics.checkNotNullParameter(simpleViewHolder, "simpleViewHolder");
        this.a = visibilityConfig;
        this.b = simpleViewHolder;
    }

    @Override // com.inmobi.media.Nn
    public final Mn a() {
        C2944h5 c2944h5 = this.b.a;
        Rect rect = new Rect();
        if (!c2944h5.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Jn jn = this.a;
        return (Un.a(c2944h5, rect, jn.a, jn.b) && Un.a(c2944h5, rect, this.a.a, this.b.b)) ? Mn.VISIBLE : Mn.HIDDEN;
    }
}
