package com.bytedance.sdk.openadsdk.eK.Lxb;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private final tD LD;
    private int Lxb = lk.LD;
    private final AtomicBoolean lk = new AtomicBoolean(false);
    private final AtomicBoolean ZU = new AtomicBoolean(true);
    private final AtomicInteger JXs = new AtomicInteger(0);
    private long lc = 0;
    private long ebl = 0;
    private final Runnable OY = new Runnable() { // from class: com.bytedance.sdk.openadsdk.eK.Lxb.LD.3
        @Override // java.lang.Runnable
        public void run() {
            LD.this.ZU();
        }
    };

    public LD(tD tDVar) {
        this.LD = tDVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lc() {
        if (this.JXs.get() != 1 || this.lc == 0) {
            return;
        }
        Handler handlerLxb = Lxb.Lxb();
        if (handlerLxb != null) {
            handlerLxb.removeCallbacks(this.OY);
        }
        this.ebl = (SystemClock.elapsedRealtime() - this.lc) + this.ebl;
        this.lc = 0L;
        this.JXs.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void JXs() {
        if (this.JXs.get() == 2) {
            this.lc = SystemClock.elapsedRealtime();
            Handler handlerLxb = Lxb.Lxb();
            if (handlerLxb != null) {
                handlerLxb.postDelayed(this.OY, ((long) this.Lxb) - this.ebl);
            }
            this.JXs.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU() {
        if (this.lk.compareAndSet(false, true)) {
            LD();
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.lc) + this.ebl;
            this.ebl = jElapsedRealtime;
            hg.lk(new OY("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.eK.Lxb.LD.1
                @Override // java.lang.Runnable
                public void run() {
                    String strLxb = nJ.Lxb(LD.this.LD);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", LD.this.LD.nP() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e) {
                        sLN.Lxb("EvTracker", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(LD.this.LD, strLxb, LD.this.LD.vSG(), jSONObject);
                }
            });
        }
    }

    public void LD() {
        this.JXs.set(3);
        Handler handlerLxb = Lxb.Lxb();
        if (handlerLxb != null) {
            handlerLxb.removeCallbacks(this.OY);
        }
    }

    public void Lxb() {
        if (this.JXs.get() != 0) {
            return;
        }
        this.Lxb = this.LD.nP() * 1000;
        this.JXs.set(1);
        this.lc = SystemClock.elapsedRealtime();
        Handler handlerLxb = Lxb.Lxb();
        if (handlerLxb != null) {
            handlerLxb.postDelayed(this.OY, this.Lxb);
        }
    }

    public boolean lk() {
        return this.JXs.get() == 3;
    }

    public void Lxb(final int i) {
        Handler handlerLxb;
        if (this.JXs.get() == 3 || (handlerLxb = Lxb.Lxb()) == null) {
            return;
        }
        handlerLxb.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.eK.Lxb.LD.2
            @Override // java.lang.Runnable
            public void run() {
                if (i == 4 && LD.this.ZU.get()) {
                    LD.this.JXs();
                    return;
                }
                int i2 = i;
                if (i2 == 8) {
                    LD.this.lc();
                } else if (i2 == 5) {
                    LD.this.ZU();
                }
            }
        });
    }

    public void Lxb(boolean z) {
        this.ZU.set(z);
    }
}
