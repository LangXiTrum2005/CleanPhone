package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3124m3 extends T5 {
    public final StackTraceElement[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3124m3(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", Ie.a(thread, error));
        Intrinsics.f(thread, "thread");
        Intrinsics.f(error, "error");
        StackTraceElement[] stackTrace = error.getStackTrace();
        Intrinsics.e(stackTrace, "getStackTrace(...)");
        this.g = stackTrace;
    }

    public C3124m3(String str) {
        super(androidx.media3.extractor.text.ttml.a.m("toString(...)"), "crashReporting", "CatchEvent", str);
    }
}
