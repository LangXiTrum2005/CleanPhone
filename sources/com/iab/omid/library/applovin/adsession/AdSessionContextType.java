package com.iab.omid.library.applovin.adsession;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes3.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
