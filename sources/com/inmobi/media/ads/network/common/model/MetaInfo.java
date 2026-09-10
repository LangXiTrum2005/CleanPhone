package com.inmobi.media.ads.network.common.model;

import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/MetaInfo;", "", "<init>", "()V", "value", "", "creativeType", "getCreativeType$annotations", "getCreativeType", "()Ljava/lang/String;", "iasEnabled", "", "getIasEnabled", "()Z", "omsdkInfo", "Lcom/inmobi/media/ads/network/common/model/OmSdkInfo;", "getOmsdkInfo", "()Lcom/inmobi/media/ads/network/common/model/OmSdkInfo;", "landingPageParams", "", "Lcom/inmobi/media/ads/network/common/model/LandingPageParam;", "getLandingPageParams", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetaInfo {
    private String creativeType = "unknown";
    private final boolean iasEnabled;
    private final List<LandingPageParam> landingPageParams;
    private final OmSdkInfo omsdkInfo;

    public final String getCreativeType() {
        return this.creativeType;
    }

    public final boolean getIasEnabled() {
        return this.iasEnabled;
    }

    public final List<LandingPageParam> getLandingPageParams() {
        return this.landingPageParams;
    }

    public final OmSdkInfo getOmsdkInfo() {
        return this.omsdkInfo;
    }

    public static /* synthetic */ void getCreativeType$annotations() {
    }
}
