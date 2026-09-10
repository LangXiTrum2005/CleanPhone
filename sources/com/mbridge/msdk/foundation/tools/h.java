package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34125a = "com.mbridge.msdk.foundation.tools.h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f34126b;

    private static boolean a(Context context) {
        return context != null && Settings.canDrawOverlays(context);
    }

    public static int b(Context context) {
        if (f34126b == 0) {
            f34126b = a(context) ? 1 : -1;
        }
        return f34126b;
    }

    public static boolean a(CampaignEx campaignEx, Context context, View view, int i10) {
        com.mbridge.msdk.foundation.entity.l lVarA = a(view, i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        a(arrayList, lVarA);
        return a(lVarA, arrayList);
    }

    public static boolean b(CampaignEx campaignEx, Context context, View view, int i10) {
        com.mbridge.msdk.foundation.entity.l lVarA = a(view, i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        return a(lVarA, arrayList);
    }

    public static boolean a(List<CampaignEx> list, Context context, View view, int i10) {
        com.mbridge.msdk.foundation.entity.l lVarA = a(view, i10);
        a(list, lVarA);
        return a(lVarA, list);
    }

    private static boolean a(com.mbridge.msdk.foundation.entity.l lVar, List<CampaignEx> list) {
        return lVar.a() || list == null || list.isEmpty() || list.get(0).getLocalCheckShow() == 0;
    }

    public static void a(List<CampaignEx> list, com.mbridge.msdk.foundation.entity.l lVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB;
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("per", Integer.valueOf(b(com.mbridge.msdk.foundation.controller.c.n().d())));
            eVar.a("viewStatus", Integer.valueOf(lVar.b()));
            eVar.a("showe", Integer.valueOf(!lVar.a() ? 1 : 0));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = null;
            try {
                cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(list.get(0).getCurrentLocalRid());
                if (cVarB == null) {
                    try {
                        cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        try {
                            com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(list.get(0).getCurrentLocalRid(), cVar);
                            cVarB = cVar;
                        } catch (Exception e10) {
                            e = e10;
                            q0.b(f34125a, e.getMessage());
                            cVarB = cVar;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        cVar2 = cVarB;
                        cVar = cVar2;
                        q0.b(f34125a, e.getMessage());
                        cVarB = cVar;
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_show_env", cVarB);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000130", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000131", eVar);
                    }
                }
                cVarB.a((CampaignEx) null);
                cVarB.b(list);
                cVarB.a("m_show_env", eVar);
            } catch (Exception e12) {
                e = e12;
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_show_env", cVarB);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000130", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000131", eVar);
        } catch (Throwable th2) {
            q0.b(f34125a, th2.getMessage());
        }
    }

    public static com.mbridge.msdk.foundation.entity.l a(View view, int i10) {
        com.mbridge.msdk.foundation.entity.l lVar = new com.mbridge.msdk.foundation.entity.l();
        if (view != null) {
            lVar.a(e1.a(view, i10) ? 1 : 0);
        }
        return lVar;
    }
}
