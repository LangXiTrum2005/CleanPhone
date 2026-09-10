package com.unity3d.services.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b2.o;
import com.mbridge.msdk.config.component.info.provider.subprovider.f;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.b;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.ForceAlternativeFlow;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.ads.operation.show.ShowModule;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import gatewayprotocol.v1.ErrorOuterClass;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class UnityAdsImplementation implements IUnityAds {
    private static Configuration configuration;
    private static IUnityAds instance;
    private static final WebViewBridgeInvoker webViewBridgeInvoker = new WebViewBridgeInvoker();

    /* JADX INFO: renamed from: com.unity3d.services.ads.UnityAdsImplementation$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode;

        static {
            int[] iArr = new int[ErrorOuterClass.PublicErrorCode.values().length];
            $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode = iArr;
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static IUnityAds getInstance() {
        if (instance == null) {
            instance = new UnityAdsImplementation();
        }
        return instance;
    }

    private void handleShowError(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAdsShowError, (Long) 0L));
        if (iUnityAdsShowListener == null) {
            return;
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    private boolean hasInvalidContext(Context context) {
        if (ClientProperties.getApplicationContext() != null) {
            return false;
        }
        if (context == null) {
            return true;
        }
        if (context instanceof Application) {
            ClientProperties.setApplicationContext(context);
            ClientProperties.setApplication((Application) context);
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getApplication() != null && activity.getApplicationContext() != null) {
                ClientProperties.setApplicationContext(context.getApplicationContext());
                ClientProperties.setApplication(activity.getApplication());
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$load$1(IUnityAdsLoadListener iUnityAdsLoadListener, String str) {
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "Unity Ads SDK failed to load due to invalid context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$load$2(InternalLoadListener internalLoadListener) {
        internalLoadListener.onAdLoadFail(new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED.getNumber(), UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED));
    }

    public static void setConfiguration(Configuration configuration2) {
        configuration = configuration2;
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean getDebugMode() {
        return UnityServices.getDebugMode();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    @Nullable
    public String getToken() {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            return null;
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            return new UnityAdsSDK().getToken();
        }
        String token = ((TokenStorage) Utilities.getService(TokenStorage.class)).getToken();
        if (token == null || token.isEmpty()) {
            return null;
        }
        Configuration currentConfiguration = configuration;
        if (currentConfiguration == null) {
            currentConfiguration = new ConfigurationReader().getCurrentConfiguration();
        }
        BiddingBaseManager biddingBaseManagerCreateManager = BiddingManagerFactory.getInstance().createManager(null, currentConfiguration.getExperiments());
        biddingBaseManagerCreateManager.start();
        return biddingBaseManagerCreateManager.getFormattedToken(token);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public String getVersion() {
        return UnityServices.getVersion();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        DeviceLog.entered();
        if (!hasInvalidContext(context)) {
            UnityServices.initialize(context, str, z10, (InitializationConfiguration) null, iUnityAdsInitializationListener);
            return;
        }
        DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
        if (iUnityAdsInitializationListener != null) {
            Utilities.wrapCustomerListener(new a(iUnityAdsInitializationListener, 0));
        }
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean isInitialized() {
        return UnityServices.isInitialized();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public boolean isSupported() {
        return UnityServices.isSupported();
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void load(@Nullable final String str, @NonNull UnityAdsLoadOptions unityAdsLoadOptions, @Nullable final IUnityAdsLoadListener iUnityAdsLoadListener) {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for loading ads");
            if (iUnityAdsLoadListener != null) {
                Utilities.wrapCustomerListener(new o(27, iUnityAdsLoadListener, str));
                return;
            }
            return;
        }
        ForceAlternativeFlow forceAlternativeFlow = (ForceAlternativeFlow) Utilities.getService(ForceAlternativeFlow.class);
        if (unityAdsLoadOptions.loadConfiguration != null) {
            forceAlternativeFlow.invoke(true);
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().load(str, unityAdsLoadOptions, iUnityAdsLoadListener != null ? new InternalLoadListener() { // from class: com.unity3d.services.ads.UnityAdsImplementation.2
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(@NonNull UnityAdsError unityAdsError) {
                    ErrorOuterClass.PublicErrorCode publicErrorCodeForNumber = ErrorOuterClass.PublicErrorCode.forNumber(unityAdsError.getCode());
                    UnityAds.UnityAdsLoadError unityAdsLoadError = UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
                    if (publicErrorCodeForNumber != null) {
                        int i10 = AnonymousClass3.$SwitchMap$gatewayprotocol$v1$ErrorOuterClass$PublicErrorCode[publicErrorCodeForNumber.ordinal()];
                        if (i10 == 1) {
                            unityAdsLoadError = UnityAds.UnityAdsLoadError.NO_FILL;
                        } else if (i10 == 2) {
                            unityAdsLoadError = UnityAds.UnityAdsLoadError.TIMEOUT;
                        } else if (i10 == 3) {
                            unityAdsLoadError = UnityAds.UnityAdsLoadError.INITIALIZE_FAILED;
                        }
                    }
                    iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, unityAdsLoadError, unityAdsError.getMessage());
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(@NonNull AdObject adObject) {
                    iUnityAdsLoadListener.onUnityAdsAdLoaded(str);
                }
            } : null, null);
            return;
        }
        Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new Configuration();
        }
        LoadModule.getInstance().executeAdOperation(webViewBridgeInvoker, new LoadOperationState(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration2));
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void setDebugMode(boolean z10) {
        UnityServices.setDebugMode(z10);
    }

    public void show(Activity activity, String str) {
        show(activity, str, new UnityAdsShowOptions(), null);
    }

    public void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void show(@Nullable Activity activity, @Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @Nullable final IUnityAdsShowListener iUnityAdsShowListener) {
        if (activity != null && !hasInvalidContext(activity)) {
            ClientProperties.setActivity(activity);
            if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
                new UnityAdsSDK().show(str, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.services.ads.UnityAdsImplementation.1
                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onClick(String str2) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowClick(str2);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onComplete(String str2, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowComplete(str2, unityAdsShowCompletionState);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onError(String str2, UnityAds.UnityAdsShowError unityAdsShowError, String str3) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowFailure(str2, unityAdsShowError, str3);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onStart(String str2) {
                        IUnityAdsShowListener iUnityAdsShowListener2 = iUnityAdsShowListener;
                        if (iUnityAdsShowListener2 != null) {
                            iUnityAdsShowListener2.onUnityAdsShowStart(str2);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onLeftApplication(String str2) {
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onRewarded(String str2) {
                    }
                });
                return;
            }
            if (!isSupported()) {
                handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
                return;
            }
            if (!isInitialized()) {
                handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, LoadResult.MSG_NOT_INITIALIZED);
                return;
            }
            if (str == null) {
                handleShowError(iUnityAdsShowListener, "", UnityAds.UnityAdsShowError.INVALID_ARGUMENT, LoadResult.MSG_PLACEMENT_NULL);
                return;
            }
            Configuration configuration2 = configuration;
            if (configuration2 == null) {
                configuration2 = new Configuration();
            }
            ShowModule.getInstance().executeAdOperation(WebViewApp.getCurrentApp(), new ShowOperationState(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration2));
            return;
        }
        handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
    }

    private boolean hasInvalidContext() {
        return hasInvalidContext(null);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(@Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            if (iUnityAdsTokenListener != null) {
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                return;
            }
            return;
        }
        if (tokenConfiguration != null) {
            ((ForceAlternativeFlow) Utilities.getService(ForceAlternativeFlow.class)).invoke(tokenConfiguration.get_isNewApi());
        }
        if (((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().getToken(tokenConfiguration, iUnityAdsTokenListener);
            return;
        }
        if (iUnityAdsTokenListener == null) {
            DeviceLog.info("Please provide non-null listener to UnityAds.GetToken method");
            return;
        }
        if (ClientProperties.getApplicationContext() == null) {
            Utilities.wrapCustomerListener(new b(iUnityAdsTokenListener, 2));
            return;
        }
        AsyncTokenStorage asyncTokenStorage = (AsyncTokenStorage) Utilities.getService(AsyncTokenStorage.class);
        Configuration currentConfiguration = configuration;
        if (currentConfiguration == null) {
            currentConfiguration = new ConfigurationReader().getCurrentConfiguration();
        }
        BiddingBaseManager biddingBaseManagerCreateManager = BiddingManagerFactory.getInstance().createManager(iUnityAdsTokenListener, tokenConfiguration, currentConfiguration.getExperiments());
        biddingBaseManagerCreateManager.start();
        asyncTokenStorage.getToken(biddingBaseManagerCreateManager);
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void load(@Nullable String str, @NonNull UnityAdsLoadOptions unityAdsLoadOptions, @NonNull InternalLoadListener internalLoadListener) {
        if (hasInvalidContext()) {
            DeviceLog.error("No valid Context for loading ads");
            Utilities.wrapCustomerListener(new f(internalLoadListener, 4));
        } else {
            new UnityAdsSDK().load(str, unityAdsLoadOptions, internalLoadListener, null);
        }
    }

    @Override // com.unity3d.services.ads.IUnityAds
    public void getToken(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        getToken(null, iUnityAdsTokenListener);
    }
}
