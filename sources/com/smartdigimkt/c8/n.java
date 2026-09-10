package com.smartdigimkt.c8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class n extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.a7.d f34367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34368c;

    public n(com.smartdigimkt.a7.d dVar, boolean z2) {
        this.f34367b = dVar;
        this.f34368c = z2;
    }

    @Override // com.smartdigimkt.c8.d
    public Map<String, String> g() {
        String str = this.f34367b.f33781c;
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return map;
    }

    @Override // com.smartdigimkt.c8.d
    public byte[] j() {
        JSONObject jSONObject;
        try {
            String str = this.f34367b.f33781c;
            boolean z2 = str != null && str.contains(com.smartdigimkt.o0.b.d);
            try {
                jSONObject = new JSONObject(this.f34367b.f33782e);
                try {
                    if (this.f34368c) {
                        jSONObject.put("ofl", 1);
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                jSONObject = null;
            }
            if (z2) {
                return jSONObject != null ? a(jSONObject.toString()) : new byte[0];
            }
            return jSONObject != null ? jSONObject.toString().getBytes() : new byte[0];
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // com.smartdigimkt.c8.d
    public int l() {
        return this.f34367b.f33780b;
    }

    @Override // com.smartdigimkt.c8.d
    public String m() {
        return this.f34367b.d;
    }
}
