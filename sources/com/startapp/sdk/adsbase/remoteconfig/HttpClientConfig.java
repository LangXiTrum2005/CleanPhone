package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class HttpClientConfig implements Serializable {
    private static final long serialVersionUID = -8600520052388289445L;
    private String headersFormat;

    @TypeInfo(complex = true, parser = MapIntTimeoutParser.class)
    private Map<Integer, TimeoutConfig> timeout;
    private boolean compressionEnabled = false;
    private boolean disableSendAdvertisingId = false;

    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    @TypeInfo(type = HashSet.class)
    private Set<String> traceHeaders = Collections.unmodifiableSet(new HashSet(Arrays.asList("server-timing", "siosid")));

    public static class MapIntTimeoutParser implements TypeParser<Map<Integer, TimeoutConfig>> {
        @Override // com.startapp.json.TypeParser
        public Map<Integer, TimeoutConfig> parse(Class<Map<Integer, TimeoutConfig>> cls, Object obj) {
            int i2;
            TimeoutConfig.Parser parser = new TimeoutConfig.Parser();
            if (!(obj instanceof JSONObject)) {
                TimeoutConfig timeoutConfig = parser.parse(TimeoutConfig.class, obj);
                if (timeoutConfig != null) {
                    return Collections.singletonMap(-1, timeoutConfig);
                }
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                TimeoutConfig timeoutConfig2 = parser.parse(TimeoutConfig.class, jSONObject.opt(next));
                if (timeoutConfig2 != null) {
                    WeakHashMap weakHashMap = vi.f41589a;
                    if (next != null) {
                        try {
                            i2 = Integer.parseInt(next);
                        } catch (NumberFormatException unused) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        linkedHashMap.put(Integer.valueOf(i2), timeoutConfig2);
                    }
                }
            }
            return linkedHashMap;
        }
    }

    public final void a(boolean z2) {
        this.compressionEnabled = z2;
    }

    public final void b(boolean z2) {
        this.disableSendAdvertisingId = z2;
    }

    public final TimeoutConfig c() {
        Map<Integer, TimeoutConfig> map = this.timeout;
        if (map != null) {
            return map.get(-1);
        }
        return null;
    }

    public final Set d() {
        return this.traceHeaders;
    }

    public final boolean e() {
        return this.compressionEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpClientConfig httpClientConfig = (HttpClientConfig) obj;
            if (this.compressionEnabled == httpClientConfig.compressionEnabled && this.disableSendAdvertisingId == httpClientConfig.disableSendAdvertisingId && vi.a(this.timeout, httpClientConfig.timeout) && vi.a((Object) this.infoEvents, (Object) httpClientConfig.infoEvents) && vi.a(this.traceHeaders, httpClientConfig.traceHeaders) && vi.a((Object) this.headersFormat, (Object) httpClientConfig.headersFormat)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.disableSendAdvertisingId;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.disableSendAdvertisingId), this.timeout, this.infoEvents, this.traceHeaders, this.headersFormat};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final TimeoutConfig a(int i2) {
        Map<Integer, TimeoutConfig> map;
        if (i2 != 0 && (map = this.timeout) != null) {
            for (Map.Entry<Integer, TimeoutConfig> entry : map.entrySet()) {
                if (((entry.getKey() != null ? entry.getKey().intValue() : 0) & i2) == i2) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public final ComponentInfoEventConfig b() {
        return this.infoEvents;
    }

    public final String a() {
        return this.headersFormat;
    }
}
