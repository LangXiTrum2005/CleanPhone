package com.bytedance.sdk.openadsdk.ka.ri;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.nr;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements com.bytedance.sdk.component.di.ri.fi {
    private final String ri = "[7911]";

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean aw() {
        return com.bytedance.sdk.openadsdk.wjv.fi.ri("batch_log_config", a.j, 0) == 1;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean bgr() {
        return com.bytedance.sdk.openadsdk.wjv.fi.ri("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public long co() {
        long jRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("log_queue_timeout", 40000);
        if (jRi < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL || jRi > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jRi;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public int di() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public Executor fi() {
        return dzy.mj();
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean ik() {
        return true;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public String jbs() {
        return ig.ka();
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public Executor ka() {
        return dzy.ka();
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean lr() {
        return false;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean mj() {
        return true;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public com.bytedance.sdk.component.di.ri.fi.ik qt() {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return null;
        }
        return new ik();
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public com.bytedance.sdk.component.di.ri.ka.ri ri(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public com.bytedance.sdk.component.di.ri.di sf() {
        return null;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public int vr() {
        return com.bytedance.sdk.openadsdk.wjv.fi.ri("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean xha() {
        return false;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public int ik(String str) {
        qt qtVarPu = sf.lr().pu();
        if (qtVarPu == null) {
            return 3;
        }
        return qtVarPu.ri(str);
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public String lr(String str) {
        return com.bytedance.sdk.component.ka.ri.ri(str, com.bytedance.sdk.openadsdk.core.ri.ri());
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean ri() {
        return false;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public boolean ri(Context context) {
        return nr.ri(context);
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public String ri(String str) {
        return com.bytedance.sdk.component.ka.ri.lr(str, com.bytedance.sdk.openadsdk.core.ri.ri());
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public void ri(boolean z, int i, long j, com.bytedance.sdk.component.di.ri.di.ka kaVar) {
        Runnable runnableRi;
        if (kaVar == null) {
            return;
        }
        if (z) {
            com.bytedance.sdk.openadsdk.slm.ka.ri("track_link_result", false, new jbs(true, kaVar));
            return;
        }
        qt qtVarPu = sf.lr().pu();
        if (qtVarPu == null || kaVar.ka() >= qtVarPu.ri(kaVar.di())) {
            com.bytedance.sdk.openadsdk.slm.ka.ri("track_link_result", false, new jbs(false, kaVar));
        } else {
            if (!qtVarPu.ri() || (runnableRi = kaVar.ri(aw.ri(com.bytedance.sdk.openadsdk.core.nr.ri()), null)) == null) {
                return;
            }
            dzy.ri().schedule(runnableRi, qtVarPu.lr(kaVar.di()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.di.ri.fi
    public HandlerThread ri(String str, int i) {
        return com.bytedance.sdk.component.utils.mj.ri(str, i);
    }
}
