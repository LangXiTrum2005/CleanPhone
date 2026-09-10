package com.chartboost.heliumsdk.domain;

import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.uq;
import com.p004ironsource.x4;
import com.smartdigimkt.f3.b;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bW\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0084\u00012\u00020\u0001:\u0004\u0083\u0001\u0084\u0001B\u009d\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010!\u001a\u00020\u0003\u0012\b\b\u0001\u0010\"\u001a\u00020\u000b\u0012\b\b\u0001\u0010#\u001a\u00020\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010&B\u0081\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u0003¢\u0006\u0002\u0010'J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\t\u0010a\u001a\u00020\u0016HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u000bHÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u001cHÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eHÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u000bHÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\u0085\u0002\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u0003HÆ\u0001J\u0013\u0010u\u001a\u00020\u00162\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010w\u001a\u00020\u0016J\u0006\u0010x\u001a\u00020\u0016J\t\u0010y\u001a\u00020\u0003HÖ\u0001J\u0006\u0010z\u001a\u00020\u0005J\t\u0010{\u001a\u00020\u0005HÖ\u0001J$\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u00002\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001HÇ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010)\u001a\u0004\b+\u0010,R\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010)\u001a\u0004\b.\u0010/R\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010)\u001a\u0004\b1\u0010/R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010)\u001a\u0004\b3\u0010/R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010)\u001a\u0004\b5\u00106R\u001c\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010)\u001a\u0004\b8\u00109R\u001c\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010)\u001a\u0004\b;\u0010/R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010)\u001a\u0004\b=\u0010/R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010)\u001a\u0004\b?\u0010/R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010)\u001a\u0004\bA\u0010/R\u001e\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010)\u001a\u0004\bC\u0010,R\u001c\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010)\u001a\u0004\bE\u0010/R\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010)\u001a\u0004\bG\u0010HR\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010)\u001a\u0004\bJ\u0010/R$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010)\u001a\u0004\bL\u0010MR\u001c\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010)\u001a\u0004\bO\u00106R\u001c\u0010\"\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010)\u001a\u0004\bQ\u00106R\u001c\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010)\u001a\u0004\bS\u0010TR\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010)\u001a\u0004\bV\u0010/R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010)\u001a\u0004\bX\u0010/R\u001c\u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010)\u001a\u0004\bZ\u00106R\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010)\u001a\u0004\b\\\u0010/¨\u0006\u0085\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AppConfig;", "", "seen1", "", b.f35043u, "", "adapterClasses", "", "logLevel", "bannerLoadTimeoutSeconds", "bannerSizeEventDelayMs", "", "metricsEvents", "Ljava/util/EnumSet;", "Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "fullscreenLoadTimeoutSeconds", "showTimeoutSeconds", "startSdkTimeoutSeconds", "partnerInitTimeoutSeconds", "initializationMetricsPostTimeout", "prebidFetchTimeoutSeconds", "shouldNotifyLoads", "", "bannerImpressionMinVisibleDips", "bannerImpressionMinVisibleDurationMs", "visibilityTrackerPollIntervalMs", "visibilityTrackerTraversalLimit", "credentials", "Lkotlinx/serialization/json/JsonObject;", uq.f27440c, "", "Lcom/chartboost/heliumsdk/domain/Placement;", "logLevelString", "maxQueueSize", "queueAdTtlSeconds", "defaultQueueSize", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Set;IIJLjava/util/EnumSet;IIIIIJZIIJILkotlinx/serialization/json/JsonObject;Ljava/util/List;Ljava/lang/String;IJILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Set;IIJLjava/util/EnumSet;IIIIIJZIIJILkotlinx/serialization/json/JsonObject;Ljava/util/List;Ljava/lang/String;IJI)V", "getAdapterClasses$annotations", "()V", "getAppId$annotations", "getAppId", "()Ljava/lang/String;", "getBannerImpressionMinVisibleDips$annotations", "getBannerImpressionMinVisibleDips", "()I", "getBannerImpressionMinVisibleDurationMs$annotations", "getBannerImpressionMinVisibleDurationMs", "getBannerLoadTimeoutSeconds$annotations", "getBannerLoadTimeoutSeconds", "getBannerSizeEventDelayMs$annotations", "getBannerSizeEventDelayMs", "()J", "getCredentials$annotations", "getCredentials", "()Lkotlinx/serialization/json/JsonObject;", "getDefaultQueueSize$annotations", "getDefaultQueueSize", "getFullscreenLoadTimeoutSeconds$annotations", "getFullscreenLoadTimeoutSeconds", "getInitializationMetricsPostTimeout$annotations", "getInitializationMetricsPostTimeout", "getLogLevel$annotations", "getLogLevel", "getLogLevelString$annotations", "getLogLevelString", "getMaxQueueSize$annotations", "getMaxQueueSize", "getMetricsEvents$annotations", "getMetricsEvents", "()Ljava/util/EnumSet;", "getPartnerInitTimeoutSeconds$annotations", "getPartnerInitTimeoutSeconds", "getPlacements$annotations", "getPlacements", "()Ljava/util/List;", "getPrebidFetchTimeoutSeconds$annotations", "getPrebidFetchTimeoutSeconds", "getQueueAdTtlSeconds$annotations", "getQueueAdTtlSeconds", "getShouldNotifyLoads$annotations", "getShouldNotifyLoads", "()Z", "getShowTimeoutSeconds$annotations", "getShowTimeoutSeconds", "getStartSdkTimeoutSeconds$annotations", "getStartSdkTimeoutSeconds", "getVisibilityTrackerPollIntervalMs$annotations", "getVisibilityTrackerPollIntervalMs", "getVisibilityTrackerTraversalLimit$annotations", "getVisibilityTrackerTraversalLimit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hasMinimumAdapters", "hasMinimumCredentials", "hashCode", "toJsonString", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class AppConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Set<String> adapterClasses;
    private final String appId;
    private final int bannerImpressionMinVisibleDips;
    private final int bannerImpressionMinVisibleDurationMs;
    private final int bannerLoadTimeoutSeconds;
    private final long bannerSizeEventDelayMs;
    private final JsonObject credentials;
    private final int defaultQueueSize;
    private final int fullscreenLoadTimeoutSeconds;
    private final int initializationMetricsPostTimeout;
    private final int logLevel;
    private final String logLevelString;
    private final int maxQueueSize;
    private final EnumSet<Endpoints.Sdk.Event> metricsEvents;
    private final int partnerInitTimeoutSeconds;
    private final List<Placement> placements;
    private final long prebidFetchTimeoutSeconds;
    private final long queueAdTtlSeconds;
    private final boolean shouldNotifyLoads;
    private final int showTimeoutSeconds;
    private final int startSdkTimeoutSeconds;
    private final long visibilityTrackerPollIntervalMs;
    private final int visibilityTrackerTraversalLimit;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AppConfig$Companion;", "", "()V", "fromJsonString", "Lcom/chartboost/heliumsdk/domain/AppConfig;", "jsonString", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppConfig fromJsonString(String jsonString) {
            Intrinsics.f(jsonString, "jsonString");
            return (AppConfig) HeliumJsonKt.getHeliumJson().decodeFromString(AppConfig.INSTANCE.serializer(), jsonString);
        }

        public final KSerializer<AppConfig> serializer() {
            return AppConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AppConfig() {
        this((String) null, (Set) null, 0, 0, 0L, (EnumSet) null, 0, 0, 0, 0, 0, 0L, false, 0, 0, 0L, 0, (JsonObject) null, (List) null, (String) null, 0, 0L, 0, 8388607, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, Set set, int i2, int i3, long j, EnumSet enumSet, int i4, int i5, int i6, int i7, int i8, long j2, boolean z2, int i9, int i10, long j3, int i11, JsonObject jsonObject, List list, String str2, int i12, long j4, int i13, int i14, Object obj) {
        int i15;
        long j5;
        String str3 = (i14 & 1) != 0 ? appConfig.appId : str;
        Set set2 = (i14 & 2) != 0 ? appConfig.adapterClasses : set;
        int i16 = (i14 & 4) != 0 ? appConfig.logLevel : i2;
        int i17 = (i14 & 8) != 0 ? appConfig.bannerLoadTimeoutSeconds : i3;
        long j6 = (i14 & 16) != 0 ? appConfig.bannerSizeEventDelayMs : j;
        EnumSet enumSet2 = (i14 & 32) != 0 ? appConfig.metricsEvents : enumSet;
        int i18 = (i14 & 64) != 0 ? appConfig.fullscreenLoadTimeoutSeconds : i4;
        int i19 = (i14 & 128) != 0 ? appConfig.showTimeoutSeconds : i5;
        int i20 = (i14 & 256) != 0 ? appConfig.startSdkTimeoutSeconds : i6;
        int i21 = (i14 & 512) != 0 ? appConfig.partnerInitTimeoutSeconds : i7;
        int i22 = (i14 & 1024) != 0 ? appConfig.initializationMetricsPostTimeout : i8;
        long j7 = (i14 & a.f25965n) != 0 ? appConfig.prebidFetchTimeoutSeconds : j2;
        String str4 = str3;
        boolean z3 = (i14 & 4096) != 0 ? appConfig.shouldNotifyLoads : z2;
        int i23 = (i14 & Segment.SIZE) != 0 ? appConfig.bannerImpressionMinVisibleDips : i9;
        int i24 = (i14 & 16384) != 0 ? appConfig.bannerImpressionMinVisibleDurationMs : i10;
        long j8 = (i14 & 32768) != 0 ? appConfig.visibilityTrackerPollIntervalMs : j3;
        int i25 = (i14 & 65536) != 0 ? appConfig.visibilityTrackerTraversalLimit : i11;
        JsonObject jsonObject2 = (i14 & 131072) != 0 ? appConfig.credentials : jsonObject;
        int i26 = i25;
        List list2 = (i14 & 262144) != 0 ? appConfig.placements : list;
        String str5 = (i14 & 524288) != 0 ? appConfig.logLevelString : str2;
        int i27 = (i14 & 1048576) != 0 ? appConfig.maxQueueSize : i12;
        JsonObject jsonObject3 = jsonObject2;
        long j9 = (i14 & 2097152) != 0 ? appConfig.queueAdTtlSeconds : j4;
        if ((i14 & 4194304) != 0) {
            j5 = j9;
            i15 = appConfig.defaultQueueSize;
        } else {
            i15 = i13;
            j5 = j9;
        }
        return appConfig.copy(str4, set2, i16, i17, j6, enumSet2, i18, i19, i20, i21, i22, j7, z3, i23, i24, j8, i26, jsonObject3, list2, str5, i27, j5, i15);
    }

    @SerialName("adapter_classes")
    @Serializable
    public static /* synthetic */ void getAdapterClasses$annotations() {
    }

    @SerialName("app_id")
    public static /* synthetic */ void getAppId$annotations() {
    }

    @SerialName("banner_impression_min_visible_dips")
    public static /* synthetic */ void getBannerImpressionMinVisibleDips$annotations() {
    }

    @SerialName("banner_impression_min_visible_duration_ms")
    public static /* synthetic */ void getBannerImpressionMinVisibleDurationMs$annotations() {
    }

    @SerialName("banner_load_timeout")
    public static /* synthetic */ void getBannerLoadTimeoutSeconds$annotations() {
    }

    @SerialName("banner_size_event_delay_ms")
    public static /* synthetic */ void getBannerSizeEventDelayMs$annotations() {
    }

    @SerialName("credentials")
    public static /* synthetic */ void getCredentials$annotations() {
    }

    @SerialName("default_queue_size")
    public static /* synthetic */ void getDefaultQueueSize$annotations() {
    }

    @SerialName("fullscreen_load_timeout")
    public static /* synthetic */ void getFullscreenLoadTimeoutSeconds$annotations() {
    }

    @SerialName("init_metrics_post_timeout")
    public static /* synthetic */ void getInitializationMetricsPostTimeout$annotations() {
    }

    @SerialName("logging_level")
    public static /* synthetic */ void getLogLevel$annotations() {
    }

    @SerialName("log_level")
    public static /* synthetic */ void getLogLevelString$annotations() {
    }

    @SerialName("max_queue_size")
    public static /* synthetic */ void getMaxQueueSize$annotations() {
    }

    @SerialName("metrics_events")
    @Serializable(with = Endpoints.Sdk.Event.EventEnumSetSerializer.class)
    public static /* synthetic */ void getMetricsEvents$annotations() {
    }

    @SerialName("init_timeout")
    public static /* synthetic */ void getPartnerInitTimeoutSeconds$annotations() {
    }

    @SerialName(uq.f27440c)
    public static /* synthetic */ void getPlacements$annotations() {
    }

    @SerialName("prebid_fetch_timeout")
    public static /* synthetic */ void getPrebidFetchTimeoutSeconds$annotations() {
    }

    @SerialName("queued_ad_ttl")
    public static /* synthetic */ void getQueueAdTtlSeconds$annotations() {
    }

    @SerialName("should_notify_loads")
    public static /* synthetic */ void getShouldNotifyLoads$annotations() {
    }

    @SerialName("show_timeout")
    public static /* synthetic */ void getShowTimeoutSeconds$annotations() {
    }

    @SerialName("start_timeout")
    public static /* synthetic */ void getStartSdkTimeoutSeconds$annotations() {
    }

    @SerialName("visibility_tracker_poll_interval_ms")
    public static /* synthetic */ void getVisibilityTrackerPollIntervalMs$annotations() {
    }

    @SerialName("visibility_tracker_traversal_limit")
    public static /* synthetic */ void getVisibilityTrackerTraversalLimit$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    @JvmStatic
    public static final void write$Self(AppConfig self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeStringElement(serialDesc, 0, self.appId);
        } else {
            String str = self.appId;
            String appId = HeliumSdk.INSTANCE.getAppId();
            if (appId == null) {
                appId = "";
            }
            if (!Intrinsics.a(str, appId)) {
                output.encodeStringElement(serialDesc, 0, self.appId);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.a(self.adapterClasses, EmptySet.X)) {
            output.encodeSerializableElement(serialDesc, 1, new LinkedHashSetSerializer(StringSerializer.INSTANCE), self.adapterClasses);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.logLevel != 0) {
            output.encodeIntElement(serialDesc, 2, self.logLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.bannerLoadTimeoutSeconds != 15) {
            output.encodeIntElement(serialDesc, 3, self.bannerLoadTimeoutSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.bannerSizeEventDelayMs != 1000) {
            output.encodeLongElement(serialDesc, 4, self.bannerSizeEventDelayMs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5)) {
            output.encodeSerializableElement(serialDesc, 5, Endpoints.Sdk.Event.EventEnumSetSerializer.INSTANCE, self.metricsEvents);
        } else {
            EnumSet<Endpoints.Sdk.Event> enumSet = self.metricsEvents;
            EnumSet enumSetAllOf = EnumSet.allOf(Endpoints.Sdk.Event.class);
            Intrinsics.e(enumSetAllOf, "allOf(Endpoints.Sdk.Event::class.java)");
            if (!Intrinsics.a(enumSet, enumSetAllOf)) {
                output.encodeSerializableElement(serialDesc, 5, Endpoints.Sdk.Event.EventEnumSetSerializer.INSTANCE, self.metricsEvents);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.fullscreenLoadTimeoutSeconds != 30) {
            output.encodeIntElement(serialDesc, 6, self.fullscreenLoadTimeoutSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.showTimeoutSeconds != 5) {
            output.encodeIntElement(serialDesc, 7, self.showTimeoutSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.startSdkTimeoutSeconds != 20) {
            output.encodeIntElement(serialDesc, 8, self.startSdkTimeoutSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.partnerInitTimeoutSeconds != 1) {
            output.encodeIntElement(serialDesc, 9, self.partnerInitTimeoutSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.initializationMetricsPostTimeout != 10) {
            output.encodeIntElement(serialDesc, 10, self.initializationMetricsPostTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.prebidFetchTimeoutSeconds != 5) {
            output.encodeLongElement(serialDesc, 11, self.prebidFetchTimeoutSeconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !self.shouldNotifyLoads) {
            output.encodeBooleanElement(serialDesc, 12, self.shouldNotifyLoads);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.bannerImpressionMinVisibleDips != 1) {
            output.encodeIntElement(serialDesc, 13, self.bannerImpressionMinVisibleDips);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.bannerImpressionMinVisibleDurationMs != 0) {
            output.encodeIntElement(serialDesc, 14, self.bannerImpressionMinVisibleDurationMs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.visibilityTrackerPollIntervalMs != 100) {
            output.encodeLongElement(serialDesc, 15, self.visibilityTrackerPollIntervalMs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.visibilityTrackerTraversalLimit != 25) {
            output.encodeIntElement(serialDesc, 16, self.visibilityTrackerTraversalLimit);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || !Intrinsics.a(self.credentials, new JsonObjectBuilder().build())) {
            output.encodeSerializableElement(serialDesc, 17, JsonObjectSerializer.INSTANCE, self.credentials);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.placements != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, new ArrayListSerializer(Placement$$serializer.INSTANCE), self.placements);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.logLevelString != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.logLevelString);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.maxQueueSize != 5) {
            output.encodeIntElement(serialDesc, 20, self.maxQueueSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.queueAdTtlSeconds != com.smartdigimkt.o1.b.f37307P) {
            output.encodeLongElement(serialDesc, 21, self.queueAdTtlSeconds);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 22) && self.defaultQueueSize == 2) {
            return;
        }
        output.encodeIntElement(serialDesc, 22, self.defaultQueueSize);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPartnerInitTimeoutSeconds() {
        return this.partnerInitTimeoutSeconds;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getInitializationMetricsPostTimeout() {
        return this.initializationMetricsPostTimeout;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getPrebidFetchTimeoutSeconds() {
        return this.prebidFetchTimeoutSeconds;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getShouldNotifyLoads() {
        return this.shouldNotifyLoads;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getBannerImpressionMinVisibleDips() {
        return this.bannerImpressionMinVisibleDips;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getBannerImpressionMinVisibleDurationMs() {
        return this.bannerImpressionMinVisibleDurationMs;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getVisibilityTrackerPollIntervalMs() {
        return this.visibilityTrackerPollIntervalMs;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getVisibilityTrackerTraversalLimit() {
        return this.visibilityTrackerTraversalLimit;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final JsonObject getCredentials() {
        return this.credentials;
    }

    public final List<Placement> component19() {
        return this.placements;
    }

    public final Set<String> component2() {
        return this.adapterClasses;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getLogLevelString() {
        return this.logLevelString;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getQueueAdTtlSeconds() {
        return this.queueAdTtlSeconds;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getDefaultQueueSize() {
        return this.defaultQueueSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBannerLoadTimeoutSeconds() {
        return this.bannerLoadTimeoutSeconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBannerSizeEventDelayMs() {
        return this.bannerSizeEventDelayMs;
    }

    public final EnumSet<Endpoints.Sdk.Event> component6() {
        return this.metricsEvents;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFullscreenLoadTimeoutSeconds() {
        return this.fullscreenLoadTimeoutSeconds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getShowTimeoutSeconds() {
        return this.showTimeoutSeconds;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStartSdkTimeoutSeconds() {
        return this.startSdkTimeoutSeconds;
    }

    public final AppConfig copy(String appId, Set<String> adapterClasses, int logLevel, int bannerLoadTimeoutSeconds, long bannerSizeEventDelayMs, EnumSet<Endpoints.Sdk.Event> metricsEvents, int fullscreenLoadTimeoutSeconds, int showTimeoutSeconds, int startSdkTimeoutSeconds, int partnerInitTimeoutSeconds, int initializationMetricsPostTimeout, long prebidFetchTimeoutSeconds, boolean shouldNotifyLoads, int bannerImpressionMinVisibleDips, int bannerImpressionMinVisibleDurationMs, long visibilityTrackerPollIntervalMs, int visibilityTrackerTraversalLimit, JsonObject credentials, List<Placement> placements, String logLevelString, int maxQueueSize, long queueAdTtlSeconds, int defaultQueueSize) {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(adapterClasses, "adapterClasses");
        Intrinsics.f(metricsEvents, "metricsEvents");
        Intrinsics.f(credentials, "credentials");
        return new AppConfig(appId, adapterClasses, logLevel, bannerLoadTimeoutSeconds, bannerSizeEventDelayMs, metricsEvents, fullscreenLoadTimeoutSeconds, showTimeoutSeconds, startSdkTimeoutSeconds, partnerInitTimeoutSeconds, initializationMetricsPostTimeout, prebidFetchTimeoutSeconds, shouldNotifyLoads, bannerImpressionMinVisibleDips, bannerImpressionMinVisibleDurationMs, visibilityTrackerPollIntervalMs, visibilityTrackerTraversalLimit, credentials, placements, logLevelString, maxQueueSize, queueAdTtlSeconds, defaultQueueSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        return Intrinsics.a(this.appId, appConfig.appId) && Intrinsics.a(this.adapterClasses, appConfig.adapterClasses) && this.logLevel == appConfig.logLevel && this.bannerLoadTimeoutSeconds == appConfig.bannerLoadTimeoutSeconds && this.bannerSizeEventDelayMs == appConfig.bannerSizeEventDelayMs && Intrinsics.a(this.metricsEvents, appConfig.metricsEvents) && this.fullscreenLoadTimeoutSeconds == appConfig.fullscreenLoadTimeoutSeconds && this.showTimeoutSeconds == appConfig.showTimeoutSeconds && this.startSdkTimeoutSeconds == appConfig.startSdkTimeoutSeconds && this.partnerInitTimeoutSeconds == appConfig.partnerInitTimeoutSeconds && this.initializationMetricsPostTimeout == appConfig.initializationMetricsPostTimeout && this.prebidFetchTimeoutSeconds == appConfig.prebidFetchTimeoutSeconds && this.shouldNotifyLoads == appConfig.shouldNotifyLoads && this.bannerImpressionMinVisibleDips == appConfig.bannerImpressionMinVisibleDips && this.bannerImpressionMinVisibleDurationMs == appConfig.bannerImpressionMinVisibleDurationMs && this.visibilityTrackerPollIntervalMs == appConfig.visibilityTrackerPollIntervalMs && this.visibilityTrackerTraversalLimit == appConfig.visibilityTrackerTraversalLimit && Intrinsics.a(this.credentials, appConfig.credentials) && Intrinsics.a(this.placements, appConfig.placements) && Intrinsics.a(this.logLevelString, appConfig.logLevelString) && this.maxQueueSize == appConfig.maxQueueSize && this.queueAdTtlSeconds == appConfig.queueAdTtlSeconds && this.defaultQueueSize == appConfig.defaultQueueSize;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final int getBannerImpressionMinVisibleDips() {
        return this.bannerImpressionMinVisibleDips;
    }

    public final int getBannerImpressionMinVisibleDurationMs() {
        return this.bannerImpressionMinVisibleDurationMs;
    }

    public final int getBannerLoadTimeoutSeconds() {
        return this.bannerLoadTimeoutSeconds;
    }

    public final long getBannerSizeEventDelayMs() {
        return this.bannerSizeEventDelayMs;
    }

    public final JsonObject getCredentials() {
        return this.credentials;
    }

    public final int getDefaultQueueSize() {
        return this.defaultQueueSize;
    }

    public final int getFullscreenLoadTimeoutSeconds() {
        return this.fullscreenLoadTimeoutSeconds;
    }

    public final int getInitializationMetricsPostTimeout() {
        return this.initializationMetricsPostTimeout;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public final String getLogLevelString() {
        return this.logLevelString;
    }

    public final int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public final EnumSet<Endpoints.Sdk.Event> getMetricsEvents() {
        return this.metricsEvents;
    }

    public final int getPartnerInitTimeoutSeconds() {
        return this.partnerInitTimeoutSeconds;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final long getPrebidFetchTimeoutSeconds() {
        return this.prebidFetchTimeoutSeconds;
    }

    public final long getQueueAdTtlSeconds() {
        return this.queueAdTtlSeconds;
    }

    public final boolean getShouldNotifyLoads() {
        return this.shouldNotifyLoads;
    }

    public final int getShowTimeoutSeconds() {
        return this.showTimeoutSeconds;
    }

    public final int getStartSdkTimeoutSeconds() {
        return this.startSdkTimeoutSeconds;
    }

    public final long getVisibilityTrackerPollIntervalMs() {
        return this.visibilityTrackerPollIntervalMs;
    }

    public final int getVisibilityTrackerTraversalLimit() {
        return this.visibilityTrackerTraversalLimit;
    }

    public final boolean hasMinimumAdapters() {
        return !this.adapterClasses.isEmpty();
    }

    public final boolean hasMinimumCredentials() {
        return !this.credentials.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    public int hashCode() {
        int iB = androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.initializationMetricsPostTimeout, androidx.media3.extractor.text.ttml.a.a(this.partnerInitTimeoutSeconds, androidx.media3.extractor.text.ttml.a.a(this.startSdkTimeoutSeconds, androidx.media3.extractor.text.ttml.a.a(this.showTimeoutSeconds, androidx.media3.extractor.text.ttml.a.a(this.fullscreenLoadTimeoutSeconds, (this.metricsEvents.hashCode() + androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.bannerLoadTimeoutSeconds, androidx.media3.extractor.text.ttml.a.a(this.logLevel, (this.adapterClasses.hashCode() + (this.appId.hashCode() * 31)) * 31, 31), 31), 31, this.bannerSizeEventDelayMs)) * 31, 31), 31), 31), 31), 31), 31, this.prebidFetchTimeoutSeconds);
        boolean z2 = this.shouldNotifyLoads;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode = (this.credentials.hashCode() + androidx.media3.extractor.text.ttml.a.a(this.visibilityTrackerTraversalLimit, androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.bannerImpressionMinVisibleDurationMs, androidx.media3.extractor.text.ttml.a.a(this.bannerImpressionMinVisibleDips, (iB + r2) * 31, 31), 31), 31, this.visibilityTrackerPollIntervalMs), 31)) * 31;
        List<Placement> list = this.placements;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.logLevelString;
        return Integer.hashCode(this.defaultQueueSize) + androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.maxQueueSize, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.queueAdTtlSeconds);
    }

    public final String toJsonString() {
        return HeliumJsonKt.getHeliumJson().encodeToString(INSTANCE.serializer(), this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppConfig(appId=");
        sb.append(this.appId);
        sb.append(", adapterClasses=");
        sb.append(this.adapterClasses);
        sb.append(", logLevel=");
        sb.append(this.logLevel);
        sb.append(", bannerLoadTimeoutSeconds=");
        sb.append(this.bannerLoadTimeoutSeconds);
        sb.append(", bannerSizeEventDelayMs=");
        sb.append(this.bannerSizeEventDelayMs);
        sb.append(", metricsEvents=");
        sb.append(this.metricsEvents);
        sb.append(", fullscreenLoadTimeoutSeconds=");
        sb.append(this.fullscreenLoadTimeoutSeconds);
        sb.append(", showTimeoutSeconds=");
        sb.append(this.showTimeoutSeconds);
        sb.append(", startSdkTimeoutSeconds=");
        sb.append(this.startSdkTimeoutSeconds);
        sb.append(", partnerInitTimeoutSeconds=");
        sb.append(this.partnerInitTimeoutSeconds);
        sb.append(", initializationMetricsPostTimeout=");
        sb.append(this.initializationMetricsPostTimeout);
        sb.append(", prebidFetchTimeoutSeconds=");
        sb.append(this.prebidFetchTimeoutSeconds);
        sb.append(", shouldNotifyLoads=");
        sb.append(this.shouldNotifyLoads);
        sb.append(", bannerImpressionMinVisibleDips=");
        sb.append(this.bannerImpressionMinVisibleDips);
        sb.append(", bannerImpressionMinVisibleDurationMs=");
        sb.append(this.bannerImpressionMinVisibleDurationMs);
        sb.append(", visibilityTrackerPollIntervalMs=");
        sb.append(this.visibilityTrackerPollIntervalMs);
        sb.append(", visibilityTrackerTraversalLimit=");
        sb.append(this.visibilityTrackerTraversalLimit);
        sb.append(", credentials=");
        sb.append(this.credentials);
        sb.append(", placements=");
        sb.append(this.placements);
        sb.append(", logLevelString=");
        sb.append(this.logLevelString);
        sb.append(", maxQueueSize=");
        sb.append(this.maxQueueSize);
        sb.append(", queueAdTtlSeconds=");
        sb.append(this.queueAdTtlSeconds);
        sb.append(", defaultQueueSize=");
        return android.support.v4.media.a.p(sb, this.defaultQueueSize, ')');
    }

    @Deprecated
    public /* synthetic */ AppConfig(int i2, @SerialName("app_id") String str, @SerialName("adapter_classes") @Serializable Set set, @SerialName("logging_level") int i3, @SerialName("banner_load_timeout") int i4, @SerialName("banner_size_event_delay_ms") long j, @SerialName("metrics_events") @Serializable(with = Endpoints.Sdk.Event.EventEnumSetSerializer.class) EnumSet enumSet, @SerialName("fullscreen_load_timeout") int i5, @SerialName("show_timeout") int i6, @SerialName("start_timeout") int i7, @SerialName("init_timeout") int i8, @SerialName("init_metrics_post_timeout") int i9, @SerialName("prebid_fetch_timeout") long j2, @SerialName("should_notify_loads") boolean z2, @SerialName("banner_impression_min_visible_dips") int i10, @SerialName("banner_impression_min_visible_duration_ms") int i11, @SerialName("visibility_tracker_poll_interval_ms") long j3, @SerialName("visibility_tracker_traversal_limit") int i12, @SerialName("credentials") JsonObject jsonObject, @SerialName(uq.f27440c) List list, @SerialName("log_level") String str2, @SerialName("max_queue_size") int i13, @SerialName("queued_ad_ttl") long j4, @SerialName("default_queue_size") int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0 && (str = HeliumSdk.INSTANCE.getAppId()) == null) {
            str = "";
        }
        this.appId = str;
        if ((i2 & 2) == 0) {
            this.adapterClasses = EmptySet.X;
        } else {
            this.adapterClasses = set;
        }
        if ((i2 & 4) == 0) {
            this.logLevel = 0;
        } else {
            this.logLevel = i3;
        }
        if ((i2 & 8) == 0) {
            this.bannerLoadTimeoutSeconds = 15;
        } else {
            this.bannerLoadTimeoutSeconds = i4;
        }
        if ((i2 & 16) == 0) {
            this.bannerSizeEventDelayMs = 1000L;
        } else {
            this.bannerSizeEventDelayMs = j;
        }
        if ((i2 & 32) == 0) {
            EnumSet<Endpoints.Sdk.Event> enumSetAllOf = EnumSet.allOf(Endpoints.Sdk.Event.class);
            Intrinsics.e(enumSetAllOf, "allOf(Endpoints.Sdk.Event::class.java)");
            this.metricsEvents = enumSetAllOf;
        } else {
            this.metricsEvents = enumSet;
        }
        if ((i2 & 64) == 0) {
            this.fullscreenLoadTimeoutSeconds = 30;
        } else {
            this.fullscreenLoadTimeoutSeconds = i5;
        }
        if ((i2 & 128) == 0) {
            this.showTimeoutSeconds = 5;
        } else {
            this.showTimeoutSeconds = i6;
        }
        if ((i2 & 256) == 0) {
            this.startSdkTimeoutSeconds = 20;
        } else {
            this.startSdkTimeoutSeconds = i7;
        }
        if ((i2 & 512) == 0) {
            this.partnerInitTimeoutSeconds = 1;
        } else {
            this.partnerInitTimeoutSeconds = i8;
        }
        if ((i2 & 1024) == 0) {
            this.initializationMetricsPostTimeout = 10;
        } else {
            this.initializationMetricsPostTimeout = i9;
        }
        this.prebidFetchTimeoutSeconds = (i2 & a.f25965n) == 0 ? 5L : j2;
        if ((i2 & 4096) == 0) {
            this.shouldNotifyLoads = true;
        } else {
            this.shouldNotifyLoads = z2;
        }
        if ((i2 & Segment.SIZE) == 0) {
            this.bannerImpressionMinVisibleDips = 1;
        } else {
            this.bannerImpressionMinVisibleDips = i10;
        }
        if ((i2 & 16384) == 0) {
            this.bannerImpressionMinVisibleDurationMs = 0;
        } else {
            this.bannerImpressionMinVisibleDurationMs = i11;
        }
        this.visibilityTrackerPollIntervalMs = (32768 & i2) == 0 ? 100L : j3;
        this.visibilityTrackerTraversalLimit = (65536 & i2) == 0 ? 25 : i12;
        this.credentials = (131072 & i2) == 0 ? new JsonObjectBuilder().build() : jsonObject;
        if ((262144 & i2) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((524288 & i2) == 0) {
            this.logLevelString = null;
        } else {
            this.logLevelString = str2;
        }
        if ((1048576 & i2) == 0) {
            this.maxQueueSize = 5;
        } else {
            this.maxQueueSize = i13;
        }
        this.queueAdTtlSeconds = (2097152 & i2) == 0 ? com.smartdigimkt.o1.b.f37307P : j4;
        this.defaultQueueSize = (i2 & 4194304) == 0 ? 2 : i14;
    }

    public AppConfig(String appId, Set<String> adapterClasses, int i2, int i3, long j, EnumSet<Endpoints.Sdk.Event> metricsEvents, int i4, int i5, int i6, int i7, int i8, long j2, boolean z2, int i9, int i10, long j3, int i11, JsonObject credentials, List<Placement> list, String str, int i12, long j4, int i13) {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(adapterClasses, "adapterClasses");
        Intrinsics.f(metricsEvents, "metricsEvents");
        Intrinsics.f(credentials, "credentials");
        this.appId = appId;
        this.adapterClasses = adapterClasses;
        this.logLevel = i2;
        this.bannerLoadTimeoutSeconds = i3;
        this.bannerSizeEventDelayMs = j;
        this.metricsEvents = metricsEvents;
        this.fullscreenLoadTimeoutSeconds = i4;
        this.showTimeoutSeconds = i5;
        this.startSdkTimeoutSeconds = i6;
        this.partnerInitTimeoutSeconds = i7;
        this.initializationMetricsPostTimeout = i8;
        this.prebidFetchTimeoutSeconds = j2;
        this.shouldNotifyLoads = z2;
        this.bannerImpressionMinVisibleDips = i9;
        this.bannerImpressionMinVisibleDurationMs = i10;
        this.visibilityTrackerPollIntervalMs = j3;
        this.visibilityTrackerTraversalLimit = i11;
        this.credentials = credentials;
        this.placements = list;
        this.logLevelString = str;
        this.maxQueueSize = i12;
        this.queueAdTtlSeconds = j4;
        this.defaultQueueSize = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppConfig(String str, Set set, int i2, int i3, long j, EnumSet enumSet, int i4, int i5, int i6, int i7, int i8, long j2, boolean z2, int i9, int i10, long j3, int i11, JsonObject jsonObject, List list, String str2, int i12, long j4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        String appId;
        EnumSet enumSetAllOf;
        if ((i14 & 1) != 0) {
            appId = HeliumSdk.INSTANCE.getAppId();
            if (appId == null) {
                appId = "";
            }
        } else {
            appId = str;
        }
        Set set2 = (i14 & 2) != 0 ? EmptySet.X : set;
        int i15 = (i14 & 4) != 0 ? 0 : i2;
        int i16 = (i14 & 8) != 0 ? 15 : i3;
        long j5 = (i14 & 16) != 0 ? 1000L : j;
        if ((i14 & 32) != 0) {
            enumSetAllOf = EnumSet.allOf(Endpoints.Sdk.Event.class);
            Intrinsics.e(enumSetAllOf, "allOf(Endpoints.Sdk.Event::class.java)");
        } else {
            enumSetAllOf = enumSet;
        }
        this(appId, set2, i15, i16, j5, enumSetAllOf, (i14 & 64) != 0 ? 30 : i4, (i14 & 128) != 0 ? 5 : i5, (i14 & 256) != 0 ? 20 : i6, (i14 & 512) != 0 ? 1 : i7, (i14 & 1024) != 0 ? 10 : i8, (i14 & a.f25965n) != 0 ? 5L : j2, (i14 & 4096) != 0 ? true : z2, (i14 & Segment.SIZE) == 0 ? i9 : 1, (i14 & 16384) != 0 ? 0 : i10, (i14 & 32768) != 0 ? 100L : j3, (i14 & 65536) != 0 ? 25 : i11, (i14 & 131072) != 0 ? new JsonObjectBuilder().build() : jsonObject, (i14 & 262144) != 0 ? null : list, (i14 & 524288) == 0 ? str2 : null, (i14 & 1048576) != 0 ? 5 : i12, (i14 & 2097152) != 0 ? com.smartdigimkt.o1.b.f37307P : j4, (i14 & 4194304) != 0 ? 2 : i13);
    }
}
