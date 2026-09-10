package com.vungle.ads.internal;

import A.F;
import android.content.Context;
import android.support.v4.media.a;
import androidx.core.content.ContextCompat;
import com.p004ironsource.d9;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.x.g;
import com.startapp.sdk.internal.C;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.Utils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\r\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0007J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\b\u001a\u00020\u001cJ\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0016\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/VungleInitializer;", "", "()V", "initDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "initializationCallbackArray", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/InitializationListener;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release$annotations", "isInitialized$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setInitialized$vungle_ads_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "isInitializing", "isInitializing$vungle_ads_release$annotations", "isInitializing$vungle_ads_release", "setInitializing$vungle_ads_release", "configure", "", "context", "Landroid/content/Context;", b.f35043u, "", "deInit", "deInit$vungle_ads_release", "hasInvalidChar", "", "value", "hasRequiredNetworkPermissions", d9.a.f, "initializationCallback", "isAppIdInvalid", "onInitError", g.f39715A, "Lcom/vungle/ads/VungleError;", "onInitSuccess", "setIntegrationName", "wrapperFramework", "Lcom/vungle/ads/VungleWrapperFramework;", "wrapperFrameworkVersion", "Companion", "vungle-ads_release", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleInitializer {
    private static final String TAG = "VungleInitializer";
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private final CopyOnWriteArrayList<InitializationListener> initializationCallbackArray = new CopyOnWriteArrayList<>();
    private final TimeIntervalMetric initDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    private final void configure(final Context context, String appId) {
        final Context context2;
        boolean z2;
        try {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.X;
            Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<FilePreferences>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final FilePreferences invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
                }
            });
            ConfigManager configManager = ConfigManager.INSTANCE;
            ConfigPayload cachedConfig = configManager.getCachedConfig(m3195configure$lambda4(lazyA), appId);
            if (cachedConfig != null) {
                context2 = context;
                ConfigManager.initWithConfig$vungle_ads_release$default(configManager, context2, cachedConfig, true, null, 8, null);
                z2 = true;
            } else {
                context2 = context;
                z2 = false;
            }
            this.isInitialized.set(true);
            onInitSuccess();
            Logger.INSTANCE.d(TAG, "Running cleanup jobs. " + Thread.currentThread().getId());
            m3196configure$lambda5(LazyKt.a(lazyThreadSafetyMode, new Function0<JobRunner>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final JobRunner invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context2).getService(JobRunner.class);
                }
            })).execute(CleanupJob.Companion.makeJobInfo$default(CleanupJob.INSTANCE, null, 1, null));
            if (z2) {
                return;
            }
            configManager.fetchConfigAsync$vungle_ads_release(context2, new Function1<Boolean, Unit>() { // from class: com.vungle.ads.internal.VungleInitializer.configure.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.f43263a;
                }

                public final void invoke(boolean z3) {
                    Logger.INSTANCE.d(VungleInitializer.TAG, "Config fetch result: " + z3);
                }
            });
        } catch (Throwable th) {
            Logger.INSTANCE.e(TAG, "Cannot get config", th);
        }
    }

    /* JADX INFO: renamed from: configure$lambda-4, reason: not valid java name */
    private static final FilePreferences m3195configure$lambda4(Lazy<FilePreferences> lazy) {
        return (FilePreferences) lazy.getX();
    }

    /* JADX INFO: renamed from: configure$lambda-5, reason: not valid java name */
    private static final JobRunner m3196configure$lambda5(Lazy<? extends JobRunner> lazy) {
        return (JobRunner) lazy.getX();
    }

    private final boolean hasInvalidChar(String value) {
        for (int i2 = 0; i2 < value.length(); i2++) {
            char cCharAt = value.charAt(i2);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.') {
                return true;
            }
        }
        return false;
    }

    private final boolean hasRequiredNetworkPermissions(Context context) {
        return (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) && (ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0);
    }

    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    private static final Executors m3197init$lambda0(Lazy<? extends Executors> lazy) {
        return (Executors) lazy.getX();
    }

    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    private static final VungleApiClient m3198init$lambda1(Lazy<VungleApiClient> lazy) {
        return (VungleApiClient) lazy.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3199init$lambda2(final VungleInitializer this$0, Context context, String appId, Lazy vungleApiClient$delegate) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(context, "$context");
        Intrinsics.f(appId, "$appId");
        Intrinsics.f(vungleApiClient$delegate, "$vungleApiClient$delegate");
        if (!this$0.hasRequiredNetworkPermissions(context)) {
            Logger.INSTANCE.e(TAG, "Network permissions not granted");
            ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.VungleInitializer$init$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
                    m3201invoke();
                    return Unit.f43263a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3201invoke() throws Throwable {
                    this.this$0.onInitError(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
                }
            });
        } else {
            PrivacyManager.INSTANCE.init(context);
            m3198init$lambda1(vungleApiClient$delegate).initialize(appId);
            this$0.configure(context, appId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3200init$lambda3(VungleInitializer this$0) throws Throwable {
        Intrinsics.f(this$0, "this$0");
        this$0.onInitError(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String appId) {
        return StringsKt.w(appId) || hasInvalidChar(appId);
    }

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitError(final VungleError exception) throws Throwable {
        this.isInitializing.set(false);
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + exception.getCode();
        }
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.initDurationMetric, (LogEntry) null, localizedMessage);
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.VungleInitializer.onInitError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3202invoke();
                return Unit.f43263a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3202invoke() {
                Logger.INSTANCE.e(VungleInitializer.TAG, "onError");
                CopyOnWriteArrayList copyOnWriteArrayList = VungleInitializer.this.initializationCallbackArray;
                VungleError vungleError = exception;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InitializationListener) it.next()).onError(vungleError);
                }
                VungleInitializer.this.initializationCallbackArray.clear();
            }
        });
        Logger.INSTANCE.e(TAG, localizedMessage);
    }

    private final void onInitSuccess() throws Throwable {
        this.isInitializing.set(false);
        this.initDurationMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.initDurationMetric, (LogEntry) null, (String) null, 6, (Object) null);
        Logger.INSTANCE.d(TAG, "onSuccess " + Thread.currentThread().getId());
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.VungleInitializer.onInitSuccess.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3203invoke();
                return Unit.f43263a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3203invoke() {
                Iterator it = VungleInitializer.this.initializationCallbackArray.iterator();
                while (it.hasNext()) {
                    ((InitializationListener) it.next()).onSuccess();
                }
                VungleInitializer.this.initializationCallbackArray.clear();
            }
        });
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.INSTANCE.deInit();
        VungleApiClient.INSTANCE.reset$vungle_ads_release();
        this.isInitialized.set(false);
        this.isInitializing.set(false);
        this.initializationCallbackArray.clear();
    }

    public final void init(String appId, final Context context, InitializationListener initializationCallback) throws Throwable {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(context, "context");
        Intrinsics.f(initializationCallback, "initializationCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (LogEntry) null, (String) null, 6, (Object) null);
        this.initDurationMetric.markStart();
        this.initializationCallbackArray.add(initializationCallback);
        if (isAppIdInvalid(appId)) {
            StringBuilder sbY = a.y("App id invalid: ", appId, ", package name: ");
            sbY.append(context.getPackageName());
            onInitError(new InvalidAppId(sbY.toString()).logError$vungle_ads_release());
            return;
        }
        if (Utils.INSTANCE.isOSVersionInvalid()) {
            Logger.INSTANCE.e(TAG, "Init: SDK is supported only for API versions 25 and above.");
            onInitError(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.setAppId$vungle_ads_release(appId);
        if (this.isInitialized.get()) {
            Logger.INSTANCE.d(TAG, "init already complete");
            onInitSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                Logger.INSTANCE.d(TAG, "init already in progress");
                return;
            }
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.X;
            m3197init$lambda0(LazyKt.a(lazyThreadSafetyMode, new Function0<Executors>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            })).getBACKGROUND_EXECUTOR().execute(new F(this, context, appId, LazyKt.a(lazyThreadSafetyMode, new Function0<VungleApiClient>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final VungleApiClient invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                }
            }), 22), new C(this, 13));
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    /* JADX INFO: renamed from: isInitialized$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsInitialized() {
        return this.isInitialized;
    }

    /* JADX INFO: renamed from: isInitializing$vungle_ads_release, reason: from getter */
    public final AtomicBoolean getIsInitializing() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(AtomicBoolean atomicBoolean) {
        Intrinsics.f(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        Intrinsics.f(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    public final void setIntegrationName(VungleWrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
        Intrinsics.f(wrapperFramework, "wrapperFramework");
        Intrinsics.f(wrapperFrameworkVersion, "wrapperFrameworkVersion");
        if (wrapperFramework == VungleWrapperFramework.none) {
            Logger.INSTANCE.e(TAG, "Wrapper is null or is none");
            return;
        }
        VungleHeader vungleHeader = VungleHeader.INSTANCE;
        String headerUa = vungleHeader.getHeaderUa();
        String str = wrapperFramework.name() + (wrapperFrameworkVersion.length() > 0 ? "/".concat(wrapperFrameworkVersion) : "");
        if (StringsKt.l(headerUa, str, false)) {
            Logger.INSTANCE.w(TAG, "Wrapper info already set");
            return;
        }
        vungleHeader.setHeaderUa(headerUa + ';' + str);
        if (isInitialized()) {
            Logger.INSTANCE.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
