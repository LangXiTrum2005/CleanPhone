package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.T3;
import com.ironsource.X3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/NetworkCapabilityTransportsKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class NetworkCapabilityTransportsKt {
    public static final NetworkCapabilityTransportsKt INSTANCE = new NetworkCapabilityTransportsKt();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b7\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R$\u0010&\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010%R$\u0010)\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010%R$\u0010,\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010%R$\u0010/\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010%R$\u00102\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010%R$\u00105\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u000e\"\u0004\b4\u0010%R$\u00108\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010%R$\u0010;\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010%R$\u0010>\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010%R$\u0010A\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u000e\"\u0004\b@\u0010%¨\u0006C"}, d2 = {"Lgatewayprotocol/v1/NetworkCapabilityTransportsKt$Dsl;", "", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder;", "_builder", "<init>", "(Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder;)V", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "_build", "()Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "Lwj/r;", "clearBluetooth", "()V", "", "hasBluetooth", "()Z", "clearCellular", "hasCellular", "clearEthernet", "hasEthernet", "clearLowpan", "hasLowpan", "clearSatellite", "hasSatellite", "clearThread", "hasThread", "clearUsb", "hasUsb", "clearVpn", "hasVpn", "clearWifi", "hasWifi", "clearWifiAware", "hasWifiAware", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder;", X3.i.X, "getBluetooth", "setBluetooth", "(Z)V", T3.f27212d, "getCellular", "setCellular", T3.f27215g, "getEthernet", "setEthernet", T3.f27213e, "getLowpan", "setLowpan", T3.f27217i, "getSatellite", "setSatellite", "satellite", "getThread", "setThread", "thread", "getUsb", "setUsb", "usb", "getVpn", "setVpn", "vpn", "getWifi", "setWifi", T3.f27210b, "getWifiAware", "setWifiAware", T3.f27216h, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder _builder;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/NetworkCapabilityTransportsKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/NetworkCapabilityTransportsKt$Dsl;", "builder", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder, kotlin.jvm.internal.g gVar) {
            this(builder);
        }

        public final /* synthetic */ NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports _build() {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports networkCapabilityTransportsBuild = this._builder.build();
            kotlin.jvm.internal.n.e(networkCapabilityTransportsBuild, "_builder.build()");
            return networkCapabilityTransportsBuild;
        }

        public final void clearBluetooth() {
            this._builder.clearBluetooth();
        }

        public final void clearCellular() {
            this._builder.clearCellular();
        }

        public final void clearEthernet() {
            this._builder.clearEthernet();
        }

        public final void clearLowpan() {
            this._builder.clearLowpan();
        }

        public final void clearSatellite() {
            this._builder.clearSatellite();
        }

        public final void clearThread() {
            this._builder.clearThread();
        }

        public final void clearUsb() {
            this._builder.clearUsb();
        }

        public final void clearVpn() {
            this._builder.clearVpn();
        }

        public final void clearWifi() {
            this._builder.clearWifi();
        }

        public final void clearWifiAware() {
            this._builder.clearWifiAware();
        }

        public final boolean getBluetooth() {
            return this._builder.getBluetooth();
        }

        public final boolean getCellular() {
            return this._builder.getCellular();
        }

        public final boolean getEthernet() {
            return this._builder.getEthernet();
        }

        public final boolean getLowpan() {
            return this._builder.getLowpan();
        }

        public final boolean getSatellite() {
            return this._builder.getSatellite();
        }

        public final boolean getThread() {
            return this._builder.getThread();
        }

        public final boolean getUsb() {
            return this._builder.getUsb();
        }

        public final boolean getVpn() {
            return this._builder.getVpn();
        }

        public final boolean getWifi() {
            return this._builder.getWifi();
        }

        public final boolean getWifiAware() {
            return this._builder.getWifiAware();
        }

        public final boolean hasBluetooth() {
            return this._builder.hasBluetooth();
        }

        public final boolean hasCellular() {
            return this._builder.hasCellular();
        }

        public final boolean hasEthernet() {
            return this._builder.hasEthernet();
        }

        public final boolean hasLowpan() {
            return this._builder.hasLowpan();
        }

        public final boolean hasSatellite() {
            return this._builder.hasSatellite();
        }

        public final boolean hasThread() {
            return this._builder.hasThread();
        }

        public final boolean hasUsb() {
            return this._builder.hasUsb();
        }

        public final boolean hasVpn() {
            return this._builder.hasVpn();
        }

        public final boolean hasWifi() {
            return this._builder.hasWifi();
        }

        public final boolean hasWifiAware() {
            return this._builder.hasWifiAware();
        }

        public final void setBluetooth(boolean z10) {
            this._builder.setBluetooth(z10);
        }

        public final void setCellular(boolean z10) {
            this._builder.setCellular(z10);
        }

        public final void setEthernet(boolean z10) {
            this._builder.setEthernet(z10);
        }

        public final void setLowpan(boolean z10) {
            this._builder.setLowpan(z10);
        }

        public final void setSatellite(boolean z10) {
            this._builder.setSatellite(z10);
        }

        public final void setThread(boolean z10) {
            this._builder.setThread(z10);
        }

        public final void setUsb(boolean z10) {
            this._builder.setUsb(z10);
        }

        public final void setVpn(boolean z10) {
            this._builder.setVpn(z10);
        }

        public final void setWifi(boolean z10) {
            this._builder.setWifi(z10);
        }

        public final void setWifiAware(boolean z10) {
            this._builder.setWifiAware(z10);
        }

        private Dsl(NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder builder) {
            this._builder = builder;
        }
    }

    private NetworkCapabilityTransportsKt() {
    }
}
