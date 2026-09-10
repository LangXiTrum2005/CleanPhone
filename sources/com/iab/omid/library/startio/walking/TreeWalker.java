package com.iab.omid.library.startio.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.startio.utils.f;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.startio.processor.a.InterfaceC0242a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f22291i = new TreeWalker();
    private static Handler j = new Handler(Looper.getMainLooper());
    private static Handler k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f22292l = new b();
    private static final Runnable m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22294b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22297h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f22293a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22295c = false;
    private final List<com.iab.omid.library.startio.weakreference.a> d = new ArrayList();
    private com.iab.omid.library.startio.walking.a f = new com.iab.omid.library.startio.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.startio.processor.b f22296e = new com.iab.omid.library.startio.processor.b();
    private com.iab.omid.library.startio.walking.b g = new com.iab.omid.library.startio.walking.b(new com.iab.omid.library.startio.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i2, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i2, long j);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.k != null) {
                TreeWalker.k.post(TreeWalker.f22292l);
                TreeWalker.k.postDelayed(TreeWalker.m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f22297h);
    }

    private void e() {
        this.f22294b = 0;
        this.d.clear();
        this.f22295c = false;
        Iterator<com.iab.omid.library.startio.adsession.a> it = com.iab.omid.library.startio.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f22295c = true;
                break;
            }
        }
        this.f22297h = f.b();
    }

    public static TreeWalker getInstance() {
        return f22291i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(f22292l);
            k.postDelayed(m, 200L);
        }
    }

    private void k() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22293a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f22293a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f.e();
        long jB = f.b();
        com.iab.omid.library.startio.processor.a aVarA = this.f22296e.a();
        if (this.f.b().size() > 0) {
            for (String str : this.f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f.a(str), jSONObjectA);
                com.iab.omid.library.startio.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.startio.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.startio.utils.c.b(jSONObjectA2);
            treeWalker.g.b(jSONObjectA2, treeWalker.f.c(), jB);
            if (treeWalker.f22295c) {
                Iterator<com.iab.omid.library.startio.adsession.a> it = com.iab.omid.library.startio.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.g.b();
        }
        treeWalker.f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f22293a.clear();
        j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22293a.contains(treeWalkerTimeLogger)) {
            this.f22293a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j2) {
        if (this.f22293a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f22293a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f22294b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f22294b, j2);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.startio.utils.c.a(jSONObject, strD);
        com.iab.omid.library.startio.utils.c.a(jSONObject, Boolean.valueOf(this.f.f(view)));
        this.f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.startio.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.startio.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.startio.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.startio.processor.a.InterfaceC0242a
    public void a(View view, com.iab.omid.library.startio.processor.a aVar, JSONObject jSONObject, boolean z2) {
        com.iab.omid.library.startio.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f.e(view)) != com.iab.omid.library.startio.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.startio.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z3 = z2 || a(view, jSONObjectA);
                if (this.f22295c && cVarE == com.iab.omid.library.startio.walking.c.OBSTRUCTION_VIEW && !z3) {
                    this.d.add(new com.iab.omid.library.startio.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z3);
            }
            treeWalker.f22294b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.startio.processor.a aVarB = this.f22296e.b();
        String strB = this.f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.startio.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.startio.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.startio.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.startio.walking.a.C0244a c0244aC = this.f.c(view);
        if (c0244aC == null) {
            return false;
        }
        com.iab.omid.library.startio.utils.c.a(jSONObject, c0244aC);
        return true;
    }
}
