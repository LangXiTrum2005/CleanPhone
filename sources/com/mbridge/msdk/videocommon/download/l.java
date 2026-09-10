package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f38262c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f38264e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f38267h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f38269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f38270k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38271m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f38274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38275q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<CampaignEx> f38260a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38261b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38263d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f38265f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> f38266g = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f38268i = 3600;
    private int l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    m f38272n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    m f38273o = null;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements c {
        public a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j10, int i10) {
            if (i10 == 5 || i10 == 4) {
                l.this.f38261b = true;
                l.this.d();
            }
            if (i10 == 2) {
                l.this.f38261b = true;
            }
        }
    }

    public l(Context context, List<CampaignEx> list, String str, int i10) {
        this.f38271m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f38275q = zB;
            if (zB) {
                this.f38269j = str;
                this.f38271m = i10;
                this.f38274p = new k(list, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f38274p = null;
            this.f38275q = false;
        }
        this.f38267h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list2 = this.f38260a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f38269j = str;
        this.f38271m = i10;
        a(this.f38260a);
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.f38275q || (kVar = this.f38274p) == null) ? this.f38266g : kVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    public void d() {
        int iG;
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.j();
            return;
        }
        b();
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f38266g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    if (!a(this.f38266g)) {
                        this.f38261b = true;
                    }
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f38266g) {
                        if (map != null) {
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && !value.t()) {
                                    if (this.f38271m == 95) {
                                        this.f38261b = true;
                                    }
                                    int iO = value.o();
                                    CampaignEx campaignExH = value.h();
                                    if (campaignExH != null && iO == 0) {
                                        iO = com.mbridge.msdk.videocommon.download.b.getInstance().b(campaignExH.getId(), campaignExH.getVideoUrlEncode());
                                    }
                                    int i10 = iO;
                                    value.a(new b(campaignExH));
                                    int iB = b(campaignExH);
                                    if (this.f38271m == 1) {
                                        if (this.f38272n == null) {
                                            this.f38272n = m.i(this.f38269j);
                                        }
                                        iB = a(campaignExH);
                                    }
                                    int i11 = iB;
                                    value.d(i11);
                                    int i12 = this.f38271m;
                                    if (i12 == 94 || i12 == 287 || i12 == 95) {
                                        if (this.f38270k == null) {
                                            this.f38270k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j, this.f38271m == 287);
                                        }
                                        com.mbridge.msdk.videocommon.setting.c cVar = this.f38270k;
                                        iG = cVar != null ? cVar.g() : 0;
                                    } else {
                                        if (i12 != 298) {
                                            iG = 0;
                                        } else {
                                            if (this.f38273o == null) {
                                                this.f38273o = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
                                            }
                                            m mVar = this.f38273o;
                                            if (mVar != null) {
                                                iG = mVar.i();
                                            } else {
                                                iG = 0;
                                            }
                                        }
                                        if (this.f38271m == 1) {
                                            if (this.f38272n == null) {
                                                this.f38272n = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
                                            }
                                            m mVar2 = this.f38272n;
                                            if (mVar2 != null) {
                                                iG = mVar2.i();
                                            }
                                        }
                                    }
                                    value.b(iG);
                                    int videoCtnType = campaignExH != null ? campaignExH.getVideoCtnType() : 1;
                                    value.e(videoCtnType);
                                    q0.b("UnitCacheCtroller", "ready_rate : " + i11 + " cd_rate : " + iG + " videoCtnType : " + videoCtnType);
                                    if (a(value, b(campaignExH))) {
                                        String videoUrlEncode = campaignExH != null ? campaignExH.getVideoUrlEncode() : "";
                                        com.mbridge.msdk.videocommon.listener.a aVar = this.f38262c;
                                        if (aVar != null) {
                                            int i13 = this.f38271m;
                                            if (i13 == 297 || i13 == 298) {
                                                try {
                                                    aVar.a(videoUrlEncode);
                                                } catch (Exception e10) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("UnitCacheCtroller", e10.getMessage());
                                                    }
                                                }
                                            }
                                        }
                                        ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f38264e;
                                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                                            String requestId = campaignExH != null ? campaignExH.getRequestId() : "";
                                            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f38264e.get(requestId + "_" + campaignExH.getSecondRequestIndex());
                                            if (aVar2 != null) {
                                                try {
                                                    aVar2.a(videoUrlEncode);
                                                } catch (Exception e11) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        q0.b("UnitCacheCtroller", e11.getMessage());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i10 != 1 && (i10 != 5 || !a(value, i11))) {
                                        if (i10 == 4) {
                                            continue;
                                        } else {
                                            if (m0.s(this.f38267h) != 9 && this.l == 2) {
                                                return;
                                            }
                                            if (i10 == 2 || this.f38261b) {
                                                value.a(this.f38265f);
                                                if (a(value, i11)) {
                                                    int i14 = this.f38271m;
                                                    if (i14 == 94 || i14 == 287) {
                                                        value.B();
                                                    }
                                                } else {
                                                    int i15 = this.f38271m;
                                                    if (i15 == 1 || i15 == 95 || i15 == 298) {
                                                        this.f38261b = false;
                                                    }
                                                    value.B();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void e() {
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f38266g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f38266g) {
                            if (map != null) {
                                Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                    if (value != null && value.o() == 1) {
                                        value.c("playing and stop download");
                                        value.g();
                                        this.f38266g.remove(map);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("UnitCacheCtroller", th3.getMessage());
                }
            }
        }
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f38260a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.f38260a);
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f38260a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f38260a);
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f38273o == null) {
                    this.f38273o = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
                }
                return this.f38273o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.f38270k == null) {
                this.f38270k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j, false);
            }
            return this.f38270k.w();
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return 100;
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.a(aVar);
        } else {
            this.f38262c = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f38277a;

        public b(CampaignEx campaignEx) {
            this.f38277a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            if (l.this.f38262c != null) {
                l.this.f38262c.a(str);
            }
            if (l.this.f38264e == null || l.this.f38264e.size() <= 0 || this.f38277a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f38264e.get(this.f38277a.getRequestId() + "_" + this.f38277a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str);
                l.this.f38264e.remove(this.f38277a.getRequestId() + "_" + this.f38277a.getSecondRequestIndex());
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            if (l.this.f38262c != null) {
                l.this.f38262c.a(str, str2);
            }
            CampaignEx campaignEx = this.f38277a;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f38277a.getRsIgnoreCheckRule().size() <= 0 || !this.f38277a.getRsIgnoreCheckRule().contains(0)) {
                if (l.this.f38264e == null || l.this.f38264e.size() <= 0 || this.f38277a == null) {
                    return;
                }
                com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f38264e.get(this.f38277a.getRequestId() + "_" + this.f38277a.getSecondRequestIndex());
                if (aVar != null) {
                    aVar.a(str, str2);
                    l.this.f38264e.remove(this.f38277a.getRequestId() + "_" + this.f38277a.getSecondRequestIndex());
                    return;
                }
                return;
            }
            q0.c("UnitCacheCtroller", "Is not check video download status");
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.f38264e == null) {
            this.f38264e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f38264e.put(str, aVar);
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.a();
            return;
        }
        if (s0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f38266g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i10 = 0;
                    while (i10 < this.f38266g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f38266g.get(i10);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null) {
                                if (jCurrentTimeMillis - value.n() > this.f38268i * 1000 && value.o() == 1) {
                                    value.c("download timeout");
                                    value.c(this.l);
                                    value.g();
                                    this.f38266g.remove(map);
                                    i10--;
                                }
                                if (value.o() != 1 && value.o() != 5 && value.o() != 0) {
                                    value.g();
                                    this.f38266g.remove(map);
                                    i10--;
                                }
                            }
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:114:0x00b2 }] */
    private void a(List<CampaignEx> list) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        com.mbridge.msdk.videocommon.setting.a aVarC;
        com.mbridge.msdk.videocommon.setting.c cVar;
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            this.f38263d = list.get(0).getCurrentLocalRid();
        }
        a();
        b();
        int i10 = this.f38271m;
        if (i10 == 1) {
            try {
                if (!TextUtils.isEmpty(this.f38269j)) {
                    m mVarE = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
                    this.f38272n = mVarE;
                    if (mVarE == null) {
                        this.f38272n = m.i(this.f38269j);
                    }
                    m mVar = this.f38272n;
                    if (mVar != null) {
                        this.f38268i = mVar.p();
                        this.l = this.f38272n.q();
                    }
                }
            } catch (Exception unused) {
                q0.b("UnitCacheCtroller", "make sure your had put native video jar into your project");
                return;
            }
        } else if (i10 == 287) {
            try {
                aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
                if (aVarC == null) {
                    com.mbridge.msdk.videocommon.setting.b.b().a();
                }
                if (aVarC != null) {
                    this.f38268i = aVarC.c();
                }
                if (!TextUtils.isEmpty(this.f38269j)) {
                    this.f38270k = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
                }
                cVar = this.f38270k;
                if (cVar != null) {
                    this.l = cVar.l();
                }
            } catch (Exception unused2) {
                q0.b("UnitCacheCtroller", "make sure your had put reward jar into your project");
                return;
            }
        } else if (i10 == 298) {
            m mVarA = com.mbridge.msdk.setting.i.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
            this.f38273o = mVarA;
            if (mVarA == null) {
                this.f38273o = com.mbridge.msdk.setting.i.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
            }
            m mVar2 = this.f38273o;
            if (mVar2 != null) {
                this.f38268i = mVar2.p();
                this.l = this.f38273o.q();
            }
        } else if (i10 == 94) {
            aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            if (aVarC != null) {
                this.f38268i = aVarC.c();
            }
            if (!TextUtils.isEmpty(this.f38269j)) {
                this.f38270k = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
            }
            cVar = this.f38270k;
            if (cVar != null) {
                this.l = cVar.l();
            }
        } else if (i10 == 95) {
            try {
                if (!TextUtils.isEmpty(this.f38269j)) {
                    m mVarE2 = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38269j);
                    if (mVarE2 == null) {
                        mVarE2 = m.j(this.f38269j);
                    }
                    if (mVarE2 != null) {
                        this.f38268i = mVarE2.p();
                        this.l = mVarE2.q();
                    }
                }
            } catch (Exception unused3) {
                q0.b("UnitCacheCtroller", "make sure your had put feeds jar into your project");
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            CampaignEx campaignEx = list.get(i11);
            if (campaignEx != null) {
                int i12 = this.f38271m;
                String str = (i12 != 94 && i12 != 287) ? campaignEx.getId() + campaignEx.getVideoUrlEncode() + campaignEx.getBidToken() : campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
                if ((d(campaignEx) || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && (copyOnWriteArrayList = this.f38266g) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i13 = 0;
                        while (true) {
                            try {
                                if (i13 < this.f38266g.size()) {
                                    Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f38266g.get(i13);
                                    if (map != null && map.containsKey(str)) {
                                        com.mbridge.msdk.videocommon.download.a aVar = map.get(str);
                                        if (aVar != null) {
                                            aVar.e(campaignEx);
                                            aVar.c(this.l);
                                            aVar.b(false);
                                            map.remove(str);
                                            map.put(str, aVar);
                                            this.f38266g.set(i13, map);
                                        }
                                        e(campaignEx);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f38267h, campaignEx, this.f38269j, this.l);
                                    aVar2.c(this.l);
                                    aVar2.a(this.f38271m);
                                    HashMap map2 = new HashMap();
                                    map2.put(str, aVar2);
                                    this.f38266g.add(map2);
                                    break;
                                }
                            } catch (Throwable th2) {
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("UnitCacheCtroller", th2.getMessage());
                                }
                            }
                        }
                        try {
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        }
        List<CampaignEx> list2 = this.f38260a;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f38260a.clear();
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", "2");
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f38271m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f38275q = zB;
            if (zB) {
                this.f38269j = str;
                this.f38271m = i10;
                this.f38274p = new k(campaignEx, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f38274p = null;
            this.f38275q = false;
        }
        this.f38267h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list = this.f38260a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f38269j = str;
        this.f38271m = i10;
        a(this.f38260a);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return c(campaignEx);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018d A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_ENTER, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x019f A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01af A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c7 A[Catch: all -> 0x0035, Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01d3 A[Catch: all -> 0x0035, Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:133:0x0212 A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x021d A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_ENTER, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x022a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0240 A[Catch: all -> 0x0035, Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0246  */
    /* JADX WARN: Code duplicated, block: B:151:0x024b A[Catch: all -> 0x0035, Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x024f A[Catch: all -> 0x0035, Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0267 A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_ENTER, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0271 A[Catch: all -> 0x0035, Exception -> 0x00dc, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x01f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0231 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x016a A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_ENTER, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x017c A[Catch: all -> 0x0035, Exception -> 0x00dc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dc, blocks: (B:45:0x00b4, B:46:0x00be, B:48:0x00c4, B:56:0x00e6, B:59:0x00ee, B:62:0x00f5, B:64:0x0105, B:65:0x010d, B:93:0x016a, B:95:0x017c, B:101:0x018d, B:103:0x0193, B:146:0x023b, B:105:0x019f, B:109:0x01a9, B:111:0x01af, B:118:0x01ba, B:120:0x01c7, B:122:0x01d3, B:124:0x01e1, B:129:0x0206, B:131:0x020c, B:133:0x0212, B:137:0x021d, B:145:0x0233, B:148:0x0240, B:151:0x024b, B:153:0x024f, B:155:0x0259, B:157:0x025f, B:161:0x0267, B:164:0x0271, B:166:0x027b, B:168:0x0281, B:69:0x011b, B:71:0x0121, B:73:0x012b, B:76:0x013a, B:78:0x0140, B:80:0x0146, B:81:0x014a, B:83:0x0150, B:87:0x0158, B:89:0x0162, B:176:0x02a5), top: B:186:0x0022 }] */
    public com.mbridge.msdk.videocommon.download.a b(int i10, boolean z10) {
        com.mbridge.msdk.videocommon.download.a aVar;
        List<CampaignEx> listC;
        com.mbridge.msdk.videocommon.download.a aVar2;
        char c4;
        boolean zIsEmpty;
        int iO;
        int i11;
        int i12;
        k kVar;
        i10 = i10;
        z10 = z10;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            return kVar.i();
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f38266g;
        com.mbridge.msdk.videocommon.download.a aVar3 = null;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                int i13 = this.f38271m;
                char c5 = 287;
                int i14 = 94;
                try {
                    if (i13 != 94 && i13 != 287) {
                        listC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f38269j, 1);
                        if (listC == null) {
                            return null;
                        }
                    } else {
                        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f38269j, 1, z10);
                        if ((listB == null || listB.size() == 0) && (i10 == 94 || i10 == 287)) {
                            listB = com.mbridge.msdk.videocommon.cache.a.a().c(this.f38269j, 1, z10);
                        }
                        if (listB != null) {
                            q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = " + listB.size());
                            listC = listB;
                        } else {
                            q0.a("UnitCacheCtroller", "UnitCache isReady campaignList = 0");
                            return null;
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i15 = 0;
                    while (i15 < this.f38266g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f38266g.get(i15);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value == null || value.h() == null) {
                                aVar2 = aVar3;
                                c4 = c5;
                                c5 = c4;
                                aVar3 = aVar2;
                                i14 = i14;
                            } else {
                                aVar2 = aVar3;
                                CampaignEx campaignExH = value.h();
                                Iterator<CampaignEx> it2 = listC.iterator();
                                boolean z11 = false;
                                while (it2.hasNext()) {
                                    if (campaignExH.getId().equals(it2.next().getId())) {
                                        z11 = true;
                                    }
                                }
                                if (z11 && ((!z10 || campaignExH.isBidCampaign()) && (z10 || !campaignExH.isBidCampaign()))) {
                                    String str = campaignExH.getendcard_url();
                                    String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                    String strJ = "";
                                    if (campaignExH.getRewardTemplateMode() != null) {
                                        strJ = campaignExH.getRewardTemplateMode().j();
                                    }
                                    String str2 = strJ;
                                    CampaignEx.c rewardTemplateMode = campaignExH.getRewardTemplateMode();
                                    if (this.f38271m == i14 || i10 == 287) {
                                        if (TextUtils.isEmpty(str2) || str2.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a(this.f38271m, campaignExH, str2)) {
                                            if (b(str, campaignExH)) {
                                                if (value.t()) {
                                                    value.y();
                                                } else {
                                                    if (a1.a(videoUrlEncode)) {
                                                        if (a(rewardTemplateMode)) {
                                                            return value;
                                                        }
                                                    } else if (a(value, b(campaignExH)) && a(rewardTemplateMode)) {
                                                        return value;
                                                    }
                                                    zIsEmpty = TextUtils.isEmpty(value.k());
                                                    iO = value.o();
                                                    if (this.f38271m != 298) {
                                                    }
                                                    if (iO == 5) {
                                                        if (value.t()) {
                                                            value.y();
                                                            this.f38266g.remove(map);
                                                        } else {
                                                            if (zIsEmpty) {
                                                                if (a(str, campaignExH)) {
                                                                }
                                                            }
                                                            value.a(0, 0);
                                                            if (this.f38271m == 95) {
                                                                return value;
                                                            }
                                                        }
                                                    } else {
                                                        if (!s0.a().a("u_n_c_e_d", true)) {
                                                            long jN = value.n();
                                                            if (value.o() == 1) {
                                                                value.c("download timeout");
                                                                value.g();
                                                                this.f38266g.remove(map);
                                                                i15--;
                                                                i12 = this.f38271m;
                                                                if (i12 != 1) {
                                                                }
                                                                aVar3 = aVar2;
                                                                c5 = 287;
                                                                i14 = 94;
                                                            }
                                                        }
                                                        if (this.f38271m == 95) {
                                                            if (!value.t()) {
                                                                return value;
                                                            }
                                                            value.y();
                                                            this.f38266g.remove(map);
                                                        } else {
                                                            if (!s0.a().a("u_n_c_e_d", true)) {
                                                            }
                                                            if (iO == 1) {
                                                                if (!value.t()) {
                                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                        return value;
                                                                    }
                                                                    i11 = this.f38271m;
                                                                    i14 = 94;
                                                                    c4 = 287;
                                                                    if (i11 != 94) {
                                                                    }
                                                                }
                                                                i14 = 94;
                                                                c4 = 287;
                                                            } else {
                                                                i11 = this.f38271m;
                                                                i14 = 94;
                                                                c4 = 287;
                                                                if (i11 != 94) {
                                                                }
                                                            }
                                                            c5 = c4;
                                                            aVar3 = aVar2;
                                                            i14 = i14;
                                                        }
                                                    }
                                                    i15--;
                                                    aVar3 = aVar2;
                                                    c5 = 287;
                                                    i14 = 94;
                                                }
                                            } else {
                                                zIsEmpty = TextUtils.isEmpty(value.k());
                                                iO = value.o();
                                                if (this.f38271m != 298 && a(value, b(campaignExH))) {
                                                    return value;
                                                }
                                                if (iO == 5) {
                                                    if (value.t()) {
                                                        value.y();
                                                        this.f38266g.remove(map);
                                                    } else {
                                                        if (zIsEmpty) {
                                                            return (a(str, campaignExH) || !a(rewardTemplateMode)) ? aVar2 : value;
                                                        }
                                                        value.a(0, 0);
                                                        if (this.f38271m == 95) {
                                                            return value;
                                                        }
                                                    }
                                                } else {
                                                    if (!s0.a().a("u_n_c_e_d", true)) {
                                                        long jN2 = value.n();
                                                        if (value.o() == 1 && jCurrentTimeMillis - jN2 > this.f38268i * 1000) {
                                                            value.c("download timeout");
                                                            value.g();
                                                            this.f38266g.remove(map);
                                                            i15--;
                                                            i12 = this.f38271m;
                                                            if (i12 != 1 || i12 == 94) {
                                                            }
                                                            aVar3 = aVar2;
                                                            c5 = 287;
                                                            i14 = 94;
                                                        }
                                                    }
                                                    if (this.f38271m == 95) {
                                                        if (!value.t()) {
                                                            return value;
                                                        }
                                                        value.y();
                                                        this.f38266g.remove(map);
                                                    } else {
                                                        if (!s0.a().a("u_n_c_e_d", true) || (iO != 4 && iO != 2)) {
                                                            if (iO == 1) {
                                                                if (!value.t()) {
                                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && a(value, b(campaignExH)) && a(str, campaignExH) && a(rewardTemplateMode)) {
                                                                        return value;
                                                                    }
                                                                    i11 = this.f38271m;
                                                                    i14 = 94;
                                                                    c4 = 287;
                                                                    return i11 != 94 ? value : value;
                                                                }
                                                                i14 = 94;
                                                                c4 = 287;
                                                            } else {
                                                                i11 = this.f38271m;
                                                                i14 = 94;
                                                                c4 = 287;
                                                                if ((i11 != 94 || i11 == 287) && a(value, b(campaignExH)) && a(str, campaignExH) && a(rewardTemplateMode)) {
                                                                }
                                                            }
                                                            c5 = c4;
                                                            aVar3 = aVar2;
                                                            i14 = i14;
                                                        }
                                                        this.f38266g.remove(map);
                                                        value.g();
                                                    }
                                                }
                                                i15--;
                                                aVar3 = aVar2;
                                                c5 = 287;
                                                i14 = 94;
                                            }
                                        }
                                        i14 = 94;
                                        c4 = 287;
                                        c5 = c4;
                                        aVar3 = aVar2;
                                        i14 = i14;
                                    } else {
                                        zIsEmpty = TextUtils.isEmpty(value.k());
                                        iO = value.o();
                                        if (this.f38271m != 298) {
                                        }
                                        if (iO == 5) {
                                            if (value.t()) {
                                                value.y();
                                                this.f38266g.remove(map);
                                            } else {
                                                if (zIsEmpty) {
                                                    if (a(str, campaignExH)) {
                                                    }
                                                }
                                                value.a(0, 0);
                                                if (this.f38271m == 95) {
                                                    return value;
                                                }
                                                i14 = 94;
                                                c4 = 287;
                                                c5 = c4;
                                                aVar3 = aVar2;
                                                i14 = i14;
                                            }
                                        } else {
                                            if (!s0.a().a("u_n_c_e_d", true)) {
                                                long jN3 = value.n();
                                                if (value.o() == 1) {
                                                    value.c("download timeout");
                                                    value.g();
                                                    this.f38266g.remove(map);
                                                    i15--;
                                                    i12 = this.f38271m;
                                                    if (i12 != 1) {
                                                    }
                                                    aVar3 = aVar2;
                                                    c5 = 287;
                                                    i14 = 94;
                                                }
                                            }
                                            if (this.f38271m == 95) {
                                                if (!value.t()) {
                                                    return value;
                                                }
                                                value.y();
                                                this.f38266g.remove(map);
                                            } else {
                                                if (!s0.a().a("u_n_c_e_d", true)) {
                                                }
                                                if (iO == 1) {
                                                    if (!value.t()) {
                                                        if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                            return value;
                                                        }
                                                        i11 = this.f38271m;
                                                        i14 = 94;
                                                        c4 = 287;
                                                        if (i11 != 94) {
                                                        }
                                                    }
                                                    i14 = 94;
                                                    c4 = 287;
                                                } else {
                                                    i11 = this.f38271m;
                                                    i14 = 94;
                                                    c4 = 287;
                                                    if (i11 != 94) {
                                                    }
                                                }
                                                c5 = c4;
                                                aVar3 = aVar2;
                                                i14 = i14;
                                            }
                                        }
                                        i15--;
                                        aVar3 = aVar2;
                                        c5 = 287;
                                        i14 = 94;
                                    }
                                } else {
                                    c4 = c5;
                                    c5 = c4;
                                    aVar3 = aVar2;
                                    i14 = i14;
                                }
                            }
                        }
                        i15++;
                        i10 = i10;
                        i14 = i14;
                        z10 = z10;
                    }
                    aVar = aVar3;
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Exception e11) {
                e = e11;
                aVar = aVar3;
            }
            return aVar;
        }
    }

    private boolean d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f38266g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f38266g.size()) {
                        try {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f38266g.get(i10);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.h() != null && value.t()) {
                                    value.y();
                                    this.f38266g.remove(map);
                                    i10--;
                                }
                            }
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ab A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cf A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x020a  */
    /* JADX WARN: Code duplicated, block: B:128:0x020f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x0228 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x022e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0232 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0236 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0255 A[PHI: r16
  0x0255: PHI (r16v11 java.lang.String) = (r16v10 java.lang.String), (r16v10 java.lang.String), (r16v12 java.lang.String) binds: [B:134:0x0226, B:139:0x0234, B:147:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0259  */
    /* JADX WARN: Code duplicated, block: B:156:0x026d A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0187 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x018d A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x019c A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a4 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    public List<com.mbridge.msdk.videocommon.download.a> a(String str, int i10, boolean z10, List<CampaignEx> list, boolean z11, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        long j10;
        String str2;
        String str3;
        boolean zIsEmpty;
        int iO;
        int i11;
        int i12;
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            return kVar.a(list, z11);
        }
        ArrayList arrayList = new ArrayList();
        String str4 = "";
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f38266g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i13 = 0;
                        while (i13 < this.f38266g.size()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f38266g.get(i13);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                try {
                                    com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                    if (value != null && value.h() != null) {
                                        CampaignEx campaignExH = value.h();
                                        boolean z12 = false;
                                        for (CampaignEx campaignEx : list) {
                                            if (campaignExH != null && campaignEx != null && !TextUtils.isEmpty(campaignExH.getRequestId()) && !TextUtils.isEmpty(campaignEx.getRequestId()) && campaignExH.getId().equals(campaignEx.getId()) && campaignExH.getRequestId().equals(campaignEx.getRequestId())) {
                                                if (!TextUtils.isEmpty(campaignEx.getNLRid())) {
                                                    campaignExH.setNLRid(campaignEx.getNLRid());
                                                }
                                                z12 = true;
                                            }
                                        }
                                        if (!z12) {
                                            str4 = "campaign is not available";
                                            j10 = jCurrentTimeMillis;
                                        } else if ((!z10 || campaignExH.isBidCampaign()) && (z10 || !campaignExH.isBidCampaign())) {
                                            String str5 = campaignExH.getendcard_url();
                                            String videoUrlEncode = campaignExH.getVideoUrlEncode();
                                            String strJ = "";
                                            if (campaignExH.getRewardTemplateMode() != null) {
                                                strJ = campaignExH.getRewardTemplateMode().j();
                                            }
                                            String str6 = strJ;
                                            String str7 = str4;
                                            try {
                                                CampaignEx.c rewardTemplateMode = campaignExH.getRewardTemplateMode();
                                                j10 = jCurrentTimeMillis;
                                                if (i10 == 94 || i10 == 287) {
                                                    if (!TextUtils.isEmpty(str6) && !str6.contains(CampaignEx.KEY_IS_CMPT_ENTRY) && !a(i10, campaignExH, str6)) {
                                                        str3 = "template is null or download is not ready";
                                                    } else {
                                                        if (b(str5, campaignExH)) {
                                                            if (value.t()) {
                                                                value.y();
                                                                str3 = "task is displayed";
                                                            } else {
                                                                if (a1.a(videoUrlEncode)) {
                                                                    if (a(rewardTemplateMode)) {
                                                                        arrayList.add(value);
                                                                    } else {
                                                                        str2 = "image list is downloading or fail";
                                                                    }
                                                                } else if (a(value, b(campaignExH), z11) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str2 = "video and image list is downloading or fail";
                                                                }
                                                                str4 = str7;
                                                            }
                                                        } else {
                                                            str2 = "endcard is downloading or fail";
                                                        }
                                                        str7 = str2;
                                                        zIsEmpty = TextUtils.isEmpty(value.k());
                                                        iO = value.o();
                                                        if (iO == 5) {
                                                            if (value.t()) {
                                                                value.y();
                                                                this.f38266g.remove(map);
                                                                i13--;
                                                                str3 = "task is displayed";
                                                            } else {
                                                                if (!zIsEmpty) {
                                                                    value.a(0, 0);
                                                                    if (i10 == 95) {
                                                                        arrayList.add(value);
                                                                    } else {
                                                                        str3 = "resource path is not effective";
                                                                    }
                                                                } else {
                                                                    if (a(str5, campaignExH) || !a(rewardTemplateMode)) {
                                                                        return null;
                                                                    }
                                                                    arrayList.add(value);
                                                                }
                                                                str4 = str7;
                                                            }
                                                        } else {
                                                            i11 = i13;
                                                            if (s0.a().a("u_n_c_e_d", true)) {
                                                                i12 = 1;
                                                                i13 = i11;
                                                            } else {
                                                                long jN = value.n();
                                                                if (value.o() == 1 || j10 - jN <= this.f38268i * 1000) {
                                                                    i13 = i11;
                                                                } else {
                                                                    value.c("download timeout");
                                                                    value.g();
                                                                    this.f38266g.remove(map);
                                                                    i13 = i11 - 1;
                                                                    if (i10 == 1 || i10 == 94) {
                                                                        str4 = "video download time over dlct";
                                                                    } else {
                                                                        str7 = "video download time over dlct";
                                                                    }
                                                                }
                                                                if (iO != 4 || iO == 2) {
                                                                    this.f38266g.remove(map);
                                                                    value.g();
                                                                    i13--;
                                                                    str3 = "video download stop or pause";
                                                                } else {
                                                                    i12 = 1;
                                                                }
                                                            }
                                                            if (iO == i12) {
                                                                if (i10 == 94 && i10 != 287) {
                                                                    str4 = str7;
                                                                } else if (!a(value, b(campaignExH), z11) && a(str5, campaignExH) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                    str4 = str7;
                                                                } else {
                                                                    str3 = "video or endcard or image list is downloading or fail";
                                                                }
                                                            } else if (value.t()) {
                                                                str3 = "video was displayed";
                                                            } else if (MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                if (!a(value, b(campaignExH), z11) && a(str5, campaignExH) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str7 = "video or endcard or image list is downloading or fail";
                                                                    if (i10 == 94) {
                                                                    }
                                                                    if (!a(value, b(campaignExH), z11)) {
                                                                    }
                                                                    str3 = "video or endcard or image list is downloading or fail";
                                                                }
                                                                str4 = str7;
                                                            } else {
                                                                if (i10 == 94) {
                                                                }
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            }
                                                        }
                                                    }
                                                    str4 = str3;
                                                } else {
                                                    zIsEmpty = TextUtils.isEmpty(value.k());
                                                    iO = value.o();
                                                    if (iO == 5) {
                                                        if (value.t()) {
                                                            value.y();
                                                            this.f38266g.remove(map);
                                                            i13--;
                                                            str3 = "task is displayed";
                                                        } else {
                                                            if (!zIsEmpty) {
                                                                value.a(0, 0);
                                                                if (i10 == 95) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str3 = "resource path is not effective";
                                                                }
                                                            } else {
                                                                if (a(str5, campaignExH)) {
                                                                }
                                                                return null;
                                                            }
                                                            str4 = str7;
                                                        }
                                                        str4 = str3;
                                                    } else {
                                                        i11 = i13;
                                                        if (s0.a().a("u_n_c_e_d", true)) {
                                                            long jN2 = value.n();
                                                            if (value.o() == 1) {
                                                                i13 = i11;
                                                                if (iO != 4) {
                                                                }
                                                                this.f38266g.remove(map);
                                                                value.g();
                                                                i13--;
                                                                str3 = "video download stop or pause";
                                                                str4 = str3;
                                                            } else {
                                                                i13 = i11;
                                                                if (iO != 4) {
                                                                }
                                                                this.f38266g.remove(map);
                                                                value.g();
                                                                i13--;
                                                                str3 = "video download stop or pause";
                                                                str4 = str3;
                                                            }
                                                        } else {
                                                            i12 = 1;
                                                            i13 = i11;
                                                        }
                                                        if (iO == i12) {
                                                            if (value.t()) {
                                                                str3 = "video was displayed";
                                                            } else if (MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str7 = "video or endcard or image list is downloading or fail";
                                                                if (i10 == 94) {
                                                                }
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            } else {
                                                                if (i10 == 94) {
                                                                }
                                                                if (!a(value, b(campaignExH), z11)) {
                                                                }
                                                                str3 = "video or endcard or image list is downloading or fail";
                                                            }
                                                            str4 = str3;
                                                        } else {
                                                            if (i10 == 94) {
                                                            }
                                                            if (!a(value, b(campaignExH), z11)) {
                                                            }
                                                            str3 = "video or endcard or image list is downloading or fail";
                                                            str4 = str3;
                                                        }
                                                    }
                                                }
                                                jCurrentTimeMillis = j10;
                                            } catch (Exception e10) {
                                                e = e10;
                                                str4 = str7;
                                                e.printStackTrace();
                                                if (arrayList.size() == 0) {
                                                    eVar.a("is_ready_fail_reason", str4);
                                                }
                                                return arrayList;
                                            }
                                        } else {
                                            list = list;
                                        }
                                        jCurrentTimeMillis = j10;
                                    } else {
                                        j10 = jCurrentTimeMillis;
                                        str4 = "task or task's campaign is NULL";
                                        i13 = i13;
                                        jCurrentTimeMillis = j10;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            }
                            i13++;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        try {
            if (arrayList.size() == 0 && eVar != null) {
                eVar.a("is_ready_fail_reason", str4);
            }
        } catch (Throwable th3) {
            q0.b("UnitCacheCtroller", th3.getMessage());
        }
        return arrayList;
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return a1.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || a1.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.f38266g) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f38266g) != null && copyOnWriteArrayList.size() > 0) {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f38266g) {
                            if (map != null) {
                                for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : map.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.f38266g.remove(map);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str, this.l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (aVar.h() != null && !TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) {
                return true;
            }
        } else if (j10 > 0 && jM * 100 >= j10 * ((long) i10)) {
            if (i10 != 100 || aVar.o() == 5) {
                return true;
            }
            aVar.g();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExH = aVar.h();
        if (campaignExH != null) {
            if (campaignExH.getRsIgnoreCheckRule() != null && campaignExH.getRsIgnoreCheckRule().size() > 0 && campaignExH.getRsIgnoreCheckRule().contains(0)) {
                q0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExH.getIsTimeoutCheckVideoStatus() == 1 && campaignExH.getVideoCheckType() == 1) {
                return true;
            }
            if (z10 && campaignExH.getVideoCheckType() == 1) {
                if (i10 == 0) {
                    return true;
                }
                if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                    campaignExH.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || b(str, campaignEx);
            }
            q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return false;
        }
    }

    private boolean a(int i10, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            q0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            q0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(int i10, boolean z10) {
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            return kVar.d();
        }
        try {
            return b(i10, z10);
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.f38275q && (kVar = this.f38274p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f38266g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f38266g) {
                        if (map != null && map.containsKey(str)) {
                            return map.get(str);
                        }
                    }
                } catch (Throwable unused) {
                    q0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            for (Map<String, com.mbridge.msdk.videocommon.download.a> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().o() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private int a(CampaignEx campaignEx) {
        try {
            m mVar = this.f38272n;
            if (mVar != null) {
                return mVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.b("UnitCacheCtroller", e10.getMessage());
            return 100;
        }
    }
}
