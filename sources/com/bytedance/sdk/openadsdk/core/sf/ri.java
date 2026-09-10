package com.bytedance.sdk.openadsdk.core.sf;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class ri {
    private volatile boolean ik = true;
    private volatile boolean ka = false;
    private volatile boolean lr;
    private PglSSManager ri;

    public ri() {
        ri();
    }

    private void jbs() {
        if (this.ri == null) {
            this.ri = PglSSManager.getInstance();
        }
    }

    private boolean mj() {
        if (!this.lr && this.ik) {
            ri();
        }
        return this.lr;
    }

    private Class qt() {
        Class<PglSSManager> cls;
        try {
            cls = PglSSManager.class;
            String str = PglSSManager.REPORT_SCENE_ADSHOW;
            try {
                this.ik = true;
                return cls;
            } catch (Throwable unused) {
                this.ik = false;
                return cls;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
    }

    public long di() {
        if (!mj()) {
            return 0L;
        }
        jbs();
        PglSSManager pglSSManager = this.ri;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public String fi() {
        if (!mj()) {
            return "";
        }
        jbs();
        PglSSManager pglSSManager = this.ri;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public void ik() {
        if (mj()) {
            jbs();
            if (this.ri != null) {
                vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, nr.ka().uq());
                            ri.this.ri.setCustomInfo(map);
                        } catch (Throwable th) {
                            ac.ik("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public String ka() {
        if (!mj()) {
            return "";
        }
        jbs();
        PglSSManager pglSSManager = this.ri;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public boolean lr() {
        return this.lr;
    }

    public int xha() {
        if (this.ik) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public void lr(String str) {
        if (mj()) {
            jbs();
            PglSSManager pglSSManager = this.ri;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public synchronized void ri() {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return;
        }
        if (!this.lr) {
            try {
                Context contextRi = nr.ri();
                String strKa = qt.lr().ka();
                if (TextUtils.isEmpty(strKa)) {
                    strKa = qt.ri("app_id", Long.MAX_VALUE);
                }
                if (TextUtils.isEmpty(strKa)) {
                    return;
                }
                String strRi = aw.ri(contextRi);
                String strLr = com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr();
                PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strKa).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                String strLr2 = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strLr2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strLr2);
                }
                Set<String> setZv = sf.lr().zv();
                if (setZv != null && !setZv.isEmpty()) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setZv);
                }
                String strNr = ig.nr();
                if (!TextUtils.isEmpty(strNr)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strNr);
                }
                map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, sf.lr().tpb());
                String strRi2 = fi.ri(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                if (!TextUtils.isEmpty(strRi2)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strRi2);
                }
                pglSSConfigBuild.setCustomInfo(map);
                pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.1
                    @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                    public void reportSoftDecData(final String str, final String str2) {
                        ka.ri(str, false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.1.1
                            @Override // com.bytedance.sdk.openadsdk.slm.lr
                            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri(str).lr(str2);
                            }
                        });
                    }
                });
                PglSSManager.init(contextRi, pglSSConfigBuild, null, null, strRi, strLr);
                jbs();
                this.lr = true;
            } catch (Throwable unused) {
                qt();
                this.lr = false;
            }
            try {
                if (this.ik) {
                    ik(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                ac.ik("mssdk", th.getMessage());
            }
        }
    }

    private void ik(final String str) {
        if (this.ka || TextUtils.isEmpty(str)) {
            return;
        }
        nr.fi().ri(new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("secsdk_init_error").lr(str);
            }
        }, false);
        this.ka = true;
    }

    public void ri(String str) {
        if (mj()) {
            jbs();
            PglSSManager pglSSManager = this.ri;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void ri(final Map<String, Object> map) {
        if (mj()) {
            jbs();
            if (this.ri != null) {
                vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ri.this.ri.setCustomInfo(map);
                        } catch (Throwable th) {
                            ac.ik("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void ri(String str, Map<String, Object> map) {
        if (mj()) {
            jbs();
            PglSSManager pglSSManager = this.ri;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void ri(MotionEvent motionEvent) {
        if (lr()) {
            jbs();
            PglSSManager pglSSManager = this.ri;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> ri(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!mj() || (featureHash = this.ri.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
