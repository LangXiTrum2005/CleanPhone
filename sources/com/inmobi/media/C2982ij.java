package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2982ij extends AbstractC2797bc {
    public final String a;
    public final ArrayList b;

    public C2982ij(String str, ArrayList trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.a = str;
        this.b = trackers;
    }
}
