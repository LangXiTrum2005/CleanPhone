package com.thinkup.core.common.n0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.on.n00;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class no extends o0n {
    private static final String nm = "no";
    JSONObject o;

    public no(Context context, n00 n00Var) {
        super(context, n00Var);
        this.o = n00Var.o();
    }

    @Override // com.thinkup.core.common.n0.o0n, com.thinkup.core.common.n0.o
    public final String m() {
        com.thinkup.core.common.mo.o();
        return com.thinkup.core.common.mo.m0();
    }

    @Override // com.thinkup.core.common.n0.o0n, com.thinkup.core.common.n0.o
    public final JSONObject mo() {
        JSONObject jSONObjectMo = super.mo();
        try {
            jSONObjectMo.put("m_data", this.o);
        } catch (JSONException unused) {
        }
        return jSONObjectMo;
    }

    @Override // com.thinkup.core.common.n0.o0n, com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }

    @Override // com.thinkup.core.common.n0.o0n, com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        try {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (((o0n) this).f41975n != null) {
                jSONObject.put(o0n.m, new JSONObject(((o0n) this).f41975n));
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
