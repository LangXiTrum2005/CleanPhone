package com.inmobi.media.ads.network.inmobiJson.model;

import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/NativeVideo;", "", "<init>", "()V", "vastTag", "", "getVastTag", "()Ljava/lang/String;", "experience", "Lcom/inmobi/media/ads/network/inmobiJson/model/VideoExperience;", "getExperience", "()Lcom/inmobi/media/ads/network/inmobiJson/model/VideoExperience;", "required", "", "getRequired", "()Z", "trackers", "", "Lcom/inmobi/media/ads/network/common/model/TrackingInfo;", "getTrackers", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeVideo {
    private final boolean required;
    private final String vastTag = "";
    private final VideoExperience experience = new VideoExperience();
    private final List<TrackingInfo> trackers = new ArrayList();

    public final VideoExperience getExperience() {
        return this.experience;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    public final String getVastTag() {
        return this.vastTag;
    }
}
