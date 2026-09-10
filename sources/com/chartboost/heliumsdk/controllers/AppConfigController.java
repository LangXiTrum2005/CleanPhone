package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.heliumsdk.domain.AppConfig;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.utils.LogController;
import com.smartdigimkt.x.g;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0002J\u0011\u0010\u0011\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/AppConfigController;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "initHash", "setInitHash", "(Ljava/lang/String;)V", "failServerConfig", "", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", g.f39715A, "Ljava/lang/Exception;", "Lkotlin/Exception;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalConfig", "Lcom/chartboost/heliumsdk/domain/AppConfig;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getServerConfig", "", "(Landroid/content/SharedPreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processConfig", "appConfig", "processServerConfig", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppConfigController {
    private static final String HELIUM_CONFIG_IDENTIFIER = "HELIUM_CONFIG_IDENTIFIER";
    private static final String INIT_HASH_KEY = "INIT_HASH";
    private final Context appContext;
    private String initHash;

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.AppConfigController$get$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AppConfigController", f = "AppConfigController.kt", l = {76}, m = "get")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppConfigController.this.get(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.AppConfigController$getServerConfig$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AppConfigController$getServerConfig$2", f = "AppConfigController.kt", l = {114, 118}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ SharedPreferences $sharedPreferences;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SharedPreferences sharedPreferences, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$sharedPreferences = sharedPreferences;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppConfigController.this.new AnonymousClass2(this.$sharedPreferences, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            if (r9 == r2) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.heliumsdk.controllers.AppConfigController.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    public AppConfigController(Context appContext) {
        Intrinsics.f(appContext, "appContext");
        this.appContext = appContext;
        String string = appContext.getSharedPreferences(HELIUM_CONFIG_IDENTIFIER, 0).getString(INIT_HASH_KEY, "");
        this.initHash = string != null ? string : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failServerConfig(ChartboostMediationError error, Exception exception) {
        String message;
        if (error != ChartboostMediationError.CM_INITIALIZATION_FAILURE_INTERNAL_ERROR) {
            LogController.INSTANCE.d("Failed to retrieve config from server with error: " + error + ". This is normal when no updates to the config are necessary.");
            return;
        }
        LogController logController = LogController.INSTANCE;
        StringBuilder sb = new StringBuilder("Failed to parse retrieved config with error: ");
        sb.append(error);
        sb.append(" due to ");
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "<no message provided>";
        }
        sb.append(message);
        logController.d(sb.toString());
    }

    public static /* synthetic */ void failServerConfig$default(AppConfigController appConfigController, ChartboostMediationError chartboostMediationError, Exception exc, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            exc = null;
        }
        appConfigController.failServerConfig(chartboostMediationError, exc);
    }

    private final AppConfig getLocalConfig(SharedPreferences sharedPreferences) {
        AppConfig appConfigFromJsonString;
        try {
            String string = sharedPreferences.getString(HELIUM_CONFIG_IDENTIFIER, null);
            if (string != null && (appConfigFromJsonString = AppConfig.INSTANCE.fromJsonString(string)) != null) {
                return appConfigFromJsonString;
            }
            AppConfigStorage.INSTANCE.setValidCachedConfigExists(false);
            return new AppConfig((String) null, (Set) null, 0, 0, 0L, (EnumSet) null, 0, 0, 0, 0, 0, 0L, false, 0, 0, 0L, 0, (JsonObject) null, (List) null, (String) null, 0, 0L, 0, 8388607, (DefaultConstructorMarker) null);
        } catch (SerializationException e2) {
            LogController.INSTANCE.e("Exception raised parsing local config: " + e2.getMessage());
            setInitHash("");
            AppConfigStorage.INSTANCE.setValidCachedConfigExists(false);
            return new AppConfig((String) null, (Set) null, 0, 0, 0L, (EnumSet) null, 0, 0, 0, 0, 0, 0L, false, 0, 0, 0L, 0, (JsonObject) null, (List) null, (String) null, 0, 0L, 0, 8388607, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getServerConfig(SharedPreferences sharedPreferences, Continuation<? super Boolean> continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return BuildersKt.f(DefaultIoScheduler.f45062Y, new AnonymousClass2(sharedPreferences, null), continuation);
    }

    private final void processConfig(AppConfig appConfig) {
        AppConfigStorage appConfigStorage = AppConfigStorage.INSTANCE;
        appConfigStorage.updateFields(appConfig);
        if (appConfigStorage.getParsingError() != null) {
            setInitHash("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processServerConfig(SharedPreferences sharedPreferences, AppConfig appConfig) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(HELIUM_CONFIG_IDENTIFIER, appConfig.toJsonString());
        editorEdit.apply();
        processConfig(appConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInitHash(String str) {
        this.initHash = str;
        this.appContext.getSharedPreferences(HELIUM_CONFIG_IDENTIFIER, 0).edit().putString(INIT_HASH_KEY, str).apply();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object get(Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        AppConfigController appConfigController;
        AppConfig appConfig;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object serverConfig = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.b(serverConfig);
            SharedPreferences sharedPreferences = this.appContext.getSharedPreferences(HELIUM_CONFIG_IDENTIFIER, 0);
            Intrinsics.e(sharedPreferences, "sharedPreferences");
            AppConfig localConfig = getLocalConfig(sharedPreferences);
            if (!localConfig.hasMinimumAdapters() || !localConfig.hasMinimumCredentials()) {
                setInitHash("");
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = localConfig;
            anonymousClass1.label = 1;
            serverConfig = getServerConfig(sharedPreferences, anonymousClass1);
            if (serverConfig == coroutineSingletons) {
                return coroutineSingletons;
            }
            appConfigController = this;
            appConfig = localConfig;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appConfig = (AppConfig) anonymousClass1.L$1;
            appConfigController = (AppConfigController) anonymousClass1.L$0;
            ResultKt.b(serverConfig);
        }
        if (!((Boolean) serverConfig).booleanValue()) {
            appConfigController.processConfig(appConfig);
        }
        return Unit.f43263a;
    }
}
