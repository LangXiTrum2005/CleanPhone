package com.bytedance.sdk.openadsdk.core.fs.qdl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.smartdigimkt.x.g;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ud {
    protected int lnr;
    protected double mml;
    public qdl mo;
    public int mzz;
    public int qdl;
    protected final Context ud;

    public static class qdl {
        public boolean lnr;
        public int qdl;
        public int ud;
    }

    public ud(Context context, int i2, int i3) {
        this.lnr = 0;
        this.mml = 0.0d;
        if (i3 > 0 && i2 > 0) {
            this.mml = ((double) i2) / ((double) i3);
        }
        float fJpc = ax.jpc(context);
        if (fJpc != 0.0f && i2 > 0) {
            this.lnr = (int) (i2 / fJpc);
        }
        this.ud = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.fs.qdl qdl(String str, File file, List<lnr> list);

    public void qdl(Exception exc, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(g.f39715A, exc.getMessage());
            jSONObject.put("error_code", i2);
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public String qdl(String str, List<lnr> list) {
        int i2 = this.qdl;
        String strMml = null;
        if (i2 >= 5) {
            return null;
        }
        this.qdl = i2 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
            udVarLnr.ud(str);
            com.bytedance.sdk.component.wd.ud udVarQdl = udVarLnr.qdl();
            strMml = udVarQdl.mml();
            udVarQdl.qdl();
            return strMml;
        } catch (Exception e2) {
            qdl(e2, 0);
            if (!list.isEmpty()) {
                lnr.ud((ljh) null, list, com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strMml;
        }
    }
}
