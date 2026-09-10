package com.inmobi.ads.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/ads/core/TrackingInfo;", "", "()V", "imBaseUrl", "", "getImBaseUrl", "()Ljava/lang/String;", "trackers", "", "Lcom/inmobi/ads/core/Trackers;", "getTrackers", "()Ljava/util/List;", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrackingInfo {
    private final String imBaseUrl = "";
    private final List<Trackers> trackers = EmptyList.X;

    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    public final List<Trackers> getTrackers() {
        return this.trackers;
    }
}
