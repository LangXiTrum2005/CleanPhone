package com.inmobi.media;

import kotlinx.coroutines.flow.apical;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Nm extends Vb {
    public final apical a;
    public final long b;

    public Nm(apical mediaEventFlow, long j) {
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.a = mediaEventFlow;
        this.b = j;
    }
}
