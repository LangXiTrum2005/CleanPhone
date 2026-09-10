package com.chartboost.heliumsdk.network;

import androidx.media3.extractor.text.a;
import com.chartboost.heliumsdk.controllers.PartnerController;
import com.chartboost.heliumsdk.controllers.PrivacyController;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.AppConfig;
import com.chartboost.heliumsdk.domain.Bids;
import com.chartboost.heliumsdk.domain.BidsResponse;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.network.model.BannerSizeBody;
import com.chartboost.heliumsdk.network.model.BidRequestBody;
import com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult;
import com.chartboost.heliumsdk.network.model.MetricsRequestBody;
import com.chartboost.heliumsdk.utils.Environment;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.chartboost.heliumsdk.utils.LogController;
import com.google.android.gms.ads.RequestConfiguration;
import com.jakewharton.retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory;
import com.p004ironsource.ko;
import com.smartdigimkt.f3.b;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.UnknownHostException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101J)\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u00107Ja\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090,2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u001e\u0010@\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040A0A2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020DH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010EJM\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020D2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010NJ1\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020TH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010UJG\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001HW0,\"\u0006\b\u0000\u0010W\u0018\u00012$\b\u0004\u0010X\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040[0Z\u0012\u0006\u0012\u0004\u0018\u00010\u00010YH\u0081Hø\u0001\u0000¢\u0006\u0002\u0010\\JE\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u0010I\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00042\u0006\u0010_\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010`J+\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u0010b\u001a\u00020cH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010dJ+\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\b\u0010f\u001a\u0004\u0018\u00010\u00042\u0006\u00106\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010gJ)\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u0010i\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010gJ=\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u0010k\u001a\u00020l2\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u0010M\u001a\u0004\u0018\u00010\u00042\u0006\u0010m\u001a\u00020nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010oJ3\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u00100\u001a\u00020\u00042\b\u0010f\u001a\u0004\u0018\u00010\u00042\u0006\u00106\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101J)\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u0010i\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010gR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R)\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b$\u0010\u0002R!\u0010%\u001a\u00020&8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0018\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006s"}, d2 = {"Lcom/chartboost/heliumsdk/network/ChartboostMediationNetworking;", "", "()V", "APP_SET_ID_HEADER_KEY", "", "AUCTION_ID_HEADER_KEY", "DEBUG_HEADER_KEY", "DEVICE_OS_HEADER_KEY", "DEVICE_OS_VERSION_HEADER_KEY", "INIT_HASH_HEADER_KEY", "MEDIATION_LOAD_ID_HEADER_KEY", "QUEUE_ID_HEADER_KEY", "RATE_LIMIT_HEADER_KEY", "REWARDED_CALLBACK_DELAY_MS", "", "SDK_VERSION_HEADER_KEY", "SESSION_ID_HEADER_KEY", "api", "Lcom/chartboost/heliumsdk/network/ChartboostMediationApi;", "kotlin.jvm.PlatformType", "getApi$annotations", "getApi", "()Lcom/chartboost/heliumsdk/network/ChartboostMediationApi;", "api$delegate", "Lkotlin/Lazy;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "customInterceptor", "Lokhttp3/Interceptor;", "defaultInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "jsonConverter", "Lretrofit2/Converter$Factory;", "getJsonConverter$annotations", "retrofitInstance", "Lretrofit2/Retrofit;", "getRetrofitInstance$annotations", "getRetrofitInstance", "()Lretrofit2/Retrofit;", "retrofitInstance$delegate", "getAppConfig", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", "Lcom/chartboost/heliumsdk/domain/AppConfig;", b.f35043u, "initHash", "appSetId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logAuctionWinner", "", "bids", "Lcom/chartboost/heliumsdk/domain/Bids;", "loadId", "(Lcom/chartboost/heliumsdk/domain/Bids;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeBidRequest", "Lcom/chartboost/heliumsdk/domain/BidsResponse;", "privacyController", "Lcom/chartboost/heliumsdk/controllers/PrivacyController;", "partnerController", "Lcom/chartboost/heliumsdk/controllers/PartnerController;", "adLoadParams", "Lcom/chartboost/heliumsdk/domain/AdLoadParams;", "bidTokens", "", "rateLimitHeaderValue", "impressionDepth", "", "(Lcom/chartboost/heliumsdk/controllers/PrivacyController;Lcom/chartboost/heliumsdk/controllers/PartnerController;Lcom/chartboost/heliumsdk/domain/AdLoadParams;Ljava/util/Map;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeQueueRequest", "isRunning", "", "placementName", "queueCapacity", "actualMaxQueueSize", "queueDepth", "queueId", "(ZLjava/lang/String;ILjava/lang/Integer;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRewardedCallbackRequest", "activeBid", "Lcom/chartboost/heliumsdk/domain/Bid;", "customData", "rewardedCallbackData", "Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;", "(Lcom/chartboost/heliumsdk/domain/Bid;Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApiCall", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackAdLoad", "adType", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackAdaptiveBannerSize", "bannerSizeBody", "Lcom/chartboost/heliumsdk/network/model/BannerSizeBody;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/BannerSizeBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackChartboostImpression", "auctionID", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackClick", "auctionId", "trackEvent", "event", "Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "metricsRequestBody", "Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;", "(Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackPartnerImpression", "trackReward", "Method", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationNetworking {
    public static final String APP_SET_ID_HEADER_KEY = "x-mediation-idfv";
    public static final String AUCTION_ID_HEADER_KEY = "x-mediation-auction-id";
    public static final String DEBUG_HEADER_KEY = "X-Helium-Debug";
    public static final String DEVICE_OS_HEADER_KEY = "X-Helium-Device-OS";
    public static final String DEVICE_OS_VERSION_HEADER_KEY = "X-Helium-Device-OS-Version";
    public static final String INIT_HASH_HEADER_KEY = "x-helium-sdk-init-hash";
    public static final String MEDIATION_LOAD_ID_HEADER_KEY = "X-Mediation-Load-ID";
    public static final String QUEUE_ID_HEADER_KEY = "X-Mediation-Queue-ID";
    public static final String RATE_LIMIT_HEADER_KEY = "X-Helium-Ratelimit-Reset";
    private static final long REWARDED_CALLBACK_DELAY_MS = 1000;
    public static final String SDK_VERSION_HEADER_KEY = "X-Helium-SDK-Version";
    public static final String SESSION_ID_HEADER_KEY = "X-Helium-SessionID";

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    private static final Lazy api;

    /* JADX INFO: renamed from: client$delegate, reason: from kotlin metadata */
    private static final Lazy client;
    private static Interceptor customInterceptor;
    private static final HttpLoggingInterceptor defaultInterceptor;

    /* JADX INFO: renamed from: retrofitInstance$delegate, reason: from kotlin metadata */
    private static final Lazy retrofitInstance;
    public static final ChartboostMediationNetworking INSTANCE = new ChartboostMediationNetworking();
    private static final Converter.Factory jsonConverter = KotlinSerializationConverterFactory.create(HeliumJsonKt.getHeliumJson(), MediaType.INSTANCE.get("application/json; charset=utf-8"));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/chartboost/heliumsdk/network/ChartboostMediationNetworking$Method;", "", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface Method {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/chartboost/heliumsdk/network/ChartboostMediationNetworking$Method$Companion;", "", "()V", ko.f25534a, "", "getGET", "()Ljava/lang/String;", "setGET", "(Ljava/lang/String;)V", ko.f25535b, "getPOST", "setPOST", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static String GET = ko.f25534a;
            private static String POST = ko.f25535b;

            private Companion() {
            }

            public final String getGET() {
                return GET;
            }

            public final String getPOST() {
                return POST;
            }

            public final void setGET(String str) {
                Intrinsics.f(str, "<set-?>");
                GET = str;
            }

            public final void setPOST(String str) {
                Intrinsics.f(str, "<set-?>");
                POST = str;
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$logAuctionWinner$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {234, 405}, m = "logAuctionWinner")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.logAuctionWinner(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$makeBidRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 405}, m = "makeBidRequest")
    public static final class C09941 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C09941(Continuation<? super C09941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.makeBidRequest(null, null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$makeQueueRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {339, 405}, m = "makeQueueRequest")
    public static final class C09951 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C09951(Continuation<? super C09951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.makeQueueRequest(false, null, 0, null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$makeRewardedCallbackRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {405, 291}, m = "makeRewardedCallbackRequest")
    public static final class C09961 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C09961(Continuation<? super C09961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.makeRewardedCallbackRequest(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$safeApiCall$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking$safeApiCall$2", f = "ChartboostMediationNetworking.kt", l = {381}, m = "invokeSuspend")
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends T>>, Object> {
        final /* synthetic */ Function1<Continuation<? super Response<String>>, Object> $apiCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Continuation<? super Response<String>>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$apiCall = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$apiCall, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChartboostMediationError chartboostMediationError;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    Function1<Continuation<? super Response<String>>, Object> function1 = this.$apiCall;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                Response<T> response = (Response) obj;
                ChartboostMediationNetworkingResult.Companion companion = ChartboostMediationNetworkingResult.INSTANCE;
                NetworkError networkErrorTransform = NetworkErrorTransformer.INSTANCE.transform(response);
                if (!response.isSuccessful()) {
                    int iCode = response.code();
                    Headers headers = response.headers();
                    if (networkErrorTransform == null || (chartboostMediationError = networkErrorTransform.getChartboostMediationError()) == null) {
                        chartboostMediationError = ChartboostMediationError.CM_INTERNAL_ERROR;
                    }
                    return new ChartboostMediationNetworkingResult.Failure(iCode, headers, chartboostMediationError, null, 8, null);
                }
                try {
                    try {
                        int iCode2 = response.code();
                        Headers headers2 = response.headers();
                        Intrinsics.e(headers2, "response.headers()");
                        if (response.code() != 200) {
                            return new ChartboostMediationNetworkingResult.Success(iCode2, headers2, null);
                        }
                        HeliumJsonKt.getHeliumJson();
                        Intrinsics.l();
                        throw null;
                    } catch (SerializationException e2) {
                        Headers headers3 = response.headers();
                        Intrinsics.e(headers3, "response.headers()");
                        return new ChartboostMediationNetworkingResult.JsonParsingFailure(-1, headers3, ChartboostMediationError.CM_INTERNAL_ERROR, e2);
                    }
                } catch (Throwable th) {
                    return new ChartboostMediationNetworkingResult.Failure(-1, response.headers(), ChartboostMediationError.CM_INTERNAL_ERROR, th);
                }
            } catch (Throwable th2) {
                LogController.INSTANCE.e("Error making network request: " + th2.getMessage());
                return new ChartboostMediationNetworkingResult.Failure(-1, null, th2 instanceof UnknownHostException ? ChartboostMediationError.CM_NO_CONNECTIVITY : ChartboostMediationError.CM_UNKNOWN_ERROR, th2);
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            ChartboostMediationError chartboostMediationError;
            try {
                Response<T> response = (Response) this.$apiCall.invoke(this);
                ChartboostMediationNetworkingResult.Companion companion = ChartboostMediationNetworkingResult.INSTANCE;
                NetworkError networkErrorTransform = NetworkErrorTransformer.INSTANCE.transform(response);
                if (!response.isSuccessful()) {
                    int iCode = response.code();
                    Headers headers = response.headers();
                    if (networkErrorTransform == null || (chartboostMediationError = networkErrorTransform.getChartboostMediationError()) == null) {
                        chartboostMediationError = ChartboostMediationError.CM_INTERNAL_ERROR;
                    }
                    return new ChartboostMediationNetworkingResult.Failure(iCode, headers, chartboostMediationError, null, 8, null);
                }
                try {
                    int iCode2 = response.code();
                    Headers headers2 = response.headers();
                    Intrinsics.e(headers2, "response.headers()");
                    if (response.code() != 200) {
                        return new ChartboostMediationNetworkingResult.Success(iCode2, headers2, null);
                    }
                    HeliumJsonKt.getHeliumJson();
                    Intrinsics.l();
                    throw null;
                } catch (SerializationException e2) {
                    Headers headers3 = response.headers();
                    Intrinsics.e(headers3, "response.headers()");
                    return new ChartboostMediationNetworkingResult.JsonParsingFailure(-1, headers3, ChartboostMediationError.CM_INTERNAL_ERROR, e2);
                } catch (Throwable th) {
                    return new ChartboostMediationNetworkingResult.Failure(-1, response.headers(), ChartboostMediationError.CM_INTERNAL_ERROR, th);
                }
            } catch (Throwable th2) {
                LogController.INSTANCE.e("Error making network request: " + th2.getMessage());
                return new ChartboostMediationNetworkingResult.Failure(-1, null, th2 instanceof UnknownHostException ? ChartboostMediationError.CM_NO_CONNECTIVITY : ChartboostMediationError.CM_UNKNOWN_ERROR, th2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends T>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$trackAdLoad$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {185, 405}, m = "trackAdLoad")
    public static final class C09971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C09971(Continuation<? super C09971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.trackAdLoad(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$trackAdaptiveBannerSize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 405}, m = "trackAdaptiveBannerSize")
    public static final class C09981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C09981(Continuation<? super C09981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.trackAdaptiveBannerSize(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$trackChartboostImpression$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {115, 405}, m = "trackChartboostImpression")
    public static final class C09991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C09991(Continuation<? super C09991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.trackChartboostImpression(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$trackClick$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {148, 405}, m = "trackClick")
    public static final class C10001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C10001(Continuation<? super C10001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.trackClick(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$trackEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {204, 405}, m = "trackEvent")
    public static final class C10011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C10011(Continuation<? super C10011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.trackEvent(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$trackReward$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking", f = "ChartboostMediationNetworking.kt", l = {165, 405}, m = "trackReward")
    public static final class C10021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C10021(Continuation<? super C10021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationNetworking.this.trackReward(null, null, this);
        }
    }

    static {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new a(25));
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        defaultInterceptor = httpLoggingInterceptor;
        client = LazyKt.b(new Function0<OkHttpClient>() { // from class: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$client$2
            @Override // kotlin.jvm.functions.Function0
            public final OkHttpClient invoke() {
                OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(ChartboostMediationNetworking.defaultInterceptor);
                Interceptor interceptor = ChartboostMediationNetworking.customInterceptor;
                if (interceptor != null) {
                    builderAddInterceptor.addInterceptor(interceptor);
                }
                return builderAddInterceptor.build();
            }
        });
        retrofitInstance = LazyKt.b(new Function0<Retrofit>() { // from class: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$retrofitInstance$2
            @Override // kotlin.jvm.functions.Function0
            public final Retrofit invoke() {
                return new Retrofit.Builder().baseUrl(Endpoints.BASE_DOMAIN).client(ChartboostMediationNetworking.INSTANCE.getClient()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(ChartboostMediationNetworking.jsonConverter).build();
            }
        });
        api = LazyKt.b(new Function0<ChartboostMediationApi>() { // from class: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$api$2
            @Override // kotlin.jvm.functions.Function0
            public final ChartboostMediationApi invoke() {
                return (ChartboostMediationApi) ChartboostMediationNetworking.INSTANCE.getRetrofitInstance().create(ChartboostMediationApi.class);
            }
        });
    }

    private ChartboostMediationNetworking() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultInterceptor$lambda$0(String it) {
        Intrinsics.f(it, "it");
        if (LogController.INSTANCE.getLogLevel().getValue() < LogController.LogLevel.INFO.getValue()) {
            return;
        }
        Platform.log$default(Platform.INSTANCE.get(), it, 0, null, 6, null);
    }

    public static /* synthetic */ void getApi$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient getClient() {
        return (OkHttpClient) client.getX();
    }

    private static /* synthetic */ void getJsonConverter$annotations() {
    }

    public static /* synthetic */ void getRetrofitInstance$annotations() {
    }

    public static /* synthetic */ Object makeQueueRequest$default(ChartboostMediationNetworking chartboostMediationNetworking, boolean z2, String str, int i2, Integer num, int i3, String str2, Continuation continuation, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            num = null;
        }
        return chartboostMediationNetworking.makeQueueRequest(z2, str, i2, num, i3, str2, continuation);
    }

    public static /* synthetic */ Object trackAdLoad$default(ChartboostMediationNetworking chartboostMediationNetworking, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        return chartboostMediationNetworking.trackAdLoad(str, str2, str3, str4, str5, continuation);
    }

    public final ChartboostMediationApi getApi() {
        return (ChartboostMediationApi) api.getX();
    }

    public final Object getAppConfig(String str, String str2, String str3, Continuation<? super ChartboostMediationNetworkingResult<AppConfig>> continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return BuildersKt.f(DefaultIoScheduler.f45062Y, new ChartboostMediationNetworking$getAppConfig$$inlined$safeApiCall$1(null, str, str2, str3), continuation);
    }

    public final Retrofit getRetrofitInstance() {
        Object x = retrofitInstance.getX();
        Intrinsics.e(x, "<get-retrofitInstance>(...)");
        return (Retrofit) x;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object logAuctionWinner(Bids bids, String str, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
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
        Object objFetchAppSetId$Helium_release = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = bids;
            anonymousClass1.L$2 = str;
            anonymousClass1.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(anonymousClass1);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        str = (String) anonymousClass1.L$2;
        bids = (Bids) anonymousClass1.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$logAuctionWinner$$inlined$safeApiCall$1 chartboostMediationNetworking$logAuctionWinner$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$logAuctionWinner$$inlined$safeApiCall$1(null, bids, str, (String) objFetchAppSetId$Helium_release);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$logAuctionWinner$$inlined$safeApiCall$1, anonymousClass1);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object makeBidRequest(PrivacyController privacyController, PartnerController partnerController, AdLoadParams adLoadParams, Map<String, ? extends Map<String, String>> map, String str, int i2, Continuation<? super ChartboostMediationNetworkingResult<BidsResponse>> continuation) throws Throwable {
        C09941 c09941;
        AdLoadParams adLoadParams2;
        String str2;
        Object obj;
        BidRequestBody bidRequestBody;
        if (continuation instanceof C09941) {
            c09941 = (C09941) continuation;
            int i3 = c09941.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c09941.label = i3 - Integer.MIN_VALUE;
            } else {
                c09941 = new C09941(continuation);
            }
        } else {
            c09941 = new C09941(continuation);
        }
        Object obj2 = c09941.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i4 = c09941.label;
        if (i4 == 0) {
            ResultKt.b(obj2);
            adLoadParams2 = adLoadParams;
            BidRequestBody bidRequestBody2 = new BidRequestBody(adLoadParams2, partnerController, privacyController, i2, map);
            Environment environment = Environment.INSTANCE;
            c09941.L$0 = this;
            c09941.L$1 = adLoadParams2;
            str2 = str;
            c09941.L$2 = str2;
            c09941.L$3 = bidRequestBody2;
            c09941.label = 1;
            Object objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c09941);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
                obj = objFetchAppSetId$Helium_release;
                bidRequestBody = bidRequestBody2;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return obj2;
        }
        bidRequestBody = (BidRequestBody) c09941.L$3;
        String str3 = (String) c09941.L$2;
        AdLoadParams adLoadParams3 = (AdLoadParams) c09941.L$1;
        ResultKt.b(obj2);
        obj = obj2;
        str2 = str3;
        adLoadParams2 = adLoadParams3;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$makeBidRequest$$inlined$safeApiCall$1 chartboostMediationNetworking$makeBidRequest$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$makeBidRequest$$inlined$safeApiCall$1(null, str2, adLoadParams2, (String) obj, bidRequestBody);
        c09941.L$0 = null;
        c09941.L$1 = null;
        c09941.L$2 = null;
        c09941.L$3 = null;
        c09941.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$makeBidRequest$$inlined$safeApiCall$1, c09941);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object makeQueueRequest(boolean z2, String str, int i2, Integer num, int i3, String str2, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) throws Throwable {
        C09951 c09951;
        boolean z3;
        String str3;
        int i4;
        String str4;
        int i5;
        Integer num2;
        if (continuation instanceof C09951) {
            c09951 = (C09951) continuation;
            int i6 = c09951.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c09951.label = i6 - Integer.MIN_VALUE;
            } else {
                c09951 = new C09951(continuation);
            }
        } else {
            c09951 = new C09951(continuation);
        }
        Object objFetchAppSetId$Helium_release = c09951.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i7 = c09951.label;
        if (i7 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            c09951.L$0 = this;
            c09951.L$1 = str;
            c09951.L$2 = num;
            c09951.L$3 = str2;
            c09951.Z$0 = z2;
            c09951.I$0 = i2;
            c09951.I$1 = i3;
            c09951.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c09951);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
                z3 = z2;
                str3 = str2;
                i4 = i3;
                str4 = str;
                i5 = i2;
                num2 = num;
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        int i8 = c09951.I$1;
        int i9 = c09951.I$0;
        boolean z4 = c09951.Z$0;
        String str5 = (String) c09951.L$3;
        Integer num3 = (Integer) c09951.L$2;
        String str6 = (String) c09951.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        num2 = num3;
        str4 = str6;
        i4 = i8;
        i5 = i9;
        z3 = z4;
        str3 = str5;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1 chartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1(null, str4, num2, i5, i4, str3, z3, (String) objFetchAppSetId$Helium_release);
        c09951.L$0 = null;
        c09951.L$1 = null;
        c09951.L$2 = null;
        c09951.L$3 = null;
        c09951.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1, c09951);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00df  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        r0 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object makeRewardedCallbackRequest(com.chartboost.heliumsdk.domain.Bid r22, java.lang.String r23, com.chartboost.heliumsdk.domain.RewardedCallbackData r24, kotlin.coroutines.Continuation<? super com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult<kotlin.Unit>> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.heliumsdk.network.ChartboostMediationNetworking.makeRewardedCallbackRequest(com.chartboost.heliumsdk.domain.Bid, java.lang.String, com.chartboost.heliumsdk.domain.RewardedCallbackData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final <T> Object safeApiCall(Function1<? super Continuation<? super Response<String>>, ? extends Object> function1, Continuation<? super ChartboostMediationNetworkingResult<? extends T>> continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        Intrinsics.l();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object trackAdLoad(String str, String str2, String str3, String str4, String str5, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) throws Throwable {
        C09971 c09971;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (continuation instanceof C09971) {
            c09971 = (C09971) continuation;
            int i2 = c09971.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09971.label = i2 - Integer.MIN_VALUE;
            } else {
                c09971 = new C09971(continuation);
            }
        } else {
            c09971 = new C09971(continuation);
        }
        Object objFetchAppSetId$Helium_release = c09971.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09971.label;
        if (i3 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            c09971.L$0 = this;
            c09971.L$1 = str;
            c09971.L$2 = str2;
            str6 = str3;
            c09971.L$3 = str6;
            c09971.L$4 = str4;
            c09971.L$5 = str5;
            c09971.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c09971);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
                str7 = str2;
                str8 = str4;
                str9 = str5;
                str10 = str;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        String str11 = (String) c09971.L$5;
        String str12 = (String) c09971.L$4;
        str6 = (String) c09971.L$3;
        String str13 = (String) c09971.L$2;
        String str14 = (String) c09971.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        str9 = str11;
        str8 = str12;
        str7 = str13;
        str10 = str14;
        String str15 = str6;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$trackAdLoad$$inlined$safeApiCall$1 chartboostMediationNetworking$trackAdLoad$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$trackAdLoad$$inlined$safeApiCall$1(null, str10, str7, str15, str8, str9, (String) objFetchAppSetId$Helium_release);
        c09971.L$0 = null;
        c09971.L$1 = null;
        c09971.L$2 = null;
        c09971.L$3 = null;
        c09971.L$4 = null;
        c09971.L$5 = null;
        c09971.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$trackAdLoad$$inlined$safeApiCall$1, c09971);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object trackAdaptiveBannerSize(String str, BannerSizeBody bannerSizeBody, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) throws Throwable {
        C09981 c09981;
        if (continuation instanceof C09981) {
            c09981 = (C09981) continuation;
            int i2 = c09981.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09981.label = i2 - Integer.MIN_VALUE;
            } else {
                c09981 = new C09981(continuation);
            }
        } else {
            c09981 = new C09981(continuation);
        }
        Object objFetchAppSetId$Helium_release = c09981.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09981.label;
        if (i3 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            c09981.L$0 = this;
            c09981.L$1 = str;
            c09981.L$2 = bannerSizeBody;
            c09981.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c09981);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        bannerSizeBody = (BannerSizeBody) c09981.L$2;
        str = (String) c09981.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$trackAdaptiveBannerSize$$inlined$safeApiCall$1 chartboostMediationNetworking$trackAdaptiveBannerSize$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$trackAdaptiveBannerSize$$inlined$safeApiCall$1(null, str, (String) objFetchAppSetId$Helium_release, bannerSizeBody);
        c09981.L$0 = null;
        c09981.L$1 = null;
        c09981.L$2 = null;
        c09981.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$trackAdaptiveBannerSize$$inlined$safeApiCall$1, c09981);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object trackChartboostImpression(String str, String str2, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) throws Throwable {
        C09991 c09991;
        if (continuation instanceof C09991) {
            c09991 = (C09991) continuation;
            int i2 = c09991.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09991.label = i2 - Integer.MIN_VALUE;
            } else {
                c09991 = new C09991(continuation);
            }
        } else {
            c09991 = new C09991(continuation);
        }
        Object objFetchAppSetId$Helium_release = c09991.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09991.label;
        if (i3 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            c09991.L$0 = this;
            c09991.L$1 = str;
            c09991.L$2 = str2;
            c09991.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c09991);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        str2 = (String) c09991.L$2;
        str = (String) c09991.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$trackChartboostImpression$$inlined$safeApiCall$1 chartboostMediationNetworking$trackChartboostImpression$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$trackChartboostImpression$$inlined$safeApiCall$1(null, str, str2, (String) objFetchAppSetId$Helium_release);
        c09991.L$0 = null;
        c09991.L$1 = null;
        c09991.L$2 = null;
        c09991.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$trackChartboostImpression$$inlined$safeApiCall$1, c09991);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object trackClick(String str, String str2, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) throws Throwable {
        C10001 c10001;
        if (continuation instanceof C10001) {
            c10001 = (C10001) continuation;
            int i2 = c10001.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c10001.label = i2 - Integer.MIN_VALUE;
            } else {
                c10001 = new C10001(continuation);
            }
        } else {
            c10001 = new C10001(continuation);
        }
        Object objFetchAppSetId$Helium_release = c10001.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c10001.label;
        if (i3 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            c10001.L$0 = this;
            c10001.L$1 = str;
            c10001.L$2 = str2;
            c10001.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c10001);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        str2 = (String) c10001.L$2;
        str = (String) c10001.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$trackClick$$inlined$safeApiCall$1 chartboostMediationNetworking$trackClick$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$trackClick$$inlined$safeApiCall$1(null, str, str2, (String) objFetchAppSetId$Helium_release);
        c10001.L$0 = null;
        c10001.L$1 = null;
        c10001.L$2 = null;
        c10001.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$trackClick$$inlined$safeApiCall$1, c10001);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object trackEvent(Endpoints.Sdk.Event event, String str, String str2, MetricsRequestBody metricsRequestBody, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) {
        C10011 c10011;
        Endpoints.Sdk.Event event2;
        MetricsRequestBody metricsRequestBody2;
        if (continuation instanceof C10011) {
            c10011 = (C10011) continuation;
            int i2 = c10011.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c10011.label = i2 - Integer.MIN_VALUE;
            } else {
                c10011 = new C10011(continuation);
            }
        } else {
            c10011 = new C10011(continuation);
        }
        Object objFetchAppSetId$Helium_release = c10011.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c10011.label;
        if (i3 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            c10011.L$0 = this;
            c10011.L$1 = event;
            c10011.L$2 = str;
            c10011.L$3 = str2;
            c10011.L$4 = metricsRequestBody;
            c10011.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c10011);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
                event2 = event;
                metricsRequestBody2 = metricsRequestBody;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        MetricsRequestBody metricsRequestBody3 = (MetricsRequestBody) c10011.L$4;
        str2 = (String) c10011.L$3;
        str = (String) c10011.L$2;
        Endpoints.Sdk.Event event3 = (Endpoints.Sdk.Event) c10011.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        metricsRequestBody2 = metricsRequestBody3;
        event2 = event3;
        String str3 = str;
        String str4 = str2;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$trackEvent$$inlined$safeApiCall$1 chartboostMediationNetworking$trackEvent$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$trackEvent$$inlined$safeApiCall$1(null, event2, str3, (String) objFetchAppSetId$Helium_release, str4, metricsRequestBody2);
        c10011.L$0 = null;
        c10011.L$1 = null;
        c10011.L$2 = null;
        c10011.L$3 = null;
        c10011.L$4 = null;
        c10011.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$trackEvent$$inlined$safeApiCall$1, c10011);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    public final Object trackPartnerImpression(String str, String str2, String str3, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return BuildersKt.f(DefaultIoScheduler.f45062Y, new ChartboostMediationNetworking$trackPartnerImpression$$inlined$safeApiCall$1(null, str2, str3, str), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object trackReward(String str, String str2, Continuation<? super ChartboostMediationNetworkingResult<Unit>> continuation) throws Throwable {
        C10021 c10021;
        if (continuation instanceof C10021) {
            c10021 = (C10021) continuation;
            int i2 = c10021.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c10021.label = i2 - Integer.MIN_VALUE;
            } else {
                c10021 = new C10021(continuation);
            }
        } else {
            c10021 = new C10021(continuation);
        }
        Object objFetchAppSetId$Helium_release = c10021.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c10021.label;
        if (i3 == 0) {
            ResultKt.b(objFetchAppSetId$Helium_release);
            Environment environment = Environment.INSTANCE;
            c10021.L$0 = this;
            c10021.L$1 = str;
            c10021.L$2 = str2;
            c10021.label = 1;
            objFetchAppSetId$Helium_release = environment.fetchAppSetId$Helium_release(c10021);
            if (objFetchAppSetId$Helium_release != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objFetchAppSetId$Helium_release);
            return objFetchAppSetId$Helium_release;
        }
        str2 = (String) c10021.L$2;
        str = (String) c10021.L$1;
        ResultKt.b(objFetchAppSetId$Helium_release);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
        ChartboostMediationNetworking$trackReward$$inlined$safeApiCall$1 chartboostMediationNetworking$trackReward$$inlined$safeApiCall$1 = new ChartboostMediationNetworking$trackReward$$inlined$safeApiCall$1(null, str, str2, (String) objFetchAppSetId$Helium_release);
        c10021.L$0 = null;
        c10021.L$1 = null;
        c10021.L$2 = null;
        c10021.label = 2;
        Object objF = BuildersKt.f(defaultIoScheduler, chartboostMediationNetworking$trackReward$$inlined$safeApiCall$1, c10021);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
