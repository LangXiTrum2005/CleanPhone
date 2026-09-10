package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Wn extends Q9 {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wn(StackTraceElement[] stackTrace) {
        super("ANRWatchDog", "ANRWatchDogEvent", AbstractC2984il.a(stackTrace));
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        this.g = stackTrace;
    }
}
