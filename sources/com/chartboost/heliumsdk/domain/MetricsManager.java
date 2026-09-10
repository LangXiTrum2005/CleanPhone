package com.chartboost.heliumsdk.domain;

import android.util.Size;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.PartnerInitializationResultsData;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.network.model.BannerAdDimensions;
import com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult;
import com.chartboost.heliumsdk.network.model.MetricsData;
import com.chartboost.heliumsdk.network.model.MetricsRequestBody;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.chartboost.heliumsdk.utils.JsonTranslatorKt;
import com.chartboost.heliumsdk.utils.LogController;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Je\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u001f\u001a\u00020\u00192\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0016\u0010 \u001a\u00020\u00192\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002JU\u0010!\u001a\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010%J¥\u0001\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020\u001b2\b\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0002J\u0016\u0010\r\u001a\u00020\u00052\u0006\u00105\u001a\u0002062\u0006\u0010'\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsManager;", "", "()V", "eventsInProgress", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/chartboost/heliumsdk/domain/MetricsEvent;", "buildMetricsDataRequestBody", "Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;", "data", "", "Lcom/chartboost/heliumsdk/domain/Metrics;", "queueId", "start", "", TtmlNode.END, "duration", "backgroundDuration", "eventResult", "Lcom/chartboost/heliumsdk/domain/EventResult;", "buildMetricsDataRequestBody$Helium_release", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/chartboost/heliumsdk/domain/EventResult;)Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;", "", "id", "isSuccess", "", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getBannerAdDimensions", "Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;", "getEventInProgress", "metricsDataBelongsToSameEvent", "metricsDataIsValid", "postMetricsData", "loadId", "loadStart", "backgroundDurationMs", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/chartboost/heliumsdk/domain/EventResult;)V", "postMetricsDataForFailedEvent", "partner", "event", "Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "auctionIdentifier", "chartboostMediationError", "chartboostMediationErrorMessage", "placementType", "size", "Landroid/util/Size;", "networkType", "lineItemId", "partnerPlacement", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/EventResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "shouldPostMetricsData", "eventType", "Lcom/chartboost/heliumsdk/domain/MetricsEvent$EventType;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MetricsManager {
    public static final MetricsManager INSTANCE = new MetricsManager();
    private static final ConcurrentHashMap<String, MetricsEvent> eventsInProgress = new ConcurrentHashMap<>();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Endpoints.Sdk.Event.values().length];
            try {
                iArr[Endpoints.Sdk.Event.INITIALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.domain.MetricsManager$postMetricsData$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.domain.MetricsManager$postMetricsData$2", f = "MetricsManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ JSONObject $payload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JSONObject jSONObject, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$payload = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$payload, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getPartnerInitializationResults().onResultsReceived(new PartnerInitializationResultsData(this.$payload));
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.domain.MetricsManager$postMetricsData$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.domain.MetricsManager$postMetricsData$3", f = "MetricsManager.kt", l = {158}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Endpoints.Sdk.Event $event;
        final /* synthetic */ String $loadId;
        final /* synthetic */ MetricsRequestBody $metricsRequestBody;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX INFO: renamed from: com.chartboost.heliumsdk.domain.MetricsManager$postMetricsData$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.chartboost.heliumsdk.domain.MetricsManager$postMetricsData$3$1", f = "MetricsManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Endpoints.Sdk.Event $event;
            final /* synthetic */ ChartboostMediationNetworkingResult<Unit> $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChartboostMediationNetworkingResult<Unit> chartboostMediationNetworkingResult, Endpoints.Sdk.Event event, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = chartboostMediationNetworkingResult;
                this.$event = event;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$result, this.$event, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                ChartboostMediationNetworkingResult<Unit> chartboostMediationNetworkingResult = this.$result;
                if (chartboostMediationNetworkingResult instanceof ChartboostMediationNetworkingResult.Success) {
                    LogController.INSTANCE.i("Successfully posted metrics data for the " + this.$event + " lifecycle event");
                } else if (chartboostMediationNetworkingResult instanceof ChartboostMediationNetworkingResult.JsonParsingFailure) {
                    LogController.INSTANCE.e("Failed to post metrics data for the " + this.$event + " lifecycle event: " + ((ChartboostMediationNetworkingResult.JsonParsingFailure) this.$result).getError());
                } else if (chartboostMediationNetworkingResult instanceof ChartboostMediationNetworkingResult.Failure) {
                    LogController.INSTANCE.e("Failed to post metrics data for the " + this.$event + " lifecycle event: " + ((ChartboostMediationNetworkingResult.Failure) this.$result).getError());
                }
                return Unit.f43263a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Endpoints.Sdk.Event event, String str, String str2, MetricsRequestBody metricsRequestBody, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$event = event;
            this.$loadId = str;
            this.$queueId = str2;
            this.$metricsRequestBody = metricsRequestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$event, this.$loadId, this.$queueId, this.$metricsRequestBody, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass3 anonymousClass3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                ChartboostMediationNetworking chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
                Endpoints.Sdk.Event event = this.$event;
                String str = this.$loadId;
                String str2 = this.$queueId;
                MetricsRequestBody metricsRequestBody = this.$metricsRequestBody;
                this.label = 1;
                anonymousClass3 = this;
                obj = chartboostMediationNetworking.trackEvent(event, str, str2, metricsRequestBody, anonymousClass3);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                anonymousClass3 = this;
            }
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new AnonymousClass1((ChartboostMediationNetworkingResult) obj, anonymousClass3.$event, null), 3);
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    private MetricsManager() {
    }

    public static /* synthetic */ void end$default(MetricsManager metricsManager, String str, boolean z2, ChartboostMediationError chartboostMediationError, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            chartboostMediationError = null;
        }
        metricsManager.end(str, z2, chartboostMediationError);
    }

    private final BannerAdDimensions getBannerAdDimensions(Set<Metrics> data) {
        Size size;
        Metrics metrics = (Metrics) CollectionsKt.x(data);
        if (metrics == null || (size = metrics.getSize()) == null) {
            return null;
        }
        return new BannerAdDimensions(size);
    }

    private final boolean metricsDataBelongsToSameEvent(Set<Metrics> data) {
        if (data != null && data.isEmpty()) {
            return true;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            Endpoints.Sdk.Event event = ((Metrics) it.next()).getEvent();
            Metrics metrics = (Metrics) CollectionsKt.x(data);
            if (event != (metrics != null ? metrics.getEvent() : null)) {
                return false;
            }
        }
        return true;
    }

    private final boolean metricsDataIsValid(Set<Metrics> data) {
        if (data.isEmpty()) {
            LogController.INSTANCE.d("Failed to post metrics data to the server. Data set is empty.");
            return false;
        }
        if (metricsDataBelongsToSameEvent(data)) {
            return true;
        }
        LogController.INSTANCE.d("Failed to post metrics data to the server. Data set contains metrics data for multiple events.");
        return false;
    }

    public static /* synthetic */ void postMetricsData$default(MetricsManager metricsManager, Set set, String str, String str2, Long l2, Long l3, EventResult eventResult, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            l2 = null;
        }
        if ((i2 & 16) != 0) {
            l3 = null;
        }
        if ((i2 & 32) != 0) {
            eventResult = null;
        }
        metricsManager.postMetricsData(set, str, str2, l2, l3, eventResult);
    }

    private final boolean shouldPostMetricsData(Endpoints.Sdk.Event event) {
        return AppConfigStorage.INSTANCE.getMetricsEvents().contains(event);
    }

    public final MetricsRequestBody buildMetricsDataRequestBody$Helium_release(Set<Metrics> data, String queueId, Long start, Long end, Long duration, Long backgroundDuration, EventResult eventResult) {
        Intrinsics.f(data, "data");
        if (eventResult instanceof EventResult.SdkInitializationResult.InitResult1A) {
            String initResultCode = ((EventResult.SdkInitializationResult.InitResult1A) eventResult).getInitResultCode();
            ArrayList arrayList = new ArrayList(CollectionsKt.n(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(new MetricsData((Metrics) it.next()));
            }
            return new MetricsRequestBody((String) null, (String) null, (String) null, (BannerAdDimensions) null, (Long) null, (Long) null, (Long) null, (Long) null, initResultCode, CollectionsKt.l0(arrayList), (MetricsError) null, 1279, (DefaultConstructorMarker) null);
        }
        if (eventResult instanceof EventResult.SdkInitializationResult.InitResult2A) {
            String initResultCode2 = ((EventResult.SdkInitializationResult.InitResult2A) eventResult).getInitResultCode();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(data, 10));
            Iterator<T> it2 = data.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new MetricsData((Metrics) it2.next()));
            }
            return new MetricsRequestBody((String) null, (String) null, (String) null, (BannerAdDimensions) null, (Long) null, (Long) null, (Long) null, (Long) null, initResultCode2, CollectionsKt.l0(arrayList2), (MetricsError) null, 1279, (DefaultConstructorMarker) null);
        }
        boolean z2 = eventResult instanceof EventResult.SdkInitializationResult.InitResult1B;
        EmptySet emptySet = EmptySet.X;
        if (z2) {
            EventResult.SdkInitializationResult.InitResult1B initResult1B = (EventResult.SdkInitializationResult.InitResult1B) eventResult;
            return new MetricsRequestBody((String) null, (String) null, (String) null, (BannerAdDimensions) null, (Long) null, (Long) null, (Long) null, (Long) null, initResult1B.getInitResultCode(), emptySet, initResult1B.getJsonParseError(), 255, (DefaultConstructorMarker) null);
        }
        if (eventResult instanceof EventResult.SdkInitializationResult.InitResult2B) {
            EventResult.SdkInitializationResult.InitResult2B initResult2B = (EventResult.SdkInitializationResult.InitResult2B) eventResult;
            String initResultCode3 = initResult2B.getInitResultCode();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.n(data, 10));
            Iterator<T> it3 = data.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new MetricsData((Metrics) it3.next()));
            }
            return new MetricsRequestBody((String) null, (String) null, (String) null, (BannerAdDimensions) null, (Long) null, (Long) null, (Long) null, (Long) null, initResultCode3, CollectionsKt.l0(arrayList3), initResult2B.getJsonParseError(), 255, (DefaultConstructorMarker) null);
        }
        if (eventResult instanceof EventResult.AdLoadResult.AdLoadSuccess) {
            Metrics metrics = (Metrics) CollectionsKt.x(data);
            String auctionId = metrics != null ? metrics.getAuctionId() : null;
            Metrics metrics2 = (Metrics) CollectionsKt.x(data);
            String placementType = metrics2 != null ? metrics2.getPlacementType() : null;
            BannerAdDimensions bannerAdDimensions = getBannerAdDimensions(data);
            ArrayList arrayList4 = new ArrayList(CollectionsKt.n(data, 10));
            Iterator<T> it4 = data.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new MetricsData((Metrics) it4.next()));
            }
            return new MetricsRequestBody(auctionId, queueId, placementType, bannerAdDimensions, start, end, duration, backgroundDuration, (String) null, CollectionsKt.l0(arrayList4), (MetricsError) null, 1280, (DefaultConstructorMarker) null);
        }
        if (eventResult instanceof EventResult.AdLoadResult.AdLoadJsonFailure) {
            String placementType2 = null;
            Metrics metrics3 = (Metrics) CollectionsKt.x(data);
            String auctionId2 = metrics3 != null ? metrics3.getAuctionId() : null;
            Metrics metrics4 = (Metrics) CollectionsKt.x(data);
            if (metrics4 != null) {
                placementType2 = metrics4.getPlacementType();
            }
            return new MetricsRequestBody(auctionId2, (String) null, placementType2, getBannerAdDimensions(data), start, end, duration, backgroundDuration, (String) null, emptySet, ((EventResult.AdLoadResult.AdLoadJsonFailure) eventResult).getJsonParseError(), 258, (DefaultConstructorMarker) null);
        }
        String placementType3 = null;
        if (eventResult instanceof EventResult.AdLoadResult.AdLoadPartnerFailure) {
            Metrics metrics5 = (Metrics) CollectionsKt.x(data);
            String auctionId3 = metrics5 != null ? metrics5.getAuctionId() : null;
            Metrics metrics6 = (Metrics) CollectionsKt.x(data);
            String placementType4 = metrics6 != null ? metrics6.getPlacementType() : null;
            BannerAdDimensions bannerAdDimensions2 = getBannerAdDimensions(data);
            ArrayList arrayList5 = new ArrayList(CollectionsKt.n(data, 10));
            Iterator<T> it5 = data.iterator();
            while (it5.hasNext()) {
                arrayList5.add(new MetricsData((Metrics) it5.next()));
            }
            return new MetricsRequestBody(auctionId3, (String) null, placementType4, bannerAdDimensions2, start, end, duration, backgroundDuration, (String) null, CollectionsKt.l0(arrayList5), ((EventResult.AdLoadResult.AdLoadPartnerFailure) eventResult).getMetricsError(), 258, (DefaultConstructorMarker) null);
        }
        if (eventResult instanceof EventResult.AdLoadResult.AdLoadUnspecifiedFailure) {
            Metrics metrics7 = (Metrics) CollectionsKt.x(data);
            String auctionId4 = metrics7 != null ? metrics7.getAuctionId() : null;
            Metrics metrics8 = (Metrics) CollectionsKt.x(data);
            if (metrics8 != null) {
                placementType3 = metrics8.getPlacementType();
            }
            return new MetricsRequestBody(auctionId4, (String) null, placementType3, getBannerAdDimensions(data), start, end, duration, backgroundDuration, (String) null, emptySet, ((EventResult.AdLoadResult.AdLoadUnspecifiedFailure) eventResult).getMetricsError(), 258, (DefaultConstructorMarker) null);
        }
        Metrics metrics9 = (Metrics) CollectionsKt.x(data);
        String auctionId5 = metrics9 != null ? metrics9.getAuctionId() : null;
        Metrics metrics10 = (Metrics) CollectionsKt.x(data);
        String placementType5 = metrics10 != null ? metrics10.getPlacementType() : null;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.n(data, 10));
        Iterator<T> it6 = data.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new MetricsData((Metrics) it6.next()));
        }
        return new MetricsRequestBody(auctionId5, (String) null, placementType5, getBannerAdDimensions(data), (Long) null, (Long) null, (Long) null, (Long) null, (String) null, CollectionsKt.l0(arrayList6), (MetricsError) null, 1522, (DefaultConstructorMarker) null);
    }

    public final void end(String id, boolean isSuccess, ChartboostMediationError error) {
        Intrinsics.f(id, "id");
        ConcurrentHashMap<String, MetricsEvent> concurrentHashMap = eventsInProgress;
        MetricsEvent metricsEvent = concurrentHashMap.get(id);
        if (metricsEvent != null) {
            metricsEvent.setEndTimestamp(System.currentTimeMillis());
            metricsEvent.setSuccess(isSuccess);
            metricsEvent.setError(error);
            concurrentHashMap.remove(id);
        }
    }

    public final MetricsEvent getEventInProgress(String id) {
        Intrinsics.f(id, "id");
        return eventsInProgress.get(id);
    }

    public final void postMetricsData(Set<Metrics> data, String loadId, String queueId, Long loadStart, Long backgroundDurationMs, EventResult eventResult) {
        Long l2;
        Long l3;
        Intrinsics.f(data, "data");
        if (metricsDataIsValid(data)) {
            if (loadStart != null) {
                long jLongValue = loadStart.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                Long lValueOf2 = Long.valueOf(jCurrentTimeMillis - jLongValue);
                l2 = lValueOf;
                l3 = lValueOf2;
            } else {
                l2 = null;
                l3 = null;
            }
            MetricsRequestBody metricsRequestBodyBuildMetricsDataRequestBody$Helium_release = buildMetricsDataRequestBody$Helium_release(data, queueId, loadStart, l2, l3, backgroundDurationMs, eventResult);
            Endpoints.Sdk.Event event = ((Metrics) CollectionsKt.v(data)).getEvent();
            JSONObject jSONObject = JsonTranslatorKt.toJSONObject(JsonElementKt.getJsonObject(TreeJsonEncoderKt.writeJson(HeliumJsonKt.getHeliumJson(), metricsRequestBodyBuildMetricsDataRequestBody$Helium_release, MetricsRequestBody.INSTANCE.serializer())));
            LogController.INSTANCE.d("Metrics data for the " + event + " lifecycle event: " + jSONObject);
            if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new AnonymousClass2(jSONObject, null), 3);
            }
            if (shouldPostMetricsData(event)) {
                DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new AnonymousClass3(event, loadId, queueId, metricsRequestBodyBuildMetricsDataRequestBody$Helium_release, null), 3);
            }
        }
    }

    public final void postMetricsDataForFailedEvent(String partner, Endpoints.Sdk.Event event, String auctionIdentifier, ChartboostMediationError chartboostMediationError, String chartboostMediationErrorMessage, String placementType, Size size, Long loadStart, Long backgroundDuration, String loadId, EventResult eventResult, String networkType, String lineItemId, String partnerPlacement) {
        Intrinsics.f(event, "event");
        Intrinsics.f(chartboostMediationError, "chartboostMediationError");
        Metrics metrics = new Metrics(partner, event);
        metrics.setStart(Long.valueOf(System.currentTimeMillis()));
        metrics.setEnd(Long.valueOf(System.currentTimeMillis()));
        metrics.setDuration(0L);
        metrics.setAuctionId(auctionIdentifier);
        metrics.setPlacementType(placementType);
        metrics.setNetworkType(networkType);
        metrics.setLineItemId(lineItemId);
        metrics.setPartnerPlacement(partnerPlacement);
        metrics.setSize(size);
        metrics.setSuccess(false);
        metrics.setChartboostMediationError(chartboostMediationError);
        metrics.setChartboostMediationErrorMessage(chartboostMediationErrorMessage);
        postMetricsData$default(this, SetsKt.h(metrics), loadId, null, loadStart, backgroundDuration, eventResult, 4, null);
    }

    public final String start(MetricsEvent.EventType eventType, String partner) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(partner, "partner");
        String string = UUID.randomUUID().toString();
        Intrinsics.e(string, "randomUUID().toString()");
        eventsInProgress.put(string, new MetricsEvent(eventType, partner));
        return string;
    }
}
