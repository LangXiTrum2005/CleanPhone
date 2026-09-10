package com.mbridge.msdk.reward.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.videocommon.setting.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f35543a;

    private a() {
    }

    public static a a() {
        if (f35543a == null) {
            synchronized (a.class) {
                try {
                    if (f35543a == null) {
                        f35543a = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f35543a;
    }

    private void b(c cVar) {
        List<CampaignEx> listO;
        if (cVar == null) {
            return;
        }
        try {
            int iG = cVar.g();
            String strB = cVar.B();
            if (TextUtils.isEmpty(strB) && (listO = cVar.o()) != null && listO.size() > 0 && listO.get(0) != null) {
                strB = listO.get(0).getCampaignUnitId();
                iG = listO.get(0).getAdType();
                cVar.a(iG);
                cVar.n(strB);
            }
            com.mbridge.msdk.videocommon.setting.c cVarA = b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), strB, iG == 287);
            if (cVarA != null) {
                cVar.m(cVarA.x());
                cVar.o(cVarA.a());
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, c cVar) {
        try {
            a(cVar);
            b(cVar);
            d.b().b(cVar);
            d.b().b(str, cVar, null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(c cVar) {
        if (cVar == null) {
            try {
                cVar = new c();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.a aVarC = b.b().c();
        if (aVarC != null) {
            cVar.l(aVarC.a());
            cVar.k(aVarC.f());
        }
    }
}
