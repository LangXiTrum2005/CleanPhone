package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33458c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f33459e;
    private PglSSCallBack f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f33461b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f33462c = 0;
        private String d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f33460a)) {
                return null;
            }
            return new PglSSConfig(this.f33460a, this.f33461b, this.f33462c, this.d);
        }

        public Builder setAdsdkVersion(String str) {
            this.d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f33460a = str;
            return this;
        }

        public Builder setCollectMode(int i2) {
            this.f33462c = i2;
            return this;
        }

        public Builder setOVRegionType(int i2) {
            this.f33461b = i2;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.d;
    }

    public String getAppId() {
        return this.f33456a;
    }

    public PglSSCallBack getCallBack() {
        return this.f;
    }

    public int getCollectMode() {
        return this.f33458c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f33459e;
    }

    public int getOVRegionType() {
        return this.f33457b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f33459e = map;
    }

    private PglSSConfig(String str, int i2, int i3, String str2) {
        this.f33456a = str;
        this.f33457b = i2;
        this.f33458c = i3;
        this.d = str2;
    }
}
