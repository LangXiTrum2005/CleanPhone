package com.startapp.sdk.triggeredlinks;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class PeriodicAppEventMetadata implements Serializable {
    private static final long serialVersionUID = -3371103410620683752L;
    private int intervalInSeconds;
    private String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PeriodicAppEventMetadata periodicAppEventMetadata = (PeriodicAppEventMetadata) obj;
            if (this.intervalInSeconds != periodicAppEventMetadata.intervalInSeconds) {
                return false;
            }
            String str = this.url;
            String str2 = periodicAppEventMetadata.url;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.url;
        return ((str != null ? str.hashCode() : 0) * 31) + this.intervalInSeconds;
    }
}
