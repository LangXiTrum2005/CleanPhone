package com.mbridge.msdk.newreward.function.candidate;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.adapter.e;
import com.mbridge.msdk.newreward.function.command.c;
import com.mbridge.msdk.newreward.function.command.f;
import com.mbridge.msdk.videocommon.setting.b;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f1615a;
    private com.mbridge.msdk.newreward.function.cache.c b;

    public a(String str, boolean z, c cVar) {
        this.f1615a = cVar;
        try {
            com.mbridge.msdk.newreward.function.cache.c cVarB = com.mbridge.msdk.newreward.function.cache.controller.a.a().b(str, b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), str, z).B());
            this.b = cVarB;
            cVarB.a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<com.mbridge.msdk.newreward.function.core.campaign.b> b(List<com.mbridge.msdk.newreward.function.core.campaign.b> list, com.mbridge.msdk.newreward.function.cache.b bVar) {
        List<com.mbridge.msdk.newreward.function.core.campaign.a> listG;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.newreward.function.core.campaign.b bVar2 = list.get(i);
            if (bVar2 != null && (listG = bVar2.g()) != null && listG.size() != 0) {
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    private List<com.mbridge.msdk.newreward.function.core.campaign.b> c(List<com.mbridge.msdk.newreward.function.core.campaign.b> list, com.mbridge.msdk.newreward.function.cache.b bVar) {
        List<com.mbridge.msdk.newreward.function.core.campaign.a> listG;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.newreward.function.core.campaign.b bVar2 = list.get(i);
            if (bVar2 != null && (listG = bVar2.g()) != null && listG.size() != 0) {
                int i2 = 0;
                boolean z = false;
                while (i2 < listG.size()) {
                    com.mbridge.msdk.newreward.function.core.campaign.a aVar = listG.get(i2);
                    boolean zL = aVar.h().L();
                    if (!zL) {
                        bVar.c(bVar2.t());
                        com.mbridge.msdk.newreward.function.cache.c cVar = this.b;
                        if (cVar != null) {
                            cVar.a(bVar2.p(), bVar2.t(), 2, aVar.h().k());
                        }
                        z = zL;
                        break;
                    }
                    i2++;
                    z = zL;
                }
                if (z) {
                    arrayList.add(bVar2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public com.mbridge.msdk.newreward.function.cache.b a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.error.b bVar, e eVar, int i) {
        String strF;
        int i2;
        com.mbridge.msdk.newreward.function.cache.b bVar2 = new com.mbridge.msdk.newreward.function.cache.b();
        String str = "";
        CampaignEx campaignEx = null;
        if (eVar != null) {
            try {
                strF = eVar.f();
                if (eVar.g() != null && eVar.g().a() != null && eVar.g().a().f() != null && eVar.g().a().f().size() > 0) {
                    campaignEx = eVar.g().a().f().get(0);
                }
                if (this.b != null) {
                    int iD = eVar.d();
                    String strG = eVar.G();
                    this.b.b(iD);
                    this.b.e(strG);
                    this.b.a(eVar);
                    i2 = iD;
                    str = strG;
                }
                if (campaignEx != null) {
                    try {
                    } catch (Exception unused) {
                        bVar2.d("getRewardCandidateCampaignList result exception");
                        bVar2.a(com.mbridge.msdk.foundation.cache.c.k);
                        return bVar2;
                    }
                }
                bVar2 = a(strF, cVar, campaignEx != null ? campaignEx.getRequestId() : "", bVar, eVar, i, i2, str);
                return bVar2;
            } catch (Exception unused2) {
                bVar2.d("getCandidateCampaignList result exception");
                bVar2.a(com.mbridge.msdk.foundation.cache.c.k);
                return bVar2;
            }
        }
        strF = null;
        i2 = 94;
        bVar2 = a(strF, cVar, campaignEx != null ? campaignEx.getRequestId() : "", bVar, eVar, i, i2, str);
        return bVar2;
    }

    private com.mbridge.msdk.newreward.function.cache.b a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str2, com.mbridge.msdk.foundation.error.b bVar, e eVar, int i, int i2, String str3) {
        String strH;
        int iC;
        String str4;
        if (bVar != null) {
            iC = bVar.c();
            strH = bVar.h();
        } else {
            strH = null;
            iC = 0;
        }
        com.mbridge.msdk.newreward.function.cache.c cVar2 = this.b;
        if (cVar2 == null) {
            com.mbridge.msdk.newreward.function.cache.b bVar2 = new com.mbridge.msdk.newreward.function.cache.b();
            bVar2.d("can not get manager");
            bVar2.a(com.mbridge.msdk.foundation.cache.c.k);
            return bVar2;
        }
        com.mbridge.msdk.newreward.function.cache.b bVarA = cVar2.a(str);
        if (bVarA.h() > com.mbridge.msdk.foundation.cache.c.j) {
            return bVarA;
        }
        String[] strArrSplit = i0.a(str.split("_")[3]).split("\\|");
        double d = Double.parseDouble(strArrSplit[0]);
        if (strArrSplit.length > 1) {
            str4 = strArrSplit[1];
        } else {
            str4 = "";
        }
        com.mbridge.msdk.newreward.function.cache.b bVarA2 = a(d, str4, cVar, str, eVar, i, i2, str3);
        if (bVarA2 != null && bVarA2.e() != null) {
            this.b.a(bVarA2.e().g(), cVar, str2, iC, strH, i, d);
        }
        return bVarA2;
    }

    private com.mbridge.msdk.newreward.function.cache.b a(double d, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str2, e eVar, int i, int i2, String str3) {
        com.mbridge.msdk.newreward.function.cache.b bVarA = this.b.a();
        try {
            if (bVarA.h() > 0) {
                return bVarA;
            }
            JSONObject jSONObjectC = this.b.c(str);
            if (jSONObjectC != null) {
                int iOptInt = jSONObjectC.optInt("max_usage_limit", 10);
                int iOptInt2 = jSONObjectC.optInt("max_cache_num", 20);
                if (iOptInt2 > 0) {
                    List<com.mbridge.msdk.newreward.function.core.campaign.b> listA = this.b.a(iOptInt, i2, str3);
                    if (listA != null && listA.size() > 0) {
                        return a(listA, jSONObjectC, iOptInt2, d, cVar, str2, true, eVar, i);
                    }
                    bVarA.d("no cache");
                    bVarA.a(com.mbridge.msdk.foundation.cache.c.k);
                    a(cVar, str2, bVarA, null, jSONObjectC, eVar, 2);
                } else {
                    bVarA.d("max cache num error");
                    bVarA.a(com.mbridge.msdk.foundation.cache.c.k);
                }
            } else {
                bVarA.d("setting config not mapping");
                bVarA.a(com.mbridge.msdk.foundation.cache.c.k);
            }
            return bVarA;
        } catch (Exception unused) {
            bVarA.d("getHighestCampaigns exception");
            bVarA.a(com.mbridge.msdk.foundation.cache.c.k);
        }
    }

    private com.mbridge.msdk.newreward.function.cache.b a(List<com.mbridge.msdk.newreward.function.core.campaign.b> list, JSONObject jSONObject, int i, double d, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, boolean z, e eVar, int i2) {
        com.mbridge.msdk.newreward.function.cache.b bVar;
        List<com.mbridge.msdk.newreward.function.cache.a.C0204a> list2;
        int i3;
        com.mbridge.msdk.newreward.function.cache.b bVar2;
        List<com.mbridge.msdk.newreward.function.core.campaign.b> listB = list;
        com.mbridge.msdk.newreward.function.cache.b bVar3 = new com.mbridge.msdk.newreward.function.cache.b();
        if (jSONObject == null) {
            bVar3.d("config is null");
            bVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            return bVar3;
        }
        if (listB != null && list.size() != 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                com.mbridge.msdk.newreward.function.core.campaign.b bVar4 = listB.get(i4);
                if (bVar4 != null) {
                    bVar3.a(bVar4.t());
                }
            }
            if (list.size() > 0 && ((listB = a(listB, bVar3)) == null || listB.size() == 0)) {
                bVar3.d("existed");
                bVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            }
            if (listB.size() > 0 && ((listB = c(listB, bVar3)) == null || listB.size() == 0)) {
                bVar3.d("not ready");
                bVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            }
            if (listB.size() > 0 && ((listB = b(listB, bVar3)) == null || listB.size() == 0)) {
                bVar3.d("had in cache");
                bVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            }
            if (listB == null || listB.size() <= 0) {
                bVar = bVar3;
                list2 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                double dOptDouble = jSONObject.optDouble("t_disc", 0.8d);
                double dOptDouble2 = jSONObject.optDouble("u_disc", 0.95d);
                double dOptDouble3 = jSONObject.optDouble("max_ecppv_diff", 0.0d);
                int iOptInt = jSONObject.optInt("time_interval", 1800);
                int size = listB.size();
                double d2 = 0.0d;
                com.mbridge.msdk.newreward.function.core.campaign.b bVar5 = null;
                int i5 = 0;
                while (i5 < size) {
                    com.mbridge.msdk.newreward.function.core.campaign.b bVar6 = listB.get(i5);
                    if (bVar6 != null) {
                        i3 = size;
                        bVar2 = bVar3;
                        double dPow = Math.pow(dOptDouble2, bVar6.y()) * Math.pow(dOptDouble, (System.currentTimeMillis() - bVar6.z()) / (((double) iOptInt) * 1000.0d)) * bVar6.k();
                        arrayList.add(new com.mbridge.msdk.newreward.function.cache.a.C0204a(dPow, bVar6));
                        if (dPow >= d - dOptDouble3 && dPow > d2) {
                            d2 = dPow;
                            bVar5 = bVar6;
                        }
                    } else {
                        i3 = size;
                        bVar2 = bVar3;
                    }
                    i5++;
                    size = i3;
                    bVar3 = bVar2;
                }
                com.mbridge.msdk.newreward.function.cache.b bVar7 = bVar3;
                if (bVar5 != null) {
                    bVar = bVar7;
                    bVar.a(bVar5);
                    bVar.a(com.mbridge.msdk.foundation.cache.c.l);
                } else {
                    bVar = bVar7;
                    bVar.d("no match campaign");
                    bVar.a(com.mbridge.msdk.foundation.cache.c.k);
                }
                list2 = arrayList;
            }
            if (z) {
                a(cVar, str, bVar, list2, jSONObject, eVar, i2);
            }
            return bVar;
        }
        bVar3.d("candidate is null");
        bVar3.a(com.mbridge.msdk.foundation.cache.c.k);
        return bVar3;
    }

    private List<com.mbridge.msdk.newreward.function.core.campaign.b> a(List<com.mbridge.msdk.newreward.function.core.campaign.b> list, com.mbridge.msdk.newreward.function.cache.b bVar) {
        List<com.mbridge.msdk.newreward.function.core.campaign.a> listG;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.newreward.function.core.campaign.b bVar2 = list.get(i);
            if (bVar2 != null && (listG = bVar2.g()) != null && listG.size() != 0) {
                int i2 = 0;
                boolean z = false;
                while (i2 < listG.size()) {
                    com.mbridge.msdk.newreward.function.core.campaign.a aVar = listG.get(i2);
                    boolean zC = t0.c(com.mbridge.msdk.foundation.controller.c.n().d(), aVar.a().getPackageName());
                    if (zC) {
                        bVar.b(bVar2.t());
                        com.mbridge.msdk.newreward.function.cache.c cVar = this.b;
                        if (cVar != null) {
                            cVar.a(bVar2.p(), bVar2.t(), 2, aVar.h().k());
                        }
                        z = zC;
                        break;
                    }
                    i2++;
                    z = zC;
                }
                if (!z) {
                    arrayList.add(bVar2);
                }
            }
        }
        return arrayList;
    }

    public boolean a(String str) {
        JSONObject jSONObjectC;
        try {
            com.mbridge.msdk.newreward.function.cache.c cVar = this.b;
            return (cVar == null || (jSONObjectC = cVar.c(cVar.d(str))) == null || jSONObjectC.optInt("c_cb", 0) != 1) ? false : true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.newreward.function.cache.b bVar, List<com.mbridge.msdk.newreward.function.cache.a.C0204a> list, JSONObject jSONObject, e eVar, int i) {
        String str2;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            if (i == 1) {
                str2 = "cb";
            } else if (i == 2) {
                str2 = "candidate";
            } else if (i != 3) {
                str2 = "unknown";
            } else {
                str2 = "track";
            }
            eVar2.a(com.umeng.ccg.a.j, str2);
            com.mbridge.msdk.newreward.function.cache.c cVar2 = this.b;
            if (cVar2 != null) {
                double dB = cVar2.b(str);
                if (dB >= 0.0d) {
                    eVar2.a("bp", i0.b(dB + ""));
                }
                eVar2.a("cb_state", a(str) ? C4304pL.OPEN : "close");
                try {
                    com.mbridge.msdk.newreward.function.cache.c cVar3 = this.b;
                    JSONObject jSONObjectC = cVar3.c(cVar3.d(str));
                    if (jSONObjectC != null) {
                        eVar2.a("config", jSONObjectC.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (bVar != null) {
                if (bVar.h() == com.mbridge.msdk.foundation.cache.c.l) {
                    eVar2.a("result", 1);
                } else {
                    eVar2.a("result", 2);
                    eVar2.a("reason", bVar.f());
                }
                eVar2.a("acr", bVar.a());
                eVar2.a("her", bVar.d());
                eVar2.a("nrr", bVar.g());
                eVar2.a("cer", bVar.b());
            } else {
                eVar2.a("result", 2);
                eVar2.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    com.mbridge.msdk.newreward.function.core.campaign.b bVarA = list.get(i2).a();
                    if (bVarA != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", i0.b(bVarA.k() + ""));
                        jSONObject2.put("showCount", bVarA.y());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - bVarA.z());
                        jSONArray.put(jSONObject2);
                    }
                }
                eVar2.a("data", jSONArray.toString());
            }
            if (cVar != null) {
                cVar.i("m_candidate_data");
                cVar.d("m_candidate_data");
                cVar.a("m_candidate_data", eVar2);
                if (bVar != null && bVar.e() != null && eVar != null) {
                    cVar.b(eVar.g().b());
                }
            }
            c cVar4 = this.f1615a;
            cVar4.a(eVar, f.METRICS_KEY_M_CANDIDATE_DATE, cVar4.a("metrics_data", eVar2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
