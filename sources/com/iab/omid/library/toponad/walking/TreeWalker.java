package com.iab.omid.library.toponad.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.toponad.internal.j;
import com.iab.omid.library.toponad.utils.f;
import com.iab.omid.library.toponad.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.toponad.processor.a.InterfaceC0246a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f22391i = new TreeWalker();
    private static Handler j = new Handler(Looper.getMainLooper());
    private static Handler k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f22392l = new b();
    private static final Runnable m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22394b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22397h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f22393a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22395c = false;
    private final List<com.iab.omid.library.toponad.weakreference.a> d = new ArrayList();
    private com.iab.omid.library.toponad.walking.a f = new com.iab.omid.library.toponad.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.toponad.processor.b f22396e = new com.iab.omid.library.toponad.processor.b();
    private com.iab.omid.library.toponad.walking.b g = new com.iab.omid.library.toponad.walking.b(new com.iab.omid.library.toponad.walking.async.c());

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
                TreeWalker.k.post(TreeWalker.f22392l);
                TreeWalker.k.postDelayed(TreeWalker.m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f22397h);
    }

    private void e() {
        this.f22394b = 0;
        this.d.clear();
        this.f22395c = false;
        Iterator<com.iab.omid.library.toponad.adsession.a> it = com.iab.omid.library.toponad.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f22395c = true;
                break;
            }
        }
        this.f22397h = f.b();
    }

    public static TreeWalker getInstance() {
        return f22391i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(f22392l);
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
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22393a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f22393a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f.e();
        long jB = f.b();
        com.iab.omid.library.toponad.processor.a aVarA = this.f22396e.a();
        if (this.f.b().size() > 0) {
            for (String str : this.f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f.a(str), jSONObjectA);
                com.iab.omid.library.toponad.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.toponad.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.toponad.utils.c.b(jSONObjectA2);
            treeWalker.g.b(jSONObjectA2, treeWalker.f.c(), jB);
            if (treeWalker.f22395c) {
                Iterator<com.iab.omid.library.toponad.adsession.a> it = com.iab.omid.library.toponad.internal.c.c().a().iterator();
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
        this.f22393a.clear();
        j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22393a.contains(treeWalkerTimeLogger)) {
            this.f22393a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j2) {
        if (this.f22393a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f22393a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f22394b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f22394b, j2);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.toponad.utils.c.a(jSONObject, strC);
        com.iab.omid.library.toponad.utils.c.a(jSONObject, Boolean.valueOf(this.f.e(view)));
        com.iab.omid.library.toponad.utils.c.b(jSONObject, Boolean.valueOf(this.f.c(strC)));
        this.f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.toponad.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.toponad.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.toponad.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.toponad.processor.a.InterfaceC0246a
    public void a(View view, com.iab.omid.library.toponad.processor.a aVar, JSONObject jSONObject, boolean z2) {
        com.iab.omid.library.toponad.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f.d(view)) != com.iab.omid.library.toponad.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.toponad.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z3 = z2 || a(view, jSONObjectA);
                if (this.f22395c && cVarD == com.iab.omid.library.toponad.walking.c.OBSTRUCTION_VIEW && !z3) {
                    this.d.add(new com.iab.omid.library.toponad.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z3);
            }
            treeWalker.f22394b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.toponad.processor.a aVarB = this.f22396e.b();
        String strB = this.f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.toponad.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.toponad.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.toponad.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.toponad.walking.a.C0248a c0248aB = this.f.b(view);
        if (c0248aB == null) {
            return false;
        }
        com.iab.omid.library.toponad.utils.c.a(jSONObject, c0248aB);
        return true;
    }
}
