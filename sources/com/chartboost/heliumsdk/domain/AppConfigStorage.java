package com.chartboost.heliumsdk.domain;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.utils.LogController;
import com.smartdigimkt.o1.b;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010Q\u001a\u00020RH\u0002J\u0006\u0010S\u001a\u00020>J*\u0010T\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H\u0002J\u000e\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020>J\u000e\u0010Z\u001a\u00020X2\u0006\u0010\t\u001a\u00020\nR,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR \u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR \u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR \u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u000eR,\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\"0!8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010,\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000eR*\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020.0\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR<\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202\u0018\u0001012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u000202\u0018\u0001018F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R \u00106\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0016R \u00108\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0016R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R \u0010?\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020>8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR \u0010B\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u000eR \u0010D\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u000eR\u001a\u0010F\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010A\"\u0004\bH\u0010IR \u0010J\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0016R\u001c\u0010L\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u000e\"\u0004\bN\u0010O¨\u0006["}, d2 = {"Lcom/chartboost/heliumsdk/domain/AppConfigStorage;", "", "()V", "<set-?>", "", "", "adapterClassPaths", "getAdapterClassPaths", "()Ljava/util/Set;", "appConfig", "Lcom/chartboost/heliumsdk/domain/AppConfig;", "", "bannerImpressionMinVisibleDips", "getBannerImpressionMinVisibleDips", "()I", "bannerImpressionMinVisibleDurationMs", "getBannerImpressionMinVisibleDurationMs", "bannerLoadTimeoutSeconds", "getBannerLoadTimeoutSeconds", "", "bannerSizeEventDelayMs", "getBannerSizeEventDelayMs", "()J", "defaultQueueSize", "getDefaultQueueSize", "fullscreenLoadTimeoutSeconds", "getFullscreenLoadTimeoutSeconds", "initializationMetricsPostTimeout", "getInitializationMetricsPostTimeout", "logLevel", "getLogLevel", "maxQueueSize", "getMaxQueueSize", "Ljava/util/EnumSet;", "Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "metricsEvents", "getMetricsEvents", "()Ljava/util/EnumSet;", "parsingError", "Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "getParsingError", "()Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;", "setParsingError", "(Lcom/chartboost/heliumsdk/domain/MetricsError$JsonParseError;)V", "partnerInitTimeoutSeconds", "getPartnerInitTimeoutSeconds", "Lcom/chartboost/heliumsdk/domain/Partner;", "partners", "getPartners", "", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "placementsToAdFormats", "getPlacementsToAdFormats", "()Ljava/util/Map;", "prebidFetchTimeoutSeconds", "getPrebidFetchTimeoutSeconds", "queueAdTtlSeconds", "getQueueAdTtlSeconds", "serverLogLevelOverride", "Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "getServerLogLevelOverride", "()Lcom/chartboost/heliumsdk/utils/LogController$LogLevel;", "", "shouldNotifyLoads", "getShouldNotifyLoads", "()Z", "showTimeoutSeconds", "getShowTimeoutSeconds", "startSdkTimeoutSeconds", "getStartSdkTimeoutSeconds", "validCachedConfigExists", "getValidCachedConfigExists", "setValidCachedConfigExists", "(Z)V", "visibilityTrackerPollIntervalMs", "getVisibilityTrackerPollIntervalMs", "visibilityTrackerTraversalLimit", "getVisibilityTrackerTraversalLimit", "setVisibilityTrackerTraversalLimit", "(I)V", "compilePartners", "credentials", "Lkotlinx/serialization/json/JsonObject;", "getEnableRateLimiting", "getReportableMetricsEvents", "fullSet", "serverSet", "setEnableRateLimiting", "", "enableRateLimiting", "updateFields", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppConfigStorage {
    private static Set<String> adapterClassPaths;
    private static int bannerImpressionMinVisibleDips;
    private static int bannerImpressionMinVisibleDurationMs;
    private static int bannerLoadTimeoutSeconds;
    private static long bannerSizeEventDelayMs;
    private static int fullscreenLoadTimeoutSeconds;
    private static int initializationMetricsPostTimeout;
    private static int logLevel;
    private static int maxQueueSize;
    private static EnumSet<Endpoints.Sdk.Event> metricsEvents;
    private static MetricsError.JsonParseError parsingError;
    private static int partnerInitTimeoutSeconds;
    private static Set<Partner> partners;
    private static Map<String, ? extends AdFormat> placementsToAdFormats;
    private static long prebidFetchTimeoutSeconds;
    private static long queueAdTtlSeconds;
    private static boolean shouldNotifyLoads;
    private static int showTimeoutSeconds;
    private static int startSdkTimeoutSeconds;
    private static boolean validCachedConfigExists;
    private static long visibilityTrackerPollIntervalMs;
    private static int visibilityTrackerTraversalLimit;
    public static final AppConfigStorage INSTANCE = new AppConfigStorage();
    private static AppConfig appConfig = new AppConfig((String) null, (Set) null, 0, 0, 0L, (EnumSet) null, 0, 0, 0, 0, 0, 0L, false, 0, 0, 0L, 0, (JsonObject) null, (List) null, (String) null, 0, 0L, 0, 8388607, (DefaultConstructorMarker) null);

    static {
        EmptySet emptySet = EmptySet.X;
        partners = emptySet;
        adapterClassPaths = emptySet;
        EnumSet<Endpoints.Sdk.Event> enumSetAllOf = EnumSet.allOf(Endpoints.Sdk.Event.class);
        Intrinsics.e(enumSetAllOf, "allOf(Sdk.Event::class.java)");
        metricsEvents = enumSetAllOf;
        bannerLoadTimeoutSeconds = 15;
        bannerSizeEventDelayMs = 1000L;
        fullscreenLoadTimeoutSeconds = 30;
        showTimeoutSeconds = 5;
        startSdkTimeoutSeconds = 20;
        partnerInitTimeoutSeconds = 1;
        initializationMetricsPostTimeout = 10;
        prebidFetchTimeoutSeconds = 5L;
        shouldNotifyLoads = true;
        bannerImpressionMinVisibleDips = 1;
        visibilityTrackerPollIntervalMs = 100L;
        visibilityTrackerTraversalLimit = 25;
        validCachedConfigExists = true;
        maxQueueSize = 5;
        queueAdTtlSeconds = b.f37307P;
    }

    private AppConfigStorage() {
    }

    private final Set<Partner> compilePartners(JsonObject credentials) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : credentials.keySet()) {
            linkedHashSet.add(new Partner(str, JsonElementKt.getJsonObject((JsonElement) MapsKt.f(credentials, str))));
        }
        return linkedHashSet;
    }

    private final EnumSet<Endpoints.Sdk.Event> getReportableMetricsEvents(EnumSet<Endpoints.Sdk.Event> fullSet, Set<? extends Endpoints.Sdk.Event> serverSet) {
        if (serverSet.isEmpty()) {
            return fullSet;
        }
        EnumSet<Endpoints.Sdk.Event> enumSetNoneOf = EnumSet.noneOf(Endpoints.Sdk.Event.class);
        Iterator<T> it = serverSet.iterator();
        while (it.hasNext()) {
            enumSetNoneOf.add((Endpoints.Sdk.Event) it.next());
        }
        Intrinsics.e(enumSetNoneOf, "{\n            EnumSet.no…}\n            }\n        }");
        return enumSetNoneOf;
    }

    public final Set<String> getAdapterClassPaths() {
        return appConfig.adapterClasses;
    }

    public final int getBannerImpressionMinVisibleDips() {
        return appConfig.getBannerImpressionMinVisibleDips();
    }

    public final int getBannerImpressionMinVisibleDurationMs() {
        return appConfig.getBannerImpressionMinVisibleDurationMs();
    }

    public final int getBannerLoadTimeoutSeconds() {
        return appConfig.getBannerLoadTimeoutSeconds();
    }

    public final long getBannerSizeEventDelayMs() {
        return appConfig.getBannerSizeEventDelayMs();
    }

    public final int getDefaultQueueSize() {
        return appConfig.getDefaultQueueSize();
    }

    public final boolean getEnableRateLimiting() {
        Context context = HeliumSdk.INSTANCE.getContext();
        if (context != null) {
            return context.getSharedPreferences("HELIUM_EXPERIMENTAL", 0).getBoolean("com.chartboost.helium.enable_rate_limiting", true);
        }
        return true;
    }

    public final int getFullscreenLoadTimeoutSeconds() {
        return appConfig.getFullscreenLoadTimeoutSeconds();
    }

    public final int getInitializationMetricsPostTimeout() {
        return appConfig.getInitializationMetricsPostTimeout();
    }

    public final int getLogLevel() {
        return appConfig.getLogLevel();
    }

    public final int getMaxQueueSize() {
        return appConfig.getMaxQueueSize();
    }

    public final EnumSet<Endpoints.Sdk.Event> getMetricsEvents() {
        return appConfig.getMetricsEvents();
    }

    public final MetricsError.JsonParseError getParsingError() {
        return parsingError;
    }

    public final int getPartnerInitTimeoutSeconds() {
        return appConfig.getPartnerInitTimeoutSeconds();
    }

    public final Set<Partner> getPartners() {
        return partners;
    }

    public final Map<String, AdFormat> getPlacementsToAdFormats() {
        Unit unit;
        Map linkedHashMap = placementsToAdFormats;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            List<Placement> placements = appConfig.getPlacements();
            if (placements != null) {
                for (Placement placement : placements) {
                    linkedHashMap.put(placement.getChartboostPlacement(), AdFormat.INSTANCE.fromString(placement.getFormat().toString()));
                }
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                LogController.INSTANCE.e("Failed to build placements to ad formats map. Placements list is null.");
            }
            placementsToAdFormats = linkedHashMap;
        }
        return linkedHashMap;
    }

    public final long getPrebidFetchTimeoutSeconds() {
        return appConfig.getPrebidFetchTimeoutSeconds();
    }

    public final long getQueueAdTtlSeconds() {
        return appConfig.getQueueAdTtlSeconds();
    }

    public final LogController.LogLevel getServerLogLevelOverride() {
        try {
            String logLevelString = appConfig.getLogLevelString();
            if (logLevelString == null) {
                logLevelString = "";
            }
            String upperCase = logLevelString.toUpperCase(Locale.ROOT);
            Intrinsics.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return LogController.LogLevel.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean getShouldNotifyLoads() {
        return appConfig.getShouldNotifyLoads();
    }

    public final int getShowTimeoutSeconds() {
        return appConfig.getShowTimeoutSeconds();
    }

    public final int getStartSdkTimeoutSeconds() {
        return appConfig.getStartSdkTimeoutSeconds();
    }

    public final boolean getValidCachedConfigExists() {
        return validCachedConfigExists;
    }

    public final long getVisibilityTrackerPollIntervalMs() {
        return appConfig.getVisibilityTrackerPollIntervalMs();
    }

    public final int getVisibilityTrackerTraversalLimit() {
        return appConfig.getVisibilityTrackerTraversalLimit();
    }

    public final void setEnableRateLimiting(boolean enableRateLimiting) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        if (!enableRateLimiting) {
            LogController.INSTANCE.d("Disabling rate limiting.");
        }
        Context context = HeliumSdk.INSTANCE.getContext();
        Unit unit = null;
        if (context != null && (sharedPreferences = context.getSharedPreferences("HELIUM_EXPERIMENTAL", 0)) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("com.chartboost.helium.enable_rate_limiting", enableRateLimiting)) != null) {
            editorPutBoolean.apply();
            unit = Unit.f43263a;
        }
        if (unit == null) {
            LogController.INSTANCE.d("Unable to set rate limiting preference.");
        }
    }

    public final void setParsingError(MetricsError.JsonParseError jsonParseError) {
        parsingError = jsonParseError;
    }

    public final void setValidCachedConfigExists(boolean z2) {
        validCachedConfigExists = z2;
    }

    public final void setVisibilityTrackerTraversalLimit(int i2) {
        visibilityTrackerTraversalLimit = i2;
    }

    public final void updateFields(AppConfig appConfig2) {
        Intrinsics.f(appConfig2, "appConfig");
        EnumSet<Endpoints.Sdk.Event> enumSetAllOf = EnumSet.allOf(Endpoints.Sdk.Event.class);
        Intrinsics.e(enumSetAllOf, "allOf(Sdk.Event::class.java)");
        appConfig = AppConfig.copy$default(appConfig2, null, null, 0, 0, 0L, getReportableMetricsEvents(enumSetAllOf, appConfig2.getMetricsEvents()), 0, 0, 0, 0, 0, 0L, false, 0, 0, 0L, 0, null, null, null, 0, 0L, 0, 8388575, null);
        partners = INSTANCE.compilePartners(JsonElementKt.getJsonObject(appConfig2.getCredentials()));
        List<Placement> placements = appConfig2.getPlacements();
        if (placements != null) {
            for (Placement placement : placements) {
                PlacementStorage placementStorage = PlacementStorage.INSTANCE;
                placementStorage.addRefreshTime(placement.getChartboostPlacement(), placement.getAutoRefreshRate());
                placementStorage.addQueueSize(placement.getChartboostPlacement(), placement.getQueueSize(), INSTANCE.getMaxQueueSize());
            }
        }
    }
}
