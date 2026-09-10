package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import android.support.v4.media.a;
import android.util.Size;
import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.PartnerConsents;
import com.chartboost.heliumsdk.domain.AdFormat;
import com.chartboost.heliumsdk.domain.AdInteractionListener;
import com.chartboost.heliumsdk.domain.AdapterInfo;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.EventResult;
import com.chartboost.heliumsdk.domain.GdprConsentStatus;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsError;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdListener;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import com.chartboost.heliumsdk.domain.PartnerConfiguration;
import com.chartboost.heliumsdk.domain.PreBidRequest;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.utils.LogController;
import com.p004ironsource.ne;
import com.p004ironsource.x4;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 d2\u00020\u0001:\u0003defB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002J&\u0010$\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0002\u0010*J.\u0010+\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190&2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0002\u0010-J&\u0010.\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0002\u0010*J%\u0010/\u001a\u0002002\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000102\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u00103J9\u00104\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000505052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010:J\u000e\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020'Jd\u0010=\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u00106\u001a\u0002072\u0006\u0010 \u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u00052\u0006\u0010?\u001a\u0002002\u0006\u00108\u001a\u00020@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020)0B2\b\u0010C\u001a\u0004\u0018\u00010\u0005H\u0080@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ3\u0010F\u001a\u00020G2\u0006\u00106\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010'2\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010JJ-\u0010K\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\b\u0010L\u001a\u0004\u0018\u0001002\u0006\u0010M\u001a\u00020\u00052\u0006\u0010N\u001a\u00020O¢\u0006\u0002\u0010PJ-\u0010Q\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\b\u0010R\u001a\u0004\u0018\u0001002\u0006\u0010S\u001a\u00020T2\u0006\u0010N\u001a\u00020O¢\u0006\u0002\u0010UJ1\u0010V\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\u0006\u0010,\u001a\u00020\u00062\u0006\u0010W\u001a\u00020X2\u0006\u0010(\u001a\u00020)H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010YJ\u0010\u0010Z\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0006H\u0002JT\u0010[\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020X052\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b2\u0014\u0010_\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010a\u0012\u0004\u0012\u00020\u00190`J\u0016\u0010b\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\u0006\u0010c\u001a\u000200R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/PartnerController;", "", "()V", "adapters", "", "", "Lcom/chartboost/heliumsdk/domain/PartnerAdapter;", "getAdapters", "()Ljava/util/Map;", "setAdapters", "(Ljava/util/Map;)V", "allAdapterInfo", "", "Lcom/chartboost/heliumsdk/domain/AdapterInfo;", "getAllAdapterInfo", "()Ljava/util/List;", "initStatuses", "Lcom/chartboost/heliumsdk/controllers/PartnerController$PartnerInitializationStatus;", "getInitStatuses", "setInitStatuses", "prebidFetchTimeoutMs", "", "getPrebidFetchTimeoutMs", "()J", "createAdapters", "", "classNames", "", "createPartnerAdListener", "Lcom/chartboost/heliumsdk/domain/PartnerAdListener;", "adInteractionListener", "Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "auctionId", "getLoadTimeoutMs", "format", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "handleLoadResult", "result", "Lkotlin/Result;", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "metrics", "Lcom/chartboost/heliumsdk/domain/Metrics;", "(Ljava/lang/Object;Lcom/chartboost/heliumsdk/domain/Metrics;)V", "handleSetupResult", ne.E1, "(Ljava/lang/Object;Lcom/chartboost/heliumsdk/domain/PartnerAdapter;Lcom/chartboost/heliumsdk/domain/Metrics;)V", "handleShowResult", "requiredDataIsValid", "", "data", "", "([Ljava/lang/Object;)Z", "routeGetBidderInformation", "", "context", "Landroid/content/Context;", "request", "Lcom/chartboost/heliumsdk/domain/PreBidRequest;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PreBidRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "routeInvalidate", "partnerAd", "routeLoad", "lineItemId", "isMediation", "Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", "loadMetricsSet", "", "placementType", "routeLoad-eH_QyT8$Helium_release", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;Ljava/util/Set;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "routeShow", "Lcom/chartboost/heliumsdk/controllers/PartnerController$PartnerShowResult;", "auctionIdentifier", "loadId", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerAd;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCcpaConsent", "hasGrantedCcpaConsent", "privacyString", "partnerConsents", "Lcom/chartboost/heliumsdk/PartnerConsents;", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/String;Lcom/chartboost/heliumsdk/PartnerConsents;)V", "setGdpr", "applies", "status", "Lcom/chartboost/heliumsdk/domain/GdprConsentStatus;", "(Landroid/content/Context;Ljava/lang/Boolean;Lcom/chartboost/heliumsdk/domain/GdprConsentStatus;Lcom/chartboost/heliumsdk/PartnerConsents;)V", "setUp", "partnerConfiguration", "Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerAdapter;Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;Lcom/chartboost/heliumsdk/domain/Metrics;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUpAdapterInfo", "setUpAdapters", "partnerConfigurationMap", "adapterClasses", "skippedPartnerIds", "onPartnerInitializationComplete", "Lkotlin/Function1;", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "setUserSubjectToCoppa", "isSubjectToCoppa", "Companion", "PartnerInitializationStatus", "PartnerShowResult", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Map<String, AdapterInfo> adapterInfo = new LinkedHashMap();
    private Map<String, PartnerAdapter> adapters = new ConcurrentHashMap();
    private Map<String, PartnerInitializationStatus> initStatuses = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/PartnerController$Companion;", "", "()V", "adapterInfo", "", "", "Lcom/chartboost/heliumsdk/domain/AdapterInfo;", "getAdapterInfo", "()Ljava/util/Map;", "setAdapterInfo", "(Ljava/util/Map;)V", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, AdapterInfo> getAdapterInfo() {
            return PartnerController.adapterInfo;
        }

        public final void setAdapterInfo(Map<String, AdapterInfo> map) {
            Intrinsics.f(map, "<set-?>");
            PartnerController.adapterInfo = map;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/PartnerController$PartnerInitializationStatus;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "IDLE", "INITIALIZING", "INITIALIZED", "FAILED", "SKIPPED", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PartnerInitializationStatus {
        IDLE(0),
        INITIALIZING(1),
        INITIALIZED(2),
        FAILED(3),
        SKIPPED(4);

        private final int value;

        PartnerInitializationStatus(int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/PartnerController$PartnerShowResult;", "", "partnerAd", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "metrics", "", "Lcom/chartboost/heliumsdk/domain/Metrics;", "(Lcom/chartboost/heliumsdk/domain/PartnerAd;Ljava/util/Set;)V", "getMetrics", "()Ljava/util/Set;", "getPartnerAd", "()Lcom/chartboost/heliumsdk/domain/PartnerAd;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PartnerShowResult {
        private final Set<Metrics> metrics;
        private final PartnerAd partnerAd;

        public PartnerShowResult(PartnerAd partnerAd, Set<Metrics> metrics) {
            Intrinsics.f(metrics, "metrics");
            this.partnerAd = partnerAd;
            this.metrics = metrics;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PartnerShowResult copy$default(PartnerShowResult partnerShowResult, PartnerAd partnerAd, Set set, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                partnerAd = partnerShowResult.partnerAd;
            }
            if ((i2 & 2) != 0) {
                set = partnerShowResult.metrics;
            }
            return partnerShowResult.copy(partnerAd, set);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PartnerAd getPartnerAd() {
            return this.partnerAd;
        }

        public final Set<Metrics> component2() {
            return this.metrics;
        }

        public final PartnerShowResult copy(PartnerAd partnerAd, Set<Metrics> metrics) {
            Intrinsics.f(metrics, "metrics");
            return new PartnerShowResult(partnerAd, metrics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PartnerShowResult)) {
                return false;
            }
            PartnerShowResult partnerShowResult = (PartnerShowResult) other;
            return Intrinsics.a(this.partnerAd, partnerShowResult.partnerAd) && Intrinsics.a(this.metrics, partnerShowResult.metrics);
        }

        public final Set<Metrics> getMetrics() {
            return this.metrics;
        }

        public final PartnerAd getPartnerAd() {
            return this.partnerAd;
        }

        public int hashCode() {
            PartnerAd partnerAd = this.partnerAd;
            return this.metrics.hashCode() + ((partnerAd == null ? 0 : partnerAd.hashCode()) * 31);
        }

        public String toString() {
            return "PartnerShowResult(partnerAd=" + this.partnerAd + ", metrics=" + this.metrics + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdFormat.ADAPTIVE_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdFormat.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdFormat.REWARDED_INTERSTITIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$routeGetBidderInformation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController", f = "PartnerController.kt", l = {409}, m = "routeGetBidderInformation")
    public static final class C09881 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C09881(Continuation<? super C09881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerController.this.routeGetBidderInformation(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$routeShow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController", f = "PartnerController.kt", l = {684}, m = "routeShow")
    public static final class C09891 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C09891(Continuation<? super C09891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerController.this.routeShow(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$setUp$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController", f = "PartnerController.kt", l = {748}, m = "setUp")
    public static final class C09901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C09901(Continuation<? super C09901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PartnerController.this.setUp(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$setUpAdapters$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$setUpAdapters$3", f = "PartnerController.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.BooleanRef $initCompletionReported;
        final /* synthetic */ Function1<ChartboostMediationError, Unit> $onPartnerInitializationComplete;
        final /* synthetic */ Map<String, PartnerConfiguration> $partnerConfigurationMap;
        final /* synthetic */ Ref.ObjectRef<ChartboostMediationError> $setUpError;
        final /* synthetic */ Set<String> $skippedPartnerIds;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PartnerController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Set<String> set, PartnerController partnerController, Ref.BooleanRef booleanRef, Function1<? super ChartboostMediationError, Unit> function1, Ref.ObjectRef<ChartboostMediationError> objectRef, Map<String, PartnerConfiguration> map, Context context, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$skippedPartnerIds = set;
            this.this$0 = partnerController;
            this.$initCompletionReported = booleanRef;
            this.$onPartnerInitializationComplete = function1;
            this.$setUpError = objectRef;
            this.$partnerConfigurationMap = map;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$skippedPartnerIds, this.this$0, this.$initCompletionReported, this.$onPartnerInitializationComplete, this.$setUpError, this.$partnerConfigurationMap, this.$context, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TimerTask timerTask;
            Long l2;
            String partnerSdkVersion;
            String adapterVersion;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Timer timer = new Timer();
                long partnerInitTimeoutSeconds = ((long) AppConfigStorage.INSTANCE.getPartnerInitTimeoutSeconds()) * 1000;
                final Ref.BooleanRef booleanRef = this.$initCompletionReported;
                final Function1<ChartboostMediationError, Unit> function1 = this.$onPartnerInitializationComplete;
                final Ref.ObjectRef<ChartboostMediationError> objectRef = this.$setUpError;
                TimerTask timerTask2 = new TimerTask() { // from class: com.chartboost.heliumsdk.controllers.PartnerController$setUpAdapters$3$invokeSuspend$$inlined$schedule$1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        if (booleanRef.X) {
                            return;
                        }
                        cancel();
                        booleanRef.X = true;
                        function1.invoke(objectRef.X);
                    }
                };
                timer.schedule(timerTask2, partnerInitTimeoutSeconds);
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                Set<String> set = this.$skippedPartnerIds;
                PartnerController partnerController = this.this$0;
                for (String str : set) {
                    Metrics metrics = new Metrics(str, Endpoints.Sdk.Event.INITIALIZATION);
                    linkedHashSet.add(metrics);
                    partnerController.getInitStatuses().put(str, PartnerInitializationStatus.SKIPPED);
                    metrics.setStart(new Long(System.currentTimeMillis()));
                    metrics.setEnd(new Long(System.currentTimeMillis()));
                    Long end = metrics.getEnd();
                    if (end != null) {
                        long jLongValue = end.longValue();
                        Long start = metrics.getStart();
                        l2 = new Long(jLongValue - (start != null ? start.longValue() : 0L));
                    } else {
                        l2 = new Long(0L);
                    }
                    metrics.setDuration(l2);
                    PartnerAdapter partnerAdapter = partnerController.getAdapters().get(str);
                    String str2 = "";
                    if (partnerAdapter == null || (partnerSdkVersion = partnerAdapter.getPartnerSdkVersion()) == null) {
                        partnerSdkVersion = "";
                    }
                    metrics.setPartnerSdkVersion(partnerSdkVersion);
                    PartnerAdapter partnerAdapter2 = partnerController.getAdapters().get(str);
                    if (partnerAdapter2 != null && (adapterVersion = partnerAdapter2.getAdapterVersion()) != null) {
                        str2 = adapterVersion;
                    }
                    metrics.setPartnerAdapterVersion(str2);
                    ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_INITIALIZATION_SKIPPED;
                    metrics.setChartboostMediationError(chartboostMediationError);
                    metrics.setChartboostMediationErrorMessage(chartboostMediationError.getMessage());
                    partnerController.getAdapters().remove(str);
                }
                new Timer().schedule(new TimerTask() { // from class: com.chartboost.heliumsdk.controllers.PartnerController$setUpAdapters$3$invokeSuspend$$inlined$schedule$2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        EventResult initResult2B;
                        MetricsManager metricsManager = MetricsManager.INSTANCE;
                        Set set2 = linkedHashSet;
                        AppConfigStorage appConfigStorage = AppConfigStorage.INSTANCE;
                        MetricsError.JsonParseError parsingError = appConfigStorage.getParsingError();
                        if (parsingError != null) {
                            initResult2B = new EventResult.SdkInitializationResult.InitResult2B(parsingError);
                        } else {
                            initResult2B = appConfigStorage.getValidCachedConfigExists() ? EventResult.SdkInitializationResult.InitResult2A.INSTANCE : EventResult.SdkInitializationResult.InitResult1A.INSTANCE;
                        }
                        MetricsManager.postMetricsData$default(metricsManager, set2, null, null, null, null, initResult2B, 30, null);
                        cancel();
                    }
                }, ((long) AppConfigStorage.INSTANCE.getInitializationMetricsPostTimeout()) * 1000);
                Set<String> setKeySet = this.this$0.getAdapters().keySet();
                PartnerController partnerController2 = this.this$0;
                Map<String, PartnerConfiguration> map = this.$partnerConfigurationMap;
                Context context = this.$context;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(setKeySet, 10));
                for (String str3 : setKeySet) {
                    Metrics metrics2 = new Metrics(str3, Endpoints.Sdk.Event.INITIALIZATION);
                    linkedHashSet.add(metrics2);
                    Map<String, PartnerConfiguration> map2 = map;
                    Context context2 = context;
                    arrayList.add(BuildersKt.a(coroutineScope, null, new PartnerController$setUpAdapters$3$3$1(partnerController2, str3, map2, metrics2, context2, null), 3));
                    map = map2;
                    context = context2;
                }
                this.L$0 = timerTask2;
                this.label = 1;
                if (AwaitKt.a(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                timerTask = timerTask2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                timerTask = (TimerTask) this.L$0;
                ResultKt.b(obj);
            }
            if (!this.$initCompletionReported.X) {
                timerTask.cancel();
                this.$initCompletionReported.X = true;
                this.$onPartnerInitializationComplete.invoke(this.$setUpError.X);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    private final void createAdapters(Set<String> classNames) {
        for (String str : classNames) {
            try {
                Object objNewInstance = Class.forName(str).newInstance();
                Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.chartboost.heliumsdk.domain.PartnerAdapter");
                PartnerAdapter partnerAdapter = (PartnerAdapter) objNewInstance;
                this.adapters.put(partnerAdapter.getPartnerId(), partnerAdapter);
                this.initStatuses.put(partnerAdapter.getPartnerId(), PartnerInitializationStatus.IDLE);
            } catch (Exception e2) {
                LogController logController = LogController.INSTANCE;
                StringBuilder sbY = a.y("Failed to create adapter ", str, ". Error: ");
                sbY.append(e2.getMessage());
                sbY.append(".The associated network will not be initialized.");
                logController.e(sbY.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PartnerAdListener createPartnerAdListener(final AdInteractionListener adInteractionListener, final String auctionId) {
        return new PartnerAdListener() { // from class: com.chartboost.heliumsdk.controllers.PartnerController.createPartnerAdListener.1
            @Override // com.chartboost.heliumsdk.domain.PartnerAdListener
            public void onPartnerAdClicked(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onClicked(partnerAd);
            }

            @Override // com.chartboost.heliumsdk.domain.PartnerAdListener
            public void onPartnerAdDismissed(PartnerAd partnerAd, ChartboostMediationAdException error) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onDismissed(partnerAd, error);
            }

            @Override // com.chartboost.heliumsdk.domain.PartnerAdListener
            public void onPartnerAdExpired(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onExpired(partnerAd);
                MetricsManager metricsManager = MetricsManager.INSTANCE;
                Metrics metrics = new Metrics(partnerAd.getRequest().getPartnerId(), Endpoints.Sdk.Event.EXPIRATION);
                metrics.setAuctionId(auctionId);
                MetricsManager.postMetricsData$default(metricsManager, SetsKt.h(metrics), null, null, null, null, null, 62, null);
            }

            @Override // com.chartboost.heliumsdk.domain.PartnerAdListener
            public void onPartnerAdImpression(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onImpressionTracked(partnerAd);
            }

            @Override // com.chartboost.heliumsdk.domain.PartnerAdListener
            public void onPartnerAdRewarded(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onRewarded(partnerAd);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getLoadTimeoutMs(AdFormat format) {
        int bannerLoadTimeoutSeconds;
        int i2 = WhenMappings.$EnumSwitchMapping$0[format.ordinal()];
        if (i2 == 1 || i2 == 2) {
            bannerLoadTimeoutSeconds = AppConfigStorage.INSTANCE.getBannerLoadTimeoutSeconds();
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            bannerLoadTimeoutSeconds = AppConfigStorage.INSTANCE.getFullscreenLoadTimeoutSeconds();
        } else {
            LogController.INSTANCE.e("Unknown ad format: " + format + ". Using default timeout.");
            bannerLoadTimeoutSeconds = AppConfigStorage.INSTANCE.getFullscreenLoadTimeoutSeconds();
        }
        return ((long) bannerLoadTimeoutSeconds) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getPrebidFetchTimeoutMs() {
        return AppConfigStorage.INSTANCE.getPrebidFetchTimeoutSeconds() * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoadResult(Object result, Metrics metrics) {
        ChartboostMediationError chartboostMediationError;
        metrics.setEnd(Long.valueOf(System.currentTimeMillis()));
        boolean z2 = result instanceof Result.Failure;
        metrics.setSuccess(!z2);
        if (z2) {
            Throwable thA = Result.a(result);
            ChartboostMediationAdException chartboostMediationAdException = thA instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) thA : null;
            if (chartboostMediationAdException == null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
                chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_UNKNOWN;
            }
            metrics.setChartboostMediationError(chartboostMediationError);
            metrics.setChartboostMediationErrorMessage(chartboostMediationError.getMessage());
        }
    }

    private final void handleSetupResult(Object result, PartnerAdapter adapter, Metrics metrics) {
        ChartboostMediationError chartboostMediationError;
        PartnerInitializationStatus partnerInitializationStatus;
        String partnerVersion;
        String adapterVersion;
        Map<String, PartnerInitializationStatus> map = this.initStatuses;
        String partnerId = adapter.getPartnerId();
        if (result instanceof Result.Failure) {
            this.adapters.remove(adapter.getPartnerId());
            Throwable thA = Result.a(result);
            ChartboostMediationAdException chartboostMediationAdException = thA instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) thA : null;
            if (chartboostMediationAdException == null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
                chartboostMediationError = ChartboostMediationError.CM_INITIALIZATION_FAILURE_UNKNOWN;
            }
            metrics.setSuccess(false);
            metrics.setChartboostMediationError(chartboostMediationError);
            metrics.setChartboostMediationErrorMessage(chartboostMediationError.getMessage());
            partnerInitializationStatus = PartnerInitializationStatus.FAILED;
        } else {
            setUpAdapterInfo(adapter);
            metrics.setSuccess(true);
            partnerInitializationStatus = PartnerInitializationStatus.INITIALIZED;
        }
        map.put(partnerId, partnerInitializationStatus);
        AdapterInfo adapterInfo2 = adapterInfo.get(adapter.getPartnerId());
        String str = "";
        if (adapterInfo2 == null || (partnerVersion = adapterInfo2.getPartnerVersion()) == null) {
            partnerVersion = "";
        }
        metrics.setPartnerSdkVersion(partnerVersion);
        AdapterInfo adapterInfo3 = adapterInfo.get(adapter.getPartnerId());
        if (adapterInfo3 != null && (adapterVersion = adapterInfo3.getAdapterVersion()) != null) {
            str = adapterVersion;
        }
        metrics.setPartnerAdapterVersion(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleShowResult(Object result, Metrics metrics) {
        metrics.setEnd(Long.valueOf(System.currentTimeMillis()));
        boolean z2 = result instanceof Result.Failure;
        metrics.setSuccess(!z2);
        if (z2) {
            Throwable thA = Result.a(result);
            ChartboostMediationAdException chartboostMediationAdException = thA instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) thA : null;
            if (chartboostMediationAdException == null || chartboostMediationAdException.getChartboostMediationError() == null) {
                ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_SHOW_FAILURE_UNKNOWN;
                metrics.setChartboostMediationError(chartboostMediationError);
                metrics.setChartboostMediationErrorMessage(chartboostMediationError.getMessage());
            }
        }
    }

    private final boolean requiredDataIsValid(Object... data) {
        for (Object obj : data) {
            if (obj instanceof Collection) {
                if (((Collection) obj).isEmpty()) {
                    return false;
                }
            } else if (obj instanceof String) {
                if (StringsKt.a0((String) obj).toString().length() <= 0) {
                    return false;
                }
            } else {
                if (obj == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setUp(Context context, PartnerAdapter partnerAdapter, PartnerConfiguration partnerConfiguration, Metrics metrics, Continuation<? super Unit> continuation) {
        C09901 c09901;
        PartnerController partnerController;
        Object objMo166setUp0E7RQCE;
        Long end;
        Long l2;
        ChartboostMediationAdException chartboostMediationAdException;
        ChartboostMediationError chartboostMediationError;
        Long l3;
        if (continuation instanceof C09901) {
            c09901 = (C09901) continuation;
            int i2 = c09901.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09901.label = i2 - Integer.MIN_VALUE;
            } else {
                c09901 = new C09901(continuation);
            }
        } else {
            c09901 = new C09901(continuation);
        }
        Object obj = c09901.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09901.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            this.initStatuses.put(partnerAdapter.getPartnerId(), PartnerInitializationStatus.INITIALIZING);
            try {
                c09901.L$0 = this;
                c09901.L$1 = partnerAdapter;
                c09901.L$2 = metrics;
                c09901.label = 1;
                objMo166setUp0E7RQCE = partnerAdapter.mo166setUp0E7RQCE(context, partnerConfiguration, c09901);
                if (objMo166setUp0E7RQCE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                partnerController = this;
            } catch (Exception e2) {
                e = e2;
                partnerController = this;
                metrics.setEnd(new Long(System.currentTimeMillis()));
                end = metrics.getEnd();
                if (end != null) {
                    long jLongValue = end.longValue();
                    Long start = metrics.getStart();
                    l2 = new Long(jLongValue - (start != null ? start.longValue() : 0L));
                } else {
                    l2 = new Long(0L);
                }
                metrics.setDuration(l2);
                metrics.setSuccess(false);
                if (e instanceof ChartboostMediationAdException) {
                    chartboostMediationAdException = (ChartboostMediationAdException) e;
                } else {
                    chartboostMediationAdException = null;
                }
                if (chartboostMediationAdException != null) {
                    chartboostMediationError = ChartboostMediationError.CM_INITIALIZATION_FAILURE_EXCEPTION;
                } else {
                    chartboostMediationError = ChartboostMediationError.CM_INITIALIZATION_FAILURE_EXCEPTION;
                }
                metrics.setChartboostMediationError(chartboostMediationError);
                metrics.setChartboostMediationErrorMessage(e.getMessage());
                partnerController.initStatuses.put(partnerAdapter.getPartnerId(), PartnerInitializationStatus.FAILED);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            metrics = (Metrics) c09901.L$2;
            partnerAdapter = (PartnerAdapter) c09901.L$1;
            partnerController = (PartnerController) c09901.L$0;
            try {
                ResultKt.b(obj);
                objMo166setUp0E7RQCE = ((Result) obj).X;
            } catch (Exception e3) {
                e = e3;
                metrics.setEnd(new Long(System.currentTimeMillis()));
                end = metrics.getEnd();
                if (end != null) {
                    long jLongValue2 = end.longValue();
                    Long start2 = metrics.getStart();
                    l2 = new Long(jLongValue2 - (start2 != null ? start2.longValue() : 0L));
                } else {
                    l2 = new Long(0L);
                }
                metrics.setDuration(l2);
                metrics.setSuccess(false);
                if (e instanceof ChartboostMediationAdException) {
                    chartboostMediationAdException = (ChartboostMediationAdException) e;
                } else {
                    chartboostMediationAdException = null;
                }
                if (chartboostMediationAdException != null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
                    chartboostMediationError = ChartboostMediationError.CM_INITIALIZATION_FAILURE_EXCEPTION;
                }
                metrics.setChartboostMediationError(chartboostMediationError);
                metrics.setChartboostMediationErrorMessage(e.getMessage());
                partnerController.initStatuses.put(partnerAdapter.getPartnerId(), PartnerInitializationStatus.FAILED);
            }
        }
        metrics.setEnd(new Long(System.currentTimeMillis()));
        Long end2 = metrics.getEnd();
        if (end2 != null) {
            long jLongValue3 = end2.longValue();
            Long start3 = metrics.getStart();
            l3 = new Long(jLongValue3 - (start3 != null ? start3.longValue() : 0L));
        } else {
            l3 = new Long(0L);
        }
        metrics.setDuration(l3);
        partnerController.handleSetupResult(objMo166setUp0E7RQCE, partnerAdapter, metrics);
        return Unit.f43263a;
    }

    private final void setUpAdapterInfo(PartnerAdapter adapter) {
        ChartboostMediationError chartboostMediationError;
        try {
            adapterInfo.put(adapter.getPartnerId(), new AdapterInfo(adapter.getPartnerSdkVersion(), adapter.getAdapterVersion(), adapter.getPartnerId(), adapter.getPartnerDisplayName()));
        } catch (Exception e2) {
            LogController logController = LogController.INSTANCE;
            StringBuilder sb = new StringBuilder("Failed to make AdapterInfo for ");
            sb.append(adapter.getPartnerDisplayName());
            sb.append(". Its version data will not be available. Error: ");
            ChartboostMediationAdException chartboostMediationAdException = e2 instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) e2 : null;
            if (chartboostMediationAdException == null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
                chartboostMediationError = ChartboostMediationError.CM_INITIALIZATION_FAILURE_EXCEPTION;
            }
            sb.append(chartboostMediationError);
            logController.e(sb.toString());
        }
    }

    public final Map<String, PartnerAdapter> getAdapters() {
        return this.adapters;
    }

    public final List<AdapterInfo> getAllAdapterInfo() {
        return CollectionsKt.i0(adapterInfo.values());
    }

    public final Map<String, PartnerInitializationStatus> getInitStatuses() {
        return this.initStatuses;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object routeGetBidderInformation(Context context, PreBidRequest preBidRequest, Continuation<? super Map<String, ? extends Map<String, String>>> continuation) {
        C09881 c09881;
        if (continuation instanceof C09881) {
            c09881 = (C09881) continuation;
            int i2 = c09881.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09881.label = i2 - Integer.MIN_VALUE;
            } else {
                c09881 = new C09881(continuation);
            }
        } else {
            c09881 = new C09881(continuation);
        }
        C09881 c09882 = c09881;
        Object obj = c09882.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09882.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c09882.L$0;
            ResultKt.b(obj);
            return concurrentHashMap;
        }
        ResultKt.b(obj);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        if (requiredDataIsValid(context, preBidRequest)) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            Job jobC = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new PartnerController$routeGetBidderInformation$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, preBidRequest), null, new PartnerController$routeGetBidderInformation$bidJob$2(preBidRequest, this, concurrentHashMap2, context, null), 2);
            c09882.L$0 = concurrentHashMap2;
            c09882.label = 1;
            return ((JobSupport) jobC).n(c09882) == coroutineSingletons ? coroutineSingletons : concurrentHashMap2;
        }
        MetricsManager metricsManager = MetricsManager.INSTANCE;
        Endpoints.Sdk.Event event = Endpoints.Sdk.Event.PREBID;
        ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_INVALID_ARGUMENTS;
        metricsManager.postMetricsDataForFailedEvent(null, event, null, chartboostMediationError, chartboostMediationError.getMessage(), (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? null : null, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : preBidRequest.getLoadId(), (14336 & 1024) != 0 ? null : null, (14336 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : null);
        return concurrentHashMap2;
    }

    public final void routeInvalidate(PartnerAd partnerAd) {
        Intrinsics.f(partnerAd, "partnerAd");
        PartnerAdapter partnerAdapter = this.adapters.get(partnerAd.getRequest().getPartnerId());
        if (partnerAdapter != null) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new PartnerController$routeInvalidate$lambda$13$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, partnerAd), null, new PartnerController$routeInvalidate$1$2(partnerAdapter, partnerAd, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: routeLoad-eH_QyT8$Helium_release, reason: not valid java name */
    public final Object m163routeLoadeH_QyT8$Helium_release(Context context, String str, String str2, boolean z2, PartnerAdLoadRequest partnerAdLoadRequest, Set<Metrics> set, String str3, Continuation<? super Result<PartnerAd>> continuation) {
        PartnerController$routeLoad$1 partnerController$routeLoad$1;
        Ref.ObjectRef objectRef;
        String str4;
        Size size;
        if (continuation instanceof PartnerController$routeLoad$1) {
            partnerController$routeLoad$1 = (PartnerController$routeLoad$1) continuation;
            int i2 = partnerController$routeLoad$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerController$routeLoad$1.label = i2 - Integer.MIN_VALUE;
            } else {
                partnerController$routeLoad$1 = new PartnerController$routeLoad$1(this, continuation);
            }
        } else {
            partnerController$routeLoad$1 = new PartnerController$routeLoad$1(this, continuation);
        }
        PartnerController$routeLoad$1 partnerController$routeLoad$2 = partnerController$routeLoad$1;
        Object obj = partnerController$routeLoad$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = partnerController$routeLoad$2.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (!requiredDataIsValid(context, partnerAdLoadRequest.getPartnerPlacement(), partnerAdLoadRequest.getChartboostPlacement())) {
                MetricsManager metricsManager = MetricsManager.INSTANCE;
                String partnerId = partnerAdLoadRequest.getPartnerId();
                Endpoints.Sdk.Event event = Endpoints.Sdk.Event.LOAD;
                ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_INVALID_ARGUMENTS;
                String message = chartboostMediationError.getMessage();
                String identifier = partnerAdLoadRequest.getIdentifier();
                Size size2 = partnerAdLoadRequest.getSize();
                if (size2 != null) {
                    str4 = str3;
                    if (Intrinsics.a(str4, "adaptive_banner")) {
                        size = size2;
                    }
                    metricsManager.postMetricsDataForFailedEvent(partnerId, event, str, chartboostMediationError, message, (14336 & 32) != 0 ? null : str4, (14336 & 64) != 0 ? null : size, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : identifier, (14336 & 1024) != 0 ? null : null, (14336 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : Metrics.NetworkType.INSTANCE.getType(z2), (14336 & 4096) != 0 ? null : str2, (14336 & Segment.SIZE) != 0 ? null : partnerAdLoadRequest.getPartnerPlacement());
                    return ResultKt.a(new ChartboostMediationAdException(chartboostMediationError));
                }
                str4 = str3;
                size = null;
                metricsManager.postMetricsDataForFailedEvent(partnerId, event, str, chartboostMediationError, message, (14336 & 32) != 0 ? null : str4, (14336 & 64) != 0 ? null : size, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : identifier, (14336 & 1024) != 0 ? null : null, (14336 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : Metrics.NetworkType.INSTANCE.getType(z2), (14336 & 4096) != 0 ? null : str2, (14336 & Segment.SIZE) != 0 ? null : partnerAdLoadRequest.getPartnerPlacement());
                return ResultKt.a(new ChartboostMediationAdException(chartboostMediationError));
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.X = ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_UNKNOWN_ERROR));
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            Job jobC = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new PartnerController$routeLoadeH_QyT8$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, partnerAdLoadRequest, z2, str, str3, str2, objectRef2), null, new PartnerController$routeLoad$job$2(this, partnerAdLoadRequest, set, str, str2, z2, str3, context, objectRef2, null), 2);
            partnerController$routeLoad$2.L$0 = objectRef2;
            partnerController$routeLoad$2.label = 1;
            if (((JobSupport) jobC).n(partnerController$routeLoad$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            objectRef = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) partnerController$routeLoad$2.L$0;
            ResultKt.b(obj);
        }
        return objectRef.X;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object routeShow(Context context, PartnerAd partnerAd, String str, String str2, Continuation<? super PartnerShowResult> continuation) {
        C09891 c09891;
        PartnerAdLoadRequest request;
        Ref.ObjectRef objectRef;
        PartnerAdLoadRequest request2;
        if (continuation instanceof C09891) {
            c09891 = (C09891) continuation;
            int i2 = c09891.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09891.label = i2 - Integer.MIN_VALUE;
            } else {
                c09891 = new C09891(continuation);
            }
        } else {
            c09891 = new C09891(continuation);
        }
        C09891 c09892 = c09891;
        Object obj = c09892.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09892.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            String partnerPlacement = null;
            String partnerId = (partnerAd == null || (request2 = partnerAd.getRequest()) == null) ? null : request2.getPartnerId();
            Endpoints.Sdk.Event event = Endpoints.Sdk.Event.SHOW;
            Metrics metrics = new Metrics(partnerId, event);
            metrics.setSuccess(false);
            metrics.setAuctionId(str);
            ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_SHOW_FAILURE_UNKNOWN;
            metrics.setChartboostMediationError(chartboostMediationError);
            metrics.setChartboostMediationErrorMessage(chartboostMediationError.getMessage());
            objectRef2.X = new PartnerShowResult(partnerAd, SetsKt.h(metrics));
            if (!requiredDataIsValid(context) || partnerAd == null) {
                MetricsManager metricsManager = MetricsManager.INSTANCE;
                ChartboostMediationError chartboostMediationError2 = ChartboostMediationError.CM_INVALID_ARGUMENTS;
                String message = chartboostMediationError2.getMessage();
                if (partnerAd != null && (request = partnerAd.getRequest()) != null) {
                    partnerPlacement = request.getPartnerPlacement();
                }
                metricsManager.postMetricsDataForFailedEvent(null, event, str, chartboostMediationError2, message, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? null : null, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : str2, (14336 & 1024) != 0 ? null : null, (14336 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : partnerPlacement);
                ((Metrics) CollectionsKt.v(((PartnerShowResult) objectRef2.X).getMetrics())).setChartboostMediationError(chartboostMediationError2);
                ((Metrics) CollectionsKt.v(((PartnerShowResult) objectRef2.X).getMetrics())).setChartboostMediationErrorMessage(chartboostMediationError2.getMessage());
                return objectRef2.X;
            }
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            Job jobC = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new PartnerController$routeShow$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, partnerAd, str, objectRef2), null, new PartnerController$routeShow$partnerShowJob$2(partnerAd, this, objectRef2, str2, str, context, null), 2);
            c09892.L$0 = objectRef2;
            c09892.label = 1;
            if (((JobSupport) jobC).n(c09892) == coroutineSingletons) {
                return coroutineSingletons;
            }
            objectRef = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c09892.L$0;
            ResultKt.b(obj);
        }
        return objectRef.X;
    }

    public final void setAdapters(Map<String, PartnerAdapter> map) {
        Intrinsics.f(map, "<set-?>");
        this.adapters = map;
    }

    public final void setCcpaConsent(Context context, Boolean hasGrantedCcpaConsent, String privacyString, PartnerConsents partnerConsents) {
        Intrinsics.f(context, "context");
        Intrinsics.f(privacyString, "privacyString");
        Intrinsics.f(partnerConsents, "partnerConsents");
        Map<String, Boolean> partnerIdToConsentGivenMapCopy = partnerConsents.getPartnerIdToConsentGivenMapCopy();
        Iterator<Map.Entry<String, PartnerAdapter>> it = this.adapters.entrySet().iterator();
        while (it.hasNext()) {
            PartnerAdapter value = it.next().getValue();
            try {
                if (partnerIdToConsentGivenMapCopy.containsKey(value.getPartnerId())) {
                    if (Intrinsics.a(partnerIdToConsentGivenMapCopy.get(value.getPartnerId()), Boolean.TRUE)) {
                        value.setCcpaConsent(context, true, PrivacyController.PrivacyString.GRANTED.getConsentString());
                    } else {
                        value.setCcpaConsent(context, false, PrivacyController.PrivacyString.DENIED.getConsentString());
                    }
                } else if (hasGrantedCcpaConsent != null) {
                    value.setCcpaConsent(context, hasGrantedCcpaConsent.booleanValue(), privacyString);
                }
            } catch (Exception unused) {
                LogController.INSTANCE.e("Failed to route setCcpaPrivacyString to adapter " + value.getPartnerDisplayName());
            }
        }
    }

    public final void setGdpr(Context context, Boolean applies, GdprConsentStatus status, PartnerConsents partnerConsents) {
        Intrinsics.f(context, "context");
        Intrinsics.f(status, "status");
        Intrinsics.f(partnerConsents, "partnerConsents");
        Map<String, Boolean> partnerIdToConsentGivenMapCopy = partnerConsents.getPartnerIdToConsentGivenMapCopy();
        Iterator<Map.Entry<String, PartnerAdapter>> it = this.adapters.entrySet().iterator();
        while (it.hasNext()) {
            PartnerAdapter value = it.next().getValue();
            try {
                Boolean bool = partnerIdToConsentGivenMapCopy.get(value.getPartnerId());
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    value.setGdpr(context, applies, GdprConsentStatus.GDPR_CONSENT_GRANTED);
                } else if (Intrinsics.a(bool, Boolean.FALSE)) {
                    value.setGdpr(context, applies, GdprConsentStatus.GDPR_CONSENT_DENIED);
                } else if (bool == null) {
                    value.setGdpr(context, applies, status);
                }
            } catch (Exception unused) {
                LogController.INSTANCE.e("Failed to route setGdpr to adapter " + value.getPartnerDisplayName() + '.');
            }
        }
    }

    public final void setInitStatuses(Map<String, PartnerInitializationStatus> map) {
        Intrinsics.f(map, "<set-?>");
        this.initStatuses = map;
    }

    public final void setUpAdapters(Context context, Map<String, PartnerConfiguration> partnerConfigurationMap, Set<String> adapterClasses, Set<String> skippedPartnerIds, Function1<? super ChartboostMediationError, Unit> onPartnerInitializationComplete) {
        Intrinsics.f(context, "context");
        Intrinsics.f(partnerConfigurationMap, "partnerConfigurationMap");
        Intrinsics.f(adapterClasses, "adapterClasses");
        Intrinsics.f(skippedPartnerIds, "skippedPartnerIds");
        Intrinsics.f(onPartnerInitializationComplete, "onPartnerInitializationComplete");
        EventResult initResult2B = null;
        if (requiredDataIsValid(context, adapterClasses)) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            createAdapters(adapterClasses);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new PartnerController$setUpAdapters$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, objectRef), null, new AnonymousClass3(skippedPartnerIds, this, booleanRef, onPartnerInitializationComplete, objectRef, partnerConfigurationMap, context, null), 2);
            return;
        }
        MetricsManager metricsManager = MetricsManager.INSTANCE;
        Endpoints.Sdk.Event event = Endpoints.Sdk.Event.INITIALIZATION;
        ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_INVALID_ARGUMENTS;
        String message = chartboostMediationError.getMessage();
        AppConfigStorage appConfigStorage = AppConfigStorage.INSTANCE;
        MetricsError.JsonParseError parsingError = appConfigStorage.getParsingError();
        if (parsingError != null) {
            initResult2B = appConfigStorage.getValidCachedConfigExists() ? new EventResult.SdkInitializationResult.InitResult2B(parsingError) : new EventResult.SdkInitializationResult.InitResult1B(parsingError);
        }
        metricsManager.postMetricsDataForFailedEvent(null, event, null, chartboostMediationError, message, (14336 & 32) != 0 ? null : null, (14336 & 64) != 0 ? null : null, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : null, (14336 & 1024) != 0 ? null : initResult2B, (14336 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : null);
        onPartnerInitializationComplete.invoke(chartboostMediationError);
    }

    public final void setUserSubjectToCoppa(Context context, boolean isSubjectToCoppa) {
        Intrinsics.f(context, "context");
        Iterator<Map.Entry<String, PartnerAdapter>> it = this.adapters.entrySet().iterator();
        while (it.hasNext()) {
            PartnerAdapter value = it.next().getValue();
            try {
                value.setUserSubjectToCoppa(context, isSubjectToCoppa);
            } catch (Exception unused) {
                LogController.INSTANCE.e("Failed to route setUserSubjectToCoppa to adapter " + value.getPartnerDisplayName());
            }
        }
    }
}
