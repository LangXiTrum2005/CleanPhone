package k5;

import android.content.Context;
import d5.o;
import ea.e2;
import g9.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44314f = o.i("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5.a f44315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f44316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44317c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f44318d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f44319e;

    public d(Context context, p5.a aVar) {
        this.f44316b = context.getApplicationContext();
        this.f44315a = aVar;
    }

    public abstract Object a();

    public final void b(j5.c cVar) {
        synchronized (this.f44317c) {
            try {
                if (this.f44318d.remove(cVar) && this.f44318d.isEmpty()) {
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f44317c) {
            try {
                Object obj2 = this.f44319e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f44319e = obj;
                    boolean z10 = false;
                    ((e2) ((k) this.f44315a).f41772d).execute(new i0(this, z10, new ArrayList(this.f44318d), 29));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
