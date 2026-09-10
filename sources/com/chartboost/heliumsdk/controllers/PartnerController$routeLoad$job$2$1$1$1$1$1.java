package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdListener;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeLoad$job$2$1$1$1$1$1", f = "PartnerController.kt", l = {502}, m = "invokeSuspend")
public final class PartnerController$routeLoad$job$2$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PartnerAdapter $adapter;
    final /* synthetic */ String $auctionId;
    final /* synthetic */ Context $context;
    final /* synthetic */ Metrics $metrics;
    final /* synthetic */ PartnerAdLoadRequest $request;
    final /* synthetic */ Ref.ObjectRef<Result<PartnerAd>> $result;
    int label;
    final /* synthetic */ PartnerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeLoad$job$2$1$1$1$1$1(Metrics metrics, PartnerAdapter partnerAdapter, Context context, PartnerAdLoadRequest partnerAdLoadRequest, PartnerController partnerController, String str, Ref.ObjectRef<Result<PartnerAd>> objectRef, Continuation<? super PartnerController$routeLoad$job$2$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$metrics = metrics;
        this.$adapter = partnerAdapter;
        this.$context = context;
        this.$request = partnerAdLoadRequest;
        this.this$0 = partnerController;
        this.$auctionId = str;
        this.$result = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$routeLoad$job$2$1$1$1$1$1(this.$metrics, this.$adapter, this.$context, this.$request, this.this$0, this.$auctionId, this.$result, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChartboostMediationError chartboostMediationError;
        Object objMo165loadBWLJW6A;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                this.$metrics.setStart(new Long(System.currentTimeMillis()));
                PartnerAdapter partnerAdapter = this.$adapter;
                Context context = this.$context;
                PartnerAdLoadRequest partnerAdLoadRequest = this.$request;
                PartnerAdListener partnerAdListenerCreatePartnerAdListener = this.this$0.createPartnerAdListener(partnerAdLoadRequest.getAdInteractionListener(), this.$auctionId);
                this.label = 1;
                objMo165loadBWLJW6A = partnerAdapter.mo165loadBWLJW6A(context, partnerAdLoadRequest, partnerAdListenerCreatePartnerAdListener, this);
                if (objMo165loadBWLJW6A == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objMo165loadBWLJW6A = ((Result) obj).X;
            }
            PartnerController partnerController = this.this$0;
            Metrics metrics = this.$metrics;
            Ref.ObjectRef<Result<PartnerAd>> objectRef = this.$result;
            partnerController.handleLoadResult(objMo165loadBWLJW6A, metrics);
            objectRef.X = objMo165loadBWLJW6A;
        } catch (Exception e2) {
            this.$metrics.setEnd(new Long(System.currentTimeMillis()));
            this.$metrics.setSuccess(false);
            Metrics metrics2 = this.$metrics;
            ChartboostMediationAdException chartboostMediationAdException = e2 instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) e2 : null;
            if (chartboostMediationAdException == null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
                chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_EXCEPTION;
            }
            metrics2.setChartboostMediationError(chartboostMediationError);
            this.$metrics.setChartboostMediationErrorMessage(e2.getMessage());
            this.$result.X = ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_EXCEPTION));
        }
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PartnerController$routeLoad$job$2$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
