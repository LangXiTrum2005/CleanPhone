package com.bytedance.sdk.component.ri;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri {
    protected String fi;
    protected xha ik;
    protected sf lr;
    protected Context ri;
    di xha;
    protected Handler ka = new Handler(Looper.getMainLooper());
    protected volatile boolean di = false;
    private final Map<String, di> mj = new HashMap();

    public final void ik(jbs jbsVar) {
        this.ri = ri(jbsVar);
        this.ik = jbsVar.ka;
        this.lr = jbsVar.mj;
        this.xha = new di(jbsVar, this);
        this.fi = jbsVar.qt;
        lr(jbsVar);
    }

    public void invokeMethod(final String str) {
        if (this.di) {
            return;
        }
        this.ka.post(new Runnable() { // from class: com.bytedance.sdk.component.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                bgr bgrVarRi;
                if (ri.this.di) {
                    return;
                }
                try {
                    bgrVarRi = ri.this.ri(new JSONObject(str));
                } catch (Exception unused) {
                    bgrVarRi = null;
                }
                if (!bgr.ri(bgrVarRi)) {
                    ri.this.ri(bgrVarRi);
                    return;
                }
                Objects.toString(bgrVarRi);
                if (bgrVarRi != null) {
                    ri.this.lr(tan.ri(new slm(bgrVarRi.ri, "Failed to parse invocation.")), bgrVarRi);
                }
            }
        });
    }

    public void lr() {
        this.xha.ri();
        Iterator<di> it = this.mj.values().iterator();
        while (it.hasNext()) {
            it.next().ri();
        }
        this.ka.removeCallbacksAndMessages(null);
        this.di = true;
    }

    public abstract void lr(jbs jbsVar);

    public abstract Context ri(jbs jbsVar);

    public abstract String ri();

    public abstract void ri(String str);

    public void ri(String str, bgr bgrVar) {
        ri(str);
    }

    public final void ri(bgr bgrVar) {
        String strRi;
        if (this.di || (strRi = ri()) == null) {
            return;
        }
        di diVarLr = lr(bgrVar.xha);
        if (diVarLr == null) {
            bgrVar.toString();
            if (this.lr != null) {
                ri();
            }
            lr(tan.ri(new slm(-4, "Namespace " + bgrVar.xha + " unknown.")), bgrVar);
            return;
        }
        fi fiVar = new fi();
        fiVar.lr = strRi;
        fiVar.ri = this.ri;
        fiVar.ik = diVarLr;
        try {
            di.ri riVarRi = diVarLr.ri(bgrVar, fiVar);
            if (riVarRi == null) {
                bgrVar.toString();
                if (this.lr != null) {
                    ri();
                }
                lr(tan.ri(new slm(-2, "Function " + bgrVar.ka + " is not registered.")), bgrVar);
                return;
            }
            if (riVarRi.ri) {
                lr(riVarRi.lr, bgrVar);
            }
            if (this.lr != null) {
                ri();
            }
        } catch (Exception e) {
            bgrVar.toString();
            lr(tan.ri(e), bgrVar);
        }
    }

    public final void lr(String str, bgr bgrVar) {
        JSONObject jSONObject;
        if (this.di || TextUtils.isEmpty(bgrVar.di)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            mj.ri(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        ri(aw.ri().ri("__msg_type", "callback").ri("__callback_id", bgrVar.di).ri("__params", jSONObject).lr(), bgrVar);
    }

    private di lr(String str) {
        if (!TextUtils.equals(str, this.fi) && !TextUtils.isEmpty(str)) {
            return this.mj.get(str);
        }
        return this.xha;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bgr ri(JSONObject jSONObject) {
        String strOptString;
        if (this.di) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (ri() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return bgr.ri().ri(string2).lr(string).ik(strOptString3).ka(strOptString).fi(strOptString2).di(strOptString4).xha(jSONObject.optString("__iframe_url")).ri();
        } catch (JSONException unused2) {
            return bgr.ri(strOptString2, -1);
        }
    }
}
