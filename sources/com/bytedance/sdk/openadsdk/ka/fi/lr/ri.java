package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.openadsdk.core.model.wjv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private boolean di = false;
    private ik fi;
    private JSONObject ik;
    private JSONObject ka;
    private String lr;
    private wjv ri;

    public ri(wjv wjvVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.ri = wjvVar;
        this.lr = str;
        this.ik = jSONObject;
        this.ka = jSONObject2;
    }

    public boolean di() {
        return this.di;
    }

    public ik fi() {
        return this.fi;
    }

    public JSONObject ik() {
        if (this.ik == null) {
            this.ik = new JSONObject();
        }
        return this.ik;
    }

    public JSONObject ka() {
        if (this.ka == null) {
            this.ka = new JSONObject();
        }
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public wjv ri() {
        return this.ri;
    }

    public void xha() {
        ik ikVar = this.fi;
        if (ikVar != null) {
            ikVar.ri(this);
        }
    }

    public void ri(ik ikVar) {
        this.fi = ikVar;
    }

    public void ri(boolean z) {
        this.di = z;
    }
}
