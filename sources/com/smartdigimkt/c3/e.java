package com.smartdigimkt.c3;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class e {
    private static final String g = "DownLoadManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static e f34101h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f34102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34103b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, o> f34104c = new ConcurrentHashMap<>();
    private Map<String, List<Map<String, c>>> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<com.smartdigimkt.x.d>> f34105e;
    private ConcurrentHashMap<String, CopyOnWriteArrayList<c>> f;

    private e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f34102a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static e a() {
        if (f34101h == null) {
            synchronized (e.class) {
                try {
                    if (f34101h == null) {
                        f34101h = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34101h;
    }

    public CopyOnWriteArrayList<c> b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<c>> concurrentHashMap = this.f;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f.get(str);
    }

    public CopyOnWriteArrayList<com.smartdigimkt.x.d> c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<com.smartdigimkt.x.d>> concurrentHashMap = this.f34105e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f34105e.get(str);
    }

    public List<Map<String, c>> d(String str) {
        Map<String, List<Map<String, c>>> map = this.d;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.d.get(str);
    }

    public o e(String str) {
        ConcurrentHashMap<String, o> concurrentHashMap = this.f34104c;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f34104c.get(str);
    }

    public void f(String str) {
        o oVarE = e(str);
        if (oVarE != null) {
            oVarE.d();
        }
    }

    public boolean b(int i2, String str, boolean z2) {
        try {
            o oVarE = e(str);
            return (oVarE == null || oVarE.b(i2, z2) == null) ? false : true;
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
    }

    public void c() {
        ConcurrentHashMap<String, o> concurrentHashMap = this.f34104c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                o value = it.next().getValue();
                if (value != null) {
                    value.f();
                }
            }
        }
    }

    public c a(String str, String str2) {
        o oVarE = e(str);
        if (oVarE != null) {
            return oVarE.a(str2);
        }
        return null;
    }

    public void b(String str, String str2) {
        o oVarE = e(str);
        if (oVarE != null) {
            try {
                oVarE.b(str2);
            } catch (Exception unused) {
            }
        }
    }

    public c a(int i2, String str, boolean z2) {
        o oVarE = e(str);
        if (oVarE != null) {
            return oVarE.a(i2, z2);
        }
        return null;
    }

    public void b(boolean z2) {
        this.f34103b = z2;
        ConcurrentHashMap<String, o> concurrentHashMap = this.f34104c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                o value = it.next().getValue();
                if (value != null) {
                    value.e();
                }
            }
        }
    }

    public boolean a(int i2, String str, boolean z2, int i3, boolean z3, int i4, List<com.smartdigimkt.x.d> list) {
        return a(i2, str, z2, i3, z3, i4, list, false);
    }

    public boolean a(int i2, String str, boolean z2, int i3, boolean z3, int i4, List<com.smartdigimkt.x.d> list, boolean z4) {
        Exception exc;
        com.smartdigimkt.x.d dVar;
        boolean z5 = false;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    o oVarE = e(str);
                    if (oVarE != null) {
                        List<c> listA = oVarE.a(str, i2, z2, list, z4);
                        if (listA != null && listA.size() != 0) {
                            if (z3) {
                                boolean z6 = list.size() > 0 && (dVar = list.get(0)) != null && dVar.V1() != null && dVar.V1().size() > 0 && dVar.V1().contains(0);
                                try {
                                    if (i4 == 0) {
                                        ArrayList arrayList = new ArrayList();
                                        for (c cVar : listA) {
                                            for (com.smartdigimkt.x.d dVar2 : list) {
                                                if (cVar != null && cVar.c() != null && dVar2 != null && dVar2.j().equals(cVar.c().j()) && dVar2.N1().equals(cVar.c().N1())) {
                                                    arrayList.add(cVar);
                                                }
                                            }
                                        }
                                        z5 = arrayList.size() > 0 ? true : z6;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (c cVar2 : listA) {
                                            for (com.smartdigimkt.x.d dVar3 : list) {
                                                if (cVar2 != null && cVar2.c() != null && dVar3 != null && dVar3.j().equals(cVar2.c().j()) && dVar3.N1().equals(cVar2.c().N1())) {
                                                    arrayList2.add(cVar2);
                                                }
                                            }
                                        }
                                        if (arrayList2.size() >= i3) {
                                        }
                                    }
                                } catch (Exception e2) {
                                    exc = e2;
                                    z5 = z6;
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (c cVar3 : listA) {
                                    for (com.smartdigimkt.x.d dVar4 : list) {
                                        if (cVar3 != null && cVar3.c() != null && dVar4 != null && dVar4.j().equals(cVar3.c().j()) && dVar4.N1().equals(cVar3.c().N1())) {
                                            arrayList3.add(cVar3);
                                        }
                                    }
                                }
                                if (arrayList3.size() > 0) {
                                }
                            }
                        }
                        if (z5) {
                            Map<String, List<Map<String, c>>> map = this.d;
                            if (map == null) {
                                this.d = new HashMap();
                            } else if (map.containsKey(str)) {
                                this.d.remove(str);
                            }
                            ConcurrentHashMap<String, CopyOnWriteArrayList<c>> concurrentHashMap = this.f;
                            if (concurrentHashMap == null) {
                                this.f = new ConcurrentHashMap<>();
                            } else if (concurrentHashMap.containsKey(str)) {
                                this.f.remove(str);
                            }
                            ConcurrentHashMap<String, CopyOnWriteArrayList<com.smartdigimkt.x.d>> concurrentHashMap2 = this.f34105e;
                            if (concurrentHashMap2 == null) {
                                this.f34105e = new ConcurrentHashMap<>();
                            } else if (concurrentHashMap2.containsKey(str)) {
                                this.f34105e.remove(str);
                            }
                            if (listA != null && listA.size() > 0) {
                                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                                CopyOnWriteArrayList<c> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                                for (c cVar4 : listA) {
                                    ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                                    com.smartdigimkt.x.d dVarC = cVar4.c();
                                    concurrentHashMap3.put(dVarC.j() + dVarC.u2() + dVarC.e0(), cVar4);
                                    copyOnWriteArrayList.add(concurrentHashMap3);
                                    copyOnWriteArrayList2.add(dVarC);
                                    copyOnWriteArrayList3.add(cVar4);
                                }
                                this.d.put(str, copyOnWriteArrayList);
                                this.f34105e.put(str, copyOnWriteArrayList2);
                                this.f.put(str, copyOnWriteArrayList3);
                            }
                        }
                    }
                    return z5;
                }
            } catch (Exception e3) {
                exc = e3;
            }
            if (com.smartdigimkt.b.b.f33800a) {
                exc.printStackTrace();
            }
        }
        return z5;
    }

    public void b() {
        ConcurrentHashMap<String, o> concurrentHashMap = this.f34104c;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, o> entry : concurrentHashMap.entrySet()) {
                a(entry.getValue(), entry.getKey());
            }
        }
    }

    public o a(Context context, String str, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, int i2, com.smartdigimkt.e3.c cVar) {
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (this.f34104c.containsKey(str)) {
            o oVar = this.f34104c.get(str);
            if (i2 != 94 && i2 != 287) {
                oVar.a(cVar);
            } else {
                oVar.a(copyOnWriteArrayList.get(0).N1(), cVar);
            }
            oVar.c(copyOnWriteArrayList);
            return oVar;
        }
        o oVar2 = new o(context, copyOnWriteArrayList, this.f34102a, str, i2);
        if (cVar != null) {
            oVar2.a(cVar);
        }
        this.f34104c.put(str, oVar2);
        return oVar2;
    }

    public o a(Context context, String str, com.smartdigimkt.x.d dVar, int i2, com.smartdigimkt.e3.c cVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return null;
        }
        if (this.f34104c.containsKey(str)) {
            o oVar = this.f34104c.get(str);
            if (i2 != 94 && i2 != 287) {
                oVar.a(cVar);
            } else {
                oVar.a(dVar.N1(), cVar);
            }
            oVar.e(dVar);
            return oVar;
        }
        o oVar2 = new o(context, dVar, this.f34102a, str, i2);
        if (cVar != null) {
            oVar2.a(cVar);
        }
        this.f34104c.put(str, oVar2);
        return oVar2;
    }

    public void a(boolean z2) {
        if (z2) {
            if (this.f34103b) {
                return;
            }
        } else {
            this.f34103b = false;
        }
        ConcurrentHashMap<String, o> concurrentHashMap = this.f34104c;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, o>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().d();
            }
        }
    }

    private void a(o oVar, String str) {
        try {
            com.smartdigimkt.f3.d dVarB = com.smartdigimkt.f3.c.b().b(com.smartdigimkt.u.a.f().a(), str);
            if (dVarB == null) {
                return;
            }
            if (dVarB.u() == 2) {
                oVar.e();
            } else {
                oVar.d();
            }
        } catch (Exception e2) {
            e2.getMessage();
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.smartdigimkt.n1.c cVarE = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), str);
                if (cVarE == null) {
                    cVarE = com.smartdigimkt.n1.c.b(str);
                }
                if (cVarE.r() == 2) {
                    oVar.e();
                } else {
                    oVar.d();
                }
            } catch (Exception e3) {
                e3.getMessage();
            }
        }
    }

    public void a(String str) {
        o oVarE = e(str);
        if (oVarE != null) {
            oVarE.a();
        }
    }
}
