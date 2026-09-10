package gn;

import com.google.android.gms.internal.play_billing.q1;
import hn.u;
import kotlin.jvm.internal.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ak.f[] f41981a = new ak.f[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f41982b = new u("NULL", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f41983c = new u("UNINITIALIZED", 0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ak.k kVar, Object obj, Object obj2, jk.c cVar, ak.f fVar) throws Throwable {
        d dVar;
        Object objN;
        Object objInvoke;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f41988j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f41988j = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object obj3 = dVar.f41987i;
        int i11 = dVar.f41988j;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj4 = dVar.f41986h;
            ak.k kVar2 = dVar.f41985g;
            try {
                t9.e.z(obj3);
                objN = obj4;
                kVar = kVar2;
                hn.b.g(kVar, objN);
                return obj3;
            } catch (Throwable th2) {
                objN = obj4;
                kVar = kVar2;
                th = th2;
                hn.b.g(kVar, objN);
                throw th;
            }
        }
        t9.e.z(obj3);
        objN = hn.b.n(kVar, obj2);
        try {
            dVar.f41984f = obj;
            dVar.f41985g = kVar;
            dVar.f41986h = objN;
            dVar.f41988j = 1;
            s sVar = new s(dVar, kVar);
            if (cVar == null) {
                objInvoke = q1.I(cVar, obj, sVar);
            } else {
                h0.d(2, cVar);
                objInvoke = cVar.invoke(obj, sVar);
            }
            obj3 = objInvoke;
            Object obj5 = bk.a.f5708a;
            if (obj3 == obj5) {
                return obj5;
            }
            hn.b.g(kVar, objN);
            return obj3;
        } catch (Throwable th3) {
            th = th3;
            hn.b.g(kVar, objN);
            throw th;
        }
    }
}
