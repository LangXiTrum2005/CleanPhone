package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.unity3d.utils.f;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.unity3d.processor.a.InterfaceC0034a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f25558i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f25559j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f25560k = null;
    private static final Runnable l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f25561m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25563b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25569h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f25562a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25564c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.unity3d.weakreference.a> f25565d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.a f25567f = new com.iab.omid.library.unity3d.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.unity3d.processor.b f25566e = new com.iab.omid.library.unity3d.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.b f25568g = new com.iab.omid.library.unity3d.walking.b(new com.iab.omid.library.unity3d.walking.async.c());

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
            TreeWalker.this.f25568g.b();
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
            if (TreeWalker.f25560k != null) {
                TreeWalker.f25560k.post(TreeWalker.l);
                TreeWalker.f25560k.postDelayed(TreeWalker.f25561m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f25569h);
    }

    private void e() {
        this.f25563b = 0;
        this.f25565d.clear();
        this.f25564c = false;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f25564c = true;
                break;
            }
        }
        this.f25569h = f.b();
    }

    public static TreeWalker getInstance() {
        return f25558i;
    }

    private void i() {
        if (f25560k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f25560k = handler;
            handler.post(l);
            f25560k.postDelayed(f25561m, 200L);
        }
    }

    private void k() {
        Handler handler = f25560k;
        if (handler != null) {
            handler.removeCallbacks(f25561m);
            f25560k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f25562a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f25562a.add(treeWalkerTimeLogger);
    }

    public void f() {
        TreeWalker treeWalker;
        this.f25567f.e();
        long jB = f.b();
        com.iab.omid.library.unity3d.processor.a aVarA = this.f25566e.a();
        if (this.f25567f.b().size() > 0) {
            for (String str : this.f25567f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f25567f.a(str), jSONObjectA);
                com.iab.omid.library.unity3d.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f25568g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f25567f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA2);
            treeWalker.f25568g.b(jSONObjectA2, treeWalker.f25567f.c(), jB);
            if (treeWalker.f25564c) {
                Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f25565d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f25568g.b();
        }
        treeWalker.f25567f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f25562a.clear();
        f25559j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f25562a.contains(treeWalkerTimeLogger)) {
            this.f25562a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f25562a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f25562a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f25563b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f25563b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f25567f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, strD);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, Boolean.valueOf(this.f25567f.f(view)));
        this.f25567f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.unity3d.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.unity3d.processor.a.InterfaceC0034a
    public void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.unity3d.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f25567f.e(view)) != com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f25564c && cVarE == com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f25565d.add(new com.iab.omid.library.unity3d.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f25563b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.unity3d.processor.a aVarB = this.f25566e.b();
        String strB = this.f25567f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.unity3d.walking.a.C0036a c0036aC = this.f25567f.c(view);
        if (c0036aC == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, c0036aC);
        return true;
    }
}
