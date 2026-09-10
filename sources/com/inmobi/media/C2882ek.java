package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2882ek extends AbstractC2966i2 {
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2882ek(String eventType, String str, String eventSource) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventSource, "eventSource");
        this.e = eventSource;
    }

    public final String toString() {
        return this.a + " ";
    }
}
