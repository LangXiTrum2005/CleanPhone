package com.chartboost.heliumsdk;

import android.app.Activity;
import android.content.Context;
import com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueueManager;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.controllers.AppConfigController;
import com.chartboost.heliumsdk.controllers.BidController;
import com.chartboost.heliumsdk.controllers.PartnerController;
import com.chartboost.heliumsdk.controllers.PrivacyController;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationAppConfigurationHandler;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.LoadRateLimiter;
import com.chartboost.heliumsdk.utils.BackgroundTimeMonitor;
import com.chartboost.heliumsdk.utils.Environment;
import com.chartboost.heliumsdk.utils.LogController;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.ChartboostMediationInternal$initialize$2", f = "ChartboostMediationInternal.kt", l = {Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 143}, m = "invokeSuspend")
public final class ChartboostMediationInternal$initialize$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $appId;
    final /* synthetic */ String $appSignature;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeliumInitializationOptions $options;
    Object L$0;
    int label;
    final /* synthetic */ ChartboostMediationInternal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationInternal$initialize$2(Context context, ChartboostMediationInternal chartboostMediationInternal, String str, String str2, HeliumInitializationOptions heliumInitializationOptions, Continuation<? super ChartboostMediationInternal$initialize$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.this$0 = chartboostMediationInternal;
        this.$appId = str;
        this.$appSignature = str2;
        this.$options = heliumInitializationOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartboostMediationInternal$initialize$2(this.$context, this.this$0, this.$appId, this.$appSignature, this.$options, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0170  */
    /* JADX WARN: Code duplicated, block: B:48:0x018b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PrivacyController privacyController;
        PrivacyController privacyController2;
        ChartboostMediationError chartboostMediationError;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        Unit unit = Unit.f43263a;
        if (i2 != 0) {
            if (i2 == 1) {
                privacyController = (PrivacyController) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                privacyController2 = (PrivacyController) this.L$0;
                ResultKt.b(obj);
            }
            chartboostMediationError = (ChartboostMediationError) obj;
            if (chartboostMediationError != null) {
                this.this$0.setInitializationStatus$Helium_release(HeliumSdk.ChartboostMediationInitializationStatus.IDLE);
                ChartboostMediationFullscreenAdQueueManager.INSTANCE.autoStartQueues$Helium_release(false);
                return new Result(ResultKt.a(new ChartboostMediationAdException(chartboostMediationError)));
            }
            Environment.INSTANCE.startSession(this.$context);
            privacyController2.updatePartnerConsentsFromDisk$Helium_release();
            this.this$0.runGdprConsentTask(this.$context, privacyController2);
            this.this$0.runCcpaConsentTask(this.$context, privacyController2);
            this.this$0.runSubjectToCoppaTask(this.$context, privacyController2);
            this.this$0.setInitializationStatus$Helium_release(HeliumSdk.ChartboostMediationInitializationStatus.INITIALIZED);
            ChartboostMediationFullscreenAdQueueManager.INSTANCE.autoStartQueues$Helium_release(true);
            return new Result(unit);
        }
        ResultKt.b(obj);
        LogController.LogLevel logLevelValueOf = null;
        try {
            String string = this.$context.getSharedPreferences(ChartboostMediationInternal.CHARTBOOST_MEDIATION_INTERNAL_SHARED_PREFS, 0).getString(ChartboostMediationInternal.SERVER_LOG_LEVEL_OVERRIDE, null);
            if (string == null) {
                string = "";
            }
            logLevelValueOf = LogController.LogLevel.valueOf(string);
        } catch (IllegalArgumentException unused) {
        }
        if (logLevelValueOf != null) {
            LogController.INSTANCE.setServerLogLevelOverride$Helium_release(logLevelValueOf);
        }
        if (this.this$0.getInitializationStatus() == HeliumSdk.ChartboostMediationInitializationStatus.INITIALIZED) {
            ChartboostMediationInternal chartboostMediationInternal = this.this$0;
            chartboostMediationInternal.setWeakActivityContext$Helium_release(this.$context instanceof Activity ? new WeakReference<>(this.$context) : chartboostMediationInternal.getWeakActivityContext$Helium_release());
            LogController.INSTANCE.d("Chartboost Mediation already initialized. Potentially updating the activity");
            return new Result(unit);
        }
        HeliumSdk.ChartboostMediationInitializationStatus initializationStatus = this.this$0.getInitializationStatus();
        HeliumSdk.ChartboostMediationInitializationStatus chartboostMediationInitializationStatus = HeliumSdk.ChartboostMediationInitializationStatus.INITIALIZING;
        if (initializationStatus == chartboostMediationInitializationStatus) {
            return new Result(ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_INITIALIZATION_FAILURE_INITIALIZATION_IN_PROGRESS)));
        }
        this.this$0.setInitializationStatus$Helium_release(chartboostMediationInitializationStatus);
        LogController.INSTANCE.d("Chartboost Mediation initialize called with SDK Key: " + this.$appId);
        this.this$0.setAppId$Helium_release(this.$appId);
        this.this$0.setAppSignature$Helium_release(this.$appSignature);
        ChartboostMediationInternal chartboostMediationInternal2 = this.this$0;
        chartboostMediationInternal2.setWeakActivityContext$Helium_release(this.$context instanceof Activity ? new WeakReference<>(this.$context) : chartboostMediationInternal2.getWeakActivityContext$Helium_release());
        this.this$0.setAppContext$Helium_release(this.$context.getApplicationContext());
        PrivacyController privacyController3 = this.this$0.getPrivacyController();
        if (privacyController3 == null) {
            privacyController3 = new PrivacyController(this.$context, this.this$0.getPartnerConsents());
        }
        final PrivacyController privacyController4 = privacyController3;
        this.this$0.setPrivacyController$Helium_release(privacyController4);
        this.this$0.setAdController$Helium_release(new AdController(new BidController(this.this$0.getPartnerController()), this.this$0.getPartnerController(), privacyController4, new LoadRateLimiter(), new BackgroundTimeMonitor(), this.this$0.getIlrd()));
        PartnerConsents partnerConsents = this.this$0.getPartnerConsents();
        final ChartboostMediationInternal chartboostMediationInternal3 = this.this$0;
        final Context context = this.$context;
        partnerConsents.addPartnerConsentsObserver$Helium_release(new PartnerConsents.PartnerConsentsObserver() { // from class: com.chartboost.heliumsdk.ChartboostMediationInternal$initialize$2.2
            @Override // com.chartboost.heliumsdk.PartnerConsents.PartnerConsentsObserver
            public void onPartnerConsentsUpdated() {
                ChartboostMediationInternal chartboostMediationInternal4 = chartboostMediationInternal3;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.e(applicationContext, "context.applicationContext");
                chartboostMediationInternal4.runGdprConsentTask(applicationContext, privacyController4);
                ChartboostMediationInternal chartboostMediationInternal5 = chartboostMediationInternal3;
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.e(applicationContext2, "context.applicationContext");
                chartboostMediationInternal5.runCcpaConsentTask(applicationContext2, privacyController4);
            }
        });
        Context applicationContext = this.$context.getApplicationContext();
        Intrinsics.e(applicationContext, "context.applicationContext");
        AppConfigController appConfigController = new AppConfigController(applicationContext);
        this.L$0 = privacyController4;
        this.label = 1;
        if (appConfigController.get(this) != coroutineSingletons) {
            privacyController = privacyController4;
        }
        return coroutineSingletons;
        ChartboostMediationAppConfigurationHandler chartboostMediationAppConfigurationHandler = new ChartboostMediationAppConfigurationHandler(this.$context, this.$options);
        PartnerController partnerController = this.this$0.getPartnerController();
        this.L$0 = privacyController;
        this.label = 2;
        obj = chartboostMediationAppConfigurationHandler.handleConfigurationChange(partnerController, this);
        if (obj != coroutineSingletons) {
            privacyController2 = privacyController;
            chartboostMediationError = (ChartboostMediationError) obj;
            if (chartboostMediationError != null) {
                this.this$0.setInitializationStatus$Helium_release(HeliumSdk.ChartboostMediationInitializationStatus.IDLE);
                ChartboostMediationFullscreenAdQueueManager.INSTANCE.autoStartQueues$Helium_release(false);
                return new Result(ResultKt.a(new ChartboostMediationAdException(chartboostMediationError)));
            }
            Environment.INSTANCE.startSession(this.$context);
            privacyController2.updatePartnerConsentsFromDisk$Helium_release();
            this.this$0.runGdprConsentTask(this.$context, privacyController2);
            this.this$0.runCcpaConsentTask(this.$context, privacyController2);
            this.this$0.runSubjectToCoppaTask(this.$context, privacyController2);
            this.this$0.setInitializationStatus$Helium_release(HeliumSdk.ChartboostMediationInitializationStatus.INITIALIZED);
            ChartboostMediationFullscreenAdQueueManager.INSTANCE.autoStartQueues$Helium_release(true);
            return new Result(unit);
        }
        return coroutineSingletons;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((ChartboostMediationInternal$initialize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
