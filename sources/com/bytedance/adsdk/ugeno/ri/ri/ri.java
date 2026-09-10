package com.bytedance.adsdk.ugeno.ri.ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri {
    private String ik;
    protected com.bytedance.adsdk.ugeno.lr.ik lr;
    protected JSONObject ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri.ri$ri, reason: collision with other inner class name */
    public static class C0196ri {
        public static ri ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject) {
            if (ikVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new fi(ikVar, jSONObject);
                case "ripple":
                    return new lr(ikVar, jSONObject);
                case "rub_in":
                    return new ik(ikVar, jSONObject);
                case "shine":
                    return new ka(ikVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject) {
        this.ri = jSONObject;
        this.lr = ikVar;
        ri();
    }

    public abstract List<PropertyValuesHolder> ik();

    public String ka() {
        return this.ik;
    }

    public abstract void lr();

    public abstract void lr(Canvas canvas);

    public void ri() {
        this.ik = this.ri.optString("type");
        lr();
    }

    public abstract void ri(int i, int i2);

    public abstract void ri(Canvas canvas);
}
