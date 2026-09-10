package gh;

import com.google.android.gms.internal.ads.l11;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements sg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41895a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bo.e f41896b = new bo.e(new ak.c(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bo.e f41897c = new bo.e(new ak.c(7));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bo.e f41898d = new bo.e(new ak.c(8));

    public static final d a() {
        return new d("assets");
    }

    public static final d b() {
        return new d("duplicateReference");
    }

    public static d d() {
        return new d("folders");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ck.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f41894h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f41894h = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objF = aVar.f41892f;
        int i11 = aVar.f41894h;
        if (i11 == 0) {
            t9.e.z(objF);
            l11 l11Var = new l11(2, null, 3);
            aVar.f41894h = 1;
            objF = android.support.v4.media.session.a.f(l11Var, aVar);
            bk.a aVar2 = bk.a.f5708a;
            if (objF == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objF);
        }
        return ((h) objF).f53286a;
    }
}
