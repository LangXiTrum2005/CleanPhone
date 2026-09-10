package com.p004ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.p004ironsource.adqualitysdk.sdk.i.an;
import com.p004ironsource.adqualitysdk.sdk.i.kd;
import com.p004ironsource.adqualitysdk.sdk.i.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private final Map<String, String> f13;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final ISAdQualityLogLevel f14;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final boolean f15;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final ISAdQualityDeviceIdType f16;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final boolean f17;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final String f18;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f19;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f20;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final boolean f21;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f22;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f23;

    public /* synthetic */ ISAdQualityConfig(String str, boolean z2, boolean z3, boolean z4, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z5, boolean z6, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b2) {
        this(str, z2, z3, z4, iSAdQualityLogLevel, set, str2, z5, z6, iSAdQualityDeviceIdType, map);
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f22) {
            builder.setUserId(iSAdQualityConfig.f19);
        } else if (iSAdQualityConfig2.f22) {
            builder.setUserId(iSAdQualityConfig2.f19);
        }
        if (iSAdQualityConfig.f21) {
            builder.setTestMode(iSAdQualityConfig.f23);
        } else if (iSAdQualityConfig2.f21) {
            builder.setTestMode(iSAdQualityConfig2.f23);
        }
        if (iSAdQualityConfig.f15) {
            builder.setCoppa(iSAdQualityConfig.f17);
        } else if (iSAdQualityConfig2.f15) {
            builder.setCoppa(iSAdQualityConfig2.f17);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f14;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f14;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f20.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f20.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f18;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f18;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f16;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f16;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f13);
        map.putAll(iSAdQualityConfig.f13);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f20;
    }

    public boolean getCoppa() {
        return this.f17;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f16;
    }

    public String getInitializationSource() {
        return this.f18;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f14;
    }

    public Map<String, String> getMetaData() {
        return this.f13;
    }

    public String getUserId() {
        return this.f19;
    }

    public boolean isTestMode() {
        return this.f23;
    }

    public boolean isUserIdSet() {
        return this.f22;
    }

    private ISAdQualityConfig(String str, boolean z2, boolean z3, boolean z4, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z5, boolean z6, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f19 = str;
        this.f22 = z2;
        this.f23 = z3;
        this.f21 = z4;
        this.f14 = iSAdQualityLogLevel;
        this.f20 = set;
        this.f18 = str2;
        this.f17 = z5;
        this.f15 = z6;
        this.f16 = iSAdQualityDeviceIdType;
        this.f13 = map;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f33 = null;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f32 = false;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f34 = false;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f30 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ISAdQualityLogLevel f31 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f27 = new HashSet();

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private String f26 = null;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f28 = false;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f25 = false;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f29 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private final Map<String, String> f24 = new HashMap();

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f27.add(iSAdQualityInitListener);
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f33, this.f32, this.f34, this.f30, this.f31, this.f27, this.f26, this.f28, this.f25, this.f29, this.f24, (byte) 0);
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f27.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder setCoppa(boolean z2) {
            this.f28 = z2;
            this.f25 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f29 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (kd.m2777(str, 20)) {
                this.f26 = str;
                return this;
            }
            StringBuilder sb = new StringBuilder("setInitializationSource( ");
            sb.append(str);
            sb.append(" ) init source must have length of 1-20");
            n.m2828("ISAdQualityConfig", sb.toString());
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f31 = iSAdQualityLogLevel;
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i2 = 0; i2 < jSONObject.names().length(); i2++) {
                    try {
                        String string = jSONObject.names().getString(i2);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb = new StringBuilder("setMetaData( ");
                            sb.append(string);
                            sb.append(" , ");
                            sb.append(objOpt);
                            sb.append(" ) value must be a string");
                            n.m2828("ISAdQualityConfig", sb.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setTestMode(boolean z2) {
            this.f34 = z2;
            this.f30 = true;
            return this;
        }

        public Builder setUserId(String str) {
            this.f33 = str;
            this.f32 = true;
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!an.m428(str)) {
                        if (an.m430(this.f24, str)) {
                            StringBuilder sb = new StringBuilder("setMetaData( ");
                            sb.append(str);
                            sb.append(" , ");
                            sb.append(str2);
                            sb.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                            n.m2828("ISAdQualityConfig", sb.toString());
                            return this;
                        }
                        if (!an.m429(str, str2)) {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(str);
                            sb2.append(" , ");
                            sb2.append(str2);
                            sb2.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                            n.m2828("ISAdQualityConfig", sb2.toString());
                            return this;
                        }
                    }
                    this.f24.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }
    }
}
