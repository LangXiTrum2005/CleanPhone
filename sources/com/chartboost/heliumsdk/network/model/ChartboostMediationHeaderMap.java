package com.chartboost.heliumsdk.network.model;

import androidx.datastore.preferences.protobuf.a;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import com.chartboost.heliumsdk.utils.Environment;
import com.p004ironsource.x4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "()V", "ChartboostBidRequestMediationHeaderMap", "ChartboostMediationAdLifecycleHeaderMap", "ChartboostMediationAppConfigHeaderMap", "ChartboostQueueRequestMediationHeaderMap", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostBidRequestMediationHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAppConfigHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostQueueRequestMediationHeaderMap;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ChartboostMediationHeaderMap extends HashMap<String, String> {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostBidRequestMediationHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap;", "rateLimit", "", "loadId", "appSetId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppSetId", "()Ljava/lang/String;", "getLoadId", "getRateLimit", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ChartboostBidRequestMediationHeaderMap extends ChartboostMediationHeaderMap {
        private final String appSetId;
        private final String loadId;
        private final String rateLimit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartboostBidRequestMediationHeaderMap(String rateLimit, String loadId, String appSetId) {
            super(null);
            Intrinsics.f(rateLimit, "rateLimit");
            Intrinsics.f(loadId, "loadId");
            Intrinsics.f(appSetId, "appSetId");
            this.rateLimit = rateLimit;
            this.loadId = loadId;
            this.appSetId = appSetId;
            String sessionId$Helium_release = Environment.INSTANCE.getSessionId$Helium_release();
            putAll(MapsKt.j(new Pair(ChartboostMediationNetworking.SESSION_ID_HEADER_KEY, sessionId$Helium_release == null ? "" : sessionId$Helium_release), new Pair(ChartboostMediationNetworking.APP_SET_ID_HEADER_KEY, appSetId), new Pair(ChartboostMediationNetworking.MEDIATION_LOAD_ID_HEADER_KEY, loadId), new Pair(ChartboostMediationNetworking.RATE_LIMIT_HEADER_KEY, rateLimit)));
            HeliumSdk.Companion companion = HeliumSdk.INSTANCE;
            if (companion.getChartboostMediationInternal$Helium_release().getTestMode()) {
                put(ChartboostMediationNetworking.DEBUG_HEADER_KEY, companion.getChartboostMediationInternal$Helium_release().getAppId());
            }
        }

        public static /* synthetic */ ChartboostBidRequestMediationHeaderMap copy$default(ChartboostBidRequestMediationHeaderMap chartboostBidRequestMediationHeaderMap, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = chartboostBidRequestMediationHeaderMap.rateLimit;
            }
            if ((i2 & 2) != 0) {
                str2 = chartboostBidRequestMediationHeaderMap.loadId;
            }
            if ((i2 & 4) != 0) {
                str3 = chartboostBidRequestMediationHeaderMap.appSetId;
            }
            return chartboostBidRequestMediationHeaderMap.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRateLimit() {
            return this.rateLimit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLoadId() {
            return this.loadId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        public final ChartboostBidRequestMediationHeaderMap copy(String rateLimit, String loadId, String appSetId) {
            Intrinsics.f(rateLimit, "rateLimit");
            Intrinsics.f(loadId, "loadId");
            Intrinsics.f(appSetId, "appSetId");
            return new ChartboostBidRequestMediationHeaderMap(rateLimit, loadId, appSetId);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartboostBidRequestMediationHeaderMap)) {
                return false;
            }
            ChartboostBidRequestMediationHeaderMap chartboostBidRequestMediationHeaderMap = (ChartboostBidRequestMediationHeaderMap) other;
            return Intrinsics.a(this.rateLimit, chartboostBidRequestMediationHeaderMap.rateLimit) && Intrinsics.a(this.loadId, chartboostBidRequestMediationHeaderMap.loadId) && Intrinsics.a(this.appSetId, chartboostBidRequestMediationHeaderMap.appSetId);
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final String getLoadId() {
            return this.loadId;
        }

        public final String getRateLimit() {
            return this.rateLimit;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.appSetId.hashCode() + a.b(this.loadId, this.rateLimit.hashCode() * 31, 31);
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder("ChartboostBidRequestMediationHeaderMap(rateLimit=");
            sb.append(this.rateLimit);
            sb.append(", loadId=");
            sb.append(this.loadId);
            sb.append(", appSetId=");
            return androidx.media3.extractor.text.ttml.a.p(sb, this.appSetId, ')');
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAdLifecycleHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap;", "loadId", "", "appSetId", "queueId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppSetId", "()Ljava/lang/String;", "getLoadId", "getQueueId", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ChartboostMediationAdLifecycleHeaderMap extends ChartboostMediationHeaderMap {
        private final String appSetId;
        private final String loadId;
        private final String queueId;

        public /* synthetic */ ChartboostMediationAdLifecycleHeaderMap(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ ChartboostMediationAdLifecycleHeaderMap copy$default(ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = chartboostMediationAdLifecycleHeaderMap.loadId;
            }
            if ((i2 & 2) != 0) {
                str2 = chartboostMediationAdLifecycleHeaderMap.appSetId;
            }
            if ((i2 & 4) != 0) {
                str3 = chartboostMediationAdLifecycleHeaderMap.queueId;
            }
            return chartboostMediationAdLifecycleHeaderMap.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLoadId() {
            return this.loadId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getQueueId() {
            return this.queueId;
        }

        public final ChartboostMediationAdLifecycleHeaderMap copy(String loadId, String appSetId, String queueId) {
            Intrinsics.f(appSetId, "appSetId");
            return new ChartboostMediationAdLifecycleHeaderMap(loadId, appSetId, queueId);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartboostMediationAdLifecycleHeaderMap)) {
                return false;
            }
            ChartboostMediationAdLifecycleHeaderMap chartboostMediationAdLifecycleHeaderMap = (ChartboostMediationAdLifecycleHeaderMap) other;
            return Intrinsics.a(this.loadId, chartboostMediationAdLifecycleHeaderMap.loadId) && Intrinsics.a(this.appSetId, chartboostMediationAdLifecycleHeaderMap.appSetId) && Intrinsics.a(this.queueId, chartboostMediationAdLifecycleHeaderMap.queueId);
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final String getLoadId() {
            return this.loadId;
        }

        public final String getQueueId() {
            return this.queueId;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            String str = this.loadId;
            int iB = a.b(this.appSetId, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.queueId;
            return iB + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder("ChartboostMediationAdLifecycleHeaderMap(loadId=");
            sb.append(this.loadId);
            sb.append(", appSetId=");
            sb.append(this.appSetId);
            sb.append(", queueId=");
            return androidx.media3.extractor.text.ttml.a.p(sb, this.queueId, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartboostMediationAdLifecycleHeaderMap(String str, String appSetId, String str2) {
            super(null);
            Intrinsics.f(appSetId, "appSetId");
            this.loadId = str;
            this.appSetId = appSetId;
            this.queueId = str2;
            put(ChartboostMediationNetworking.APP_SET_ID_HEADER_KEY, appSetId);
            String sessionId$Helium_release = Environment.INSTANCE.getSessionId$Helium_release();
            put(ChartboostMediationNetworking.SESSION_ID_HEADER_KEY, sessionId$Helium_release == null ? "" : sessionId$Helium_release);
            if (str != null) {
                put(ChartboostMediationNetworking.MEDIATION_LOAD_ID_HEADER_KEY, str);
            }
            if (str2 != null) {
                put(ChartboostMediationNetworking.QUEUE_ID_HEADER_KEY, str2);
            }
            HeliumSdk.Companion companion = HeliumSdk.INSTANCE;
            if (companion.getChartboostMediationInternal$Helium_release().getTestMode()) {
                put(ChartboostMediationNetworking.DEBUG_HEADER_KEY, companion.getChartboostMediationInternal$Helium_release().getAppId());
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostMediationAppConfigHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap;", "initHash", "", "appSetId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppSetId", "()Ljava/lang/String;", "getInitHash", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ChartboostMediationAppConfigHeaderMap extends ChartboostMediationHeaderMap {
        private final String appSetId;
        private final String initHash;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartboostMediationAppConfigHeaderMap(String initHash, String appSetId) {
            super(null);
            Intrinsics.f(initHash, "initHash");
            Intrinsics.f(appSetId, "appSetId");
            this.initHash = initHash;
            this.appSetId = appSetId;
            Pair pair = new Pair(ChartboostMediationNetworking.APP_SET_ID_HEADER_KEY, appSetId);
            Environment environment = Environment.INSTANCE;
            String sessionId$Helium_release = environment.getSessionId$Helium_release();
            Pair pair2 = new Pair(ChartboostMediationNetworking.SESSION_ID_HEADER_KEY, sessionId$Helium_release == null ? "" : sessionId$Helium_release);
            HeliumSdk.Companion companion = HeliumSdk.INSTANCE;
            putAll(MapsKt.j(pair, pair2, new Pair(ChartboostMediationNetworking.SDK_VERSION_HEADER_KEY, companion.getVersion()), new Pair(ChartboostMediationNetworking.DEVICE_OS_HEADER_KEY, environment.getOperatingSystem()), new Pair(ChartboostMediationNetworking.DEVICE_OS_VERSION_HEADER_KEY, environment.getOperatingSystemVersion()), new Pair(ChartboostMediationNetworking.INIT_HASH_HEADER_KEY, initHash)));
            if (companion.getChartboostMediationInternal$Helium_release().getTestMode()) {
                put(ChartboostMediationNetworking.DEBUG_HEADER_KEY, companion.getChartboostMediationInternal$Helium_release().getAppId());
            }
        }

        public static /* synthetic */ ChartboostMediationAppConfigHeaderMap copy$default(ChartboostMediationAppConfigHeaderMap chartboostMediationAppConfigHeaderMap, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = chartboostMediationAppConfigHeaderMap.initHash;
            }
            if ((i2 & 2) != 0) {
                str2 = chartboostMediationAppConfigHeaderMap.appSetId;
            }
            return chartboostMediationAppConfigHeaderMap.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInitHash() {
            return this.initHash;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        public final ChartboostMediationAppConfigHeaderMap copy(String initHash, String appSetId) {
            Intrinsics.f(initHash, "initHash");
            Intrinsics.f(appSetId, "appSetId");
            return new ChartboostMediationAppConfigHeaderMap(initHash, appSetId);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartboostMediationAppConfigHeaderMap)) {
                return false;
            }
            ChartboostMediationAppConfigHeaderMap chartboostMediationAppConfigHeaderMap = (ChartboostMediationAppConfigHeaderMap) other;
            return Intrinsics.a(this.initHash, chartboostMediationAppConfigHeaderMap.initHash) && Intrinsics.a(this.appSetId, chartboostMediationAppConfigHeaderMap.appSetId);
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final String getInitHash() {
            return this.initHash;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.appSetId.hashCode() + (this.initHash.hashCode() * 31);
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder("ChartboostMediationAppConfigHeaderMap(initHash=");
            sb.append(this.initHash);
            sb.append(", appSetId=");
            return androidx.media3.extractor.text.ttml.a.p(sb, this.appSetId, ')');
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap$ChartboostQueueRequestMediationHeaderMap;", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationHeaderMap;", "queueId", "", "appSetId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppSetId", "()Ljava/lang/String;", "getQueueId", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ChartboostQueueRequestMediationHeaderMap extends ChartboostMediationHeaderMap {
        private final String appSetId;
        private final String queueId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartboostQueueRequestMediationHeaderMap(String queueId, String appSetId) {
            super(null);
            Intrinsics.f(queueId, "queueId");
            Intrinsics.f(appSetId, "appSetId");
            this.queueId = queueId;
            this.appSetId = appSetId;
            String sessionId$Helium_release = Environment.INSTANCE.getSessionId$Helium_release();
            putAll(MapsKt.j(new Pair(ChartboostMediationNetworking.SESSION_ID_HEADER_KEY, sessionId$Helium_release == null ? "" : sessionId$Helium_release), new Pair(ChartboostMediationNetworking.APP_SET_ID_HEADER_KEY, appSetId), new Pair(ChartboostMediationNetworking.QUEUE_ID_HEADER_KEY, queueId)));
            HeliumSdk.Companion companion = HeliumSdk.INSTANCE;
            if (companion.getChartboostMediationInternal$Helium_release().getTestMode()) {
                put(ChartboostMediationNetworking.DEBUG_HEADER_KEY, companion.getChartboostMediationInternal$Helium_release().getAppId());
            }
        }

        public static /* synthetic */ ChartboostQueueRequestMediationHeaderMap copy$default(ChartboostQueueRequestMediationHeaderMap chartboostQueueRequestMediationHeaderMap, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = chartboostQueueRequestMediationHeaderMap.queueId;
            }
            if ((i2 & 2) != 0) {
                str2 = chartboostQueueRequestMediationHeaderMap.appSetId;
            }
            return chartboostQueueRequestMediationHeaderMap.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQueueId() {
            return this.queueId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        public final ChartboostQueueRequestMediationHeaderMap copy(String queueId, String appSetId) {
            Intrinsics.f(queueId, "queueId");
            Intrinsics.f(appSetId, "appSetId");
            return new ChartboostQueueRequestMediationHeaderMap(queueId, appSetId);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartboostQueueRequestMediationHeaderMap)) {
                return false;
            }
            ChartboostQueueRequestMediationHeaderMap chartboostQueueRequestMediationHeaderMap = (ChartboostQueueRequestMediationHeaderMap) other;
            return Intrinsics.a(this.queueId, chartboostQueueRequestMediationHeaderMap.queueId) && Intrinsics.a(this.appSetId, chartboostQueueRequestMediationHeaderMap.appSetId);
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final String getQueueId() {
            return this.queueId;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.appSetId.hashCode() + (this.queueId.hashCode() * 31);
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder("ChartboostQueueRequestMediationHeaderMap(queueId=");
            sb.append(this.queueId);
            sb.append(", appSetId=");
            return androidx.media3.extractor.text.ttml.a.p(sb, this.appSetId, ')');
        }
    }

    public /* synthetic */ ChartboostMediationHeaderMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (String) obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<String> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<String> values() {
        return getValues();
    }

    private ChartboostMediationHeaderMap() {
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        return !(obj instanceof String) ? str : getOrDefault((String) obj, str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ String get(String str) {
        return (String) super.get((Object) str);
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault((Object) str, str2);
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return false;
        }
        if (obj2 == null ? true : obj2 instanceof String) {
            return remove((String) obj, (String) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove((Object) str, (Object) str2);
    }
}
