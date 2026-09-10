package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.PartnerAd;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeShow$partnerShowJob$2$1$1", f = "PartnerController.kt", l = {660}, m = "invokeSuspend")
public final class PartnerController$routeShow$partnerShowJob$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ PartnerAdapter $adapter;
    final /* synthetic */ Context $context;
    final /* synthetic */ Metrics $metrics;
    final /* synthetic */ PartnerAd $partnerAd;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PartnerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeShow$partnerShowJob$2$1$1(Metrics metrics, PartnerController partnerController, PartnerAdapter partnerAdapter, Context context, PartnerAd partnerAd, Continuation<? super PartnerController$routeShow$partnerShowJob$2$1$1> continuation) {
        super(2, continuation);
        this.$metrics = metrics;
        this.this$0 = partnerController;
        this.$adapter = partnerAdapter;
        this.$context = context;
        this.$partnerAd = partnerAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$routeShow$partnerShowJob$2$1$1(this.$metrics, this.this$0, this.$adapter, this.$context, this.$partnerAd, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Metrics metrics;
        long j;
        PartnerController partnerController;
        Object obj2;
        ChartboostMediationError chartboostMediationError;
        String message;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.$metrics.setStart(new Long(System.currentTimeMillis()));
            PartnerController partnerController2 = this.this$0;
            PartnerAdapter partnerAdapter = this.$adapter;
            Context context = this.$context;
            PartnerAd partnerAd = this.$partnerAd;
            Metrics metrics2 = this.$metrics;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                this.L$0 = metrics2;
                this.L$1 = partnerController2;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                Object objMo167show0E7RQCE = partnerAdapter.mo167show0E7RQCE(context, partnerAd, this);
                if (objMo167show0E7RQCE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                partnerController = partnerController2;
                obj2 = objMo167show0E7RQCE;
                metrics = metrics2;
                j = jCurrentTimeMillis;
            } catch (Exception e2) {
                e = e2;
                metrics = metrics2;
                j = jCurrentTimeMillis;
                metrics.setEnd(new Long(System.currentTimeMillis()));
                metrics.setSuccess(false);
                chartboostMediationError = ChartboostMediationError.CM_SHOW_FAILURE_EXCEPTION;
                metrics.setChartboostMediationError(chartboostMediationError);
                message = e.getMessage();
                if (message == null) {
                    message = chartboostMediationError.getMessage();
                }
                metrics.setChartboostMediationErrorMessage(message);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            partnerController = (PartnerController) this.L$1;
            metrics = (Metrics) this.L$0;
            try {
                ResultKt.b(obj);
                obj2 = ((Result) obj).X;
            } catch (Exception e3) {
                e = e3;
                metrics.setEnd(new Long(System.currentTimeMillis()));
                metrics.setSuccess(false);
                chartboostMediationError = ChartboostMediationError.CM_SHOW_FAILURE_EXCEPTION;
                metrics.setChartboostMediationError(chartboostMediationError);
                message = e.getMessage();
                if (message == null) {
                    message = chartboostMediationError.getMessage();
                }
                metrics.setChartboostMediationErrorMessage(message);
            }
        }
        partnerController.handleShowResult(obj2, metrics);
        Long l2 = new Long(System.currentTimeMillis() - j);
        this.$metrics.setDuration(new Long(l2.longValue()));
        return l2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((PartnerController$routeShow$partnerShowJob$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
