package com.inmobi.media.core.config.models;

import android.webkit.URLUtil;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.ads.AdSize;
import com.ironsource.Db;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import slumberous.attabal;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\b01234567B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010%\u001a\u00020\u0011H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\tJ\u0006\u0010*\u001a\u00020\u000bJ\u0006\u0010+\u001a\u00020\u000fJ\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u0006\u0010.\u001a\u00020\u0011J\u0006\u0010/\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00068"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig;", "Lcom/inmobi/media/core/config/models/Config;", "<init>", "()V", "ice", "Lcom/inmobi/media/core/config/models/SignalsConfig$IceConfig;", "ext", "Lorg/json/JSONObject;", "unifiedIdServiceConfig", "Lcom/inmobi/media/core/config/models/SignalsConfig$UnifiedIdServiceConfig;", "novatiqConfig", "Lcom/inmobi/media/core/config/models/SignalsConfig$NovatiqConfig;", "session", "Lcom/inmobi/media/core/config/models/SignalsConfig$SessionConfig;", Db.b, "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig;", "kA", "", "vAK", "", "lowMemoryFreq", "getLowMemoryFreq", "()I", "setLowMemoryFreq", "(I)V", "bts", "Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "getBts", "()Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "setBts", "(Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;)V", "purchases", "Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "getPurchases", "()Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "setPurchases", "(Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;)V", "getType", "isValid", "", "getIceConfig", "getUnifiedIdServiceConfig", "getNovatiqConfig", "getPublisherConfig", "getSessionConfig", "getExt", "getAK", "getAKV", "IceConfig", "CellIceConfig", "NovatiqConfig", "UnifiedIdServiceConfig", "PublisherConfig", "SessionConfig", "Purchases", "BootTimeConfig", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignalsConfig extends Config {
    private JSONObject ext;
    private IceConfig ice = new IceConfig();
    private UnifiedIdServiceConfig unifiedIdServiceConfig = new UnifiedIdServiceConfig();
    private NovatiqConfig novatiqConfig = new NovatiqConfig();
    private SessionConfig session = new SessionConfig();
    private PublisherConfig publisher = new PublisherConfig();
    private String kA = "wWFMAWbSEtvl5VxZbQGMK7";
    private int vAK = 1;
    private int lowMemoryFreq = AdSize.MEDIUM_RECTANGLE_WIDTH;
    private BootTimeConfig bts = new BootTimeConfig();
    private Purchases purchases = new Purchases();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$BootTimeConfig;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "maxEntries", "", "getMaxEntries", "()I", "threshold", "getThreshold", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BootTimeConfig {
        private final boolean enabled;
        private final int maxEntries = 3;
        private final int threshold = 120;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getThreshold() {
            return this.threshold;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$CellIceConfig;", "", "<init>", "()V", "cof", "", "getCof", "()I", "setCof", "(I)V", "vce", "", "getVce", "()Z", "setVce", "(Z)V", "cce", "getCce", "setCce", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z) {
            this.cce = z;
        }

        public final void setCof(int i) {
            this.cof = i;
        }

        public final void setVce(boolean z) {
            this.vce = z;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$IceConfig;", "", "<init>", "()V", "locationEnabled", "", "sessionEnabled", "c", "Lcom/inmobi/media/core/config/models/SignalsConfig$CellIceConfig;", "isLocationEnabled", "isSessionEnabled", "getCellOperatorFlag", "", "isVisibleCellTowerEnabled", "isConnectedCellTowerEnabled", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IceConfig {
        private CellIceConfig c = new CellIceConfig();
        private boolean locationEnabled;
        private boolean sessionEnabled;

        public final int getCellOperatorFlag() {
            return this.c.getCof();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.c.getCce();
        }

        /* JADX INFO: renamed from: isLocationEnabled, reason: from getter */
        public final boolean getLocationEnabled() {
            return this.locationEnabled;
        }

        /* JADX INFO: renamed from: isSessionEnabled, reason: from getter */
        public final boolean getSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            return getCellOperatorFlag() >= 0;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.c.getVce();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$NovatiqConfig;", "", "<init>", "()V", "value", "", "isNovatiqEnabled", "()Z", "setNovatiqEnabled", "(Z)V", "", "", "carrierNames", "getCarrierNames", "()Ljava/util/List;", "setCarrierNames", "(Ljava/util/List;)V", "beaconUrl", "getBeaconUrl", "()Ljava/lang/String;", "setBeaconUrl", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;
        private List<String> carrierNames = adultoid.formularize();
        private String beaconUrl = "https://spadsync.com/sync";

        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        /* JADX INFO: renamed from: isNovatiqEnabled, reason: from getter */
        public final boolean getIsNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }

        public final void setBeaconUrl(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.beaconUrl = str;
        }

        public final void setCarrierNames(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.carrierNames = list;
        }

        public final void setNovatiqEnabled(boolean z) {
            this.isNovatiqEnabled = z;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0006!\"#$%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001fJ\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig;", "", "<init>", "()V", "enableMCO", "", "getEnableMCO", "()Z", "enableAB", "getEnableAB", "generalKeys", "", "", "adSpecificKeys", "payloadSize", "", "getPayloadSize", "()I", "auto", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "getAuto", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "obj", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "getObj", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "direct", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "getDirect", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "getGeneralKeys", "", "getAdSpecificKeys", "DirectInputData", "ObjInputData", "AutoInputData", "BaseInputData", "KeyData", "DepthData", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;
        private final Map<String, String> generalKeys = new LinkedHashMap();
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;
        private final AutoInputData auto = new AutoInputData();
        private final ObjInputData obj = new ObjInputData();
        private final DirectInputData direct = new DirectInputData();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$AutoInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeys", "", "", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "getAllowedKeys", "()Ljava/util/Map;", "incompatibleSdkVer", "", "getIncompatibleSdkVer", "()Ljava/util/List;", "topic", "getTopic", "()Ljava/lang/String;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AutoInputData extends BaseInputData {
            private final Map<String, KeyData> allowedKeys = new LinkedHashMap();
            private final List<String> incompatibleSdkVer = adultoid.formularize();
            private final String topic = "";

            public final Map<String, KeyData> getAllowedKeys() {
                return this.allowedKeys;
            }

            public final List<String> getIncompatibleSdkVer() {
                return this.incompatibleSdkVer;
            }

            public final String getTopic() {
                return this.topic;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "expiry", "", "getExpiry", "()I", "count", "getCount", "precision", "getPrecision", "strLen", "getStrLen", "depth", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "getDepth", "()Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class BaseInputData {
            private final boolean enabled;
            private final int expiry = 604800;
            private final int count = 5;
            private final int precision = 6;
            private final int strLen = 3;
            private final DepthData depth = new DepthData();

            public final int getCount() {
                return this.count;
            }

            public final DepthData getDepth() {
                return this.depth;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getExpiry() {
                return this.expiry;
            }

            public final int getPrecision() {
                return this.precision;
            }

            public final int getStrLen() {
                return this.strLen;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DepthData;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DepthData {
            private final boolean enabled;

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$DirectInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeys", "", "", "getAllowedKeys", "()Ljava/util/Map;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DirectInputData extends BaseInputData {
            private final Map<String, String> allowedKeys = new LinkedHashMap();

            public final Map<String, String> getAllowedKeys() {
                return this.allowedKeys;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "type", "getType", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class KeyData {
            private final String name = "";
            private final String type = "";

            public final String getName() {
                return this.name;
            }

            public final String getType() {
                return this.type;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$ObjInputData;", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$BaseInputData;", "<init>", "()V", "allowedKeysAnd", "", "", "Lcom/inmobi/media/core/config/models/SignalsConfig$PublisherConfig$KeyData;", "getAllowedKeysAnd", "()Ljava/util/Map;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ObjInputData extends BaseInputData {
            private final Map<String, KeyData> allowedKeysAnd = new LinkedHashMap();

            public final Map<String, KeyData> getAllowedKeysAnd() {
                return this.allowedKeysAnd;
            }
        }

        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        public final AutoInputData getAuto() {
            return this.auto;
        }

        public final DirectInputData getDirect() {
            return this.direct;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        public final ObjInputData getObj() {
            return this.obj;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$Purchases;", "", "<init>", "()V", "inapp", "", "getInapp", "()Z", "setInapp", "(Z)V", "versionList", "", "", "getVersionList", "()Ljava/util/List;", "setVersionList", "(Ljava/util/List;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Purchases {
        private boolean inapp;
        private List<String> versionList = adultoid.kowloon(attabal.f37634attabal, "7.1.0", "7.1.1");

        public final boolean getInapp() {
            return this.inapp;
        }

        public final List<String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z) {
            this.inapp = z;
        }

        public final void setVersionList(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.versionList = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$SessionConfig;", "", "<init>", "()V", "control", "", "", "getSigControlList", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SessionConfig {
        private List<Integer> control = adultoid.kowloon(0, 1, 2, 3, 4, 5, 6);

        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/inmobi/media/core/config/models/SignalsConfig$UnifiedIdServiceConfig;", "", "<init>", "()V", "enabled", "", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "maxRetries", "", "getMaxRetries", "()I", "setMaxRetries", "(I)V", "retryInterval", "getRetryInterval", "setRetryInterval", "timeout", "getTimeout", "setTimeout", "isEnabled", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setMaxRetries(int i) {
            this.maxRetries = i;
        }

        public final void setRetryInterval(int i) {
            this.retryInterval = i;
        }

        public final void setTimeout(int i) {
            this.timeout = i;
        }

        public final void setUrl(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.url = str;
        }
    }

    /* JADX INFO: renamed from: getAK, reason: from getter */
    public final String getKA() {
        return this.kA;
    }

    /* JADX INFO: renamed from: getAKV, reason: from getter */
    public final int getVAK() {
        return this.vAK;
    }

    public final BootTimeConfig getBts() {
        return this.bts;
    }

    public final JSONObject getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: getIceConfig, reason: from getter */
    public final IceConfig getIce() {
        return this.ice;
    }

    public final int getLowMemoryFreq() {
        return this.lowMemoryFreq;
    }

    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    /* JADX INFO: renamed from: getPublisherConfig, reason: from getter */
    public final PublisherConfig getPublisher() {
        return this.publisher;
    }

    public final Purchases getPurchases() {
        return this.purchases;
    }

    /* JADX INFO: renamed from: getSessionConfig, reason: from getter */
    public final SessionConfig getSession() {
        return this.session;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public String getType() {
        return "signals";
    }

    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setBts(BootTimeConfig bootTimeConfig) {
        Intrinsics.checkNotNullParameter(bootTimeConfig, "<set-?>");
        this.bts = bootTimeConfig;
    }

    public final void setLowMemoryFreq(int i) {
        this.lowMemoryFreq = i;
    }

    public final void setPurchases(Purchases purchases) {
        Intrinsics.checkNotNullParameter(purchases, "<set-?>");
        this.purchases = purchases;
    }
}
