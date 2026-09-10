package com.inmobi.commons.core.configs;

import com.adcolony.sdk.AdColonyAppOptions;
import com.inmobi.media.Bc;
import com.inmobi.media.C3191q6;
import com.inmobi.media.D4;
import com.inmobi.media.Dc;
import com.inmobi.media.Ec;
import com.inmobi.media.U6;
import com.inmobi.media.U9;
import com.inmobi.media.Z4;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 22\u00020\u0001:\u0003345B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\r\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u000bR\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/inmobi/commons/core/configs/RootConfig;", "Lcom/inmobi/commons/core/configs/Config;", "", "accountId", "<init>", "(Ljava/lang/String;)V", com.smartdigimkt.q0.b.i0, "", "isSameAs", "(Lcom/inmobi/commons/core/configs/RootConfig;)Z", "getType", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "isValid", "()Z", "type", "", "getExpiryForType", "(Ljava/lang/String;)J", "", "getMaxRetries", "()I", "getRetryInterval", "getWaitTime", "isMonetizationDisabled", "shouldTransmitRequest", "getUrlForType", "(Ljava/lang/String;)Ljava/lang/String;", "getFallbackUrlForRootType", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "maxRetries", "I", "retryInterval", "waitTime", "Lcom/inmobi/commons/core/configs/RootConfig$GDPR;", "gdpr", "Lcom/inmobi/commons/core/configs/RootConfig$GDPR;", "", "Lcom/inmobi/commons/core/configs/RootConfig$ComponentConfig;", "components", "Ljava/util/List;", "monetizationDisabled", "Z", RootConfig.IP_ADDRESS_TP_SUPPORT_KEY, "getIpAddrTPSupport", "()Ljava/util/List;", "Companion", "com/inmobi/commons/core/configs/e", "ComponentConfig", AdColonyAppOptions.GDPR, "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RootConfig extends Config {
    public static final long DEFAULT_EXPIRY = 86400;
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_RETRY_INTERVAL = 60;
    public static final String DEFAULT_URL = "";
    public static final int DEFAULT_WAIT_TIME = 3;
    public static final String IP_ADDRESS_TP_SUPPORT_KEY = "ipAddrTPSupport";

    @Z4
    private final String TAG;
    private List<ComponentConfig> components;

    @U9
    private GDPR gdpr;
    private final List<String> ipAddrTPSupport;
    private int maxRetries;
    private boolean monetizationDisabled;
    private int retryInterval;
    private int waitTime;
    public static final e Companion = new e();
    private static final Object sAcquisitionLock = new Object();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/commons/core/configs/RootConfig$ComponentConfig;", "", "()V", "expiry", "", "fallbackUrl", "", "type", "url", "getExpiry", "getFallbackUrl", "getType", "getUrl", "isValid", "", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ComponentConfig {
        private String type = "";
        private long expiry = Long.MAX_VALUE;
        private String url = "";
        private String fallbackUrl = RootConfig.DEFAULT_FALLBACK_URL;

        public final long getExpiry() {
            return this.expiry;
        }

        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            if (StringsKt.a0(getType()).toString().length() != 0 && getExpiry() >= 0 && getExpiry() <= 864000 && !D4.a(this.url)) {
                return ("root".equals(getType()) && D4.a(this.fallbackUrl)) ? false : true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/inmobi/commons/core/configs/RootConfig$GDPR;", "", "()V", "transmitRequest", "", "Ljava/lang/Boolean;", "getTransmitRequest", "()Ljava/lang/Boolean;", "isValid", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GDPR {

        @U9
        private Boolean transmitRequest = Boolean.TRUE;

        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            return this.transmitRequest != null;
        }
    }

    public RootConfig(String str) {
        super(str);
        this.TAG = "RootConfig";
        this.maxRetries = 3;
        this.retryInterval = 60;
        this.waitTime = 3;
        this.gdpr = new GDPR();
        EmptyList emptyList = EmptyList.X;
        this.components = emptyList;
        this.ipAddrTPSupport = emptyList;
    }

    public final long getExpiryForType(String type) {
        Intrinsics.f(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (type.equals(componentConfig.getType())) {
                        return componentConfig.getExpiry();
                    }
                }
            }
            return 86400L;
        }
    }

    public final String getFallbackUrlForRootType() {
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if ("root".equals(componentConfig.getType())) {
                        return componentConfig.getFallbackUrl();
                    }
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }

    public final List<String> getIpAddrTPSupport() {
        return this.ipAddrTPSupport;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "root";
    }

    public final String getUrlForType(String type) {
        Intrinsics.f(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (type.equals(componentConfig.getType())) {
                        return componentConfig.getUrl();
                    }
                }
            }
            return "";
        }
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    /* JADX INFO: renamed from: isMonetizationDisabled, reason: from getter */
    public final boolean getMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    public final boolean isSameAs(RootConfig config) {
        Intrinsics.f(config, "config");
        return ((getAccountId$media_release() == null && config.getAccountId$media_release() == null) || (getAccountId$media_release() != null && StringsKt.r(getAccountId$media_release(), config.getAccountId$media_release(), false))) && config.maxRetries == this.maxRetries && config.retryInterval == this.retryInterval && config.waitTime == this.waitTime && config.monetizationDisabled == this.monetizationDisabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        Unit unit;
        String TAG = this.TAG;
        Intrinsics.e(TAG, "TAG");
        Objects.toString(this.gdpr);
        if (this.maxRetries < 0 || this.retryInterval < 0 || this.waitTime < 0) {
            return false;
        }
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((ComponentConfig) it.next()).isValid()) {
                        return false;
                    }
                }
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                return false;
            }
            GDPR gdpr = this.gdpr;
            return gdpr != null && gdpr.isValid();
        }
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        if (gdpr == null || (transmitRequest = gdpr.getTransmitRequest()) == null) {
            return true;
        }
        return transmitRequest.booleanValue();
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject jSONObjectA = new C3191q6().a(new Ec("components", RootConfig.class), (Dc) new U6(new d(), ComponentConfig.class)).a(new Ec(IP_ADDRESS_TP_SUPPORT_KEY, RootConfig.class), (Dc) new U6(new Bc(), String.class)).a(this);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        String TAG = this.TAG;
        Intrinsics.e(TAG, "TAG");
        return new JSONObject();
    }
}
