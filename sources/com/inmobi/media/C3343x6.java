package com.inmobi.media;

import android.content.Context;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3343x6 {
    public final Context a;
    public final saran b;
    public final apical c;
    public final C3097n9 d;

    public C3343x6(Context context, saran coroutineScope, apical mediaEventFlow, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.a = context;
        this.b = coroutineScope;
        this.c = mediaEventFlow;
        this.d = c3097n9;
    }
}
