package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f38249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f38250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f38251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f38253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f38254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<CampaignEx> f38255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> f38256h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f38258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.listener.a f38259c;

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.f38257a = str;
            this.f38258b = concurrentHashMap;
            this.f38259c = aVar;
        }

        private void b(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f38259c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.f38257a + " videoDownloadListener onDownLoadDone error: " + e10.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f38258b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.f38257a + " videoDownloadListener onDownLoadDone error: " + e11.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            b(str);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            b(str, str2);
        }

        private void b(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f38259c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoRefactorManager", this.f38257a + " videoDownloadListener onDownLoadFailed error: " + e10.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f38258b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", this.f38257a + " videoDownloadListener onDownLoadFailed error: " + e11.getMessage());
                        }
                    }
                }
            }
        }
    }

    public k(List<CampaignEx> list, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f38255g = copyOnWriteArrayList;
        this.f38256h = new ConcurrentHashMap<>();
        this.f38251c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f38252d = str;
        this.f38254f = i10;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    private String b(CampaignEx campaignEx) {
        return campaignEx == null ? "" : campaignEx.getendcard_url();
    }

    private int c() {
        com.mbridge.msdk.videocommon.setting.c cVarB = b(h());
        if (cVarB == null) {
            return 0;
        }
        try {
            return cVarB.g();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            q0.a("RewardVideoRefactorManager", h() + " getCDRate error " + e10.getMessage());
            return 0;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            q0.a("RewardVideoRefactorManager", h() + " getVideoCtnType error " + e10.getMessage());
            return 1;
        }
    }

    private String e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.j();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " getVideoTemplateUrl error", e10);
            }
        }
        return "";
    }

    private void f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            if (this.f38256h.containsKey(str)) {
                return;
            }
            a(campaignEx, str, (com.mbridge.msdk.videocommon.download.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " handlerCampaignLoadEvent error", e10);
            }
        }
    }

    private boolean g(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.a("RewardVideoRefactorManager", h() + " isPlayerAbleAds error:" + th2.getMessage());
            return false;
        }
    }

    public void a() {
    }

    public void h(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.f38255g.add(campaignEx);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e10);
                }
            }
        }
    }

    public com.mbridge.msdk.videocommon.download.a i() {
        List<com.mbridge.msdk.videocommon.download.a> listA;
        if (this.f38255g.size() == 0) {
            q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
            return null;
        }
        try {
            listA = a((List<CampaignEx>) this.f38255g, false);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " isReady error", e10);
            }
            listA = null;
        }
        if (listA == null || listA.size() <= 0) {
            return null;
        }
        return listA.get(0);
    }

    public void j() {
        a(this.f38255g);
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f38249a = aVar;
    }

    private com.mbridge.msdk.videocommon.setting.c b(String str) {
        try {
            if (this.f38253e == null) {
                this.f38253e = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), str, b() == 287);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getRewardUnitSetting error " + e10.getMessage());
            }
        }
        return this.f38253e;
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.f38250b == null) {
            this.f38250b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f38250b.put(str, aVar);
    }

    private int g() {
        try {
            return b(this.f38252d).w();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.a("RewardVideoRefactorManager", h() + " getRewardReadyRate error:" + th2.getMessage());
            return 100;
        }
    }

    public com.mbridge.msdk.videocommon.download.a d() {
        try {
            return i();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTask error:" + th2.getMessage());
            return null;
        }
    }

    public String h() {
        return this.f38252d;
    }

    public void c(String str) {
        com.mbridge.msdk.videocommon.download.a aVarRemove;
        CampaignEx campaignExH;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (this.f38256h.containsKey(str) && (aVarRemove = this.f38256h.remove(str)) != null && (campaignExH = aVarRemove.h()) != null) {
                this.f38255g.remove(campaignExH);
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask campaign name: " + campaignExH.getAppName());
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", h() + " removeCampaignDownloadTask error:" + e10.getMessage());
            }
        }
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> e() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.f38256h);
            return copyOnWriteArrayList;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.b("RewardVideoRefactorManager", h() + " getCampaignDownLoadTaskList error:" + e10.getMessage());
            return null;
        }
    }

    private int f() {
        if (TextUtils.isEmpty(h())) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.setting.c cVarB = b(h());
            if (cVarB != null) {
                return cVarB.l();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.a("RewardVideoRefactorManager", h() + " getDlnet error " + e10.getMessage());
            }
        }
        return 1;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.f38255g.addAll(list);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " update error", e10);
                }
            }
        }
    }

    public k(CampaignEx campaignEx, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f38255g = copyOnWriteArrayList;
        this.f38256h = new ConcurrentHashMap<>();
        this.f38251c = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f38252d = str;
        this.f38254f = i10;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    public int b() {
        return this.f38254f;
    }

    private boolean b(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if ((aVar == null || !aVar.x()) && !campaignEx.isDynamicView()) {
            return ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) && campaignEx.getLoadTimeoutState() == 0 && g.a(str) == null) ? false : true;
        }
        return true;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx != null) {
                    f(campaignEx);
                }
            }
            return;
        }
        q0.a("RewardVideoRefactorManager", h() + " load campaignExes is null");
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return g();
    }

    public List<com.mbridge.msdk.videocommon.download.a> a(List<CampaignEx> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int size = list.size();
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null) {
                    a(z10, arrayList, size, campaignEx);
                }
            }
            return arrayList;
        }
        q0.a("RewardVideoRefactorManager", h() + " isReady campaignExes is null");
        return arrayList;
    }

    private void a(boolean z10, List<com.mbridge.msdk.videocommon.download.a> list, int i10, CampaignEx campaignEx) {
        k kVar;
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            kVar = this;
            try {
                kVar.a(z10, list, campaignEx, a(campaignEx, str, this.f38256h.get(str)), i10);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", kVar.h() + " isReady error", exc);
                }
            }
        } catch (Exception e11) {
            e = e11;
            kVar = this;
        }
    }

    public void k() {
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a aVarA = a(campaignEx);
        aVarA.C();
        this.f38256h.put(str, aVarA);
        return aVarA;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[Catch: Exception -> 0x0062, TryCatch #4 {Exception -> 0x0062, blocks: (B:34:0x005e, B:37:0x0068, B:39:0x006e), top: B:80:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #4 {Exception -> 0x0062, blocks: (B:34:0x005e, B:37:0x0068, B:39:0x006e), top: B:80:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x008c, please report this as an issue */
    private void a(boolean z10, List<com.mbridge.msdk.videocommon.download.a> list, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        com.mbridge.msdk.videocommon.download.a aVar2;
        Exception exc;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList<Integer> rsIgnoreCheckRule;
        if (list == null || campaignEx == null || aVar == null) {
            return;
        }
        try {
            int loadTimeoutState = campaignEx.getLoadTimeoutState();
            try {
                if (!aVar.w()) {
                    aVar2 = aVar;
                    try {
                        if (!a(campaignEx, aVar2, c(campaignEx), z10, f())) {
                            z14 = false;
                        }
                        aVar2.e(z14);
                        if (!aVar2.u() || a(b(campaignEx), campaignEx, aVar2)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (loadTimeoutState != 0 && z12) {
                            try {
                                aVar2.c(true);
                                if (aVar2.x()) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                if (loadTimeoutState == 0) {
                                    aVar2.f(true);
                                }
                            } catch (Exception e10) {
                                z11 = z14;
                                exc = e10;
                                z13 = false;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", exc);
                                }
                                z14 = z11;
                                if (aVar2.s()) {
                                    z15 = true;
                                } else {
                                    z15 = true;
                                }
                                aVar2.a(z15);
                                if (z15) {
                                    list.add(aVar2);
                                }
                                if (MBridgeConstans.DEBUG) {
                                    rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                                    if (rsIgnoreCheckRule == null) {
                                        rsIgnoreCheckRule = new ArrayList<>();
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(h());
                                    sb2.append("  campaign name = ");
                                    sb2.append(campaignEx.getAppName());
                                    sb2.append("\n\t\tcampaign id = ");
                                    sb2.append(campaignEx.getId());
                                    sb2.append("\n\t\trequest id = ");
                                    sb2.append(campaignEx.getRequestId());
                                    sb2.append("\n\t\tadType = ");
                                    sb2.append(b());
                                    sb2.append("\n\t\tunitID = ");
                                    sb2.append(h());
                                    sb2.append("\n\t\tisReady = ");
                                    sb2.append(z15);
                                    sb2.append("\n\t\tisDynamicView = ");
                                    sb2.append(campaignEx.isDynamicView());
                                    sb2.append("\n\t\tisTPL = ");
                                    sb2.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                                    sb2.append("\n\t\tcurrentSuccessSize = ");
                                    sb2.append(list.size());
                                    sb2.append("\n\t\tisReadyCheckSize = ");
                                    sb2.append(i10);
                                    sb2.append("\n\t\ttotalCampaignSize = ");
                                    sb2.append(this.f38255g.size());
                                    sb2.append("\n\t\tlinkType = ");
                                    sb2.append(campaignEx.getLinkType());
                                    sb2.append("\n\t\tloadTimeoutState = ");
                                    sb2.append(campaignEx.getLoadTimeoutState());
                                    sb2.append("\n\t\tisVideoReady = ");
                                    sb2.append(z14);
                                    sb2.append("\n\t\t\tisIgnore = ");
                                    sb2.append(rsIgnoreCheckRule.contains(0));
                                    sb2.append("\n\t\t\treadyRate == ");
                                    sb2.append(c(campaignEx));
                                    sb2.append("\n\t\t\tCDRate = ");
                                    sb2.append(c());
                                    sb2.append("\n\t\t\tdlnet = ");
                                    sb2.append(f());
                                    sb2.append("\n\t\t\tctn = ");
                                    sb2.append(d(campaignEx));
                                    sb2.append("\n\t\t\tdownloadState = ");
                                    sb2.append(a(aVar2.o()));
                                    sb2.append("\n\t\tisTemplateReady = ");
                                    sb2.append(z13);
                                    sb2.append("\n\t\t\tisIgnore = ");
                                    sb2.append(rsIgnoreCheckRule.contains(1));
                                    sb2.append("\n\t\tisEndCardReady = ");
                                    sb2.append(z12);
                                    sb2.append("\n\t\t\tisIgnore = ");
                                    sb2.append(rsIgnoreCheckRule.contains(2));
                                    sb2.append("\n\t\t\tisOnlyPlayable = ");
                                    sb2.append(g(campaignEx));
                                    sb2.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                                    sb2.append(v0.l(campaignEx.getendcard_url()));
                                    q0.b("RewardVideoRefactorManager", sb2.toString());
                                }
                            }
                        } else {
                            if (aVar2.x() || b(campaignEx, e(campaignEx), aVar2)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (loadTimeoutState == 0 && z13) {
                                try {
                                    aVar2.f(true);
                                } catch (Exception e11) {
                                    z11 = z14;
                                    exc = e11;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", exc);
                                    }
                                    z14 = z11;
                                }
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        exc = e;
                        z11 = false;
                        z12 = false;
                        z13 = z12;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", exc);
                        }
                        z14 = z11;
                        if (aVar2.s()) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        aVar2.a(z15);
                        if (z15) {
                            list.add(aVar2);
                        }
                        if (MBridgeConstans.DEBUG) {
                            rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                            if (rsIgnoreCheckRule == null) {
                                rsIgnoreCheckRule = new ArrayList<>();
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(h());
                            sb3.append("  campaign name = ");
                            sb3.append(campaignEx.getAppName());
                            sb3.append("\n\t\tcampaign id = ");
                            sb3.append(campaignEx.getId());
                            sb3.append("\n\t\trequest id = ");
                            sb3.append(campaignEx.getRequestId());
                            sb3.append("\n\t\tadType = ");
                            sb3.append(b());
                            sb3.append("\n\t\tunitID = ");
                            sb3.append(h());
                            sb3.append("\n\t\tisReady = ");
                            sb3.append(z15);
                            sb3.append("\n\t\tisDynamicView = ");
                            sb3.append(campaignEx.isDynamicView());
                            sb3.append("\n\t\tisTPL = ");
                            sb3.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                            sb3.append("\n\t\tcurrentSuccessSize = ");
                            sb3.append(list.size());
                            sb3.append("\n\t\tisReadyCheckSize = ");
                            sb3.append(i10);
                            sb3.append("\n\t\ttotalCampaignSize = ");
                            sb3.append(this.f38255g.size());
                            sb3.append("\n\t\tlinkType = ");
                            sb3.append(campaignEx.getLinkType());
                            sb3.append("\n\t\tloadTimeoutState = ");
                            sb3.append(campaignEx.getLoadTimeoutState());
                            sb3.append("\n\t\tisVideoReady = ");
                            sb3.append(z14);
                            sb3.append("\n\t\t\tisIgnore = ");
                            sb3.append(rsIgnoreCheckRule.contains(0));
                            sb3.append("\n\t\t\treadyRate == ");
                            sb3.append(c(campaignEx));
                            sb3.append("\n\t\t\tCDRate = ");
                            sb3.append(c());
                            sb3.append("\n\t\t\tdlnet = ");
                            sb3.append(f());
                            sb3.append("\n\t\t\tctn = ");
                            sb3.append(d(campaignEx));
                            sb3.append("\n\t\t\tdownloadState = ");
                            sb3.append(a(aVar2.o()));
                            sb3.append("\n\t\tisTemplateReady = ");
                            sb3.append(z13);
                            sb3.append("\n\t\t\tisIgnore = ");
                            sb3.append(rsIgnoreCheckRule.contains(1));
                            sb3.append("\n\t\tisEndCardReady = ");
                            sb3.append(z12);
                            sb3.append("\n\t\t\tisIgnore = ");
                            sb3.append(rsIgnoreCheckRule.contains(2));
                            sb3.append("\n\t\t\tisOnlyPlayable = ");
                            sb3.append(g(campaignEx));
                            sb3.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                            sb3.append(v0.l(campaignEx.getendcard_url()));
                            q0.b("RewardVideoRefactorManager", sb3.toString());
                        }
                    }
                    if (aVar2.s() || (z14 && z12 && z13)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    aVar2.a(z15);
                    if (z15) {
                        list.add(aVar2);
                    }
                    if (MBridgeConstans.DEBUG) {
                        rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                        if (rsIgnoreCheckRule == null) {
                            rsIgnoreCheckRule = new ArrayList<>();
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(h());
                        sb4.append("  campaign name = ");
                        sb4.append(campaignEx.getAppName());
                        sb4.append("\n\t\tcampaign id = ");
                        sb4.append(campaignEx.getId());
                        sb4.append("\n\t\trequest id = ");
                        sb4.append(campaignEx.getRequestId());
                        sb4.append("\n\t\tadType = ");
                        sb4.append(b());
                        sb4.append("\n\t\tunitID = ");
                        sb4.append(h());
                        sb4.append("\n\t\tisReady = ");
                        sb4.append(z15);
                        sb4.append("\n\t\tisDynamicView = ");
                        sb4.append(campaignEx.isDynamicView());
                        sb4.append("\n\t\tisTPL = ");
                        sb4.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                        sb4.append("\n\t\tcurrentSuccessSize = ");
                        sb4.append(list.size());
                        sb4.append("\n\t\tisReadyCheckSize = ");
                        sb4.append(i10);
                        sb4.append("\n\t\ttotalCampaignSize = ");
                        sb4.append(this.f38255g.size());
                        sb4.append("\n\t\tlinkType = ");
                        sb4.append(campaignEx.getLinkType());
                        sb4.append("\n\t\tloadTimeoutState = ");
                        sb4.append(campaignEx.getLoadTimeoutState());
                        sb4.append("\n\t\tisVideoReady = ");
                        sb4.append(z14);
                        sb4.append("\n\t\t\tisIgnore = ");
                        sb4.append(rsIgnoreCheckRule.contains(0));
                        sb4.append("\n\t\t\treadyRate == ");
                        sb4.append(c(campaignEx));
                        sb4.append("\n\t\t\tCDRate = ");
                        sb4.append(c());
                        sb4.append("\n\t\t\tdlnet = ");
                        sb4.append(f());
                        sb4.append("\n\t\t\tctn = ");
                        sb4.append(d(campaignEx));
                        sb4.append("\n\t\t\tdownloadState = ");
                        sb4.append(a(aVar2.o()));
                        sb4.append("\n\t\tisTemplateReady = ");
                        sb4.append(z13);
                        sb4.append("\n\t\t\tisIgnore = ");
                        sb4.append(rsIgnoreCheckRule.contains(1));
                        sb4.append("\n\t\tisEndCardReady = ");
                        sb4.append(z12);
                        sb4.append("\n\t\t\tisIgnore = ");
                        sb4.append(rsIgnoreCheckRule.contains(2));
                        sb4.append("\n\t\t\tisOnlyPlayable = ");
                        sb4.append(g(campaignEx));
                        sb4.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                        sb4.append(v0.l(campaignEx.getendcard_url()));
                        q0.b("RewardVideoRefactorManager", sb4.toString());
                    }
                }
                aVar2 = aVar;
                aVar2.e(z14);
                if (aVar2.u()) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (loadTimeoutState != 0) {
                    if (aVar2.x()) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (loadTimeoutState == 0) {
                        aVar2.f(true);
                    }
                } else {
                    if (aVar2.x()) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (loadTimeoutState == 0) {
                        aVar2.f(true);
                    }
                }
            } catch (Exception e13) {
                z11 = z14;
                exc = e13;
                z12 = false;
                z13 = z12;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoRefactorManager", h() + " checkResourceReadyState error", exc);
                }
                z14 = z11;
                if (aVar2.s()) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                aVar2.a(z15);
                if (z15) {
                    list.add(aVar2);
                }
                if (MBridgeConstans.DEBUG) {
                    rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                    if (rsIgnoreCheckRule == null) {
                        rsIgnoreCheckRule = new ArrayList<>();
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(h());
                    sb5.append("  campaign name = ");
                    sb5.append(campaignEx.getAppName());
                    sb5.append("\n\t\tcampaign id = ");
                    sb5.append(campaignEx.getId());
                    sb5.append("\n\t\trequest id = ");
                    sb5.append(campaignEx.getRequestId());
                    sb5.append("\n\t\tadType = ");
                    sb5.append(b());
                    sb5.append("\n\t\tunitID = ");
                    sb5.append(h());
                    sb5.append("\n\t\tisReady = ");
                    sb5.append(z15);
                    sb5.append("\n\t\tisDynamicView = ");
                    sb5.append(campaignEx.isDynamicView());
                    sb5.append("\n\t\tisTPL = ");
                    sb5.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                    sb5.append("\n\t\tcurrentSuccessSize = ");
                    sb5.append(list.size());
                    sb5.append("\n\t\tisReadyCheckSize = ");
                    sb5.append(i10);
                    sb5.append("\n\t\ttotalCampaignSize = ");
                    sb5.append(this.f38255g.size());
                    sb5.append("\n\t\tlinkType = ");
                    sb5.append(campaignEx.getLinkType());
                    sb5.append("\n\t\tloadTimeoutState = ");
                    sb5.append(campaignEx.getLoadTimeoutState());
                    sb5.append("\n\t\tisVideoReady = ");
                    sb5.append(z14);
                    sb5.append("\n\t\t\tisIgnore = ");
                    sb5.append(rsIgnoreCheckRule.contains(0));
                    sb5.append("\n\t\t\treadyRate == ");
                    sb5.append(c(campaignEx));
                    sb5.append("\n\t\t\tCDRate = ");
                    sb5.append(c());
                    sb5.append("\n\t\t\tdlnet = ");
                    sb5.append(f());
                    sb5.append("\n\t\t\tctn = ");
                    sb5.append(d(campaignEx));
                    sb5.append("\n\t\t\tdownloadState = ");
                    sb5.append(a(aVar2.o()));
                    sb5.append("\n\t\tisTemplateReady = ");
                    sb5.append(z13);
                    sb5.append("\n\t\t\tisIgnore = ");
                    sb5.append(rsIgnoreCheckRule.contains(1));
                    sb5.append("\n\t\tisEndCardReady = ");
                    sb5.append(z12);
                    sb5.append("\n\t\t\tisIgnore = ");
                    sb5.append(rsIgnoreCheckRule.contains(2));
                    sb5.append("\n\t\t\tisOnlyPlayable = ");
                    sb5.append(g(campaignEx));
                    sb5.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                    sb5.append(v0.l(campaignEx.getendcard_url()));
                    q0.b("RewardVideoRefactorManager", sb5.toString());
                }
            }
            z14 = true;
        } catch (Exception e14) {
            e = e14;
            aVar2 = aVar;
        }
        if (aVar2.s()) {
            z15 = true;
        } else {
            z15 = true;
        }
        aVar2.a(z15);
        if (z15) {
            list.add(aVar2);
        }
        if (MBridgeConstans.DEBUG) {
            rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
            if (rsIgnoreCheckRule == null) {
                rsIgnoreCheckRule = new ArrayList<>();
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(h());
            sb6.append("  campaign name = ");
            sb6.append(campaignEx.getAppName());
            sb6.append("\n\t\tcampaign id = ");
            sb6.append(campaignEx.getId());
            sb6.append("\n\t\trequest id = ");
            sb6.append(campaignEx.getRequestId());
            sb6.append("\n\t\tadType = ");
            sb6.append(b());
            sb6.append("\n\t\tunitID = ");
            sb6.append(h());
            sb6.append("\n\t\tisReady = ");
            sb6.append(z15);
            sb6.append("\n\t\tisDynamicView = ");
            sb6.append(campaignEx.isDynamicView());
            sb6.append("\n\t\tisTPL = ");
            sb6.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
            sb6.append("\n\t\tcurrentSuccessSize = ");
            sb6.append(list.size());
            sb6.append("\n\t\tisReadyCheckSize = ");
            sb6.append(i10);
            sb6.append("\n\t\ttotalCampaignSize = ");
            sb6.append(this.f38255g.size());
            sb6.append("\n\t\tlinkType = ");
            sb6.append(campaignEx.getLinkType());
            sb6.append("\n\t\tloadTimeoutState = ");
            sb6.append(campaignEx.getLoadTimeoutState());
            sb6.append("\n\t\tisVideoReady = ");
            sb6.append(z14);
            sb6.append("\n\t\t\tisIgnore = ");
            sb6.append(rsIgnoreCheckRule.contains(0));
            sb6.append("\n\t\t\treadyRate == ");
            sb6.append(c(campaignEx));
            sb6.append("\n\t\t\tCDRate = ");
            sb6.append(c());
            sb6.append("\n\t\t\tdlnet = ");
            sb6.append(f());
            sb6.append("\n\t\t\tctn = ");
            sb6.append(d(campaignEx));
            sb6.append("\n\t\t\tdownloadState = ");
            sb6.append(a(aVar2.o()));
            sb6.append("\n\t\tisTemplateReady = ");
            sb6.append(z13);
            sb6.append("\n\t\t\tisIgnore = ");
            sb6.append(rsIgnoreCheckRule.contains(1));
            sb6.append("\n\t\tisEndCardReady = ");
            sb6.append(z12);
            sb6.append("\n\t\t\tisIgnore = ");
            sb6.append(rsIgnoreCheckRule.contains(2));
            sb6.append("\n\t\t\tisOnlyPlayable = ");
            sb6.append(g(campaignEx));
            sb6.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
            sb6.append(v0.l(campaignEx.getendcard_url()));
            q0.b("RewardVideoRefactorManager", sb6.toString());
        }
    }

    private String a(int i10) {
        if (i10 == 0) {
            return "DOWNLOAD_READY";
        }
        if (i10 == 1) {
            return "DOWNLOAD_RUN";
        }
        if (i10 == 2) {
            return "DOWNLOAD_PAUSE";
        }
        if (i10 == 4) {
            return "DOWNLOAD_STOP";
        }
        if (i10 != 5) {
            return "Unknown";
        }
        return "DOWNLOAD_DONE";
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar = null;
        try {
            com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f38251c, campaignEx, h(), f());
            try {
                aVar2.e(campaignEx);
                aVar2.a(b());
                aVar2.d(c(campaignEx));
                aVar2.b(c());
                aVar2.e(d(campaignEx));
                aVar2.a((c) null);
                aVar2.a(new a(h(), this.f38250b, this.f38249a));
                return aVar2;
            } catch (Exception e10) {
                e = e10;
                aVar = aVar2;
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " createAndStartCampaignDownloadTask error " + e.getMessage());
                }
                return aVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        if (aVar == null || TextUtils.isEmpty(aVar.i())) {
            return true;
        }
        if (i10 == 0) {
            return (aVar.h() == null || TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) ? false : true;
        }
        return Utils.getDownloadRate(aVar.j(), aVar.m()) >= i10;
    }

    private boolean a(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10, int i11) {
        if (aVar == null || campaignEx == null) {
            return false;
        }
        if (aVar.w() || g(campaignEx) || TextUtils.isEmpty(aVar.i()) || i11 == 3) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
            return true;
        }
        if (campaignEx.getIsTimeoutCheckVideoStatus() == 1 && campaignEx.getVideoCheckType() == 1) {
            return true;
        }
        long jM = aVar.m();
        long j10 = aVar.j();
        if (z10 && campaignEx.getVideoCheckType() == 1) {
            if (i10 == 0) {
                return true;
            }
            if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                campaignEx.setIsTimeoutCheckVideoStatus(1);
                return true;
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar) {
        if (campaignEx != null && aVar != null) {
            try {
                if (aVar.u()) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardZipOrSourceDownLoad endCard download success");
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                    return true;
                }
                if ((campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || a(str, campaignEx)) {
                    return true;
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("RewardVideoRefactorManager", h() + " checkEndCardDownload error " + th2.getMessage());
                }
            }
        }
        return false;
    }

    private boolean a(String str, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !g(campaignEx)) {
            return true;
        }
        if ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) && !a1.b(g.a(str))) {
            return a1.b(g.b(str));
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.f38256h.containsKey(str)) {
            return this.f38256h.get(str);
        }
        return null;
    }
}
