package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3184ql {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;

    public C3184ql(String universalAdId, String adServingId, ArrayList trackers, String clickThroughUrl, String mediaDuration, ArrayList companionAds, ArrayList mediaFiles) {
        Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        this.a = universalAdId;
        this.b = adServingId;
        this.c = trackers;
        this.d = clickThroughUrl;
        this.e = mediaDuration;
        this.f = companionAds;
        this.g = mediaFiles;
    }
}
