package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(O6.X0, g.d());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SettingRequestDiff", e10.getMessage());
            }
        }
    }
}
