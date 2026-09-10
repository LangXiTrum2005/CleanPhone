package com.bytedance.sdk.openadsdk.core.aw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18102co;
    private String di;
    private String fi;
    ik ik;
    private int jbs;
    private String ka;
    lr lr;
    private double mj;
    private int qt;
    final com.bytedance.sdk.openadsdk.core.model.ka ri = new com.bytedance.sdk.openadsdk.core.model.ka();
    private String sf = "VAST_ACTION_BUTTON";
    private String xha;

    public com.bytedance.sdk.openadsdk.core.model.ka aw() {
        return this.ri;
    }

    public Set<qt> co() {
        return this.ri.lr();
    }

    public String di() {
        return this.di;
    }

    public String fi() {
        return this.fi;
    }

    public ik ik() {
        return this.ik;
    }

    public String jbs() {
        ik ikVar;
        String str = this.di;
        if (!TextUtils.isEmpty(this.f18102co)) {
            String str2 = this.f18102co;
            this.f18102co = null;
            return str2;
        }
        String str3 = this.sf;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            lr lrVar = this.lr;
            if (lrVar != null && !TextUtils.isEmpty(lrVar.mj)) {
                str = this.lr.mj;
            }
        } else if (str3.equals("VAST_END_CARD") && (ikVar = this.ik) != null && !TextUtils.isEmpty(ikVar.mj)) {
            str = this.ik.mj;
        }
        this.sf = "VAST_ACTION_BUTTON";
        return str;
    }

    public String ka() {
        return this.ka;
    }

    public lr lr() {
        return this.lr;
    }

    public double mj() {
        return this.mj;
    }

    public int qt() {
        return this.jbs;
    }

    public ka ri() {
        return this.ri.ri();
    }

    public int sf() {
        return this.qt;
    }

    public String xha() {
        return this.xha;
    }

    public void di(String str) {
        this.f18102co = str;
    }

    public void fi(String str) {
        this.sf = str;
    }

    public void ik(String str) {
        this.di = str;
    }

    public void ka(String str) {
        this.xha = str;
    }

    public void lr(String str) {
        this.fi = str;
    }

    public void ri(lr lrVar) {
        if (lrVar != null) {
            lrVar.ri(this.xha);
        }
        this.lr = lrVar;
    }

    public void lr(int i) {
        this.qt = i;
    }

    public void ri(ik ikVar) {
        if (ikVar != null) {
            ikVar.ri(this.xha);
        }
        this.ik = ikVar;
    }

    public void ri(String str) {
        this.ka = str;
    }

    public void ri(double d) {
        this.mj = d;
    }

    public static ri ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ri riVar = new ri();
        ka kaVarRi = riVar.ri.ri();
        if (kaVarRi == null) {
            kaVarRi = new ka();
            riVar.ri.ri(kaVarRi);
        }
        kaVarRi.ri(jSONObject.optJSONObject("videoTrackers"));
        riVar.lr = lr.ri(jSONObject.optJSONObject("vastIcon"));
        riVar.ik = ik.lr(jSONObject.optJSONObject("endCard"));
        riVar.ka = jSONObject.optString("title");
        riVar.fi = jSONObject.optString(InMobiNetworkValues.DESCRIPTION);
        riVar.di = jSONObject.optString("clickThroughUrl");
        riVar.xha = jSONObject.optString("videoUrl");
        riVar.mj = jSONObject.optDouble("videDuration");
        riVar.jbs = jSONObject.optInt("videoWidth");
        riVar.jbs = jSONObject.optInt("videoHeight");
        Set<qt> setLr = riVar.ri.lr();
        if (setLr == null) {
            setLr = new HashSet<>();
            riVar.ri.ri(setLr);
        }
        setLr.addAll(qt.ri(jSONObject.optJSONArray("viewabilityVendor")));
        return riVar;
    }

    public void ri(wjv wjvVar) {
        this.ri.ri(wjvVar);
        lr lrVar = this.lr;
        if (lrVar != null) {
            lrVar.ri(wjvVar);
        }
        ik ikVar = this.ik;
        if (ikVar != null) {
            ikVar.ri(wjvVar);
        }
    }

    public void ri(int i) {
        this.jbs = i;
    }

    public void ri(Set<qt> set) {
        this.ri.lr(set);
    }
}
