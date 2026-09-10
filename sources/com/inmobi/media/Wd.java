package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Wd extends U1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wd(String eventType, String str, String eventSource) {
        super(eventType, str);
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(eventSource, "eventSource");
        this.f23328e = eventSource;
    }

    public final String toString() {
        return androidx.media3.extractor.text.ttml.a.p(new StringBuilder(), this.f23247a, ' ');
    }
}
