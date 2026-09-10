package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.smartdigimkt.b0.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class yt {
    private qdl qdl;
    private qdl ud;

    public yt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.qdl = new qdl(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.ud = new qdl(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static qdl lnr(ljh ljhVar) {
        yt ytVarXv;
        if (ljhVar == null || (ytVarXv = ljhVar.xv()) == null) {
            return null;
        }
        return ytVarXv.qdl;
    }

    public static boolean qdl(ljh ljhVar) {
        return qdl(ljhVar, false);
    }

    public static qdl ud(ljh ljhVar) {
        yt ytVarXv;
        if (ljhVar == null || (ytVarXv = ljhVar.xv()) == null) {
            return null;
        }
        return ytVarXv.ud;
    }

    public static class qdl {
        C0120qdl qdl;
        C0120qdl ud;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.yt$qdl$qdl, reason: collision with other inner class name */
        public static class C0120qdl {
            String qdl;

            public C0120qdl(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.qdl = jSONObject.optString(a.n0);
            }

            public boolean qdl() {
                return !TextUtils.isEmpty(this.qdl);
            }
        }

        public qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.qdl = new C0120qdl(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.ud = new C0120qdl(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean qdl() {
            C0120qdl c0120qdl = this.ud;
            if (c0120qdl != null && c0120qdl.qdl()) {
                return true;
            }
            C0120qdl c0120qdl2 = this.qdl;
            return c0120qdl2 != null && c0120qdl2.qdl();
        }

        public String qdl(boolean z2) {
            if (z2) {
                C0120qdl c0120qdl = this.qdl;
                if (c0120qdl != null) {
                    return c0120qdl.qdl;
                }
                return "";
            }
            C0120qdl c0120qdl2 = this.ud;
            if (c0120qdl2 != null) {
                return c0120qdl2.qdl;
            }
            return "";
        }
    }

    public static boolean qdl(ljh ljhVar, boolean z2) {
        yt ytVarXv;
        if (ljhVar == null || (ytVarXv = ljhVar.xv()) == null) {
            return false;
        }
        if (z2) {
            qdl qdlVar = ytVarXv.ud;
            return qdlVar != null && qdlVar.qdl();
        }
        qdl qdlVar2 = ytVarXv.qdl;
        return qdlVar2 != null && qdlVar2.qdl();
    }
}
