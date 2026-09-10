package com.chartboost.heliumsdk.controllers;

import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.network.Endpoints;
import com.p004ironsource.mediationsdk.metadata.a;
import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", g.f39715A, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerController$routeShow$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ String $auctionIdentifier$inlined;
    final /* synthetic */ Ref.ObjectRef $internalAdShowResult$inlined;
    final /* synthetic */ PartnerAd $partnerAd$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeShow$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, PartnerAd partnerAd, String str, Ref.ObjectRef objectRef) {
        super(key);
        this.$partnerAd$inlined = partnerAd;
        this.$auctionIdentifier$inlined = str;
        this.$internalAdShowResult$inlined = objectRef;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        MetricsManager metricsManager = MetricsManager.INSTANCE;
        String partnerId = this.$partnerAd$inlined.getRequest().getPartnerId();
        Endpoints.Sdk.Event event = Endpoints.Sdk.Event.SHOW;
        String str = this.$auctionIdentifier$inlined;
        ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_SHOW_FAILURE_EXCEPTION;
        String message = exception.getMessage();
        if (message == null) {
            message = chartboostMediationError.getMessage();
        }
        metricsManager.postMetricsDataForFailedEvent(partnerId, event, str, chartboostMediationError, message, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? null : null, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : null, (14336 & 1024) != 0 ? null : null, (14336 & a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : this.$partnerAd$inlined.getRequest().getPartnerPlacement());
        Ref.ObjectRef objectRef = this.$internalAdShowResult$inlined;
        PartnerAd partnerAd = this.$partnerAd$inlined;
        Metrics metrics = new Metrics(partnerAd.getRequest().getPartnerId(), event);
        metrics.setSuccess(false);
        metrics.setAuctionId(this.$auctionIdentifier$inlined);
        metrics.setChartboostMediationError(chartboostMediationError);
        String message2 = exception.getMessage();
        if (message2 == null) {
            message2 = chartboostMediationError.getMessage();
        }
        metrics.setChartboostMediationErrorMessage(message2);
        objectRef.X = new PartnerController.PartnerShowResult(partnerAd, SetsKt.h(metrics));
    }
}
