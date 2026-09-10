package com.bytedance.sdk.component.Lxb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Lxb {
    protected String JXs;
    protected NXR LD;
    protected Context Lxb;
    ebl ebl;
    protected OY lk;
    protected Handler ZU = new Handler(Looper.getMainLooper());
    protected volatile boolean lc = false;
    private final Map<String, ebl> OY = new HashMap();

    public void LD() {
        this.ebl.Lxb();
        Iterator<ebl> it = this.OY.values().iterator();
        while (it.hasNext()) {
            it.next().Lxb();
        }
        this.ZU.removeCallbacksAndMessages(null);
        this.lc = true;
    }

    public abstract void LD(nBu nbu);

    public abstract Context Lxb(nBu nbu);

    public abstract String Lxb();

    public abstract void Lxb(String str);

    public void invokeMethod(final String str) {
        if (this.lc) {
            return;
        }
        this.ZU.post(new Runnable() { // from class: com.bytedance.sdk.component.Lxb.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                VVE vveLxb;
                if (Lxb.this.lc) {
                    return;
                }
                try {
                    vveLxb = Lxb.this.Lxb(new JSONObject(str));
                } catch (Exception unused) {
                    vveLxb = null;
                }
                if (!VVE.Lxb(vveLxb)) {
                    Lxb.this.Lxb(vveLxb);
                    return;
                }
                Objects.toString(vveLxb);
                if (vveLxb != null) {
                    Lxb.this.LD(aH.Lxb(new brP(vveLxb.Lxb, "Failed to parse invocation.")), vveLxb);
                }
            }
        });
    }

    public void Lxb(String str, VVE vve) {
        Lxb(str);
    }

    public final void Lxb(VVE vve) {
        String strLxb;
        if (this.lc || (strLxb = Lxb()) == null) {
            return;
        }
        ebl eblVarLD = LD(vve.ebl);
        if (eblVarLD == null) {
            vve.toString();
            if (this.LD != null) {
                Lxb();
            }
            LD(aH.Lxb(new brP(-4, DM.m(new StringBuilder("Namespace "), vve.ebl, " unknown."))), vve);
            return;
        }
        lc lcVar = new lc();
        lcVar.LD = strLxb;
        lcVar.Lxb = this.Lxb;
        lcVar.lk = eblVarLD;
        try {
            ebl.Lxb Lxb = eblVarLD.Lxb(vve, lcVar);
            if (Lxb == null) {
                vve.toString();
                if (this.LD != null) {
                    Lxb();
                }
                LD(aH.Lxb(new brP(-2, "Function " + vve.ZU + " is not registered.")), vve);
                return;
            }
            if (Lxb.Lxb) {
                LD(Lxb.LD, vve);
            }
            if (this.LD != null) {
                Lxb();
            }
        } catch (Exception e) {
            vve.toString();
            LD(aH.Lxb(e), vve);
        }
    }

    public final void LD(String str, VVE vve) {
        JSONObject jSONObject;
        if (this.lc || TextUtils.isEmpty(vve.lc)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            QAg.Lxb(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        Lxb(IeN.Lxb().Lxb("__msg_type", "callback").Lxb("__callback_id", vve.lc).Lxb("__params", jSONObject).LD(), vve);
    }

    private ebl LD(String str) {
        if (!TextUtils.equals(str, this.JXs) && !TextUtils.isEmpty(str)) {
            return this.OY.get(str);
        }
        return this.ebl;
    }

    public final void Lxb(nBu nbu, Sfi sfi) {
        this.Lxb = Lxb(nbu);
        this.lk = nbu.ZU;
        this.LD = nbu.QAg;
        this.ebl = new ebl(nbu, this, sfi);
        this.JXs = nbu.JVA;
        LD(nbu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VVE Lxb(JSONObject jSONObject) {
        String strOptString;
        if (this.lc) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (Lxb() == null) {
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
            return VVE.Lxb().Lxb(string2).LD(string).lk(strOptString3).ZU(strOptString).JXs(strOptString2).lc(strOptString4).ebl(jSONObject.optString("__iframe_url")).Lxb();
        } catch (JSONException unused2) {
            return VVE.Lxb(strOptString2, -1);
        }
    }
}
