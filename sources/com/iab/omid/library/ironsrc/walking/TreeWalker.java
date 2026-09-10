package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.ironsrc.processor.a.InterfaceC0026a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f25297i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f25298j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f25299k = null;
    private static final Runnable l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f25300m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25302b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25308h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f25301a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25303c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f25304d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.a f25306f = new com.iab.omid.library.ironsrc.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f25305e = new com.iab.omid.library.ironsrc.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f25307g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

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
            TreeWalker.this.f25307g.b();
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
            if (TreeWalker.f25299k != null) {
                TreeWalker.f25299k.post(TreeWalker.l);
                TreeWalker.f25299k.postDelayed(TreeWalker.f25300m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f25308h);
    }

    private void e() {
        this.f25302b = 0;
        this.f25304d.clear();
        this.f25303c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f25303c = true;
                break;
            }
        }
        this.f25308h = f.b();
    }

    public static TreeWalker getInstance() {
        return f25297i;
    }

    private void i() {
        if (f25299k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f25299k = handler;
            handler.post(l);
            f25299k.postDelayed(f25300m, 200L);
        }
    }

    private void k() {
        Handler handler = f25299k;
        if (handler != null) {
            handler.removeCallbacks(f25300m);
            f25299k = null;
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
        if (this.f25301a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f25301a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f25306f.e();
        long jB = f.b();
        com.iab.omid.library.ironsrc.processor.a aVarA = this.f25305e.a();
        if (this.f25306f.b().size() > 0) {
            for (String str : this.f25306f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f25306f.a(str), jSONObjectA);
                com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f25307g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f25306f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA2);
            treeWalker.f25307g.b(jSONObjectA2, treeWalker.f25306f.c(), jB);
            if (treeWalker.f25303c) {
                Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f25304d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f25307g.b();
        }
        treeWalker.f25306f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f25301a.clear();
        f25298j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f25301a.contains(treeWalkerTimeLogger)) {
            this.f25301a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f25301a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f25301a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f25302b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f25302b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f25306f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, strC);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f25306f.e(view)));
        com.iab.omid.library.ironsrc.utils.c.b(jSONObject, Boolean.valueOf(this.f25306f.c(strC)));
        this.f25306f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0026a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.ironsrc.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f25306f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f25303c && cVarD == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f25304d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f25302b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a aVarB = this.f25305e.b();
        String strB = this.f25306f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.walking.a.C0028a c0028aB = this.f25306f.b(view);
        if (c0028aB == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c0028aB);
        return true;
    }
}
