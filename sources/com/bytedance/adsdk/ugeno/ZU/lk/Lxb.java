package com.bytedance.adsdk.ugeno.ZU.lk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ZU.ebl;
import com.bytedance.adsdk.ugeno.ZU.lc;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb {
    protected Map<String, String> JXs;
    protected com.bytedance.adsdk.ugeno.LD.lk LD;
    protected ebl Lxb;
    protected Context OY;
    protected com.bytedance.adsdk.ugeno.ZU.LD.Lxb ZU;
    protected String ebl;
    protected String lc;
    protected com.bytedance.adsdk.ugeno.ZU.LD lk;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ZU.lk.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0036Lxb {
        public static Lxb Lxb(Context context, com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.ZU.LD ldLxb;
            com.bytedance.adsdk.ugeno.ZU.LD.Lxb Lxb;
            if (lkVar == null || jSONObject == null || (ldLxb = com.bytedance.adsdk.ugeno.ZU.LD.Lxb(jSONObject, jSONObject2)) == null || (Lxb = ldLxb.Lxb()) == null) {
                return null;
            }
            if (TextUtils.equals(Lxb.Lxb(), "custom")) {
                LD ld = new LD(context);
                ld.Lxb(lkVar);
                ld.Lxb(ldLxb);
                ld.Lxb();
                return ld;
            }
            com.bytedance.adsdk.ugeno.ZU.lk lkVarLxb = lc.Lxb(Lxb.LD());
            if (lkVarLxb == null) {
                return null;
            }
            Lxb Lxb2 = lkVarLxb.Lxb(context);
            Lxb2.Lxb(lkVar);
            Lxb2.Lxb(ldLxb);
            Lxb2.Lxb();
            return Lxb2;
        }
    }

    public Lxb(Context context) {
        this.OY = context;
    }

    public String LD() {
        return this.lc;
    }

    public void Lxb() {
        this.ZU = this.lk.Lxb();
        com.bytedance.adsdk.ugeno.ZU.LD ld = this.lk;
        if (ld == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ZU.LD.Lxb Lxb = ld.Lxb();
        this.ZU = Lxb;
        if (Lxb == null) {
            return;
        }
        this.JXs = Lxb.lk();
        this.lc = this.ZU.LD();
        this.ebl = this.ZU.Lxb();
    }

    public abstract boolean Lxb(Object... objArr);

    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        this.LD = lkVar;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.ZU.LD ld) {
        this.lk = ld;
    }

    public void Lxb(ebl eblVar) {
        this.Lxb = eblVar;
    }
}
