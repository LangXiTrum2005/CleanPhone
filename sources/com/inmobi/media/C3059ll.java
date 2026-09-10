package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3059ll {
    public final String a;
    public final ArrayList b;

    public C3059ll(String clickThroughUrl, ArrayList vastClickTrackers) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(vastClickTrackers, "vastClickTrackers");
        this.a = clickThroughUrl;
        this.b = vastClickTrackers;
    }
}
