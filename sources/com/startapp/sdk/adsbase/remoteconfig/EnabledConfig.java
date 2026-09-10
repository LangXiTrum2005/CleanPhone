package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.JsonParser;
import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class EnabledConfig implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f40697a = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
    private static final long serialVersionUID = 3477168612652239188L;
    private double chance;
    private String from;
    private String till;

    public static class Parser implements TypeParser<EnabledConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public EnabledConfig parse(Class<EnabledConfig> cls, Object obj) {
            if (obj instanceof Boolean) {
                return new EnabledConfig(Boolean.TRUE.equals(obj) ? 1.0d : 0.0d);
            }
            if (obj instanceof String) {
                return new EnabledConfig(Boolean.parseBoolean((String) obj) ? 1.0d : 0.0d);
            }
            if (obj instanceof Number) {
                return new EnabledConfig(((Number) obj).doubleValue());
            }
            if (obj instanceof JSONObject) {
                return (EnabledConfig) JsonParser.fromJsonObject((JSONObject) obj, cls);
            }
            return null;
        }
    }

    public EnabledConfig() {
        this.chance = 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r0.getTime() < r7.a()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r7.a() < r0.getTime()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.startapp.sdk.internal.f3 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.from
            r1 = 0
            if (r0 == 0) goto L1a
            java.text.SimpleDateFormat r2 = com.startapp.sdk.adsbase.remoteconfig.EnabledConfig.f40697a     // Catch: java.lang.Throwable -> L19
            java.util.Date r0 = r2.parse(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1a
            long r2 = r7.a()     // Catch: java.lang.Throwable -> L19
            long r4 = r0.getTime()     // Catch: java.lang.Throwable -> L19
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1a
        L19:
            return r1
        L1a:
            java.lang.String r0 = r6.till
            if (r0 == 0) goto L33
            java.text.SimpleDateFormat r2 = com.startapp.sdk.adsbase.remoteconfig.EnabledConfig.f40697a     // Catch: java.lang.Throwable -> L32
            java.util.Date r0 = r2.parse(r0)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L33
            long r2 = r0.getTime()     // Catch: java.lang.Throwable -> L32
            long r4 = r7.a()     // Catch: java.lang.Throwable -> L32
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L33
        L32:
            return r1
        L33:
            double r0 = r6.chance
            boolean r7 = com.startapp.sdk.internal.vi.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.EnabledConfig.a(com.startapp.sdk.internal.f3):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EnabledConfig enabledConfig = (EnabledConfig) obj;
            if (Double.compare(this.chance, enabledConfig.chance) == 0 && vi.a((Object) this.from, (Object) enabledConfig.from) && vi.a((Object) this.till, (Object) enabledConfig.till)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.chance), this.from, this.till};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public EnabledConfig(double d) {
        this.chance = d;
    }
}
