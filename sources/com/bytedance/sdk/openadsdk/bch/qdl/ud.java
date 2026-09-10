package com.bytedance.sdk.openadsdk.bch.qdl;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private final ljh ud;
    private int qdl = lnr.ud;
    private final AtomicBoolean lnr = new AtomicBoolean(false);
    private final AtomicBoolean mml = new AtomicBoolean(true);
    private final AtomicInteger mzz = new AtomicInteger(0);
    private long mo = 0;
    private long wd = 0;
    private final Runnable jpc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.bch.qdl.ud.3
        @Override // java.lang.Runnable
        public void run() {
            ud.this.mml();
        }
    };

    public ud(ljh ljhVar) {
        this.ud = ljhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo() {
        if (this.mzz.get() != 1 || this.mo == 0) {
            return;
        }
        Handler handlerQdl = qdl.qdl();
        if (handlerQdl != null) {
            handlerQdl.removeCallbacks(this.jpc);
        }
        this.wd = (SystemClock.elapsedRealtime() - this.mo) + this.wd;
        this.mo = 0L;
        this.mzz.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        if (this.lnr.compareAndSet(false, true)) {
            ud();
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.mo) + this.wd;
            this.wd = jElapsedRealtime;
            fco.lnr(new jpc("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.bch.qdl.ud.1
                @Override // java.lang.Runnable
                public void run() {
                    String strQdl = gy.qdl(ud.this.ud);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", ud.this.ud.oa() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e2) {
                        aaj.lnr("EvTracker", e2.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(ud.this.ud, strQdl, ud.this.ud.ev(), jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mzz() {
        if (this.mzz.get() == 2) {
            this.mo = SystemClock.elapsedRealtime();
            Handler handlerQdl = qdl.qdl();
            if (handlerQdl != null) {
                handlerQdl.postDelayed(this.jpc, ((long) this.qdl) - this.wd);
            }
            this.mzz.set(1);
        }
    }

    public boolean lnr() {
        return this.mzz.get() == 3;
    }

    public void qdl() {
        if (this.mzz.get() != 0) {
            return;
        }
        this.qdl = this.ud.oa() * 1000;
        this.mzz.set(1);
        this.mo = SystemClock.elapsedRealtime();
        Handler handlerQdl = qdl.qdl();
        if (handlerQdl != null) {
            handlerQdl.postDelayed(this.jpc, this.qdl);
        }
    }

    public void ud() {
        this.mzz.set(3);
        Handler handlerQdl = qdl.qdl();
        if (handlerQdl != null) {
            handlerQdl.removeCallbacks(this.jpc);
        }
    }

    public void qdl(final int i2) {
        Handler handlerQdl;
        if (this.mzz.get() == 3 || (handlerQdl = qdl.qdl()) == null) {
            return;
        }
        handlerQdl.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bch.qdl.ud.2
            @Override // java.lang.Runnable
            public void run() {
                if (i2 == 4 && ud.this.mml.get()) {
                    ud.this.mzz();
                    return;
                }
                int i3 = i2;
                if (i3 == 8) {
                    ud.this.mo();
                } else if (i3 == 5) {
                    ud.this.mml();
                }
            }
        });
    }

    public void qdl(boolean z2) {
        this.mml.set(z2);
    }
}
