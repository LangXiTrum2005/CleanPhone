package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    private static final AtomicInteger Lxb = new AtomicInteger(0);
    private static final AtomicBoolean LD = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void ZU() {
        if (Lxb.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.hg.Lxb().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.JVA.2
                @Override // java.lang.Runnable
                public void run() {
                    JVA.lk(sLN.Lxb(kqm.Lxb()));
                }
            }, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk(final String str) {
        com.bytedance.sdk.openadsdk.utils.hg.lk(new com.bytedance.sdk.component.OY.OY("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.JVA.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObjectLxb;
                final String strHu = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Hu();
                com.bytedance.sdk.openadsdk.STP.lk.Lxb(0, strHu);
                if (TextUtils.isEmpty(strHu)) {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb(-1, strHu, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.ebl.LD.ZU zuLD = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().LD();
                try {
                    zuLD.LD(strHu);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.HD.Lxb(kqm.Lxb(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.ZU.Lxb.lk.Lxb().LD());
                    if (com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        jSONObjectLxb = PangleEncryptManager.encryptType4(jSONObject, new Sfi(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (jSONObjectLxb == null || jSONObjectLxb.optInt("cypher") != 4) {
                            HD.LD(false);
                        } else {
                            HD.LD(true);
                            zuLD.LD("x-pgli18n", "4");
                            zuLD.LD("Content-Type", "application/json; charset=utf-8");
                        }
                    } else {
                        jSONObjectLxb = com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject);
                        if (JVA.LD(jSONObjectLxb)) {
                            zuLD.LD(HttpResponseHeader.ContentEncoding, "union_sdk_encode");
                        }
                    }
                    if (JVA.LD(jSONObjectLxb)) {
                        jSONObject = jSONObjectLxb;
                    }
                    zuLD.LD("Content-Type", "application/json; charset=utf-8");
                    zuLD.LD("User-Agent", nJ.lk());
                    zuLD.Lxb(jSONObject);
                    zuLD.Lxb(6);
                    zuLD.Lxb("send_i_p_v6");
                    zuLD.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.JVA.1.1
                        @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                        public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                            if (ld.lc()) {
                                com.bytedance.sdk.openadsdk.STP.lk.Lxb(1, strHu);
                            } else {
                                com.bytedance.sdk.openadsdk.STP.lk.Lxb(-1, strHu, ld.Lxb(), ld.LD());
                                JVA.ZU();
                            }
                        }

                        @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                        public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.STP.lk.Lxb(-1, strHu, 1, iOException.getMessage());
                            }
                            JVA.ZU();
                        }
                    });
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb(-1, strHu, -2, e.getMessage());
                    com.bytedance.sdk.component.utils.sLN.LD("build ipv6 request failed:" + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk() {
        Lxb.set(0);
    }

    public static class Lxb implements com.bytedance.sdk.component.utils.HD.Lxb {
        private static final AtomicBoolean Lxb = new AtomicBoolean(false);
        private static volatile long LD = -1;

        private Lxb() {
        }

        public static void Lxb() {
            if (Lxb.compareAndSet(false, true)) {
                LD = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.HD.Lxb(new Lxb(), kqm.Lxb());
            }
        }

        public void LD() {
            com.bytedance.sdk.component.utils.HD.Lxb(this);
        }

        @Override // com.bytedance.sdk.component.utils.HD.Lxb
        public void Lxb(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - LD >= 2000 && i != 0) {
                JVA.lk();
                JVA.lk(sLN.Lxb(kqm.Lxb()));
                LD();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean LD(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static void Lxb(String str) {
        AtomicBoolean atomicBoolean = LD;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.IeN.OY(kqm.Lxb())) {
                atomicBoolean.set(false);
            } else {
                Lxb.Lxb();
                lk(str);
            }
        }
    }
}
