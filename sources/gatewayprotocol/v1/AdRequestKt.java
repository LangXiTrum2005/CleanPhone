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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdRequestKt {
    public static final AdRequestKt INSTANCE = new AdRequestKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u009a\u00012\u00020\u0001:\u0004\u009a\u0001\u009b\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ5\u0010,\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0007¢\u0006\u0004\b*\u0010+J6\u0010.\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0087\n¢\u0006\u0004\b-\u0010+J-\u00101\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010(\u001a\u00020&H\u0007¢\u0006\u0004\b/\u00100J9\u00106\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&02H\u0007¢\u0006\u0004\b4\u00105J%\u00109\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0007¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\f¢\u0006\u0004\b;\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R$\u0010B\u001a\u00020=2\u0006\u0010)\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u00020C2\u0006\u0010)\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010N\u001a\u00020I2\u0006\u0010)\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010T\u001a\u00020O2\u0006\u0010)\u001a\u00020O8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010Z\u001a\u00020U2\u0006\u0010)\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010_\u001a\u00020&2\u0006\u0010)\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010c\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\u000e\"\u0004\ba\u0010bR$\u0010f\u001a\u00020U2\u0006\u0010)\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR$\u0010l\u001a\u00020g2\u0006\u0010)\u001a\u00020g8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010o\u001a\u00020U2\u0006\u0010)\u001a\u00020U8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010W\"\u0004\bn\u0010YR$\u0010u\u001a\u00020p2\u0006\u0010)\u001a\u00020p8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010x\u001a\u00020g2\u0006\u0010)\u001a\u00020g8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010i\"\u0004\bw\u0010kR$\u0010~\u001a\u00020y2\u0006\u0010)\u001a\u00020y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0019\u0010\u0081\u0001\u001a\u0004\u0018\u00010y*\u00020\u00008F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0087\u0001\u001a\u00030\u0082\u00012\u0007\u0010)\u001a\u00030\u0082\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u008a\u0001\u001a\u00020g2\u0006\u0010)\u001a\u00020g8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010i\"\u0005\b\u0089\u0001\u0010kR'\u0010\u008d\u0001\u001a\u00020&2\u0006\u0010)\u001a\u00020&8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010\\\"\u0005\b\u008c\u0001\u0010^R&\u0010\u0090\u0001\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8G¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R+\u0010\u0096\u0001\u001a\u00030\u0091\u00012\u0007\u0010)\u001a\u00030\u0091\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0091\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009c\u0001"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl;", "", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;)V", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "_build", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "Lwj/r;", "clearSessionCounters", "()V", "", "hasSessionCounters", "()Z", "clearStaticDeviceInfo", "hasStaticDeviceInfo", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "clearCampaignState", "hasCampaignState", "clearImpressionOpportunityId", "clearPlacementId", "clearRequestImpressionConfiguration", "clearScarSignal", "clearWebviewVersion", "hasWebviewVersion", "clearTcf", "hasTcf", "clearAdRequestType", "hasAdRequestType", "clearBannerSize", "hasBannerSize", "clearAdFormat", "hasAdFormat", "clearMediationAdUnitId", "hasMediationAdUnitId", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", X3.i.W, X3.i.X, "putExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setExtras", "set", "removeExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearExtras", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "clearMediationInfo", "hasMediationInfo", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "staticDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "dynamicDeviceInfo", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "setCampaignState", "(Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;)V", "campaignState", "Lcom/google/protobuf/ByteString;", "getImpressionOpportunityId", "()Lcom/google/protobuf/ByteString;", "setImpressionOpportunityId", "(Lcom/google/protobuf/ByteString;)V", "impressionOpportunityId", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "placementId", "getRequestImpressionConfiguration", "setRequestImpressionConfiguration", "(Z)V", "requestImpressionConfiguration", "getScarSignal", "setScarSignal", "scarSignal", "", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "webviewVersion", "getTcf", "setTcf", "tcf", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "getAdRequestType", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;", "setAdRequestType", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequestType;)V", "adRequestType", "getAdRequestTypeValue", "setAdRequestTypeValue", "adRequestTypeValue", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getBannerSize", "()Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "setBannerSize", "(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;)V", "bannerSize", "getBannerSizeOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSizeOrNull", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormat", "getAdFormatValue", "setAdFormatValue", "adFormatValue", "getMediationAdUnitId", "setMediationAdUnitId", "mediationAdUnitId", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "mediationInfo", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdRequestKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdRequestOuterClass.AdRequest.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.AdRequest.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/AdRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.AdRequest.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.AdRequest _build() {
            AdRequestOuterClass.AdRequest adRequestBuild = this._builder.build();
            kotlin.jvm.internal.n.e(adRequestBuild, "_builder.build()");
            return adRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdRequestType() {
            this._builder.clearAdRequestType();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearRequestImpressionConfiguration() {
            this._builder.clearRequestImpressionConfiguration();
        }

        public final void clearScarSignal() {
            this._builder.clearScarSignal();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            kotlin.jvm.internal.n.e(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final AdRequestOuterClass.AdRequestType getAdRequestType() {
            AdRequestOuterClass.AdRequestType adRequestType = this._builder.getAdRequestType();
            kotlin.jvm.internal.n.e(adRequestType, "_builder.getAdRequestType()");
            return adRequestType;
        }

        public final int getAdRequestTypeValue() {
            return this._builder.getAdRequestTypeValue();
        }

        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            kotlin.jvm.internal.n.e(bannerSize, "_builder.getBannerSize()");
            return bannerSize;
        }

        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return AdRequestKtKt.getBannerSizeOrNull(dsl._builder);
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            kotlin.jvm.internal.n.e(campaignState, "_builder.getCampaignState()");
            return campaignState;
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

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            kotlin.jvm.internal.n.e(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
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
            return AdRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.n.e(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final boolean getRequestImpressionConfiguration() {
            return this._builder.getRequestImpressionConfiguration();
        }

        public final ByteString getScarSignal() {
            ByteString scarSignal = this._builder.getScarSignal();
            kotlin.jvm.internal.n.e(scarSignal, "_builder.getScarSignal()");
            return scarSignal;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            kotlin.jvm.internal.n.e(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
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

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdRequestType() {
            return this._builder.hasAdRequestType();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
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

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
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

        public final void setAdRequestType(AdRequestOuterClass.AdRequestType value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAdRequestType(value);
        }

        public final void setAdRequestTypeValue(int i10) {
            this._builder.setAdRequestTypeValue(i10);
        }

        public final void setBannerSize(AdRequestOuterClass.BannerSize value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setBannerSize(value);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCampaignState(value);
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

        public final void setImpressionOpportunityId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setMediationAdUnitId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setPlacementId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setRequestImpressionConfiguration(boolean z10) {
            this._builder.setRequestImpressionConfiguration(z10);
        }

        public final void setScarSignal(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setScarSignal(value);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setTcf(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTcf(value);
        }

        public final void setWebviewVersion(int i10) {
            this._builder.setWebviewVersion(i10);
        }

        private Dsl(AdRequestOuterClass.AdRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdRequestKt() {
    }
}
