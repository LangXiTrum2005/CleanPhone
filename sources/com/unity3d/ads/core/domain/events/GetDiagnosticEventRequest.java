package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticTagKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u008a\u0001\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0086\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getSharedDataTimestamps", "<init>", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "", "", "tags", "", "intTags", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;", "getTags", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;", "tagString", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;", "getTag", "(Ljava/lang/String;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "diagnosticEventType", "customEventName", "", X3.i.X, "", CampaignEx.JSON_KEY_HB, "Lcom/google/protobuf/ByteString;", "opportunityId", "placement", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "tokenNumber", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "invoke", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Ljava/lang/Integer;)Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "Lfn/n0;", "uniqueId", "Lfn/n0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final n0 uniqueId;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        n.f(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = g.c(-1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DiagnosticEventRequestOuterClass.DiagnosticTagType getTag(String tagString) {
        switch (tagString.hashCode()) {
            case -2140823688:
                if (tagString.equals("cache_source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CACHE;
                }
                break;
            case -989163880:
                if (tagString.equals("protocol")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_PROTOCOL;
                }
                break;
            case -896505829:
                if (tagString.equals("source")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SOURCE;
                }
                break;
            case 116079:
                if (tagString.equals("url")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_HOST;
                }
                break;
            case 109757585:
                if (tagString.equals("state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_STATE;
                }
                break;
            case 123374419:
                if (tagString.equals("is_retry")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_IS_RETRY;
                }
                break;
            case 1439091211:
                if (tagString.equals("complete_state")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_COMPLETE_STATE;
                }
                break;
            case 2105542229:
                if (tagString.equals("size_kb")) {
                    return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_SIZE_KB;
                }
                break;
        }
        return DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM;
    }

    private final List<DiagnosticEventRequestOuterClass.DiagnosticTag> getTags(Map<String, String> tags, Map<String, Integer> intTags) {
        ArrayList arrayList = new ArrayList();
        if (tags != null) {
            ArrayList arrayList2 = new ArrayList(tags.size());
            for (Map.Entry<String, String> entry : tags.entrySet()) {
                DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.INSTANCE;
                DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
                n.e(builderNewBuilder, "newBuilder()");
                DiagnosticTagKt.Dsl dsl_create = companion._create(builderNewBuilder);
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag = getTag(entry.getKey());
                dsl_create.setType(tag);
                if (tag == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    dsl_create.setCustomTagType(entry.getKey());
                }
                dsl_create.setStringValue(entry.getValue());
                arrayList2.add(dsl_create._build());
            }
            arrayList.addAll(arrayList2);
        }
        if (intTags != null) {
            ArrayList arrayList3 = new ArrayList(intTags.size());
            for (Map.Entry<String, Integer> entry2 : intTags.entrySet()) {
                DiagnosticTagKt.Dsl.Companion companion2 = DiagnosticTagKt.Dsl.INSTANCE;
                DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builderNewBuilder2 = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
                n.e(builderNewBuilder2, "newBuilder()");
                DiagnosticTagKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
                DiagnosticEventRequestOuterClass.DiagnosticTagType tag2 = getTag(entry2.getKey());
                dsl_create2.setType(tag2);
                if (tag2 == DiagnosticEventRequestOuterClass.DiagnosticTagType.DIAGNOSTIC_TAG_TYPE_CUSTOM) {
                    dsl_create2.setCustomTagType(entry2.getKey());
                }
                dsl_create2.setIntValue(entry2.getValue().intValue());
                arrayList3.add(dsl_create2._build());
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String customEventName, Map<String, String> tags, Map<String, Integer> intTags, Double value, Boolean hb2, ByteString opportunityId, String placement, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, Integer tokenNumber) {
        a1 a1Var;
        Object value2;
        int iIntValue;
        n.f(diagnosticEventType, "diagnosticEventType");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.INSTANCE;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        LinkedHashMap linkedHashMapY = tags != null ? b0.Y(tags) : null;
        String strRemove = linkedHashMapY != null ? linkedHashMapY.remove("reason") : null;
        String strRemove2 = linkedHashMapY != null ? linkedHashMapY.remove("reason_debug") : null;
        n0 n0Var = this.uniqueId;
        do {
            a1Var = (a1) n0Var;
            value2 = a1Var.getValue();
            iIntValue = ((Number) value2).intValue() + 1;
        } while (!a1Var.c0(value2, Integer.valueOf(iIntValue)));
        dsl_create.setEventId(iIntValue);
        dsl_create.setEventType(diagnosticEventType);
        if (customEventName != null) {
            dsl_create.setCustomEventType(customEventName);
        }
        dsl_create.setTimestamps(this.getSharedDataTimestamps.invoke());
        if (value != null) {
            dsl_create.setTimeValue(value.doubleValue());
        }
        if (hb2 != null) {
            dsl_create.setIsHeaderBidding(hb2.booleanValue());
        }
        if (opportunityId != null) {
            dsl_create.setImpressionOpportunityId(opportunityId);
        }
        if (placement != null) {
            dsl_create.setPlacementId(placement);
        }
        if (adType != null) {
            dsl_create.setAdType(adType);
        }
        if (tokenNumber != null) {
            dsl_create.setHeaderBiddingTokenNumber(tokenNumber.intValue());
        }
        if (strRemove != null) {
            dsl_create.setReason(strRemove);
        }
        if (strRemove2 != null) {
            dsl_create.setReasonDebug(strRemove2);
        }
        dsl_create.addAllTags(dsl_create.getTags(), getTags(linkedHashMapY, intTags));
        return dsl_create._build();
    }
}
