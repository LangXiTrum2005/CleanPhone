package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.bytedance2.processor.a.InterfaceC0221a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21790i = new TreeWalker();
    private static Handler j = new Handler(Looper.getMainLooper());
    private static Handler k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21791l = new b();
    private static final Runnable m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21793b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21796h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21792a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21794c = false;
    private final List<com.iab.omid.library.bytedance2.weakreference.a> d = new ArrayList();
    private com.iab.omid.library.bytedance2.walking.a f = new com.iab.omid.library.bytedance2.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f21795e = new com.iab.omid.library.bytedance2.processor.b();
    private com.iab.omid.library.bytedance2.walking.b g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
                TreeWalker.k.post(TreeWalker.f21791l);
                TreeWalker.k.postDelayed(TreeWalker.m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f21796h);
    }

    private void e() {
        this.f21793b = 0;
        this.d.clear();
        this.f21794c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f21794c = true;
                break;
            }
        }
        this.f21796h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21790i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(f21791l);
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
        if (this.f21792a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21792a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f21795e.a();
        if (this.f.b().size() > 0) {
            for (String str : this.f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f.a(str), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.g.b(jSONObjectA2, treeWalker.f.c(), jB);
            if (treeWalker.f21794c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
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
        this.f21792a.clear();
        j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21792a.contains(treeWalkerTimeLogger)) {
            this.f21792a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j2) {
        if (this.f21792a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21792a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21793b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21793b, j2);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f.f(view)));
        this.f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0221a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z2) {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z3 = z2 || a(view, jSONObjectA);
                if (this.f21794c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z3) {
                    this.d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z3);
            }
            treeWalker.f21793b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f21795e.b();
        String strB = this.f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.walking.a.C0223a c0223aC = this.f.c(view);
        if (c0223aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0223aC);
        return true;
    }
}
