package com.smartdigimkt.r6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.u6.j;
import com.thinkup.core.common.om.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static h f38105p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38107b;
    Runnable g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38111i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f38113n;
    private long o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38106a = getClass().getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<String> f38110h = Collections.synchronizedSet(new HashSet());
    protected final long j = n.m;
    private long k = n.m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<String> f38112l = new CopyOnWriteArrayList();
    private Long m = null;
    private final Object f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentLinkedQueue<com.smartdigimkt.r6.e> f38108c = new ConcurrentLinkedQueue<>();
    private ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, com.smartdigimkt.r6.b> f38109e = new ConcurrentHashMap<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = h.this.f38106a;
            synchronized (h.this.f) {
                try {
                    if (h.this.f38111i) {
                        h.this.d();
                    } else {
                        j jVarA = j.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
                        String unused2 = h.this.f38106a;
                        jVarA.c();
                        List<com.smartdigimkt.v6.b> listD = jVarA.d();
                        if (listD != null) {
                            for (com.smartdigimkt.v6.b bVar : listD) {
                                if (!h.this.f38109e.containsKey(bVar.b())) {
                                    ConcurrentHashMap concurrentHashMap = h.this.f38109e;
                                    String strB = bVar.b();
                                    String strA = com.smartdigimkt.n8.b.a(bVar.a());
                                    String strB2 = bVar.b();
                                    long jD = bVar.d();
                                    boolean z2 = true;
                                    if (bVar.c() != 1) {
                                        z2 = false;
                                    }
                                    concurrentHashMap.put(strB, new com.smartdigimkt.r6.b(strA, strB2, false, jD, z2));
                                    String unused3 = h.this.f38106a;
                                    Thread.currentThread().getName();
                                    ((com.smartdigimkt.r6.b) h.this.f38109e.get(bVar.b())).toString();
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

    public class b implements Runnable {
        final /* synthetic */ List X;

        public b(List list) {
            this.X = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextK;
            String unused = h.this.f38106a;
            Thread.currentThread().getName();
            this.X.size();
            com.smartdigimkt.m6.c.a();
            List list = this.X;
            if (list == null || list.size() <= 0 || (contextK = com.smartdigimkt.m6.b.p().k()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.X.size(); i2++) {
                com.smartdigimkt.r6.a aVar = (com.smartdigimkt.r6.a) this.X.get(i2);
                if (aVar != null) {
                    arrayList.add(new com.smartdigimkt.r6.f(contextK, aVar.a(), aVar.b(), p.a(contextK, "sdm_sdk", "det_time_" + aVar.b(), 0L)));
                }
            }
            if (arrayList.size() > 0) {
                h.this.a((List<com.smartdigimkt.r6.e>) arrayList, false);
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f38115Y;
        final /* synthetic */ boolean Z;
        final /* synthetic */ int e0;
        final /* synthetic */ int f0;

        public c(long j, String str, boolean z2, int i2, int i3) {
            this.X = j;
            this.f38115Y = str;
            this.Z = z2;
            this.e0 = i2;
            this.f0 = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strD;
            synchronized (h.this.f) {
                try {
                    String unused = h.this.f38106a;
                    Thread.currentThread().getName();
                    try {
                        strD = com.smartdigimkt.n8.b.d(this.f38115Y);
                    } catch (Throwable unused2) {
                        com.smartdigimkt.i7.d.a("handleUpdateInspectInfo error", "cur offset: " + h.this.g() + ", error string: " + this.f38115Y, com.smartdigimkt.m6.b.p().q());
                        strD = null;
                    }
                    String unused3 = h.this.f38106a;
                    String unused4 = h.this.f38106a;
                    Map<String, Object> mapF = com.smartdigimkt.n8.h.f(strD);
                    String unused5 = h.this.f38106a;
                    mapF.size();
                    if (!this.Z) {
                        if (this.e0 == 1 || mapF.size() == 0) {
                            String unused6 = h.this.f38106a;
                            p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", "SPU_INSPECT_INFO_OFFSET", 0);
                        } else {
                            p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", "SPU_INSPECT_INFO_OFFSET", h.this.g() + mapF.size());
                            String unused7 = h.this.f38106a;
                        }
                    }
                    Iterator<Map.Entry<String, Object>> it = mapF.entrySet().iterator();
                    Context contextK = com.smartdigimkt.m6.b.p().k();
                    if (contextK != null) {
                        if (h.this.f38111i) {
                            h.this.d();
                            if (!h.this.f38110h.isEmpty()) {
                                while (it.hasNext()) {
                                    Map.Entry<String, Object> next = it.next();
                                    String key = next.getKey();
                                    String string = next.getValue().toString();
                                    boolean zContains = h.this.f38110h.contains(string);
                                    String unused8 = h.this.f38106a;
                                    Thread.currentThread().getName();
                                    h.this.f38109e.put(key, new com.smartdigimkt.r6.b(string, key, true, System.currentTimeMillis(), zContains));
                                    j.a(com.smartdigimkt.u6.d.a(contextK)).a(key, zContains, string);
                                }
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            while (it.hasNext()) {
                                Map.Entry<String, Object> next2 = it.next();
                                try {
                                    String key2 = next2.getKey();
                                    String string2 = next2.getValue().toString();
                                    com.smartdigimkt.r6.b bVar = (com.smartdigimkt.r6.b) h.this.f38109e.get(key2);
                                    if (bVar != null) {
                                        arrayList.add(new com.smartdigimkt.r6.c(contextK, string2, key2, bVar.c(), bVar.b()));
                                    } else {
                                        arrayList.add(new com.smartdigimkt.r6.c(contextK, string2, key2, 0L));
                                    }
                                } catch (Throwable unused9) {
                                }
                            }
                            if (arrayList.size() > 0) {
                                h.this.a((List<com.smartdigimkt.r6.e>) arrayList, true);
                            }
                        }
                        com.smartdigimkt.i7.d.a(this.f0, h.this.f38110h.size(), this.e0, this.X);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f38116Y;
        final /* synthetic */ com.smartdigimkt.r6.g.a Z;

        public d(Context context, String str, com.smartdigimkt.r6.g.a aVar) {
            this.X = context;
            this.f38116Y = str;
            this.Z = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.smartdigimkt.r6.g(this.X, this.f38116Y, this.Z));
            h.this.a((List<com.smartdigimkt.r6.e>) arrayList, false);
        }
    }

    public class e implements Runnable {
        final /* synthetic */ com.smartdigimkt.r6.e X;

        public e(com.smartdigimkt.r6.e eVar) {
            this.X = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.r6.b bVar = null;
            try {
                try {
                    com.smartdigimkt.r6.e eVar = this.X;
                    if (eVar != null) {
                        com.smartdigimkt.r6.b bVarC = eVar.c();
                        try {
                            synchronized (h.this.f) {
                                if (bVarC != null) {
                                    try {
                                        int iA = this.X.a();
                                        if (iA != 1) {
                                            if (iA == 2) {
                                                h.this.f38109e.put(bVarC.e(), bVarC);
                                                String strD = bVarC.d();
                                                if (!TextUtils.isEmpty(strD)) {
                                                    if (h.this.m == null) {
                                                        h.this.m = Long.valueOf(System.currentTimeMillis());
                                                    }
                                                    h.this.f38112l.remove(strD);
                                                    h hVar = h.this;
                                                    hVar.m = Long.valueOf(Math.min(hVar.m.longValue(), bVarC.c()));
                                                }
                                            }
                                        } else if (!TextUtils.isEmpty(bVarC.e()) && bVarC.b()) {
                                            h.this.d.put(bVarC.e(), bVarC.a());
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            String unused = h.this.f38106a;
                            Thread.currentThread().getName();
                            this.X.a();
                            long unused2 = h.this.f38107b;
                            if (bVarC != null) {
                                bVarC.toString();
                            }
                            if (h.this.f38108c.size() == 0 && h.this.f38113n != null) {
                                h.this.f38113n.a();
                                h.this.f38113n = null;
                            }
                            bVar = bVarC;
                        } catch (Throwable unused3) {
                            bVar = bVarC;
                            if ((bVar == null || bVar.f()) && h.this.f38107b > 0) {
                                Thread.sleep(h.this.f38107b);
                            }
                        }
                    }
                    if ((bVar == null || bVar.f()) && h.this.f38107b > 0) {
                        Thread.sleep(h.this.f38107b);
                    }
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
            }
            h.this.k();
            h.this.c();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (h.this.f) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Context contextK = com.smartdigimkt.m6.b.p().k();
                    if (contextK == null) {
                        return;
                    }
                    if (h.this.m != null && jCurrentTimeMillis - h.this.m.longValue() >= h.this.k) {
                        if (h.this.f38112l.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = h.this.f38109e.entrySet().iterator();
                            while (it.hasNext()) {
                                com.smartdigimkt.r6.b bVar = (com.smartdigimkt.r6.b) ((Map.Entry) it.next()).getValue();
                                String strD = bVar.d();
                                if (!TextUtils.isEmpty(strD) && jCurrentTimeMillis - bVar.c() > h.this.k && !h.this.f38112l.contains(strD)) {
                                    String unused = h.this.f38106a;
                                    arrayList.add(new com.smartdigimkt.r6.c(contextK, strD, bVar.e(), bVar.c(), bVar.b()));
                                }
                            }
                            String unused2 = h.this.f38106a;
                            arrayList.size();
                            if (!arrayList.isEmpty()) {
                                h.this.a((List<com.smartdigimkt.r6.e>) arrayList, true);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface g {
        void a();
    }

    public h() {
        this.f38107b = 0L;
        this.f38107b = Math.max(0L, com.smartdigimkt.m6.c.b());
        this.f38111i = false;
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null && !aVarB.M0()) {
            this.f38107b = aVarB.f0();
            this.f38111i = a(aVarB.u());
        }
        a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f) {
            try {
                if (this.f38107b >= 0 && this.f38108c.size() > 0 && this.g == null) {
                    com.smartdigimkt.r6.e eVarPoll = this.f38108c.poll();
                    if (eVarPoll != null) {
                        Runnable runnableA = a(eVarPoll);
                        this.g = runnableA;
                        a(runnableA);
                    } else {
                        c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (j()) {
            this.f38110h.clear();
            try {
                Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                List<ResolveInfo> listA = com.smartdigimkt.o8.c.a(com.smartdigimkt.m6.b.p().k(), intent);
                if (listA != null) {
                    Iterator<ResolveInfo> it = listA.iterator();
                    while (it.hasNext()) {
                        ActivityInfo activityInfo = it.next().activityInfo;
                        if (activityInfo != null) {
                            this.f38110h.add(activityInfo.packageName);
                        }
                    }
                }
                this.o = System.currentTimeMillis();
            } catch (Throwable unused) {
            }
        }
    }

    public static h e() {
        if (f38105p == null) {
            synchronized (h.class) {
                try {
                    if (f38105p == null) {
                        f38105p = new h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38105p;
    }

    private boolean j() {
        if (this.f38111i) {
            return this.f38110h.isEmpty() || System.currentTimeMillis() - this.o > this.k;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this.f) {
            try {
                if (this.g != null) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB.M0()) {
            return;
        }
        e().a(aVarB.t() * 1000);
        e().a(aVarB.d0(), aVarB.e0(), aVarB.f0(), aVarB.u());
    }

    public Map<String, String> f() {
        return this.d;
    }

    public int g() {
        return p.a(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", "SPU_INSPECT_INFO_OFFSET", 0);
    }

    public JSONArray[] h() {
        JSONArray[] jSONArrayArr = new JSONArray[2];
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it = this.f38109e.keySet().iterator();
            while (it.hasNext()) {
                com.smartdigimkt.r6.b bVar = this.f38109e.get(it.next());
                if (bVar != null && bVar.b()) {
                    jSONArray.put(Long.parseLong(bVar.e()));
                    jSONArray2.put(Math.floor(((System.currentTimeMillis() - bVar.c()) / 1000.0d) / 3600.0d));
                }
            }
            jSONArrayArr[0] = jSONArray;
            jSONArrayArr[1] = jSONArray2;
        } catch (Throwable unused) {
        }
        return jSONArrayArr;
    }

    public long i() {
        return this.k;
    }

    public void a(List<com.smartdigimkt.r6.a> list) {
        if (com.smartdigimkt.m6.b.p().a("ail_deny")) {
            return;
        }
        list.size();
        Math.max(0L, com.smartdigimkt.m6.c.a());
        if (list.size() > 0) {
            com.smartdigimkt.l7.b.a().a(new b(list), Math.max(0L, com.smartdigimkt.m6.c.a()));
        }
    }

    public void a(String str, int i2, long j, int i3) {
        a(str, i2, j, i3, false);
    }

    public void a(String str, int i2, long j, int i3, boolean z2) {
        this.f38107b = j;
        this.f38111i = a(i3);
        if (com.smartdigimkt.m6.b.p().a("ail_deny") || TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.l7.b.a().b(new c(j, str, z2, i2, i3));
    }

    public void a(Context context, String str, com.smartdigimkt.r6.g.a aVar) {
        a(new d(context, str, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<com.smartdigimkt.r6.e> list, boolean z2) {
        synchronized (this.f) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        if (z2 && list.size() > 0) {
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                this.f38112l.add(list.get(i2).b());
                            }
                        }
                        this.f38108c.addAll(list);
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private Runnable a(com.smartdigimkt.r6.e eVar) {
        return new e(eVar);
    }

    private void a(Runnable runnable) {
        com.smartdigimkt.l7.b.a().b(runnable, 17);
    }

    private void a(Runnable runnable, long j) {
        com.smartdigimkt.l7.b.a().a(runnable, j, 17);
    }

    private boolean a(int i2) {
        return (i2 == 1 || com.smartdigimkt.m6.b.p().a("bil_deny")) ? false : true;
    }

    public void a() {
        com.smartdigimkt.l7.b.a().b((Runnable) new f(), 17);
    }

    public void a(long j) {
        if (j > 0) {
            this.k = j;
        }
    }

    public void a(g gVar) {
        synchronized (this.f) {
            this.f38113n = gVar;
        }
    }
}
