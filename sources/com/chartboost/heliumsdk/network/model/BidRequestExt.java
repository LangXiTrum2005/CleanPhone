package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.controllers.PartnerController;
import com.chartboost.heliumsdk.domain.AdapterInfo;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import java.util.LinkedHashMap;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002$%BW\b\u0016\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\nBm\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\"\b\u0001\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003\u0012\"\b\u0001\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BO\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0013J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R4\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR4\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006&"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestExt;", "", "adapters", "", "", "Lcom/chartboost/heliumsdk/domain/PartnerAdapter;", "bidTokens", "loadId", "initStatuses", "Lcom/chartboost/heliumsdk/controllers/PartnerController$PartnerInitializationStatus;", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "seen1", "", "activeBidders", "inactiveBidders", "heliumSdkRequestId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Map;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getActiveBidders$annotations", "()V", "getActiveBidders", "()Ljava/util/Map;", "getHeliumSdkRequestId$annotations", "getHeliumSdkRequestId", "()Ljava/lang/String;", "getInactiveBidders$annotations", "getInactiveBidders", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestExt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Map<String, String>> activeBidders;
    private final String heliumSdkRequestId;
    private final Map<String, Map<String, String>> inactiveBidders;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004H\u0002JT\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0004H\u0002Jh\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004H\u0002J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestExt$Companion;", "", "()V", "mapActiveBidders", "", "", "adapters", "Lcom/chartboost/heliumsdk/domain/PartnerAdapter;", "bidTokens", "initStatuses", "Lcom/chartboost/heliumsdk/controllers/PartnerController$PartnerInitializationStatus;", "mapAllBidders", "mapInactiveBidders", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestExt;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Map<String, String>> mapActiveBidders(Map<String, ? extends PartnerAdapter> adapters, Map<String, ? extends Map<String, String>> bidTokens, Map<String, ? extends PartnerController.PartnerInitializationStatus> initStatuses) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, String>> entry : BidRequestExt.INSTANCE.mapAllBidders(adapters, bidTokens).entrySet()) {
                if (initStatuses.get(entry.getKey()) == PartnerController.PartnerInitializationStatus.INITIALIZED) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }

        private final Map<String, Map<String, String>> mapAllBidders(Map<String, ? extends PartnerAdapter> adapters, Map<String, ? extends Map<String, String>> bidTokens) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends PartnerAdapter> entry : adapters.entrySet()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Map<String, String> map = bidTokens.get(entry.getKey());
                if (map != null) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                AdapterInfo adapterInfo = PartnerController.INSTANCE.getAdapterInfo().get(entry.getKey());
                if (adapterInfo != null) {
                    linkedHashMap2.put("version", adapterInfo.getPartnerVersion());
                    linkedHashMap2.put("adapter_version", adapterInfo.getAdapterVersion());
                }
                linkedHashMap.put(entry.getKey(), linkedHashMap2);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Map<String, String>> mapInactiveBidders(Map<String, ? extends PartnerAdapter> adapters, Map<String, ? extends Map<String, String>> bidTokens, Map<String, ? extends PartnerController.PartnerInitializationStatus> initStatuses) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, String>> entry : BidRequestExt.INSTANCE.mapAllBidders(adapters, bidTokens).entrySet()) {
                PartnerController.PartnerInitializationStatus partnerInitializationStatus = initStatuses.get(entry.getKey());
                if (partnerInitializationStatus != null && partnerInitializationStatus != PartnerController.PartnerInitializationStatus.INITIALIZED) {
                    String key = entry.getKey();
                    LinkedHashMap linkedHashMapS = MapsKt.s(entry.getValue());
                    linkedHashMapS.put("status", partnerInitializationStatus.name());
                    if (partnerInitializationStatus == PartnerController.PartnerInitializationStatus.FAILED) {
                        linkedHashMapS.put("status", "Initialization Failed");
                    }
                    linkedHashMap.put(key, linkedHashMapS);
                }
            }
            return linkedHashMap;
        }

        public final KSerializer<BidRequestExt> serializer() {
            return BidRequestExt$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestExt(int i2, @SerialName("bidders") Map map, @SerialName("inactive_bidders") Map map2, @SerialName("helium_sdk_request_id") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 7, BidRequestExt$$serializer.INSTANCE.getDescriptor());
        }
        this.activeBidders = map;
        this.inactiveBidders = map2;
        this.heliumSdkRequestId = str;
    }

    @SerialName("bidders")
    public static /* synthetic */ void getActiveBidders$annotations() {
    }

    @SerialName("helium_sdk_request_id")
    public static /* synthetic */ void getHeliumSdkRequestId$annotations() {
    }

    @SerialName("inactive_bidders")
    public static /* synthetic */ void getInactiveBidders$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, new LinkedHashMapSerializer(stringSerializer, new LinkedHashMapSerializer(stringSerializer, stringSerializer)), self.activeBidders);
        output.encodeSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(stringSerializer, new LinkedHashMapSerializer(stringSerializer, stringSerializer)), self.inactiveBidders);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.heliumSdkRequestId);
    }

    public final Map<String, Map<String, String>> getActiveBidders() {
        return this.activeBidders;
    }

    public final String getHeliumSdkRequestId() {
        return this.heliumSdkRequestId;
    }

    public final Map<String, Map<String, String>> getInactiveBidders() {
        return this.inactiveBidders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BidRequestExt(Map<String, ? extends Map<String, String>> activeBidders, Map<String, ? extends Map<String, String>> inactiveBidders, String str) {
        Intrinsics.f(activeBidders, "activeBidders");
        Intrinsics.f(inactiveBidders, "inactiveBidders");
        this.activeBidders = activeBidders;
        this.inactiveBidders = inactiveBidders;
        this.heliumSdkRequestId = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BidRequestExt(Map<String, ? extends PartnerAdapter> adapters, Map<String, ? extends Map<String, String>> bidTokens, String loadId, Map<String, ? extends PartnerController.PartnerInitializationStatus> initStatuses) {
        Intrinsics.f(adapters, "adapters");
        Intrinsics.f(bidTokens, "bidTokens");
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(initStatuses, "initStatuses");
        Companion companion = INSTANCE;
        this(companion.mapActiveBidders(adapters, bidTokens, initStatuses), companion.mapInactiveBidders(adapters, bidTokens, initStatuses), loadId);
    }
}
