package com.chartboost.heliumsdk.domain;

import androidx.datastore.preferences.protobuf.a;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.p004ironsource.k6;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JI\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006&"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AdLoadParams;", "", "adIdentifier", "Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "keywords", "Lcom/chartboost/heliumsdk/domain/Keywords;", "loadId", "", "queueId", k6.f25513u, "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "adInteractionListener", "Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "(Lcom/chartboost/heliumsdk/domain/AdIdentifier;Lcom/chartboost/heliumsdk/domain/Keywords;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;Lcom/chartboost/heliumsdk/domain/AdInteractionListener;)V", "getAdIdentifier", "()Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "getAdInteractionListener", "()Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "getBannerSize", "()Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "getKeywords", "()Lcom/chartboost/heliumsdk/domain/Keywords;", "getLoadId", "()Ljava/lang/String;", "getQueueId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AdLoadParams {
    private final AdIdentifier adIdentifier;
    private final AdInteractionListener adInteractionListener;
    private final HeliumBannerAd.HeliumBannerSize bannerSize;
    private final Keywords keywords;
    private final String loadId;
    private final String queueId;

    public AdLoadParams(AdIdentifier adIdentifier, Keywords keywords, String loadId, String str, HeliumBannerAd.HeliumBannerSize heliumBannerSize, AdInteractionListener adInteractionListener) {
        Intrinsics.f(adIdentifier, "adIdentifier");
        Intrinsics.f(keywords, "keywords");
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(adInteractionListener, "adInteractionListener");
        this.adIdentifier = adIdentifier;
        this.keywords = keywords;
        this.loadId = loadId;
        this.queueId = str;
        this.bannerSize = heliumBannerSize;
        this.adInteractionListener = adInteractionListener;
    }

    public static /* synthetic */ AdLoadParams copy$default(AdLoadParams adLoadParams, AdIdentifier adIdentifier, Keywords keywords, String str, String str2, HeliumBannerAd.HeliumBannerSize heliumBannerSize, AdInteractionListener adInteractionListener, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            adIdentifier = adLoadParams.adIdentifier;
        }
        if ((i2 & 2) != 0) {
            keywords = adLoadParams.keywords;
        }
        if ((i2 & 4) != 0) {
            str = adLoadParams.loadId;
        }
        if ((i2 & 8) != 0) {
            str2 = adLoadParams.queueId;
        }
        if ((i2 & 16) != 0) {
            heliumBannerSize = adLoadParams.bannerSize;
        }
        if ((i2 & 32) != 0) {
            adInteractionListener = adLoadParams.adInteractionListener;
        }
        HeliumBannerAd.HeliumBannerSize heliumBannerSize2 = heliumBannerSize;
        AdInteractionListener adInteractionListener2 = adInteractionListener;
        return adLoadParams.copy(adIdentifier, keywords, str, str2, heliumBannerSize2, adInteractionListener2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdIdentifier getAdIdentifier() {
        return this.adIdentifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Keywords getKeywords() {
        return this.keywords;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLoadId() {
        return this.loadId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQueueId() {
        return this.queueId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HeliumBannerAd.HeliumBannerSize getBannerSize() {
        return this.bannerSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AdInteractionListener getAdInteractionListener() {
        return this.adInteractionListener;
    }

    public final AdLoadParams copy(AdIdentifier adIdentifier, Keywords keywords, String loadId, String queueId, HeliumBannerAd.HeliumBannerSize bannerSize, AdInteractionListener adInteractionListener) {
        Intrinsics.f(adIdentifier, "adIdentifier");
        Intrinsics.f(keywords, "keywords");
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(adInteractionListener, "adInteractionListener");
        return new AdLoadParams(adIdentifier, keywords, loadId, queueId, bannerSize, adInteractionListener);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdLoadParams)) {
            return false;
        }
        AdLoadParams adLoadParams = (AdLoadParams) other;
        return Intrinsics.a(this.adIdentifier, adLoadParams.adIdentifier) && Intrinsics.a(this.keywords, adLoadParams.keywords) && Intrinsics.a(this.loadId, adLoadParams.loadId) && Intrinsics.a(this.queueId, adLoadParams.queueId) && Intrinsics.a(this.bannerSize, adLoadParams.bannerSize) && Intrinsics.a(this.adInteractionListener, adLoadParams.adInteractionListener);
    }

    public final AdIdentifier getAdIdentifier() {
        return this.adIdentifier;
    }

    public final AdInteractionListener getAdInteractionListener() {
        return this.adInteractionListener;
    }

    public final HeliumBannerAd.HeliumBannerSize getBannerSize() {
        return this.bannerSize;
    }

    public final Keywords getKeywords() {
        return this.keywords;
    }

    public final String getLoadId() {
        return this.loadId;
    }

    public final String getQueueId() {
        return this.queueId;
    }

    public int hashCode() {
        int iB = a.b(this.loadId, (this.keywords.hashCode() + (this.adIdentifier.hashCode() * 31)) * 31, 31);
        String str = this.queueId;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        HeliumBannerAd.HeliumBannerSize heliumBannerSize = this.bannerSize;
        return this.adInteractionListener.hashCode() + ((iHashCode + (heliumBannerSize != null ? heliumBannerSize.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "AdLoadParams(adIdentifier=" + this.adIdentifier + ", keywords=" + this.keywords + ", loadId=" + this.loadId + ", queueId=" + this.queueId + ", bannerSize=" + this.bannerSize + ", adInteractionListener=" + this.adInteractionListener + ')';
    }

    public /* synthetic */ AdLoadParams(AdIdentifier adIdentifier, Keywords keywords, String str, String str2, HeliumBannerAd.HeliumBannerSize heliumBannerSize, AdInteractionListener adInteractionListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(adIdentifier, keywords, str, (i2 & 8) != 0 ? null : str2, heliumBannerSize, adInteractionListener);
    }
}
