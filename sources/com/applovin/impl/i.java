package com.applovin.impl;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH(ToolBar.REFRESH),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8120a;

    i(String str) {
        this.f8120a = str;
    }

    public String b() {
        return this.f8120a;
    }
}
