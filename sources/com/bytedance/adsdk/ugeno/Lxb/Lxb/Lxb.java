package com.bytedance.adsdk.ugeno.Lxb.Lxb;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb {
    protected com.bytedance.adsdk.ugeno.LD.lk LD;
    protected JSONObject Lxb;
    private String lk;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0031Lxb {
        public static Lxb Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject) {
            if (lkVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new JXs(lkVar, jSONObject);
                case "ripple":
                    return new LD(lkVar, jSONObject);
                case "rub_in":
                    return new lk(lkVar, jSONObject);
                case "shine":
                    return new ZU(lkVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject) {
        this.Lxb = jSONObject;
        this.LD = lkVar;
        Lxb();
    }

    public abstract void LD();

    public void Lxb() {
        this.lk = this.Lxb.optString("type");
        LD();
    }

    public abstract void Lxb(int i, int i2);

    public abstract void Lxb(Canvas canvas);

    public String ZU() {
        return this.lk;
    }

    public abstract List<PropertyValuesHolder> lk();
}
