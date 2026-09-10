package v0;

import android.content.Context;
import cl.t0;
import cn.a0;
import java.util.List;
import kotlin.jvm.internal.n;
import qk.w;
import s0.e0;
import s0.h0;
import s0.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements mk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.g f52280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jk.b f52281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f52282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f52283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile w0.c f52284f;

    public b(String name, na.g gVar, jk.b bVar, a0 a0Var) {
        n.f(name, "name");
        this.f52279a = name;
        this.f52280b = gVar;
        this.f52281c = bVar;
        this.f52282d = a0Var;
        this.f52283e = new Object();
    }

    @Override // mk.a
    public final Object getValue(Object obj, w property) {
        w0.c cVar;
        Context thisRef = (Context) obj;
        n.f(thisRef, "thisRef");
        n.f(property, "property");
        w0.c cVar2 = this.f52284f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f52283e) {
            try {
                if (this.f52284f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    s0.c cVar3 = this.f52280b;
                    jk.b bVar = this.f52281c;
                    n.e(applicationContext, "applicationContext");
                    List migrations = (List) bVar.invoke(applicationContext);
                    a0 a0Var = this.f52282d;
                    t0 t0Var = new t0(14, applicationContext, this);
                    n.f(migrations, "migrations");
                    i0 i0Var = new i0(w0.g.f52740a, h0.f49819e, new uk.c(t0Var, 1));
                    if (cVar3 == null) {
                        cVar3 = new ne.c(14);
                    }
                    this.f52284f = new w0.c(new w0.c(new e0(i0Var, j1.f.C(new b4.c(migrations, (ak.f) null, 8)), cVar3, a0Var)));
                }
                cVar = this.f52284f;
                n.c(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
