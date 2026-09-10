package com.thinkup.core.common.n0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.nom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oo0 extends o {
    nom o;

    public oo0(nom nomVar) {
        this.o = nomVar;
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
        String str = this.o.f42218n;
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
        return new byte[0];
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

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }

    @Override // com.thinkup.core.common.n0.o
    public final boolean o(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return this.o.m;
    }
}
