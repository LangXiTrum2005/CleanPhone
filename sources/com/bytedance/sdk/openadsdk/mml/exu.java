package com.bytedance.sdk.openadsdk.mml;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class exu {
    private static volatile exu qdl;
    private final Handler lnr;
    private Map<String, Object> mo;
    private HandlerThread ud;
    private final Executor mml = Executors.newCachedThreadPool();
    private ud mzz = ud.qdl();

    public static class qdl implements Serializable, Runnable {
        public ljh lnr;
        public String mml;
        public Map<String, Object> mzz;
        public final AtomicInteger qdl = new AtomicInteger(0);
        public final AtomicBoolean ud = new AtomicBoolean(false);
        private final long mo = SystemClock.elapsedRealtime();

        public qdl(ljh ljhVar, String str, Map<String, Object> map) {
            this.lnr = ljhVar;
            this.mml = str;
            this.mzz = map;
        }

        public static qdl qdl(ljh ljhVar, String str, Map<String, Object> map) {
            return new qdl(ljhVar, str, map);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.lnr == null || TextUtils.isEmpty(this.mml)) {
                return;
            }
            String str = this.ud.get() ? "dpl_success" : "dpl_failed";
            if (this.mzz == null) {
                this.mzz = new HashMap();
            }
            ljh ljhVar = this.lnr;
            if (ljhVar != null && ljhVar.ikv() == 0) {
                Map<String, Object> map = this.mzz;
                ljh ljhVar2 = this.lnr;
                map.put("auto_click", Boolean.valueOf((ljhVar2 == null || ljhVar2.bjy()) ? false : true));
            }
            this.mzz.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.bjy.qdl().lnr()));
            this.mzz.put("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.mo));
            lnr.qdl(this.lnr, this.mml, str, this.mzz);
        }

        public void ud() {
            this.qdl.incrementAndGet();
        }

        public qdl qdl(boolean z2) {
            this.ud.set(z2);
            return this;
        }

        public int qdl() {
            return this.qdl.get();
        }
    }

    public static class ud {
        public int qdl = 300;
        public int ud = 6000;

        private ud() {
        }

        public static ud qdl() {
            return new ud();
        }
    }

    private exu() {
        if (this.ud == null) {
            this.ud = com.bytedance.sdk.component.utils.jpc.qdl("OpenAppSuccEvent_HandlerThread", 10);
        }
        this.lnr = new Handler(this.ud.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.mml.exu.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                Object obj = message.obj;
                qdl qdlVar = (obj == null || !(obj instanceof qdl)) ? null : (qdl) obj;
                if (qdlVar == null) {
                    return true;
                }
                exu.this.ud(qdlVar);
                return true;
            }
        });
    }

    private void lnr(qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        this.mml.execute(qdlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        boolean zMml = com.bytedance.sdk.openadsdk.core.bjy.qdl().mml();
        boolean zQdl = com.bytedance.sdk.openadsdk.core.bjy.qdl().qdl(true);
        if (!zMml && zQdl) {
            qdl(qdlVar);
            return;
        }
        if (qdlVar.mzz == null) {
            qdlVar.mzz = new HashMap();
        }
        qdlVar.mzz.put("is_background", Boolean.valueOf(zMml));
        qdlVar.mzz.put("has_focus", Boolean.valueOf(zQdl));
        lnr(qdlVar.qdl(true));
    }

    public static exu qdl() {
        if (qdl == null) {
            synchronized (exu.class) {
                try {
                    if (qdl == null) {
                        qdl = new exu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public exu qdl(Map<String, Object> map) {
        this.mo = map;
        return qdl();
    }

    public void qdl(ljh ljhVar, String str) {
        Message messageObtainMessage = this.lnr.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = qdl.qdl(ljhVar, str, this.mo);
        messageObtainMessage.sendToTarget();
    }

    private void qdl(qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        qdlVar.ud();
        int iQdl = qdlVar.qdl();
        ud udVar = this.mzz;
        if (iQdl * udVar.qdl > udVar.ud) {
            lnr(qdlVar.qdl(false));
            return;
        }
        Message messageObtainMessage = this.lnr.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = qdlVar;
        this.lnr.sendMessageDelayed(messageObtainMessage, this.mzz.qdl);
    }
}
