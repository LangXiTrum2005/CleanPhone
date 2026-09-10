package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3388z1 extends Q9 {
    public final int g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3388z1(String str, int i, String trace) {
        super("AppExitReasonReporting", "AppExitReasonEvent", AbstractC2984il.a("reason - " + i + " description - " + (str == null ? "ApplicationExit" : str), trace));
        Intrinsics.checkNotNullParameter(trace, "trace");
        this.g = i;
        this.h = trace;
    }
}
