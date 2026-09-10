package sg;

import ak.f;
import cn.d0;
import cn.n0;
import com.google.android.gms.internal.auth.i;
import hn.d;
import hn.o;
import jn.e;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk.a f50240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jk.a f50241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f50242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f50244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f50245f;

    public b() {
        e eVar = n0.f6748a;
        dn.e dispatcher = o.f42451a;
        defpackage.c cVar = new defpackage.c(25);
        defpackage.c cVar2 = new defpackage.c(25);
        n.f(dispatcher, "dispatcher");
        this.f50240a = cVar;
        this.f50241b = cVar2;
        this.f50242c = new Object();
        this.f50244e = d0.b(i.D(d0.e(), dispatcher));
        this.f50245f = true;
    }

    public final void a() {
        synchronized (this.f50242c) {
            try {
                this.f50240a.invoke();
                if (this.f50245f) {
                    this.f50245f = false;
                    this.f50243d = 1;
                } else {
                    this.f50243d++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f fVar;
        jk.a aVar;
        synchronized (this.f50242c) {
            try {
                fVar = null;
                if (this.f50245f) {
                    aVar = null;
                } else {
                    int i10 = this.f50243d - 1;
                    this.f50243d = i10;
                    if (i10 < 0) {
                        this.f50243d = 0;
                    } else if (i10 == 0) {
                        this.f50245f = true;
                        aVar = this.f50241b;
                    }
                    aVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            d0.w(this.f50244e, null, new a(aVar, fVar, 0), 3);
        }
    }
}
