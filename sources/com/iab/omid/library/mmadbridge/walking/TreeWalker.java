package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.mmadbridge.processor.a.InterfaceC0030a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f25431i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f25432j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f25433k = null;
    private static final Runnable l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f25434m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25436b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25442h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f25435a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25437c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> f25438d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.a f25440f = new com.iab.omid.library.mmadbridge.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.processor.b f25439e = new com.iab.omid.library.mmadbridge.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.b f25441g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f25441g.b();
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
            if (TreeWalker.f25433k != null) {
                TreeWalker.f25433k.post(TreeWalker.l);
                TreeWalker.f25433k.postDelayed(TreeWalker.f25434m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f25442h);
    }

    private void e() {
        this.f25436b = 0;
        this.f25438d.clear();
        this.f25437c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f25437c = true;
                break;
            }
        }
        this.f25442h = f.b();
    }

    public static TreeWalker getInstance() {
        return f25431i;
    }

    private void i() {
        if (f25433k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f25433k = handler;
            handler.post(l);
            f25433k.postDelayed(f25434m, 200L);
        }
    }

    private void k() {
        Handler handler = f25433k;
        if (handler != null) {
            handler.removeCallbacks(f25434m);
            f25433k = null;
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
        if (this.f25435a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f25435a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f25440f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.f25439e.a();
        if (this.f25440f.b().size() > 0) {
            for (String str : this.f25440f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f25440f.a(str), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f25441g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f25440f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            treeWalker.f25441g.b(jSONObjectA2, treeWalker.f25440f.c(), jB);
            if (treeWalker.f25437c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f25438d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f25441g.b();
        }
        treeWalker.f25440f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f25435a.clear();
        f25432j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f25435a.contains(treeWalkerTimeLogger)) {
            this.f25435a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f25435a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f25435a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f25436b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f25436b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f25440f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f25440f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f25440f.c(strC)));
        this.f25440f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0030a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f25440f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f25437c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f25438d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f25436b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.f25439e.b();
        String strB = this.f25440f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.walking.a.C0032a c0032aB = this.f25440f.b(view);
        if (c0032aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0032aB);
        return true;
    }
}
