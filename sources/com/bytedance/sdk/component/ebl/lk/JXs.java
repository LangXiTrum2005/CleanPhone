package com.bytedance.sdk.component.ebl.lk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    private static final Object ZU = new Object();
    private int JXs;
    private ZU LD = new ZU();
    private Context Lxb;
    private boolean lk;

    public JXs(Context context, boolean z, int i) {
        this.Lxb = context;
        this.lk = z;
        this.JXs = i;
    }

    public void LD() {
        try {
            String strLxb = com.bytedance.sdk.component.ebl.ZU.ZU.Lxb(this.Lxb, 1, this.JXs);
            if (TextUtils.isEmpty(strLxb)) {
                return;
            }
            ZU zuLD = LD(new JSONObject(strLxb));
            if (zuLD != null) {
                zuLD.toString();
            }
            if (zuLD != null) {
                this.LD = zuLD;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[EXC_TOP_SPLITTER, FINALLY_INSNS, SYNTHETIC] */
    public void Lxb(JSONObject jSONObject) {
        Object obj;
        JSONObject jSONObject2;
        if (this.lk) {
            OY.Lxb().Lxb(this.JXs).JXs();
            try {
                try {
                    boolean z = jSONObject.optInt("ttnet_url_dispatcher_enabled", 0) > 0;
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ttnet_dispatch_actions");
                    if (OY.Lxb().Lxb(this.JXs).lk() && z && jSONArrayOptJSONArray != null) {
                        ArrayList<JSONObject> arrayList = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            JSONObject jSONObject3 = ((JSONObject) jSONArrayOptJSONArray.get(i)).getJSONObject("param");
                            if (jSONObject3.optString("service_name", "").equals("idc_selection")) {
                                arrayList.add(jSONObject3.getJSONObject("strategy_info"));
                            }
                        }
                        if (arrayList.isEmpty()) {
                            jSONObject2 = null;
                        } else {
                            jSONObject2 = new JSONObject();
                            for (JSONObject jSONObject4 : arrayList) {
                                Iterator<String> itKeys = jSONObject4.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject2.put(next, jSONObject4.getString(next));
                                }
                            }
                        }
                    } else {
                        jSONObject2 = null;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tnc_config");
                    if (jSONObjectOptJSONObject != null || jSONObject2 != null) {
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                            jSONObjectOptJSONObject.put("host_replace_map", jSONObject2);
                        } else if (jSONObject2 != null) {
                            jSONObjectOptJSONObject.put("host_replace_map", jSONObject2);
                        }
                    }
                    ZU zuLD = LD(jSONObjectOptJSONObject);
                    if (zuLD != null) {
                        zuLD.toString();
                    }
                    if (zuLD == null) {
                        synchronized (ZU) {
                            this.Lxb.getSharedPreferences(OY.Lxb().Lxb(this.JXs).Lxb(), 0).edit().putString("tnc_config_str", "").apply();
                            com.bytedance.sdk.component.ebl.ZU.ZU.Lxb(this.Lxb, 1, "", this.JXs);
                        }
                        return;
                    } else {
                        this.LD = zuLD;
                        String string = jSONObjectOptJSONObject.toString();
                        synchronized (ZU) {
                            this.Lxb.getSharedPreferences(OY.Lxb().Lxb(this.JXs).Lxb(), 0).edit().putString("tnc_config_str", string).apply();
                            com.bytedance.sdk.component.ebl.ZU.ZU.Lxb(this.Lxb, 1, string, this.JXs);
                        }
                        return;
                    }
                } finally {
                    synchronized (ZU) {
                        this.Lxb.getSharedPreferences(OY.Lxb().Lxb(this.JXs).Lxb(), 0).edit().putString("tnc_config_str", "").apply();
                        com.bytedance.sdk.component.ebl.ZU.ZU.Lxb(this.Lxb, 1, "", this.JXs);
                    }
                }
            } catch (Throwable unused) {
                this.LD = new ZU();
                synchronized (obj) {
                    return;
                }
            }
            synchronized (ZU) {
                this.Lxb.getSharedPreferences(OY.Lxb().Lxb(this.JXs).Lxb(), 0).edit().putString("tnc_config_str", "").apply();
                com.bytedance.sdk.component.ebl.ZU.ZU.Lxb(this.Lxb, 1, "", this.JXs);
            }
        }
    }

    public ZU lk() {
        return this.LD;
    }

    private ZU LD(JSONObject jSONObject) {
        try {
            ZU zu = new ZU();
            if (jSONObject.has("local_enable")) {
                zu.Lxb = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                zu.LD = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap map = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(string, 0);
                        }
                    }
                }
                zu.lk = map;
            } else {
                zu.lk = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap map2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            map2.put(next, string2);
                        }
                    }
                }
                zu.ZU = map2;
            } else {
                zu.ZU = null;
            }
            zu.JXs = jSONObject.optInt("req_to_cnt", zu.JXs);
            zu.lc = jSONObject.optInt("req_to_api_cnt", zu.lc);
            zu.ebl = jSONObject.optInt("req_to_ip_cnt", zu.ebl);
            zu.OY = jSONObject.optInt("req_err_cnt", zu.OY);
            zu.QAg = jSONObject.optInt("req_err_api_cnt", zu.QAg);
            zu.nBu = jSONObject.optInt("req_err_ip_cnt", zu.nBu);
            zu.JVA = jSONObject.optInt("update_interval", zu.JVA);
            zu.sLN = jSONObject.optInt("update_random_range", zu.sLN);
            zu.NXR = jSONObject.optString("http_code_black", zu.NXR);
            return zu;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void Lxb() {
        if (this.lk) {
            String string = this.Lxb.getSharedPreferences(OY.Lxb().Lxb(this.JXs).Lxb(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                ZU zuLD = LD(new JSONObject(string));
                if (zuLD != null) {
                    this.LD = zuLD;
                }
                if (zuLD == null) {
                    return;
                }
                zuLD.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
