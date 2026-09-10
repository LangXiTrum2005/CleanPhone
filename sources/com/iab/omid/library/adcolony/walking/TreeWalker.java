package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.d.d;
import com.iab.omid.library.adcolony.d.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.adcolony.c.a.InterfaceC0211a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeWalker f21503a = new TreeWalker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f21504b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f21505c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21506l = new Runnable() { // from class: com.iab.omid.library.adcolony.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };
    private static final Runnable m = new Runnable() { // from class: com.iab.omid.library.adcolony.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f21505c != null) {
                TreeWalker.f21505c.post(TreeWalker.f21506l);
                TreeWalker.f21505c.postDelayed(TreeWalker.m, 200L);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21507e;
    private long k;
    private List<TreeWalkerTimeLogger> d = new ArrayList();
    private boolean f = false;
    private final List<com.iab.omid.library.adcolony.e.a> g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f21509i = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.iab.omid.library.adcolony.c.b f21508h = new com.iab.omid.library.adcolony.c.b();
    private b j = new b(new com.iab.omid.library.adcolony.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i2, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i2, long j);
    }

    public static TreeWalker getInstance() {
        return f21503a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f21507e = 0;
        this.g.clear();
        this.f = false;
        Iterator<com.iab.omid.library.adcolony.adsession.a> it = com.iab.omid.library.adcolony.b.a.a().c().iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                this.f = true;
                break;
            }
        }
        this.k = d.a();
    }

    private void j() {
        a(d.a() - this.k);
    }

    private void k() {
        if (f21505c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21505c = handler;
            handler.post(f21506l);
            f21505c.postDelayed(m, 200L);
        }
    }

    private void l() {
        Handler handler = f21505c;
        if (handler != null) {
            handler.removeCallbacks(m);
            f21505c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.d.clear();
        f21504b.post(new Runnable() { // from class: com.iab.omid.library.adcolony.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.j.a();
            }
        });
    }

    public void c() {
        l();
    }

    public void d() {
        TreeWalker treeWalker;
        this.f21509i.c();
        long jA = d.a();
        com.iab.omid.library.adcolony.c.a aVarA = this.f21508h.a();
        if (this.f21509i.b().size() > 0) {
            for (String str : this.f21509i.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21509i.b(str), jSONObjectA);
                com.iab.omid.library.adcolony.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.j.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.f21509i.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, c.PARENT_VIEW, false);
            com.iab.omid.library.adcolony.d.b.a(jSONObjectA2);
            treeWalker.j.a(jSONObjectA2, treeWalker.f21509i.a(), jA);
            if (treeWalker.f) {
                Iterator<com.iab.omid.library.adcolony.adsession.a> it = com.iab.omid.library.adcolony.b.a.a().c().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.g);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.j.a();
        }
        treeWalker.f21509i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.d.contains(treeWalkerTimeLogger)) {
            this.d.remove(treeWalkerTimeLogger);
        }
    }

    public void a() {
        k();
    }

    private void a(long j) {
        if (this.d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21507e, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21507e, j);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        a.C0212a c0212aB = this.f21509i.b(view);
        if (c0212aB == null) {
            return false;
        }
        com.iab.omid.library.adcolony.d.b.a(jSONObject, c0212aB);
        return true;
    }

    private void a(View view, com.iab.omid.library.adcolony.c.a aVar, JSONObject jSONObject, c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.adcolony.c.a.InterfaceC0211a
    public void a(View view, com.iab.omid.library.adcolony.c.a aVar, JSONObject jSONObject, boolean z2) {
        c cVarC;
        TreeWalker treeWalker;
        if (f.d(view) && (cVarC = this.f21509i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.adcolony.d.b.a(jSONObject, jSONObjectA);
            if (a(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z3 = z2 || b(view, jSONObjectA);
                if (this.f && cVarC == c.OBSTRUCTION_VIEW && !z3) {
                    this.g.add(new com.iab.omid.library.adcolony.e.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarC, z3);
            }
            treeWalker.f21507e++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.adcolony.c.a aVarB = this.f21508h.b();
        String strA = this.f21509i.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.adcolony.d.b.a(jSONObjectA, str);
            com.iab.omid.library.adcolony.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.adcolony.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String strA = this.f21509i.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.adcolony.d.b.a(jSONObject, strA);
        com.iab.omid.library.adcolony.d.b.a(jSONObject, Boolean.valueOf(this.f21509i.d(view)));
        this.f21509i.e();
        return true;
    }
}
