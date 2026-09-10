package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.ei;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class WvfMetadata implements Serializable {
    private static final long serialVersionUID = 7999582085237701835L;

    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents;

    @TypeInfo(complex = true, parser = WeightedChoice.Parser.class)
    private WeightedChoice modes;

    @TypeInfo(complex = true, parser = WeightedChoice.Parser.class)
    private WeightedChoice types;

    @TypeInfo(complex = true, parser = EnabledConfig.Parser.class)
    private EnabledConfig warmUpWebView = null;

    @TypeInfo(name = "uaTtl", parser = ei.class)
    private long userAgentTtlMillis = 2592000000L;

    public final ComponentInfoEventConfig a() {
        return this.infoEvents;
    }

    public final WeightedChoice b() {
        return this.modes;
    }

    public final WeightedChoice c() {
        return this.types;
    }

    public final long d() {
        return this.userAgentTtlMillis;
    }

    public final EnabledConfig e() {
        return this.warmUpWebView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WvfMetadata wvfMetadata = (WvfMetadata) obj;
            if (this.userAgentTtlMillis == wvfMetadata.userAgentTtlMillis && vi.a((Object) this.infoEvents, (Object) wvfMetadata.infoEvents) && vi.a((Object) this.types, (Object) wvfMetadata.types) && vi.a((Object) this.modes, (Object) wvfMetadata.modes) && vi.a((Object) this.warmUpWebView, (Object) wvfMetadata.warmUpWebView)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.infoEvents, this.types, this.modes, this.warmUpWebView, Long.valueOf(this.userAgentTtlMillis)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
