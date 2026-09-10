package al;

import android.content.Context;
import ea.j1;
import ea.m1;
import ea.s0;
import ea.u1;
import f2.b0;
import i1.k0;
import i1.o0;
import i1.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import k6.a0;
import k6.s;
import k6.x;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements a, u1, k0, jm.d, s, rl.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3623a;

    public /* synthetic */ b(Object obj) {
        this.f3623a = obj;
    }

    public static /* synthetic */ void A0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void z0(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public abstract y B0();

    public abstract b0 C0(Context context);

    public void D0(h6.g gVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3623a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(gVar);
        }
    }

    public abstract void E0(int i10, long j10);

    public abstract void F0(String[] strArr);

    public void G0() {
        j1 j1Var = ((m1) this.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.G0();
    }

    @Override // k6.s
    public k6.r M(x xVar) {
        return new k6.c((a0) this.f3623a, 2);
    }

    @Override // ea.u1
    public j1 P() {
        throw null;
    }

    @Override // ea.u1
    public Context Q() {
        throw null;
    }

    @Override // al.a
    public j getAnnotations() {
        j jVar = (j) this.f3623a;
        if (jVar != null) {
            return jVar;
        }
        z0(1);
        throw null;
    }

    @Override // jm.d
    public pm.y getType() {
        pm.y yVar = (pm.y) this.f3623a;
        if (yVar != null) {
            return yVar;
        }
        A0(1);
        throw null;
    }

    @Override // ea.u1
    public p9.a i0() {
        throw null;
    }

    @Override // rl.l
    public void j0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f3623a).add((String) obj);
        }
    }

    @Override // rl.l
    public void k() {
        F0((String[]) ((ArrayList) this.f3623a).toArray(new String[0]));
    }

    @Override // ea.u1
    public fd.b o() {
        throw null;
    }

    @Override // rl.l
    public rl.k s(yl.b bVar) {
        return null;
    }

    @Override // ea.u1
    public s0 t() {
        throw null;
    }

    public b(m1 m1Var) {
        c0.h(m1Var);
        this.f3623a = m1Var;
    }

    public b(int i10) {
        switch (i10) {
            case 3:
                this.f3623a = new o0();
                break;
            case 7:
                this.f3623a = new ArrayList();
                break;
            default:
                char[] cArr = a7.p.f3444a;
                this.f3623a = new ArrayDeque(20);
                break;
        }
    }

    public b(j jVar) {
        if (jVar != null) {
            this.f3623a = jVar;
        } else {
            z0(0);
            throw null;
        }
    }

    public b(pm.y yVar) {
        if (yVar != null) {
            this.f3623a = yVar;
        } else {
            A0(0);
            throw null;
        }
    }

    @Override // rl.l
    public void U(dm.f fVar) {
    }

    @Override // rl.l
    public void b0(yl.b bVar, yl.f fVar) {
    }
}
