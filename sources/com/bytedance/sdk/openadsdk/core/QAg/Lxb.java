package com.bytedance.sdk.openadsdk.core.QAg;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.sLN;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class Lxb {
    private volatile boolean LD;
    private PglSSManager Lxb;
    private volatile boolean lk = true;
    private volatile boolean ZU = false;

    public Lxb() {
        Lxb();
    }

    private boolean OY() {
        if (!this.LD && this.lk) {
            Lxb();
        }
        return this.LD;
    }

    private void QAg() {
        if (this.Lxb == null) {
            this.Lxb = PglSSManager.getInstance();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private Class nBu() {
        try {
            this.lk = true;
        } catch (Throwable unused) {
            this.lk = false;
        }
        return PglSSManager.class;
    }

    public String JXs() {
        if (!OY()) {
            return "";
        }
        QAg();
        PglSSManager pglSSManager = this.Lxb;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public boolean LD() {
        return this.LD;
    }

    public String ZU() {
        if (!OY()) {
            return "";
        }
        QAg();
        PglSSManager pglSSManager = this.Lxb;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public int ebl() {
        if (this.lk) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public long lc() {
        if (!OY()) {
            return 0L;
        }
        QAg();
        PglSSManager pglSSManager = this.Lxb;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public void lk() {
        if (OY()) {
            QAg();
            if (this.Lxb != null) {
                STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QAg.Lxb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, kqm.ZU().eXY());
                            Lxb.this.Lxb.setCustomInfo(map);
                        } catch (Throwable th) {
                            Sfi.LD("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void LD(String str) {
        if (OY()) {
            QAg();
            PglSSManager pglSSManager = this.Lxb;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public synchronized void Lxb() {
        try {
            if (!this.LD) {
                try {
                    Context contextLxb = kqm.Lxb();
                    String strZU = QAg.LD().ZU();
                    if (TextUtils.isEmpty(strZU)) {
                        strZU = QAg.Lxb("app_id", Long.MAX_VALUE);
                    }
                    if (TextUtils.isEmpty(strZU)) {
                        return;
                    }
                    PglSSManager.init(contextLxb, PglSSConfig.builder().setAppId(strZU).setOVRegionType(0).setAdsdkVersion(BuildConfig.VERSION_NAME).build(), null, null, sLN.Lxb(contextLxb), com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD());
                    QAg();
                    this.LD = true;
                } catch (Throwable unused) {
                    nBu();
                    this.LD = false;
                }
                try {
                    if (this.lk) {
                        lk(PglSSManager.getLoadError());
                    }
                } catch (Throwable th) {
                    Sfi.LD("mssdk", th.getMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void lk(final String str) {
        if (this.ZU || TextUtils.isEmpty(str)) {
            return;
        }
        kqm.JXs().Lxb(new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.QAg.Lxb.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return ZU.LD().Lxb("secsdk_init_error").LD(str);
            }
        }, false);
        this.ZU = true;
    }

    public void Lxb(String str) {
        if (OY()) {
            QAg();
            PglSSManager pglSSManager = this.Lxb;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void Lxb(String str, Map<String, Object> map) {
        if (OY()) {
            QAg();
            PglSSManager pglSSManager = this.Lxb;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void Lxb(MotionEvent motionEvent) {
        if (LD()) {
            QAg();
            PglSSManager pglSSManager = this.Lxb;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> Lxb(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!OY() || (featureHash = this.Lxb.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
