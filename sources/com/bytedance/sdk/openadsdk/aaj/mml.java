package com.bytedance.sdk.openadsdk.aaj;

import com.p004ironsource.z8;

/* JADX INFO: loaded from: classes3.dex */
public enum mml {
    TYPE_2G("2g"),
    TYPE_3G(z8.f27868a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(z8.f27869b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String jpc;

    mml(String str) {
        this.jpc = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.jpc;
    }
}
