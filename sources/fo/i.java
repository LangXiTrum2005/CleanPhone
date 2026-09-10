package fo;

import java.io.IOException;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends ao.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f41237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, Object obj2, String str) {
        super(str, true);
        this.f41235e = i10;
        this.f41236f = obj;
        this.f41237g = obj2;
    }

    @Override // ao.a
    public final long a() {
        long jA;
        int i10;
        v[] vVarArr;
        switch (this.f41235e) {
            case 0:
                n nVar = (n) this.f41236f;
                nVar.f41254a.a(nVar, (z) ((c0) this.f41237g).f44760a);
                return -1L;
            case 1:
                try {
                    ((n) this.f41236f).f41254a.b((v) this.f41237g);
                    break;
                } catch (IOException e10) {
                    go.m mVar = go.m.f42045a;
                    go.m mVar2 = go.m.f42045a;
                    String str = "Http2Connection.Listener failure for " + ((n) this.f41236f).f41256c;
                    mVar2.getClass();
                    go.m.g(str, 4, e10);
                    try {
                        ((v) this.f41237g).c(2, e10);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                cl.i iVar = (cl.i) this.f41236f;
                z zVar = (z) this.f41237g;
                c0 c0Var = new c0();
                n nVar2 = (n) iVar.f6522c;
                synchronized (nVar2.f41275w) {
                    try {
                        synchronized (nVar2) {
                            try {
                                z zVar2 = nVar2.f41269q;
                                z zVar3 = new z();
                                zVar3.b(zVar2);
                                zVar3.b(zVar);
                                c0Var.f44760a = zVar3;
                                jA = ((long) zVar3.a()) - ((long) zVar2.a());
                                i10 = 0;
                                vVarArr = (jA == 0 || nVar2.f41255b.isEmpty()) ? null : (v[]) nVar2.f41255b.values().toArray(new v[0]);
                                z zVar4 = (z) c0Var.f44760a;
                                kotlin.jvm.internal.n.f(zVar4, "<set-?>");
                                nVar2.f41269q = zVar4;
                                nVar2.f41263j.c(new i(i10, nVar2, c0Var, nVar2.f41256c + " onSettings"), 0L);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        try {
                            nVar2.f41275w.a((z) c0Var.f44760a);
                        } catch (IOException e11) {
                            nVar2.a(2, 2, e11);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (vVarArr != null) {
                    int length = vVarArr.length;
                    while (i10 < length) {
                        v vVar = vVarArr[i10];
                        synchronized (vVar) {
                            vVar.f41312f += jA;
                            if (jA > 0) {
                                vVar.notifyAll();
                            }
                            break;
                        }
                        i10++;
                    }
                }
                return -1L;
        }
    }
}
