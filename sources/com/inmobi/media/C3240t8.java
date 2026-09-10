package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3240t8 extends C2984d8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3240t8(String assetId, String assetName, C3001e8 assetStyle, String url) {
        super(assetId, assetName, "ICON", assetStyle, 16);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(url, "url");
        this.f23516e = url;
    }
}
