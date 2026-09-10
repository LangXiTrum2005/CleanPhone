package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3063m0 {
    public final saran a;
    public final C3139p1 b;
    public final C2811c0 c;

    public C3063m0(saran coroutineScope, C3139p1 adManagerContext, C2811c0 adLifecycleData) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        this.a = coroutineScope;
        this.b = adManagerContext;
        this.c = adLifecycleData;
    }
}
