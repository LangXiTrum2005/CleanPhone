package com.startapp.sdk.adsbase.remoteconfig;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.ei;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AppSessionConfig implements Serializable {
    private static final long serialVersionUID = 2463582211707601660L;

    @TypeInfo(name = "backgroundTimeout", parser = ei.class)
    private long timeoutMillis = TTAdConstant.AD_MAX_EVENT_TIME;

    public final long a() {
        return this.timeoutMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.timeoutMillis == ((AppSessionConfig) obj).timeoutMillis;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.timeoutMillis)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
