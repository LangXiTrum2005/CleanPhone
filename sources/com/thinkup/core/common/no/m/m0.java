package com.thinkup.core.common.no.m;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.dc;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    private final Map<String, String> m;
    private final String o;

    public m0(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (map == null) {
            throw new NullPointerException("authParams == null");
        }
        this.o = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.m = Collections.unmodifiableMap(linkedHashMap);
    }

    private Map<String, String> m() {
        return this.m;
    }

    private String n() {
        return this.m.get("realm");
    }

    private m0 o(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.m);
        linkedHashMap.put(dc.M, charset.name());
        return new m0(this.o, linkedHashMap);
    }

    private Charset o0() {
        String str = this.m.get(dc.M);
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return m0Var.o.equals(this.o) && m0Var.m.equals(this.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + a.b(this.o, 899, 31);
    }

    public final String toString() {
        return this.o + " authParams=" + this.m;
    }

    private String o() {
        return this.o;
    }

    private m0(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 != null) {
            this.o = str;
            this.m = Collections.singletonMap("realm", str2);
            return;
        }
        throw new NullPointerException("realm == null");
    }
}
