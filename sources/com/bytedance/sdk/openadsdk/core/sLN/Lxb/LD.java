package com.bytedance.sdk.openadsdk.core.sLN.Lxb;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.sLN.LD.lk;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LD {
    public int JXs;
    protected final Context LD;
    public int Lxb;
    protected double ZU;
    public Lxb lc;
    protected int lk;

    public static class Lxb {
        public int LD;
        public int Lxb;
        public boolean lk;
    }

    public LD(Context context, int i, int i2) {
        this.lk = 0;
        this.ZU = 0.0d;
        if (i2 > 0 && i > 0) {
            this.ZU = ((double) i) / ((double) i2);
        }
        float fJXs = le.JXs(context);
        if (fJXs != 0.0f && i > 0) {
            this.lk = (int) (i / fJXs);
        }
        this.LD = context.getApplicationContext();
    }

    public String LD(String str, List<lk> list) {
        String strZU;
        int i = this.Lxb;
        if (i >= 5) {
            return null;
        }
        this.Lxb = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
            ldLk.LD(str);
            com.bytedance.sdk.component.ebl.LD ldLxb = ldLk.Lxb();
            strZU = ldLxb.ZU();
            try {
                ldLxb.Lxb();
            } catch (Exception e) {
                e = e;
                Lxb(e, 0);
                if (!list.isEmpty()) {
                    lk.LD(list, com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.WRAPPER_TIMEOUT, -1L, null);
                }
            }
        } catch (Exception e2) {
            e = e2;
            strZU = null;
        }
        return strZU;
    }

    public abstract com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb(String str, List<lk> list);

    public void Lxb(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean Lxb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }
}
