package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3301ve {
    public final String a;
    public final String b;

    public C3301ve(String url, String eventType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.a = url;
        this.b = eventType;
    }
}
