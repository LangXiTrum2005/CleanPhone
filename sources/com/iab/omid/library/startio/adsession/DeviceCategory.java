package com.iab.omid.library.startio.adsession;

import com.p004ironsource.x4;

/* JADX INFO: loaded from: classes3.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER(x4.d);

    private final String deviceCategory;

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.deviceCategory;
    }
}
