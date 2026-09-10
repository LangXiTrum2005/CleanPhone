package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class bjy implements com.bytedance.sdk.openadsdk.oem.qdl {
    private static boolean lnr;
    private static final bjy qdl = new bjy();
    private static com.bytedance.sdk.openadsdk.component.reward.qdl.qdl ud;

    public static void qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.core.model.koa koaVarGjm = qdlVar.ud.gjm();
        if (koaVarGjm == null || !koaVarGjm.wd()) {
            return;
        }
        ud = qdlVar;
        IPMiBroadcastReceiver iPMiBroadcastReceiverQdl = IPMiBroadcastReceiver.qdl(qdlVar.om);
        if (iPMiBroadcastReceiverQdl != null) {
            iPMiBroadcastReceiverQdl.qdl(qdl);
        }
    }

    public static void ud() {
        lnr = true;
    }

    public static void qdl() {
        if (ud == null) {
            return;
        }
        ud = null;
        IPMiBroadcastReceiver iPMiBroadcastReceiverQdl = IPMiBroadcastReceiver.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl());
        if (iPMiBroadcastReceiverQdl != null) {
            iPMiBroadcastReceiverQdl.qdl();
        }
        lnr = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.qdl
    public void qdl(String str, final int i2) {
        com.bytedance.sdk.openadsdk.core.model.mo moVarFhs;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = ud;
        if (qdlVar == null || (moVarFhs = qdlVar.ud.fhs()) == null) {
            return;
        }
        String strLnr = moVarFhs.lnr();
        if (TextUtils.isEmpty(strLnr) || !strLnr.equals(str)) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.bjy.1
            @Override // java.lang.Runnable
            public void run() {
                int i3;
                if (bjy.ud == null || (i3 = i2) <= 0 || i3 > 5) {
                    return;
                }
                boolean z2 = true;
                boolean z3 = i3 == 1;
                if (bjy.lnr) {
                    bjy.ud.wc.car();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl("click", bjy.ud.ud, new com.bytedance.sdk.openadsdk.core.model.fs.qdl().qdl(), bjy.ud.mzz, true, (Map<String, Object>) map, 1);
                } else {
                    z2 = z3;
                }
                if (z2) {
                    bjy.qdl();
                }
            }
        });
    }
}
