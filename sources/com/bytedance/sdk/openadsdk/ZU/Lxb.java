package com.bytedance.sdk.openadsdk.ZU;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.LD {
    private com.bytedance.sdk.openadsdk.ZU.LD.Lxb DY;
    private String HD;
    private String IeN;
    private long JXs;
    protected final JSONObject LD;
    public final String Lxb;
    private JSONObject NXR;
    private int OY;
    private int QAg;
    private String STP;
    private String Sfi;
    private String VVE;
    private long ZU;
    private String aH;
    private String brP;
    private int eK;
    private int ebl;
    private String kqm;
    private final String lc;
    private boolean lk;
    private final AtomicBoolean sLN;
    private String tD;
    private static final Set<String> nBu = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> JVA = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ZU.Lxb$Lxb, reason: collision with other inner class name */
    public static final class C0079Lxb {
        private String DY;
        private com.bytedance.sdk.openadsdk.ZU.LD.Lxb IeN;
        private String JVA;
        private String JXs;
        private String LD;
        public int Lxb;
        private String NXR;
        private String OY;
        private String QAg;
        private com.bytedance.sdk.openadsdk.ZU.LD.LD STP;
        private final long VVE;
        private String ZU;
        private int brP;
        private String ebl;
        private int kqm;
        private String lc;
        private String lk;
        private JSONObject nBu;
        private final int sLN;
        private boolean tD;

        public C0079Lxb(long j, tD tDVar) {
            this.kqm = -1;
            this.brP = -1;
            this.Lxb = -1;
            if (tDVar != null) {
                this.tD = eK.LD(tDVar);
                this.kqm = tDVar.brP();
                this.brP = tDVar.kqm();
                this.Lxb = tDVar.FGm();
            }
            this.VVE = j;
            this.sLN = com.bytedance.sdk.component.utils.IeN.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
        }

        public C0079Lxb JXs(String str) {
            this.OY = str;
            return this;
        }

        public C0079Lxb LD(String str) {
            this.lk = str;
            return this;
        }

        public C0079Lxb OY(String str) {
            this.DY = str;
            return this;
        }

        public C0079Lxb ZU(String str) {
            this.JXs = str;
            return this;
        }

        public C0079Lxb ebl(String str) {
            this.ebl = str;
            return this;
        }

        public C0079Lxb lc(String str) {
            this.QAg = str;
            return this;
        }

        public C0079Lxb lk(String str) {
            this.ZU = str;
            return this;
        }

        public C0079Lxb Lxb(String str) {
            this.NXR = str;
            return this;
        }

        public C0079Lxb Lxb(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.nBu = jSONObject;
            return this;
        }

        public void Lxb(com.bytedance.sdk.openadsdk.ZU.LD.Lxb lxb) {
            com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb(this.ZU, this.DY, this.ebl, this.lk);
            this.IeN = lxb;
            final Lxb lxb2 = new Lxb(this);
            try {
                com.bytedance.sdk.openadsdk.ZU.LD.LD ld = this.STP;
                if (ld != null) {
                    ld.Lxb(lxb2.LD, this.VVE);
                } else {
                    new com.bytedance.sdk.openadsdk.ZU.LD.lk().Lxb(lxb2.LD, this.VVE);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                hg.lk(new com.bytedance.sdk.component.OY.OY("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.ZU.Lxb.Lxb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(lxb2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(lxb2);
            }
        }
    }

    public Lxb(String str, JSONObject jSONObject) {
        this.lc = "adiff";
        this.sLN = new AtomicBoolean(false);
        this.NXR = new JSONObject();
        this.Lxb = str;
        this.LD = jSONObject;
    }

    private boolean LD(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean Lxb(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private void ebl() throws JSONException {
        this.LD.putOpt("app_log_url", this.aH);
        this.LD.putOpt("tag", this.STP);
        this.LD.putOpt("label", this.IeN);
        this.LD.putOpt("category", this.VVE);
        if (!TextUtils.isEmpty(this.kqm)) {
            try {
                this.LD.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(Long.parseLong(this.kqm)));
            } catch (NumberFormatException unused) {
                this.LD.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.tD)) {
            try {
                this.LD.putOpt("ext_value", Long.valueOf(Long.parseLong(this.tD)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.HD)) {
            this.LD.putOpt("log_extra", this.HD);
        }
        if (!TextUtils.isEmpty(this.Sfi)) {
            try {
                this.LD.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.Sfi)));
            } catch (NumberFormatException unused3) {
            }
        }
        Lxb(this.LD, this.IeN);
        try {
            this.LD.putOpt("nt", Integer.valueOf(this.eK));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.NXR.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.LD.putOpt(next, this.NXR.opt(next));
        }
    }

    private void lc() {
        JSONObject jSONObject = this.NXR;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String strOptString2 = this.NXR.optString("category");
            String strOptString3 = this.NXR.optString("log_extra");
            if (Lxb(this.kqm, this.VVE, this.HD)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !LD(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.kqm) || TextUtils.equals(this.kqm, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.VVE) || !LD(this.VVE)) && (TextUtils.isEmpty(strOptString2) || !LD(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.HD) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!Lxb(this.kqm, this.VVE, this.HD)) {
            return;
        }
        this.ZU = com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb.incrementAndGet();
    }

    public boolean JXs() {
        Set<String> setNXR;
        if (this.LD == null || (setNXR = com.bytedance.sdk.openadsdk.core.kqm.ZU().NXR()) == null) {
            return false;
        }
        String strOptString = this.LD.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setNXR.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.IeN)) {
            return false;
        }
        return setNXR.contains(this.IeN);
    }

    public String ZU() {
        return this.Lxb;
    }

    public JSONObject lk() {
        if (this.sLN.get()) {
            return this.LD;
        }
        try {
            ebl();
            if (this.LD.has("ad_extra_data")) {
                Object objOpt = this.LD.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            com.bytedance.sdk.component.utils.sLN.Lxb("AdEvent", "ad_extra_data is JSONObject");
                            this.LD.put("ad_extra_data", Lxb((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.LD.put("ad_extra_data", Lxb(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("AdEvent", "json error", e.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.Lxb);
                    if (this.lk) {
                        jSONObject.put("interaction_method", this.ebl);
                        jSONObject.put("real_interaction_method", this.OY);
                        jSONObject.put("image_mode", this.QAg);
                    }
                    this.LD.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("AdEvent", "json error", e2.getMessage());
                }
            }
            this.sLN.set(true);
        } catch (Throwable unused) {
        }
        return this.LD;
    }

    private void LD(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : JVA.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(JVA.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject Lxb(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.Lxb);
            }
            if (this.lk) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.ebl);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.OY);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.QAg);
                }
            }
            if (com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("replace_log_extra_key", false)) {
                LD(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.Lxb + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public Lxb(C0079Lxb c0079Lxb) {
        this.lc = "adiff";
        this.sLN = new AtomicBoolean(false);
        this.NXR = new JSONObject();
        if (!TextUtils.isEmpty(c0079Lxb.LD)) {
            this.Lxb = c0079Lxb.LD;
        } else {
            this.Lxb = com.bytedance.sdk.openadsdk.utils.eK.Lxb();
        }
        this.DY = c0079Lxb.IeN;
        this.HD = c0079Lxb.lc;
        this.STP = c0079Lxb.lk;
        this.IeN = c0079Lxb.ZU;
        if (!TextUtils.isEmpty(c0079Lxb.JXs)) {
            this.VVE = c0079Lxb.JXs;
        } else {
            this.VVE = "app_union";
        }
        this.Sfi = c0079Lxb.JVA;
        this.kqm = c0079Lxb.OY;
        this.tD = c0079Lxb.QAg;
        this.brP = c0079Lxb.ebl;
        this.eK = c0079Lxb.sLN;
        this.aH = c0079Lxb.NXR;
        this.NXR = c0079Lxb.nBu = c0079Lxb.nBu != null ? c0079Lxb.nBu : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.LD = jSONObject;
        if (!TextUtils.isEmpty(c0079Lxb.NXR)) {
            try {
                jSONObject.put("app_log_url", c0079Lxb.NXR);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("AdEvent", e.getMessage());
            }
        }
        this.ebl = c0079Lxb.kqm;
        this.OY = c0079Lxb.brP;
        this.QAg = c0079Lxb.Lxb;
        this.lk = c0079Lxb.tD;
        this.JXs = System.currentTimeMillis();
        lc();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.LD
    public long LD() {
        return this.ZU;
    }

    public JSONObject Lxb(boolean z) {
        JSONObject jSONObjectLk = lk();
        try {
            if (z) {
                JSONObject jSONObject = new JSONObject(jSONObjectLk.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectLk.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AdEvent", e.getMessage());
            return jSONObjectLk;
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.LD
    public JSONObject Lxb(String str) {
        return lk();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.ZU.Lxb.LD
    public long Lxb() {
        return this.JXs;
    }

    private static void Lxb(JSONObject jSONObject, String str) {
        try {
            Set<String> set = nBu;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("AdEvent", th);
        }
    }
}
