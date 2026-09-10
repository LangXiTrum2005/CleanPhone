package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3242t5 {
    public final C3267u5 a;

    public AbstractC3242t5(C3267u5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
    }

    public abstract void a();

    public abstract void b();
}
