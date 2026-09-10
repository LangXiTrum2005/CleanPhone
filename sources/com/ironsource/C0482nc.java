package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0482nc {

    /* JADX INFO: renamed from: com.ironsource.nc$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29844a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f29845b = "SDKPluginType";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f29846c = "sessionid";

        private a() {
        }
    }

    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.f29845b, pluginType);
        }
        String strD = IronSourceUtils.d();
        if (strD != null) {
            linkedHashMap.put("sessionid", strD);
        }
        return linkedHashMap;
    }
}
