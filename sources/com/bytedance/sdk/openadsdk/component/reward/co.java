package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private boolean di;
    private boolean fi;
    private long ik;
    private long ka;
    private long lr;
    private final ri ri;

    public interface ri {
        void ri(int i);
    }

    public co(ri riVar) {
        this.fi = true;
        this.ri = riVar;
        int iRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("reward_callback_fallback", 0);
        if (iRi != 0) {
            this.fi = false;
            if (iRi == 2) {
                this.di = true;
            }
        }
    }

    public static void ri(wjv wjvVar, boolean z, final int i) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, ig.ri(wjvVar), z ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.co.1
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void ik() {
        this.fi = true;
    }

    public void ka() {
        if (this.ri != null) {
            long jElapsedRealtime = (this.ka + (this.ik > 0 ? SystemClock.elapsedRealtime() - this.ik : 0L)) / 1000;
            if (this.fi) {
                return;
            }
            if (this.di) {
                this.ri.ri(jElapsedRealtime < this.lr ? 4 : 1);
            } else if (jElapsedRealtime >= this.lr) {
                this.ri.ri(1);
            }
        }
    }

    public void lr() {
        if (this.fi) {
            return;
        }
        this.ik = SystemClock.elapsedRealtime();
    }

    public void ri(long j) {
        if (j <= this.lr) {
            return;
        }
        this.lr = j;
    }

    public void ri() {
        if (!this.fi && this.ik > 0) {
            this.ka += SystemClock.elapsedRealtime() - this.ik;
            this.ik = 0L;
        }
    }
}
