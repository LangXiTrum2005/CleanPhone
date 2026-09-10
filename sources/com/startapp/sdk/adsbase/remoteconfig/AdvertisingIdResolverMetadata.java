package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AdvertisingIdResolverMetadata implements Serializable {
    private static final long serialVersionUID = -1692502027621350736L;
    private boolean enabled = true;
    private double iep = 0.0d;
    private int ief = 0;

    public final int a() {
        return this.ief;
    }

    public final double b() {
        return this.iep;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdvertisingIdResolverMetadata advertisingIdResolverMetadata = (AdvertisingIdResolverMetadata) obj;
            if (this.enabled == advertisingIdResolverMetadata.enabled && Double.compare(this.iep, advertisingIdResolverMetadata.iep) == 0 && this.ief == advertisingIdResolverMetadata.ief) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Double.valueOf(this.iep), Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
