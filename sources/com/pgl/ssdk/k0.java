package com.pgl.ssdk;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: loaded from: classes2.dex */
public class k0 extends m0 {
    private Context p;

    public k0(Context context, String str) {
        super(context, str);
        this.p = context;
        this.f2444a = l0.a() + b();
    }

    @Override // com.pgl.ssdk.m0
    public boolean a(int i, byte[] bArr) {
        if (i == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    if (((Integer) com.pgl.ssdk.ces.a.meta(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, null, bArr)).intValue() == 0) {
                        com.pgl.ssdk.ces.b.f2427a = true;
                    } else {
                        com.pgl.ssdk.ces.b.f2427a = false;
                    }
                }
            } catch (Throwable unused) {
                com.pgl.ssdk.ces.b.f2427a = false;
            }
        }
        return true;
    }

    public String b() {
        StringBuilder sbQ = DM.q(AbstractC3888ke0.i("?os=0&ver=6.5.0.0.overseas-rc.1&mode=1&app_ver=", String.valueOf(z.g(this.p))), "&region=");
        sbQ.append(b0.a());
        StringBuilder sbQ2 = DM.q(sbQ.toString(), "&did=");
        sbQ2.append(com.pgl.ssdk.ces.b.e());
        StringBuilder sbQ3 = DM.q(sbQ2.toString(), "&aid=");
        sbQ3.append(com.pgl.ssdk.ces.b.d());
        return sbQ3.toString();
    }
}
