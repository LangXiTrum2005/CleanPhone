package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.applovin.processor.a.InterfaceC0022a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f25163i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f25164j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f25165k = null;
    private static final Runnable l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f25166m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25168b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25174h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f25167a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25169c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f25170d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f25172f = new com.iab.omid.library.applovin.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f25171e = new com.iab.omid.library.applovin.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f25173g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

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
            TreeWalker.this.f25173g.b();
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
            if (TreeWalker.f25165k != null) {
                TreeWalker.f25165k.post(TreeWalker.l);
                TreeWalker.f25165k.postDelayed(TreeWalker.f25166m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f25174h);
    }

    private void e() {
        this.f25168b = 0;
        this.f25170d.clear();
        this.f25169c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f25169c = true;
                break;
            }
        }
        this.f25174h = f.b();
    }

    public static TreeWalker getInstance() {
        return f25163i;
    }

    private void i() {
        if (f25165k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f25165k = handler;
            handler.post(l);
            f25165k.postDelayed(f25166m, 200L);
        }
    }

    private void k() {
        Handler handler = f25165k;
        if (handler != null) {
            handler.removeCallbacks(f25166m);
            f25165k = null;
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
        if (this.f25167a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f25167a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f25172f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f25171e.a();
        if (this.f25172f.b().size() > 0) {
            for (String str : this.f25172f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f25172f.a(str), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f25173g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f25172f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.f25173g.b(jSONObjectA2, treeWalker.f25172f.c(), jB);
            if (treeWalker.f25169c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f25170d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f25173g.b();
        }
        treeWalker.f25172f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f25167a.clear();
        f25164j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f25167a.contains(treeWalkerTimeLogger)) {
            this.f25167a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f25167a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f25167a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f25168b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f25168b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f25172f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f25172f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f25172f.c(strC)));
        this.f25172f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0022a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f25172f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f25169c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f25170d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f25168b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a aVarB = this.f25171e.b();
        String strB = this.f25172f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.walking.a.C0024a c0024aB = this.f25172f.b(view);
        if (c0024aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0024aB);
        return true;
    }
}
