package com.bytedance.sdk.openadsdk.core.OY;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sLN {
    private static String LD;
    private static String Lxb;

    @NonNull
    public static String LD() {
        String strLk;
        if (Lxb == null) {
            Lxb = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbLD = com.bytedance.sdk.component.adexpress.Lxb.LD.OY.LD();
        if (lxbLD != null && (strLk = lxbLD.lk()) != null && !strLk.equals(Lxb)) {
            Lxb = strLk;
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_sp", "js_render_ver", strLk);
        }
        return Lxb;
    }

    public static void Lxb() {
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().Lxb(new com.bytedance.sdk.component.adexpress.Lxb.Lxb.LD() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.1
            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.LD
            public int Lxb(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.LD
            public Cursor Lxb(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.lk(com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.LD
            public int Lxb(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.LD
            public void Lxb(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.Lxb.Lxb.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().Lxb(new com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.2
            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public int IeN() {
                return le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public int JVA() {
                return com.bytedance.sdk.openadsdk.core.kqm.ZU().uxf();
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb JXs() {
                return com.bytedance.sdk.openadsdk.core.kqm.lk().Lxb();
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public ExecutorService NXR() {
                if (hg.JVA()) {
                    return hg.ZU();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public String OY() {
                return com.bytedance.sdk.openadsdk.core.QAg.LD().ZU();
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public int QAg() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public ExecutorService STP() {
                if (hg.JVA()) {
                    return hg.QAg();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public int VVE() {
                return le.ZU(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public void ZU() {
                int iSv = com.bytedance.sdk.openadsdk.core.kqm.ZU().Sv();
                int iUxf = com.bytedance.sdk.openadsdk.core.kqm.ZU().uxf();
                if (iSv == 0 && iUxf == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().Lxb(iSv);
                com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().LD(iUxf);
                final int iLc = com.bytedance.sdk.openadsdk.DY.Lxb.lc();
                final int iJXs = com.bytedance.sdk.openadsdk.DY.Lxb.JXs();
                if (iLc == 0 && iJXs == 0) {
                    return;
                }
                final MessageQueue[] messageQueueArr = new MessageQueue[1];
                if (Build.VERSION.SDK_INT >= 23) {
                    MessageQueue queue = com.bytedance.sdk.openadsdk.core.STP.lk().getLooper().getQueue();
                    messageQueueArr[0] = queue;
                    Lxb(queue, iJXs, iLc);
                } else {
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                messageQueueArr[0] = Looper.myQueue();
                                Lxb(messageQueueArr[0], iJXs, iLc);
                            }
                        });
                        return;
                    }
                    MessageQueue messageQueueMyQueue = Looper.myQueue();
                    messageQueueArr[0] = messageQueueMyQueue;
                    Lxb(messageQueueMyQueue, iJXs, iLc);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public com.bytedance.sdk.component.ebl.LD.LD ebl() {
                com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
                ldLk.Lxb(8);
                ldLk.Lxb("express_get");
                return ldLk;
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public boolean kqm() {
                return com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("destroy_render_script", false);
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public com.bytedance.sdk.component.ebl.LD.Lxb lc() {
                com.bytedance.sdk.component.ebl.LD.Lxb lxbZU = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().ZU();
                lxbZU.Lxb(8);
                lxbZU.Lxb("express_down");
                return lxbZU;
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public Handler lk() {
                return com.bytedance.sdk.openadsdk.core.STP.lk();
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public int nBu() {
                return com.bytedance.sdk.openadsdk.core.kqm.ZU().Sv();
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public int sLN() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public Context LD() {
                return com.bytedance.sdk.openadsdk.core.kqm.Lxb();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void LD(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.Lxb.LD(i, false, messageQueue).LD();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk
            public int Lxb() {
                if (com.bytedance.sdk.openadsdk.core.kqm.ZU() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.kqm.ZU().ZU();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Lxb(final MessageQueue messageQueue, final int i, final int i2) {
                if (messageQueue != null) {
                    final int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            LD(messageQueue, i);
                            Lxb(messageQueue, i2);
                        }
                    };
                    if (iLxb > 0) {
                        com.bytedance.sdk.openadsdk.core.STP.lk().postDelayed(runnable, iLxb);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void Lxb(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.Lxb.LD(i, true, messageQueue).LD();
                        return false;
                    }
                });
            }
        });
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().Lxb(new com.bytedance.sdk.component.adexpress.Lxb.Lxb.ZU() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.3
            @Override // com.bytedance.sdk.component.adexpress.Lxb.Lxb.ZU
            public void Lxb(int i) {
                com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().LD(i).lc(com.bytedance.sdk.openadsdk.core.OY.Lxb(i)));
            }
        });
        com.bytedance.sdk.component.QAg.Lxb.Lxb.Lxb().Lxb(new com.bytedance.sdk.component.QAg.Lxb.LD() { // from class: com.bytedance.sdk.openadsdk.core.OY.sLN.4
            @Override // com.bytedance.sdk.component.QAg.Lxb.LD
            public void Lxb(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.ZU.lk.lk(com.bytedance.sdk.openadsdk.utils.LD.Lxb(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.QAg.Lxb.LD
            public void Lxb(com.bytedance.sdk.component.QAg.LD.Lxb lxb, String str, String str2, JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.tD tDVarLk = com.bytedance.sdk.openadsdk.core.model.tD.lk();
                tDVarLk.kqm(lxb.Lxb());
                tDVarLk.DY(lxb.LD());
                tDVarLk.brP(lxb.lk());
                com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVarLk, str, str2, jSONObject, j);
            }
        });
    }

    public static String lk() {
        Map<String, com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb> mapLxb;
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb;
        String strLk;
        if (LD == null) {
            LD = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxbLD = com.bytedance.sdk.component.adexpress.Lxb.LD.OY.LD();
        if (lxbLD != null && (mapLxb = lxbLD.Lxb()) != null && (lxb = mapLxb.get("v3")) != null && (strLk = lxb.lk()) != null && !strLk.equals(LD)) {
            LD = strLk;
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_sp", "js_render_v3_ver", strLk);
        }
        return LD;
    }
}
