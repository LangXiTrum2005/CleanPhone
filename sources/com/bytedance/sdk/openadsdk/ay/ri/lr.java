package com.bytedance.sdk.openadsdk.ay.ri;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private final wjv lr;
    private int ri = ik.lr;
    private final AtomicBoolean ik = new AtomicBoolean(false);
    private final AtomicBoolean ka = new AtomicBoolean(true);
    private final AtomicInteger fi = new AtomicInteger(0);
    private long di = 0;
    private long xha = 0;
    private final Runnable mj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.ri.lr.3
        @Override // java.lang.Runnable
        public void run() {
            lr.this.ka();
        }
    };

    public lr(wjv wjvVar) {
        this.lr = wjvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void di() {
        if (this.fi.get() != 1 || this.di == 0) {
            return;
        }
        Handler handlerRi = ri.ri();
        if (handlerRi != null) {
            handlerRi.removeCallbacks(this.mj);
        }
        this.xha += SystemClock.elapsedRealtime() - this.di;
        this.di = 0L;
        this.fi.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fi() {
        if (this.fi.get() == 2) {
            this.di = SystemClock.elapsedRealtime();
            Handler handlerRi = ri.ri();
            if (handlerRi != null) {
                handlerRi.postDelayed(this.mj, ((long) this.ri) - this.xha);
            }
            this.fi.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka() {
        if (this.ik.compareAndSet(false, true)) {
            lr();
            final long jElapsedRealtime = this.xha + (SystemClock.elapsedRealtime() - this.di);
            this.xha = jElapsedRealtime;
            dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.ay.ri.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    String strRi = ig.ri(lr.this.lr);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", lr.this.lr.zyl() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e) {
                        ac.ik("EvTracker", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.ka.ik.lr(lr.this.lr, strRi, lr.this.lr.pwf(), jSONObject);
                }
            });
        }
    }

    public boolean ik() {
        return this.fi.get() == 3;
    }

    public void lr() {
        this.fi.set(3);
        Handler handlerRi = ri.ri();
        if (handlerRi != null) {
            handlerRi.removeCallbacks(this.mj);
        }
    }

    public void ri() {
        if (this.fi.get() != 0) {
            return;
        }
        this.ri = this.lr.zyl() * 1000;
        this.fi.set(1);
        this.di = SystemClock.elapsedRealtime();
        Handler handlerRi = ri.ri();
        if (handlerRi != null) {
            handlerRi.postDelayed(this.mj, this.ri);
        }
    }

    public void ri(final int i) {
        Handler handlerRi;
        if (this.fi.get() == 3 || (handlerRi = ri.ri()) == null) {
            return;
        }
        handlerRi.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.ri.lr.2
            @Override // java.lang.Runnable
            public void run() {
                if (i == 4 && lr.this.ka.get()) {
                    lr.this.fi();
                    return;
                }
                int i2 = i;
                if (i2 == 8) {
                    lr.this.di();
                } else if (i2 == 5) {
                    lr.this.ka();
                }
            }
        });
    }

    public void ri(boolean z) {
        this.ka.set(z);
    }
}
