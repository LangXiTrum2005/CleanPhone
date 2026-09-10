package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3159pl {
    public final int a;
    public final int b;
    public final String c;
    public final int d;

    public C3159pl(int i, int i2, String mediaUrl, String delivery, String type, int i3) {
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = i;
        this.b = i2;
        this.c = mediaUrl;
        this.d = i3;
    }
}
