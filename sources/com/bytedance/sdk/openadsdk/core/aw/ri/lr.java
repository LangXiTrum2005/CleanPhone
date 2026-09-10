package com.bytedance.sdk.openadsdk.core.aw.ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.aw.lr.ik;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lr {
    public ri di;
    public int fi;
    protected int ik;
    protected double ka;
    protected final Context lr;
    public int ri;

    public static class ri {
        public boolean ik;
        public int lr;
        public int ri;
    }

    public lr(Context context, int i, int i2) {
        this.ik = 0;
        this.ka = 0.0d;
        if (i2 > 0 && i > 0) {
            this.ka = ((double) i) / ((double) i2);
        }
        float fMj = qd.mj(context);
        if (fMj != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i > 0) {
            this.ik = (int) (i / fMj);
        }
        this.lr = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.aw.ri ri(String str, File file, List<ik> list);

    public void ri(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            ka.ri().ri("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public String ri(String str, List<ik> list) {
        int i = this.ri;
        String strKa = null;
        if (i >= 5) {
            return null;
        }
        this.ri = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
            lrVarIk.ik(str);
            com.bytedance.sdk.component.xha.lr lrVarRi = lrVarIk.ri();
            strKa = lrVarRi.ka();
            lrVarRi.ri();
            return strKa;
        } catch (Exception e) {
            ri(e, 0);
            if (!list.isEmpty()) {
                ik.lr((wjv) null, list, com.bytedance.sdk.openadsdk.core.aw.ri.ri.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strKa;
        }
    }
}
