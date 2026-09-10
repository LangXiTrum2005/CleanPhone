package com.inmobi.media.ads.network.common.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/Viewability;", "", "<init>", "()V", "inmobi", "Lcom/inmobi/media/ads/network/common/model/ViewabilityParams;", "getInmobi", "()Lcom/inmobi/media/ads/network/common/model/ViewabilityParams;", "mrc50", "Lcom/inmobi/media/ads/network/common/model/MRC50Params;", "getMrc50", "()Lcom/inmobi/media/ads/network/common/model/MRC50Params;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Viewability {
    private final ViewabilityParams inmobi;
    private final MRC50Params mrc50;

    public final ViewabilityParams getInmobi() {
        return this.inmobi;
    }

    public final MRC50Params getMrc50() {
        return this.mrc50;
    }
}
