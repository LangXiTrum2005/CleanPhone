package com.chartboost.heliumsdk.controllers;

import android.util.Size;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.domain.AdFormat;
import com.chartboost.heliumsdk.domain.AdInteractionListener;
import com.chartboost.heliumsdk.domain.Bid;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.p004ironsource.k6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002JR\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/BidController;", "", "partnerController", "Lcom/chartboost/heliumsdk/controllers/PartnerController;", "(Lcom/chartboost/heliumsdk/controllers/PartnerController;)V", "constructAdLoadRequest", "Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", "bid", "Lcom/chartboost/heliumsdk/domain/Bid;", k6.f25513u, "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "adInteractionListener", "Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "getAdMarkup", "", "loadBids", "Lkotlin/Result;", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "context", "Landroid/content/Context;", "bids", "Lcom/chartboost/heliumsdk/domain/Bids;", "loadMetricsSet", "", "Lcom/chartboost/heliumsdk/domain/Metrics;", "loadBids-hUnOzRk", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/Bids;Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;Lcom/chartboost/heliumsdk/domain/AdInteractionListener;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldForceReference", "", "placementName", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidController {
    private final PartnerController partnerController;

    public BidController(PartnerController partnerController) {
        Intrinsics.f(partnerController, "partnerController");
        this.partnerController = partnerController;
    }

    private final PartnerAdLoadRequest constructAdLoadRequest(Bid bid, HeliumBannerAd.HeliumBannerSize bannerSize, AdInteractionListener adInteractionListener) {
        String partnerName = shouldForceReference(bid.getAdIdentifier().getPlacementName()) ? "reference" : bid.getPartnerName();
        String placementName = bid.getAdIdentifier().getPlacementName();
        String partnerPlacementName = bid.getPartnerPlacementName();
        int width = bannerSize != null ? bannerSize.getWidth() : HeliumBannerAd.HeliumBannerSize.STANDARD.getWidth();
        if (bannerSize == null) {
            bannerSize = HeliumBannerAd.HeliumBannerSize.STANDARD;
        }
        Size size = new Size(width, bannerSize.getHeight());
        AdController.Companion companion = AdController.INSTANCE;
        return new PartnerAdLoadRequest(partnerName, placementName, partnerPlacementName, size, companion.adTypeToAdFormat$Helium_release(bid.getAdIdentifier().getAdType()), getAdMarkup(bid), bid.getLoadRequestId(), bid.getPartnerSettings(), adInteractionListener, companion.adTypeToAdFormat$Helium_release(bid.getAdIdentifier().getAdType()) == AdFormat.ADAPTIVE_BANNER);
    }

    private final String getAdMarkup(Bid bid) {
        String adm;
        return (bid.getIsMediation() || (adm = bid.getAdm()) == null) ? "" : adm;
    }

    private final boolean shouldForceReference(String placementName) {
        return HeliumSdk.INSTANCE.getTestMode() == 1 && StringsKt.M(placementName, "REF", false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:23:0x0117  */
    /* JADX WARN: Code duplicated, block: B:24:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00e2 -> B:20:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: loadBids-hUnOzRk, reason: not valid java name */
    public final java.lang.Object m162loadBidshUnOzRk(android.content.Context r19, com.chartboost.heliumsdk.domain.Bids r20, com.chartboost.heliumsdk.ad.HeliumBannerAd.HeliumBannerSize r21, com.chartboost.heliumsdk.domain.AdInteractionListener r22, java.util.Set<com.chartboost.heliumsdk.domain.Metrics> r23, kotlin.coroutines.Continuation<? super kotlin.Result<com.chartboost.heliumsdk.domain.PartnerAd>> r24) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.heliumsdk.controllers.BidController.m162loadBidshUnOzRk(android.content.Context, com.chartboost.heliumsdk.domain.Bids, com.chartboost.heliumsdk.ad.HeliumBannerAd$HeliumBannerSize, com.chartboost.heliumsdk.domain.AdInteractionListener, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
