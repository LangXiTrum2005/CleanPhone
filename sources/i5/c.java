package i5;

import android.content.Context;
import d5.o;
import j5.d;
import java.util.ArrayList;
import java.util.Collection;
import k5.e;
import k5.f;
import k5.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j5.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f42889d = o.i("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f42890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5.c[] f42891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42892c;

    public c(Context context, p5.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f42890a = bVar;
        this.f42891b = new j5.c[]{new j5.a((k5.a) g.q(applicationContext, aVar).f44325a, 0), new j5.a((k5.b) g.q(applicationContext, aVar).f44326b, 1), new j5.a((f) g.q(applicationContext, aVar).f44328d, 4), new j5.a((e) g.q(applicationContext, aVar).f44327c, 2), new j5.a((e) g.q(applicationContext, aVar).f44327c, 3), new j5.e((e) g.q(applicationContext, aVar).f44327c), new d((e) g.q(applicationContext, aVar).f44327c)};
        this.f42892c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f42892c) {
            try {
                for (j5.c cVar : this.f42891b) {
                    Object obj = cVar.f43712b;
                    if (obj != null && cVar.b(obj) && cVar.f43711a.contains(str)) {
                        o.g().e(f42889d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f42892c) {
            try {
                for (j5.c cVar : this.f42891b) {
                    if (cVar.f43714d != null) {
                        cVar.f43714d = null;
                        cVar.d(null, cVar.f43712b);
                    }
                }
                for (j5.c cVar2 : this.f42891b) {
                    cVar2.c(collection);
                }
                for (j5.c cVar3 : this.f42891b) {
                    if (cVar3.f43714d != this) {
                        cVar3.f43714d = this;
                        cVar3.d(this, cVar3.f43712b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f42892c) {
            try {
                for (j5.c cVar : this.f42891b) {
                    ArrayList arrayList = cVar.f43711a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f43713c.b(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
