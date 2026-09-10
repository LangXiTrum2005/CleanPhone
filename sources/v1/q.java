package v1;

import f2.b1;
import f2.i0;
import i1.b0;
import i1.c0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b1 {
    public final Map H;
    public i1.m I;

    public q(v9.e eVar, u1.h hVar, i0 i0Var, Map map) {
        super(eVar, hVar, i0Var);
        this.H = map;
    }

    @Override // f2.b1
    public final i1.p p(i1.p pVar) {
        i1.m mVar;
        i1.m mVar2 = this.I;
        if (mVar2 == null) {
            mVar2 = pVar.f42647r;
        }
        if (mVar2 != null && (mVar = (i1.m) this.H.get(mVar2.f42579c)) != null) {
            mVar2 = mVar;
        }
        c0 c0Var = pVar.l;
        c0 c0Var2 = null;
        if (c0Var == null) {
            c0Var = c0Var2;
        } else {
            b0[] b0VarArr = c0Var.f42527a;
            int length = b0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                b0 b0Var = b0VarArr[i11];
                if ((b0Var instanceof b3.n) && "com.apple.streaming.transportStreamTimestamp".equals(((b3.n) b0Var).f5472b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    b0[] b0VarArr2 = new b0[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            b0VarArr2[i10 < i11 ? i10 : i10 - 1] = b0VarArr[i10];
                        }
                        i10++;
                    }
                    c0Var2 = new c0(b0VarArr2);
                }
                c0Var = c0Var2;
            }
        }
        if (mVar2 != pVar.f42647r || c0Var != pVar.l) {
            i1.o oVarA = pVar.a();
            oVarA.f42604q = mVar2;
            oVarA.f42599k = c0Var;
            pVar = new i1.p(oVarA);
        }
        return super.p(pVar);
    }
}
