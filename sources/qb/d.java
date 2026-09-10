package qb;

import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.x7;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements qc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f48932a = new d();

    @Override // qc.b
    public final void a(qc.a aVar) {
        boolean z10 = aVar.f48933a.f45919a;
        synchronized (c.class) {
            c cVar = c.f48929c;
            c0.h(cVar);
            c8 c8Var = cVar.f48930a.f24514a;
            c8Var.c(new x7(c8Var, z10));
        }
    }
}
