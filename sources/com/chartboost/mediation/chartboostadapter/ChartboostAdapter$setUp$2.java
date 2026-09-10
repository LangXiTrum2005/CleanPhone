package com.chartboost.mediation.chartboostadapter;

import android.content.Context;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.PartnerConfiguration;
import com.chartboost.heliumsdk.utils.PartnerLogController;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.LoggingLevel;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.StartError;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.mediation.chartboostadapter.ChartboostAdapter$setUp$2", f = "ChartboostAdapter.kt", l = {959}, m = "invokeSuspend")
public final class ChartboostAdapter$setUp$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PartnerConfiguration $partnerConfiguration;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostAdapter$setUp$2(PartnerConfiguration partnerConfiguration, Context context, Continuation<? super ChartboostAdapter$setUp$2> continuation) {
        super(2, continuation);
        this.$partnerConfiguration = partnerConfiguration;
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5$resumeOnce(CancellableContinuation<? super Result<Unit>> cancellableContinuation, Object obj) {
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(new Result(obj));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChartboostAdapter$setUp$2 chartboostAdapter$setUp$2 = new ChartboostAdapter$setUp$2(this.$partnerConfiguration, this.$context, continuation);
        chartboostAdapter$setUp$2.L$0 = obj;
        return chartboostAdapter$setUp$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        PartnerLogController.Companion companion = PartnerLogController.INSTANCE;
        Unit unit = null;
        PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.SETUP_STARTED, null, 2, null);
        PartnerConfiguration partnerConfiguration = this.$partnerConfiguration;
        Context context = this.$context;
        this.L$0 = coroutineScope;
        this.L$1 = partnerConfiguration;
        this.L$2 = context;
        this.label = 1;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(this));
        cancellableContinuationImpl.q();
        Json.Companion companion2 = Json.INSTANCE;
        JsonObject credentials = partnerConfiguration.getCredentials();
        Intrinsics.d(credentials, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
        JsonElement jsonElement = (JsonElement) MapsKt.f(credentials, "app_id");
        companion2.getSerializersModule();
        String string = StringsKt.a0((String) companion2.decodeFromJsonElement(StringSerializer.INSTANCE, jsonElement)).toString();
        if (string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            String appSignature = HeliumSdk.getAppSignature();
            Unit unit2 = Unit.f43263a;
            if (appSignature != null) {
                Chartboost.setLoggingLevel(LoggingLevel.ALL);
                Context applicationContext = context.getApplicationContext();
                Intrinsics.e(applicationContext, "getApplicationContext(...)");
                Chartboost.startWithAppId(applicationContext, string, appSignature, new StartCallback() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$setUp$2$1$2$1$1
                    @Override // com.chartboost.sdk.callbacks.StartCallback
                    public final void onStartCompleted(StartError startError) {
                        Unit unit3;
                        Unit unit4 = Unit.f43263a;
                        if (startError != null) {
                            CancellableContinuation<Result<Unit>> cancellableContinuation = cancellableContinuationImpl;
                            PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SETUP_FAILED, String.valueOf(startError.getCode()));
                            ChartboostAdapter$setUp$2.invokeSuspend$lambda$5$resumeOnce(cancellableContinuation, ResultKt.a(new ChartboostMediationAdException(ChartboostAdapter.INSTANCE.getChartboostMediationError$ChartboostAdapter_remoteRelease(startError))));
                            unit3 = unit4;
                        } else {
                            unit3 = null;
                        }
                        if (unit3 == null) {
                            CancellableContinuation<Result<Unit>> cancellableContinuation2 = cancellableContinuationImpl;
                            PartnerLogController.Companion companion3 = PartnerLogController.INSTANCE;
                            PartnerLogController.PartnerAdapterEvents partnerAdapterEvents = PartnerLogController.PartnerAdapterEvents.SETUP_SUCCEEDED;
                            PartnerLogController.Companion.log$default(companion3, partnerAdapterEvents, null, 2, null);
                            PartnerLogController.Companion.log$default(companion3, partnerAdapterEvents, null, 2, null);
                            ChartboostAdapter$setUp$2.invokeSuspend$lambda$5$resumeOnce(cancellableContinuation2, unit4);
                        }
                    }
                });
                unit = unit2;
            }
            if (unit == null) {
                companion.log(PartnerLogController.PartnerAdapterEvents.SETUP_FAILED, "Missing application signature.");
                invokeSuspend$lambda$5$resumeOnce(cancellableContinuationImpl, ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_INITIALIZATION_FAILURE_INVALID_CREDENTIALS)));
            }
            unit = unit2;
        }
        if (unit == null) {
            companion.log(PartnerLogController.PartnerAdapterEvents.SETUP_FAILED, "Missing application ID.");
            invokeSuspend$lambda$5$resumeOnce(cancellableContinuationImpl, ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_INITIALIZATION_FAILURE_INVALID_CREDENTIALS)));
        }
        Object objP = cancellableContinuationImpl.p();
        return objP == coroutineSingletons ? coroutineSingletons : objP;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((ChartboostAdapter$setUp$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
