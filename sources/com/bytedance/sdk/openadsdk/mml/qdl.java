package com.bytedance.sdk.openadsdk.mml;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.smartdigimkt.b0.a;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements com.bytedance.sdk.component.mo.qdl.mml.qdl.ud {
    private com.bytedance.sdk.openadsdk.mml.ud.qdl aaj;
    private String bch;
    private String bjy;
    private String exc;
    private JSONObject exu;
    private final AtomicBoolean fs;
    private String jl;
    private int jpc;
    private String jtx;
    private String jyq;
    private int ljh;
    private boolean lnr;
    private long mml;
    private final String mo;
    private long mzz;
    private String oth;
    public final String qdl;
    private String rdp;
    private int tvp;
    protected final JSONObject ud;
    private int wd;
    private String yt;
    private static final Set<String> to = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> rq = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.mml.qdl.1
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

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mml.qdl$qdl, reason: collision with other inner class name */
    public static final class C0145qdl {
        private String aaj;
        private com.bytedance.sdk.openadsdk.mml.ud.qdl bjy;
        private boolean exc;
        private String exu;
        private final int fs;
        private int jl;
        private String jpc;
        private final long jtx;
        private String lnr;
        private String mml;
        private String mo;
        private String mzz;
        public int qdl;
        private com.bytedance.sdk.openadsdk.mml.ud.ud rdp;
        private String rq;
        private JSONObject to;
        private String tvp;
        private String ud;
        private String wd;
        private int yt;

        public C0145qdl(long j, ljh ljhVar) {
            this.yt = -1;
            this.jl = -1;
            this.qdl = -1;
            if (ljhVar != null) {
                this.exc = vu.ud(ljhVar);
                this.yt = ljhVar.tid();
                this.jl = ljhVar.taz();
                this.qdl = ljhVar.vxg();
            }
            this.jtx = j;
            this.fs = com.bytedance.sdk.component.utils.jl.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl());
        }

        public C0145qdl jpc(String str) {
            this.aaj = str;
            return this;
        }

        public C0145qdl lnr(String str) {
            this.mml = str;
            return this;
        }

        public C0145qdl mml(String str) {
            this.mzz = str;
            return this;
        }

        public C0145qdl mo(String str) {
            this.tvp = str;
            return this;
        }

        public C0145qdl mzz(String str) {
            this.jpc = str;
            return this;
        }

        public C0145qdl ud(String str) {
            this.lnr = str;
            return this;
        }

        public C0145qdl wd(String str) {
            this.wd = str;
            return this;
        }

        public C0145qdl qdl(String str) {
            this.exu = str;
            return this;
        }

        public C0145qdl qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.to = jSONObject;
            return this;
        }

        public void qdl(com.bytedance.sdk.openadsdk.mml.ud.qdl qdlVar) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl(this.mml, this.aaj, this.wd, this.lnr);
            this.bjy = qdlVar;
            final qdl qdlVar2 = new qdl(this);
            try {
                com.bytedance.sdk.openadsdk.mml.ud.ud udVar = this.rdp;
                if (udVar != null) {
                    udVar.qdl(qdlVar2.ud, this.jtx);
                } else {
                    new com.bytedance.sdk.openadsdk.mml.ud.lnr().qdl(qdlVar2.ud, this.jtx);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                fco.lnr(new com.bytedance.sdk.component.jpc.jpc("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.mml.qdl.qdl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(qdlVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(qdlVar2);
            }
        }
    }

    public qdl(String str, JSONObject jSONObject) {
        this.mo = "adiff";
        this.fs = new AtomicBoolean(false);
        this.exu = new JSONObject();
        this.qdl = str;
        this.ud = jSONObject;
    }

    private void mo() {
        JSONObject jSONObject = this.exu;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.exu.optString("category");
            String strOptString3 = this.exu.optString("log_extra");
            if (qdl(this.yt, this.jtx, this.oth)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !ud(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, "0")) && (TextUtils.isEmpty(this.yt) || TextUtils.equals(this.yt, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.jtx) || !ud(this.jtx)) && (TextUtils.isEmpty(strOptString2) || !ud(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.oth) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!qdl(this.yt, this.jtx, this.oth)) {
            return;
        }
        this.mml = com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl.incrementAndGet();
    }

    private boolean qdl(String str, String str2, String str3) {
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

    private boolean ud(String str) {
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

    private void wd() throws JSONException {
        this.ud.putOpt("app_log_url", this.bch);
        this.ud.putOpt("tag", this.rdp);
        this.ud.putOpt("label", this.bjy);
        this.ud.putOpt("category", this.jtx);
        if (!TextUtils.isEmpty(this.yt)) {
            try {
                this.ud.putOpt("value", Long.valueOf(Long.parseLong(this.yt)));
            } catch (NumberFormatException unused) {
                this.ud.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.exc)) {
            try {
                this.ud.putOpt("ext_value", Long.valueOf(Long.parseLong(this.exc)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.oth)) {
            this.ud.putOpt("log_extra", this.oth);
        }
        if (!TextUtils.isEmpty(this.jyq)) {
            try {
                this.ud.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.jyq)));
            } catch (NumberFormatException unused3) {
            }
        }
        qdl(this.ud, this.bjy);
        try {
            this.ud.putOpt(a.W, Integer.valueOf(this.ljh));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.exu.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.ud.putOpt(next, this.exu.opt(next));
        }
    }

    public JSONObject lnr() {
        if (this.fs.get()) {
            return this.ud;
        }
        try {
            wd();
            if (this.ud.has("ad_extra_data")) {
                Object objOpt = this.ud.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            this.ud.put("ad_extra_data", qdl((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.ud.put("ad_extra_data", qdl(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e2) {
                        aaj.lnr("AdEvent", "json error", e2.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.qdl);
                    if (this.lnr) {
                        jSONObject.put("interaction_method", this.wd);
                        jSONObject.put("real_interaction_method", this.jpc);
                        jSONObject.put("image_mode", this.tvp);
                    }
                    this.ud.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e3) {
                    aaj.lnr("AdEvent", "json error", e3.getMessage());
                }
            }
            this.fs.set(true);
        } catch (Throwable unused) {
        }
        return this.ud;
    }

    public String mml() {
        return this.qdl;
    }

    public boolean mzz() {
        Set<String> setRdp;
        if (this.ud == null || (setRdp = com.bytedance.sdk.openadsdk.core.yt.mml().rdp()) == null) {
            return false;
        }
        String strOptString = this.ud.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setRdp.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.bjy)) {
            return false;
        }
        return setRdp.contains(this.bjy);
    }

    private void ud(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : rq.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(rq.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject qdl(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.qdl);
            }
            if (this.lnr) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.wd);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.jpc);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.tvp);
                }
            }
            if (com.bytedance.sdk.openadsdk.jyq.qdl.qdl("replace_log_extra_key", false)) {
                ud(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.qdl + TokenBuilder.TOKEN_DELIMITER + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            aaj.lnr("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public qdl(C0145qdl c0145qdl) {
        this.mo = "adiff";
        this.fs = new AtomicBoolean(false);
        this.exu = new JSONObject();
        if (!TextUtils.isEmpty(c0145qdl.ud)) {
            this.qdl = c0145qdl.ud;
        } else {
            this.qdl = uw.qdl();
        }
        this.aaj = c0145qdl.bjy;
        this.oth = c0145qdl.mo;
        this.rdp = c0145qdl.lnr;
        this.bjy = c0145qdl.mml;
        if (!TextUtils.isEmpty(c0145qdl.mzz)) {
            this.jtx = c0145qdl.mzz;
        } else {
            this.jtx = "app_union";
        }
        this.jyq = c0145qdl.rq;
        this.yt = c0145qdl.jpc;
        this.exc = c0145qdl.tvp;
        this.jl = c0145qdl.wd;
        this.ljh = c0145qdl.fs;
        this.bch = c0145qdl.exu;
        this.exu = c0145qdl.to = c0145qdl.to != null ? c0145qdl.to : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.ud = jSONObject;
        if (!TextUtils.isEmpty(c0145qdl.exu)) {
            try {
                jSONObject.put("app_log_url", c0145qdl.exu);
            } catch (JSONException e2) {
                aaj.lnr("AdEvent", e2.getMessage());
            }
        }
        this.wd = c0145qdl.yt;
        this.jpc = c0145qdl.jl;
        this.tvp = c0145qdl.qdl;
        this.lnr = c0145qdl.exc;
        this.mzz = System.currentTimeMillis();
        mo();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl.ud
    public long ud() {
        return this.mml;
    }

    public JSONObject qdl(boolean z2) {
        JSONObject jSONObjectLnr = lnr();
        try {
            if (z2) {
                JSONObject jSONObject = new JSONObject(jSONObjectLnr.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                    return jSONObject;
                }
                jSONObjectOptJSONObject.remove("app_log_url");
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectLnr.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e2) {
            aaj.lnr("AdEvent", e2.getMessage());
            return jSONObjectLnr;
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl.ud
    public JSONObject qdl(String str) {
        return lnr();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mml.qdl.ud
    public long qdl() {
        return this.mzz;
    }

    private static void qdl(JSONObject jSONObject, String str) {
        try {
            Set<String> set = to;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            aaj.lnr("AdEvent", th);
        }
    }
}
