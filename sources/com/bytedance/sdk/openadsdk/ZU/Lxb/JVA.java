package com.bytedance.sdk.openadsdk.ZU.Lxb;

import android.content.Context;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA implements com.bytedance.sdk.component.lc.Lxb.JXs {
    private final String Lxb = "[6504]";

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public long IeN() {
        long jLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("log_queue_timeout", 40000);
        if (jLxb < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS || jLxb > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jLxb;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public com.bytedance.sdk.component.lc.Lxb.lc JVA() {
        com.bytedance.sdk.component.lc.Lxb.lc lcVarLxb;
        synchronized (this) {
            lcVarLxb = com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(kqm.Lxb());
        }
        return lcVarLxb;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public Executor JXs() {
        return hg.ebl();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public boolean LD() {
        return false;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public com.bytedance.sdk.component.lc.Lxb.ZU.Lxb Lxb(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public void NXR() {
        Lxb.Lxb(Lxb.lc);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public boolean OY() {
        return true;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public String QAg() {
        return nJ.lk();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public boolean STP() {
        return BinderPoolService.Lxb;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public Executor ZU() {
        return hg.lk();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public boolean ebl() {
        return false;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public int lc() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public boolean lk() {
        return true;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public com.bytedance.sdk.component.lc.Lxb.JXs.lk nBu() {
        return new ebl();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public com.bytedance.sdk.component.lc.Lxb.ebl sLN() {
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public String LD(String str) {
        return com.bytedance.sdk.component.ZU.Lxb.Lxb(str, com.bytedance.sdk.openadsdk.core.Lxb.Lxb());
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public boolean Lxb() {
        return false;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public int lk(String str) {
        return VVE.TA().wCT().Lxb(str);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public boolean Lxb(Context context) {
        return IeN.Lxb(context);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public String Lxb(String str) {
        return com.bytedance.sdk.component.ZU.Lxb.LD(str, com.bytedance.sdk.openadsdk.core.Lxb.Lxb());
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public void Lxb(boolean z, int i, long j, com.bytedance.sdk.component.lc.Lxb.lc.ZU zu) {
        Runnable runnableLxb;
        if (zu == null) {
            return;
        }
        Lxb.Lxb(Lxb.lk, z, i, j);
        if (z) {
            com.bytedance.sdk.openadsdk.STP.lk.Lxb("track_link_result", false, (com.bytedance.sdk.openadsdk.STP.LD) new NXR(true, zu));
            return;
        }
        STP stpWCT = VVE.TA().wCT();
        if (stpWCT == null || zu.ZU() >= stpWCT.Lxb(zu.lc())) {
            com.bytedance.sdk.openadsdk.STP.lk.Lxb("track_link_result", false, (com.bytedance.sdk.openadsdk.STP.LD) new NXR(false, zu));
        } else {
            if (!stpWCT.Lxb() || (runnableLxb = zu.Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb(kqm.Lxb()), null)) == null) {
                return;
            }
            hg.Lxb().schedule(runnableLxb, stpWCT.LD(zu.lc()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.JXs
    public void Lxb(boolean z) {
        Lxb.Lxb(Lxb.lc, z);
    }
}
