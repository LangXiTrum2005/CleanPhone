package t;

import android.os.Looper;
import androidx.lifecycle.f0;
import androidx.lifecycle.x0;
import java.util.concurrent.Executor;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class t extends x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f50305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public no.b f50306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f50307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1 f50308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m5.k f50309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f50310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f50311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f50312k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f0 f50313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f0 f50314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f0 f50315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f0 f50316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f0 f50317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f0 f50318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f50319s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f0 f50320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f0 f50321u;

    public static void g(f0 f0Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            f0Var.j(obj);
        } else {
            f0Var.h(obj);
        }
    }

    public final void c(e eVar) {
        if (this.f50314n == null) {
            this.f50314n = new f0();
        }
        g(this.f50314n, eVar);
    }

    public final void d(CharSequence charSequence) {
        if (this.f50321u == null) {
            this.f50321u = new f0();
        }
        g(this.f50321u, charSequence);
    }

    public final void e(int i10) {
        if (this.f50320t == null) {
            this.f50320t = new f0();
        }
        g(this.f50320t, Integer.valueOf(i10));
    }

    public final void f(boolean z10) {
        if (this.f50317q == null) {
            this.f50317q = new f0();
        }
        g(this.f50317q, Boolean.valueOf(z10));
    }
}
