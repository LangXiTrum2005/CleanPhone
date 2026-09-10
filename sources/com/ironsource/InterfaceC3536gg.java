package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3536gg {
    void a() throws C3498ee;

    default void a(boolean z, Function0<? extends IronSourceError> lazyError) {
        Intrinsics.checkNotNullParameter(lazyError, "lazyError");
        if (!z) {
            throw new C3498ee(lazyError.invoke());
        }
    }
}
