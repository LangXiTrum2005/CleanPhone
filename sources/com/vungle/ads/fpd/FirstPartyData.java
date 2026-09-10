package com.vungle.ads.fpd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 32\u00020\u0001:\u000223Bm\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B\u0005¢\u0006\u0002\u0010\u0013J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020\u0005J!\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÇ\u0001R&\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0013R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0013R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083D¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0013R\u0011\u0010#\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00064"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData;", "", "seen1", "", "modelVersion", "", "_sessionContext", "Lcom/vungle/ads/fpd/SessionContext;", "_demographic", "Lcom/vungle/ads/fpd/Demographic;", "_location", "Lcom/vungle/ads/fpd/Location;", "_revenue", "Lcom/vungle/ads/fpd/Revenue;", "_customData", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/vungle/ads/fpd/SessionContext;Lcom/vungle/ads/fpd/Demographic;Lcom/vungle/ads/fpd/Location;Lcom/vungle/ads/fpd/Revenue;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "get_customData$annotations", "get_demographic$annotations", "get_location$annotations", "get_revenue$annotations", "get_sessionContext$annotations", "customData", "getCustomData", "()Ljava/util/Map;", "demographic", "getDemographic", "()Lcom/vungle/ads/fpd/Demographic;", "location", "getLocation", "()Lcom/vungle/ads/fpd/Location;", "getModelVersion$annotations", "revenue", "getRevenue", "()Lcom/vungle/ads/fpd/Revenue;", "sessionContext", "getSessionContext", "()Lcom/vungle/ads/fpd/SessionContext;", "clearAll", "", "debug", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final class FirstPartyData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Json JSON = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.vungle.ads.fpd.FirstPartyData$Companion$JSON$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JsonBuilder) obj);
            return Unit.f43263a;
        }

        public final void invoke(JsonBuilder Json) {
            Intrinsics.f(Json, "$this$Json");
            Json.setPrettyPrint(true);
            Json.setExplicitNulls(false);
            Json.setEncodeDefaults(false);
        }
    }, 1, null);
    private static final String MODEL_VERSION = "2.0";
    private Map<String, String> _customData;
    private volatile Demographic _demographic;
    private volatile Location _location;
    private volatile Revenue _revenue;
    private volatile SessionContext _sessionContext;
    private final String modelVersion;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/fpd/FirstPartyData$Companion;", "", "()V", "JSON", "Lkotlinx/serialization/json/Json;", "MODEL_VERSION", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/FirstPartyData;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FirstPartyData> serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FirstPartyData() {
        this.modelVersion = "2.0";
    }

    @SerialName("model_version")
    private static /* synthetic */ void getModelVersion$annotations() {
    }

    @SerialName("custom_data")
    private static /* synthetic */ void get_customData$annotations() {
    }

    @SerialName("demographic")
    private static /* synthetic */ void get_demographic$annotations() {
    }

    @SerialName("location")
    private static /* synthetic */ void get_location$annotations() {
    }

    @SerialName("revenue")
    private static /* synthetic */ void get_revenue$annotations() {
    }

    @SerialName("session_context")
    private static /* synthetic */ void get_sessionContext$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FirstPartyData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.a(self.modelVersion, "2.0")) {
            output.encodeStringElement(serialDesc, 0, self.modelVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self._sessionContext != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SessionContext$$serializer.INSTANCE, self._sessionContext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self._demographic != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Demographic$$serializer.INSTANCE, self._demographic);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self._location != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, Location$$serializer.INSTANCE, self._location);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self._revenue != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, Revenue$$serializer.INSTANCE, self._revenue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self._customData == null) {
            return;
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self._customData);
    }

    public final synchronized void clearAll() {
        try {
            this._sessionContext = null;
            this._demographic = null;
            this._revenue = null;
            this._location = null;
            Map<String, String> map = this._customData;
            if (map != null) {
                map.clear();
            }
            this._customData = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String debug() {
        Json json = JSON;
        KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.b(FirstPartyData.class));
        Intrinsics.d(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.encodeToString(kSerializerSerializer, this);
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this._demographic;
        if (demographic == null) {
            demographic = new Demographic();
            this._demographic = demographic;
        }
        return demographic;
    }

    public final synchronized Location getLocation() {
        Location location;
        location = this._location;
        if (location == null) {
            location = new Location();
            this._location = location;
        }
        return location;
    }

    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this._revenue;
        if (revenue == null) {
            revenue = new Revenue();
            this._revenue = revenue;
        }
        return revenue;
    }

    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this._sessionContext;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this._sessionContext = sessionContext;
        }
        return sessionContext;
    }

    @Deprecated
    public /* synthetic */ FirstPartyData(int i2, @SerialName("model_version") String str, @SerialName("session_context") SessionContext sessionContext, @SerialName("demographic") Demographic demographic, @SerialName("location") Location location, @SerialName("revenue") Revenue revenue, @SerialName("custom_data") Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.modelVersion = (i2 & 1) == 0 ? "2.0" : str;
        if ((i2 & 2) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = sessionContext;
        }
        if ((i2 & 4) == 0) {
            this._demographic = null;
        } else {
            this._demographic = demographic;
        }
        if ((i2 & 8) == 0) {
            this._location = null;
        } else {
            this._location = location;
        }
        if ((i2 & 16) == 0) {
            this._revenue = null;
        } else {
            this._revenue = revenue;
        }
        if ((i2 & 32) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }
}
