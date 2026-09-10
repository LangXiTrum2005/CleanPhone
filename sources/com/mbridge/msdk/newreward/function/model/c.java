package com.mbridge.msdk.newreward.function.model;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1706a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.command.f.values().length];
            f1706a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_RES_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_V3_RETRY_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_V3_RETRY_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_V3_CAMPAIGN_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_SHOW_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_DOWNLOAD_END.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.METRICS_KEY_M_CANDIDATE_DATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.METRICS_KEY_M_CANDIDATE_DB.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_CHECK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_IS_READY_CHECK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_LOAD_OVERWRITE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1706a[com.mbridge.msdk.newreward.function.command.f.REPORT_SHOW_FAIL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0353  */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(com.mbridge.msdk.newreward.adapter.e eVar, Map map, com.mbridge.msdk.newreward.function.command.f fVar) {
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        ArrayList<Integer> rsIgnoreCheckRule;
        boolean zContains;
        boolean zContains2;
        boolean zContains3;
        com.mbridge.msdk.foundation.error.b bVar;
        int i;
        int iV;
        List<CampaignEx> listF;
        if (eVar == null) {
            return;
        }
        try {
            String str = "";
            if (eVar.g() != null && eVar.g().a() != null) {
                str = eVar.g().a().v() + "";
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(eVar.A(), str);
            if (cVarA == null) {
                cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(eVar.A());
                if (cVarA != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(eVar.A() + str, cVarA);
                } else {
                    cVarA = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    cVarA.h(eVar.A());
                    cVarA.a(eVar.d());
                }
            }
            cVarA.m(eVar.R());
            cVarA.f(eVar.f());
            cVarA.g(eVar.b0() ? "1" : "0");
            if (eVar.g() != null) {
                cVarA.b(eVar.g().b());
            }
            if (eVar.O() != null) {
                com.mbridge.msdk.videocommon.setting.a aVarB = eVar.O().b();
                if (aVarB != null) {
                    cVarA.k(aVarB.a());
                    cVarA.j(aVarB.f());
                }
                com.mbridge.msdk.videocommon.setting.c cVarC = eVar.O().c();
                if (cVarC != null) {
                    cVarA.l(cVarC.x());
                    cVarA.n(cVarC.a());
                }
            }
            if (map == null || !map.containsKey("metrics_data")) {
                obj = null;
                obj2 = null;
            } else {
                obj = map.get("metrics_data");
                obj2 = map.get("resource_type");
            }
            boolean z3 = 0;
            iIntValue = 0;
            int iIntValue = 0;
            iIntValue = 0;
            int iIntValue2 = 0;
            filterCallBackState = 0;
            int filterCallBackState = 0;
            int i2 = 0;
            switch (a.f1706a[fVar.ordinal()]) {
                case 1:
                    cVarA.i("2000125");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar2.a(map);
                    cVarA.a("2000125", eVar2);
                    break;
                case 2:
                    cVarA.i("2000126");
                    if (obj instanceof com.mbridge.msdk.newreward.function.core.campaign.b) {
                        List<CampaignEx> listF2 = ((com.mbridge.msdk.newreward.function.core.campaign.b) obj).f();
                        cVarA.b(listF2);
                        if (listF2 == null || listF2.isEmpty() || (rsIgnoreCheckRule = listF2.get(0).getRsIgnoreCheckRule()) == null) {
                            z = 0;
                            z2 = 0;
                        } else {
                            zContains = rsIgnoreCheckRule.contains(0);
                            zContains2 = rsIgnoreCheckRule.contains(1);
                            zContains3 = rsIgnoreCheckRule.contains(2);
                        }
                    } else {
                        z = 0;
                        z2 = 0;
                    }
                    if (map != null) {
                        z = zContains3;
                        z3 = zContains;
                        z2 = zContains2;
                        map.remove("metrics_data");
                    }
                    z = zContains3;
                    z3 = zContains;
                    z2 = zContains2;
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar3 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar3.a(map);
                    eVar3.a("ignore_video", Integer.valueOf(!z3));
                    eVar3.a("ignore_template", Integer.valueOf(!z2));
                    eVar3.a("ignore_ec", Integer.valueOf(!z));
                    cVarA.a("2000126", eVar3);
                    break;
                case 3:
                    cVarA.i("2000126");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar4 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar4.a(map);
                    cVarA.a("2000126", eVar4);
                    break;
                case 4:
                    cVarA.i("m_v3_req_retry_start");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar5 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar5.a(map);
                    cVarA.a("m_v3_req_retry_start", eVar5);
                    break;
                case 5:
                    cVarA.i("m_v3_req_retry_end");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar6 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar6.a(map);
                    cVarA.a("m_v3_req_retry_end", eVar6);
                    break;
                case 6:
                    cVarA.i("2000127");
                    if (obj instanceof com.mbridge.msdk.newreward.function.core.campaign.b) {
                        cVarA.b(((com.mbridge.msdk.newreward.function.core.campaign.b) obj).f());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar7 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar7.a(map);
                    cVarA.a("2000127", eVar7);
                    break;
                case 7:
                    cVarA.i("2000048");
                    if (obj instanceof com.mbridge.msdk.newreward.function.core.campaign.b) {
                        cVarA.b(((com.mbridge.msdk.newreward.function.core.campaign.b) obj).f());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar8 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar8.a(map);
                    cVarA.a("2000048", eVar8);
                    break;
                case 8:
                    cVarA.i("2000047");
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar9 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar9.a(map);
                    cVarA.a("2000047", eVar9);
                    if ((obj instanceof com.mbridge.msdk.foundation.error.b) && (bVar = (com.mbridge.msdk.foundation.error.b) obj) != null) {
                        cVarA.a(bVar);
                    }
                    break;
                case 9:
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar10 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    if (eVar.g() == null || eVar.g().a() == null) {
                        i = 0;
                        iV = 0;
                    } else {
                        com.mbridge.msdk.newreward.function.core.campaign.b bVarA = eVar.g().a();
                        iV = bVarA.v();
                        int iW = bVarA.w();
                        if (bVarA.f() != null && !bVarA.f().isEmpty()) {
                            filterCallBackState = bVarA.f().get(0).getFilterCallBackState();
                        }
                        i = filterCallBackState;
                        i2 = iW;
                    }
                    eVar10.a("m_load_check", Integer.valueOf(eVar.d0() ? 1 : 0));
                    eVar10.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(i));
                    eVar10.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV));
                    eVar10.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(i2));
                    cVarA.a("2000128", eVar10);
                    cVarA.i("2000128");
                    break;
                case 10:
                    cVarA.i("m_download_start");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar11 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar11.a(map);
                    if (map != null && (obj2 instanceof Integer)) {
                        iIntValue2 = ((Integer) obj2).intValue();
                    }
                    cVarA.a("m_download_start", eVar11, iIntValue2);
                    cVarA.e(iIntValue2);
                    break;
                case 11:
                    cVarA.i("m_download_end");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar12 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar12.a(map);
                    if (map != null && (obj2 instanceof Integer)) {
                        iIntValue = ((Integer) obj2).intValue();
                    }
                    cVarA.a("m_download_end", eVar12, iIntValue);
                    cVarA.e(iIntValue);
                    break;
                case 12:
                    cVarA.i("m_candidate_data");
                    cVarA.a("m_candidate_data", (com.mbridge.msdk.foundation.same.report.metrics.e) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.metrics.e()));
                    break;
                case 13:
                    cVarA.i("m_candidate_db");
                    cVarA.a("m_candidate_db", (com.mbridge.msdk.foundation.same.report.metrics.e) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.metrics.e()));
                    break;
                case 14:
                    cVarA.i("m_load_check");
                    com.mbridge.msdk.newreward.function.core.campaign.b bVar2 = (map == null || !map.containsKey(MBInterstitialActivity.INTENT_CAMAPIGN)) ? null : (com.mbridge.msdk.newreward.function.core.campaign.b) map.remove(MBInterstitialActivity.INTENT_CAMAPIGN);
                    if (bVar2 != null && (listF = bVar2.f()) != null) {
                        cVarA.b(listF);
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar13 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    if (map != null) {
                        eVar13.a(map);
                    }
                    cVarA.a("m_load_check", eVar13);
                    break;
                case 15:
                    cVarA.i("m_offer_ready");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar14 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    if (map != null) {
                        eVar14.a(map);
                    }
                    cVarA.a("m_offer_ready", eVar14);
                    break;
                case 16:
                    cVarA.i("m_load_overwrite");
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar15 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    if (map != null) {
                        eVar15.a(map);
                    }
                    cVarA.a("m_load_overwrite", eVar15);
                    break;
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVarA);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVarA.s(), cVarA, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(com.mbridge.msdk.newreward.adapter.e eVar, Map<String, String> map, String str) {
        int iV;
        int iW;
        com.mbridge.msdk.newreward.function.core.campaign.b bVarA;
        try {
            String str2 = "";
            if (eVar.g() != null && eVar.g().a() != null) {
                str2 = eVar.g().a().v() + "";
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(eVar.A(), str2);
            if (cVarA == null) {
                cVarA = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVarA.h(eVar.A());
                cVarA.a(eVar.d());
            }
            cVarA.m(eVar.R());
            cVarA.f(eVar.f());
            cVarA.g(eVar.b0() ? "1" : "0");
            if (eVar.g() != null) {
                cVarA.b(eVar.g().b());
            }
            if (eVar.O() != null) {
                com.mbridge.msdk.videocommon.setting.a aVarB = eVar.O().b();
                if (aVarB != null) {
                    cVarA.k(aVarB.a());
                    cVarA.j(aVarB.f());
                }
                com.mbridge.msdk.videocommon.setting.c cVarC = eVar.O().c();
                if (cVarC != null) {
                    cVarA.l(cVarC.x());
                    cVarA.n(cVarC.a());
                }
            }
            cVarA.i(str);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            if (!TextUtils.isEmpty(str) && str.equals("2000130")) {
                int filterCallBackState = 0;
                if (eVar.g() == null || eVar.g().a() == null || (bVarA = eVar.g().a()) == null) {
                    iV = 0;
                    iW = 0;
                } else {
                    iV = bVarA.v();
                    iW = bVarA.w();
                    if (bVarA.f() != null && !bVarA.f().isEmpty()) {
                        filterCallBackState = bVarA.f().get(0).getFilterCallBackState();
                    }
                }
                eVar2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(iV));
                eVar2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(iW));
                eVar2.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(filterCallBackState));
            }
            eVar2.a(map);
            cVarA.a(str, eVar2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVarA);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVarA.s(), cVarA, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(com.mbridge.msdk.newreward.adapter.e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            String str = "";
            if (eVar.g() != null && eVar.g().a() != null) {
                str = eVar.g().a().v() + "";
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(eVar.A(), str);
            if (cVarA == null) {
                cVarA = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVarA.h(eVar.A());
                cVarA.a(eVar.d());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(eVar.A() + str, cVarA);
            }
            cVarA.m(eVar.R());
            cVarA.f(eVar.f());
            cVarA.g(eVar.b0() ? "1" : "0");
            com.mbridge.msdk.videocommon.setting.a aVarB = eVar.O().b();
            if (aVarB != null) {
                cVarA.k(aVarB.a());
                cVarA.j(aVarB.f());
            }
            com.mbridge.msdk.videocommon.setting.c cVarC = eVar.O().c();
            if (cVarC != null) {
                cVarA.l(cVarC.x());
                cVarA.n(cVarC.a());
            }
            cVarA.i("2000123");
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVarA);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVarA.s(), cVarA, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(com.mbridge.msdk.newreward.controller.b bVar, Map map, com.mbridge.msdk.newreward.function.command.f fVar) {
        if (bVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.h(bVar.a());
            cVar.a(bVar.f());
            cVar.m(bVar.e());
            cVar.g(bVar.g() ? "1" : "0");
            if (bVar.c() != null) {
                com.mbridge.msdk.videocommon.setting.a aVarB = bVar.c().b();
                if (aVarB != null) {
                    cVar.k(aVarB.a());
                    cVar.j(aVarB.f());
                }
                com.mbridge.msdk.videocommon.setting.c cVarC = bVar.c().c();
                if (cVarC != null) {
                    cVar.l(cVarC.x());
                    cVar.n(cVarC.a());
                }
            }
            int i = a.f1706a[fVar.ordinal()];
            if (i == 9) {
                cVar.i("2000128");
            } else if (i == 15) {
                cVar.i("m_offer_ready");
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (map != null) {
                    eVar.a(map);
                }
                cVar.a("m_offer_ready", eVar);
            } else if (i == 17) {
                cVar.i("2000131");
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a(map);
                cVar.a("2000131", eVar2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b(cVar.s(), cVar, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
