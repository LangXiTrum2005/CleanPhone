package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class F9 extends C2984d8 {
    public final boolean x;
    public String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22821z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F9(String assetId, String assetName, C3001e8 assetStyle, String textValue, boolean z2) {
        super(assetId, assetName, "WEBVIEW", assetStyle, 16);
        Intrinsics.f(assetId, "assetId");
        Intrinsics.f(assetName, "assetName");
        Intrinsics.f(assetStyle, "assetStyle");
        Intrinsics.f(textValue, "textValue");
        this.x = z2;
        this.f23516e = textValue;
    }

    public final void b() {
        this.f22821z = true;
    }

    public final void e(String str) {
        this.y = str;
    }
}
