package com.bytedance.sdk.openadsdk.core.JVA.ZU;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.brP;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.lc;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private boolean IeN;
    private JSONObject JVA;
    private com.bytedance.adsdk.ugeno.LD.lk JXs;
    private boolean NXR;
    private final tD OY;
    private final String QAg;
    private boolean STP;
    private JSONArray VVE;
    private com.bytedance.adsdk.ugeno.LD.lk ZU;
    private final Context ebl;
    private com.bytedance.adsdk.ugeno.LD.lk lk;
    private lc nBu;
    private final JSONObject sLN;
    private int Lxb = -1;
    private int LD = -1;
    private final String lc = "UGenSwiperEvent";

    public ZU(Context context, tD tDVar, String str, JSONObject jSONObject) {
        this.ebl = context;
        this.OY = tDVar;
        this.QAg = str;
        this.sLN = jSONObject;
    }

    public JSONObject ZU() {
        return this.JVA;
    }

    public void LD() {
        int i;
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.JXs;
        if (!(lkVar instanceof com.bytedance.adsdk.ugeno.LD) || (i = this.Lxb) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.LD) lkVar).Lxb(i - 1);
    }

    public void lk() {
        int i;
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.JXs;
        if (!(lkVar instanceof com.bytedance.adsdk.ugeno.LD) || (i = this.Lxb) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.LD) lkVar).Lxb(i + 1);
    }

    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk<View> lkVar) {
        com.bytedance.adsdk.ugeno.LD.lk<T> lkVarLk = lkVar.lk("swiperLayout");
        this.JXs = lkVarLk;
        if (lkVarLk instanceof com.bytedance.adsdk.ugeno.LD) {
            this.VVE = this.sLN.optJSONArray("dpa_data");
            this.lk = lkVar.lk("swiperLeftArrow");
            this.ZU = lkVar.lk("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.LD) this.JXs).Lxb(new com.bytedance.adsdk.ugeno.lc.lk() { // from class: com.bytedance.sdk.openadsdk.core.JVA.ZU.ZU.1
                @Override // com.bytedance.adsdk.ugeno.lc.lk
                public void Lxb(boolean z, int i, int i2, boolean z2, boolean z3) {
                    ZU.this.LD = i;
                    ZU.this.Lxb = i2;
                    ZU.this.NXR = z;
                    ZU.this.STP = z2;
                    ZU.this.IeN = z3;
                    ZU.this.Lxb(z, z2, z3);
                    ZU.this.Lxb(i);
                }
            });
        }
    }

    public void Lxb() {
        Lxb(this.NXR, this.STP, this.IeN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(boolean z, boolean z2, boolean z3) {
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.lk;
        if (lkVar == null || this.ZU == null) {
            return;
        }
        View viewQAg = lkVar.QAg();
        View viewQAg2 = this.ZU.QAg();
        JSONArray jSONArray = this.VVE;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewQAg.setVisibility(8);
            viewQAg2.setVisibility(8);
            return;
        }
        if (z) {
            return;
        }
        if (z2) {
            if (viewQAg instanceof TextView) {
                Lxb((TextView) viewQAg, 90);
            }
            if (viewQAg2 instanceof TextView) {
                Lxb((TextView) viewQAg2, 255);
                return;
            }
            return;
        }
        if (z3) {
            if (viewQAg instanceof TextView) {
                Lxb((TextView) viewQAg, 255);
            }
            if (viewQAg2 instanceof TextView) {
                Lxb((TextView) viewQAg2, 90);
                return;
            }
            return;
        }
        if (viewQAg instanceof TextView) {
            Lxb((TextView) viewQAg, 255);
        }
        if (viewQAg2 instanceof TextView) {
            Lxb((TextView) viewQAg2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.OY, this.QAg, "carousel_show", jSONObject);
    }

    private void Lxb(TextView textView, int i) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void Lxb(lc lcVar) {
        this.nBu = lcVar;
    }

    public boolean Lxb(nBu nbu) {
        JSONObject jSONObjectOptJSONObject;
        this.JVA = null;
        int i = this.LD;
        if (i != -1 && i != 0) {
            try {
                JSONObject jSONObjectLk = nbu.lk();
                if (jSONObjectLk != null && (jSONObjectOptJSONObject = jSONObjectLk.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.VVE != null) {
                            String strLxb = com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObjectOptJSONObject.optString("url"), this.VVE.optJSONObject(this.LD));
                            String strLxb2 = com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObjectOptJSONObject.optString("fallback_url"), this.VVE.optJSONObject(this.LD));
                            jSONObjectOptJSONObject.put("url", strLxb);
                            jSONObjectOptJSONObject.put("fallback_url", strLxb2);
                            Lxb(jSONObjectOptJSONObject, this.VVE.optJSONObject(this.LD));
                        }
                        Lxb(jSONObjectOptJSONObject, nbu.Lxb().QAg());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                sLN.Lxb("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.JVA = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.JVA.putOpt(next, com.bytedance.adsdk.ugeno.lk.LD.Lxb((String) this.JVA.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.JVA);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    private boolean Lxb(int i, String str, String str2) {
        if (i == 1) {
            if (!IeN.Lxb(str)) {
                return false;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (!IeN.Lxb(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !IeN.Lxb(str2)) {
            return false;
        }
        return true;
    }

    private void Lxb(JSONObject jSONObject, View view) {
        if (Lxb(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            brP.Lxb(Lxb(view), this.ebl instanceof Activity, jSONObject, this.OY, this.QAg, nJ.Lxb(this.QAg), null, this.nBu);
        }
    }

    private Context Lxb(View view) {
        Activity activityLxb = view != null ? com.bytedance.sdk.component.utils.LD.Lxb(view) : null;
        return activityLxb == null ? this.ebl : activityLxb;
    }
}
