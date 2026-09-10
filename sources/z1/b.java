package z1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.o6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import go.k;
import i1.a0;
import i1.b0;
import i1.c0;
import i1.p;
import java.util.ArrayList;
import k3.j;
import l1.y;
import m0.s1;
import p1.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p1.a implements Handler.Callback {
    public c0 A;
    public long B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f54617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f54618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f54619u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w2.a f54620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public no.b f54621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f54622x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f54623y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f54624z;

    public b(v vVar, Looper looper) {
        super(5);
        this.f54618t = vVar;
        this.f54619u = looper == null ? null : new Handler(looper, this);
        this.f54617s = a.f54616a;
        this.f54620v = new w2.a(1);
        this.B = C.TIME_UNSET;
    }

    @Override // p1.a
    public final int A(p pVar) {
        if (this.f54617s.b(pVar)) {
            return p1.a.c(pVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return p1.a.c(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void D(c0 c0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = c0Var.f42527a;
            if (i10 >= b0VarArr.length) {
                return;
            }
            p pVarA = b0VarArr[i10].a();
            if (pVarA != null) {
                a aVar = this.f54617s;
                if (aVar.b(pVarA)) {
                    no.b bVarA = aVar.a(pVarA);
                    byte[] bArrC = b0VarArr[i10].c();
                    bArrC.getClass();
                    w2.a aVar2 = this.f54620v;
                    aVar2.g();
                    aVar2.i(bArrC.length);
                    aVar2.f47035e.put(bArrC);
                    aVar2.j();
                    c0 c0VarN = bVarA.n(aVar2);
                    if (c0VarN != null) {
                        D(c0VarN, arrayList);
                    }
                } else {
                    arrayList.add(b0VarArr[i10]);
                }
            } else {
                arrayList.add(b0VarArr[i10]);
            }
            i10++;
        }
    }

    public final long E(long j10) {
        k.t(j10 != C.TIME_UNSET);
        k.t(this.B != C.TIME_UNSET);
        return j10 - this.B;
    }

    public final void F(c0 c0Var) {
        v vVar = this.f54618t;
        p1.b0 b0Var = vVar.f48170a;
        a0 a0Var = b0Var.g0;
        mk0 mk0Var = b0Var.f47947m;
        o6 o6VarA = a0Var.a();
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = c0Var.f42527a;
            if (i10 >= b0VarArr.length) {
                break;
            }
            b0VarArr[i10].b(o6VarA);
            i10++;
        }
        b0Var.g0 = new a0(o6VarA);
        a0 a0VarH0 = b0Var.H0();
        if (!a0VarH0.equals(b0Var.Q)) {
            b0Var.Q = a0VarH0;
            mk0Var.c(14, new j(vVar, 15));
        }
        mk0Var.c(28, new j(c0Var, 16));
        mk0Var.b();
    }

    @Override // p1.a
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        F((c0) message.obj);
        return true;
    }

    @Override // p1.a
    public final boolean j() {
        return this.f54623y;
    }

    @Override // p1.a
    public final boolean l() {
        return true;
    }

    @Override // p1.a
    public final void m() {
        this.A = null;
        this.f54621w = null;
        this.B = C.TIME_UNSET;
    }

    @Override // p1.a
    public final void o(long j10, boolean z10, boolean z11) {
        this.A = null;
        this.f54622x = false;
        this.f54623y = false;
    }

    @Override // p1.a
    public final void t(p[] pVarArr, long j10, long j11, f2.c0 c0Var) {
        this.f54621w = this.f54617s.a(pVarArr[0]);
        c0 c0Var2 = this.A;
        if (c0Var2 != null) {
            long j12 = c0Var2.f42528b;
            long j13 = (this.B + j12) - j11;
            if (j12 != j13) {
                c0Var2 = new c0(j13, c0Var2.f42527a);
            }
            this.A = c0Var2;
        }
        this.B = j11;
    }

    @Override // p1.a
    public final void w(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f54622x && this.A == null) {
                w2.a aVar = this.f54620v;
                aVar.g();
                s1 s1Var = this.f47907c;
                s1Var.c();
                int iV = v(s1Var, aVar, 0);
                if (iV == -4) {
                    if (aVar.c(4)) {
                        this.f54622x = true;
                    } else if (aVar.f47037g >= this.l) {
                        aVar.f52921j = this.f54624z;
                        aVar.j();
                        no.b bVar = this.f54621w;
                        String str = y.f44830a;
                        c0 c0VarN = bVar.n(aVar);
                        if (c0VarN != null) {
                            ArrayList arrayList = new ArrayList(c0VarN.f42527a.length);
                            D(c0VarN, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.A = new c0(E(aVar.f47037g), (b0[]) arrayList.toArray(new b0[0]));
                            }
                        }
                    }
                } else if (iV == -5) {
                    p pVar = (p) s1Var.f45752c;
                    pVar.getClass();
                    this.f54624z = pVar.f42648s;
                }
            }
            c0 c0Var = this.A;
            if (c0Var == null || c0Var.f42528b > E(j10)) {
                z10 = false;
            } else {
                c0 c0Var2 = this.A;
                Handler handler = this.f54619u;
                if (handler != null) {
                    handler.obtainMessage(1, c0Var2).sendToTarget();
                } else {
                    F(c0Var2);
                }
                this.A = null;
                z10 = true;
            }
            if (this.f54622x && this.A == null) {
                this.f54623y = true;
            }
        }
    }
}
