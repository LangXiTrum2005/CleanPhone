package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3285un {
    public final boolean a;
    public final boolean b;
    public final C3392z5 c;
    public final C3392z5 d;
    public final Sg e;

    public C3285un(boolean z, boolean z2, C3392z5 iconMinDimension, C3392z5 mediaMinDimension, Sg nativeViewData) {
        Intrinsics.checkNotNullParameter(iconMinDimension, "iconMinDimension");
        Intrinsics.checkNotNullParameter(mediaMinDimension, "mediaMinDimension");
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.a = z;
        this.b = z2;
        this.c = iconMinDimension;
        this.d = mediaMinDimension;
        this.e = nativeViewData;
    }
}
