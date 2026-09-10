package com.chartboost.heliumsdk;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.utils.Environment;
import com.chartboost.heliumsdk.utils.LogController;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.HeliumSdk$Companion$start$2", f = "HeliumSdk.kt", l = {88}, m = "invokeSuspend")
public final class HeliumSdk$Companion$start$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $appId;
    final /* synthetic */ String $appSignature;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeliumSdk.HeliumSdkListener $heliumSdkListener;
    final /* synthetic */ HeliumInitializationOptions $options;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeliumSdk$Companion$start$2(Context context, String str, String str2, HeliumInitializationOptions heliumInitializationOptions, HeliumSdk.HeliumSdkListener heliumSdkListener, Continuation<? super HeliumSdk$Companion$start$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$appId = str;
        this.$appSignature = str2;
        this.$options = heliumInitializationOptions;
        this.$heliumSdkListener = heliumSdkListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeliumSdk$Companion$start$2(this.$context, this.$appId, this.$appSignature, this.$options, this.$heliumSdkListener, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HeliumSdk$Companion$start$2 heliumSdk$Companion$start$2;
        Object objM160initializeyxL6bBk$Helium_release;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChartboostMediationInternal chartboostMediationInternal$Helium_release = HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release();
            Context context = this.$context;
            String str = this.$appId;
            String str2 = this.$appSignature;
            HeliumInitializationOptions heliumInitializationOptions = this.$options;
            this.label = 1;
            heliumSdk$Companion$start$2 = this;
            objM160initializeyxL6bBk$Helium_release = chartboostMediationInternal$Helium_release.m160initializeyxL6bBk$Helium_release(context, str, str2, heliumInitializationOptions, heliumSdk$Companion$start$2);
            if (objM160initializeyxL6bBk$Helium_release == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objM160initializeyxL6bBk$Helium_release = ((Result) obj).X;
            heliumSdk$Companion$start$2 = this;
        }
        HeliumSdk.HeliumSdkListener heliumSdkListener = heliumSdk$Companion$start$2.$heliumSdkListener;
        Throwable thA = Result.a(objM160initializeyxL6bBk$Helium_release);
        if (thA == null) {
            LogController.INSTANCE.d("Chartboost Mediation " + HeliumSdk.INSTANCE.getVersion() + " initialized successfully");
            ProcessLifecycleOwner.j0.g0.a(HeliumSdk.lifecycleStatusObserver);
            if (heliumSdkListener != null) {
                heliumSdkListener.didInitialize(null);
            }
        } else {
            LogController.INSTANCE.e("Chartboost Mediation failed to initialize. " + thA);
            if ((thA instanceof ChartboostMediationAdException) && ((ChartboostMediationAdException) thA).getChartboostMediationError() == ChartboostMediationError.CM_INITIALIZATION_FAILURE_INITIALIZATION_IN_PROGRESS) {
                if (heliumSdkListener != null) {
                    heliumSdkListener.didInitialize(new Error("Start attempt already ongoing"));
                }
            } else if (heliumSdkListener != null) {
                heliumSdkListener.didInitialize(new Error("Failed to initialize Chartboost Mediation: " + thA + AbstractJsonLexerKt.END_OBJ));
            }
        }
        Environment.INSTANCE.fetchUserAgent();
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HeliumSdk$Companion$start$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
