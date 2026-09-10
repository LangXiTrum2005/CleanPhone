package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.am;
import com.ironsource.adqualitysdk.sdk.i.kn;
import com.ironsource.adqualitysdk.sdk.i.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﭖ, reason: collision with root package name */
    private final Map<String, String> f28215;

    /* JADX INFO: renamed from: ﮐ, reason: collision with root package name */
    private final boolean f28216;

    /* JADX INFO: renamed from: ﱟ, reason: collision with root package name */
    private final String f28217;

    /* JADX INFO: renamed from: ﱡ, reason: collision with root package name */
    private final boolean f28218;

    /* JADX INFO: renamed from: ﺙ, reason: collision with root package name */
    private final ISAdQualityLogLevel f28219;

    /* JADX INFO: renamed from: ﻏ, reason: collision with root package name */
    private final ISAdQualityDeviceIdType f28220;

    /* JADX INFO: renamed from: ﻐ, reason: collision with root package name */
    private final Set<ISAdQualityInitListener> f28221;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final boolean f10;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f11;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f12;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f13;

    public /* synthetic */ ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b10) {
        this(str, z10, z11, z12, iSAdQualityLogLevel, set, str2, z13, z14, iSAdQualityDeviceIdType, map);
    }

    @Deprecated
    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f10) {
            builder.setUserId(iSAdQualityConfig.f11);
        } else if (iSAdQualityConfig2.f10) {
            builder.setUserId(iSAdQualityConfig2.f11);
        }
        if (iSAdQualityConfig.f12) {
            builder.setTestMode(iSAdQualityConfig.f13);
        } else if (iSAdQualityConfig2.f12) {
            builder.setTestMode(iSAdQualityConfig2.f13);
        }
        if (iSAdQualityConfig.f28216) {
            builder.setCoppa(iSAdQualityConfig.f28218);
        } else if (iSAdQualityConfig2.f28216) {
            builder.setCoppa(iSAdQualityConfig2.f28218);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f28219;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f28219;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f28221.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f28221.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f28217;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f28217;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f28220;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f28220;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f28215);
        map.putAll(iSAdQualityConfig.f28215);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    @Deprecated
    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f28221;
    }

    @Deprecated
    public boolean getCoppa() {
        return this.f28218;
    }

    @Deprecated
    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f28220;
    }

    @Deprecated
    public String getInitializationSource() {
        return this.f28217;
    }

    @Deprecated
    public ISAdQualityLogLevel getLogLevel() {
        return this.f28219;
    }

    @Deprecated
    public Map<String, String> getMetaData() {
        return this.f28215;
    }

    @Deprecated
    public String getUserId() {
        return this.f11;
    }

    @Deprecated
    public boolean isTestMode() {
        return this.f13;
    }

    @Deprecated
    public boolean isUserIdSet() {
        return this.f10;
    }

    private ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f11 = str;
        this.f10 = z10;
        this.f13 = z11;
        this.f12 = z12;
        this.f28219 = iSAdQualityLogLevel;
        this.f28221 = set;
        this.f28217 = str2;
        this.f28218 = z13;
        this.f28216 = z14;
        this.f28220 = iSAdQualityDeviceIdType;
        this.f28215 = map;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Deprecated
    public static class Builder {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f24 = null;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f21 = false;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f23 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f20 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityLogLevel f22 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f17 = new HashSet();

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private String f15 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f19 = false;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f18 = false;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f16 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private final Map<String, String> f14 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f17.add(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f24, this.f21, this.f23, this.f20, this.f22, this.f17, this.f15, this.f19, this.f18, this.f16, this.f14, (byte) 0);
        }

        @Deprecated
        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f17.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        @Deprecated
        public Builder setCoppa(boolean z10) {
            this.f19 = z10;
            this.f18 = true;
            return this;
        }

        @Deprecated
        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f16 = iSAdQualityDeviceIdType;
            return this;
        }

        @Deprecated
        public Builder setInitializationSource(String str) {
            if (kn.m2919(str, 20)) {
                this.f15 = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setInitializationSource( ");
            sb2.append(str);
            sb2.append(" ) init source must have length of 1-20");
            m.m2968("ISAdQualityConfig", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f22 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i10 = 0; i10 < jSONObject.names().length(); i10++) {
                    try {
                        String string = jSONObject.names().getString(i10);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(string);
                            sb2.append(" , ");
                            sb2.append(objOpt);
                            sb2.append(" ) value must be a string");
                            m.m2968("ISAdQualityConfig", sb2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        @Deprecated
        public Builder setTestMode(boolean z10) {
            this.f23 = z10;
            this.f20 = true;
            return this;
        }

        @Deprecated
        public Builder setUserId(String str) {
            this.f24 = str;
            this.f21 = true;
            return this;
        }

        @Deprecated
        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!am.m434(str)) {
                        if (am.m439(this.f14, str)) {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(str);
                            sb2.append(" , ");
                            sb2.append(str2);
                            sb2.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                            m.m2968("ISAdQualityConfig", sb2.toString());
                            return this;
                        }
                        if (!am.m438(str, str2)) {
                            StringBuilder sb3 = new StringBuilder("setMetaData( ");
                            sb3.append(str);
                            sb3.append(" , ");
                            sb3.append(str2);
                            sb3.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                            m.m2968("ISAdQualityConfig", sb3.toString());
                            return this;
                        }
                    }
                    this.f14.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }
    }
}
