package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HeaderBiddingTokenKt {
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 Û\u00012\u00020\u0001:\u0004Û\u0001Ü\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0011J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0011J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0011J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0011J\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0011J\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u000bJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0011J\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0011J\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0011J\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u000bJ\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0011J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u0011J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0011J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\r\u0010+\u001a\u00020\u000f¢\u0006\u0004\b+\u0010\u0011J\r\u0010,\u001a\u00020\t¢\u0006\u0004\b,\u0010\u000bJ\r\u0010-\u001a\u00020\u000f¢\u0006\u0004\b-\u0010\u0011J5\u00105\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/H\u0007¢\u0006\u0004\b3\u00104J6\u00107\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/H\u0087\n¢\u0006\u0004\b6\u00104J-\u0010:\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0006\u00101\u001a\u00020/H\u0007¢\u0006\u0004\b8\u00109J9\u0010?\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0;H\u0007¢\u0006\u0004\b=\u0010>J%\u0010B\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.H\u0007¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020\t¢\u0006\u0004\bC\u0010\u000bJ\r\u0010D\u001a\u00020\u000f¢\u0006\u0004\bD\u0010\u0011J\r\u0010E\u001a\u00020\t¢\u0006\u0004\bE\u0010\u000bJ\r\u0010F\u001a\u00020\t¢\u0006\u0004\bF\u0010\u000bJ\r\u0010G\u001a\u00020\u000f¢\u0006\u0004\bG\u0010\u0011J\r\u0010H\u001a\u00020\t¢\u0006\u0004\bH\u0010\u000bJ\r\u0010I\u001a\u00020\u000f¢\u0006\u0004\bI\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR$\u0010P\u001a\u00020K2\u0006\u00102\u001a\u00020K8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010V\u001a\u00020Q2\u0006\u00102\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010Y\u001a\u00020K2\u0006\u00102\u001a\u00020K8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR$\u0010_\u001a\u00020Z2\u0006\u00102\u001a\u00020Z8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010e\u001a\u00020`2\u0006\u00102\u001a\u00020`8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010k\u001a\u00020f2\u0006\u00102\u001a\u00020f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010q\u001a\u00020l2\u0006\u00102\u001a\u00020l8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010w\u001a\u00020r2\u0006\u00102\u001a\u00020r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010}\u001a\u00020x2\u0006\u00102\u001a\u00020x8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0018\u0010\u0080\u0001\u001a\u0004\u0018\u00010x*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR+\u0010\u0086\u0001\u001a\u00030\u0081\u00012\u0007\u00102\u001a\u00030\u0081\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010\u0089\u0001\u001a\u00020K2\u0006\u00102\u001a\u00020K8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010M\"\u0005\b\u0088\u0001\u0010OR(\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u008a\u0001\u0010\u0011\"\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u0093\u0001\u001a\u00030\u008e\u00012\u0007\u00102\u001a\u00030\u008e\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001b\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008e\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R+\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0007\u00102\u001a\u00030\u0097\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u0097\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R+\u0010¥\u0001\u001a\u00030 \u00012\u0007\u00102\u001a\u00030 \u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R'\u0010¨\u0001\u001a\u00020Q2\u0006\u00102\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¦\u0001\u0010S\"\u0005\b§\u0001\u0010UR+\u0010®\u0001\u001a\u00030©\u00012\u0007\u00102\u001a\u00030©\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\u0005\u0018\u00010©\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R+\u0010·\u0001\u001a\u00030²\u00012\u0007\u00102\u001a\u00030²\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R\u001b\u0010º\u0001\u001a\u0005\u0018\u00010²\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R(\u0010½\u0001\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b»\u0001\u0010\u0011\"\u0006\b¼\u0001\u0010\u008c\u0001R&\u0010À\u0001\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.8G¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R+\u0010Æ\u0001\u001a\u00030Á\u00012\u0007\u00102\u001a\u00030Á\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\u001b\u0010É\u0001\u001a\u0005\u0018\u00010Á\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R)\u0010Î\u0001\u001a\u00020/2\u0006\u00102\u001a\u00020/8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R+\u0010Ô\u0001\u001a\u00030Ï\u00012\u0007\u00102\u001a\u00030Ï\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R\u001b\u0010×\u0001\u001a\u0005\u0018\u00010Ï\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R)\u0010Ú\u0001\u001a\u00020/2\u0006\u00102\u001a\u00020/8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bØ\u0001\u0010Ë\u0001\"\u0006\bÙ\u0001\u0010Í\u0001¨\u0006Ý\u0001"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;)V", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "_build", "()Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "Lwj/r;", "clearTokenId", "()V", "clearTokenNumber", "clearSessionToken", "clearClientInfo", "", "hasClientInfo", "()Z", "clearTimestamps", "hasTimestamps", "clearSessionCounters", "hasSessionCounters", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearPii", "hasPii", "clearCampaignState", "hasCampaignState", "clearTcf", "hasTcf", "clearScarSignalsCollected", "hasScarSignalsCollected", "clearLimitedSessionToken", "hasLimitedSessionToken", "clearInitializationData", "hasInitializationData", "clearAdFormat", "hasAdFormat", "clearTestData", "hasTestData", "clearTokenCounters", "hasTokenCounters", "clearOfferwallEnabled", "hasOfferwallEnabled", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", X3.i.W, X3.i.X, "putExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setExtras", "set", "removeExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearExtras", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "clearMediationInfo", "hasMediationInfo", "clearPlacementId", "clearBannerSize", "hasBannerSize", "clearMediationAdUnitId", "hasMediationAdUnitId", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "Lcom/google/protobuf/ByteString;", "getTokenId", "()Lcom/google/protobuf/ByteString;", "setTokenId", "(Lcom/google/protobuf/ByteString;)V", "tokenId", "", "getTokenNumber", "()I", "setTokenNumber", "(I)V", "tokenNumber", "getSessionToken", "setSessionToken", "sessionToken", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "clientInfo", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "timestamps", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "pii", "getPiiOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "piiOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "campaignState", "getTcf", "setTcf", "tcf", "getScarSignalsCollected", "setScarSignalsCollected", "(Z)V", "scarSignalsCollected", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "limitedSessionToken", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionTokenOrNull", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "getInitializationData", "()Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "setInitializationData", "(Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;)V", "initializationData", "getInitializationDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "initializationDataOrNull", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "testData", "getTestDataOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testDataOrNull", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "getTokenCounters", "()Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "setTokenCounters", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;)V", "tokenCounters", "getTokenCountersOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "tokenCountersOrNull", "getOfferwallEnabled", "setOfferwallEnabled", "offerwallEnabled", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "mediationInfo", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "placementId", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getBannerSize", "()Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "setBannerSize", "(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;)V", "bannerSize", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSizeOrNull", "getMediationAdUnitId", "setMediationAdUnitId", "mediationAdUnitId", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl;", "builder", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/HeaderBiddingTokenKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingTokenBuild = this._builder.build();
            kotlin.jvm.internal.n.e(headerBiddingTokenBuild, "_builder.build()");
            return headerBiddingTokenBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            kotlin.jvm.internal.n.e(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            kotlin.jvm.internal.n.e(bannerSize, "_builder.getBannerSize()");
            return bannerSize;
        }

        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getBannerSizeOrNull(dsl._builder);
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            kotlin.jvm.internal.n.e(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            kotlin.jvm.internal.n.e(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            kotlin.jvm.internal.n.e(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            kotlin.jvm.internal.n.e(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this._builder.getInitializationData();
            kotlin.jvm.internal.n.e(initializationData, "_builder.getInitializationData()");
            return initializationData;
        }

        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
            kotlin.jvm.internal.n.e(limitedSessionToken, "_builder.getLimitedSessionToken()");
            return limitedSessionToken;
        }

        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
        }

        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            kotlin.jvm.internal.n.e(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            kotlin.jvm.internal.n.e(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            kotlin.jvm.internal.n.e(pii, "_builder.getPii()");
            return pii;
        }

        public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.n.e(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            kotlin.jvm.internal.n.e(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            kotlin.jvm.internal.n.e(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            kotlin.jvm.internal.n.e(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            kotlin.jvm.internal.n.e(tcf, "_builder.getTcf()");
            return tcf;
        }

        public final TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this._builder.getTestData();
            kotlin.jvm.internal.n.e(testData, "_builder.getTestData()");
            return testData;
        }

        public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            kotlin.jvm.internal.n.e(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this._builder.getTokenCounters();
            kotlin.jvm.internal.n.e(tokenCounters, "_builder.getTokenCounters()");
            return tokenCounters;
        }

        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            kotlin.jvm.internal.n.e(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(map, "map");
            this._builder.putAllExtras(map);
        }

        public final void putExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            this._builder.removeExtras(key);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setBannerSize(AdRequestOuterClass.BannerSize value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setBannerSize(value);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setInitializationData(InitializationDataOuterClass.InitializationData value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setInitializationData(value);
        }

        public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setLimitedSessionToken(value);
        }

        public final void setMediationAdUnitId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setOfferwallEnabled(boolean z10) {
            this._builder.setOfferwallEnabled(z10);
        }

        public final void setPii(PiiOuterClass.Pii value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPii(value);
        }

        public final void setPlacementId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setScarSignalsCollected(boolean z10) {
            this._builder.setScarSignalsCollected(z10);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setSessionToken(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSessionToken(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setTcf(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTcf(value);
        }

        public final void setTestData(TestDataOuterClass.TestData value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTestData(value);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTimestamps(value);
        }

        public final void setTokenCounters(HeaderBiddingTokenOuterClass.TokenCounters value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTokenCounters(value);
        }

        public final void setTokenId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTokenId(value);
        }

        public final void setTokenNumber(int i10) {
            this._builder.setTokenNumber(i10);
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
