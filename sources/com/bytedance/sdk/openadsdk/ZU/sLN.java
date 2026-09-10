package com.bytedance.sdk.openadsdk.ZU;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class sLN {
    private static volatile sLN Lxb;
    private HandlerThread LD;
    private Map<String, Object> lc;
    private final Handler lk;
    private final Executor ZU = Executors.newCachedThreadPool();
    private LD JXs = LD.Lxb();

    public static class LD {
        public int Lxb = 300;
        public int LD = 6000;

        private LD() {
        }

        public static LD Lxb() {
            return new LD();
        }
    }

    public static class Lxb implements Serializable, Runnable {
        public Map<String, Object> JXs;
        public String ZU;
        public tD lk;
        public final AtomicInteger Lxb = new AtomicInteger(0);
        public final AtomicBoolean LD = new AtomicBoolean(false);

        public Lxb(tD tDVar, String str, Map<String, Object> map) {
            this.lk = tDVar;
            this.ZU = str;
            this.JXs = map;
        }

        public static Lxb Lxb(tD tDVar, String str, Map<String, Object> map) {
            return new Lxb(tDVar, str, map);
        }

        public void LD() {
            this.Lxb.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.lk == null || TextUtils.isEmpty(this.ZU)) {
                return;
            }
            String str = this.LD.get() ? "dpl_success" : "dpl_failed";
            if (this.JXs == null) {
                this.JXs = new HashMap();
            }
            tD tDVar = this.lk;
            if (tDVar != null && tDVar.qK() == 0) {
                Map<String, Object> map = this.JXs;
                tD tDVar2 = this.lk;
                map.put("auto_click", Boolean.valueOf((tDVar2 == null || tDVar2.ZU()) ? false : true));
            }
            this.JXs.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.IeN.Lxb().lk()));
            lk.Lxb(this.lk, this.ZU, str, this.JXs);
        }

        public Lxb Lxb(boolean z) {
            this.LD.set(z);
            return this;
        }

        public int Lxb() {
            return this.Lxb.get();
        }
    }

    private sLN() {
        if (this.LD == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.LD = handlerThread;
            handlerThread.start();
        }
        this.lk = new Handler(this.LD.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.ZU.sLN.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                Object obj = message.obj;
                Lxb lxb = (obj == null || !(obj instanceof Lxb)) ? null : (Lxb) obj;
                if (lxb == null) {
                    return true;
                }
                sLN.this.LD(lxb);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(Lxb lxb) {
        if (lxb == null) {
            return;
        }
        boolean zZU = com.bytedance.sdk.openadsdk.core.IeN.Lxb().ZU();
        boolean zLxb = com.bytedance.sdk.openadsdk.core.IeN.Lxb().Lxb(true);
        if (!zZU && zLxb) {
            Lxb(lxb);
            return;
        }
        if (lxb.JXs == null) {
            lxb.JXs = new HashMap();
        }
        lxb.JXs.put("is_background", Boolean.valueOf(zZU));
        lxb.JXs.put("has_focus", Boolean.valueOf(zLxb));
        lk(lxb.Lxb(true));
    }

    private void lk(Lxb lxb) {
        if (lxb == null) {
            return;
        }
        this.ZU.execute(lxb);
    }

    public static sLN Lxb() {
        if (Lxb == null) {
            synchronized (sLN.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new sLN();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public sLN Lxb(Map<String, Object> map) {
        this.lc = map;
        return Lxb();
    }

    public void Lxb(tD tDVar, String str) {
        Message messageObtainMessage = this.lk.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = Lxb.Lxb(tDVar, str, this.lc);
        messageObtainMessage.sendToTarget();
    }

    private void Lxb(Lxb lxb) {
        if (lxb == null) {
            return;
        }
        lxb.LD();
        int iLxb = lxb.Lxb();
        LD ld = this.JXs;
        if (iLxb * ld.Lxb > ld.LD) {
            lk(lxb.Lxb(false));
            return;
        }
        Message messageObtainMessage = this.lk.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = lxb;
        this.lk.sendMessageDelayed(messageObtainMessage, this.JXs.Lxb);
    }
}
