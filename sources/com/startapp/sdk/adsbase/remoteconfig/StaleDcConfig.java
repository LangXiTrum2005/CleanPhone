package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class StaleDcConfig implements Serializable {
    private static final long serialVersionUID = 6968747702766307828L;
    private int ief = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.ief == ((StaleDcConfig) obj).ief;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
