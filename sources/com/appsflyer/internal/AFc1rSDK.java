package com.appsflyer.internal;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1rSDK {
    final List<AFc1sSDK> getMediationNetwork;

    public AFc1rSDK(List<AFc1sSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.getMediationNetwork = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1rSDK) && Intrinsics.wireman(this.getMediationNetwork, ((AFc1rSDK) obj).getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode();
    }

    public final String toString() {
        return "StorageConfig(typeEntries=" + this.getMediationNetwork + ")";
    }
}
