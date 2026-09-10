package com.bytedance.adsdk.ugeno.qdl.qdl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl {
    private String lnr;
    protected JSONObject qdl;
    protected com.bytedance.adsdk.ugeno.ud.lnr ud;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.qdl.qdl.qdl$qdl, reason: collision with other inner class name */
    public static class C0067qdl {
        public static qdl qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
            if (lnrVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new mzz(lnrVar, jSONObject);
                case "ripple":
                    return new ud(lnrVar, jSONObject);
                case "rub_in":
                    return new lnr(lnrVar, jSONObject);
                case "shine":
                    return new mml(lnrVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        this.qdl = jSONObject;
        this.ud = lnrVar;
        qdl();
    }

    public abstract List<PropertyValuesHolder> lnr();

    public String mml() {
        return this.lnr;
    }

    public void qdl() {
        this.lnr = this.qdl.optString("type");
        ud();
    }

    public abstract void qdl(int i2, int i3);

    public abstract void qdl(Canvas canvas);

    public abstract void ud();

    public abstract void ud(Canvas canvas);
}
