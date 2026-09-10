package com.bytedance.sdk.openadsdk.ka;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    private static volatile bgr ri;
    private Map<String, Object> ka;
    private lr ik = lr.ri();
    private final Handler lr = new Handler(com.bytedance.sdk.openadsdk.core.vr.lr().getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.ka.bgr.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 100) {
                return true;
            }
            Object obj = message.obj;
            ri riVar = (obj == null || !(obj instanceof ri)) ? null : (ri) obj;
            if (riVar == null) {
                return true;
            }
            bgr.this.lr(riVar);
            return true;
        }
    });

    public static class lr {
        public int ri = AdSize.MEDIUM_RECTANGLE_WIDTH;
        public int lr = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;

        private lr() {
        }

        public static lr ri() {
            return new lr();
        }
    }

    public static class ri implements Serializable, Runnable {
        public Map<String, Object> fi;
        public wjv ik;
        public String ka;
        public final AtomicInteger ri = new AtomicInteger(0);
        public final AtomicBoolean lr = new AtomicBoolean(false);
        private final long di = SystemClock.elapsedRealtime();

        public ri(wjv wjvVar, String str, Map<String, Object> map) {
            this.ik = wjvVar;
            this.ka = str;
            this.fi = map;
        }

        public static ri ri(wjv wjvVar, String str, Map<String, Object> map) {
            return new ri(wjvVar, str, map);
        }

        public void lr() {
            this.ri.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.ik == null || TextUtils.isEmpty(this.ka)) {
                return;
            }
            String str = this.lr.get() ? "dpl_success" : "dpl_failed";
            if (this.fi == null) {
                this.fi = new HashMap();
            }
            wjv wjvVar = this.ik;
            if (wjvVar != null && wjvVar.yv() == 0) {
                Map<String, Object> map = this.fi;
                wjv wjvVar2 = this.ik;
                map.put("auto_click", Boolean.valueOf((wjvVar2 == null || wjvVar2.tan()) ? false : true));
            }
            this.fi.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.slm.ri().ik()));
            this.fi.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(SystemClock.elapsedRealtime() - this.di));
            ik.ri(this.ik, this.ka, str, this.fi);
        }

        public ri ri(boolean z) {
            this.lr.set(z);
            return this;
        }

        public int ri() {
            return this.ri.get();
        }
    }

    private bgr() {
    }

    private void ik(ri riVar) {
        if (riVar == null) {
            return;
        }
        this.lr.post(riVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(ri riVar) {
        if (riVar == null) {
            return;
        }
        boolean zKa = com.bytedance.sdk.openadsdk.core.slm.ri().ka();
        boolean zRi = com.bytedance.sdk.openadsdk.core.slm.ri().ri(true);
        if (!zKa && zRi) {
            ri(riVar);
            return;
        }
        if (riVar.fi == null) {
            riVar.fi = new HashMap();
        }
        riVar.fi.put("is_background", Boolean.valueOf(zKa));
        riVar.fi.put("has_focus", Boolean.valueOf(zRi));
        ik(riVar.ri(true));
    }

    public static bgr ri() {
        if (ri == null) {
            synchronized (bgr.class) {
                try {
                    if (ri == null) {
                        ri = new bgr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public bgr ri(Map<String, Object> map) {
        this.ka = map;
        return ri();
    }

    public void ri(wjv wjvVar, String str) {
        Message messageObtainMessage = this.lr.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = ri.ri(wjvVar, str, this.ka);
        messageObtainMessage.sendToTarget();
    }

    private void ri(ri riVar) {
        if (riVar == null) {
            return;
        }
        riVar.lr();
        int iRi = riVar.ri();
        lr lrVar = this.ik;
        if (iRi * lrVar.ri > lrVar.lr) {
            ik(riVar.ri(false));
            return;
        }
        Message messageObtainMessage = this.lr.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = riVar;
        this.lr.sendMessageDelayed(messageObtainMessage, this.ik.ri);
    }
}
