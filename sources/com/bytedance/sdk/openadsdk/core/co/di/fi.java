package com.bytedance.sdk.openadsdk.core.co.di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.tan;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private boolean aw;
    private boolean bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final JSONObject f18107co;
    private com.bytedance.adsdk.ugeno.lr.ik fi;
    private com.bytedance.adsdk.ugeno.lr.ik ik;
    private final String jbs;
    private com.bytedance.adsdk.ugeno.lr.ik ka;
    private final wjv mj;
    private com.bytedance.sdk.openadsdk.core.widget.fi qt;
    private JSONObject sf;
    private JSONArray slm;
    private boolean vr;
    private final Context xha;
    private int ri = -1;
    private int lr = -1;
    private final String di = "UGenSwiperEvent";

    public fi(Context context, wjv wjvVar, String str, JSONObject jSONObject) {
        this.xha = context;
        this.mj = wjvVar;
        this.jbs = str;
        this.f18107co = jSONObject;
    }

    public JSONObject ka() {
        return this.sf;
    }

    public void ik() {
        int i;
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.fi;
        if (!(ikVar instanceof com.bytedance.adsdk.ugeno.ik) || (i = this.ri) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ik) ikVar).ri(i + 1);
    }

    public void lr() {
        int i;
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.fi;
        if (!(ikVar instanceof com.bytedance.adsdk.ugeno.ik) || (i = this.ri) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ik) ikVar).ri(i - 1);
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik<View> ikVar) {
        com.bytedance.adsdk.ugeno.lr.ik<T> ikVarFi = ikVar.fi("swiperLayout");
        this.fi = ikVarFi;
        if (ikVarFi instanceof com.bytedance.adsdk.ugeno.ik) {
            this.slm = this.f18107co.optJSONArray("dpa_data");
            this.ik = ikVar.fi("swiperLeftArrow");
            this.ka = ikVar.fi("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.ik) this.fi).ri(new com.bytedance.adsdk.ugeno.di.ik() { // from class: com.bytedance.sdk.openadsdk.core.co.di.fi.1
                @Override // com.bytedance.adsdk.ugeno.di.ik
                public void ri(boolean z, int i) {
                }

                @Override // com.bytedance.adsdk.ugeno.di.ik
                public void ri(boolean z, int i, float f, int i2) {
                }

                @Override // com.bytedance.adsdk.ugeno.di.ik
                public void ri(boolean z, int i, int i2, boolean z2, boolean z3) {
                    fi.this.lr = i;
                    fi.this.ri = i2;
                    fi.this.aw = z;
                    fi.this.bgr = z2;
                    fi.this.vr = z3;
                    fi.this.ri(z, z2, z3);
                    fi.this.ri(i);
                }
            });
        }
    }

    public void ri() {
        ri(this.aw, this.bgr, this.vr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(boolean z, boolean z2, boolean z3) {
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.ik;
        if (ikVar == null || this.ka == null) {
            return;
        }
        View viewSf = ikVar.sf();
        View viewSf2 = this.ka.sf();
        JSONArray jSONArray = this.slm;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewSf.setVisibility(8);
            viewSf2.setVisibility(8);
            return;
        }
        if (z) {
            return;
        }
        if (z2) {
            if (viewSf instanceof TextView) {
                ri((TextView) viewSf, 90);
            }
            if (viewSf2 instanceof TextView) {
                ri((TextView) viewSf2, 255);
                return;
            }
            return;
        }
        if (z3) {
            if (viewSf instanceof TextView) {
                ri((TextView) viewSf, 255);
            }
            if (viewSf2 instanceof TextView) {
                ri((TextView) viewSf2, 90);
                return;
            }
            return;
        }
        if (viewSf instanceof TextView) {
            ri((TextView) viewSf, 255);
        }
        if (viewSf2 instanceof TextView) {
            ri((TextView) viewSf2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.mj, this.jbs, "carousel_show", jSONObject);
    }

    private void ri(TextView textView, int i) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void ri(com.bytedance.sdk.openadsdk.core.widget.fi fiVar) {
        this.qt = fiVar;
    }

    public boolean ri(aw awVar) {
        JSONObject jSONObjectOptJSONObject;
        this.sf = null;
        int i = this.lr;
        if (i != -1 && i != 0) {
            try {
                JSONObject jSONObjectIk = awVar.ik();
                if (jSONObjectIk != null && (jSONObjectOptJSONObject = jSONObjectIk.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.slm != null) {
                            String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectOptJSONObject.optString("url"), this.slm.optJSONObject(this.lr));
                            String strRi2 = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectOptJSONObject.optString("fallback_url"), this.slm.optJSONObject(this.lr));
                            jSONObjectOptJSONObject.put("url", strRi);
                            jSONObjectOptJSONObject.put("fallback_url", strRi2);
                            ri(jSONObjectOptJSONObject, this.slm.optJSONObject(this.lr));
                        }
                        ri(jSONObjectOptJSONObject, awVar.ri().sf());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                ac.ik("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.sf = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.sf.putOpt(next, com.bytedance.adsdk.ugeno.ik.lr.ri((String) this.sf.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.sf);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    private boolean ri(int i, String str, String str2) {
        if (i == 1) {
            if (!nr.ri(str)) {
                return false;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (!nr.ri(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !nr.ri(str2)) {
            return false;
        }
        return true;
    }

    private void ri(JSONObject jSONObject, View view) {
        if (ri(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            tan.ri(ri(view), this.xha instanceof Activity, jSONObject, this.mj, this.jbs, ig.ri(this.jbs), null, this.qt);
        }
    }

    private Context ri(View view) {
        Activity activityRi = view != null ? com.bytedance.sdk.component.utils.lr.ri(view) : null;
        return activityRi == null ? this.xha : activityRi;
    }
}
