package com.inmobi.media.ads.network.common.model;

import com.inmobi.media.Ue;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/AdResponse;", "", "<init>", "()V", "value", "", "requestId", "getRequestId", "()Ljava/lang/String;", "placementId", "", "getPlacementId", "()J", "adSets", "", "Lcom/inmobi/media/ads/network/common/model/AdSet;", "getAdSets", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdResponse {
    private String requestId = "";
    private final long placementId = -1;

    @Ue
    private final List<AdSet> adSets = new ArrayList();

    public final List<AdSet> getAdSets() {
        return this.adSets;
    }

    public final long getPlacementId() {
        return this.placementId;
    }

    public final String getRequestId() {
        return this.requestId;
    }
}
