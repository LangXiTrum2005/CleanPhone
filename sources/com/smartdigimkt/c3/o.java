package com.smartdigimkt.c3;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.smartdigimkt.v0.u;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class o {
    private static final String q = "UnitCacheCtroller";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.e3.c f34134c;
    private ConcurrentHashMap<String, com.smartdigimkt.e3.c> d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ExecutorService f34136h;
    private String j;
    private com.smartdigimkt.f3.d k;
    private int m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.smartdigimkt.n1.c f34140p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<com.smartdigimkt.x.d> f34132a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34133b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f34135e = new a();
    private CopyOnWriteArrayList<Map<String, c>> f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f34137i = com.smartdigimkt.o1.b.f37307P;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34138l = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.smartdigimkt.n1.c f34139n = null;
    com.smartdigimkt.n1.c o = null;
    private Context g = com.smartdigimkt.m6.b.p().k();

    public class a implements f {
        public a() {
        }

        @Override // com.smartdigimkt.c3.f
        public void a(long j, int i2) {
            if (i2 == 5 || i2 == 4) {
                o.this.f34133b = true;
                o.this.d();
            }
            if (i2 == 2) {
                o.this.f34133b = true;
            }
        }
    }

    public o(Context context, List<com.smartdigimkt.x.d> list, ExecutorService executorService, String str, int i2) {
        this.m = 1;
        List<com.smartdigimkt.x.d> list2 = this.f34132a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f34136h = executorService;
        this.j = str;
        this.m = i2;
        a(this.f34132a);
    }

    private boolean a(com.smartdigimkt.x.d.c cVar) {
        return true;
    }

    public void c(List<com.smartdigimkt.x.d> list) {
        List<com.smartdigimkt.x.d> list2 = this.f34132a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f34132a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    public void d() {
        int i2;
        int iO;
        com.smartdigimkt.e3.c cVar;
        int i3;
        c();
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    if (!a(this.f)) {
                        this.f34133b = true;
                    }
                    for (Map<String, c> map : this.f) {
                        if (map != null) {
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value != null && !value.q()) {
                                    if (this.m == 95) {
                                        this.f34133b = true;
                                    }
                                    int iH = value.h();
                                    com.smartdigimkt.x.d dVarC = value.c();
                                    value.a(new b(dVarC));
                                    int iB = b(dVarC);
                                    if (this.m == 1) {
                                        if (this.f34139n == null) {
                                            this.f34139n = com.smartdigimkt.n1.c.a(this.j);
                                        }
                                        iB = a(dVarC);
                                    }
                                    value.d(iB);
                                    int i4 = this.m;
                                    if (i4 == 94 || i4 == 287 || i4 == 95) {
                                        if (this.k == null) {
                                            this.k = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.j, this.m == 287);
                                        }
                                        com.smartdigimkt.f3.d dVar = this.k;
                                        if (dVar != null) {
                                            iO = dVar.o();
                                            i2 = iO;
                                        } else {
                                            i2 = 0;
                                        }
                                    } else {
                                        if (i4 != 298) {
                                            i2 = 0;
                                        } else {
                                            if (this.o == null) {
                                                this.o = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a(), this.j);
                                            }
                                            com.smartdigimkt.n1.c cVar2 = this.o;
                                            if (cVar2 != null) {
                                                i2 = cVar2.i();
                                            } else {
                                                i2 = 0;
                                            }
                                        }
                                        if (this.m == 1) {
                                            if (this.f34139n == null) {
                                                this.f34139n = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a(), this.j);
                                            }
                                            com.smartdigimkt.n1.c cVar3 = this.f34139n;
                                            if (cVar3 != null) {
                                                iO = cVar3.i();
                                                i2 = iO;
                                            }
                                        }
                                    }
                                    value.a(i2);
                                    value.e(dVarC != null ? dVarC.p2() : 1);
                                    if (a(value, b(dVarC))) {
                                        com.smartdigimkt.e3.c cVar4 = this.f34134c;
                                        if (cVar4 != null && ((i3 = this.m) == 297 || i3 == 298)) {
                                            cVar4.a(dVarC.u2());
                                        }
                                        ConcurrentHashMap<String, com.smartdigimkt.e3.c> concurrentHashMap = this.d;
                                        if (concurrentHashMap != null && concurrentHashMap.size() > 0 && (cVar = this.d.get(dVarC.N1())) != null) {
                                            cVar.a(dVarC.u2());
                                        }
                                    }
                                    if (iH != 1 && iH != 5 && iH != 4 && (iH == 2 || this.f34133b)) {
                                        value.b(this.f34135e);
                                        if (a(value, iB)) {
                                            int i5 = this.m;
                                            if (i5 == 94 || i5 == 287) {
                                                value.x();
                                            }
                                        } else {
                                            int i6 = this.m;
                                            if (i6 == 1 || i6 == 95 || i6 == 298) {
                                                this.f34133b = false;
                                            }
                                            value.x();
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void e(com.smartdigimkt.x.d dVar) {
        List<com.smartdigimkt.x.d> list = this.f34132a;
        if (list != null && dVar != null) {
            list.add(dVar);
        }
        a(this.f34132a);
    }

    public void f() {
        int iH;
        try {
            CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
            if (copyOnWriteArrayList != null) {
                synchronized (copyOnWriteArrayList) {
                    try {
                        for (Map<String, c> map : this.f) {
                            if (map != null) {
                                Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    c value = it.next().getValue();
                                    if (value != null && (iH = value.h()) != 1 && iH != 5) {
                                        if (com.smartdigimkt.v0.n.h(this.g) != 9 && this.f34138l == 2) {
                                            return;
                                        }
                                        if (iH == 2 || iH == 0) {
                                            value.x();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void b() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i2 = 0;
                    while (i2 < this.f.size()) {
                        try {
                            Map<String, c> map = this.f.get(i2);
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value != null && value.c() != null && value.q() && value.r()) {
                                    value.t();
                                    this.f.remove(map);
                                    i2--;
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(com.smartdigimkt.e3.c cVar) {
        this.f34134c = cVar;
    }

    public void c() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i2 = 0;
                        while (i2 < this.f.size()) {
                            Map<String, c> map = this.f.get(i2);
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value != null) {
                                    if (jCurrentTimeMillis - value.m() > this.f34137i * 1000 && value.h() == 1) {
                                        value.f("download timeout");
                                        value.b(this.f34138l);
                                        value.b();
                                        this.f.remove(map);
                                        i2--;
                                    }
                                    if (value.h() != 1 && value.h() != 5 && value.h() != 0) {
                                        value.b();
                                        this.f.remove(map);
                                        i2--;
                                    }
                                }
                            }
                            i2++;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public void e() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        for (Map<String, c> map : this.f) {
                            if (map != null) {
                                Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    c value = it.next().getValue();
                                    if (value != null && value.h() == 1) {
                                        value.f("playing and stop download");
                                        value.b();
                                        this.f.remove(map);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class b implements com.smartdigimkt.e3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34142a;

        public b(com.smartdigimkt.x.d dVar) {
            this.f34142a = dVar;
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str) {
            com.smartdigimkt.e3.c cVar;
            if (o.this.f34134c != null) {
                o.this.f34134c.a(str);
            }
            if (o.this.d == null || o.this.d.size() <= 0 || this.f34142a == null || (cVar = (com.smartdigimkt.e3.c) o.this.d.get(this.f34142a.N1())) == null) {
                return;
            }
            cVar.a(str);
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str, String str2) {
            com.smartdigimkt.e3.c cVar;
            com.smartdigimkt.x.d dVar = this.f34142a;
            if (dVar == null || dVar.V1() == null || this.f34142a.V1().size() <= 0 || !this.f34142a.V1().contains(0)) {
                if (o.this.f34134c != null) {
                    o.this.f34134c.a(str, str2);
                }
                if (o.this.d == null || o.this.d.size() <= 0 || this.f34142a == null || (cVar = (com.smartdigimkt.e3.c) o.this.d.get(this.f34142a.N1())) == null) {
                    return;
                }
                cVar.a(str, str2);
            }
        }
    }

    public void a(String str, com.smartdigimkt.e3.c cVar) {
        if (this.d == null) {
            this.d = new ConcurrentHashMap<>();
        }
        this.d.put(str, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[Catch: Exception -> 0x01ee, TRY_ENTER, TryCatch #0 {Exception -> 0x01ee, blocks: (B:15:0x0027, B:17:0x002f, B:19:0x0043, B:21:0x004b, B:29:0x0097, B:31:0x00a1, B:33:0x00aa, B:34:0x00b0, B:36:0x00b8, B:37:0x00cc, B:39:0x00d0, B:40:0x00d7, B:42:0x00df, B:44:0x00f5, B:45:0x00fd, B:47:0x0101), top: B:93:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:15:0x0027, B:17:0x002f, B:19:0x0043, B:21:0x004b, B:29:0x0097, B:31:0x00a1, B:33:0x00aa, B:34:0x00b0, B:36:0x00b8, B:37:0x00cc, B:39:0x00d0, B:40:0x00d7, B:42:0x00df, B:44:0x00f5, B:45:0x00fd, B:47:0x0101), top: B:93:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:15:0x0027, B:17:0x002f, B:19:0x0043, B:21:0x004b, B:29:0x0097, B:31:0x00a1, B:33:0x00aa, B:34:0x00b0, B:36:0x00b8, B:37:0x00cc, B:39:0x00d0, B:40:0x00d7, B:42:0x00df, B:44:0x00f5, B:45:0x00fd, B:47:0x0101), top: B:93:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:15:0x0027, B:17:0x002f, B:19:0x0043, B:21:0x004b, B:29:0x0097, B:31:0x00a1, B:33:0x00aa, B:34:0x00b0, B:36:0x00b8, B:37:0x00cc, B:39:0x00d0, B:40:0x00d7, B:42:0x00df, B:44:0x00f5, B:45:0x00fd, B:47:0x0101), top: B:93:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:15:0x0027, B:17:0x002f, B:19:0x0043, B:21:0x004b, B:29:0x0097, B:31:0x00a1, B:33:0x00aa, B:34:0x00b0, B:36:0x00b8, B:37:0x00cc, B:39:0x00d0, B:40:0x00d7, B:42:0x00df, B:44:0x00f5, B:45:0x00fd, B:47:0x0101), top: B:93:0x0017 }] */
    private void a(List<com.smartdigimkt.x.d> list) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList;
        com.smartdigimkt.f3.a aVarC;
        com.smartdigimkt.f3.d dVar;
        if (list == null || list.size() == 0) {
            return;
        }
        b();
        c();
        int i2 = this.m;
        try {
            if (i2 != 1) {
                if (i2 == 287) {
                    aVarC = com.smartdigimkt.f3.c.b().c();
                    if (aVarC == null) {
                        com.smartdigimkt.f3.c.b().a();
                    }
                    if (aVarC != null) {
                        this.f34137i = aVarC.d();
                    }
                    if (!TextUtils.isEmpty(this.j)) {
                        this.k = com.smartdigimkt.f3.c.b().b(com.smartdigimkt.u.a.f().a(), this.j);
                    }
                    dVar = this.k;
                    if (dVar != null) {
                        this.f34138l = dVar.u();
                    }
                } else if (i2 == 298) {
                    com.smartdigimkt.n1.c cVarA = com.smartdigimkt.n1.b.b().a(com.smartdigimkt.u.a.f().a(), this.j);
                    this.o = cVarA;
                    if (cVarA == null) {
                        this.o = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a(), this.j);
                    }
                    com.smartdigimkt.n1.c cVar = this.o;
                    if (cVar != null) {
                        this.f34137i = cVar.q();
                        this.f34138l = this.o.r();
                    }
                } else if (i2 != 94) {
                    if (i2 == 95 && !TextUtils.isEmpty(this.j)) {
                        com.smartdigimkt.n1.c cVarE = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), this.j);
                        if (cVarE == null) {
                            cVarE = com.smartdigimkt.n1.c.b(this.j);
                        }
                        if (cVarE != null) {
                            this.f34137i = cVarE.q();
                            this.f34138l = cVarE.r();
                        }
                    }
                } else {
                    aVarC = com.smartdigimkt.f3.c.b().c();
                    if (aVarC == null) {
                        com.smartdigimkt.f3.c.b().a();
                    }
                    if (aVarC != null) {
                        this.f34137i = aVarC.d();
                    }
                    if (!TextUtils.isEmpty(this.j)) {
                        this.k = com.smartdigimkt.f3.c.b().b(com.smartdigimkt.u.a.f().a(), this.j);
                    }
                    dVar = this.k;
                    if (dVar != null) {
                        this.f34138l = dVar.u();
                    }
                }
            } else if (!TextUtils.isEmpty(this.j)) {
                com.smartdigimkt.n1.c cVarE2 = com.smartdigimkt.n1.b.b().e(com.smartdigimkt.u.a.f().a(), this.j);
                this.f34139n = cVarE2;
                if (cVarE2 == null) {
                    this.f34139n = com.smartdigimkt.n1.c.a(this.j);
                }
                com.smartdigimkt.n1.c cVar2 = this.f34139n;
                if (cVar2 != null) {
                    this.f34137i = cVar2.q();
                    this.f34138l = this.f34139n.r();
                }
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                com.smartdigimkt.x.d dVar2 = list.get(i3);
                if (dVar2 != null) {
                    int i4 = this.m;
                    String str = (i4 != 94 && i4 != 287) ? dVar2.j() + dVar2.u2() + dVar2.e0() : dVar2.N1() + dVar2.j() + dVar2.u2();
                    if ((d(dVar2) || !TextUtils.isEmpty(dVar2.u2())) && (copyOnWriteArrayList = this.f) != null) {
                        synchronized (copyOnWriteArrayList) {
                            int i5 = 0;
                            while (true) {
                                try {
                                    if (i5 < this.f.size()) {
                                        Map<String, c> map = this.f.get(i5);
                                        if (map != null && map.containsKey(str)) {
                                            c cVar3 = map.get(str);
                                            if (cVar3 == null) {
                                                break;
                                            }
                                            cVar3.a(dVar2);
                                            cVar3.b(this.f34138l);
                                            cVar3.d(false);
                                            map.remove(str);
                                            map.put(str, cVar3);
                                            this.f.set(i5, map);
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        c cVar4 = new c(this.g, dVar2, this.f34136h, this.j);
                                        cVar4.b(this.f34138l);
                                        cVar4.c(this.m);
                                        HashMap map2 = new HashMap();
                                        map2.put(str, cVar4);
                                        this.f.add(map2);
                                        break;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
            }
            List<com.smartdigimkt.x.d> list2 = this.f34132a;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            this.f34132a.clear();
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    public static boolean b(List<com.smartdigimkt.x.d> list) {
        String strF;
        Bitmap bitmapA;
        Bitmap bitmapA2;
        boolean z2 = true;
        for (com.smartdigimkt.x.d dVar : list) {
            String strB2 = dVar.B2();
            String strU2 = dVar.u2();
            String strK = dVar.k();
            String strI = dVar.i();
            if (dVar.U1() != null) {
                strF = dVar.U1().f();
            } else {
                strF = "";
            }
            dVar.U1();
            if (!z2 || TextUtils.isEmpty(strF) || strF.contains("cmpt=1") || a(94, dVar, strF)) {
                boolean z3 = !dVar.H2() || v.h(strB2);
                if (!z2 || !z3 || b(strB2, dVar)) {
                    if (z2 && !y.a(strU2)) {
                        String strA = com.smartdigimkt.c3.a.a().a(strU2);
                        if (!y.a(strA) && new File(strA).length() > 0) {
                            if (z2) {
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                    } else {
                        if (z2 && !TextUtils.isEmpty(strK) && ((bitmapA2 = com.smartdigimkt.f0.a.a(u.a(strK))) == null || bitmapA2.isRecycled())) {
                            z2 = false;
                        }
                        if (z2 || TextUtils.isEmpty(strI) || ((bitmapA = com.smartdigimkt.f0.a.a(u.a(strI))) != null && !bitmapA.isRecycled())) {
                        }
                    }
                }
            }
            z2 = false;
        }
        return z2;
    }

    public o(Context context, com.smartdigimkt.x.d dVar, ExecutorService executorService, String str, int i2) {
        this.m = 1;
        List<com.smartdigimkt.x.d> list = this.f34132a;
        if (list != null && dVar != null) {
            list.add(dVar);
        }
        this.f34136h = executorService;
        this.j = str;
        this.m = i2;
        a(this.f34132a);
    }

    private int c(com.smartdigimkt.x.d dVar) {
        try {
            if (dVar.S() == 298) {
                if (this.o == null) {
                    this.o = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a(), this.j);
                }
                return this.o.E();
            }
            if (dVar.S() == 42) {
                return a((com.smartdigimkt.x.d) null);
            }
            if (this.k == null) {
                this.k = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.j, false);
            }
            return this.k.J();
        } catch (Throwable th) {
            th.getMessage();
            return 100;
        }
    }

    private int b(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return -1;
        }
        if (dVar.L1() != -1) {
            return dVar.L1();
        }
        return c(dVar);
    }

    public c b(int i2, boolean z2) {
        c cVar;
        com.smartdigimkt.x.d.c cVar2;
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i3 = 0;
                    while (i3 < this.f.size()) {
                        Map<String, c> map = this.f.get(i3);
                        Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            c value = it.next().getValue();
                            if (value != null && value.c() != null) {
                                com.smartdigimkt.x.d dVarC = value.c();
                                if (!z2 || dVarC.D2()) {
                                    if (z2 || !dVarC.D2()) {
                                        String strB2 = dVarC.B2();
                                        String strU2 = dVarC.u2();
                                        String strF = "";
                                        if (dVarC.U1() != null) {
                                            strF = dVarC.U1().f();
                                        }
                                        com.smartdigimkt.x.d.c cVarU1 = dVarC.U1();
                                        cVar = null;
                                        try {
                                            if (this.m == 94 || i2 == 287) {
                                                if (TextUtils.isEmpty(strF) || strF.contains("cmpt=1") || a(this.m, dVarC, strF)) {
                                                    if (b(strB2, dVarC)) {
                                                        if (value.q()) {
                                                            value.t();
                                                        } else if (y.a(strU2)) {
                                                            if (a(cVarU1)) {
                                                                return value;
                                                            }
                                                        } else if (a(value, b(dVarC)) && a(cVarU1)) {
                                                            return value;
                                                        }
                                                    }
                                                }
                                            }
                                            boolean zIsEmpty = TextUtils.isEmpty(value.e());
                                            int iH = value.h();
                                            if (this.m == 298 && a(value, b(dVarC))) {
                                                return value;
                                            }
                                            if (iH == 5) {
                                                if (value.q()) {
                                                    value.t();
                                                    this.f.remove(map);
                                                    i3--;
                                                } else if (!zIsEmpty) {
                                                    value.a(0, 0);
                                                    if (this.m == 95) {
                                                        return value;
                                                    }
                                                } else {
                                                    if (a(strB2, dVarC) && a(cVarU1)) {
                                                        return value;
                                                    }
                                                    return null;
                                                }
                                            } else {
                                                long jM = value.m();
                                                if (value.h() == 1) {
                                                    cVar2 = cVarU1;
                                                    if (jCurrentTimeMillis - jM > this.f34137i * 1000) {
                                                        value.f("download timeout");
                                                        value.b();
                                                        this.f.remove(map);
                                                        i3--;
                                                        int i4 = this.m;
                                                        if (i4 != 1 && i4 != 94) {
                                                        }
                                                    }
                                                } else {
                                                    cVar2 = cVarU1;
                                                }
                                                if (this.m == 95) {
                                                    if (!value.q()) {
                                                        return value;
                                                    }
                                                    value.t();
                                                    this.f.remove(map);
                                                } else if (iH != 4 && iH != 2) {
                                                    if (iH == 1) {
                                                        if (!value.q()) {
                                                            if (!com.smartdigimkt.b.b.q && a(value, b(dVarC)) && a(strB2, dVarC) && a(cVar2)) {
                                                                boolean z3 = com.smartdigimkt.b.b.f33800a;
                                                                return value;
                                                            }
                                                        }
                                                    }
                                                    int i5 = this.m;
                                                    if (i5 == 94 || i5 == 287) {
                                                        if (a(value, b(dVarC)) && a(strB2, dVarC) && a(cVar2)) {
                                                            return value;
                                                        }
                                                    }
                                                } else {
                                                    this.f.remove(map);
                                                    value.b();
                                                }
                                                i3--;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            e.printStackTrace();
                                            return cVar;
                                        }
                                    }
                                }
                                dVarC.D2();
                            }
                        }
                        i3++;
                    }
                    cVar = null;
                } catch (Exception e3) {
                    e = e3;
                    cVar = null;
                }
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean d(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return false;
        }
        try {
            return dVar.B1() == 2;
        } catch (Throwable th) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:144:0x0164 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0196 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0126 A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0135 A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0147 A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x014f A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0153 A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x015a A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0167  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173 A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0180 A[Catch: all -> 0x0096, Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:5:0x0010, B:6:0x0015, B:8:0x001d, B:9:0x002d, B:11:0x0033, B:13:0x0041, B:16:0x004b, B:17:0x0054, B:19:0x005a, B:22:0x0064, B:24:0x006e, B:26:0x0078, B:28:0x0086, B:38:0x00a1, B:43:0x00af, B:41:0x00a9, B:44:0x00b3, B:46:0x00c3, B:47:0x00cb, B:73:0x0126, B:75:0x0135, B:77:0x013b, B:79:0x0147, B:81:0x014f, B:82:0x0153, B:84:0x015a, B:86:0x0160, B:92:0x0168, B:94:0x0173, B:96:0x0180, B:109:0x01a5, B:112:0x01ac, B:114:0x01b0, B:116:0x01ba, B:118:0x01c0, B:120:0x01c6, B:125:0x01d4, B:127:0x01de, B:129:0x01e4, B:131:0x01ea, B:132:0x01ee, B:50:0x00d9, B:52:0x00df, B:54:0x00e7, B:57:0x00ef, B:59:0x00f5, B:61:0x00fb, B:62:0x0100, B:64:0x0106, B:66:0x010c, B:68:0x0112, B:70:0x011c, B:72:0x0122), top: B:141:0x0010, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    public List<c> a(String str, int i2, boolean z2, List<com.smartdigimkt.x.d> list, boolean z3) {
        long j;
        boolean zIsEmpty;
        int iH;
        long jM;
        int i3;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i4 = 0;
                        while (i4 < this.f.size()) {
                            Map<String, c> map = this.f.get(i4);
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value == null || value.c() == null) {
                                    j = jCurrentTimeMillis;
                                } else {
                                    com.smartdigimkt.x.d dVarC = value.c();
                                    boolean z4 = false;
                                    for (com.smartdigimkt.x.d dVar : list) {
                                        if (dVarC != null && dVar != null && !TextUtils.isEmpty(dVarC.N1()) && !TextUtils.isEmpty(dVar.N1()) && dVarC.j().equals(dVar.j()) && dVarC.N1().equals(dVar.N1())) {
                                            z4 = true;
                                        }
                                    }
                                    if (z4) {
                                        if ((z2 && !dVarC.D2()) || (!z2 && dVarC.D2())) {
                                            dVarC.D2();
                                        } else {
                                            String strB2 = dVarC.B2();
                                            String strU2 = dVarC.u2();
                                            String strF = "";
                                            if (dVarC.U1() != null) {
                                                strF = dVarC.U1().f();
                                            }
                                            com.smartdigimkt.x.d.c cVarU1 = dVarC.U1();
                                            j = jCurrentTimeMillis;
                                            if (i2 == 94 || i2 == 287) {
                                                if (TextUtils.isEmpty(strF) || strF.contains("cmpt=1") || a(i2, dVarC, strF)) {
                                                    if (b(strB2, dVarC)) {
                                                        if (value.q()) {
                                                            value.t();
                                                        } else if (y.a(strU2)) {
                                                            if (a(cVarU1)) {
                                                                arrayList.add(value);
                                                            } else {
                                                                zIsEmpty = TextUtils.isEmpty(value.e());
                                                                iH = value.h();
                                                                if (iH == 5) {
                                                                    if (value.q()) {
                                                                        value.t();
                                                                        this.f.remove(map);
                                                                        i4--;
                                                                    } else if (!zIsEmpty) {
                                                                        value.a(0, 0);
                                                                        if (i2 == 95) {
                                                                            arrayList.add(value);
                                                                        }
                                                                    } else {
                                                                        if (a(strB2, dVarC)) {
                                                                        }
                                                                        return null;
                                                                    }
                                                                } else {
                                                                    jM = value.m();
                                                                    if (value.h() == 1) {
                                                                        i3 = iH;
                                                                        if (j - jM > this.f34137i * 1000) {
                                                                            value.f("download timeout");
                                                                            value.b();
                                                                            this.f.remove(map);
                                                                            i4--;
                                                                            if (i2 != 1) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i3 = iH;
                                                                    }
                                                                    if (i3 != 4) {
                                                                    }
                                                                    this.f.remove(map);
                                                                    value.b();
                                                                    i4--;
                                                                }
                                                            }
                                                        } else if (a(value, b(dVarC), z3) && a(cVarU1)) {
                                                            arrayList.add(value);
                                                        } else {
                                                            zIsEmpty = TextUtils.isEmpty(value.e());
                                                            iH = value.h();
                                                            if (iH == 5) {
                                                                if (value.q()) {
                                                                    value.t();
                                                                    this.f.remove(map);
                                                                    i4--;
                                                                } else if (!zIsEmpty) {
                                                                    value.a(0, 0);
                                                                    if (i2 == 95) {
                                                                        arrayList.add(value);
                                                                    }
                                                                } else {
                                                                    if (a(strB2, dVarC)) {
                                                                    }
                                                                    return null;
                                                                }
                                                            } else {
                                                                jM = value.m();
                                                                if (value.h() == 1) {
                                                                    i3 = iH;
                                                                    if (j - jM > this.f34137i * 1000) {
                                                                        value.f("download timeout");
                                                                        value.b();
                                                                        this.f.remove(map);
                                                                        i4--;
                                                                        if (i2 != 1) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    i3 = iH;
                                                                }
                                                                if (i3 != 4) {
                                                                }
                                                                this.f.remove(map);
                                                                value.b();
                                                                i4--;
                                                            }
                                                        }
                                                    } else {
                                                        zIsEmpty = TextUtils.isEmpty(value.e());
                                                        iH = value.h();
                                                        if (iH == 5) {
                                                            if (value.q()) {
                                                                value.t();
                                                                this.f.remove(map);
                                                                i4--;
                                                            } else if (!zIsEmpty) {
                                                                value.a(0, 0);
                                                                if (i2 == 95) {
                                                                    arrayList.add(value);
                                                                }
                                                            } else {
                                                                if (a(strB2, dVarC) || !a(cVarU1)) {
                                                                    return null;
                                                                }
                                                                arrayList.add(value);
                                                            }
                                                        } else {
                                                            jM = value.m();
                                                            if (value.h() == 1) {
                                                                i3 = iH;
                                                                if (j - jM > this.f34137i * 1000) {
                                                                    value.f("download timeout");
                                                                    value.b();
                                                                    this.f.remove(map);
                                                                    i4--;
                                                                    if (i2 != 1 || i2 == 94) {
                                                                    }
                                                                }
                                                            } else {
                                                                i3 = iH;
                                                            }
                                                            if (i3 != 4 || i3 == 2) {
                                                                this.f.remove(map);
                                                                value.b();
                                                                i4--;
                                                            } else if (i3 == 1) {
                                                                if (!value.q()) {
                                                                    if (!com.smartdigimkt.b.b.q && a(value, b(dVarC), z3) && a(strB2, dVarC) && a(cVarU1)) {
                                                                        boolean z5 = com.smartdigimkt.b.b.f33800a;
                                                                        arrayList.add(value);
                                                                    } else if (i2 != 94) {
                                                                        arrayList.add(value);
                                                                    } else {
                                                                        arrayList.add(value);
                                                                    }
                                                                }
                                                            } else if ((i2 != 94 || i2 == 287) && a(value, b(dVarC), z3) && a(strB2, dVarC) && a(cVarU1)) {
                                                                arrayList.add(value);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                zIsEmpty = TextUtils.isEmpty(value.e());
                                                iH = value.h();
                                                if (iH == 5) {
                                                    if (value.q()) {
                                                        value.t();
                                                        this.f.remove(map);
                                                        i4--;
                                                    } else if (!zIsEmpty) {
                                                        value.a(0, 0);
                                                        if (i2 == 95) {
                                                            arrayList.add(value);
                                                        }
                                                    } else {
                                                        if (a(strB2, dVarC)) {
                                                        }
                                                        return null;
                                                    }
                                                } else {
                                                    jM = value.m();
                                                    if (value.h() == 1) {
                                                        i3 = iH;
                                                        if (j - jM > this.f34137i * 1000) {
                                                            value.f("download timeout");
                                                            value.b();
                                                            this.f.remove(map);
                                                            i4--;
                                                            if (i2 != 1) {
                                                            }
                                                        }
                                                    } else {
                                                        i3 = iH;
                                                    }
                                                    if (i3 != 4) {
                                                    }
                                                    this.f.remove(map);
                                                    value.b();
                                                    i4--;
                                                }
                                            }
                                        }
                                    }
                                    j = jCurrentTimeMillis;
                                }
                                jCurrentTimeMillis = j;
                            }
                            i4++;
                            jCurrentTimeMillis = jCurrentTimeMillis;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public static synchronized void b(c cVar) {
        com.smartdigimkt.x.d dVarC = cVar != null ? cVar.c() : null;
        if (dVarC == null) {
            return;
        }
        if (dVarC.S() == 94 || dVarC.S() == 287) {
            cVar.d(a(cVar));
        }
    }

    private static boolean b(String str, com.smartdigimkt.x.d dVar) {
        if (dVar.K2() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (dVar.f1() != 1 || d(dVar)) {
            return (dVar.V1() != null && dVar.V1().size() > 0 && dVar.V1().contains(2)) || y.b(i.a().c(str)) || y.b(j.b().a(str));
        }
        return true;
    }

    public static boolean a(c cVar, int i2) {
        long jL = cVar.l();
        long jK = cVar.k();
        if (TextUtils.isEmpty(cVar.d())) {
            return true;
        }
        if (i2 == 0) {
            if (cVar.c() == null || TextUtils.isEmpty(cVar.c().u2())) {
                return false;
            }
            b(cVar);
            return true;
        }
        if (jK <= 0 || jL * 100 < jK * ((long) i2)) {
            return false;
        }
        b(cVar);
        return true;
    }

    private boolean b(int i2, com.smartdigimkt.x.d dVar, String str) {
        if (!TextUtils.isEmpty(dVar.g0()) || TextUtils.isEmpty(str)) {
            return true;
        }
        return l.a().a(this.j + "_" + dVar.N1() + "_" + str);
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList;
        try {
            synchronized (this.f) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f) != null && copyOnWriteArrayList.size() > 0) {
                        for (Map<String, c> map : this.f) {
                            if (map != null) {
                                for (Map.Entry<String, c> entry : map.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.f.remove(map);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static boolean a(c cVar, int i2, boolean z2) {
        return a(cVar, i2);
    }

    private boolean a(String str, com.smartdigimkt.x.d dVar) {
        try {
            if (dVar.V1() == null || dVar.V1().size() <= 0 || !dVar.V1().contains(2)) {
                return (dVar.H2() && !v.h(str)) || y.a(str) || b(str, dVar);
            }
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private static boolean a(int i2, com.smartdigimkt.x.d dVar, String str) {
        if (dVar.H2()) {
            return true;
        }
        if ((dVar.V1() == null || dVar.V1().size() <= 0 || !dVar.V1().contains(1)) && !TextUtils.isEmpty(str) && dVar.f1() == 0) {
            i.a().c(str);
            if (i.a().c(str) == null) {
                return false;
            }
        }
        return true;
    }

    public c a(int i2, boolean z2) {
        try {
            return b(i2, z2);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public c a(String str) {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    for (Map<String, c> map : this.f) {
                        if (map != null && map.containsKey(str)) {
                            return map.get(str);
                        }
                    }
                } catch (Throwable unused) {
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList) {
        try {
            for (Map<String, c> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().h() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!com.smartdigimkt.b.b.f33800a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private static synchronized String a(c cVar, com.smartdigimkt.u0.a aVar) {
        return a(cVar);
    }

    private static synchronized String a(c cVar) {
        if (cVar == null) {
            return "";
        }
        String strU2 = cVar.c().u2();
        try {
            if (cVar.h() == 5) {
                String strJ = cVar.j();
                if (!y.a(strJ) && new File(strJ).length() > 0) {
                    strU2 = strJ;
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return strU2;
    }

    public void a() {
        CopyOnWriteArrayList<Map<String, c>> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        for (Map<String, c> map : this.f) {
                            if (map == null) {
                                return;
                            }
                            Iterator<Map.Entry<String, c>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                c value = it.next().getValue();
                                if (value != null) {
                                    value.t();
                                }
                            }
                        }
                        this.f.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        List<com.smartdigimkt.x.d> list = this.f34132a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f34132a.clear();
    }

    private int a(com.smartdigimkt.x.d dVar) {
        try {
            com.smartdigimkt.n1.c cVar = this.f34139n;
            if (cVar != null) {
                return cVar.E();
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }
}
