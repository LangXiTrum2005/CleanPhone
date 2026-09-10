package com.inmobi.media.ads.network.inmobiJson.model;

import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/Image;", "", "<init>", "()V", "value", "", "width", "getWidth", "()I", "height", "getHeight", "url", "", "getUrl", "()Ljava/lang/String;", "link", "Lcom/inmobi/media/ads/network/inmobiJson/model/Link;", "getLink", "()Lcom/inmobi/media/ads/network/inmobiJson/model/Link;", "trackers", "", "Lcom/inmobi/media/ads/network/common/model/TrackingInfo;", "getTrackers", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Image {
    private int height;
    private final Link link;
    private int width;
    private final String url = "";
    private final List<TrackingInfo> trackers = new ArrayList();

    public final int getHeight() {
        return this.height;
    }

    public final Link getLink() {
        return this.link;
    }

    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }
}
