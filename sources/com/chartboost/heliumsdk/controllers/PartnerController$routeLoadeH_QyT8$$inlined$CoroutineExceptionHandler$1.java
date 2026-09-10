package com.chartboost.heliumsdk.controllers;

import android.util.Size;
import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.network.Endpoints;
import com.p004ironsource.mediationsdk.metadata.a;
import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$routeLoad-eH_QyT8$$inlined$CoroutineExceptionHandler$1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", g.f39715A, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerController$routeLoadeH_QyT8$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ String $auctionId$inlined;
    final /* synthetic */ boolean $isMediation$inlined;
    final /* synthetic */ String $lineItemId$inlined;
    final /* synthetic */ String $placementType$inlined;
    final /* synthetic */ PartnerAdLoadRequest $request$inlined;
    final /* synthetic */ Ref.ObjectRef $result$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeLoadeH_QyT8$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, PartnerAdLoadRequest partnerAdLoadRequest, boolean z2, String str, String str2, String str3, Ref.ObjectRef objectRef) {
        super(key);
        this.$request$inlined = partnerAdLoadRequest;
        this.$isMediation$inlined = z2;
        this.$auctionId$inlined = str;
        this.$placementType$inlined = str2;
        this.$lineItemId$inlined = str3;
        this.$result$inlined = objectRef;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        ChartboostMediationError chartboostMediationError;
        MetricsManager metricsManager = MetricsManager.INSTANCE;
        String partnerId = this.$request$inlined.getPartnerId();
        Endpoints.Sdk.Event event = Endpoints.Sdk.Event.LOAD;
        ChartboostMediationAdException chartboostMediationAdException = exception instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) exception : null;
        if (chartboostMediationAdException == null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
            chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_EXCEPTION;
        }
        String message = exception.getMessage();
        String identifier = this.$request$inlined.getIdentifier();
        Size size = this.$request$inlined.getSize();
        metricsManager.postMetricsDataForFailedEvent(partnerId, event, this.$auctionId$inlined, chartboostMediationError, message, (14336 & 32) != 0 ? null : this.$placementType$inlined, (14336 & 64) != 0 ? null : (size == null || !Intrinsics.a(this.$placementType$inlined, "adaptive_banner")) ? null : size, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : identifier, (14336 & 1024) != 0 ? null : null, (14336 & a.f25965n) != 0 ? null : Metrics.NetworkType.INSTANCE.getType(this.$isMediation$inlined), (14336 & 4096) != 0 ? null : this.$lineItemId$inlined, (14336 & Segment.SIZE) != 0 ? null : this.$request$inlined.getPartnerPlacement());
        this.$result$inlined.X = ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_EXCEPTION));
    }
}
