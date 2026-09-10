package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TopicsClientMetadata implements Serializable {
    private static final long serialVersionUID = -3156048165050662402L;
    private double enabled = 0.0d;

    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    public final double a() {
        return this.enabled;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TopicsClientMetadata topicsClientMetadata = (TopicsClientMetadata) obj;
            if (Double.compare(this.enabled, topicsClientMetadata.enabled) == 0 && vi.a((Object) this.infoEvents, (Object) topicsClientMetadata.infoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.enabled), this.infoEvents};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
