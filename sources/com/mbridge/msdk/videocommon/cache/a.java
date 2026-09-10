package com.mbridge.msdk.videocommon.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.videocommon.setting.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38194b = "com.mbridge.msdk.videocommon.cache.a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f38195c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f38196a;

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.cache.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0210a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f38198b;

        public RunnableC0210a(String str, CampaignEx campaignEx) {
            this.f38197a = str;
            this.f38198b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f38197a, this.f38198b);
        }
    }

    private a() {
        try {
            Context contextD = c.n().d();
            if (contextD != null) {
                this.f38196a = e.a(g.a(contextD));
            } else {
                q0.b(f38194b, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static a a() {
        if (f38195c == null) {
            synchronized (a.class) {
                try {
                    if (f38195c == null) {
                        f38195c = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f38195c;
    }

    public void b(String str, String str2) {
        if (this.f38196a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f38196a.a(str, str2);
    }

    public CopyOnWriteArrayList<CampaignEx> c(String str, int i10) {
        List<CampaignEx> listA;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listA = this.f38196a.a(str, 0, 0, i10)) == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : listA) {
                    if (campaignEx != null) {
                        copyOnWriteArrayList2.add(campaignEx);
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e10) {
                e = e10;
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        e.printStackTrace();
        return copyOnWriteArrayList;
    }

    public synchronized void d(String str, String str2) {
        try {
            this.f38196a.f(str2, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<CampaignEx> b(String str, int i10, boolean z10) {
        return b(str, i10, z10, "");
    }

    public CopyOnWriteArrayList<CampaignEx> b(String str, int i10, boolean z10, String str2) {
        Exception exc;
        List<CampaignEx> listA;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (!TextUtils.isEmpty(str)) {
                if (z10) {
                    listA = this.f38196a.a(str, 0, 0, i10, str2);
                } else {
                    listA = this.f38196a.a(str, 0, 0, i10, false);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (listA != null) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    try {
                        for (CampaignEx campaignEx : listA) {
                            if (campaignEx != null && (campaignEx.getReadyState() == 0 || campaignEx.getLoadTimeoutState() == 1)) {
                                long plct = campaignEx.getPlct() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jE >= timestamp)) {
                                    copyOnWriteArrayList2.add(campaignEx);
                                }
                            }
                        }
                        return copyOnWriteArrayList2;
                    } catch (Exception e10) {
                        exc = e10;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        exc.printStackTrace();
                        return copyOnWriteArrayList;
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            exc = e11;
        }
    }

    public void a(String str, List<CampaignEx> list, String str2, int i10) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || TextUtils.isEmpty(str2) || (eVar = this.f38196a) == null) {
            return;
        }
        eVar.a(str, list, str2, i10);
    }

    public List<CampaignEx> c(String str, int i10, boolean z10) {
        return c(str, i10, z10, "");
    }

    public List<CampaignEx> c(String str, int i10, boolean z10, String str2) {
        Exception exc;
        long jD0;
        List<CampaignEx> listA;
        ArrayList arrayList = null;
        try {
            com.mbridge.msdk.setting.g gVarF = i.b().f(c.n().b());
            if (gVarF != null) {
                jD0 = gVarF.d0();
            } else {
                jD0 = i.b().a().d0();
            }
            long j10 = jD0 * 1000;
            if (!TextUtils.isEmpty(str)) {
                if (z10) {
                    listA = this.f38196a.a(str, 0, 0, i10, str2);
                } else {
                    listA = this.f38196a.a(str, 0, 0, i10, false);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (listA != null) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (CampaignEx campaignEx : listA) {
                            if (campaignEx != null && campaignEx.getReadyState() == 0) {
                                long plctb = campaignEx.getPlctb() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plctb <= 0 && j10 >= timestamp) || (plctb > 0 && plctb >= timestamp)) {
                                    arrayList2.add(campaignEx);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e10) {
                        exc = e10;
                        arrayList = arrayList2;
                        exc.printStackTrace();
                        return arrayList;
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            exc = e11;
        }
    }

    public void a(String str, List<CampaignEx> list) {
        e eVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f38196a) == null) {
            return;
        }
        eVar.b(str, list);
    }

    public void a(String str, List<CampaignEx> list, String str2) {
        e eVar;
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (eVar = this.f38196a) == null) {
                return;
            }
            eVar.a(str, list, str2);
        } catch (Exception e10) {
            q0.b(f38194b, e10.getMessage());
        }
    }

    public List<CampaignEx> a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list != null) {
            try {
                com.mbridge.msdk.videocommon.setting.a aVarC = b.b().c();
                long jE = aVarC != null ? aVarC.e() : 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (list.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (CampaignEx campaignEx : list) {
                            if (campaignEx != null) {
                                long plct = campaignEx.getPlct() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jE >= timestamp)) {
                                    arrayList2.add(campaignEx);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e10) {
                        e = e10;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return arrayList;
    }

    public void b(String str, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0210a(str, campaignEx));
    }

    public void b(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMapF;
        try {
            if (TextUtils.isEmpty(str) || (concurrentHashMapF = this.f38196a.f(str)) == null || concurrentHashMapF.size() <= 0) {
                return;
            }
            com.mbridge.msdk.setting.g gVarF = i.b().f(c.n().b());
            if (gVarF == null) {
                gVarF = i.b().a();
            }
            long jD0 = gVarF != null ? gVarF.d0() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (com.mbridge.msdk.foundation.entity.c cVar : concurrentHashMapF.values()) {
                if (cVar != null) {
                    long jE = cVar.e();
                    if (jE <= 0) {
                        jE = jD0;
                    }
                    if ((jE * 1000) + cVar.f() < jCurrentTimeMillis && !TextUtils.isEmpty(cVar.a())) {
                        q0.b("HBOPTIMIZE", "不在有效期范围内 删除" + cVar.a());
                        d(str, cVar.a());
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<com.mbridge.msdk.foundation.entity.c> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f38196a.d(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void c(String str, String str2) {
        e eVar = this.f38196a;
        if (eVar != null) {
            eVar.c(str, str2);
        }
    }

    public int a(String str, int i10, boolean z10, String str2) {
        List<CampaignEx> listA;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z10) {
                listA = this.f38196a.a(str, 0, 0, i10, str2);
            } else {
                listA = this.f38196a.a(str, 0, 0, i10, false);
            }
            if (listA == null) {
                return 0;
            }
            for (CampaignEx campaignEx : listA) {
                if (campaignEx != null && campaignEx.getReadyState() == 0) {
                    arrayList.add(campaignEx);
                }
            }
            return arrayList.size();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public synchronized void b(String str, int i10) {
        try {
            try {
                com.mbridge.msdk.setting.g gVarF = i.b().f(c.n().b());
                if (gVarF == null) {
                    gVarF = i.b().a();
                }
                int iF = gVarF.f();
                if (iF == 0) {
                    return;
                }
                List<CampaignEx> listB = this.f38196a.b(str, i10, iF == 2);
                if (listB != null && listB.size() > 0) {
                    for (CampaignEx campaignEx : listB) {
                        String requestIdNotice = campaignEx.getRequestIdNotice();
                        String id2 = campaignEx.getId();
                        com.mbridge.msdk.videocommon.a.e(campaignEx.getCampaignUnitId() + "_" + id2 + "_" + requestIdNotice + "_" + campaignEx.getCMPTEntryUrl());
                    }
                }
                this.f38196a.a(str, i10, iF == 2);
            } catch (Exception e10) {
                q0.b(f38194b, e10.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public List<CampaignEx> a(String str, int i10, boolean z10) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f38196a.a(str, 0, 0, i10, z10);
        } catch (Exception e10) {
            q0.b(f38194b, e10.getLocalizedMessage());
            return null;
        }
    }

    public void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    com.mbridge.msdk.foundation.same.buffer.b.c(str, campaignEx.getRequestId());
                }
                String localRequestId = campaignEx.getLocalRequestId();
                if (!TextUtils.isEmpty(localRequestId)) {
                    boolean z10 = true;
                    if (campaignEx.getSecondRequestIndex() != 1 && !localRequestId.contains("label_second")) {
                        z10 = false;
                    }
                    if (localRequestId.contains("label_second")) {
                        localRequestId = localRequestId.replace("label_second", "");
                    }
                    if (z10) {
                        this.f38196a.a(str, localRequestId, localRequestId + "label_second");
                        return;
                    }
                    this.f38196a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                this.f38196a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String localRequestId = campaignEx.getLocalRequestId();
                if (!TextUtils.isEmpty(localRequestId)) {
                    boolean z10 = true;
                    if (campaignEx.getSecondRequestIndex() != 1 && !localRequestId.contains("label_second")) {
                        z10 = false;
                    }
                    if (localRequestId.contains("label_second")) {
                        localRequestId = localRequestId.replace("label_second", "");
                    }
                    if (z10) {
                        this.f38196a.a(str, localRequestId, localRequestId + "label_second");
                        return;
                    }
                    this.f38196a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                this.f38196a.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getId())) {
                    return;
                }
                this.f38196a.d(campaignEx.getId(), campaignEx.getRequestId());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            List<com.mbridge.msdk.foundation.entity.c> listD = this.f38196a.d(str);
            if (str2.contains("label_second")) {
                String strReplace = str2.replace("label_second", "");
                if (listD == null || listD.isEmpty() || TextUtils.isEmpty(strReplace)) {
                    return;
                }
                for (com.mbridge.msdk.foundation.entity.c cVar : listD) {
                    if (strReplace.equals(cVar.d())) {
                        d(str, cVar.a());
                        com.mbridge.msdk.foundation.same.buffer.b.c(str, cVar.a());
                        return;
                    }
                }
                return;
            }
            String strConcat = str2.concat("label_second");
            if (listD == null || listD.isEmpty() || TextUtils.isEmpty(strConcat)) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.entity.c> it = listD.iterator();
            while (it.hasNext()) {
                if (strConcat.equals(it.next().d())) {
                    for (com.mbridge.msdk.foundation.entity.c cVar2 : listD) {
                        if (str2.equals(cVar2.d())) {
                            d(str, cVar2.a());
                            com.mbridge.msdk.foundation.same.buffer.b.c(str, cVar2.a());
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (Exception e10) {
            q0.b("videoCache", e10.getMessage());
        }
    }

    public void a(String str, int i10) {
        int size;
        try {
            List<com.mbridge.msdk.foundation.entity.c> listD = this.f38196a.d(str);
            if (listD == null || listD.size() <= 0 || (size = listD.size() - i10) <= 0) {
                return;
            }
            for (int i11 = 0; i11 < size; i11++) {
                d(str, listD.get(i11).a());
                com.mbridge.msdk.foundation.same.buffer.b.c(str, listD.get(i11).a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str, String str2, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str2) || list == null || list.size() <= 0) {
                return;
            }
            this.f38196a.a(list, str, str2, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public synchronized void a(long j10, String str) {
        try {
            this.f38196a.b(j10, str);
        } catch (Exception e10) {
            e10.printStackTrace();
            q0.b(f38194b, e10.getMessage());
        }
    }
}
