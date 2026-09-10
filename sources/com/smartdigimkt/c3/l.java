package com.smartdigimkt.c3;

import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, Boolean> f34122e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f34123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f34124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Boolean> f34125c;
    private ConcurrentHashMap<String, Boolean> d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static l f34126a = new l();

        private b() {
        }
    }

    public static l a() {
        return b.f34126a;
    }

    private void e(String str, boolean z2) {
        if (this.f34125c == null) {
            this.f34125c = new ConcurrentHashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34125c.put(str, Boolean.valueOf(z2));
    }

    public boolean b(String str) {
        if (this.f34123a == null || TextUtils.isEmpty(str) || !this.f34123a.containsKey(str)) {
            return false;
        }
        return this.f34123a.get(str).booleanValue();
    }

    public boolean c(String str) {
        if (this.f34124b == null || TextUtils.isEmpty(str) || !this.f34124b.containsKey(str)) {
            return false;
        }
        return this.f34124b.get(str).booleanValue();
    }

    public void d(String str, boolean z2) {
        if (this.f34124b == null) {
            this.f34124b = new ConcurrentHashMap<>();
        }
        this.f34124b.put(str, Boolean.valueOf(z2));
    }

    private l() {
        this.f34123a = new ConcurrentHashMap<>();
        this.f34124b = new ConcurrentHashMap<>();
        this.f34125c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
    }

    public void a(CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return;
        }
        for (com.smartdigimkt.x.d dVar : copyOnWriteArrayList) {
            if (dVar != null) {
                a(dVar);
                e(dVar.j(), false);
            }
        }
    }

    public void b(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            a(dVar);
            e(dVar.j(), false);
        }
    }

    public void c(String str, boolean z2) {
        if (this.f34123a == null) {
            this.f34123a = new ConcurrentHashMap<>();
        }
        this.f34123a.put(str, Boolean.valueOf(z2));
    }

    private boolean d(String str) {
        String strE = com.smartdigimkt.v0.p.e(str);
        StringBuilder sb = new StringBuilder();
        sb.append(com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_VC));
        File file = new File(android.support.v4.media.a.r(sb, File.separator, strE));
        try {
            return file.exists() && file.isFile() && file.canRead();
        } catch (Throwable th) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public void b(String str, boolean z2) {
        if (this.d == null) {
            this.d = new ConcurrentHashMap<>();
        }
        this.d.put(str, Boolean.valueOf(z2));
    }

    public void e(String str) {
        if (this.d.containsKey(str)) {
            this.d.remove(str);
        }
    }

    public void a(String str, boolean z2) {
        if (f34122e == null) {
            f34122e = new ConcurrentHashMap<>();
        }
        f34122e.put(str, Boolean.valueOf(z2));
    }

    private boolean b(boolean z2, String str) {
        boolean zA = a(this.f34124b, str);
        if (zA || !z2 || TextUtils.isEmpty(i.a().c(str))) {
            return zA;
        }
        this.f34124b.put(str, Boolean.TRUE);
        return true;
    }

    private void a(com.smartdigimkt.x.d dVar) {
        List<com.smartdigimkt.x.d.c.a> listB;
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        ConcurrentHashMap<String, Boolean> concurrentHashMap2;
        if (dVar != null) {
            String strU2 = dVar.u2();
            if (!TextUtils.isEmpty(strU2) && (concurrentHashMap2 = this.f34123a) != null && !concurrentHashMap2.containsKey(strU2)) {
                this.f34123a.put(strU2, Boolean.FALSE);
            }
            String strB2 = dVar.B2();
            if (!TextUtils.isEmpty(strB2) && (concurrentHashMap = this.f34124b) != null && !concurrentHashMap.containsKey(strB2)) {
                this.f34124b.put(strB2, Boolean.FALSE);
            }
            com.smartdigimkt.x.d.c cVarU1 = dVar.U1();
            if (cVarU1 == null || (listB = cVarU1.b()) == null) {
                return;
            }
            for (com.smartdigimkt.x.d.c.a aVar : listB) {
                if (aVar != null) {
                    a(aVar.f39683b);
                }
            }
        }
    }

    private void a(List<String> list) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        if (list == null || list.size() == 0) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (concurrentHashMap = f34122e) != null && !concurrentHashMap.containsKey(str)) {
                boolean zD = com.smartdigimkt.f0.b.a(com.smartdigimkt.u.a.f().d()).d(str);
                if (!TextUtils.isEmpty(str)) {
                    f34122e.put(str, Boolean.valueOf(zD));
                }
            }
        }
    }

    private boolean a(ConcurrentHashMap<String, Boolean> concurrentHashMap, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (concurrentHashMap != null) {
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str).booleanValue();
            }
            concurrentHashMap.put(str, Boolean.FALSE);
            return false;
        }
        new ConcurrentHashMap().put(str, Boolean.FALSE);
        return false;
    }

    public boolean a(String str) {
        if (!TextUtils.isEmpty(str) && this.d.containsKey(str)) {
            return this.d.get(str).booleanValue();
        }
        return false;
    }

    public boolean a(boolean z2, com.smartdigimkt.x.d.c cVar) {
        List<com.smartdigimkt.x.d.c.a> listB;
        List<String> list;
        if (cVar != null && (listB = cVar.b()) != null) {
            for (com.smartdigimkt.x.d.c.a aVar : listB) {
                if (aVar != null && (list = aVar.f39683b) != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        if (!a(z2, it.next())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean a(boolean z2, String str) {
        boolean zA = a(f34122e, str);
        if (zA || com.smartdigimkt.f0.b.a(com.smartdigimkt.u.a.f().d()).d(str)) {
            return true;
        }
        return zA;
    }
}
