package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3355xi {
    public final LinkedHashMap a;
    public final MainLink b;
    public final List c;

    public C3355xi(LinkedHashMap assetIdToLinkMap, MainLink mainLink, List responseClickTrackers) {
        Intrinsics.checkNotNullParameter(assetIdToLinkMap, "assetIdToLinkMap");
        Intrinsics.checkNotNullParameter(responseClickTrackers, "responseClickTrackers");
        this.a = assetIdToLinkMap;
        this.b = mainLink;
        this.c = responseClickTrackers;
    }
}
