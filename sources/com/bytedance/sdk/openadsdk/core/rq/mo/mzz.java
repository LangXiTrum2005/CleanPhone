package com.bytedance.sdk.openadsdk.core.rq.mo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz {
    private boolean bjy;
    private boolean exu;
    private final JSONObject fs;
    private final ljh jpc;
    private JSONArray jtx;
    private com.bytedance.adsdk.ugeno.ud.lnr lnr;
    private com.bytedance.adsdk.ugeno.ud.lnr mml;
    private com.bytedance.adsdk.ugeno.ud.lnr mzz;
    private boolean rdp;
    private JSONObject rq;
    private com.bytedance.sdk.openadsdk.core.widget.mzz to;
    private final String tvp;
    private final Context wd;
    private int qdl = -1;
    private int ud = -1;
    private final String mo = "UGenSwiperEvent";

    public mzz(Context context, ljh ljhVar, String str, JSONObject jSONObject) {
        this.wd = context;
        this.jpc = ljhVar;
        this.tvp = str;
        this.fs = jSONObject;
    }

    public JSONObject mml() {
        return this.rq;
    }

    public void lnr() {
        int i2;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.mzz;
        if (!(lnrVar instanceof com.bytedance.adsdk.ugeno.lnr) || (i2 = this.qdl) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lnr) lnrVar).qdl(i2 + 1);
    }

    public void ud() {
        int i2;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.mzz;
        if (!(lnrVar instanceof com.bytedance.adsdk.ugeno.lnr) || (i2 = this.qdl) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lnr) lnrVar).qdl(i2 - 1);
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
        com.bytedance.adsdk.ugeno.ud.lnr<T> lnrVarMzz = lnrVar.mzz("swiperLayout");
        this.mzz = lnrVarMzz;
        if (lnrVarMzz instanceof com.bytedance.adsdk.ugeno.lnr) {
            this.jtx = this.fs.optJSONArray("dpa_data");
            this.lnr = lnrVar.mzz("swiperLeftArrow");
            this.mml = lnrVar.mzz("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.lnr) this.mzz).qdl(new com.bytedance.adsdk.ugeno.mo.lnr() { // from class: com.bytedance.sdk.openadsdk.core.rq.mo.mzz.1
                @Override // com.bytedance.adsdk.ugeno.mo.lnr
                public void qdl(boolean z2, int i2) {
                }

                @Override // com.bytedance.adsdk.ugeno.mo.lnr
                public void qdl(boolean z2, int i2, float f, int i3) {
                }

                @Override // com.bytedance.adsdk.ugeno.mo.lnr
                public void qdl(boolean z2, int i2, int i3, boolean z3, boolean z4) {
                    mzz.this.ud = i2;
                    mzz.this.qdl = i3;
                    mzz.this.exu = z2;
                    mzz.this.rdp = z3;
                    mzz.this.bjy = z4;
                    mzz.this.qdl(z2, z3, z4);
                    mzz.this.qdl(i2);
                }
            });
        }
    }

    public void qdl() {
        qdl(this.exu, this.rdp, this.bjy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(boolean z2, boolean z3, boolean z4) {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.lnr;
        if (lnrVar == null || this.mml == null) {
            return;
        }
        View viewRq = lnrVar.rq();
        View viewRq2 = this.mml.rq();
        JSONArray jSONArray = this.jtx;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewRq.setVisibility(8);
            viewRq2.setVisibility(8);
            return;
        }
        if (z2) {
            return;
        }
        if (z3) {
            if (viewRq instanceof TextView) {
                qdl((TextView) viewRq, 90);
            }
            if (viewRq2 instanceof TextView) {
                qdl((TextView) viewRq2, 255);
                return;
            }
            return;
        }
        if (z4) {
            if (viewRq instanceof TextView) {
                qdl((TextView) viewRq, 255);
            }
            if (viewRq2 instanceof TextView) {
                qdl((TextView) viewRq2, 90);
                return;
            }
            return;
        }
        if (viewRq instanceof TextView) {
            qdl((TextView) viewRq, 255);
        }
        if (viewRq2 instanceof TextView) {
            qdl((TextView) viewRq2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i2);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.jpc, this.tvp, "carousel_show", jSONObject);
    }

    private void qdl(TextView textView, int i2) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i2, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.widget.mzz mzzVar) {
        this.to = mzzVar;
    }

    public boolean qdl(exu exuVar) {
        JSONObject jSONObjectOptJSONObject;
        this.rq = null;
        int i2 = this.ud;
        if (i2 != -1 && i2 != 0) {
            try {
                JSONObject jSONObjectLnr = exuVar.lnr();
                if (jSONObjectLnr != null && (jSONObjectOptJSONObject = jSONObjectLnr.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.jtx != null) {
                            String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectOptJSONObject.optString("url"), this.jtx.optJSONObject(this.ud));
                            String strQdl2 = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectOptJSONObject.optString("fallback_url"), this.jtx.optJSONObject(this.ud));
                            jSONObjectOptJSONObject.put("url", strQdl);
                            jSONObjectOptJSONObject.put("fallback_url", strQdl2);
                            qdl(jSONObjectOptJSONObject, this.jtx.optJSONObject(this.ud));
                        }
                        qdl(jSONObjectOptJSONObject, exuVar.qdl().rq());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                aaj.lnr("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.rq = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.rq.putOpt(next, com.bytedance.adsdk.ugeno.lnr.ud.qdl((String) this.rq.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.rq);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    private boolean qdl(int i2, String str, String str2) {
        if (i2 == 1) {
            if (!jl.qdl(str)) {
                return false;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (!jl.qdl(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !jl.qdl(str2)) {
            return false;
        }
        return true;
    }

    private void qdl(JSONObject jSONObject, View view) {
        if (qdl(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            com.bytedance.sdk.openadsdk.core.jl.qdl(qdl(view), this.wd instanceof Activity, jSONObject, this.jpc, this.tvp, gy.qdl(this.tvp), null, this.to);
        }
    }

    private Context qdl(View view) {
        Activity activityQdl = view != null ? com.bytedance.sdk.component.utils.ud.qdl(view) : null;
        return activityQdl == null ? this.wd : activityQdl;
    }
}
