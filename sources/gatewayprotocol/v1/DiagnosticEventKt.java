package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class DiagnosticEventKt {
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 ª\u00012\u00020\u0001:\bª\u0001«\u0001¬\u0001\u00ad\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u000fJ5\u0010\u001b\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001d\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001aJ-\u0010 \u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010%\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150!H\u0007¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b&\u0010'J5\u0010\u001b\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,J6\u0010\u001d\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020)H\u0087\n¢\u0006\u0004\b-\u0010,J-\u0010 \u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b.\u0010\u001fJ9\u0010%\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)0!H\u0007¢\u0006\u0004\b/\u0010$J%\u0010(\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0014H\u0007¢\u0006\u0004\b0\u0010'J\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000bJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b3\u0010\u000fJ\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b5\u0010\u000fJ\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b7\u0010\u000fJ\r\u00108\u001a\u00020\t¢\u0006\u0004\b8\u0010\u000bJ\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010\u000fJ\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\r¢\u0006\u0004\b;\u0010\u000fJ\r\u0010<\u001a\u00020\t¢\u0006\u0004\b<\u0010\u000bJ\r\u0010=\u001a\u00020\r¢\u0006\u0004\b=\u0010\u000fJ\r\u0010>\u001a\u00020\t¢\u0006\u0004\b>\u0010\u000bJ\r\u0010?\u001a\u00020\r¢\u0006\u0004\b?\u0010\u000fJ\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\r¢\u0006\u0004\bA\u0010\u000fJ\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020\r¢\u0006\u0004\bC\u0010\u000fJ'\u0010I\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0D2\u0006\u0010\u0018\u001a\u00020EH\u0007¢\u0006\u0004\bG\u0010HJ(\u0010K\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0D2\u0006\u0010\u0018\u001a\u00020EH\u0087\n¢\u0006\u0004\bJ\u0010HJ-\u0010P\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0D2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020E0LH\u0007¢\u0006\u0004\bN\u0010OJ.\u0010K\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0D2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020E0LH\u0087\n¢\u0006\u0004\bQ\u0010OJ0\u0010\u001d\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0D2\u0006\u0010R\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020EH\u0087\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010(\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0DH\u0007¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR$\u0010]\u001a\u00020X2\u0006\u0010\u0018\u001a\u00020X8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010b\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010g\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010m\u001a\u00020h2\u0006\u0010\u0018\u001a\u00020h8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010s\u001a\u00020n2\u0006\u0010\u0018\u001a\u00020n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR#\u0010v\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148G¢\u0006\u0006\u001a\u0004\bt\u0010uR#\u0010x\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00148G¢\u0006\u0006\u001a\u0004\bw\u0010uR$\u0010{\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010_\"\u0004\bz\u0010aR&\u0010\u0081\u0001\u001a\u00020|2\u0006\u0010\u0018\u001a\u00020|8G@GX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0084\u0001\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010d\"\u0005\b\u0083\u0001\u0010fR+\u0010\u008a\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0018\u001a\u00030\u0085\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u008d\u0001\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010_\"\u0005\b\u008c\u0001\u0010aR(\u0010\u0091\u0001\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u008e\u0001\u0010\u000f\"\u0006\b\u008f\u0001\u0010\u0090\u0001R'\u0010\u0094\u0001\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010_\"\u0005\b\u0093\u0001\u0010aR+\u0010\u009a\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0018\u001a\u00030\u0095\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009d\u0001\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020)8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009b\u0001\u0010_\"\u0005\b\u009c\u0001\u0010aR'\u0010 \u0001\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u0010d\"\u0005\b\u009f\u0001\u0010fR'\u0010£\u0001\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¡\u0001\u0010d\"\u0005\b¢\u0001\u0010fR(\u0010¦\u0001\u001a\u00020|2\u0006\u0010\u0018\u001a\u00020|8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¤\u0001\u0010~\"\u0006\b¥\u0001\u0010\u0080\u0001R \u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020F0D8F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001¨\u0006®\u0001"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "_build", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "Lwj/r;", "clearEventType", "()V", "clearCustomEventType", "", "hasCustomEventType", "()Z", "clearTimestamps", "hasTimestamps", "clearTimeValue", "hasTimeValue", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", X3.i.W, X3.i.X, "putStringTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setStringTags", "set", "removeStringTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllStringTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearStringTags", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "putIntTags", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;I)V", "setIntTags", "removeIntTags", "putAllIntTags", "clearIntTags", "clearEventId", "clearImpressionOpportunityId", "hasImpressionOpportunityId", "clearPlacementId", "hasPlacementId", "clearAdType", "hasAdType", "clearIsHeaderBidding", "hasIsHeaderBidding", "clearHeaderBiddingTokenNumber", "hasHeaderBiddingTokenNumber", "clearAdFormat", "hasAdFormat", "clearReason", "hasReason", "clearReasonDebug", "hasReasonDebug", "clearErrorToken", "hasErrorToken", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$TagsProxy;", "addTags", "(Lcom/google/protobuf/kotlin/DslList;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;)V", "add", "plusAssignTags", "plusAssign", "", "values", "addAllTags", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllTags", "index", "setTags", "(Lcom/google/protobuf/kotlin/DslList;ILgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;)V", "clearTags", "(Lcom/google/protobuf/kotlin/DslList;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "getEventType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "setEventType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;)V", "eventType", "getEventTypeValue", "()I", "setEventTypeValue", "(I)V", "eventTypeValue", "getCustomEventType", "()Ljava/lang/String;", "setCustomEventType", "(Ljava/lang/String;)V", "customEventType", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "timestamps", "", "getTimeValue", "()D", "setTimeValue", "(D)V", "timeValue", "getStringTagsMap", "()Lcom/google/protobuf/kotlin/DslMap;", "stringTags", "getIntTagsMap", "intTags", "getEventId", "setEventId", "eventId", "Lcom/google/protobuf/ByteString;", "getImpressionOpportunityId", "()Lcom/google/protobuf/ByteString;", "setImpressionOpportunityId", "(Lcom/google/protobuf/ByteString;)V", "impressionOpportunityId", "getPlacementId", "setPlacementId", "placementId", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "setAdType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;)V", "adType", "getAdTypeValue", "setAdTypeValue", "adTypeValue", "getIsHeaderBidding", "setIsHeaderBidding", "(Z)V", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "getHeaderBiddingTokenNumber", "setHeaderBiddingTokenNumber", "headerBiddingTokenNumber", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "getReason", "setReason", "reason", "getReasonDebug", "setReasonDebug", "reasonDebug", "getErrorToken", "setErrorToken", "errorToken", "getTags", "()Lcom/google/protobuf/kotlin/DslList;", "tags", "Companion", "IntTagsProxy", "StringTagsProxy", "TagsProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticEventKt$Dsl;", "builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$IntTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$StringTagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/DiagnosticEventKt$Dsl$TagsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class TagsProxy extends DslProxy {
            private TagsProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEventBuild = this._builder.build();
            kotlin.jvm.internal.n.e(diagnosticEventBuild, "_builder.build()");
            return diagnosticEventBuild;
        }

        public final /* synthetic */ void addAllTags(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllTags(values);
        }

        public final /* synthetic */ void addTags(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTag value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addTags(value);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearHeaderBiddingTokenNumber() {
            this._builder.clearHeaderBiddingTokenNumber();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearReasonDebug() {
            this._builder.clearReasonDebug();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            this._builder.clearStringTags();
        }

        public final /* synthetic */ void clearTags(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            kotlin.jvm.internal.n.e(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            kotlin.jvm.internal.n.e(adType, "_builder.getAdType()");
            return adType;
        }

        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            kotlin.jvm.internal.n.e(customEventType, "_builder.getCustomEventType()");
            return customEventType;
        }

        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            kotlin.jvm.internal.n.e(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            kotlin.jvm.internal.n.e(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final int getHeaderBiddingTokenNumber() {
            return this._builder.getHeaderBiddingTokenNumber();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            kotlin.jvm.internal.n.e(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            kotlin.jvm.internal.n.e(intTagsMap, "_builder.getIntTagsMap()");
            return new DslMap(intTagsMap);
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.n.e(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final String getReason() {
            String reason = this._builder.getReason();
            kotlin.jvm.internal.n.e(reason, "_builder.getReason()");
            return reason;
        }

        public final String getReasonDebug() {
            String reasonDebug = this._builder.getReasonDebug();
            kotlin.jvm.internal.n.e(reasonDebug, "_builder.getReasonDebug()");
            return reasonDebug;
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            kotlin.jvm.internal.n.e(stringTagsMap, "_builder.getStringTagsMap()");
            return new DslMap(stringTagsMap);
        }

        public final /* synthetic */ DslList getTags() {
            List<DiagnosticEventRequestOuterClass.DiagnosticTag> tagsList = this._builder.getTagsList();
            kotlin.jvm.internal.n.e(tagsList, "_builder.getTagsList()");
            return new DslList(tagsList);
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            kotlin.jvm.internal.n.e(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasErrorToken() {
            return this._builder.hasErrorToken();
        }

        public final boolean hasHeaderBiddingTokenNumber() {
            return this._builder.hasHeaderBiddingTokenNumber();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasReason() {
            return this._builder.hasReason();
        }

        public final boolean hasReasonDebug() {
            return this._builder.hasReasonDebug();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void plusAssignAllTags(DslList<DiagnosticEventRequestOuterClass.DiagnosticTag, TagsProxy> dslList, Iterable<DiagnosticEventRequestOuterClass.DiagnosticTag> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllTags(dslList, values);
        }

        public final /* synthetic */ void plusAssignTags(DslList<DiagnosticEventRequestOuterClass.DiagnosticTag, TagsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticTag value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addTags(dslList, value);
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(map, "map");
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(map, "map");
            this._builder.putAllStringTags(map);
        }

        public final void putIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i10) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            this._builder.putIntTags(key, i10);
        }

        public final void putStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.putStringTags(key, value);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String key) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            this._builder.removeIntTags(key);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String key) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            this._builder.removeStringTags(key);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setAdType(DiagnosticEventRequestOuterClass.DiagnosticAdType value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdType(value);
        }

        public final void setAdTypeValue(int i10) {
            this._builder.setAdTypeValue(i10);
        }

        public final void setCustomEventType(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCustomEventType(value);
        }

        public final void setErrorToken(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setErrorToken(value);
        }

        public final void setEventId(int i10) {
            this._builder.setEventId(i10);
        }

        public final void setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setEventType(value);
        }

        public final void setEventTypeValue(int i10) {
            this._builder.setEventTypeValue(i10);
        }

        public final void setHeaderBiddingTokenNumber(int i10) {
            this._builder.setHeaderBiddingTokenNumber(i10);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i10) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            putIntTags(dslMap, key, i10);
        }

        public final void setIsHeaderBidding(boolean z10) {
            this._builder.setIsHeaderBidding(z10);
        }

        public final void setPlacementId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setReason(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setReason(value);
        }

        public final void setReasonDebug(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setReasonDebug(value);
        }

        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            putStringTags(dslMap, key, value);
        }

        public final /* synthetic */ void setTags(DslList dslList, int i10, DiagnosticEventRequestOuterClass.DiagnosticTag value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTags(i10, value);
        }

        public final void setTimeValue(double d10) {
            this._builder.setTimeValue(d10);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTimestamps(value);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventKt() {
    }
}
