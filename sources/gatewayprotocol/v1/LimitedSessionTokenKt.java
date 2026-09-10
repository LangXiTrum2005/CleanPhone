package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.O6;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class LimitedSessionTokenKt {
    public static final LimitedSessionTokenKt INSTANCE = new LimitedSessionTokenKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u00102\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R$\u00108\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R$\u0010>\u001a\u0002092\u0006\u0010\u001e\u001a\u0002098G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010A\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010/\"\u0004\b@\u00101R$\u0010G\u001a\u00020B2\u0006\u0010\u001e\u001a\u00020B8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R$\u0010M\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R$\u0010P\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010 \"\u0004\bO\u0010\"R$\u0010V\u001a\u00020Q2\u0006\u0010\u001e\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl;", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "_build", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "Lwj/r;", "clearDeviceMake", "()V", "clearDeviceModel", "clearOsVersion", "clearIdfi", "clearSdkVersion", "clearSdkVersionName", "clearGameId", "clearPlatform", "clearMediationProvider", "clearCustomMediationName", "", "hasCustomMediationName", "()Z", "clearMediationVersion", "hasMediationVersion", "clearSessionId", "hasSessionId", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "", X3.i.X, "getDeviceMake", "()Ljava/lang/String;", "setDeviceMake", "(Ljava/lang/String;)V", "deviceMake", "getDeviceModel", "setDeviceModel", "deviceModel", "getOsVersion", "setOsVersion", "osVersion", "getIdfi", "setIdfi", "idfi", "", "getSdkVersion", "()I", "setSdkVersion", "(I)V", "sdkVersion", "getSdkVersionName", "setSdkVersionName", "sdkVersionName", "getGameId", "setGameId", AndroidGetAdPlayerContext.KEY_GAME_ID, "Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "getPlatform", "()Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "setPlatform", "(Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;)V", O6.H, "getPlatformValue", "setPlatformValue", "platformValue", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "mediationProvider", "getMediationProviderValue", "setMediationProviderValue", "mediationProviderValue", "getCustomMediationName", "setCustomMediationName", "customMediationName", "getMediationVersion", "setMediationVersion", "mediationVersion", "Lcom/google/protobuf/ByteString;", "getSessionId", "()Lcom/google/protobuf/ByteString;", "setSessionId", "(Lcom/google/protobuf/ByteString;)V", JsonStorageKeyNames.SESSION_ID_KEY, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/LimitedSessionTokenKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.LimitedSessionToken _build() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionTokenBuild = this._builder.build();
            kotlin.jvm.internal.n.e(limitedSessionTokenBuild, "_builder.build()");
            return limitedSessionTokenBuild;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            kotlin.jvm.internal.n.e(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            kotlin.jvm.internal.n.e(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            kotlin.jvm.internal.n.e(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            kotlin.jvm.internal.n.e(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            kotlin.jvm.internal.n.e(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            kotlin.jvm.internal.n.e(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            kotlin.jvm.internal.n.e(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            kotlin.jvm.internal.n.e(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            kotlin.jvm.internal.n.e(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            kotlin.jvm.internal.n.e(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            kotlin.jvm.internal.n.e(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        public final void setCustomMediationName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCustomMediationName(value);
        }

        public final void setDeviceMake(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setGameId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setGameId(value);
        }

        public final void setIdfi(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationProvider(value);
        }

        public final void setMediationProviderValue(int i10) {
            this._builder.setMediationProviderValue(i10);
        }

        public final void setMediationVersion(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setMediationVersion(value);
        }

        public final void setOsVersion(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPlatform(value);
        }

        public final void setPlatformValue(int i10) {
            this._builder.setPlatformValue(i10);
        }

        public final void setSdkVersion(int i10) {
            this._builder.setSdkVersion(i10);
        }

        public final void setSdkVersionName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSdkVersionName(value);
        }

        public final void setSessionId(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setSessionId(value);
        }

        private Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }
    }

    private LimitedSessionTokenKt() {
    }
}
