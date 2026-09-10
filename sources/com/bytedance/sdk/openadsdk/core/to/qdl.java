package com.bytedance.sdk.openadsdk.core.to;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.mml.mml;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class qdl {
    private volatile boolean lnr = true;
    private volatile boolean mml = false;
    private PglSSManager qdl;
    private volatile boolean ud;

    public qdl() {
        qdl();
    }

    private boolean jpc() {
        if (!this.ud && this.lnr) {
            qdl();
        }
        return this.ud;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private Class to() {
        try {
            this.lnr = true;
            return PglSSManager.class;
        } catch (Throwable unused) {
            this.lnr = false;
            return PglSSManager.class;
        }
    }

    private void tvp() {
        if (this.qdl == null) {
            this.qdl = PglSSManager.getInstance();
        }
    }

    public void lnr() {
        if (jpc()) {
            tvp();
            if (this.qdl != null) {
                rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.to.qdl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, yt.mml().bch());
                            qdl.this.qdl.setCustomInfo(map);
                        } catch (Throwable th) {
                            aaj.lnr("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public String mml() {
        if (!jpc()) {
            return "";
        }
        tvp();
        PglSSManager pglSSManager = this.qdl;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public long mo() {
        if (!jpc()) {
            return 0L;
        }
        tvp();
        PglSSManager pglSSManager = this.qdl;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public String mzz() {
        if (!jpc()) {
            return "";
        }
        tvp();
        PglSSManager pglSSManager = this.qdl;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public boolean ud() {
        return this.ud;
    }

    public int wd() {
        if (this.lnr) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public synchronized void qdl() {
        try {
            if (!this.ud) {
                try {
                    Context contextQdl = yt.qdl();
                    String strMml = tvp.ud().mml();
                    if (TextUtils.isEmpty(strMml)) {
                        strMml = tvp.qdl("app_id", Long.MAX_VALUE);
                    }
                    if (TextUtils.isEmpty(strMml)) {
                        return;
                    }
                    String strQdl = fs.qdl(contextQdl);
                    String strUd = com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud();
                    PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strMml).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                    String strUd2 = mml.ud("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                    HashMap map = new HashMap();
                    if (!TextUtils.isEmpty(strUd2)) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strUd2);
                    }
                    Set<String> setSyy = rq.lnr().syy();
                    if (setSyy != null && !setSyy.isEmpty()) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setSyy);
                    }
                    String strJl = gy.jl();
                    if (!TextUtils.isEmpty(strJl)) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strJl);
                    }
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, rq.lnr().ca());
                    String strQdl2 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                    if (!TextUtils.isEmpty(strQdl2)) {
                        map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strQdl2);
                    }
                    pglSSConfigBuild.setCustomInfo(map);
                    pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.to.qdl.1
                        @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                        public void reportSoftDecData(final String str, final String str2) {
                            com.bytedance.sdk.openadsdk.bjy.lnr.qdl(str, false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.to.qdl.1.1
                                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl(str).ud(str2);
                                }
                            });
                        }
                    });
                    PglSSManager.init(contextQdl, pglSSConfigBuild, null, null, strQdl, strUd);
                    tvp();
                    this.ud = true;
                } catch (Throwable unused) {
                    to();
                    this.ud = false;
                }
                try {
                    if (this.lnr) {
                        lnr(PglSSManager.getLoadError());
                    }
                } catch (Throwable th) {
                    aaj.lnr("mssdk", th.getMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void ud(String str) {
        if (jpc()) {
            tvp();
            PglSSManager pglSSManager = this.qdl;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    private void lnr(final String str) {
        if (this.mml || TextUtils.isEmpty(str)) {
            return;
        }
        yt.mzz().qdl(new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.core.to.qdl.4
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("secsdk_init_error").ud(str);
            }
        }, false);
        this.mml = true;
    }

    public void qdl(String str) {
        if (jpc()) {
            tvp();
            PglSSManager pglSSManager = this.qdl;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void qdl(final Map<String, Object> map) {
        if (jpc()) {
            tvp();
            if (this.qdl != null) {
                rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.to.qdl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            qdl.this.qdl.setCustomInfo(map);
                        } catch (Throwable th) {
                            aaj.lnr("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void qdl(String str, Map<String, Object> map) {
        if (jpc()) {
            tvp();
            PglSSManager pglSSManager = this.qdl;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void qdl(MotionEvent motionEvent) {
        if (ud()) {
            tvp();
            PglSSManager pglSSManager = this.qdl;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> qdl(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!jpc() || (featureHash = this.qdl.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
