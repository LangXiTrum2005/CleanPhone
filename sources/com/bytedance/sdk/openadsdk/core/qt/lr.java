package com.bytedance.sdk.openadsdk.core.qt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.jbs.co;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.ironsource.mediationsdk.metadata.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static final Long ri = 0L;
    private AtomicBoolean lr;

    public static final class ri {
        static final lr ri = new lr();
    }

    public static lr ri() {
        return ri.ri;
    }

    private void slm() {
        if (ri().fi() || this.lr.getAndSet(true)) {
            return;
        }
        ApmHelper.initAPM();
        fi.ri();
        co.lr();
        com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().lr();
    }

    public long aw() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "allow_req_time", ri.longValue());
    }

    public void bgr() {
        ri().lr();
    }

    public boolean co() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "user_compliance_status", -1) == 3;
    }

    public boolean di() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "app_reg", -1) == 1;
    }

    public boolean fi() {
        return (!ka() && di() && jbs()) ? false : true;
    }

    public int ik() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "app_reg", -1);
    }

    public boolean jbs() {
        int iRi = com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "user_compliance_status", -1);
        return iRi == 1 || iRi == 2;
    }

    public boolean ka() {
        long jAw = aw();
        return co() && jAw != 0 && System.currentTimeMillis() < jAw;
    }

    public void lr() {
        String strGcp = sf.lr().gcp();
        if (TextUtils.isEmpty(strGcp)) {
            return;
        }
        if (TextUtils.equals(a.g, strGcp)) {
            ri(1);
        } else if (TextUtils.equals("false", strGcp)) {
            ri(0);
        }
    }

    public int mj() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "user_compliance_status", -1);
    }

    public boolean qt() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "user_compliance_status", -1) == -1;
    }

    public boolean sf() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "user_compliance_status", -1) == 1;
    }

    public void vr() {
        slm();
    }

    public boolean xha() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "app_reg", -1) == -1;
    }

    private lr() {
        this.lr = new AtomicBoolean(false);
    }

    public void ri(int i) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "app_reg", Integer.valueOf(i));
    }

    public void ri(long j) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "allow_req_time", Long.valueOf(j));
    }

    public void ri(String str) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "user_compliance_status_reason", str);
    }

    public void ri(final ka kaVar, final boolean z) {
        ik ikVar = new ik();
        ikVar.ri(new ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.lr.1
            @Override // com.bytedance.sdk.openadsdk.core.qt.ka
            public void ri(boolean z2) {
                if (!z2) {
                    kaVar.ri(false);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.qt.ri riVar = new com.bytedance.sdk.openadsdk.core.qt.ri(z);
                riVar.ri(new ka() { // from class: com.bytedance.sdk.openadsdk.core.qt.lr.1.1
                    @Override // com.bytedance.sdk.openadsdk.core.qt.ka
                    public void ri(boolean z3) {
                        kaVar.ri(z3);
                    }
                });
                riVar.ri();
            }
        });
        ikVar.ri();
    }

    public void lr(int i) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_compliance_file", "user_compliance_status", Integer.valueOf(i));
    }
}
