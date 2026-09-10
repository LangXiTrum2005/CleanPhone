package ch;

import cn.d0;
import cn.z0;
import com.google.android.gms.internal.auth.i;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f6420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hn.d f6421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f6422c = new AtomicInteger(1);

    public c(z0 z0Var) {
        this.f6420a = z0Var;
        this.f6421b = d0.b(i.D(d0.e(), z0Var));
    }

    public final void a(jk.c cVar) {
        d0.w(d0.b(i.D(d0.e(), this.f6421b.f42424a)), null, new a(cVar, null, 2), 3);
    }
}
