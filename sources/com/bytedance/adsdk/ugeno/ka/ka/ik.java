package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik {
    protected String di;
    protected Map<String, String> fi;
    protected com.bytedance.adsdk.ugeno.ka.di ik;
    protected String jbs;
    protected com.bytedance.adsdk.ugeno.ka.di.ri ka;
    protected com.bytedance.adsdk.ugeno.lr.ik lr;
    protected String mj;
    protected Context qt;
    protected com.bytedance.adsdk.ugeno.ka.sf ri;
    protected String xha;

    public static class ri {
        public static ik ri(Context context, com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.ka.di diVarRi;
            com.bytedance.adsdk.ugeno.ka.di.ri riVarRi;
            if (ikVar == null || jSONObject == null || (diVarRi = com.bytedance.adsdk.ugeno.ka.di.ri(jSONObject, jSONObject2)) == null || (riVarRi = diVarRi.ri()) == null) {
                return null;
            }
            String strRi = riVarRi.ri();
            if (TextUtils.equals(strRi, "custom")) {
                ka kaVar = new ka(context);
                kaVar.ri(ikVar);
                kaVar.ri(diVarRi);
                kaVar.ik();
                return kaVar;
            }
            com.bytedance.adsdk.ugeno.ka.xha xhaVarRi = (TextUtils.isEmpty(strRi) || TextUtils.equals(strRi, "global")) ? com.bytedance.adsdk.ugeno.ka.qt.ri(riVarRi.lr()) : com.bytedance.adsdk.ugeno.ka.qt.ri(riVarRi.fi());
            if (xhaVarRi == null) {
                return null;
            }
            ik ikVarRi = xhaVarRi.ri(context);
            ikVarRi.ri(ikVar);
            ikVarRi.ri(diVarRi);
            ikVarRi.ik();
            return ikVarRi;
        }
    }

    public ik(Context context) {
        this.qt = context;
    }

    public String di() {
        return this.jbs;
    }

    public String fi() {
        return this.mj;
    }

    public void ik() {
        this.ka = this.ik.ri();
        com.bytedance.adsdk.ugeno.ka.di diVar = this.ik;
        if (diVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ka.di.ri riVarRi = diVar.ri();
        this.ka = riVarRi;
        if (riVarRi == null) {
            return;
        }
        this.fi = riVarRi.ik();
        this.di = this.ka.lr();
        this.xha = this.ka.ri();
        this.mj = this.ka.ka();
        this.jbs = this.ka.fi();
    }

    public String ka() {
        return this.di;
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        this.lr = ikVar;
    }

    public abstract boolean ri(Object... objArr);

    public com.bytedance.adsdk.ugeno.ka.di xha() {
        return this.ik;
    }

    public void ri(com.bytedance.adsdk.ugeno.ka.di diVar) {
        this.ik = diVar;
    }

    public void ri(com.bytedance.adsdk.ugeno.ka.sf sfVar) {
        this.ri = sfVar;
    }
}
