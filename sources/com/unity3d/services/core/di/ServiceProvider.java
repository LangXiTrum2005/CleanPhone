package com.unity3d.services.core.di;

import ak.f;
import ak.l;
import android.content.Context;
import cn.a0;
import cn.f1;
import cn.w;
import cn.y;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.ForceAlternativeFlow;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.CachedFIdDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.ForegroundDurationReader;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.AndroidAdRefresh;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheAssets;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidIntentCreation;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheAssets;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonMediationInfoConverter;
import com.unity3d.ads.core.domain.CommonMediationProviderParser;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.MediationInfoConverter;
import com.unity3d.ads.core.domain.MediationProviderParser;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueCommunicatorProxyFactory;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.AndroidRequestUrlFactory;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestUrlFactory;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import jk.a;
import jk.b;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import s0.e;
import s0.i;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u00103\u001a\u000202H\u0016J\b\u00104\u001a\u000202H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "()V", "CDN_CREATIVES_HOST", "", "CDN_CREATIVES_PORT", "", "DATA_STORE_GATEWAY_CACHE", "DATA_STORE_GL_INFO", "DATA_STORE_IAP_TRANSACTION", "DATA_STORE_NATIVE_CONFIG", "DATA_STORE_PRIVACY", "DATA_STORE_PRIVACY_FSM", "DATA_STORE_UNIVERSAL_REQUEST", "DATA_STORE_WEBVIEW_CONFIG", "DEFAULT_DISPATCHER", "DEV_CONSENT_PRIVACY_RULES", "DIAGNOSTICS_EVENT_SENDER", "GATEWAY_HOST", "GATEWAY_PORT", "HTTP_CACHE_DISK_SIZE", "", "HTTP_CLIENT_FETCH_TIMEOUT", "IO_DISPATCHER", "LEGACY_PRIVACY_RULES", "MAIN_DISPATCHER", "NAMED_AD_REQ", "NAMED_GET_TOKEN_SCOPE", "NAMED_ILRD_SCOPE", "NAMED_INIT_REQ", "NAMED_INIT_SCOPE", "NAMED_LIFECYCLE_SCOPE", "NAMED_LOAD_SCOPE", "NAMED_LOCAL", "NAMED_OFFERWALL_SCOPE", "NAMED_OMID_SCOPE", "NAMED_OPERATIVE_REQ", "NAMED_OTHER_REQ", "NAMED_PUBLIC_JOB", "NAMED_REMOTE", "NAMED_SCAR_SCOPE", "NAMED_SDK", "NAMED_SHOW_SCOPE", "NAMED_TRANSACTION_SCOPE", "OPERATIVE_EVENT_SENDER", "PREF_GL_INFO", "SCAR_SIGNALS_FETCH_TIMEOUT", "SCAR_VERSION_FETCH_TIMEOUT", "UNIVERSAL_EVENT_SENDER", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", MobileAdsBridgeBase.initializeMethodName, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String DIAGNOSTICS_EVENT_SENDER = "diagnostics";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_ILRD_SCOPE = "ilrd_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LIFECYCLE_SCOPE = "lifecycle_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String OPERATIVE_EVENT_SENDER = "operative";
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    public static final String UNIVERSAL_EVENT_SENDER = "universal";
    private static final IServicesRegistry serviceRegistry;

    /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lwj/r;", "invoke", "(Lcom/unity3d/services/core/di/ServicesRegistry;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements b {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class C02241 extends o implements a {
            public static final C02241 INSTANCE = new C02241();

            public C02241() {
                super(0);
            }

            @Override // jk.a
            public final Context invoke() {
                return ClientProperties.getApplicationContext();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass10 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$100, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/Show;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass100 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass100(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final Show invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidShow((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (ValidateExtrasSize) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ValidateExtrasSize.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGatewayAdResponse.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$101, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CacheFile;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass101 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass101(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CacheFile invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonCacheFile((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$102, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CleanAssets;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass102 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass102(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CleanAssets invoke() {
                return new CommonCleanAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(CacheRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$103, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdObject;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass103 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass103(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetAdObject invoke() {
                return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(AdRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$104, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass104 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass104(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ScarEligibleEffectiveUseCase invoke() {
                return new CommonScarEligibleEffectiveUseCase((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$105, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass105 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass105(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetHeaderBiddingToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(FetchSignalsAndSendUseCase.class))), (ScarEligibleEffectiveUseCase) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ScarEligibleEffectiveUseCase.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$106, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass106 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass106(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final BuildHeaderBiddingToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidBuildHeaderBiddingToken((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidTestDataInfo.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OfferwallManager.class))), (MediationInfoConverter) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationInfoConverter.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$107, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass107 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass107(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final TokenNumberProvider invoke() {
                return new CommonTokenNumberProvider((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$108, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass108 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass108(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetInitializationData invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetInitializationData((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestSharedData.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$109, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass109 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass109(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MediationInitBlobMetadataReader invoke() {
                return new MediationInitBlobMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", d0.f44761a.b(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass11 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.ilrdCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$110, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass110 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass110(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetInitializationRequestPayload invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetInitializationRequestPayload((GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationInitBlobMetadataReader.class))), (InstallReferrerDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InstallReferrerDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$111, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass111 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass111(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetInitializationState invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonGetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SDKPropertiesManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$112, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass112 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass112(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetIsFileCache invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonGetIsFileCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (GetAssetFileName) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAssetFileName.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$113, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass113 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass113(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final SetInitializationState invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonSetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SDKPropertiesManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$114, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass114 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass114(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetRequestPolicy invoke() {
                return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$115, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass115 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass115(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetAdDataRefreshRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CampaignRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$116, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass116 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass116(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetAdPlayerConfigRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (MediationInfoConverter) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationInfoConverter.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$117, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass117 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass117(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidGetAdPlayerContext invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetAdPlayerContext((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$118, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass118 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass118(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetAdRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TcfRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$119, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass119 extends o implements a {
            public static final AnonymousClass119 INSTANCE = new AnonymousClass119();

            public AnonymousClass119() {
                super(0);
            }

            @Override // jk.a
            public final GetHbTokenEventRequest invoke() {
                return new GetAndroidTokenEventRequest();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass12 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.lifecycleCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$120, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass120 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass120(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CommonScarEventReceiver invoke() {
                return new CommonScarEventReceiver((a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, d0.f44761a.b(a0.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$121, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass121 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass121(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GMAScarAdapterBridge invoke() {
                GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(CommonScarEventReceiver.class))))).getBridge();
                n.e(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                return bridge;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$122, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass122 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass122(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ScarTimeHackFixer invoke() {
                return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$123, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass123 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass123(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ScarManager invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidScarManager((CommonScarEventReceiver) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ScarTimeHackFixer.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$124, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass124 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass124(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final FetchSignalsAndSendUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidFetchSignalsAndSendUseCase((a0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, e0Var.b(a0.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (ScarEligibleEffectiveUseCase) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ScarEligibleEffectiveUseCase.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$125, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/LoadScarAd;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass125 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass125(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final LoadScarAd invoke() {
                return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ScarManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$126, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass126 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass126(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HandleGetTokenRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, e0Var.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$127, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass127 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass127(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetClientInfo invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetClientInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OfferwallManager.class))), (FIdExistenceDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(FIdExistenceDataSource.class))), (AdQualityVersionDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdQualityVersionDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$128, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass128 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass128(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetInitializationCompletedRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$129, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass129 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass129(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetInitializationRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetInitializationRequest((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass13 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$130, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass130 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass130(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetLimitedSessionToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetLimitedSessionToken((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$131, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass131 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass131(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetOpenGLRendererInfo invoke() {
                return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$132, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass132 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass132(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetSharedDataTimestamps invoke() {
                return new AndroidGetSharedDataTimestamps((ForegroundDurationReader) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ForegroundDurationReader.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$133, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass133 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass133(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetUniversalRequestForPayLoad invoke() {
                return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(GetUniversalRequestSharedData.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$134, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass134 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass134(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetUniversalRequestSharedData invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeveloperConsentRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$135, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass135 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass135(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetCachedAsset invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new GetCachedAsset((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CacheWebViewAssets.class))), (GetAssetFileName) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAssetFileName.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$136, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass136 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass136(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetWebViewBridgeUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonGetWebViewBridgeUseCase((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$137, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass137 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass137(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetRequestPolicy invoke() {
                return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$138, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass138 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass138(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetLatestWebViewConfiguration invoke() {
                return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(WebviewConfigurationDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$139, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass139 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass139(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetRequestPolicy invoke() {
                return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass14 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.scarSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$140, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass140 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass140(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetRequestPolicy invoke() {
                return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$141, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass141 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass141(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetPrivacyUpdateRequest invoke() {
                return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$142, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass142 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass142(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HandleGatewayInitializationResponse invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(TransactionEventManager.class))), (AdRevenueObserver) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRevenueObserver.class))), (MaxAdRevenueObserver) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MaxAdRevenueObserver.class))), (LifecycleEventObserver) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(LifecycleEventObserver.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, e0Var.b(a0.class))), (HandleDebugSettings) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleDebugSettings.class))), (GetSafeguardedInitializationPolicy) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetSafeguardedInitializationPolicy.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(NativeConfigurationOuterClass.NativeConfiguration.class))), (InitializeAdQuality) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeAdQuality.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$143, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass143 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass143(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HandleGatewayUniversalResponse invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidHandleGatewayUniversalResponse((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidAppSetIdDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$144, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass144 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass144(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeBoldSDK invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidInitializeBoldSDK((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, e0Var.b(GetRequestPolicy.class))), (CleanAssets) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CleanAssets.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetGameId.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))), (AndroidHandleFocusCounters) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidHandleFocusCounters.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$145, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass145 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass145(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final LegacyShowUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new LegacyShowUseCase((Show) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SafeCallbackInvoke.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$146, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass146 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass146(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final SendPrivacyUpdateRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, e0Var.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$147, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass147 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass147(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final TriggerInitializationCompletedRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, e0Var.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$148, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass148 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass148(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final TriggerInitializeListener invoke() {
                return new TriggerInitializeListener((w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, d0.f44761a.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$149, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass149 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass149(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DiagnosticEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetDiagnosticEventBatchRequest.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(BackgroundWorker.class))), (UniversalRequestEventSender) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DIAGNOSTICS_EVENT_SENDER, e0Var.b(UniversalRequestEventSender.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, e0Var.b(GetRequestPolicy.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass15 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$150, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass150 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass150(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final EventObservers invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new EventObservers((OperativeEventObserver) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TransactionEventObserver.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$151, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass151 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass151(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetTransactionData invoke() {
                return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(GetByteStringId.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$152, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass152 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass152(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetTransactionRequest invoke() {
                return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(DeviceInfoRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$153, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass153 extends o implements a {
            public static final AnonymousClass153 INSTANCE = new AnonymousClass153();

            public AnonymousClass153() {
                super(0);
            }

            @Override // jk.a
            public final GetAdRevenueEventData invoke() {
                return new AndroidGetAdRevenueEventData();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$154, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass154 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass154(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HandleAdRevenueEvent invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new HandleAdRevenueEvent((AdRevenueRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AdRevenueRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (GetAdRevenueEventData) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAdRevenueEventData.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$155, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass155 extends o implements a {
            public static final AnonymousClass155 INSTANCE = new AnonymousClass155();

            public AnonymousClass155() {
                super(0);
            }

            @Override // jk.a
            public final GetDiagnosticEventBatchRequest invoke() {
                return new GetDiagnosticEventBatchRequest();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$156, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass156 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass156(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetDiagnosticEventRequest invoke() {
                return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(GetSharedDataTimestamps.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$157, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass157 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass157(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetOperativeEventApi invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new GetOperativeEventApi((OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetOperativeEventRequest.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$158, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass158 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass158(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetOperativeEventRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new GetOperativeEventRequest((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CampaignRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$159, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass159 extends o implements a {
            public static final AnonymousClass159 INSTANCE = new AnonymousClass159();

            public AnonymousClass159() {
                super(0);
            }

            @Override // jk.a
            public final HandleGatewayEventResponse invoke() {
                return new AndroidHandleGatewayEventResponse();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass16 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.omidCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$160, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass160 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass160(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final OperativeEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new OperativeEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(BackgroundWorker.class))), (UniversalRequestEventSender) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.OPERATIVE_EVENT_SENDER, e0Var.b(UniversalRequestEventSender.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, e0Var.b(GetRequestPolicy.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$161, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass161 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass161(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final TransactionEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new TransactionEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, e0Var.b(a0.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, e0Var.b(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, e0Var.b(ByteStringDataSource.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$162, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass162 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass162(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AdRevenueObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AdRevenueObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_ILRD_SCOPE, e0Var.b(a0.class))), (AdRevenueRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRevenueRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, e0Var.b(GetRequestPolicy.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$163, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass163 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass163(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final LifecycleEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new LifecycleEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetUniversalRequestForPayLoad.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_LIFECYCLE_SCOPE, e0Var.b(a0.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(LifecycleDataSource.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, e0Var.b(GetRequestPolicy.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$164, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass164 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass164(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AppLovinCommunicatorBridge invoke() {
                return new AppLovinCommunicatorBridge((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$165, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass165 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass165(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MaxAdRevenueCommunicatorProxyFactory invoke() {
                return new MaxAdRevenueCommunicatorProxyFactory((Logger) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$166, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass166 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass166(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MaxAdRevenueListener invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new MaxAdRevenueListener((HandleAdRevenueEvent) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(HandleAdRevenueEvent.class))), (a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_ILRD_SCOPE, e0Var.b(a0.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$167, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass167 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass167(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MaxAdRevenueObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new MaxAdRevenueObserver((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))), (AppLovinCommunicatorBridge) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AppLovinCommunicatorBridge.class))), (MaxAdRevenueListener) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MaxAdRevenueListener.class))), (MaxAdRevenueCommunicatorProxyFactory) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MaxAdRevenueCommunicatorProxyFactory.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$168, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass168 extends o implements a {
            public static final AnonymousClass168 INSTANCE = new AnonymousClass168();

            public AnonymousClass168() {
                super(0);
            }

            @Override // jk.a
            public final UniversalRequestTtlValidator invoke() {
                return new CommonUniversalRequestTtlValidator();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$169, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass169 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass169(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final UniversalRequestEventSender invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(UniversalRequestTtlValidator.class))), null, 8, null);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/f1;", "invoke", "()Lcn/f1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass17 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final f1 invoke() {
                return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(DiagnosticEventRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$170, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass170 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass170(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final UniversalRequestEventSender invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(UniversalRequestTtlValidator.class))), OperationType.DIAGNOSTIC_EVENT);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$171, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass171 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass171(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final UniversalRequestEventSender invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(UniversalRequestTtlValidator.class))), OperationType.OPERATIVE_EVENT);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$172, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass172 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass172(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final OmFinishSession invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidOmFinishSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$173, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass173 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass173(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final OmImpressionOccurred invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidOmImpressionOccurred((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$174, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass174 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass174(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidOmInteraction invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidOmStartSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$175, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass175 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass175(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetOmData invoke() {
                return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(OpenMeasurementRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$176, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass176 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass176(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final IsOMActivated invoke() {
                return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(OpenMeasurementRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$177, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass177 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass177(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeOMSDK invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidInitializeOMSDK((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OpenMeasurementRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$178, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass178 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass178(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeAdQuality invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidInitializeAdQuality((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$179, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass179 extends o implements a {
            public static final AnonymousClass179 INSTANCE = new AnonymousClass179();

            public AnonymousClass179() {
                super(0);
            }

            @Override // jk.a
            public final FlattenerRulesUseCase invoke() {
                return new DeveloperConsentFlattenerRulesUseCase();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass18 extends o implements a {
            public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

            public AnonymousClass18() {
                super(0);
            }

            @Override // jk.a
            public final ForceAlternativeFlow invoke() {
                return new ForceAlternativeFlow();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$180, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass180 extends o implements a {
            public static final AnonymousClass180 INSTANCE = new AnonymousClass180();

            public AnonymousClass180() {
                super(0);
            }

            @Override // jk.a
            public final FlattenerRulesUseCase invoke() {
                return new LegacyUserConsentFlattenerRulesUseCase();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$181, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass181 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass181(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final BackgroundWorker invoke() {
                return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$182, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass182 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass182(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DiagnosticEventRequestWorkModifier invoke() {
                return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$183, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass183 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass183(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GatewayClient invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonGatewayClient((HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(HttpClientProvider.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (RequestUrlFactory) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(RequestUrlFactory.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$184, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/y;", "invoke", "()Lcn/y;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass184 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass184(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final y invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new SDKErrorHandler((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$185, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/token/TokenStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass185 extends o implements a {
            public static final AnonymousClass185 INSTANCE = new AnonymousClass185();

            public AnonymousClass185() {
                super(0);
            }

            @Override // jk.a
            public final TokenStorage invoke() {
                return new InMemoryTokenStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$186, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/device/VolumeChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass186 extends o implements a {
            public static final AnonymousClass186 INSTANCE = new AnonymousClass186();

            public AnonymousClass186() {
                super(0);
            }

            @Override // jk.a
            public final VolumeChange invoke() {
                return new VolumeChangeContentObserver();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$187, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass187 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass187(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$188, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass188 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass188(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeSDK invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new InitializeSDK((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateComplete.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$189, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass189 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass189(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateComplete invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new InitializeStateComplete((i) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, e0Var.b(i.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass19 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass19(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ByteStringDataSource invoke() {
                return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(StorageManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$190, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass190 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass190(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateConfig invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new InitializeStateConfig((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateConfigWithLoader.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$191, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass191 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass191(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateConfigWithLoader invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new InitializeStateConfigWithLoader((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$192, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass192 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass192(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$193, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass193 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass193(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$194, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass194 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass194(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$195, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass195 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass195(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateLoadWeb invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new InitializeStateLoadWeb((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(InitializeStateNetworkError.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HttpClientProvider.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$196, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass196 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass196(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$197, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/StoreMonitor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass197 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass197(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final StoreMonitor invoke() {
                return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(StoreExceptionHandler.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$198, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/StoreWebViewEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass198 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass198(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final StoreWebViewEventSender invoke() {
                return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(IEventSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$199, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/core/StoreExceptionHandler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass199 extends o implements a {
            public static final AnonymousClass199 INSTANCE = new AnonymousClass199();

            public AnonymousClass199() {
                super(0);
            }

            @Override // jk.a
            public final StoreExceptionHandler invoke() {
                return new GatewayStoreExceptionHandler();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/w;", "invoke", "()Lcn/w;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final w invoke() {
                return this.$moduleInstance.mainDispatcher();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Ls0/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass20 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.privacyDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$200, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/core/StoreEventListenerFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass200 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass200(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final StoreEventListenerFactory invoke() {
                return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(StoreWebViewEventSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$201, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass201 extends o implements a {
            public static final AnonymousClass201 INSTANCE = new AnonymousClass201();

            public AnonymousClass201() {
                super(0);
            }

            @Override // jk.a
            public final ConfigurationReader invoke() {
                return new ConfigurationReader();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$202, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass202 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass202(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidAttribution invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidAttribution((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$203, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass203 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass203(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AdPlayerScope invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AdPlayerScope((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$204, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass204 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass204(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidWebViewClient invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidWebViewClient((GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetCachedAsset.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$205, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass205 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass205(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidGetWebViewContainerUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidGetWebViewContainerUseCase((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendWebViewClientErrorDiagnostics.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, e0Var.b(w.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$206, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/Load;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass206 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass206(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final Load invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidLoad((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, e0Var.b(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (ValidateExtrasSize) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ValidateExtrasSize.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$207, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass207 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass207(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AwaitInitialization invoke() {
                return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$208, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass208 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass208(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetAsyncHeaderBiddingToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SafeCallbackInvoke.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$209, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass209 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass209(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetAdPlayer invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonGetAdPlayer((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OfferwallManager.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(LifecycleDataSource.class))), (OrientationRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OrientationRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass21 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyDataStore((i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, d0.f44761a.b(i.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$210, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass210 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass210(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CacheWebViewAssets invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidCacheWebViewAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$211, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass211 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass211(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HandleGatewayAdResponse invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidHandleGatewayAdResponse((AdRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAdPlayer.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CacheWebViewAssets.class))), (WebViewLessLoadStrategy) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(WebViewLessLoadStrategy.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$212, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass212 extends o implements a {
            public static final AnonymousClass212 INSTANCE = new AnonymousClass212();

            public AnonymousClass212() {
                super(0);
            }

            @Override // jk.a
            public final HandleInvocationsFromAdViewer invoke() {
                return new HandleInvocationsFromAdViewer();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$213, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass213 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass213(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final LegacyLoadUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new LegacyLoadUseCase((Load) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CleanUpWhenOpportunityExpires.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$214, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass214 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass214(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final WebViewLessLoadStrategy invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidWebViewLessLoadStrategy((AdRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CampaignRepository.class))), (CacheAssets) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CacheAssets.class))), (AdRefresh) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AdRefresh.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$215, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass215 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass215(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final SafeCallbackInvoke invoke() {
                return new CommonSafeCallbackInvoke((w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, d0.f44761a.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$216, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass216 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass216(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$217, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass217 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass217(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CoroutineTimer invoke() {
                return new CommonCoroutineTimer((w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, d0.f44761a.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$218, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass218 extends o implements a {
            public static final AnonymousClass218 INSTANCE = new AnonymousClass218();

            public AnonymousClass218() {
                super(0);
            }

            @Override // jk.a
            public final IEventSender invoke() {
                return SharedInstances.INSTANCE.getWebViewEventSender();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$219, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SetGameId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass219 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass219(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final SetGameId invoke() {
                return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Ls0/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass22 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.privacyFsmDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$220, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetGameId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass220 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass220(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetGameId invoke() {
                return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$221, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ValidateGameId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass221 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass221(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ValidateGameId invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonValidateGameId((GetGameId) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SetGameId.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$222, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass222 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass222(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ValidateExtrasSize invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new ValidateExtrasSize((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$223, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass223 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass223(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ShouldAllowInitialization invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonShouldAllowInitialization((AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ValidateGameId.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$224, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass224 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass224(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CheckForGameIdAndTestModeChanges invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonCheckForGameIdAndTestModeChanges((GetGameId) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$225, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass225 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass225(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DownloadPriorityQueue invoke() {
                return new DownloadPriorityQueue((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$226, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass226 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass226(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CleanupDirectory invoke() {
                return new CleanupDirectory((Logger) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$227, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass227 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass227(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final FocusRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new FocusRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AndroidGetLifecycleFlow.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$228, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass228 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass228(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidGetIsAdActivity invoke() {
                return new AndroidGetIsAdActivity((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$229, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass229 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass229(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidGetLifecycleFlow invoke() {
                return new AndroidGetLifecycleFlow((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass23 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyFsmDataStore((i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, d0.f44761a.b(i.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$230, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass230 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass230(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidHandleFocusCounters invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidHandleFocusCounters((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (FocusRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(FocusRepository.class))), (AndroidGetIsAdActivity) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidGetIsAdActivity.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), null, 16, null);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$231, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass231 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass231(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final OfferwallAdapterBridge invoke() {
                return new OfferwallAdapterBridge((a0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, d0.f44761a.b(a0.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$232, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass232 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass232(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final OfferwallManager invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidOfferwallManager((OfferwallAdapterBridge) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(OfferwallAdapterBridge.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$233, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass233 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass233(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final LoadOfferwallAd invoke() {
                return new LoadOfferwallAd((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(OfferwallManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$234, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/offerwall/GetIsOfferwallAdReady;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass234 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass234(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetIsOfferwallAdReady invoke() {
                return new GetIsOfferwallAdReady((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(OfferwallManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$235, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass235 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass235(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final FIdDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CachedFIdDataSource((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))), new AndroidFIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Context.class)))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$236, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass236 extends o implements a {
            public static final AnonymousClass236 INSTANCE = new AnonymousClass236();

            public AnonymousClass236() {
                super(0);
            }

            @Override // jk.a
            public final FIdExistenceDataSource invoke() {
                return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$237, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass237 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass237(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AdQualityVersionDataSource invoke() {
                return new AndroidAdQualityVersionDataSource((Logger) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$238, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass238 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass238(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CleanUpWhenOpportunityExpires invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CleanUpWhenOpportunityExpires((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$239, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass239 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass239(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final OrientationRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new OrientationRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AndroidGetLifecycleFlow.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$24, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Ls0/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass24 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.nativeConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$240, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass240 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass240(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidAppSetIdDataSource invoke() {
                return new AndroidAppSetIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$241, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass241 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass241(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidUnityInfoDataSource invoke() {
                return new AndroidUnityInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$242, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass242 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass242(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final InstallReferrerDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidInstallReferrerDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$243, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass243 extends o implements a {
            public static final AnonymousClass243 INSTANCE = new AnonymousClass243();

            public AnonymousClass243() {
                super(0);
            }

            @Override // jk.a
            public final HandleDebugSettings invoke() {
                return new HandleDebugSettings();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$244, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/log/Logger;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass244 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass244(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final Logger invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new UnityLogger((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CreateFile.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$245, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass245 extends o implements a {
            public static final AnonymousClass245 INSTANCE = new AnonymousClass245();

            public AnonymousClass245() {
                super(0);
            }

            @Override // jk.a
            public final IsBillingClientAvailable invoke() {
                return new IsBillingClientAvailable();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$246, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass246 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass246(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final UnityBootConfigDataSource invoke() {
                return new AndroidUnityBootConfigDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$247, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass247 extends o implements a {
            public static final AnonymousClass247 INSTANCE = new AnonymousClass247();

            public AnonymousClass247() {
                super(0);
            }

            @Override // jk.a
            public final GetSafeguardedInitializationPolicy invoke() {
                return new AndroidGetSafeguardedInitializationPolicy();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$248, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass248 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass248(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final RequestUrlFactory invoke() {
                return new AndroidRequestUrlFactory((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$25, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass25 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, d0.f44761a.b(i.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$26, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Ls0/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass26 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.glInfoDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))), (e) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, e0Var.b(e.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$27, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass27 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.glInfoDataStore((i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, d0.f44761a.b(i.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$28, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass28 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass28(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final UniversalRequestDataStoreProvider invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new UniversalRequestDataStoreProvider((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$29, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Ls0/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass29 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.iapTransactionDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/w;", "invoke", "()Lcn/w;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final w invoke() {
                return this.$moduleInstance.defaultDispatcher();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$30, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass30 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass30(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.iapTransactionDataStore((i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, d0.f44761a.b(i.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$31, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "invoke", "()Ls0/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass31 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass31(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.webViewConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$32, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass32 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass32(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AsyncTokenStorage invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.asyncTokenStorage((TokenStorage) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SDKMetricsSender.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$33, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass33 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass33(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final VolumeChangeMonitor invoke() {
                return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(VolumeChange.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$34, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/misc/JsonStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass34 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass34(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final JsonStorage invoke() {
                return this.$moduleInstance.publicJsonStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$35, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/misc/JsonStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass35 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass35(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final JsonStorage invoke() {
                return this.$moduleInstance.privateJsonStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$36, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/misc/JsonStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass36 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass36(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final JsonStorage invoke() {
                return this.$moduleInstance.memoryJsonStorage();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass37 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass37(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                return this.$moduleInstance.defaultNativeConfiguration();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$38, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/measurements/MeasurementsService;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass38 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass38(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MeasurementsService invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.measurementService((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/topics/TopicsService;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass39 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass39(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final TopicsService invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.topicsService((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/w;", "invoke", "()Lcn/w;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final w invoke() {
                return this.$moduleInstance.ioDispatcher();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass40 extends o implements a {
            public static final AnonymousClass40 INSTANCE = new AnonymousClass40();

            public AnonymousClass40() {
                super(0);
            }

            @Override // jk.a
            public final CronetEngineBuilderFactory invoke() {
                return new CronetEngineBuilderFactory();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$41, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass41 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass41(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HttpClientProvider invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidHttpClientProvider((AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CronetEngineBuilderFactory.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationTraitsMetadataReader.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass42 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/services/core/network/core/HttpClient;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/services/core/network/core/HttpClient;"}, k = 3, mv = {1, 8, 0})
            @ck.e(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$42$1", f = "ServiceProvider.kt", l = {IronSourceError.ERROR_NO_INTERNET_CONNECTION}, m = "invokeSuspend")
            public static final class C02251 extends ck.i implements c {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02251(ServicesRegistry servicesRegistry, f fVar) {
                    super(2, fVar);
                    this.$this_registry = servicesRegistry;
                }

                @Override // ck.a
                public final f create(Object obj, f fVar) {
                    return new C02251(this.$this_registry, fVar);
                }

                @Override // jk.c
                public final Object invoke(a0 a0Var, f fVar) {
                    return ((C02251) create(a0Var, fVar)).invokeSuspend(r.f53297a);
                }

                @Override // ck.a
                public final Object invokeSuspend(Object obj) {
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj);
                        return obj;
                    }
                    t9.e.z(obj);
                    HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(HttpClientProvider.class)));
                    this.label = 1;
                    Object objInvoke = httpClientProvider.invoke(this);
                    bk.a aVar = bk.a.f5708a;
                    return objInvoke == aVar ? aVar : objInvoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass42(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HttpClient invoke() {
                return (HttpClient) cn.d0.C(l.f3620a, new C02251(this.$this_registry, null));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$43, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass43 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass43(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MediationTraitsMetadataReader invoke() {
                return new MediationTraitsMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", d0.f44761a.b(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$44, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass44 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass44(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AlternativeFlowReader invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new CommonAlternativeFlowReader((ConfigurationReader) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationTraitsMetadataReader.class))), (ForceAlternativeFlow) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ForceAlternativeFlow.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$45, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass45 extends o implements a {
            public static final AnonymousClass45 INSTANCE = new AnonymousClass45();

            public AnonymousClass45() {
                super(0);
            }

            @Override // jk.a
            public final TcfDataSource invoke() {
                return new AndroidTcfDataSource();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$46, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass46 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass46(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final TcfRepository invoke() {
                return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(TcfDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$47, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass47 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass47(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidManifestIntPropertyReader invoke() {
                return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$48, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass48 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass48(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AndroidTestDataInfo invoke() {
                return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(AndroidManifestIntPropertyReader.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$49, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass49 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass49(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GameServerIdReader invoke() {
                return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", d0.f44761a.b(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass5 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final ISDKDispatchers invoke() {
                return this.$moduleInstance.sdkDispatchers();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$50, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass50 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass50(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final StoreDataSource invoke() {
                return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$51, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass51 extends o implements a {
            public static final AnonymousClass51 INSTANCE = new AnonymousClass51();

            public AnonymousClass51() {
                super(0);
            }

            @Override // jk.a
            public final AnalyticsDataSource invoke() {
                return new AndroidAnalyticsDataSource();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$52, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass52 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass52(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DeveloperConsentDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, e0Var.b(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", e0Var.b(JsonStorage.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$53, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass53 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass53(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DynamicDeviceInfoDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidDynamicDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(LifecycleDataSource.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$54, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/LegacyUserConsentDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass54 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass54(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final LegacyUserConsentDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, e0Var.b(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", e0Var.b(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$55, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass55 extends o implements a {
            public static final AnonymousClass55 INSTANCE = new AnonymousClass55();

            public AnonymousClass55() {
                super(0);
            }

            @Override // jk.a
            public final LifecycleDataSource invoke() {
                return new AndroidLifecycleDataSource();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$56, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass56 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass56(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ForegroundDurationReader invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                AppForegroundDurationObserver appForegroundDurationObserver = new AppForegroundDurationObserver((LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(LifecycleDataSource.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), null, null, 12, null);
                appForegroundDurationObserver.invoke();
                return appForegroundDurationObserver;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$57, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass57 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass57(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CacheDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidLocalCacheDataSource((CreateFile) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetFileExtensionFromUrl.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$58, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CreateFile;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass58 extends o implements a {
            public static final AnonymousClass58 INSTANCE = new AnonymousClass58();

            public AnonymousClass58() {
                super(0);
            }

            @Override // jk.a
            public final CreateFile invoke() {
                return new CommonCreateFile();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$59, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass59 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass59(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final GetFileExtensionFromUrl invoke() {
                return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(RemoveUrlQuery.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass6 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // jk.a
            public final SDKMetricsSender invoke() {
                return this.$moduleInstance.sdkMetrics();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$60, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass60 extends o implements a {
            public static final AnonymousClass60 INSTANCE = new AnonymousClass60();

            public AnonymousClass60() {
                super(0);
            }

            @Override // jk.a
            public final RemoveUrlQuery invoke() {
                return new AndroidRemoveUrlQuery();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$61, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass61 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass61(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MediationDataSource invoke() {
                return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", d0.f44761a.b(JsonStorage.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$62, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass62 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass62(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final PrivacyDeviceInfoDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidPrivacyDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (FIdDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(FIdDataSource.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidAppSetIdDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$63, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass63 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass63(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CacheDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidRemoteCacheDataSource((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetFileExtensionFromUrl.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HttpClientProvider.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$64, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass64 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass64(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final StaticDeviceInfoDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidStaticDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, e0Var.b(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(StoreDataSource.class))), (UnityBootConfigDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(UnityBootConfigDataSource.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$65, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/e;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Ls0/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass65 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass65(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final e invoke() {
                return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(GetOpenGLRendererInfo.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$66, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass66 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass66(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final UniversalRequestDataSource invoke() {
                return new UniversalRequestDataSource((UniversalRequestDataStoreProvider) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(UniversalRequestDataStoreProvider.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$67, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass67 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass67(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final WebviewConfigurationDataSource invoke() {
                return new WebviewConfigurationDataSource((i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, d0.f44761a.b(i.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$68, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass68 extends o implements a {
            public static final AnonymousClass68 INSTANCE = new AnonymousClass68();

            public AnonymousClass68() {
                super(0);
            }

            @Override // jk.a
            public final OmidManager invoke() {
                return new AndroidOmidManager();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$69, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass69 extends o implements a {
            public static final AnonymousClass69 INSTANCE = new AnonymousClass69();

            public AnonymousClass69() {
                super(0);
            }

            @Override // jk.a
            public final SDKPropertiesManager invoke() {
                return new AndroidSDKPropertiesManager();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass7 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.initCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$70, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass70 extends o implements a {
            public static final AnonymousClass70 INSTANCE = new AnonymousClass70();

            public AnonymousClass70() {
                super(0);
            }

            @Override // jk.a
            public final StorageManager invoke() {
                return new AndroidStorageManager();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$71, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass71 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass71(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final BillingClientAdapter invoke() {
                return new BillingClientAdapterFactory().createBillingClientAdapter((Context) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(Context.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$72, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass72 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass72(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ProductDetailsFetcher invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(BillingClientAdapter.class))), "subs"));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$73, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass73 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass73(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final TransactionEventManager invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new TransactionEventManager((a0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, e0Var.b(a0.class))), (BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(BillingClientAdapter.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, e0Var.b(ByteStringDataSource.class))), (IsBillingClientAvailable) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(IsBillingClientAvailable.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (ProductDetailsFetcher) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(ProductDetailsFetcher.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Logger.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$74, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass74 extends o implements a {
            public static final AnonymousClass74 INSTANCE = new AnonymousClass74();

            public AnonymousClass74() {
                super(0);
            }

            @Override // jk.a
            public final AdRepository invoke() {
                return new AndroidAdRepository();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$75, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass75 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass75(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CacheRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidCacheRepository((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOCAL, e0Var.b(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, e0Var.b(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CleanupDirectory.class))), (DownloadPriorityQueue) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DownloadPriorityQueue.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CreateFile.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))), (GetAssetFileName) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAssetFileName.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$76, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass76 extends o implements a {
            public static final AnonymousClass76 INSTANCE = new AnonymousClass76();

            public AnonymousClass76() {
                super(0);
            }

            @Override // jk.a
            public final GetCacheDirectory invoke() {
                return new CommonGetCacheDirectory();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$77, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass77 extends o implements a {
            public static final AnonymousClass77 INSTANCE = new AnonymousClass77();

            public AnonymousClass77() {
                super(0);
            }

            @Override // jk.a
            public final GetAssetFileName invoke() {
                return new GetAssetFileName();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$78, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass78 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass78(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CampaignRepository invoke() {
                return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(GetSharedDataTimestamps.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$79, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass79 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass79(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DeveloperConsentRepository invoke() {
                return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(DeveloperConsentDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass8 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.loadCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$80, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass80 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass80(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DeviceInfoRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SessionRepository.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$81, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass81 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass81(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final DiagnosticEventRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidDiagnosticEventRepository((CoroutineTimer) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetDiagnosticEventRequest.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$82, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass82 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass82(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final LegacyUserConsentRepository invoke() {
                return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(LegacyUserConsentDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$83, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass83 extends o implements a {
            public static final AnonymousClass83 INSTANCE = new AnonymousClass83();

            public AnonymousClass83() {
                super(0);
            }

            @Override // jk.a
            public final MediationProviderParser invoke() {
                return new CommonMediationProviderParser();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$84, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass84 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass84(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MediationInfoConverter invoke() {
                return new CommonMediationInfoConverter((MediationProviderParser) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(MediationProviderParser.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$85, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass85 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass85(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final MediationRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidMediationRepository((MediationDataSource) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(MediationDataSource.class))), (MediationProviderParser) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(MediationProviderParser.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$86, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass86 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass86(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final OpenMeasurementRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidOpenMeasurementRepository((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, e0Var.b(w.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(OmidManager.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$87, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass87 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass87(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final SessionRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidSessionRepository((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, e0Var.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, e0Var.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, e0Var.b(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, e0Var.b(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(NativeConfigurationOuterClass.NativeConfiguration.class))), (w) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$88, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass88 extends o implements a {
            public static final AnonymousClass88 INSTANCE = new AnonymousClass88();

            public AnonymousClass88() {
                super(0);
            }

            @Override // jk.a
            public final TransactionEventRepository invoke() {
                return new AndroidTransactionEventRepository();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$89, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass89 extends o implements a {
            public static final AnonymousClass89 INSTANCE = new AnonymousClass89();

            public AnonymousClass89() {
                super(0);
            }

            @Override // jk.a
            public final AdRevenueRepository invoke() {
                return new AndroidAdRevenueRepository();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcn/a0;", "invoke", "()Lcn/a0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass9 extends o implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final a0 invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return unityAdsModule.showCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(ISDKDispatchers.class))), (y) this.$this_registry.resolveService(new ServiceKey("sdk", e0Var.b(y.class))), (f1) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, e0Var.b(f1.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$90, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass90 extends o implements a {
            public static final AnonymousClass90 INSTANCE = new AnonymousClass90();

            public AnonymousClass90() {
                super(0);
            }

            @Override // jk.a
            public final OperativeEventRepository invoke() {
                return new OperativeEventRepository();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$91, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass91 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass91(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final ExecuteAdViewerRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidExecuteAdViewerRequest((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, e0Var.b(w.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(HttpClientProvider.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetCachedAsset.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$92, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass92 extends o implements a {
            public static final AnonymousClass92 INSTANCE = new AnonymousClass92();

            public AnonymousClass92() {
                super(0);
            }

            @Override // jk.a
            public final GetByteStringId invoke() {
                return new AndroidGenerateByteStringId();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$93, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/IntentCreation;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass93 extends o implements a {
            public static final AnonymousClass93 INSTANCE = new AnonymousClass93();

            public AnonymousClass93() {
                super(0);
            }

            @Override // jk.a
            public final IntentCreation invoke() {
                return new AndroidIntentCreation();
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$94, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass94 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass94(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final HandleOpenUrl invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidHandleOpenUrl((Context) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(Context.class))), (IntentCreation) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(IntentCreation.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$95, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/Refresh;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass95 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass95(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final Refresh invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidRefresh((w) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, e0Var.b(w.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, e0Var.b(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GatewayClient.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$96, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CacheAssets;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass96 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass96(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final CacheAssets invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidCacheAssets((a0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, e0Var.b(a0.class))), (CacheFile) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CacheFile.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(SendDiagnosticEvent.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$97, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AdRefresh;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass97 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass97(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final AdRefresh invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidAdRefresh((AdRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(AdRepository.class))), (CacheAssets) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(CacheAssets.class))), (Refresh) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(Refresh.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$98, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass98 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass98(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final SendDiagnosticEvent invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                e0 e0Var = d0.f44761a;
                return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", e0Var.b(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(GetDiagnosticEventRequest.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", e0Var.b(LifecycleDataSource.class))));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$99, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class AnonymousClass99 extends o implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass99(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // jk.a
            public final SendWebViewClientErrorDiagnostics invoke() {
                return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", d0.f44761a.b(SendDiagnosticEvent.class))));
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ServicesRegistry) obj);
            return r.f53297a;
        }

        public final void invoke(ServicesRegistry registry) {
            n.f(registry, "$this$registry");
            UnityAdsModule unityAdsModule = new UnityAdsModule();
            registry.updateService(new ServiceKey("", d0.a(Context.class)), r9.b.u(C02241.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, d0.a(w.class)), r9.b.u(new AnonymousClass2(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, d0.a(w.class)), r9.b.u(new AnonymousClass3(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, d0.a(w.class)), r9.b.u(new AnonymousClass4(unityAdsModule)));
            registry.updateService(new ServiceKey("", d0.a(ISDKDispatchers.class)), r9.b.u(new AnonymousClass5(unityAdsModule)));
            registry.updateService(new ServiceKey("", d0.a(SDKMetricsSender.class)), r9.b.u(new AnonymousClass6(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass7(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass8(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass9(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass10(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_ILRD_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass11(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LIFECYCLE_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass12(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass13(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass14(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass15(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, d0.a(a0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass16(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, d0.a(f1.class)), ServiceFactoryKt.factoryOf(new AnonymousClass17(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", d0.a(ForceAlternativeFlow.class)), r9.b.u(AnonymousClass18.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, d0.a(ByteStringDataSource.class)), r9.b.u(new AnonymousClass19(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, d0.a(i.class)), r9.b.u(new AnonymousClass20(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, d0.a(ByteStringDataSource.class)), r9.b.u(new AnonymousClass21(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, d0.a(i.class)), r9.b.u(new AnonymousClass22(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, d0.a(ByteStringDataSource.class)), r9.b.u(new AnonymousClass23(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, d0.a(i.class)), r9.b.u(new AnonymousClass24(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, d0.a(ByteStringDataSource.class)), r9.b.u(new AnonymousClass25(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, d0.a(i.class)), r9.b.u(new AnonymousClass26(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, d0.a(ByteStringDataSource.class)), r9.b.u(new AnonymousClass27(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", d0.a(UniversalRequestDataStoreProvider.class)), r9.b.u(new AnonymousClass28(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, d0.a(i.class)), r9.b.u(new AnonymousClass29(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, d0.a(ByteStringDataSource.class)), r9.b.u(new AnonymousClass30(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, d0.a(i.class)), r9.b.u(new AnonymousClass31(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", d0.a(AsyncTokenStorage.class)), r9.b.u(new AnonymousClass32(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", d0.a(VolumeChangeMonitor.class)), r9.b.u(new AnonymousClass33(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("PUBLIC", d0.a(JsonStorage.class)), r9.b.u(new AnonymousClass34(unityAdsModule)));
            registry.updateService(new ServiceKey("PRIVATE", d0.a(JsonStorage.class)), r9.b.u(new AnonymousClass35(unityAdsModule)));
            registry.updateService(new ServiceKey("MEMORY", d0.a(JsonStorage.class)), r9.b.u(new AnonymousClass36(unityAdsModule)));
            registry.updateService(new ServiceKey("", d0.a(NativeConfigurationOuterClass.NativeConfiguration.class)), r9.b.u(new AnonymousClass37(unityAdsModule)));
            registry.updateService(new ServiceKey("", d0.a(MeasurementsService.class)), r9.b.u(new AnonymousClass38(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", d0.a(TopicsService.class)), r9.b.u(new AnonymousClass39(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", d0.a(CronetEngineBuilderFactory.class)), r9.b.u(AnonymousClass40.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(HttpClientProvider.class)), r9.b.u(new AnonymousClass41(registry)));
            registry.updateService(new ServiceKey("", d0.a(HttpClient.class)), r9.b.u(new AnonymousClass42(registry)));
            registry.updateService(new ServiceKey("", d0.a(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass43(registry)));
            registry.updateService(new ServiceKey("", d0.a(AlternativeFlowReader.class)), r9.b.u(new AnonymousClass44(registry)));
            registry.updateService(new ServiceKey("", d0.a(TcfDataSource.class)), r9.b.u(AnonymousClass45.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(TcfRepository.class)), r9.b.u(new AnonymousClass46(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidManifestIntPropertyReader.class)), r9.b.u(new AnonymousClass47(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidTestDataInfo.class)), r9.b.u(new AnonymousClass48(registry)));
            registry.updateService(new ServiceKey("", d0.a(GameServerIdReader.class)), r9.b.u(new AnonymousClass49(registry)));
            registry.updateService(new ServiceKey("", d0.a(StoreDataSource.class)), r9.b.u(new AnonymousClass50(registry)));
            registry.updateService(new ServiceKey("", d0.a(AnalyticsDataSource.class)), r9.b.u(AnonymousClass51.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(DeveloperConsentDataSource.class)), r9.b.u(new AnonymousClass52(registry)));
            registry.updateService(new ServiceKey("", d0.a(DynamicDeviceInfoDataSource.class)), r9.b.u(new AnonymousClass53(registry)));
            registry.updateService(new ServiceKey("", d0.a(LegacyUserConsentDataSource.class)), r9.b.u(new AnonymousClass54(registry)));
            registry.updateService(new ServiceKey("", d0.a(LifecycleDataSource.class)), r9.b.u(AnonymousClass55.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(ForegroundDurationReader.class)), r9.b.u(new AnonymousClass56(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOCAL, d0.a(CacheDataSource.class)), r9.b.u(new AnonymousClass57(registry)));
            registry.updateService(new ServiceKey("", d0.a(CreateFile.class)), r9.b.u(AnonymousClass58.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(GetFileExtensionFromUrl.class)), r9.b.u(new AnonymousClass59(registry)));
            registry.updateService(new ServiceKey("", d0.a(RemoveUrlQuery.class)), r9.b.u(AnonymousClass60.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(MediationDataSource.class)), r9.b.u(new AnonymousClass61(registry)));
            registry.updateService(new ServiceKey("", d0.a(PrivacyDeviceInfoDataSource.class)), r9.b.u(new AnonymousClass62(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, d0.a(CacheDataSource.class)), r9.b.u(new AnonymousClass63(registry)));
            registry.updateService(new ServiceKey("", d0.a(StaticDeviceInfoDataSource.class)), r9.b.u(new AnonymousClass64(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, d0.a(e.class)), r9.b.u(new AnonymousClass65(registry)));
            registry.updateService(new ServiceKey("", d0.a(UniversalRequestDataSource.class)), r9.b.u(new AnonymousClass66(registry)));
            registry.updateService(new ServiceKey("", d0.a(WebviewConfigurationDataSource.class)), r9.b.u(new AnonymousClass67(registry)));
            registry.updateService(new ServiceKey("", d0.a(OmidManager.class)), r9.b.u(AnonymousClass68.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(SDKPropertiesManager.class)), r9.b.u(AnonymousClass69.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(StorageManager.class)), r9.b.u(AnonymousClass70.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(BillingClientAdapter.class)), r9.b.u(new AnonymousClass71(registry)));
            registry.updateService(new ServiceKey("", d0.a(ProductDetailsFetcher.class)), r9.b.u(new AnonymousClass72(registry)));
            registry.updateService(new ServiceKey("", d0.a(TransactionEventManager.class)), r9.b.u(new AnonymousClass73(registry)));
            registry.updateService(new ServiceKey("", d0.a(AdRepository.class)), r9.b.u(AnonymousClass74.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(CacheRepository.class)), r9.b.u(new AnonymousClass75(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetCacheDirectory.class)), r9.b.u(AnonymousClass76.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(GetAssetFileName.class)), r9.b.u(AnonymousClass77.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(CampaignRepository.class)), r9.b.u(new AnonymousClass78(registry)));
            registry.updateService(new ServiceKey("", d0.a(DeveloperConsentRepository.class)), r9.b.u(new AnonymousClass79(registry)));
            registry.updateService(new ServiceKey("", d0.a(DeviceInfoRepository.class)), r9.b.u(new AnonymousClass80(registry)));
            registry.updateService(new ServiceKey("", d0.a(DiagnosticEventRepository.class)), r9.b.u(new AnonymousClass81(registry)));
            registry.updateService(new ServiceKey("", d0.a(LegacyUserConsentRepository.class)), r9.b.u(new AnonymousClass82(registry)));
            registry.updateService(new ServiceKey("", d0.a(MediationProviderParser.class)), r9.b.u(AnonymousClass83.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(MediationInfoConverter.class)), r9.b.u(new AnonymousClass84(registry)));
            registry.updateService(new ServiceKey("", d0.a(MediationRepository.class)), r9.b.u(new AnonymousClass85(registry)));
            registry.updateService(new ServiceKey("", d0.a(OpenMeasurementRepository.class)), r9.b.u(new AnonymousClass86(registry)));
            registry.updateService(new ServiceKey("", d0.a(SessionRepository.class)), r9.b.u(new AnonymousClass87(registry)));
            registry.updateService(new ServiceKey("", d0.a(TransactionEventRepository.class)), r9.b.u(AnonymousClass88.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(AdRevenueRepository.class)), r9.b.u(AnonymousClass89.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(OperativeEventRepository.class)), r9.b.u(AnonymousClass90.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(ExecuteAdViewerRequest.class)), r9.b.u(new AnonymousClass91(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetByteStringId.class)), r9.b.u(AnonymousClass92.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(IntentCreation.class)), ServiceFactoryKt.factoryOf(AnonymousClass93.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(HandleOpenUrl.class)), ServiceFactoryKt.factoryOf(new AnonymousClass94(registry)));
            registry.updateService(new ServiceKey("", d0.a(Refresh.class)), r9.b.u(new AnonymousClass95(registry)));
            registry.updateService(new ServiceKey("", d0.a(CacheAssets.class)), r9.b.u(new AnonymousClass96(registry)));
            registry.updateService(new ServiceKey("", d0.a(AdRefresh.class)), ServiceFactoryKt.factoryOf(new AnonymousClass97(registry)));
            registry.updateService(new ServiceKey("", d0.a(SendDiagnosticEvent.class)), r9.b.u(new AnonymousClass98(registry)));
            registry.updateService(new ServiceKey("", d0.a(SendWebViewClientErrorDiagnostics.class)), r9.b.u(new AnonymousClass99(registry)));
            registry.updateService(new ServiceKey("", d0.a(Show.class)), ServiceFactoryKt.factoryOf(new AnonymousClass100(registry)));
            registry.updateService(new ServiceKey("", d0.a(CacheFile.class)), r9.b.u(new AnonymousClass101(registry)));
            registry.updateService(new ServiceKey("", d0.a(CleanAssets.class)), r9.b.u(new AnonymousClass102(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetAdObject.class)), r9.b.u(new AnonymousClass103(registry)));
            registry.updateService(new ServiceKey("", d0.a(ScarEligibleEffectiveUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass104(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass105(registry)));
            registry.updateService(new ServiceKey("", d0.a(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass106(registry)));
            registry.updateService(new ServiceKey("", d0.a(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new AnonymousClass107(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetInitializationData.class)), r9.b.u(new AnonymousClass108(registry)));
            registry.updateService(new ServiceKey("", d0.a(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass109(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetInitializationRequestPayload.class)), r9.b.u(new AnonymousClass110(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetInitializationState.class)), r9.b.u(new AnonymousClass111(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetIsFileCache.class)), r9.b.u(new AnonymousClass112(registry)));
            registry.updateService(new ServiceKey("", d0.a(SetInitializationState.class)), r9.b.u(new AnonymousClass113(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, d0.a(GetRequestPolicy.class)), r9.b.u(new AnonymousClass114(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetAdDataRefreshRequest.class)), r9.b.u(new AnonymousClass115(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetAdPlayerConfigRequest.class)), r9.b.u(new AnonymousClass116(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidGetAdPlayerContext.class)), r9.b.u(new AnonymousClass117(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetAdRequest.class)), r9.b.u(new AnonymousClass118(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetHbTokenEventRequest.class)), r9.b.u(AnonymousClass119.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(CommonScarEventReceiver.class)), r9.b.u(new AnonymousClass120(registry)));
            registry.updateService(new ServiceKey("", d0.a(GMAScarAdapterBridge.class)), r9.b.u(new AnonymousClass121(registry)));
            registry.updateService(new ServiceKey("", d0.a(ScarTimeHackFixer.class)), r9.b.u(new AnonymousClass122(registry)));
            registry.updateService(new ServiceKey("", d0.a(ScarManager.class)), r9.b.u(new AnonymousClass123(registry)));
            registry.updateService(new ServiceKey("", d0.a(FetchSignalsAndSendUseCase.class)), r9.b.u(new AnonymousClass124(registry)));
            registry.updateService(new ServiceKey("", d0.a(LoadScarAd.class)), r9.b.u(new AnonymousClass125(registry)));
            registry.updateService(new ServiceKey("", d0.a(HandleGetTokenRequest.class)), r9.b.u(new AnonymousClass126(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetClientInfo.class)), r9.b.u(new AnonymousClass127(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetInitializationCompletedRequest.class)), r9.b.u(new AnonymousClass128(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetInitializationRequest.class)), r9.b.u(new AnonymousClass129(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetLimitedSessionToken.class)), r9.b.u(new AnonymousClass130(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetOpenGLRendererInfo.class)), r9.b.u(new AnonymousClass131(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetSharedDataTimestamps.class)), r9.b.u(new AnonymousClass132(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetUniversalRequestForPayLoad.class)), r9.b.u(new AnonymousClass133(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetUniversalRequestSharedData.class)), r9.b.u(new AnonymousClass134(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetCachedAsset.class)), r9.b.u(new AnonymousClass135(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetWebViewBridgeUseCase.class)), r9.b.u(new AnonymousClass136(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, d0.a(GetRequestPolicy.class)), r9.b.u(new AnonymousClass137(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetLatestWebViewConfiguration.class)), r9.b.u(new AnonymousClass138(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, d0.a(GetRequestPolicy.class)), r9.b.u(new AnonymousClass139(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, d0.a(GetRequestPolicy.class)), r9.b.u(new AnonymousClass140(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetPrivacyUpdateRequest.class)), r9.b.u(new AnonymousClass141(registry)));
            registry.updateService(new ServiceKey("", d0.a(HandleGatewayInitializationResponse.class)), r9.b.u(new AnonymousClass142(registry)));
            registry.updateService(new ServiceKey("", d0.a(HandleGatewayUniversalResponse.class)), r9.b.u(new AnonymousClass143(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeBoldSDK.class)), r9.b.u(new AnonymousClass144(registry)));
            registry.updateService(new ServiceKey("", d0.a(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass145(registry)));
            registry.updateService(new ServiceKey("", d0.a(SendPrivacyUpdateRequest.class)), r9.b.u(new AnonymousClass146(registry)));
            registry.updateService(new ServiceKey("", d0.a(TriggerInitializationCompletedRequest.class)), r9.b.u(new AnonymousClass147(registry)));
            registry.updateService(new ServiceKey("", d0.a(TriggerInitializeListener.class)), r9.b.u(new AnonymousClass148(registry)));
            registry.updateService(new ServiceKey("", d0.a(DiagnosticEventObserver.class)), r9.b.u(new AnonymousClass149(registry)));
            registry.updateService(new ServiceKey("", d0.a(EventObservers.class)), r9.b.u(new AnonymousClass150(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetTransactionData.class)), r9.b.u(new AnonymousClass151(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetTransactionRequest.class)), r9.b.u(new AnonymousClass152(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetAdRevenueEventData.class)), r9.b.u(AnonymousClass153.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(HandleAdRevenueEvent.class)), r9.b.u(new AnonymousClass154(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetDiagnosticEventBatchRequest.class)), r9.b.u(AnonymousClass155.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(GetDiagnosticEventRequest.class)), r9.b.u(new AnonymousClass156(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetOperativeEventApi.class)), r9.b.u(new AnonymousClass157(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetOperativeEventRequest.class)), r9.b.u(new AnonymousClass158(registry)));
            registry.updateService(new ServiceKey("", d0.a(HandleGatewayEventResponse.class)), r9.b.u(AnonymousClass159.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(OperativeEventObserver.class)), r9.b.u(new AnonymousClass160(registry)));
            registry.updateService(new ServiceKey("", d0.a(TransactionEventObserver.class)), r9.b.u(new AnonymousClass161(registry)));
            registry.updateService(new ServiceKey("", d0.a(AdRevenueObserver.class)), r9.b.u(new AnonymousClass162(registry)));
            registry.updateService(new ServiceKey("", d0.a(LifecycleEventObserver.class)), r9.b.u(new AnonymousClass163(registry)));
            registry.updateService(new ServiceKey("", d0.a(AppLovinCommunicatorBridge.class)), r9.b.u(new AnonymousClass164(registry)));
            registry.updateService(new ServiceKey("", d0.a(MaxAdRevenueCommunicatorProxyFactory.class)), r9.b.u(new AnonymousClass165(registry)));
            registry.updateService(new ServiceKey("", d0.a(MaxAdRevenueListener.class)), ServiceFactoryKt.factoryOf(new AnonymousClass166(registry)));
            registry.updateService(new ServiceKey("", d0.a(MaxAdRevenueObserver.class)), r9.b.u(new AnonymousClass167(registry)));
            registry.updateService(new ServiceKey("", d0.a(UniversalRequestTtlValidator.class)), r9.b.u(AnonymousClass168.INSTANCE));
            registry.updateService(new ServiceKey("universal", d0.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new AnonymousClass169(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DIAGNOSTICS_EVENT_SENDER, d0.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new AnonymousClass170(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.OPERATIVE_EVENT_SENDER, d0.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new AnonymousClass171(registry)));
            registry.updateService(new ServiceKey("", d0.a(OmFinishSession.class)), r9.b.u(new AnonymousClass172(registry)));
            registry.updateService(new ServiceKey("", d0.a(OmImpressionOccurred.class)), r9.b.u(new AnonymousClass173(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidOmInteraction.class)), r9.b.u(new AnonymousClass174(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetOmData.class)), r9.b.u(new AnonymousClass175(registry)));
            registry.updateService(new ServiceKey("", d0.a(IsOMActivated.class)), r9.b.u(new AnonymousClass176(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeOMSDK.class)), r9.b.u(new AnonymousClass177(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeAdQuality.class)), r9.b.u(new AnonymousClass178(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, d0.a(FlattenerRulesUseCase.class)), r9.b.u(AnonymousClass179.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, d0.a(FlattenerRulesUseCase.class)), r9.b.u(AnonymousClass180.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(BackgroundWorker.class)), r9.b.u(new AnonymousClass181(registry)));
            registry.updateService(new ServiceKey("", d0.a(DiagnosticEventRequestWorkModifier.class)), r9.b.u(new AnonymousClass182(registry)));
            registry.updateService(new ServiceKey("", d0.a(GatewayClient.class)), r9.b.u(new AnonymousClass183(registry)));
            registry.updateService(new ServiceKey("sdk", d0.a(y.class)), r9.b.u(new AnonymousClass184(registry)));
            registry.updateService(new ServiceKey("", d0.a(TokenStorage.class)), r9.b.u(AnonymousClass185.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(VolumeChange.class)), r9.b.u(AnonymousClass186.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(ConfigFileFromLocalStorage.class)), r9.b.u(new AnonymousClass187(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeSDK.class)), r9.b.u(new AnonymousClass188(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateComplete.class)), r9.b.u(new AnonymousClass189(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateConfig.class)), r9.b.u(new AnonymousClass190(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateConfigWithLoader.class)), r9.b.u(new AnonymousClass191(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateCreate.class)), r9.b.u(new AnonymousClass192(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateError.class)), r9.b.u(new AnonymousClass193(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateLoadCache.class)), r9.b.u(new AnonymousClass194(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateLoadWeb.class)), r9.b.u(new AnonymousClass195(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateReset.class)), r9.b.u(new AnonymousClass196(registry)));
            registry.updateService(new ServiceKey("", d0.a(StoreMonitor.class)), r9.b.u(new AnonymousClass197(registry)));
            registry.updateService(new ServiceKey("", d0.a(StoreWebViewEventSender.class)), r9.b.u(new AnonymousClass198(registry)));
            registry.updateService(new ServiceKey("", d0.a(StoreExceptionHandler.class)), r9.b.u(AnonymousClass199.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(StoreEventListenerFactory.class)), r9.b.u(new AnonymousClass200(registry)));
            registry.updateService(new ServiceKey("", d0.a(ConfigurationReader.class)), r9.b.u(AnonymousClass201.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(AndroidAttribution.class)), r9.b.u(new AnonymousClass202(registry)));
            registry.updateService(new ServiceKey("", d0.a(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass203(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new AnonymousClass204(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass205(registry)));
            registry.updateService(new ServiceKey("", d0.a(Load.class)), ServiceFactoryKt.factoryOf(new AnonymousClass206(registry)));
            registry.updateService(new ServiceKey("", d0.a(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new AnonymousClass207(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass208(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass209(registry)));
            registry.updateService(new ServiceKey("", d0.a(CacheWebViewAssets.class)), r9.b.u(new AnonymousClass210(registry)));
            registry.updateService(new ServiceKey("", d0.a(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new AnonymousClass211(registry)));
            registry.updateService(new ServiceKey("", d0.a(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass212.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass213(registry)));
            registry.updateService(new ServiceKey("", d0.a(WebViewLessLoadStrategy.class)), r9.b.u(new AnonymousClass214(registry)));
            registry.updateService(new ServiceKey("", d0.a(SafeCallbackInvoke.class)), r9.b.u(new AnonymousClass215(registry)));
            registry.updateService(new ServiceKey("", d0.a(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass216(registry)));
            registry.updateService(new ServiceKey("", d0.a(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass217(registry)));
            registry.updateService(new ServiceKey("", d0.a(IEventSender.class)), r9.b.u(AnonymousClass218.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(SetGameId.class)), r9.b.u(new AnonymousClass219(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetGameId.class)), r9.b.u(new AnonymousClass220(registry)));
            registry.updateService(new ServiceKey("", d0.a(ValidateGameId.class)), r9.b.u(new AnonymousClass221(registry)));
            registry.updateService(new ServiceKey("", d0.a(ValidateExtrasSize.class)), r9.b.u(new AnonymousClass222(registry)));
            registry.updateService(new ServiceKey("", d0.a(ShouldAllowInitialization.class)), r9.b.u(new AnonymousClass223(registry)));
            registry.updateService(new ServiceKey("", d0.a(CheckForGameIdAndTestModeChanges.class)), r9.b.u(new AnonymousClass224(registry)));
            registry.updateService(new ServiceKey("", d0.a(DownloadPriorityQueue.class)), r9.b.u(new AnonymousClass225(registry)));
            registry.updateService(new ServiceKey("", d0.a(CleanupDirectory.class)), r9.b.u(new AnonymousClass226(registry)));
            registry.updateService(new ServiceKey("", d0.a(FocusRepository.class)), r9.b.u(new AnonymousClass227(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidGetIsAdActivity.class)), r9.b.u(new AnonymousClass228(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidGetLifecycleFlow.class)), r9.b.u(new AnonymousClass229(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidHandleFocusCounters.class)), r9.b.u(new AnonymousClass230(registry)));
            registry.updateService(new ServiceKey("", d0.a(OfferwallAdapterBridge.class)), r9.b.u(new AnonymousClass231(registry)));
            registry.updateService(new ServiceKey("", d0.a(OfferwallManager.class)), r9.b.u(new AnonymousClass232(registry)));
            registry.updateService(new ServiceKey("", d0.a(LoadOfferwallAd.class)), r9.b.u(new AnonymousClass233(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetIsOfferwallAdReady.class)), r9.b.u(new AnonymousClass234(registry)));
            registry.updateService(new ServiceKey("", d0.a(FIdDataSource.class)), r9.b.u(new AnonymousClass235(registry)));
            registry.updateService(new ServiceKey("", d0.a(FIdExistenceDataSource.class)), r9.b.u(AnonymousClass236.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(AdQualityVersionDataSource.class)), r9.b.u(new AnonymousClass237(registry)));
            registry.updateService(new ServiceKey("", d0.a(CleanUpWhenOpportunityExpires.class)), r9.b.u(new AnonymousClass238(registry)));
            registry.updateService(new ServiceKey("", d0.a(OrientationRepository.class)), r9.b.u(new AnonymousClass239(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidAppSetIdDataSource.class)), r9.b.u(new AnonymousClass240(registry)));
            registry.updateService(new ServiceKey("", d0.a(AndroidUnityInfoDataSource.class)), r9.b.u(new AnonymousClass241(registry)));
            registry.updateService(new ServiceKey("", d0.a(InstallReferrerDataSource.class)), r9.b.u(new AnonymousClass242(registry)));
            registry.updateService(new ServiceKey("", d0.a(HandleDebugSettings.class)), r9.b.u(AnonymousClass243.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(Logger.class)), r9.b.u(new AnonymousClass244(registry)));
            registry.updateService(new ServiceKey("", d0.a(IsBillingClientAvailable.class)), r9.b.u(AnonymousClass245.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(UnityBootConfigDataSource.class)), r9.b.u(new AnonymousClass246(registry)));
            registry.updateService(new ServiceKey("", d0.a(GetSafeguardedInitializationPolicy.class)), r9.b.u(AnonymousClass247.INSTANCE));
            registry.updateService(new ServiceKey("", d0.a(RequestUrlFactory.class)), ServiceFactoryKt.factoryOf(new AnonymousClass248(registry)));
        }
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(AnonymousClass1.INSTANCE);
    }
}
