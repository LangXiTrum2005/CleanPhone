package com.bytedance.sdk.openadsdk.mml.qdl;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.inmobi.commons.core.configs.CrashConfig;
import com.p004ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jpc implements com.bytedance.sdk.component.mo.qdl.mzz {
    private final String qdl = "[7702]";

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean bjy() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("batch_log_config", a.j, 0) == 1;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean exu() {
        return BinderPoolService.qdl;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public com.bytedance.sdk.component.mo.qdl.wd fs() {
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean jpc() {
        return true;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean jtx() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean lnr() {
        return true;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public Executor mml() {
        return fco.mml();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public int mo() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public Executor mzz() {
        return fco.jpc();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public com.bytedance.sdk.component.mo.qdl.mml.qdl qdl(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public long rdp() {
        long jQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("log_queue_timeout", 40000);
        if (jQdl < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL || jQdl > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jQdl;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public com.bytedance.sdk.component.mo.qdl.mo rq() {
        com.bytedance.sdk.component.mo.qdl.mo moVarQdl;
        synchronized (this) {
            moVarQdl = com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl());
        }
        return moVarQdl;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public com.bytedance.sdk.component.mo.qdl.mzz.lnr to() {
        return new mml();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public String tvp() {
        return gy.mml();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean ud() {
        return false;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean wd() {
        return false;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public int yt() {
        return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public int lnr(String str) {
        rq rqVarXdk = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().xdk();
        if (rqVarXdk == null) {
            return 3;
        }
        return rqVarXdk.qdl(str);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean qdl() {
        return false;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public String ud(String str) {
        return com.bytedance.sdk.component.mml.qdl.qdl(str, com.bytedance.sdk.openadsdk.core.qdl.qdl());
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public boolean qdl(Context context) {
        return jl.qdl(context);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public String qdl(String str) {
        return com.bytedance.sdk.component.mml.qdl.ud(str, com.bytedance.sdk.openadsdk.core.qdl.qdl());
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public void qdl(boolean z2, int i2, long j, com.bytedance.sdk.component.mo.qdl.mo.mml mmlVar) {
        Runnable runnableQdl;
        if (mmlVar == null) {
            return;
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("track_link_result", false, (com.bytedance.sdk.openadsdk.bjy.ud) new to(true, mmlVar));
            return;
        }
        rq rqVarXdk = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().xdk();
        if (rqVarXdk == null || mmlVar.mml() >= rqVarXdk.qdl(mmlVar.mo())) {
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("track_link_result", false, (com.bytedance.sdk.openadsdk.bjy.ud) new to(false, mmlVar));
        } else {
            if (!rqVarXdk.qdl() || (runnableQdl = mmlVar.qdl(fs.qdl(yt.qdl()), null)) == null) {
                return;
            }
            fco.qdl().schedule(runnableQdl, rqVarXdk.ud(mmlVar.mo()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.mzz
    public HandlerThread qdl(String str, int i2) {
        return com.bytedance.sdk.component.utils.jpc.qdl(str, i2);
    }
}
