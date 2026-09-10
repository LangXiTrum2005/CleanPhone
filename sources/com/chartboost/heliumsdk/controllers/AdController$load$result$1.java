package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.BidsResponse;
import com.chartboost.heliumsdk.domain.PreBidRequest;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", "Lcom/chartboost/heliumsdk/domain/BidsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AdController$load$result$1", f = "AdController.kt", l = {110, 105}, m = "invokeSuspend")
public final class AdController$load$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends BidsResponse>>, Object> {
    final /* synthetic */ AdLoadParams $adLoadParams;
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AdController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdController$load$result$1(AdController adController, AdLoadParams adLoadParams, Context context, Continuation<? super AdController$load$result$1> continuation) {
        super(2, continuation);
        this.this$0 = adController;
        this.$adLoadParams = adLoadParams;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdController$load$result$1(this.this$0, this.$adLoadParams, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PrivacyController privacyController;
        AdLoadParams adLoadParams;
        ChartboostMediationNetworking chartboostMediationNetworking;
        PartnerController partnerController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChartboostMediationNetworking chartboostMediationNetworking2 = ChartboostMediationNetworking.INSTANCE;
            privacyController = this.this$0.privacyController;
            PartnerController partnerController2 = this.this$0.partnerController;
            adLoadParams = this.$adLoadParams;
            PartnerController partnerController3 = this.this$0.partnerController;
            Context context = this.$context;
            PreBidRequest preBidRequest = new PreBidRequest(this.$adLoadParams.getAdIdentifier().getPlacementName(), AdController.INSTANCE.adTypeToAdFormat$Helium_release(this.$adLoadParams.getAdIdentifier().getAdType()), this.$adLoadParams.getLoadId());
            this.L$0 = chartboostMediationNetworking2;
            this.L$1 = privacyController;
            this.L$2 = partnerController2;
            this.L$3 = adLoadParams;
            this.label = 1;
            Object objRouteGetBidderInformation = partnerController3.routeGetBidderInformation(context, preBidRequest, this);
            if (objRouteGetBidderInformation != coroutineSingletons) {
                chartboostMediationNetworking = chartboostMediationNetworking2;
                partnerController = partnerController2;
                obj = objRouteGetBidderInformation;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        adLoadParams = (AdLoadParams) this.L$3;
        PartnerController partnerController4 = (PartnerController) this.L$2;
        privacyController = (PrivacyController) this.L$1;
        ChartboostMediationNetworking chartboostMediationNetworking3 = (ChartboostMediationNetworking) this.L$0;
        ResultKt.b(obj);
        chartboostMediationNetworking = chartboostMediationNetworking3;
        partnerController = partnerController4;
        ChartboostMediationNetworking chartboostMediationNetworking4 = chartboostMediationNetworking;
        AdLoadParams adLoadParams2 = adLoadParams;
        String strValueOf = String.valueOf(this.this$0.loadRateLimiter.getLoadRateLimitSeconds(this.$adLoadParams.getAdIdentifier().getPlacementName()));
        int impressionDepth = this.this$0.getImpressionDepth(this.$adLoadParams.getAdIdentifier().getAdType());
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        Object objMakeBidRequest = chartboostMediationNetworking4.makeBidRequest(privacyController, partnerController, adLoadParams2, (Map) obj, strValueOf, impressionDepth, this);
        return objMakeBidRequest == coroutineSingletons ? coroutineSingletons : objMakeBidRequest;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChartboostMediationNetworkingResult<BidsResponse>> continuation) {
        return ((AdController$load$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
