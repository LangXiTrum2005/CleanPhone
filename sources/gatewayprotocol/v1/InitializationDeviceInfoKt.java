package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.X3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationDeviceInfoKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializationDeviceInfoKt {
    public static final InitializationDeviceInfoKt INSTANCE = new InitializationDeviceInfoKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0019\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000bJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u000bJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R$\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R$\u00106\u001a\u0002012\u0006\u0010\"\u001a\u0002018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010<\u001a\u0002072\u0006\u0010\"\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010?\u001a\u0002072\u0006\u0010\"\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R$\u0010B\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R$\u0010E\u001a\u0002072\u0006\u0010\"\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00109\"\u0004\bD\u0010;R$\u0010H\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010$\"\u0004\bG\u0010&R$\u0010N\u001a\u00020I2\u0006\u0010\"\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010Q\u001a\u0002012\u0006\u0010\"\u001a\u0002018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u00103\"\u0004\bP\u00105R$\u0010T\u001a\u0002072\u0006\u0010\"\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u00109\"\u0004\bS\u0010;R$\u0010W\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010$\"\u0004\bV\u0010&R$\u0010Z\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010$\"\u0004\bY\u0010&R$\u0010]\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010&R$\u0010`\u001a\u0002072\u0006\u0010\"\u001a\u0002078G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u00109\"\u0004\b_\u0010;¨\u0006b"}, d2 = {"Lgatewayprotocol/v1/InitializationDeviceInfoKt$Dsl;", "", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo$Builder;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "_build", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "Lwj/r;", "clearBundleId", "()V", "clearDeviceMake", "clearDeviceModel", "clearOsVersion", "clearTrackingAuthStatus", "", "hasTrackingAuthStatus", "()Z", "clearTotalDiskSpace", "clearTotalRamMemory", "clearHashedDeviceName", "clearCurrentUiTheme", "clearNetworkOperator", "clearBatteryLevel", "clearBatteryStatus", "clearSystemBootTime", "clearLanguage", "clearLocalList", "clearConnectionType", "clearGridToken", "hasGridToken", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo$Builder;", "", X3.i.X, "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "bundleId", "getDeviceMake", "setDeviceMake", "deviceMake", "getDeviceModel", "setDeviceModel", "deviceModel", "getOsVersion", "setOsVersion", "osVersion", "", "getTrackingAuthStatus", "()I", "setTrackingAuthStatus", "(I)V", "trackingAuthStatus", "", "getTotalDiskSpace", "()J", "setTotalDiskSpace", "(J)V", "totalDiskSpace", "getTotalRamMemory", "setTotalRamMemory", "totalRamMemory", "getHashedDeviceName", "setHashedDeviceName", "hashedDeviceName", "getCurrentUiTheme", "setCurrentUiTheme", "currentUiTheme", "getNetworkOperator", "setNetworkOperator", "networkOperator", "", "getBatteryLevel", "()D", "setBatteryLevel", "(D)V", X3.j.Y, "getBatteryStatus", "setBatteryStatus", "batteryStatus", "getSystemBootTime", "setSystemBootTime", "systemBootTime", "getLanguage", "setLanguage", "language", "getLocalList", "setLocalList", "localList", "getConnectionType", "setConnectionType", "connectionType", "getGridToken", "setGridToken", "gridToken", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationRequestOuterClass.InitializationDeviceInfo.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/InitializationDeviceInfoKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InitializationDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationDeviceInfo _build() {
            InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfoBuild = this._builder.build();
            kotlin.jvm.internal.n.e(initializationDeviceInfoBuild, "_builder.build()");
            return initializationDeviceInfoBuild;
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearCurrentUiTheme() {
            this._builder.clearCurrentUiTheme();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGridToken() {
            this._builder.clearGridToken();
        }

        public final void clearHashedDeviceName() {
            this._builder.clearHashedDeviceName();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocalList() {
            this._builder.clearLocalList();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearSystemBootTime() {
            this._builder.clearSystemBootTime();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearTrackingAuthStatus() {
            this._builder.clearTrackingAuthStatus();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            kotlin.jvm.internal.n.e(bundleId, "_builder.getBundleId()");
            return bundleId;
        }

        public final String getConnectionType() {
            String connectionType = this._builder.getConnectionType();
            kotlin.jvm.internal.n.e(connectionType, "_builder.getConnectionType()");
            return connectionType;
        }

        public final long getCurrentUiTheme() {
            return this._builder.getCurrentUiTheme();
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

        public final long getGridToken() {
            return this._builder.getGridToken();
        }

        public final String getHashedDeviceName() {
            String hashedDeviceName = this._builder.getHashedDeviceName();
            kotlin.jvm.internal.n.e(hashedDeviceName, "_builder.getHashedDeviceName()");
            return hashedDeviceName;
        }

        public final String getLanguage() {
            String language = this._builder.getLanguage();
            kotlin.jvm.internal.n.e(language, "_builder.getLanguage()");
            return language;
        }

        public final String getLocalList() {
            String localList = this._builder.getLocalList();
            kotlin.jvm.internal.n.e(localList, "_builder.getLocalList()");
            return localList;
        }

        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            kotlin.jvm.internal.n.e(networkOperator, "_builder.getNetworkOperator()");
            return networkOperator;
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            kotlin.jvm.internal.n.e(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final long getSystemBootTime() {
            return this._builder.getSystemBootTime();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final int getTrackingAuthStatus() {
            return this._builder.getTrackingAuthStatus();
        }

        public final boolean hasGridToken() {
            return this._builder.hasGridToken();
        }

        public final boolean hasTrackingAuthStatus() {
            return this._builder.hasTrackingAuthStatus();
        }

        public final void setBatteryLevel(double d10) {
            this._builder.setBatteryLevel(d10);
        }

        public final void setBatteryStatus(int i10) {
            this._builder.setBatteryStatus(i10);
        }

        public final void setBundleId(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setBundleId(value);
        }

        public final void setConnectionType(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setConnectionType(value);
        }

        public final void setCurrentUiTheme(long j10) {
            this._builder.setCurrentUiTheme(j10);
        }

        public final void setDeviceMake(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDeviceMake(value);
        }

        public final void setDeviceModel(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDeviceModel(value);
        }

        public final void setGridToken(long j10) {
            this._builder.setGridToken(j10);
        }

        public final void setHashedDeviceName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setHashedDeviceName(value);
        }

        public final void setLanguage(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setLanguage(value);
        }

        public final void setLocalList(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setLocalList(value);
        }

        public final void setNetworkOperator(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setNetworkOperator(value);
        }

        public final void setOsVersion(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOsVersion(value);
        }

        public final void setSystemBootTime(long j10) {
            this._builder.setSystemBootTime(j10);
        }

        public final void setTotalDiskSpace(long j10) {
            this._builder.setTotalDiskSpace(j10);
        }

        public final void setTotalRamMemory(long j10) {
            this._builder.setTotalRamMemory(j10);
        }

        public final void setTrackingAuthStatus(int i10) {
            this._builder.setTrackingAuthStatus(i10);
        }

        private Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationDeviceInfoKt() {
    }
}
