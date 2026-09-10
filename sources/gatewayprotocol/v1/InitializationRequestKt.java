package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u008a\u0001\u008b\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u000bJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u000bJ\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eJ5\u0010/\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b-\u0010.J6\u00101\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0087\n¢\u0006\u0004\b0\u0010.J-\u00104\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0006\u0010+\u001a\u00020)H\u0007¢\u0006\u0004\b2\u00103J9\u00109\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)05H\u0007¢\u0006\u0004\b7\u00108J%\u0010<\u001a\u00020\t*\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(H\u0007¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020\t¢\u0006\u0004\b=\u0010\u000bJ\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010\u000eJ\r\u0010?\u001a\u00020\t¢\u0006\u0004\b?\u0010\u000bJ\r\u0010@\u001a\u00020\f¢\u0006\u0004\b@\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR$\u0010G\u001a\u00020B2\u0006\u0010,\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010M\u001a\u00020H2\u0006\u0010,\u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010R\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u00020H2\u0006\u0010,\u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010J\"\u0004\bT\u0010LR$\u0010X\u001a\u00020H2\u0006\u0010,\u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010J\"\u0004\bW\u0010LR$\u0010[\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010O\"\u0004\bZ\u0010QR$\u0010^\u001a\u00020H2\u0006\u0010,\u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010J\"\u0004\b]\u0010LR$\u0010a\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010O\"\u0004\b`\u0010QR$\u0010g\u001a\u00020b2\u0006\u0010,\u001a\u00020b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010k\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010\u000e\"\u0004\bi\u0010jR$\u0010n\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010O\"\u0004\bm\u0010QR$\u0010q\u001a\u00020H2\u0006\u0010,\u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010J\"\u0004\bp\u0010LR$\u0010t\u001a\u00020H2\u0006\u0010,\u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010J\"\u0004\bs\u0010LR$\u0010w\u001a\u00020H2\u0006\u0010,\u001a\u00020H8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010J\"\u0004\bv\u0010LR$\u0010z\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010O\"\u0004\by\u0010QR#\u0010}\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8G¢\u0006\u0006\u001a\u0004\b{\u0010|R%\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010,\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010O\"\u0004\b\u007f\u0010QR+\u0010\u0086\u0001\u001a\u00030\u0081\u00012\u0007\u0010,\u001a\u00030\u0081\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0081\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008c\u0001"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "_build", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "Lwj/r;", "clearClientInfo", "()V", "", "hasClientInfo", "()Z", "clearPrivacy", "hasPrivacy", "clearIdfi", "clearSessionId", "clearCache", "hasCache", "clearLegacyFlowUserConsent", "hasLegacyFlowUserConsent", "clearAuid", "hasAuid", "clearAnalyticsUserId", "hasAnalyticsUserId", "clearDeviceInfo", "hasDeviceInfo", "clearIsFirstInit", "clearAuidString", "hasAuidString", "clearUadsInitBlob", "hasUadsInitBlob", "clearUnityInstallationId", "hasUnityInstallationId", "clearUnityMegaSessionId", "hasUnityMegaSessionId", "clearExternalUserIdentifier", "hasExternalUserIdentifier", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", X3.i.W, X3.i.X, "putExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;Ljava/lang/String;)V", "put", "setExtras", "set", "removeExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/lang/String;)V", "remove", "", "map", "putAllExtras", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "putAll", "clearExtras", "(Lcom/google/protobuf/kotlin/DslMap;)V", "clear", "clearUnityBuildGuid", "hasUnityBuildGuid", "clearInstallReferrer", "hasInstallReferrer", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "clientInfo", "Lcom/google/protobuf/ByteString;", "getPrivacy", "()Lcom/google/protobuf/ByteString;", "setPrivacy", "(Lcom/google/protobuf/ByteString;)V", "privacy", "getIdfi", "()Ljava/lang/String;", "setIdfi", "(Ljava/lang/String;)V", "idfi", "getSessionId", "setSessionId", JsonStorageKeyNames.SESSION_ID_KEY, "getCache", "setCache", "cache", "getLegacyFlowUserConsent", "setLegacyFlowUserConsent", "legacyFlowUserConsent", "getAuid", "setAuid", "auid", "getAnalyticsUserId", "setAnalyticsUserId", "analyticsUserId", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "getDeviceInfo", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "setDeviceInfo", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;)V", "deviceInfo", "getIsFirstInit", "setIsFirstInit", "(Z)V", "isFirstInit", "getAuidString", "setAuidString", "auidString", "getUadsInitBlob", "setUadsInitBlob", "uadsInitBlob", "getUnityInstallationId", "setUnityInstallationId", "unityInstallationId", "getUnityMegaSessionId", "setUnityMegaSessionId", "unityMegaSessionId", "getExternalUserIdentifier", "setExternalUserIdentifier", "externalUserIdentifier", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "getUnityBuildGuid", "setUnityBuildGuid", "unityBuildGuid", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "getInstallReferrer", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "setInstallReferrer", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;)V", "installReferrer", "getInstallReferrerOrNull", "(Lgatewayprotocol/v1/InitializationRequestKt$Dsl;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "installReferrerOrNull", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest initializationRequestBuild = this._builder.build();
            kotlin.jvm.internal.n.e(initializationRequestBuild, "_builder.build()");
            return initializationRequestBuild;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearInstallReferrer() {
            this._builder.clearInstallReferrer();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            kotlin.jvm.internal.n.e(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            kotlin.jvm.internal.n.e(auid, "_builder.getAuid()");
            return auid;
        }

        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            kotlin.jvm.internal.n.e(auidString, "_builder.getAuidString()");
            return auidString;
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            kotlin.jvm.internal.n.e(cache, "_builder.getCache()");
            return cache;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            kotlin.jvm.internal.n.e(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            kotlin.jvm.internal.n.e(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            kotlin.jvm.internal.n.e(externalUserIdentifier, "_builder.getExternalUserIdentifier()");
            return externalUserIdentifier;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            kotlin.jvm.internal.n.e(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            kotlin.jvm.internal.n.e(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrer() {
            InitializationRequestOuterClass.InstallReferrer installReferrer = this._builder.getInstallReferrer();
            kotlin.jvm.internal.n.e(installReferrer, "_builder.getInstallReferrer()");
            return installReferrer;
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(Dsl dsl) {
            kotlin.jvm.internal.n.f(dsl, "<this>");
            return InitializationRequestKtKt.getInstallReferrerOrNull(dsl._builder);
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            kotlin.jvm.internal.n.e(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            kotlin.jvm.internal.n.e(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            kotlin.jvm.internal.n.e(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            kotlin.jvm.internal.n.e(uadsInitBlob, "_builder.getUadsInitBlob()");
            return uadsInitBlob;
        }

        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            kotlin.jvm.internal.n.e(unityBuildGuid, "_builder.getUnityBuildGuid()");
            return unityBuildGuid;
        }

        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            kotlin.jvm.internal.n.e(unityInstallationId, "_builder.getUnityInstallationId()");
            return unityInstallationId;
        }

        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            kotlin.jvm.internal.n.e(unityMegaSessionId, "_builder.getUnityMegaSessionId()");
            return unityMegaSessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasInstallReferrer() {
            return this._builder.hasInstallReferrer();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
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

        public final void setAnalyticsUserId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        public final void setAuid(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAuid(value);
        }

        public final void setAuidString(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setAuidString(value);
        }

        public final void setCache(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCache(value);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDeviceInfo(value);
        }

        public final void setExternalUserIdentifier(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setExternalUserIdentifier(value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.n.f(dslMap, "<this>");
            kotlin.jvm.internal.n.f(key, "key");
            kotlin.jvm.internal.n.f(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setIdfi(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setInstallReferrer(InitializationRequestOuterClass.InstallReferrer value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setInstallReferrer(value);
        }

        public final void setIsFirstInit(boolean z10) {
            this._builder.setIsFirstInit(z10);
        }

        public final void setLegacyFlowUserConsent(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        public final void setPrivacy(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setSessionId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSessionId(value);
        }

        public final void setUadsInitBlob(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setUadsInitBlob(value);
        }

        public final void setUnityBuildGuid(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setUnityBuildGuid(value);
        }

        public final void setUnityInstallationId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setUnityInstallationId(value);
        }

        public final void setUnityMegaSessionId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setUnityMegaSessionId(value);
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationRequestKt() {
    }
}
