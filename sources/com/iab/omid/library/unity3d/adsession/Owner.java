package com.iab.omid.library.unity3d.adsession;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes3.dex */
public enum Owner {
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
