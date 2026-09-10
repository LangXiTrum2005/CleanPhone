package jh;

import fn.k;
import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements sg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f43879a = new h();

    public static Object b(ck.c cVar) {
        return fn.g.k(new c(new k(f43879a.a().getData(), new e(3, null), 2), 0), cVar);
    }

    public final s0.i a() {
        return (s0.i) j.f43884b.getValue(super.h(), j.f43883a[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(i iVar, int i10, ck.c cVar) {
        a aVar;
        a0 a0Var;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i11 = aVar.f43863i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f43863i = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.f43861g;
        int i12 = aVar.f43863i;
        if (i12 == 0) {
            t9.e.z(obj);
            a0 a0Var2 = new a0();
            a0Var2.f44754a = 0;
            s0.i iVarA = a();
            b4.b bVar = new b4.b(iVar, a0Var2, i10, (ak.f) null);
            aVar.f43860f = a0Var2;
            aVar.f43863i = 1;
            Object objR = j1.f.r(iVarA, bVar, aVar);
            bk.a aVar2 = bk.a.f5708a;
            if (objR == aVar2) {
                return aVar2;
            }
            a0Var = a0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = aVar.f43860f;
            t9.e.z(obj);
        }
        return new Integer(a0Var.f44754a);
    }
}
