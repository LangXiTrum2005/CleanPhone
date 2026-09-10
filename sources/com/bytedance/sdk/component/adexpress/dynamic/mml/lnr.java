package com.bytedance.sdk.component.adexpress.dynamic.mml;

import android.text.TextUtils;
import com.smartdigimkt.x.d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private HashMap<String, Object> qdl = new HashMap<>();
    private JSONObject ud;

    public lnr(JSONObject jSONObject) {
        this.ud = jSONObject;
    }

    public Object qdl(String str) {
        if (this.qdl.containsKey(str)) {
            return this.qdl.get(str);
        }
        return null;
    }

    public boolean ud(String str) {
        return this.qdl.containsKey(str);
    }

    public void qdl() {
        Iterator<String> itKeys = this.ud.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.ud.opt(next);
            int i2 = 0;
            if (TextUtils.equals(d.c.k, next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i2 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.qdl.put(next + com.thinkup.core.common.n.mo.ono + i2 + com.thinkup.core.common.n.mo.ono + next2, objOpt2);
                                }
                            }
                            i2++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i3 = 0; i3 < ((JSONArray) objOpt3).length(); i3++) {
                                    this.qdl.put(next + com.thinkup.core.common.n.mo.ono + next3 + com.thinkup.core.common.n.mo.ono + i3, ((JSONArray) objOpt3).opt(i3));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.qdl.put(next + com.thinkup.core.common.n.mo.ono + next3 + com.thinkup.core.common.n.mo.ono + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                qdl(next, next3, objOpt3);
                            } else {
                                this.qdl.put(next + com.thinkup.core.common.n.mo.ono + next3, objOpt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(objOpt instanceof JSONObject)) {
                this.qdl.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.qdl.put(next, objOpt);
                }
            } else if (objOpt != null) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.qdl.put(next + com.thinkup.core.common.n.mo.ono + next5, objOpt5);
                }
            }
        }
    }

    private void qdl(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i2 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i2 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.qdl.put(str + com.thinkup.core.common.n.mo.ono + str2 + com.thinkup.core.common.n.mo.ono + next + com.thinkup.core.common.n.mo.ono + i2 + com.thinkup.core.common.n.mo.ono + next2, objOpt2);
                        }
                        i2++;
                    }
                }
            } else {
                this.qdl.put(str + com.thinkup.core.common.n.mo.ono + str2 + com.thinkup.core.common.n.mo.ono + next, objOpt);
            }
        }
    }
}
