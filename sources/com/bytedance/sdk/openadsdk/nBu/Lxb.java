package com.bytedance.sdk.openadsdk.nBu;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl;
import com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements lk {
    private final LD LD;
    private final tD Lxb;
    private final Map<String, lc> lk = new HashMap();

    private Lxb(LD ld, tD tDVar) {
        this.LD = ld;
        this.Lxb = tDVar;
    }

    public static Lxb Lxb(LD ld, tD tDVar) {
        return new Lxb(ld, tDVar);
    }

    @Override // com.bytedance.sdk.openadsdk.nBu.lk
    public void Lxb() {
        this.lk.clear();
    }

    private tD Lxb(JSONObject jSONObject, String str) {
        String strLxb;
        if (jSONObject == null) {
            return null;
        }
        tD tDVarLk = tD.lk();
        tDVarLk.ZU(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            tDVarLk.DY(str);
        }
        if (this.Lxb == null) {
            return tDVarLk;
        }
        String strLxb2 = tDVarLk.MGT() != null ? tDVarLk.MGT().Lxb() : null;
        if (TextUtils.isEmpty(strLxb2)) {
            return this.Lxb;
        }
        com.bytedance.sdk.openadsdk.core.model.lk lkVarMGT = this.Lxb.MGT();
        if (lkVarMGT != null && strLxb2.equals(lkVarMGT.Lxb())) {
            return this.Lxb;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (lkVarMGT != null) {
            try {
                strLxb = lkVarMGT.Lxb();
            } catch (JSONException unused) {
            }
        } else {
            strLxb = "null";
        }
        jSONObject2.put("lu", strLxb);
        jSONObject2.put("ju", strLxb2);
        tD tDVar = this.Lxb;
        com.bytedance.sdk.openadsdk.core.ZU.Lxb(tDVar, nJ.Lxb(tDVar), -5, jSONObject2);
        if (lkVarMGT != null && strLxb2.contains("play.google.com/store") && !strLxb2.contains("referrer")) {
            tDVarLk.MGT().Lxb(lkVarMGT.Lxb());
        }
        return tDVarLk;
    }

    @Override // com.bytedance.sdk.openadsdk.nBu.lk
    public void Lxb(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        Lxb(context, Lxb(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i, z);
    }

    private void Lxb(Context context, tD tDVar, JSONObject jSONObject, int i, boolean z) {
        if (context == null || tDVar == null || tDVar.MGT() == null || jSONObject == null || this.LD == null || this.lk.get(tDVar.MGT().Lxb()) != null) {
            return;
        }
        String strLD = nJ.LD(i);
        if (TextUtils.isEmpty(strLD)) {
            return;
        }
        this.lk.put(tDVar.MGT().Lxb(), Lxb(context, tDVar, jSONObject, strLD, z));
    }

    @Override // com.bytedance.sdk.openadsdk.nBu.lk
    public void Lxb(Context context, JSONObject jSONObject, String str) {
        tD tDVar;
        if (context == null || (tDVar = this.Lxb) == null) {
            return;
        }
        ebl.Lxb(context, tDVar, str).ZU();
    }

    @Override // com.bytedance.sdk.openadsdk.nBu.lk
    public void Lxb(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        Lxb(Lxb(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void Lxb(tD tDVar, JSONObject jSONObject) {
        if (this.LD == null || tDVar == null || tDVar.MGT() == null) {
            return;
        }
        String strLxb = tDVar.MGT().Lxb();
        if (this.lk.containsKey(strLxb)) {
            this.lk.remove(strLxb);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.LD.Lxb("app_ad_event", jSONObject2);
            } catch (JSONException e) {
                sLN.Lxb("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    private lc Lxb(@NonNull Context context, @NonNull tD tDVar, @NonNull JSONObject jSONObject, @NonNull String str, boolean z) {
        lc lcVarLxb = ebl.Lxb(context, tDVar, str);
        lcVarLxb.Lxb(true);
        return lcVarLxb;
    }
}
