package com.chartboost.heliumsdk.ad;

import android.content.Context;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import java.util.Set;
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
@DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$Companion$performAdLoad$2$2", f = "ChartboostMediationFullscreenAd.kt", l = {143}, m = "invokeSuspend")
public final class ChartboostMediationFullscreenAd$Companion$performAdLoad$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdController $adController;
    final /* synthetic */ AdLoadParams $adLoadParams;
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<Result<CachedAd>> $loadResult;
    final /* synthetic */ Set<Metrics> $metricsSet;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationFullscreenAd$Companion$performAdLoad$2$2(Ref.ObjectRef<Result<CachedAd>> objectRef, AdController adController, Context context, AdLoadParams adLoadParams, Set<Metrics> set, Continuation<? super ChartboostMediationFullscreenAd$Companion$performAdLoad$2$2> continuation) {
        super(2, continuation);
        this.$loadResult = objectRef;
        this.$adController = adController;
        this.$context = context;
        this.$adLoadParams = adLoadParams;
        this.$metricsSet = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartboostMediationFullscreenAd$Companion$performAdLoad$2$2(this.$loadResult, this.$adController, this.$context, this.$adLoadParams, this.$metricsSet, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef<Result<CachedAd>> objectRef;
        Result result;
        Ref.ObjectRef<Result<CachedAd>> objectRef2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            objectRef = this.$loadResult;
            AdController adController = this.$adController;
            if (adController != null) {
                Context context = this.$context;
                AdLoadParams adLoadParams = this.$adLoadParams;
                Set<Metrics> set = this.$metricsSet;
                this.L$0 = objectRef;
                this.label = 1;
                Object objM161loadBWLJW6A = adController.m161loadBWLJW6A(context, adLoadParams, set, this);
                if (objM161loadBWLJW6A == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objectRef2 = objectRef;
                obj2 = objM161loadBWLJW6A;
            } else {
                result = new Result(ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_CHARTBOOST_MEDIATION_NOT_INITIALIZED)));
            }
            objectRef.X = result;
            return Unit.f43263a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (Ref.ObjectRef) this.L$0;
        ResultKt.b(obj);
        obj2 = ((Result) obj).X;
        result = new Result(obj2);
        objectRef = objectRef2;
        objectRef.X = result;
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartboostMediationFullscreenAd$Companion$performAdLoad$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
