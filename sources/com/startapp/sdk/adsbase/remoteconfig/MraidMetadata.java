package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class MraidMetadata implements Serializable {
    private static final long serialVersionUID = 1347811483134629452L;
    private double deferImpression;

    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;
    private String scriptUrl;
    private String ttl;

    public final double a() {
        return this.deferImpression;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final String c() {
        return this.scriptUrl;
    }

    public final String d() {
        return this.ttl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MraidMetadata mraidMetadata = (MraidMetadata) obj;
            if (Double.compare(this.deferImpression, mraidMetadata.deferImpression) == 0 && vi.a((Object) this.scriptUrl, (Object) mraidMetadata.scriptUrl) && vi.a((Object) this.ttl, (Object) mraidMetadata.ttl) && vi.a((Object) this.infoEvents, (Object) mraidMetadata.infoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.scriptUrl, this.ttl, Double.valueOf(this.deferImpression), this.infoEvents};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
