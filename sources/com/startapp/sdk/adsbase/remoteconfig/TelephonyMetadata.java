package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TelephonyMetadata implements Serializable {
    private static final long serialVersionUID = -644112324647697192L;

    @TypeInfo(type = HashMap.class, value = TelephonyDataConfig.class)
    private Map<String, TelephonyDataConfig> data;
    private boolean enabled;
    private int ief = 0;
    private double iep = 0.0d;
    private boolean rciu;

    public final int a() {
        return this.ief;
    }

    public final double b() {
        return this.iep;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean d() {
        return this.rciu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TelephonyMetadata telephonyMetadata = (TelephonyMetadata) obj;
            if (this.enabled == telephonyMetadata.enabled && this.ief == telephonyMetadata.ief && Double.compare(this.iep, telephonyMetadata.iep) == 0 && this.rciu == telephonyMetadata.rciu && vi.a(this.data, telephonyMetadata.data)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.ief), Double.valueOf(this.iep), Boolean.valueOf(this.rciu), this.data};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final TelephonyDataConfig a(String str) {
        Map<String, TelephonyDataConfig> map = this.data;
        TelephonyDataConfig telephonyDataConfig = map != null ? map.get(str) : null;
        return telephonyDataConfig != null ? telephonyDataConfig : TelephonyDataConfig.f40714a;
    }
}
