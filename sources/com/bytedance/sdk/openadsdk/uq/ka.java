package com.bytedance.sdk.openadsdk.uq;

import com.ironsource.T3;

/* JADX INFO: loaded from: classes2.dex */
public enum ka {
    TYPE_2G("2g"),
    TYPE_3G(T3.a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(T3.b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String mj;

    ka(String str) {
        this.mj = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mj;
    }
}
