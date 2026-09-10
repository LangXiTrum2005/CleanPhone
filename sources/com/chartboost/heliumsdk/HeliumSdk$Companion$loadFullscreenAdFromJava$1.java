package com.chartboost.heliumsdk;

import android.content.Context;
import com.chartboost.heliumsdk.ad.ChartboostMediationAdLoadRequest;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadListener;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdLoadResult;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.HeliumSdk$Companion$loadFullscreenAdFromJava$1", f = "HeliumSdk.kt", l = {330}, m = "invokeSuspend")
public final class HeliumSdk$Companion$loadFullscreenAdFromJava$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChartboostMediationFullscreenAdLoadListener $adLoadListener;
    final /* synthetic */ Context $context;
    final /* synthetic */ ChartboostMediationFullscreenAdListener $listener;
    final /* synthetic */ ChartboostMediationAdLoadRequest $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeliumSdk$Companion$loadFullscreenAdFromJava$1(Context context, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, ChartboostMediationFullscreenAdLoadListener chartboostMediationFullscreenAdLoadListener, Continuation<? super HeliumSdk$Companion$loadFullscreenAdFromJava$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$request = chartboostMediationAdLoadRequest;
        this.$listener = chartboostMediationFullscreenAdListener;
        this.$adLoadListener = chartboostMediationFullscreenAdLoadListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeliumSdk$Companion$loadFullscreenAdFromJava$1(this.$context, this.$request, this.$listener, this.$adLoadListener, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            HeliumSdk.Companion companion = HeliumSdk.INSTANCE;
            Context context = this.$context;
            ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest = this.$request;
            ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener = this.$listener;
            this.label = 1;
            obj = companion.loadFullscreenAd(context, chartboostMediationAdLoadRequest, chartboostMediationFullscreenAdListener, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.$adLoadListener.onAdLoaded((ChartboostMediationFullscreenAdLoadResult) obj);
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HeliumSdk$Companion$loadFullscreenAdFromJava$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
