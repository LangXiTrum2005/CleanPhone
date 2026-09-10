package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class LocationMetadata implements Serializable {
    private static final long serialVersionUID = 6065806350166123602L;
    private boolean coEnabled;
    private boolean fiEnabled;

    public final boolean a() {
        return this.fiEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationMetadata locationMetadata = (LocationMetadata) obj;
            if (this.fiEnabled == locationMetadata.fiEnabled && this.coEnabled == locationMetadata.coEnabled) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.fiEnabled), Boolean.valueOf(this.coEnabled)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
