package com.chartboost.heliumsdk.ad;

import android.content.Context;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.domain.AdFormat;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.utils.LogController;
import com.thinkup.core.common.n.mo;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdLoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$Companion$loadFullscreenAd$2", f = "ChartboostMediationFullscreenAd.kt", l = {mo.oom.ooo}, m = "invokeSuspend")
public final class ChartboostMediationFullscreenAd$Companion$loadFullscreenAd$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChartboostMediationFullscreenAdLoadResult>, Object> {
    final /* synthetic */ AdController $adController;
    final /* synthetic */ Context $context;
    final /* synthetic */ ChartboostMediationFullscreenAdListener $listener;
    final /* synthetic */ String $queueId;
    final /* synthetic */ ChartboostMediationAdLoadRequest $request;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationFullscreenAd$Companion$loadFullscreenAd$2(ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, AdController adController, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, String str, Context context, Continuation<? super ChartboostMediationFullscreenAd$Companion$loadFullscreenAd$2> continuation) {
        super(2, continuation);
        this.$request = chartboostMediationAdLoadRequest;
        this.$adController = adController;
        this.$listener = chartboostMediationFullscreenAdListener;
        this.$queueId = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartboostMediationFullscreenAd$Companion$loadFullscreenAd$2(this.$request, this.$adController, this.$listener, this.$queueId, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strGenerateLoadId;
        ChartboostMediationFullscreenAd chartboostMediationFullscreenAdCreateChartboostMediationFullscreenAd;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChartboostMediationFullscreenAd.Companion companion = ChartboostMediationFullscreenAd.INSTANCE;
            strGenerateLoadId = companion.generateLoadId();
            chartboostMediationFullscreenAdCreateChartboostMediationFullscreenAd = companion.createChartboostMediationFullscreenAd(strGenerateLoadId, this.$request, this.$adController, this.$listener);
            AdFormat adFormat = companion.getAdFormat(this.$request);
            if (adFormat == null) {
                return companion.createAdLoadResult(null, strGenerateLoadId, companion.createPayloadJson(new LinkedHashSet()), ChartboostMediationError.CM_LOAD_FAILURE_UNSUPPORTED_AD_FORMAT);
            }
            AdLoadParams adLoadParamsCreateAdLoadParams = companion.createAdLoadParams(chartboostMediationFullscreenAdCreateChartboostMediationFullscreenAd, this.$request, strGenerateLoadId, this.$queueId, adFormat);
            Context context = this.$context;
            AdController adController = this.$adController;
            this.L$0 = strGenerateLoadId;
            this.L$1 = chartboostMediationFullscreenAdCreateChartboostMediationFullscreenAd;
            this.label = 1;
            obj = companion.performAdLoad(context, adLoadParamsCreateAdLoadParams, adController, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChartboostMediationFullscreenAd chartboostMediationFullscreenAd = (ChartboostMediationFullscreenAd) this.L$1;
            String str = (String) this.L$0;
            ResultKt.b(obj);
            chartboostMediationFullscreenAdCreateChartboostMediationFullscreenAd = chartboostMediationFullscreenAd;
            strGenerateLoadId = str;
        }
        Pair pair = (Pair) obj;
        Set set = (Set) pair.X;
        Result result = (Result) pair.f43249Y;
        ChartboostMediationFullscreenAd.Companion companion2 = ChartboostMediationFullscreenAd.INSTANCE;
        JSONObject jSONObjectCreatePayloadJson = companion2.createPayloadJson(set);
        ChartboostMediationError error = companion2.getError(result);
        if (error == null) {
            companion2.updateAdDetails(chartboostMediationFullscreenAdCreateChartboostMediationFullscreenAd, companion2.getCachedAd(result), strGenerateLoadId, this.$listener, this.$request);
            return companion2.createAdLoadResult(chartboostMediationFullscreenAdCreateChartboostMediationFullscreenAd, strGenerateLoadId, jSONObjectCreatePayloadJson, null);
        }
        LogController.INSTANCE.e("Failed to load fullscreen ad with error: " + error);
        return companion2.createAdLoadResult(null, strGenerateLoadId, jSONObjectCreatePayloadJson, error);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChartboostMediationFullscreenAdLoadResult> continuation) {
        return ((ChartboostMediationFullscreenAd$Companion$loadFullscreenAd$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
