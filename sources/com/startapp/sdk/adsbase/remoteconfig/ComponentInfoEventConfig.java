package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ComponentInfoEventConfig implements Serializable {
    private static final long serialVersionUID = -5359772055016698271L;
    private long flags = 0;
    private double chance = 0.0d;

    static {
        new ComponentInfoEventConfig();
    }

    public final boolean a(long j) {
        return (this.flags & j) == j && vi.a(this.chance);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ComponentInfoEventConfig.class == obj.getClass()) {
            ComponentInfoEventConfig componentInfoEventConfig = (ComponentInfoEventConfig) obj;
            if (this.flags == componentInfoEventConfig.flags && Double.compare(this.chance, componentInfoEventConfig.chance) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.flags), Double.valueOf(this.chance)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
