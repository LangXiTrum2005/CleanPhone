package ud;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f52013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1 f52014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(c1 c1Var, ak.f fVar, int i10) {
        super(2, fVar);
        this.f52012f = i10;
        this.f52014h = c1Var;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f52012f) {
            case 0:
                a1 a1Var = new a1(this.f52014h, fVar, 0);
                a1Var.f52013g = obj;
                return a1Var;
            default:
                a1 a1Var2 = new a1(this.f52014h, fVar, 1);
                a1Var2.f52013g = obj;
                return a1Var2;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f52012f) {
            case 0:
                break;
        }
        return ((a1) create(i0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        switch (this.f52012f) {
            case 0:
                t9.e.z(obj);
                return i0.a((i0) this.f52013g, null, this.f52014h.f52040d.a(), null, 5);
            default:
                t9.e.z(obj);
                i0 i0Var = (i0) this.f52013g;
                c1 c1Var = this.f52014h;
                c0 c0Var = c1Var.f52042f;
                boolean zE = c1Var.e(i0Var);
                Map mapB = i0Var.f52108c;
                if (mapB != null) {
                    c0Var.getClass();
                    z10 = false;
                    if (!c0Var.f52036f) {
                        ArrayList<e0> arrayListA = f0.a(c0Var.f52031a);
                        ArrayList arrayList = new ArrayList();
                        for (e0 e0Var : arrayListA) {
                            a0 a0Var = (a0) mapB.get(e0Var.f52063a);
                            wj.f fVar = a0Var != null ? new wj.f(e0Var, a0Var) : null;
                            if (fVar != null) {
                                arrayList.add(fVar);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z10 = true;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    wj.f fVar2 = (wj.f) it.next();
                                    e0 e0Var2 = (e0) fVar2.f53283a;
                                    a0 a0Var2 = (a0) fVar2.f53284b;
                                    String strA = c0Var.a();
                                    String str = e0Var2.f52063a;
                                    int i10 = e0Var2.f52064b;
                                    if (kotlin.jvm.internal.n.a(strA, str)) {
                                        if (i10 != a0Var2.f52010a || !kotlin.jvm.internal.n.a((String) c0Var.f52034d.getValue(), a0Var2.f52011b)) {
                                        }
                                    } else if (i10 != a0Var2.f52010a) {
                                    }
                                } else {
                                    z10 = true;
                                }
                            }
                        }
                    }
                    if (z10) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z10 = true;
                }
                boolean zD = c1Var.d(i0Var);
                if (z10) {
                    mapB = c0Var.b(xj.w.f53867a);
                } else if (zD) {
                    mapB = c0Var.b(mapB);
                }
                m0 m0Var = z10 ? null : i0Var.f52106a;
                if (!zE && !z10) {
                    return zD ? i0.a(i0Var, null, null, c0Var.b(mapB), 3) : i0Var;
                }
                m0 m0VarA = c1Var.f52038b.a(m0Var);
                s0 s0Var = (s0) c1Var.f52039c;
                cn.d0.w(cn.d0.b(s0Var.f52156e), null, new q0(s0Var, m0VarA, null), 3);
                c0Var.f52036f = true;
                return new i0(m0VarA, null, mapB);
        }
    }
}
