package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class CampaignUnit extends b implements Serializable, NoProGuard {
    private static final String TAG = "CampaignUnit";

    @Override // com.mbridge.msdk.foundation.entity.b
    public String assembCParams() {
        String str;
        String strValueOf;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String strD = com.mbridge.msdk.foundation.tools.g.d();
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String strR = m0.r(contextD);
            String strQ = m0.q(contextD);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                strValueOf = String.valueOf(m0.s(contextD));
                str = m0.n(contextD) + "x" + m0.m(contextD);
            } else {
                str = "";
                strValueOf = str;
            }
            StringBuffer stringBuffer2 = this.cParams;
            stringBuffer2.append(getAdType());
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty("1"));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Build.VERSION.RELEASE));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(MBConfiguration.SDK_VERSION));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(m0.o()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(str));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Integer.valueOf(m0.G(com.mbridge.msdk.foundation.controller.c.n().d()))));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(m0.p(com.mbridge.msdk.foundation.controller.c.n().d())));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(strValueOf));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(strQ));
            stringBuffer2.append(nullToEmpty(strR));
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(strD));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(m0.t()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append("");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(com.mbridge.msdk.foundation.same.a.V + "," + com.mbridge.msdk.foundation.same.a.f33721g));
            stringBuffer2.append("|");
            stringBuffer2.append(m0.j());
            stringBuffer2.append("|");
            this.cParams = stringBuffer2;
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, th2.getMessage(), th2);
            }
        }
        return this.cParams.toString();
    }
}
