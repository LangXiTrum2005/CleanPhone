package com.inmobi.media.ads.network.common.model;

import com.inmobi.media.Ue;
import com.mbridge.msdk.foundation.entity.b;
import java.util.LinkedList;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/inmobi/media/ads/network/common/model/AdSet;", "", "<init>", "()V", "value", "", "adSetId", "getAdSetId", "()Ljava/lang/String;", b.JSON_KEY_ADS, "Ljava/util/LinkedList;", "Lcom/inmobi/media/ads/network/common/model/Ad;", "getAds", "()Ljava/util/LinkedList;", "isPod", "", "()Z", "", "podSuccessCount", "getPodSuccessCount", "()I", "isRewarded", "logEnabled", "getLogEnabled", "transactionId", "getTransactionId", "expiry", "", "getExpiry", "()J", "setExpiry", "(J)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdSet {
    private String adSetId = "";

    @Ue
    private final LinkedList<Ad> ads = new LinkedList<>();
    private long expiry = -1;
    private final boolean isPod;
    private boolean isRewarded;
    private final boolean logEnabled;
    private int podSuccessCount;
    private final String transactionId;

    public final String getAdSetId() {
        return this.adSetId;
    }

    public final LinkedList<Ad> getAds() {
        return this.ads;
    }

    public final long getExpiry() {
        return this.expiry;
    }

    public final boolean getLogEnabled() {
        return this.logEnabled;
    }

    public final int getPodSuccessCount() {
        return this.podSuccessCount;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: isPod, reason: from getter */
    public final boolean getIsPod() {
        return this.isPod;
    }

    /* JADX INFO: renamed from: isRewarded, reason: from getter */
    public final boolean getIsRewarded() {
        return this.isRewarded;
    }

    public final void setExpiry(long j) {
        this.expiry = j;
    }
}
