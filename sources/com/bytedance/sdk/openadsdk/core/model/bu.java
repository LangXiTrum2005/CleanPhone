package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bu {
    private ri lr;
    private ri ri;

    public bu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.ri = new ri(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.lr = new ri(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static ri ik(wjv wjvVar) {
        bu buVarVk;
        if (wjvVar == null || (buVarVk = wjvVar.vk()) == null) {
            return null;
        }
        return buVarVk.ri;
    }

    public static ri lr(wjv wjvVar) {
        bu buVarVk;
        if (wjvVar == null || (buVarVk = wjvVar.vk()) == null) {
            return null;
        }
        return buVarVk.lr;
    }

    public static boolean ri(wjv wjvVar) {
        return ri(wjvVar, false);
    }

    public static class ri {
        C0256ri lr;
        C0256ri ri;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.bu$ri$ri, reason: collision with other inner class name */
        public static class C0256ri {
            String ri;

            public C0256ri(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.ri = jSONObject.optString("entry");
            }

            public boolean ri() {
                return !TextUtils.isEmpty(this.ri);
            }
        }

        public ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.ri = new C0256ri(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.lr = new C0256ri(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean ri() {
            C0256ri c0256ri = this.lr;
            if (c0256ri != null && c0256ri.ri()) {
                return true;
            }
            C0256ri c0256ri2 = this.ri;
            return c0256ri2 != null && c0256ri2.ri();
        }

        public String ri(boolean z) {
            if (z) {
                C0256ri c0256ri = this.ri;
                if (c0256ri != null) {
                    return c0256ri.ri;
                }
                return "";
            }
            C0256ri c0256ri2 = this.lr;
            if (c0256ri2 != null) {
                return c0256ri2.ri;
            }
            return "";
        }
    }

    public static boolean ri(wjv wjvVar, boolean z) {
        bu buVarVk;
        if (wjvVar == null || (buVarVk = wjvVar.vk()) == null) {
            return false;
        }
        if (z) {
            ri riVar = buVarVk.lr;
            return riVar != null && riVar.ri();
        }
        ri riVar2 = buVarVk.ri;
        return riVar2 != null && riVar2.ri();
    }
}
