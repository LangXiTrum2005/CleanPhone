package com.inmobi.media.ads.network.common.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/LandingPageParam;", "", "<init>", "()V", "openMode", "", "getOpenMode$annotations", "getOpenMode", "()Ljava/lang/String;", "supportLockScreen", "", "getSupportLockScreen", "()Z", "aParams", "Lcom/inmobi/media/ads/network/common/model/InlineParams;", "getAParams", "()Lcom/inmobi/media/ads/network/common/model/InlineParams;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LandingPageParam {
    private final InlineParams aParams;
    private final String openMode = "DEFAULT";
    private final boolean supportLockScreen;

    public final InlineParams getAParams() {
        return this.aParams;
    }

    public final String getOpenMode() {
        return this.openMode;
    }

    public final boolean getSupportLockScreen() {
        return this.supportLockScreen;
    }

    public static /* synthetic */ void getOpenMode$annotations() {
    }
}
