package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile b f38228f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38229a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, l> f38230b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> f38231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f38232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<a>> f38233e;

    private b() {
    }

    public static b getInstance() {
        if (f38228f == null) {
            synchronized (b.class) {
                try {
                    if (f38228f == null) {
                        f38228f = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f38228f;
    }

    public a a(String str, String str2) {
        l lVarC = c(str);
        if (lVarC != null) {
            return lVarC.a(str2);
        }
        return null;
    }

    public CopyOnWriteArrayList<CampaignEx> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f38232d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f38232d.get(str);
    }

    public l c(String str) {
        ConcurrentHashMap<String, l> concurrentHashMap = this.f38230b;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f38230b.get(str);
    }

    public l createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i10, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (!this.f38230b.containsKey(str)) {
            l lVar = new l(context, copyOnWriteArrayList, str, i10);
            if (i10 == 94 || i10 == 287) {
                lVar.a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), aVar);
            } else {
                lVar.a(aVar);
            }
            this.f38230b.put(str, lVar);
            return lVar;
        }
        l lVar2 = this.f38230b.get(str);
        if (lVar2 == null) {
            lVar2 = new l(context, copyOnWriteArrayList, str, i10);
            this.f38230b.put(str, lVar2);
        }
        if (i10 == 94 || i10 == 287) {
            lVar2.a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), aVar);
        } else {
            lVar2.a(aVar);
        }
        lVar2.b(copyOnWriteArrayList);
        return lVar2;
    }

    public void load(String str) {
        l lVarC = c(str);
        if (lVarC != null) {
            lVarC.d();
        }
    }

    public CopyOnWriteArrayList<a> a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = this.f38233e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f38233e.get(str);
    }

    public boolean b(int i10, String str, boolean z10) {
        try {
            l lVarC = c(str);
            return (lVarC == null || lVarC.b(i10, z10) == null) ? false : true;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void c(String str, String str2) {
        l lVarC = c(str);
        if (lVarC != null) {
            try {
                lVarC.b(str2);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DownLoadManager", e10.getMessage());
                }
            }
        }
    }

    public a a(int i10, String str, boolean z10) {
        l lVarC = c(str);
        if (lVarC != null) {
            return lVarC.a(i10, z10);
        }
        return null;
    }

    public boolean a(int i10, String str, boolean z10, int i11, boolean z11, int i12, List<CampaignEx> list) {
        return a(i10, str, z10, i11, z11, i12, list, false, null);
    }

    public void b(boolean z10) {
        this.f38229a = z10;
        ConcurrentHashMap<String, l> concurrentHashMap = this.f38230b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                l value = it.next().getValue();
                if (value != null) {
                    value.e();
                }
            }
        }
    }

    public boolean a(int i10, String str, List<CampaignEx> list) {
        String str2;
        l lVarC = c(str);
        if (lVarC == null) {
            str2 = str;
            lVarC = createUnitCache(com.mbridge.msdk.foundation.controller.c.n().d(), str2, (CopyOnWriteArrayList<CampaignEx>) list, i10, (com.mbridge.msdk.videocommon.listener.a) null);
        } else {
            str2 = str;
        }
        if (lVarC != null) {
            return lVarC.a(list, str2);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    public boolean a(int i10, String str, boolean z10, int i11, boolean z11, int i12, List<CampaignEx> list, boolean z12, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        Exception exc;
        boolean z13;
        CampaignEx campaignEx;
        boolean z14 = false;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    l lVarC = c(str);
                    if (lVarC != null) {
                        List<a> listA = lVarC.a(str, i10, z10, list, z12, eVar);
                        if (listA != null && listA.size() != 0) {
                            if (z11) {
                                if (list.size() <= 0 || (campaignEx = list.get(0)) == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                    z13 = false;
                                } else {
                                    q0.c("DownLoadManager", "Is not check video download status with TPL");
                                    z13 = true;
                                }
                                try {
                                    if (i12 == 0) {
                                        ArrayList arrayList = new ArrayList();
                                        for (a aVar : listA) {
                                            for (CampaignEx campaignEx2 : list) {
                                                if (aVar != null && aVar.h() != null && campaignEx2 != null && campaignEx2.getId().equals(aVar.h().getId()) && campaignEx2.getRequestId().equals(aVar.h().getRequestId())) {
                                                    arrayList.add(aVar);
                                                }
                                            }
                                        }
                                        if (arrayList.size() > 0) {
                                            z14 = true;
                                        } else {
                                            z14 = z13;
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (a aVar2 : listA) {
                                            for (CampaignEx campaignEx3 : list) {
                                                if (aVar2 != null && aVar2.h() != null && campaignEx3 != null && campaignEx3.getId().equals(aVar2.h().getId()) && campaignEx3.getRequestId().equals(aVar2.h().getRequestId())) {
                                                    arrayList2.add(aVar2);
                                                }
                                            }
                                        }
                                        if (arrayList2.size() >= i11) {
                                            z14 = true;
                                        }
                                    }
                                } catch (Exception e10) {
                                    exc = e10;
                                    z14 = z13;
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (a aVar3 : listA) {
                                    for (CampaignEx campaignEx4 : list) {
                                        if (aVar3 != null && aVar3.h() != null && campaignEx4 != null && campaignEx4.getId().equals(aVar3.h().getId()) && campaignEx4.getRequestId().equals(aVar3.h().getRequestId())) {
                                            arrayList3.add(aVar3);
                                        }
                                    }
                                }
                                if (arrayList3.size() > 0) {
                                    z14 = true;
                                }
                            }
                        }
                        if (z14) {
                            if (this.f38231c == null) {
                                this.f38231c = new ConcurrentHashMap<>();
                            }
                            if (this.f38233e == null) {
                                this.f38233e = new ConcurrentHashMap<>();
                            }
                            if (this.f38232d == null) {
                                this.f38232d = new ConcurrentHashMap<>();
                            }
                            if (listA != null && listA.size() > 0) {
                                CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                                CopyOnWriteArrayList<a> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                                for (a aVar4 : listA) {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    CampaignEx campaignExH = aVar4.h();
                                    concurrentHashMap.put(campaignExH.getId() + campaignExH.getVideoUrlEncode() + campaignExH.getBidToken(), aVar4);
                                    copyOnWriteArrayList.add(concurrentHashMap);
                                    copyOnWriteArrayList2.add(campaignExH);
                                    copyOnWriteArrayList3.add(aVar4);
                                }
                                a(str, copyOnWriteArrayList, copyOnWriteArrayList2, copyOnWriteArrayList3);
                            }
                        }
                    }
                    return z14;
                }
            } catch (Exception e11) {
                exc = e11;
            }
            if (MBridgeConstans.DEBUG) {
                exc.printStackTrace();
            }
        }
        return z14;
    }

    public l createUnitCache(Context context, String str, CampaignEx campaignEx, int i10, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f38230b.containsKey(str)) {
            l lVar = this.f38230b.get(str);
            if (lVar == null) {
                lVar = new l(context, campaignEx, str, i10);
                this.f38230b.put(str, lVar);
            }
            if (i10 != 94 && i10 != 287) {
                lVar.a(aVar);
            } else {
                lVar.a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), aVar);
            }
            lVar.f(campaignEx);
            return lVar;
        }
        l lVar2 = new l(context, campaignEx, str, i10);
        if (i10 != 94 && i10 != 287) {
            lVar2.a(aVar);
        } else {
            lVar2.a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), aVar);
        }
        this.f38230b.put(str, lVar2);
        return lVar2;
    }

    public int b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayListC;
        a value;
        CampaignEx campaignExH;
        ConcurrentHashMap<String, l> concurrentHashMap = this.f38230b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                l value2 = it.next().getValue();
                if (value2 != null && (copyOnWriteArrayListC = value2.c()) != null) {
                    int size = copyOnWriteArrayListC.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Map<String, a> map = copyOnWriteArrayListC.get(i10);
                        if (map != null) {
                            Iterator<Map.Entry<String, a>> it2 = map.entrySet().iterator();
                            if (it2.hasNext() && (value = it2.next().getValue()) != null && (campaignExH = value.h()) != null) {
                                String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return value.o();
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    private void a(String str, CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2, CopyOnWriteArrayList<a> copyOnWriteArrayList3) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4;
        if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayList2.get(0);
            if (campaignEx.getSecondRequestIndex() == 1 && (concurrentHashMap = this.f38232d) != null && (copyOnWriteArrayList4 = concurrentHashMap.get(str)) != null && copyOnWriteArrayList4.size() > 0 && copyOnWriteArrayList4.get(0).getLocalRequestId().equals(campaignEx.getLocalRequestId())) {
                return;
            }
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, a>>> concurrentHashMap2 = this.f38231c;
        if (concurrentHashMap2 == null) {
            this.f38231c = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap2.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap3 = this.f38233e;
        if (concurrentHashMap3 == null) {
            this.f38233e = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap3.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap4 = this.f38232d;
        if (concurrentHashMap4 == null) {
            this.f38232d = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap4.remove(str);
        }
        this.f38231c.put(str, copyOnWriteArrayList);
        this.f38232d.put(str, copyOnWriteArrayList2);
        this.f38233e.put(str, copyOnWriteArrayList3);
    }

    public void a(boolean z10) {
        if (z10) {
            if (this.f38229a) {
                return;
            }
        } else {
            this.f38229a = false;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.f38230b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().d();
            }
        }
    }

    public void a() {
        ConcurrentHashMap<String, l> concurrentHashMap = this.f38230b;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                a(entry.getValue(), entry.getKey());
            }
        }
    }

    private void a(l lVar, String str) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), str);
            if (cVarC == null) {
                return;
            }
            if (cVarC.l() == 2) {
                lVar.e();
            } else {
                lVar.d();
            }
        } catch (Exception e10) {
            q0.b("DownLoadManager", e10.getMessage());
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                m mVarE = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str);
                if (mVarE == null) {
                    mVarE = m.j(str);
                }
                if (mVarE.q() == 2) {
                    lVar.e();
                } else {
                    lVar.d();
                }
            } catch (Exception e11) {
                q0.b("DownLoadManager", e11.getMessage());
            }
        }
    }
}
