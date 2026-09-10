package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class RcdMetadata implements Serializable {
    private static final long serialVersionUID = -5907202998030810278L;

    @TypeInfo(complex = true, parser = RcdTargets.Parser.class)
    private RcdTargets targets;
    private boolean enabled = false;
    private double prb = 0.0d;
    private int ief = 0;
    private double iep = 0.0d;

    public final double a() {
        return this.prb;
    }

    public final RcdTargets b() {
        return this.targets;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RcdMetadata rcdMetadata = (RcdMetadata) obj;
            if (this.enabled == rcdMetadata.enabled && Double.compare(this.prb, rcdMetadata.prb) == 0 && this.ief == rcdMetadata.ief && Double.compare(this.iep, rcdMetadata.iep) == 0 && vi.a((Object) this.targets, (Object) rcdMetadata.targets)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Double.valueOf(this.prb), Integer.valueOf(this.ief), Double.valueOf(this.iep), this.targets};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
