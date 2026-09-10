package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.ads.z40;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce implements ta.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23362c;

    public /* synthetic */ ce(int i10, Object obj, Object obj2) {
        this.f23360a = i10;
        this.f23361b = obj;
        this.f23362c = obj2;
    }

    @Override // ta.z
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f23360a) {
            case 0:
                ee eeVar = (ee) this.f23361b;
                return ((ic) eeVar.f23428d.get()).a(new h6(eeVar, (he) this.f23362c));
            case 1:
                List list = (List) this.f23361b;
                sf sfVar = (sf) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw f2.j(it);
                }
                lf lfVar = new lf(this, arrayList, size);
                int i10 = tg.f23998a;
                int i11 = 4;
                ce ceVar = new ce(i11, dg.a(), lfVar);
                ta.c0 c0Var = ta.c0.f50592a;
                return ta.k0.g(ta.k0.f(ta.k0.g(ta.k0.e(sfVar.f23969a.f23746e.F()), new ce(i11, dg.a(), new ce(3, sfVar, ceVar)), c0Var), new na.f(), c0Var), new ce(i11, dg.a(), new lf(this, size, arrayList)), c0Var);
            case 2:
                z40 z40Var = (z40) this.f23361b;
                ta.s sVar = (ta.s) this.f23362c;
                z40Var.e((Uri) ta.k0.b((ListenableFuture) z40Var.f22492b), obj);
                synchronized (z40Var.f22498h) {
                    z40Var.f22500j = sVar;
                    break;
                }
                return ta.k0.d(obj);
            case 3:
                return ((sf) this.f23361b).f23969a.f23744c.c((ce) this.f23362c, ta.c0.f50592a);
            default:
                sg sgVar = (sg) this.f23361b;
                kotlin.jvm.internal.n.c(sgVar);
                rg rgVarC = dg.c();
                sg sgVarB = dg.b(rgVarC, sgVar);
                try {
                    ListenableFuture listenableFutureApply = ((ta.z) this.f23362c).apply(obj);
                    if (listenableFutureApply == null) {
                        throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                    }
                    dg.b(rgVarC, sgVarB);
                    return listenableFutureApply;
                } catch (Throwable th2) {
                    try {
                        cg.a(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        dg.b(rgVarC, sgVarB);
                        throw th3;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f23360a) {
            case 4:
                ta.z zVar = (ta.z) this.f23362c;
                StringBuilder sb2 = new StringBuilder(zVar.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(zVar);
                sb2.append(X3.j.f27836e);
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
