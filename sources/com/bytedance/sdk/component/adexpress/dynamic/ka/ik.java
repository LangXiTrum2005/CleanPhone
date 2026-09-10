package com.bytedance.sdk.component.adexpress.dynamic.ka;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private JSONObject lr;
    private HashMap<String, Object> ri = new HashMap<>();

    public ik(JSONObject jSONObject) {
        this.lr = jSONObject;
    }

    public boolean lr(String str) {
        return this.ri.containsKey(str);
    }

    public Object ri(String str) {
        if (this.ri.containsKey(str)) {
            return this.ri.get(str);
        }
        return null;
    }

    public void ri() {
        Iterator<String> itKeys = this.lr.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.lr.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.ri.put(next + "." + i + "." + next2, objOpt2);
                                }
                            }
                            i++;
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
                                for (int i2 = 0; i2 < ((JSONArray) objOpt3).length(); i2++) {
                                    this.ri.put(next + "." + next3 + "." + i2, ((JSONArray) objOpt3).opt(i2));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.ri.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                ri(next, next3, objOpt3);
                            } else {
                                this.ri.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.ri.put(next + "." + next5, objOpt5);
                }
            } else {
                this.ri.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.ri.put(next, objOpt);
                }
            }
        }
    }

    private void ri(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.ri.put(str + "." + str2 + "." + next + "." + i + "." + next2, objOpt2);
                        }
                        i++;
                    }
                }
            } else {
                this.ri.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
