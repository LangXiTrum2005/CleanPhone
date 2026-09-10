package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import com.chartboost.heliumsdk.domain.PreBidRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeGetBidderInformation$bidJob$2$1$1$1$1", f = "PartnerController.kt", l = {379}, m = "invokeSuspend")
public final class PartnerController$routeGetBidderInformation$bidJob$2$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ ConcurrentHashMap<String, Map<String, String>> $bidTokens;
    final /* synthetic */ Context $context;
    final /* synthetic */ Metrics $metrics;
    final /* synthetic */ String $partnerId;
    final /* synthetic */ PreBidRequest $request;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PartnerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeGetBidderInformation$bidJob$2$1$1$1$1(PartnerController partnerController, String str, Metrics metrics, ConcurrentHashMap<String, Map<String, String>> concurrentHashMap, Context context, PreBidRequest preBidRequest, Continuation<? super PartnerController$routeGetBidderInformation$bidJob$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = partnerController;
        this.$partnerId = str;
        this.$metrics = metrics;
        this.$bidTokens = concurrentHashMap;
        this.$context = context;
        this.$request = preBidRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$routeGetBidderInformation$bidJob$2$1$1$1$1(this.this$0, this.$partnerId, this.$metrics, this.$bidTokens, this.$context, this.$request, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Metrics metrics;
        Map map;
        long jCurrentTimeMillis;
        long j;
        ChartboostMediationAdException chartboostMediationAdException;
        ChartboostMediationError chartboostMediationError;
        Map map2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PartnerController partnerController = this.this$0;
            str = this.$partnerId;
            metrics = this.$metrics;
            map = this.$bidTokens;
            Context context = this.$context;
            PreBidRequest preBidRequest = this.$request;
            jCurrentTimeMillis = System.currentTimeMillis();
            PartnerAdapter partnerAdapter = partnerController.getAdapters().get(str);
            if (partnerAdapter != null) {
                metrics.setStart(new Long(System.currentTimeMillis()));
                try {
                    this.L$0 = str;
                    this.L$1 = metrics;
                    this.L$2 = map;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    obj = partnerAdapter.fetchBidderInformation(context, preBidRequest, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = jCurrentTimeMillis;
                } catch (Exception e2) {
                    e = e2;
                    j = jCurrentTimeMillis;
                    metrics.setEnd(new Long(System.currentTimeMillis()));
                    metrics.setSuccess(false);
                    if (e instanceof ChartboostMediationAdException) {
                        chartboostMediationAdException = (ChartboostMediationAdException) e;
                    } else {
                        chartboostMediationAdException = null;
                    }
                    if (chartboostMediationAdException != null) {
                        chartboostMediationError = ChartboostMediationError.CM_PREBID_FAILURE_EXCEPTION;
                    } else {
                        chartboostMediationError = ChartboostMediationError.CM_PREBID_FAILURE_EXCEPTION;
                    }
                    metrics.setChartboostMediationError(chartboostMediationError);
                    metrics.setChartboostMediationErrorMessage(e.getMessage());
                    map2 = EmptyMap.X;
                }
            }
            Long l2 = new Long(System.currentTimeMillis() - jCurrentTimeMillis);
            this.$metrics.setDuration(new Long(l2.longValue()));
            return l2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = this.J$0;
        map = (Map) this.L$2;
        metrics = (Metrics) this.L$1;
        str = (String) this.L$0;
        try {
            ResultKt.b(obj);
        } catch (Exception e3) {
            e = e3;
            metrics.setEnd(new Long(System.currentTimeMillis()));
            metrics.setSuccess(false);
            if (e instanceof ChartboostMediationAdException) {
                chartboostMediationAdException = (ChartboostMediationAdException) e;
            } else {
                chartboostMediationAdException = null;
            }
            if (chartboostMediationAdException != null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
                chartboostMediationError = ChartboostMediationError.CM_PREBID_FAILURE_EXCEPTION;
            }
            metrics.setChartboostMediationError(chartboostMediationError);
            metrics.setChartboostMediationErrorMessage(e.getMessage());
            map2 = EmptyMap.X;
        }
        map2 = (Map) obj;
        metrics.setEnd(new Long(System.currentTimeMillis()));
        metrics.setSuccess(true);
        jCurrentTimeMillis = j;
        map.put(str, map2);
        Long l3 = new Long(System.currentTimeMillis() - jCurrentTimeMillis);
        this.$metrics.setDuration(new Long(l3.longValue()));
        return l3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((PartnerController$routeGetBidderInformation$bidJob$2$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
