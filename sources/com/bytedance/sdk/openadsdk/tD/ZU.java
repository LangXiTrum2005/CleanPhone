package com.bytedance.sdk.openadsdk.tD;

import com.efs.sdk.base.core.util.NetworkUtil;

/* JADX INFO: loaded from: classes2.dex */
public enum ZU {
    TYPE_2G(NetworkUtil.NETWORK_CLASS_2G),
    TYPE_3G(NetworkUtil.NETWORK_CLASS_3G),
    TYPE_4G(NetworkUtil.NETWORK_CLASS_4G),
    TYPE_5G(NetworkUtil.NETWORK_CLASS_5G),
    TYPE_WIFI(NetworkUtil.NETWORK_TYPE_WIFI),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String OY;

    ZU(String str) {
        this.OY = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.OY;
    }
}
