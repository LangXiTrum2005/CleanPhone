package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Di {
    public final String a;
    public final String b;

    public Di(String sourceId, String renderViewId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(renderViewId, "renderViewId");
        this.a = sourceId;
        this.b = renderViewId;
    }
}
