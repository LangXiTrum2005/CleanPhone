package com.vungle.ads.internal.model;

import androidx.media3.extractor.text.ttml.a;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.uq;
import com.p004ironsource.x4;
import com.smartdigimkt.q0.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bW\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u0084\u00012\u00020\u0001:\u0014\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001B\u0083\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$Bï\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010%J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010VJ\u0010\u0010c\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010VJ\u0010\u0010e\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010f\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010g\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010h\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010i\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010k\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010l\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010s\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=Jø\u0001\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020\u00142\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\u0003HÖ\u0001J\t\u0010y\u001a\u00020\u0012HÖ\u0001J\"\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u00002\u0006\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u0001HÇ\u0001R&\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010'\u001a\u0004\b0\u00101R(\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u00107\u0012\u0004\b2\u0010'\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010'\u001a\u0004\b9\u0010:R \u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010>\u0012\u0004\b;\u0010'\u001a\u0004\b<\u0010=R(\u0010!\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010>\u0012\u0004\b?\u0010'\u001a\u0004\b@\u0010=\"\u0004\bA\u0010BR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010'\u001a\u0004\bD\u0010ER \u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010>\u0012\u0004\bF\u0010'\u001a\u0004\bG\u0010=R \u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010>\u0012\u0004\bH\u0010'\u001a\u0004\b\u0015\u0010=R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010'\u001a\u0004\bJ\u0010KR$\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010'\u001a\u0004\bM\u0010NR(\u0010 \u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010>\u0012\u0004\bO\u0010'\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010BR \u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010>\u0012\u0004\bR\u0010'\u001a\u0004\bS\u0010=R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010W\u0012\u0004\bT\u0010'\u001a\u0004\bU\u0010VR \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010W\u0012\u0004\bX\u0010'\u001a\u0004\bY\u0010VR \u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010>\u0012\u0004\bZ\u0010'\u001a\u0004\b[\u0010=R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010'\u001a\u0004\b]\u0010^R \u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010>\u0012\u0004\b_\u0010'\u001a\u0004\b`\u0010=¨\u0006\u008b\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload;", "", "seen1", "", "cleverCache", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "configSettings", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "endpoints", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "logMetricsSettings", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", uq.f27440c, "", "Lcom/vungle/ads/internal/model/Placement;", "userPrivacy", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "configExtension", "", "disableAdId", "", "isReportIncentivizedEnabled", "sessionTimeout", "waitForConnectivityForTPAT", "signalSessionTimeout", "signalsDisabled", "fpdEnabled", "rtaDebugging", "configLastValidatedTimestamp", "", "autoRedirect", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "retryPriorityTPATs", "enableOT", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAutoRedirect$annotations", "()V", "getAutoRedirect", "()Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "setAutoRedirect", "(Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;)V", "getCleverCache$annotations", "getCleverCache", "()Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "getConfigExtension$annotations", "getConfigExtension", "()Ljava/lang/String;", "getConfigLastValidatedTimestamp$annotations", "getConfigLastValidatedTimestamp", "()Ljava/lang/Long;", "setConfigLastValidatedTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getConfigSettings$annotations", "getConfigSettings", "()Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "getDisableAdId$annotations", "getDisableAdId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableOT$annotations", "getEnableOT", "setEnableOT", "(Ljava/lang/Boolean;)V", "getEndpoints$annotations", "getEndpoints", "()Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "getFpdEnabled$annotations", "getFpdEnabled", "isReportIncentivizedEnabled$annotations", "getLogMetricsSettings$annotations", "getLogMetricsSettings", "()Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "getPlacements$annotations", "getPlacements", "()Ljava/util/List;", "getRetryPriorityTPATs$annotations", "getRetryPriorityTPATs", "setRetryPriorityTPATs", "getRtaDebugging$annotations", "getRtaDebugging", "getSessionTimeout$annotations", "getSessionTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSignalSessionTimeout$annotations", "getSignalSessionTimeout", "getSignalsDisabled$annotations", "getSignalsDisabled", "getUserPrivacy$annotations", "getUserPrivacy", "()Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "getWaitForConnectivityForTPAT$annotations", "getWaitForConnectivityForTPAT", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload;", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "AutoRedirect", "CleverCache", "Companion", "ConfigSettings", "Endpoints", "GDPRSettings", "IABSettings", "LogMetricsSettings", "UserPrivacy", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final /* data */ class ConfigPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private AutoRedirect autoRedirect;
    private final CleverCache cleverCache;
    private final String configExtension;
    private Long configLastValidatedTimestamp;
    private final ConfigSettings configSettings;
    private final Boolean disableAdId;
    private Boolean enableOT;
    private final Endpoints endpoints;
    private final Boolean fpdEnabled;
    private final Boolean isReportIncentivizedEnabled;
    private final LogMetricsSettings logMetricsSettings;
    private final List<Placement> placements;
    private Boolean retryPriorityTPATs;
    private final Boolean rtaDebugging;
    private final Integer sessionTimeout;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final UserPrivacy userPrivacy;
    private final Boolean waitForConnectivityForTPAT;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "", "seen1", "", "allowAutoRedirect", "", "afterClickDuration", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "getAfterClickDuration$annotations", "()V", "getAfterClickDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAllowAutoRedirect$annotations", "getAllowAutoRedirect", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class AutoRedirect {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long afterClickDuration;
        private final Boolean allowAutoRedirect;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AutoRedirect> serializer() {
                return ConfigPayload$AutoRedirect$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AutoRedirect() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AutoRedirect copy$default(AutoRedirect autoRedirect, Boolean bool, Long l2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bool = autoRedirect.allowAutoRedirect;
            }
            if ((i2 & 2) != 0) {
                l2 = autoRedirect.afterClickDuration;
            }
            return autoRedirect.copy(bool, l2);
        }

        @SerialName("after_click_ms")
        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        @SerialName("allow_auto_redirect")
        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }

        @JvmStatic
        public static final void write$Self(AutoRedirect self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Long l2;
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.a(self.allowAutoRedirect, Boolean.FALSE)) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.allowAutoRedirect);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || (l2 = self.afterClickDuration) == null || l2.longValue() != Long.MAX_VALUE) {
                output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.afterClickDuration);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final AutoRedirect copy(Boolean allowAutoRedirect, Long afterClickDuration) {
            return new AutoRedirect(allowAutoRedirect, afterClickDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoRedirect)) {
                return false;
            }
            AutoRedirect autoRedirect = (AutoRedirect) other;
            return Intrinsics.a(this.allowAutoRedirect, autoRedirect.allowAutoRedirect) && Intrinsics.a(this.afterClickDuration, autoRedirect.afterClickDuration);
        }

        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l2 = this.afterClickDuration;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }

        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        @Deprecated
        public /* synthetic */ AutoRedirect(int i2, @SerialName("allow_auto_redirect") Boolean bool, @SerialName("after_click_ms") Long l2, SerializationConstructorMarker serializationConstructorMarker) {
            this.allowAutoRedirect = (i2 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i2 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l2;
            }
        }

        public AutoRedirect(Boolean bool, Long l2) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l2;
        }

        public /* synthetic */ AutoRedirect(Boolean bool, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Boolean.FALSE : bool, (i2 & 2) != 0 ? Long.MAX_VALUE : l2);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "", "seen1", "", "enabled", "", "diskSize", "", "diskPercentage", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)V", "getDiskPercentage$annotations", "()V", "getDiskPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDiskSize$annotations", "getDiskSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnabled$annotations", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class CleverCache {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer diskPercentage;
        private final Long diskSize;
        private final Boolean enabled;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CleverCache> serializer() {
                return ConfigPayload$CleverCache$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CleverCache() {
            this((Boolean) null, (Long) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Boolean bool, Long l2, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bool = cleverCache.enabled;
            }
            if ((i2 & 2) != 0) {
                l2 = cleverCache.diskSize;
            }
            if ((i2 & 4) != 0) {
                num = cleverCache.diskPercentage;
            }
            return cleverCache.copy(bool, l2, num);
        }

        @SerialName("disk_percentage")
        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        @SerialName("disk_size")
        public static /* synthetic */ void getDiskSize$annotations() {
        }

        @SerialName("enabled")
        public static /* synthetic */ void getEnabled$annotations() {
        }

        @JvmStatic
        public static final void write$Self(CleverCache self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Integer num;
            Long l2;
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.a(self.enabled, Boolean.FALSE)) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.enabled);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || (l2 = self.diskSize) == null || l2.longValue() != 1000) {
                output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.diskSize);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || (num = self.diskPercentage) == null || num.intValue() != 3) {
                output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.diskPercentage);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getDiskSize() {
            return this.diskSize;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final CleverCache copy(Boolean enabled, Long diskSize, Integer diskPercentage) {
            return new CleverCache(enabled, diskSize, diskPercentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CleverCache)) {
                return false;
            }
            CleverCache cleverCache = (CleverCache) other;
            return Intrinsics.a(this.enabled, cleverCache.enabled) && Intrinsics.a(this.diskSize, cleverCache.diskSize) && Intrinsics.a(this.diskPercentage, cleverCache.diskPercentage);
        }

        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final Long getDiskSize() {
            return this.diskSize;
        }

        public final Boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l2 = this.diskSize;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Integer num = this.diskPercentage;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        @Deprecated
        public /* synthetic */ CleverCache(int i2, @SerialName("enabled") Boolean bool, @SerialName("disk_size") Long l2, @SerialName("disk_percentage") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            this.enabled = (i2 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i2 & 2) == 0) {
                this.diskSize = 1000L;
            } else {
                this.diskSize = l2;
            }
            if ((i2 & 4) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public CleverCache(Boolean bool, Long l2, Integer num) {
            this.enabled = bool;
            this.diskSize = l2;
            this.diskPercentage = num;
        }

        public /* synthetic */ CleverCache(Boolean bool, Long l2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Boolean.FALSE : bool, (i2 & 2) != 0 ? 1000L : l2, (i2 & 4) != 0 ? 3 : num);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConfigPayload> serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "seen1", "", "refreshTime", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Long;)V", "getRefreshTime$annotations", "()V", "getRefreshTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class ConfigSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Long refreshTime;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ConfigSettings> serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ConfigSettings() {
            this((Long) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, Long l2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                l2 = configSettings.refreshTime;
            }
            return configSettings.copy(l2);
        }

        @SerialName("refresh_interval")
        public static /* synthetic */ void getRefreshTime$annotations() {
        }

        @JvmStatic
        public static final void write$Self(ConfigSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.refreshTime == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.refreshTime);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public final ConfigSettings copy(Long refreshTime) {
            return new ConfigSettings(refreshTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigSettings) && Intrinsics.a(this.refreshTime, ((ConfigSettings) other).refreshTime);
        }

        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l2 = this.refreshTime;
            if (l2 == null) {
                return 0;
            }
            return l2.hashCode();
        }

        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        @Deprecated
        public /* synthetic */ ConfigSettings(int i2, @SerialName("refresh_interval") Long l2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i2 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l2;
            }
        }

        public ConfigSettings(Long l2) {
            this.refreshTime = l2;
        }

        public /* synthetic */ ConfigSettings(Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : l2);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'HÇ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "", "seen1", "", "adsEndpoint", "", "riEndpoint", "errorLogsEndpoint", "metricsEndpoint", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdsEndpoint$annotations", "()V", "getAdsEndpoint", "()Ljava/lang/String;", "getErrorLogsEndpoint$annotations", "getErrorLogsEndpoint", "getMetricsEndpoint$annotations", "getMetricsEndpoint", "getRiEndpoint$annotations", "getRiEndpoint", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class Endpoints {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adsEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String riEndpoint;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Endpoints> serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i2 & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            if ((i2 & 4) != 0) {
                str3 = endpoints.errorLogsEndpoint;
            }
            if ((i2 & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            return endpoints.copy(str, str2, str3, str4);
        }

        @SerialName("ads")
        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        @SerialName("error_logs")
        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        @SerialName("metrics")
        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        @SerialName("ri")
        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        @JvmStatic
        public static final void write$Self(Endpoints self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.adsEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.adsEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.riEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.riEndpoint);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.errorLogsEndpoint != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.errorLogsEndpoint);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.metricsEndpoint == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.metricsEndpoint);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final Endpoints copy(String adsEndpoint, String riEndpoint, String errorLogsEndpoint, String metricsEndpoint) {
            return new Endpoints(adsEndpoint, riEndpoint, errorLogsEndpoint, metricsEndpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) other;
            return Intrinsics.a(this.adsEndpoint, endpoints.adsEndpoint) && Intrinsics.a(this.riEndpoint, endpoints.riEndpoint) && Intrinsics.a(this.errorLogsEndpoint, endpoints.errorLogsEndpoint) && Intrinsics.a(this.metricsEndpoint, endpoints.metricsEndpoint);
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Endpoints(adsEndpoint=");
            sb.append(this.adsEndpoint);
            sb.append(", riEndpoint=");
            sb.append(this.riEndpoint);
            sb.append(", errorLogsEndpoint=");
            sb.append(this.errorLogsEndpoint);
            sb.append(", metricsEndpoint=");
            return a.p(sb, this.metricsEndpoint, ')');
        }

        @Deprecated
        public /* synthetic */ Endpoints(int i2, @SerialName("ads") String str, @SerialName("ri") String str2, @SerialName("error_logs") String str3, @SerialName("metrics") String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i2 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i2 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i2 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i2 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
        }

        public Endpoints(String str, String str2, String str3, String str4) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223Ba\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003JV\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0004\u0010\u001d¨\u00064"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "", "seen1", "", "isCountryDataProtected", "", "consentTitle", "", "consentMessage", "consentMessageVersion", "buttonAccept", "buttonDeny", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonAccept$annotations", "()V", "getButtonAccept", "()Ljava/lang/String;", "getButtonDeny$annotations", "getButtonDeny", "getConsentMessage$annotations", "getConsentMessage", "getConsentMessageVersion$annotations", "getConsentMessageVersion", "getConsentTitle$annotations", "getConsentTitle", "isCountryDataProtected$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class GDPRSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final Boolean isCountryDataProtected;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<GDPRSettings> serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public GDPRSettings() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, Boolean bool, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bool = gDPRSettings.isCountryDataProtected;
            }
            if ((i2 & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            if ((i2 & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            if ((i2 & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            if ((i2 & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            if ((i2 & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            String str6 = str4;
            String str7 = str5;
            return gDPRSettings.copy(bool, str, str2, str3, str6, str7);
        }

        @SerialName("button_accept")
        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        @SerialName("button_deny")
        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        @SerialName("consent_message")
        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        @SerialName("consent_message_version")
        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        @SerialName("consent_title")
        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        @SerialName("is_country_data_protected")
        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }

        @JvmStatic
        public static final void write$Self(GDPRSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isCountryDataProtected != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isCountryDataProtected);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.consentTitle != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.consentTitle);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.consentMessage != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.consentMessage);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.consentMessageVersion != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.consentMessageVersion);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.buttonAccept != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.buttonAccept);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.buttonDeny == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.buttonDeny);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final GDPRSettings copy(Boolean isCountryDataProtected, String consentTitle, String consentMessage, String consentMessageVersion, String buttonAccept, String buttonDeny) {
            return new GDPRSettings(isCountryDataProtected, consentTitle, consentMessage, consentMessageVersion, buttonAccept, buttonDeny);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) other;
            return Intrinsics.a(this.isCountryDataProtected, gDPRSettings.isCountryDataProtected) && Intrinsics.a(this.consentTitle, gDPRSettings.consentTitle) && Intrinsics.a(this.consentMessage, gDPRSettings.consentMessage) && Intrinsics.a(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && Intrinsics.a(this.buttonAccept, gDPRSettings.buttonAccept) && Intrinsics.a(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GDPRSettings(isCountryDataProtected=");
            sb.append(this.isCountryDataProtected);
            sb.append(", consentTitle=");
            sb.append(this.consentTitle);
            sb.append(", consentMessage=");
            sb.append(this.consentMessage);
            sb.append(", consentMessageVersion=");
            sb.append(this.consentMessageVersion);
            sb.append(", buttonAccept=");
            sb.append(this.buttonAccept);
            sb.append(", buttonDeny=");
            return a.p(sb, this.buttonDeny, ')');
        }

        @Deprecated
        public /* synthetic */ GDPRSettings(int i2, @SerialName("is_country_data_protected") Boolean bool, @SerialName("consent_title") String str, @SerialName("consent_message") String str2, @SerialName("consent_message_version") String str3, @SerialName("button_accept") String str4, @SerialName("button_deny") String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i2 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i2 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i2 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i2 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i2 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i2 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001e\u001f B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\r\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "", "seen1", "", "tcfStatus", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;)V", "getTcfStatus$annotations", "()V", "getTcfStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "TcfStatus", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class IABSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer tcfStatus;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<IABSettings> serializer() {
                return ConfigPayload$IABSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "", "rawValue", "", "(Ljava/lang/String;II)V", "getRawValue", "()I", "ALLOW_ID", "DISABLE_ID", "LEGACY", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum TcfStatus {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final Map<Integer, TcfStatus> rawValueMap;
            private final int rawValue;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus$Companion;", "", "()V", "rawValueMap", "", "", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "fromRawValue", "rawValue", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final TcfStatus fromRawValue(Integer rawValue) {
                    return (TcfStatus) TcfStatus.rawValueMap.get(rawValue);
                }

                private Companion() {
                }
            }

            static {
                TcfStatus[] tcfStatusArrValues = values();
                int iH = MapsKt.h(tcfStatusArrValues.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
                for (TcfStatus tcfStatus : tcfStatusArrValues) {
                    linkedHashMap.put(Integer.valueOf(tcfStatus.rawValue), tcfStatus);
                }
                rawValueMap = linkedHashMap;
            }

            TcfStatus(int i2) {
                this.rawValue = i2;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        public IABSettings() {
            this((Integer) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        @SerialName("tcf_status")
        public static /* synthetic */ void getTcfStatus$annotations() {
        }

        @JvmStatic
        public static final void write$Self(IABSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.tcfStatus == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.tcfStatus);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public final IABSettings copy(Integer tcfStatus) {
            return new IABSettings(tcfStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IABSettings) && Intrinsics.a(this.tcfStatus, ((IABSettings) other).tcfStatus);
        }

        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        @Deprecated
        public /* synthetic */ IABSettings(int i2, @SerialName("tcf_status") Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i2 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public IABSettings(Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ IABSettings(Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J&\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "seen1", "", "errorLogLevel", "metricsEnabled", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getErrorLogLevel$annotations", "()V", "getErrorLogLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMetricsEnabled$annotations", "getMetricsEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class LogMetricsSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Integer errorLogLevel;
        private final Boolean metricsEnabled;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<LogMetricsSettings> serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public LogMetricsSettings() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, Integer num, Boolean bool, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                num = logMetricsSettings.errorLogLevel;
            }
            if ((i2 & 2) != 0) {
                bool = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(num, bool);
        }

        @SerialName("error_log_level")
        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        @SerialName("metrics_is_enabled")
        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }

        @JvmStatic
        public static final void write$Self(LogMetricsSettings self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.errorLogLevel != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.errorLogLevel);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.metricsEnabled == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.metricsEnabled);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public final LogMetricsSettings copy(Integer errorLogLevel, Boolean metricsEnabled) {
            return new LogMetricsSettings(errorLogLevel, metricsEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) other;
            return Intrinsics.a(this.errorLogLevel, logMetricsSettings.errorLogLevel) && Intrinsics.a(this.metricsEnabled, logMetricsSettings.metricsEnabled);
        }

        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        @Deprecated
        public /* synthetic */ LogMetricsSettings(int i2, @SerialName("error_log_level") Integer num, @SerialName("metrics_is_enabled") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i2 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i2 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public LogMetricsSettings(Integer num, Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ LogMetricsSettings(Integer num, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "", "seen1", "", "gdpr", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "iab", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;)V", "getGdpr$annotations", "()V", "getGdpr", "()Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "getIab$annotations", "getIab", "()Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Serializable
    public static final /* data */ class UserPrivacy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GDPRSettings gdpr;
        private final IABSettings iab;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<UserPrivacy> serializer() {
                return ConfigPayload$UserPrivacy$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public UserPrivacy() {
            this((GDPRSettings) null, (IABSettings) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ UserPrivacy copy$default(UserPrivacy userPrivacy, GDPRSettings gDPRSettings, IABSettings iABSettings, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                gDPRSettings = userPrivacy.gdpr;
            }
            if ((i2 & 2) != 0) {
                iABSettings = userPrivacy.iab;
            }
            return userPrivacy.copy(gDPRSettings, iABSettings);
        }

        @SerialName("gdpr")
        public static /* synthetic */ void getGdpr$annotations() {
        }

        @SerialName("iab")
        public static /* synthetic */ void getIab$annotations() {
        }

        @JvmStatic
        public static final void write$Self(UserPrivacy self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Intrinsics.f(self, "self");
            Intrinsics.f(output, "output");
            Intrinsics.f(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.gdpr != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, self.gdpr);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.iab == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, self.iab);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IABSettings getIab() {
            return this.iab;
        }

        public final UserPrivacy copy(GDPRSettings gdpr, IABSettings iab) {
            return new UserPrivacy(gdpr, iab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserPrivacy)) {
                return false;
            }
            UserPrivacy userPrivacy = (UserPrivacy) other;
            return Intrinsics.a(this.gdpr, userPrivacy.gdpr) && Intrinsics.a(this.iab, userPrivacy.iab);
        }

        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        public final IABSettings getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPRSettings gDPRSettings = this.gdpr;
            int iHashCode = (gDPRSettings == null ? 0 : gDPRSettings.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        @Deprecated
        public /* synthetic */ UserPrivacy(int i2, @SerialName("gdpr") GDPRSettings gDPRSettings, @SerialName("iab") IABSettings iABSettings, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i2 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gDPRSettings;
            }
            if ((i2 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings) {
            this.gdpr = gDPRSettings;
            this.iab = iABSettings;
        }

        public /* synthetic */ UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : gDPRSettings, (i2 & 2) != 0 ? null : iABSettings);
        }
    }

    public ConfigPayload() {
        this((CleverCache) null, (ConfigSettings) null, (Endpoints) null, (LogMetricsSettings) null, (List) null, (UserPrivacy) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (AutoRedirect) null, (Boolean) null, (Boolean) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigPayload copy$default(ConfigPayload configPayload, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l2, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i2, Object obj) {
        Boolean bool9;
        Boolean bool10;
        CleverCache cleverCache2 = (i2 & 1) != 0 ? configPayload.cleverCache : cleverCache;
        ConfigSettings configSettings2 = (i2 & 2) != 0 ? configPayload.configSettings : configSettings;
        Endpoints endpoints2 = (i2 & 4) != 0 ? configPayload.endpoints : endpoints;
        LogMetricsSettings logMetricsSettings2 = (i2 & 8) != 0 ? configPayload.logMetricsSettings : logMetricsSettings;
        List list2 = (i2 & 16) != 0 ? configPayload.placements : list;
        UserPrivacy userPrivacy2 = (i2 & 32) != 0 ? configPayload.userPrivacy : userPrivacy;
        String str2 = (i2 & 64) != 0 ? configPayload.configExtension : str;
        Boolean bool11 = (i2 & 128) != 0 ? configPayload.disableAdId : bool;
        Boolean bool12 = (i2 & 256) != 0 ? configPayload.isReportIncentivizedEnabled : bool2;
        Integer num3 = (i2 & 512) != 0 ? configPayload.sessionTimeout : num;
        Boolean bool13 = (i2 & 1024) != 0 ? configPayload.waitForConnectivityForTPAT : bool3;
        Integer num4 = (i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? configPayload.signalSessionTimeout : num2;
        Boolean bool14 = (i2 & 4096) != 0 ? configPayload.signalsDisabled : bool4;
        Boolean bool15 = (i2 & Segment.SIZE) != 0 ? configPayload.fpdEnabled : bool5;
        CleverCache cleverCache3 = cleverCache2;
        Boolean bool16 = (i2 & 16384) != 0 ? configPayload.rtaDebugging : bool6;
        Long l3 = (i2 & 32768) != 0 ? configPayload.configLastValidatedTimestamp : l2;
        AutoRedirect autoRedirect2 = (i2 & 65536) != 0 ? configPayload.autoRedirect : autoRedirect;
        Boolean bool17 = (i2 & 131072) != 0 ? configPayload.retryPriorityTPATs : bool7;
        if ((i2 & 262144) != 0) {
            bool10 = bool17;
            bool9 = configPayload.enableOT;
        } else {
            bool9 = bool8;
            bool10 = bool17;
        }
        return configPayload.copy(cleverCache3, configSettings2, endpoints2, logMetricsSettings2, list2, userPrivacy2, str2, bool11, bool12, num3, bool13, num4, bool14, bool15, bool16, l3, autoRedirect2, bool10, bool9);
    }

    @SerialName("auto_redirect")
    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    @SerialName("reuse_assets")
    public static /* synthetic */ void getCleverCache$annotations() {
    }

    @SerialName(Cookie.CONFIG_EXTENSION)
    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    @SerialName("config_last_validated_ts")
    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    @SerialName(b.i0)
    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    @SerialName(Cookie.COPPA_DISABLE_AD_ID)
    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    @SerialName("enable_ot")
    public static /* synthetic */ void getEnableOT$annotations() {
    }

    @SerialName("endpoints")
    public static /* synthetic */ void getEndpoints$annotations() {
    }

    @SerialName("fpd_enabled")
    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    @SerialName("log_metrics")
    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    @SerialName(uq.f27440c)
    public static /* synthetic */ void getPlacements$annotations() {
    }

    @SerialName("retry_prioritized_tpat")
    public static /* synthetic */ void getRetryPriorityTPATs$annotations() {
    }

    @SerialName("rta_debugging")
    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    @SerialName("session_timeout")
    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    @SerialName("sdk_session_timeout")
    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    @SerialName("signals_disabled")
    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    @SerialName("user")
    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    @SerialName("wait_for_connectivity_for_tpat")
    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    @SerialName("ri_enabled")
    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    @JvmStatic
    public static final void write$Self(ConfigPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cleverCache != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, self.cleverCache);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.configSettings != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, self.configSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.endpoints != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, self.endpoints);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.logMetricsSettings != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, self.logMetricsSettings);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.placements != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), self.placements);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.userPrivacy != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, self.userPrivacy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.configExtension != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.configExtension);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.a(self.disableAdId, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.disableAdId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.isReportIncentivizedEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.sessionTimeout != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.sessionTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.waitForConnectivityForTPAT != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, self.waitForConnectivityForTPAT);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.signalSessionTimeout != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.signalSessionTimeout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.signalsDisabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, self.signalsDisabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.fpdEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, BooleanSerializer.INSTANCE, self.fpdEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.rtaDebugging != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, BooleanSerializer.INSTANCE, self.rtaDebugging);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.configLastValidatedTimestamp != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, LongSerializer.INSTANCE, self.configLastValidatedTimestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.autoRedirect != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, self.autoRedirect);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.retryPriorityTPATs != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, BooleanSerializer.INSTANCE, self.retryPriorityTPATs);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && self.enableOT == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, self.enableOT);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> component5() {
        return this.placements;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConfigExtension() {
        return this.configExtension;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final ConfigPayload copy(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> placements, UserPrivacy userPrivacy, String configExtension, Boolean disableAdId, Boolean isReportIncentivizedEnabled, Integer sessionTimeout, Boolean waitForConnectivityForTPAT, Integer signalSessionTimeout, Boolean signalsDisabled, Boolean fpdEnabled, Boolean rtaDebugging, Long configLastValidatedTimestamp, AutoRedirect autoRedirect, Boolean retryPriorityTPATs, Boolean enableOT) {
        return new ConfigPayload(cleverCache, configSettings, endpoints, logMetricsSettings, placements, userPrivacy, configExtension, disableAdId, isReportIncentivizedEnabled, sessionTimeout, waitForConnectivityForTPAT, signalSessionTimeout, signalsDisabled, fpdEnabled, rtaDebugging, configLastValidatedTimestamp, autoRedirect, retryPriorityTPATs, enableOT);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) other;
        return Intrinsics.a(this.cleverCache, configPayload.cleverCache) && Intrinsics.a(this.configSettings, configPayload.configSettings) && Intrinsics.a(this.endpoints, configPayload.endpoints) && Intrinsics.a(this.logMetricsSettings, configPayload.logMetricsSettings) && Intrinsics.a(this.placements, configPayload.placements) && Intrinsics.a(this.userPrivacy, configPayload.userPrivacy) && Intrinsics.a(this.configExtension, configPayload.configExtension) && Intrinsics.a(this.disableAdId, configPayload.disableAdId) && Intrinsics.a(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && Intrinsics.a(this.sessionTimeout, configPayload.sessionTimeout) && Intrinsics.a(this.waitForConnectivityForTPAT, configPayload.waitForConnectivityForTPAT) && Intrinsics.a(this.signalSessionTimeout, configPayload.signalSessionTimeout) && Intrinsics.a(this.signalsDisabled, configPayload.signalsDisabled) && Intrinsics.a(this.fpdEnabled, configPayload.fpdEnabled) && Intrinsics.a(this.rtaDebugging, configPayload.rtaDebugging) && Intrinsics.a(this.configLastValidatedTimestamp, configPayload.configLastValidatedTimestamp) && Intrinsics.a(this.autoRedirect, configPayload.autoRedirect) && Intrinsics.a(this.retryPriorityTPATs, configPayload.retryPriorityTPATs) && Intrinsics.a(this.enableOT, configPayload.enableOT);
    }

    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        CleverCache cleverCache = this.cleverCache;
        int iHashCode = (cleverCache == null ? 0 : cleverCache.hashCode()) * 31;
        ConfigSettings configSettings = this.configSettings;
        int iHashCode2 = (iHashCode + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        Endpoints endpoints = this.endpoints;
        int iHashCode3 = (iHashCode2 + (endpoints == null ? 0 : endpoints.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        List<Placement> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserPrivacy userPrivacy = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (userPrivacy == null ? 0 : userPrivacy.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l2 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        AutoRedirect autoRedirect = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (autoRedirect == null ? 0 : autoRedirect.hashCode())) * 31;
        Boolean bool7 = this.retryPriorityTPATs;
        int iHashCode18 = (iHashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableOT;
        return iHashCode18 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(AutoRedirect autoRedirect) {
        this.autoRedirect = autoRedirect;
    }

    public final void setConfigLastValidatedTimestamp(Long l2) {
        this.configLastValidatedTimestamp = l2;
    }

    public final void setEnableOT(Boolean bool) {
        this.enableOT = bool;
    }

    public final void setRetryPriorityTPATs(Boolean bool) {
        this.retryPriorityTPATs = bool;
    }

    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", retryPriorityTPATs=" + this.retryPriorityTPATs + ", enableOT=" + this.enableOT + ')';
    }

    @Deprecated
    public /* synthetic */ ConfigPayload(int i2, @SerialName("reuse_assets") CleverCache cleverCache, @SerialName(b.i0) ConfigSettings configSettings, @SerialName("endpoints") Endpoints endpoints, @SerialName("log_metrics") LogMetricsSettings logMetricsSettings, @SerialName(uq.f27440c) List list, @SerialName("user") UserPrivacy userPrivacy, @SerialName(Cookie.CONFIG_EXTENSION) String str, @SerialName(Cookie.COPPA_DISABLE_AD_ID) Boolean bool, @SerialName("ri_enabled") Boolean bool2, @SerialName("session_timeout") Integer num, @SerialName("wait_for_connectivity_for_tpat") Boolean bool3, @SerialName("sdk_session_timeout") Integer num2, @SerialName("signals_disabled") Boolean bool4, @SerialName("fpd_enabled") Boolean bool5, @SerialName("rta_debugging") Boolean bool6, @SerialName("config_last_validated_ts") Long l2, @SerialName("auto_redirect") AutoRedirect autoRedirect, @SerialName("retry_prioritized_tpat") Boolean bool7, @SerialName("enable_ot") Boolean bool8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((i2 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = configSettings;
        }
        if ((i2 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i2 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i2 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i2 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = userPrivacy;
        }
        if ((i2 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i2 & 128) == 0) {
            this.disableAdId = Boolean.TRUE;
        } else {
            this.disableAdId = bool;
        }
        if ((i2 & 256) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i2 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i2 & 1024) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i2 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i2 & Segment.SIZE) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i2 & 16384) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i2) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l2;
        }
        if ((65536 & i2) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = autoRedirect;
        }
        if ((131072 & i2) == 0) {
            this.retryPriorityTPATs = null;
        } else {
            this.retryPriorityTPATs = bool7;
        }
        if ((i2 & 262144) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool8;
        }
    }

    public ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List<Placement> list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l2, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8) {
        this.cleverCache = cleverCache;
        this.configSettings = configSettings;
        this.endpoints = endpoints;
        this.logMetricsSettings = logMetricsSettings;
        this.placements = list;
        this.userPrivacy = userPrivacy;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l2;
        this.autoRedirect = autoRedirect;
        this.retryPriorityTPATs = bool7;
        this.enableOT = bool8;
    }

    public /* synthetic */ ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l2, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : cleverCache, (i2 & 2) != 0 ? null : configSettings, (i2 & 4) != 0 ? null : endpoints, (i2 & 8) != 0 ? null : logMetricsSettings, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : userPrivacy, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? Boolean.TRUE : bool, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : bool3, (i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : num2, (i2 & 4096) != 0 ? null : bool4, (i2 & Segment.SIZE) != 0 ? null : bool5, (i2 & 16384) != 0 ? null : bool6, (i2 & 32768) != 0 ? null : l2, (i2 & 65536) != 0 ? null : autoRedirect, (i2 & 131072) != 0 ? null : bool7, (i2 & 262144) != 0 ? null : bool8);
    }
}
