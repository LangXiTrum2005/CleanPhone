package com.thinkup.core.common.n0;

import android.content.Context;
import com.smartdigimkt.o0.b;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.mmo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ooo extends o {
    boolean m = true;
    mmo o;

    public ooo(mmo mmoVar) {
        this.o = mmoVar;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        return this.o.o0;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        String str = this.o.f42200n;
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

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        JSONObject jSONObject;
        String str = this.o.f42200n;
        boolean z2 = str != null && str.contains(b.d);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.o.oo);
            try {
                if (this.m) {
                    jSONObject.put("ofl", 1);
                }
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (z2) {
            return jSONObject != null ? o.o(jSONObject.toString()) : new byte[0];
        }
        return jSONObject != null ? jSONObject.toString().getBytes() : new byte[0];
    }

    @Override // com.thinkup.core.common.n0.o
    public final boolean o0o() {
        return true;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return null;
    }

    public final void oo0() {
        this.m = false;
    }

    public final mmo ooo() {
        return this.o;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return this.o.m;
    }
}
