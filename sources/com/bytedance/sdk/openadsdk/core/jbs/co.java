package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private static String ik;
    private static String lr;
    private static final AtomicBoolean ri = new AtomicBoolean(false);

    public static String ik() {
        String strIk;
        if (lr == null) {
            lr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarLr = com.bytedance.sdk.component.adexpress.ri.lr.mj.lr();
        if (riVarLr != null && (strIk = riVarLr.ik()) != null && !strIk.equals(lr)) {
            lr = strIk;
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_sp", "js_render_ver", strIk);
        }
        return lr;
    }

    public static String ka() {
        Map<String, com.bytedance.sdk.component.adexpress.ri.ik.ri> mapRi;
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVar;
        String strIk;
        if (ik == null) {
            ik = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarLr = com.bytedance.sdk.component.adexpress.ri.lr.mj.lr();
        if (riVarLr != null && (mapRi = riVarLr.ri()) != null && (riVar = mapRi.get("v3")) != null && (strIk = riVar.ik()) != null && !strIk.equals(ik)) {
            ik = strIk;
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("tt_sp", "js_render_v3_ver", strIk);
        }
        return ik;
    }

    public static void lr() {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi() || ri.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ri.lr.lr.ri();
    }

    public static void ri() {
        com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ri(new com.bytedance.sdk.component.adexpress.ri.ri.lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.1
            @Override // com.bytedance.sdk.component.adexpress.ri.ri.lr
            public int ri(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.tan.lr.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.lr
            public Cursor ri(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.tan.ri.ri(com.bytedance.sdk.openadsdk.tan.lr.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.lr
            public int ri(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.tan.lr.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.lr
            public void ri(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.tan.lr.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ri(new com.bytedance.sdk.component.adexpress.ri.ri.ik() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2

            /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.co$2$1, reason: invalid class name */
            public class AnonymousClass1 implements Runnable {
                final /* synthetic */ int ik;
                final /* synthetic */ int lr;
                final /* synthetic */ MessageQueue[] ri;

                public AnonymousClass1(MessageQueue[] messageQueueArr, int i, int i2) {
                    this.ri = messageQueueArr;
                    this.lr = i;
                    this.ik = i2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.ri[0] = Looper.myQueue();
                    ri(this.ri[0], this.lr, this.ik);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public ExecutorService aw() {
                return dzy.fi();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public ExecutorService bgr() {
                return dzy.qt();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int bu() {
                return qd.fi(com.bytedance.sdk.openadsdk.core.nr.ri());
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int co() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public com.bytedance.sdk.component.xha.lr.ri di() {
                com.bytedance.sdk.component.xha.lr.ri riVarKa = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ka();
                riVarKa.ri(8);
                riVarKa.lr("express_down");
                return riVarKa;
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public com.bytedance.sdk.component.adexpress.ri.ik.ri fi() {
                return com.bytedance.sdk.openadsdk.core.nr.ik().ri();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public Handler ik() {
                return com.bytedance.sdk.openadsdk.core.vr.ik();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int jbs() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public void ka() {
                int iAac = com.bytedance.sdk.openadsdk.core.nr.ka().aac();
                int iXe = com.bytedance.sdk.openadsdk.core.nr.ka().xe();
                if (iAac == 0 && iXe == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.fi.fi.ri().ri(iAac);
                com.bytedance.sdk.component.adexpress.fi.fi.ri().lr(iXe);
                int iDi = com.bytedance.sdk.openadsdk.wjv.fi.di();
                int iFi = com.bytedance.sdk.openadsdk.wjv.fi.fi();
                if (iDi == 0 && iFi == 0) {
                    return;
                }
                ri(com.bytedance.sdk.openadsdk.core.vr.ik().getLooper().getQueue(), iFi, iDi);
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public String mj() {
                return com.bytedance.sdk.openadsdk.core.qt.lr().ka();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int nr() {
                return com.bytedance.sdk.openadsdk.wjv.fi.ri("gaussian_blur_type", 0);
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int qt() {
                return com.bytedance.sdk.openadsdk.core.nr.ka().aac();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int sf() {
                return com.bytedance.sdk.openadsdk.core.nr.ka().xe();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int slm() {
                return qd.ik(com.bytedance.sdk.openadsdk.core.nr.ri());
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public ScheduledExecutorService vr() {
                return dzy.ri();
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public com.bytedance.sdk.component.xha.lr.lr xha() {
                com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
                lrVarIk.ri(8);
                lrVarIk.lr("express_get");
                return lrVarIk;
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public Context lr() {
                return com.bytedance.sdk.openadsdk.core.nr.ri();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void lr(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.ri.lr(i, false, messageQueue).lr();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ik
            public int ri() {
                if (com.bytedance.sdk.openadsdk.core.nr.ka() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.nr.ka().fi();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ri(final MessageQueue messageQueue, final int i, final int i2) {
                if (messageQueue != null) {
                    final int iRi = com.bytedance.sdk.openadsdk.wjv.fi.ri("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            lr(messageQueue, i);
                            ri(messageQueue, i2);
                        }
                    };
                    if (iRi > 0) {
                        com.bytedance.sdk.openadsdk.core.vr.ik().postDelayed(runnable, iRi);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ri(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.ri.lr(i, true, messageQueue).lr();
                        return false;
                    }
                });
            }
        });
        com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ri(new com.bytedance.sdk.component.adexpress.ri.ri.ka() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.3
            @Override // com.bytedance.sdk.component.adexpress.ri.ri.ka
            public void ri(int i) {
                com.bytedance.sdk.openadsdk.slm.ka.ri().ri(com.bytedance.sdk.openadsdk.slm.ri.ka.lr().lr(i).di(com.bytedance.sdk.openadsdk.core.jbs.ri(i)));
            }
        });
        com.bytedance.sdk.component.jbs.ri.ri.ri().ri(new com.bytedance.sdk.component.jbs.ri.lr() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.4
            @Override // com.bytedance.sdk.component.jbs.ri.lr
            public void ri(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.ka.ik.ik(com.bytedance.sdk.openadsdk.utils.lr.ik(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.jbs.ri.lr
            public void ri(com.bytedance.sdk.component.jbs.lr.ri riVar, String str, String str2, JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = new com.bytedance.sdk.openadsdk.core.model.wjv();
                wjvVar.zf(riVar.ri());
                wjvVar.su(riVar.lr());
                wjvVar.wjv(riVar.ik());
                wjvVar.ay(riVar.ka());
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, str, str2, jSONObject, j);
            }

            @Override // com.bytedance.sdk.component.jbs.ri.lr
            public void ri(com.bytedance.sdk.component.jbs.lr.ri riVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (riVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = new com.bytedance.sdk.openadsdk.core.model.wjv();
                    wjvVar.zf(riVar.ri());
                    wjvVar.su(riVar.lr());
                    wjvVar.wjv(riVar.ik());
                    wjvVar.ay(riVar.ka());
                    com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, str, str2, new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.jbs.co.4.1
                        @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                        public JSONObject ik() {
                            return jSONObject2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
                        public JSONObject ri() {
                            return jSONObject;
                        }
                    });
                }
            }
        });
    }
}
