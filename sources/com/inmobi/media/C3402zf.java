package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3402zf extends C3301ve {
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3402zf(String vendor, String str, String url) {
        super(url, "OMID_VIEWABILITY");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(url, "url");
        this.c = vendor;
        this.d = str;
    }
}
