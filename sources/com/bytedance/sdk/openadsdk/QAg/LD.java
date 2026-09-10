package com.bytedance.sdk.openadsdk.QAg;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.JXs.VVE;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD<T> implements VVE<T> {
    private final String LD;
    private final long Lxb = SystemClock.elapsedRealtime();
    private final tD ZU;
    private final VVE<T> lk;

    public LD(tD tDVar, String str, VVE<T> vve) {
        this.lk = vve;
        this.ZU = tDVar;
        this.LD = str;
    }

    @Override // com.bytedance.sdk.component.JXs.VVE
    public void Lxb(JVA<T> jva) {
        VVE<T> vve = this.lk;
        if (vve != null) {
            vve.Lxb(jva);
        }
        if (this.ZU != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.Lxb;
            final int iEbl = jva.ebl() / 1024;
            final int i = jva.lc() ? 1 : 0;
            com.bytedance.sdk.openadsdk.STP.lk.Lxb("load_image_success", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.QAg.LD.1
                @Override // com.bytedance.sdk.openadsdk.STP.LD
                @Nullable
                public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", LD.this.LD);
                    jSONObject.put("preload_size", iEbl);
                    jSONObject.put("local_cache", i);
                    jSONObject.put("image_mode", LD.this.ZU.FGm());
                    return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("load_image_success").Lxb(LD.this.ZU.op()).LD(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.JXs.VVE
    public void Lxb(final int i, final String str, @Nullable Throwable th) {
        VVE<T> vve = this.lk;
        if (vve != null) {
            vve.Lxb(i, str, th);
        }
        tD tDVar = this.ZU;
        if (tDVar == null || TextUtils.isEmpty(nJ.Lxb(tDVar))) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.Lxb;
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("load_image_error", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.QAg.LD.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", jElapsedRealtime);
                jSONObject.put("url", LD.this.LD);
                jSONObject.put("error_code", i);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", LD.this.ZU.FGm());
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("load_image_error").Lxb(LD.this.ZU.op()).LD(jSONObject.toString());
            }
        });
    }
}
