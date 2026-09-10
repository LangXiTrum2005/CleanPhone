package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class vr implements com.bytedance.sdk.openadsdk.oem.ri {
    private static boolean ik;
    private static com.bytedance.sdk.openadsdk.component.reward.ri.ri lr;
    private static final vr ri = new vr();

    public static void lr() {
        ik = true;
    }

    public static void ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        com.bytedance.sdk.openadsdk.core.model.zf zfVarXz = riVar.lr.xz();
        if (zfVarXz != null) {
            if (zfVarXz.xha() || zfVarXz.mj()) {
                lr = riVar;
                IPBroadcastReceiver iPBroadcastReceiverRi = IPBroadcastReceiver.ri(riVar.srn, riVar.lr);
                if (iPBroadcastReceiverRi != null) {
                    iPBroadcastReceiverRi.ri(ri);
                }
            }
        }
    }

    public static void ri() {
        if (lr == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverRi = IPBroadcastReceiver.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), lr.lr);
        if (iPBroadcastReceiverRi != null) {
            iPBroadcastReceiverRi.ri();
        }
        lr = null;
        ik = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.ri
    public void ri(String str, final int i) {
        com.bytedance.sdk.openadsdk.core.model.di diVarTyz;
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = lr;
        if (riVar == null || (diVarTyz = riVar.lr.tyz()) == null) {
            return;
        }
        String strIk = diVarTyz.ik();
        if (TextUtils.isEmpty(strIk) || !strIk.equals(str)) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.vr.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                if (vr.lr == null || (i2 = i) <= 0 || i2 > 5) {
                    return;
                }
                boolean z = true;
                boolean z2 = i2 == 1;
                if (vr.ik) {
                    vr.lr.qd.gcp();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.ka.ik.ri("click", vr.lr.lr, new com.bytedance.sdk.openadsdk.core.model.co.ri().ri(), vr.lr.fi, true, (Map<String, Object>) map, 1);
                } else {
                    z = z2;
                }
                if (z) {
                    vr.ri();
                }
            }
        });
    }
}
