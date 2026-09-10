package com.bytedance.sdk.openadsdk.ka;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.su;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements com.bytedance.sdk.component.di.ri.ka.ri.lr {
    private static final Set<String> qt = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> sf = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.ka.ri.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(IronSourceConstants.EVENTS_ERROR_CODE, "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };
    private com.bytedance.sdk.openadsdk.ka.lr.ri ac;
    private JSONObject aw;
    private String ay;
    private String bgr;
    private String bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final AtomicBoolean f18157co;
    private final String di;
    private long fi;
    private List<String> fr;
    private String ihz;
    private boolean ik;
    private int jbs;
    private long ka;
    protected final JSONObject lr;
    private int mj;
    private String nr;
    public final String ri;
    private String slm;
    private String tan;
    private String uq;
    private String vr;
    private int wjv;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri$ri, reason: collision with other inner class name */
    public static final class C0266ri {
        private String ac;
        private String aw;
        private com.bytedance.sdk.openadsdk.ka.lr.lr bgr;
        private int bu;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private final int f18158co;
        private String di;
        private String fi;
        private List<String> ihz;
        private String ik;
        private String jbs;
        private String ka;
        private String lr;
        private String mj;
        private int nr;
        private JSONObject qt;
        public int ri;
        private String sf;
        private final long slm;
        private boolean tan;
        private com.bytedance.sdk.openadsdk.ka.lr.ri vr;
        private String xha;

        public C0266ri(long j, wjv wjvVar) {
            this.bu = -1;
            this.nr = -1;
            this.ri = -1;
            if (wjvVar != null) {
                this.tan = dw.lr(wjvVar);
                this.bu = wjvVar.zb();
                this.nr = wjvVar.nd();
                this.ri = wjvVar.vz();
            }
            this.slm = j;
            this.f18158co = com.bytedance.sdk.component.utils.nr.ik(com.bytedance.sdk.openadsdk.core.nr.ri());
        }

        public C0266ri di(String str) {
            this.jbs = str;
            return this;
        }

        public C0266ri fi(String str) {
            this.mj = str;
            return this;
        }

        public C0266ri ik(String str) {
            this.ka = str;
            return this;
        }

        public C0266ri ka(String str) {
            this.fi = str;
            return this;
        }

        public C0266ri lr(String str) {
            this.ik = str;
            return this;
        }

        public C0266ri mj(String str) {
            this.ac = str;
            return this;
        }

        public C0266ri xha(String str) {
            this.xha = str;
            return this;
        }

        public C0266ri ri(String str) {
            this.aw = str;
            return this;
        }

        public C0266ri ri(List<String> list) {
            this.ihz = list;
            return this;
        }

        public C0266ri ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.qt = jSONObject;
            return this;
        }

        public void ri(com.bytedance.sdk.openadsdk.ka.lr.ri riVar) {
            com.bytedance.sdk.openadsdk.di.lr.ri().ri(this.ka, this.ac, this.xha, this.ik);
            this.vr = riVar;
            ri riVar2 = new ri(this);
            try {
                com.bytedance.sdk.openadsdk.ka.lr.lr lrVar = this.bgr;
                if (lrVar != null) {
                    lrVar.ri(riVar2.lr, this.slm);
                } else {
                    new com.bytedance.sdk.openadsdk.ka.lr.ik().ri(riVar2.lr, this.slm);
                }
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.ka.ri.lr.ri(riVar2);
        }
    }

    public ri(String str, JSONObject jSONObject) {
        this.di = "adiff";
        this.f18157co = new AtomicBoolean(false);
        this.aw = new JSONObject();
        this.ri = str;
        this.lr = jSONObject;
    }

    private boolean lr(String str) {
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

    private void mj() throws JSONException {
        this.lr.putOpt("app_log_url", this.ay);
        List<String> list = this.fr;
        if (list != null && !list.isEmpty()) {
            try {
                this.lr.putOpt("app_log_url_back", new JSONArray((Collection) this.fr));
            } catch (Throwable th) {
                ac.ik("AdEvent", th.getMessage());
            }
        }
        this.lr.putOpt("tag", this.bgr);
        this.lr.putOpt("label", this.vr);
        this.lr.putOpt("category", this.slm);
        if (!TextUtils.isEmpty(this.bu)) {
            try {
                this.lr.putOpt("value", Long.valueOf(Long.parseLong(this.bu)));
            } catch (NumberFormatException unused) {
                this.lr.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.tan)) {
            try {
                this.lr.putOpt("ext_value", Long.valueOf(Long.parseLong(this.tan)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.uq)) {
            this.lr.putOpt("log_extra", this.uq);
        }
        if (!TextUtils.isEmpty(this.ihz)) {
            try {
                this.lr.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.ihz)));
            } catch (NumberFormatException unused3) {
            }
        }
        ri(this.lr, this.vr);
        try {
            if (!this.lr.has("nt")) {
                this.lr.putOpt("nt", Integer.valueOf(this.wjv));
            }
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.aw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.lr.putOpt(next, this.aw.opt(next));
        }
    }

    private boolean ri(String str, String str2, String str3) {
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

    private void xha() {
        JSONObject jSONObject = this.aw;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.aw.optString("category");
            String strOptString3 = this.aw.optString("log_extra");
            if (ri(this.bu, this.slm, this.uq)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !lr(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.bu) || TextUtils.equals(this.bu, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.slm) || !lr(this.slm)) && (TextUtils.isEmpty(strOptString2) || !lr(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.uq) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!ri(this.bu, this.slm, this.uq)) {
            return;
        }
        this.ka = com.bytedance.sdk.openadsdk.ka.ri.lr.ri.incrementAndGet();
    }

    public boolean di() {
        Set<String> setAw;
        if (this.lr == null || (setAw = com.bytedance.sdk.openadsdk.core.nr.ka().aw()) == null) {
            return false;
        }
        String strOptString = this.lr.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setAw.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.vr)) {
            return false;
        }
        return setAw.contains(this.vr);
    }

    public String fi() {
        return this.ri;
    }

    public JSONObject ik() {
        if (this.f18157co.get()) {
            return this.lr;
        }
        try {
            mj();
            if (this.lr.has("ad_extra_data")) {
                Object objOpt = this.lr.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.lr.put("ad_extra_data", ri((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.lr.put("ad_extra_data", ri(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e) {
                        ac.ik("AdEvent", "json error", e.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.ri);
                    if (this.ik) {
                        jSONObject.put("interaction_method", this.xha);
                        jSONObject.put("real_interaction_method", this.mj);
                        jSONObject.put("image_mode", this.jbs);
                    }
                    this.lr.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e2) {
                    ac.ik("AdEvent", "json error", e2.getMessage());
                }
            }
            this.f18157co.set(true);
        } catch (Throwable unused) {
        }
        return this.lr;
    }

    public JSONObject ka() {
        JSONObject jSONObjectIk = ik();
        try {
            JSONObject jSONObject = new JSONObject(jSONObjectIk.toString());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject == null) {
                return jSONObject;
            }
            jSONObjectOptJSONObject.remove("app_log_url");
            jSONObjectOptJSONObject.remove("app_log_url_back");
            return jSONObject;
        } catch (JSONException e) {
            ac.ik("AdEvent", e.getMessage());
            return jSONObjectIk;
        }
    }

    private void lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : sf.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(sf.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject ri(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.ri);
            }
            if (this.ik) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.xha);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.mj);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.jbs);
                }
            }
            lr(jSONObject);
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.ri + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            ac.ik("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public ri(C0266ri c0266ri) {
        this.di = "adiff";
        this.f18157co = new AtomicBoolean(false);
        this.aw = new JSONObject();
        if (!TextUtils.isEmpty(c0266ri.lr)) {
            this.ri = c0266ri.lr;
        } else {
            this.ri = su.ri();
        }
        this.ac = c0266ri.vr;
        this.uq = c0266ri.di;
        this.bgr = c0266ri.ik;
        this.vr = c0266ri.ka;
        if (!TextUtils.isEmpty(c0266ri.fi)) {
            this.slm = c0266ri.fi;
        } else {
            this.slm = "app_union";
        }
        this.ihz = c0266ri.sf;
        this.bu = c0266ri.mj;
        this.tan = c0266ri.jbs;
        this.nr = c0266ri.xha;
        this.wjv = c0266ri.f18158co;
        this.ay = c0266ri.aw;
        this.aw = c0266ri.qt = c0266ri.qt != null ? c0266ri.qt : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.lr = jSONObject;
        if (!TextUtils.isEmpty(c0266ri.aw)) {
            try {
                jSONObject.put("app_log_url", c0266ri.aw);
            } catch (JSONException e) {
                ac.ik("AdEvent", e.getMessage());
            }
        }
        this.fr = c0266ri.ihz;
        if (c0266ri.ihz != null && !c0266ri.ihz.isEmpty()) {
            try {
                this.lr.putOpt("app_log_url_back", new JSONArray((Collection) c0266ri.ihz));
            } catch (Throwable th) {
                ac.ik("AdEvent", th.getMessage());
            }
        }
        this.xha = c0266ri.bu;
        this.mj = c0266ri.nr;
        this.jbs = c0266ri.ri;
        this.ik = c0266ri.tan;
        this.fi = System.currentTimeMillis();
        xha();
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri.lr
    public long lr() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri.lr
    public JSONObject ri(String str) {
        return ik();
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri.lr
    public long ri() {
        return this.fi;
    }

    private static void ri(JSONObject jSONObject, String str) {
        try {
            Set<String> set = qt;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            ac.ik("AdEvent", th);
        }
    }
}
