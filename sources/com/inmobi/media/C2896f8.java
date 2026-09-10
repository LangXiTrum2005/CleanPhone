package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2896f8 extends AbstractC2870e8 {
    public final String a;
    public final long b;
    public final int c;

    public C2896f8(int i, long j, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = j;
        this.c = i;
    }
}
