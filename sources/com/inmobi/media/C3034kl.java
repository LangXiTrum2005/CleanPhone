package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3034kl {
    public final String a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public C3034kl(String universalAdId, String adServingId, int i, ArrayList trackers) {
        Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.a = universalAdId;
        this.b = adServingId;
        this.c = i;
        this.d = trackers;
    }
}
