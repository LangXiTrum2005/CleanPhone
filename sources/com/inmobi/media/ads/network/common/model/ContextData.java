package com.inmobi.media.ads.network.common.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/ContextData;", "", "<init>", "()V", "casAdTypeId", "", "getCasAdTypeId", "()I", "bidderId", "", "getBidderId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "enabled", "", "getEnabled", "()Z", "advertisedContent", "", "getAdvertisedContent", "()Ljava/lang/String;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContextData {
    private final String advertisedContent;
    private final Long bidderId;
    private final int casAdTypeId = -1;
    private final boolean enabled;

    public final String getAdvertisedContent() {
        return this.advertisedContent;
    }

    public final Long getBidderId() {
        return this.bidderId;
    }

    public final int getCasAdTypeId() {
        return this.casAdTypeId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
