package n5;

import android.content.Context;
import androidx.work.ListenableWorker;
import ea.e2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f46542g = d5.o.i("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5.j f46543a = new o5.j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m5.i f46545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListenableWorker f46546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f46547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p5.a f46548f;

    public n(Context context, m5.i iVar, ListenableWorker listenableWorker, o oVar, g9.k kVar) {
        this.f46544b = context;
        this.f46545c = iVar;
        this.f46546d = listenableWorker;
        this.f46547e = oVar;
        this.f46548f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f46545c.f45897q || i0.c.b()) {
            this.f46543a.h(null);
            return;
        }
        o5.j jVar = new o5.j();
        g9.k kVar = (g9.k) this.f46548f;
        ((e2) kVar.f41772d).execute(new m(this, jVar, 0));
        jVar.addListener(new m(this, jVar, 1), (e2) kVar.f41772d);
    }
}
