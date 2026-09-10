package com.iab.omid.library.bigosg.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bigosg.d.d;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.bigosg.c.a.InterfaceC0218a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeWalker f21696a = new TreeWalker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f21697b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f21698c = null;
    private static final Runnable j = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public final void run() {
            TreeWalker.getInstance().h();
        }
    };
    private static final Runnable k = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public final void run() {
            if (TreeWalker.f21698c != null) {
                TreeWalker.f21698c.post(TreeWalker.j);
                TreeWalker.f21698c.postDelayed(TreeWalker.k, 200L);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21699e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21701i;
    private List<TreeWalkerTimeLogger> d = new ArrayList();
    private a g = new a();
    private com.iab.omid.library.bigosg.c.b f = new com.iab.omid.library.bigosg.c.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f21700h = new b(new com.iab.omid.library.bigosg.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i2, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i2, long j);
    }

    public static TreeWalker getInstance() {
        return f21696a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f21699e = 0;
        this.f21701i = d.a();
    }

    private void j() {
        a(d.a() - this.f21701i);
    }

    private void k() {
        if (f21698c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21698c = handler;
            handler.post(j);
            f21698c.postDelayed(k, 200L);
        }
    }

    private void l() {
        Handler handler = f21698c;
        if (handler != null) {
            handler.removeCallbacks(k);
            f21698c = null;
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
        f21697b.post(new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f21700h.a();
            }
        });
    }

    public void c() {
        l();
    }

    public void d() {
        this.g.c();
        long jA = d.a();
        com.iab.omid.library.bigosg.c.a aVarA = this.f.a();
        if (this.g.b().size() > 0) {
            for (String str : this.g.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.g.b(str), jSONObjectA);
                com.iab.omid.library.bigosg.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21700h.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.g.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, c.PARENT_VIEW);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA2);
            this.f21700h.a(jSONObjectA2, this.g.a(), jA);
        } else {
            this.f21700h.a();
        }
        this.g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.d.contains(treeWalkerTimeLogger)) {
            this.d.remove(treeWalkerTimeLogger);
        }
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0219a c0219aB = this.g.b(view);
        if (c0219aB != null) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, c0219aB);
        }
    }

    public void a() {
        k();
    }

    private void a(long j2) {
        if (this.d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21699e, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21699e, j2);
                }
            }
        }
    }

    @Override // com.iab.omid.library.bigosg.c.a.InterfaceC0218a
    public void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject) {
        c cVarC;
        if (f.d(view) && (cVarC = this.g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
            if (!a(view, jSONObjectA)) {
                b(view, jSONObjectA);
                a(view, aVar, jSONObjectA, cVarC);
            }
            this.f21699e++;
        }
    }

    private void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bigosg.c.a aVarB = this.f.b();
        String strA = this.g.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA, str);
            com.iab.omid.library.bigosg.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String strA = this.g.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.bigosg.d.b.a(jSONObject, strA);
        this.g.e();
        return true;
    }
}
