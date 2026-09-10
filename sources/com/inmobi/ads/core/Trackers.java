package com.inmobi.ads.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/inmobi/ads/core/Trackers;", "", "()V", "imExts", "", "", "getImExts", "()Ljava/util/List;", "type", "getType", "()Ljava/lang/String;", "url", "getUrl", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Trackers {
    private final List<String> imExts;
    private final String type = "";
    private final List<String> url;

    public Trackers() {
        EmptyList emptyList = EmptyList.X;
        this.imExts = emptyList;
        this.url = emptyList;
    }

    public final List<String> getImExts() {
        return this.imExts;
    }

    public final String getType() {
        return this.type;
    }

    public final List<String> getUrl() {
        return this.url;
    }
}
