package q1;

import f2.c0;
import i1.o0;
import i1.p0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f48540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f48541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f48543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f48544g;

    public g(h hVar, String str, int i10, c0 c0Var) {
        this.f48544g = hVar;
        this.f48538a = str;
        this.f48539b = i10;
        this.f48540c = c0Var == null ? -1L : c0Var.f40310d;
        if (c0Var == null || !c0Var.b()) {
            return;
        }
        this.f48541d = c0Var;
    }

    public final boolean a(a aVar) {
        c0 c0Var = aVar.f48518d;
        p0 p0Var = aVar.f48516b;
        if (c0Var == null) {
            return this.f48539b != aVar.f48517c;
        }
        long j10 = this.f48540c;
        if (j10 == -1) {
            return false;
        }
        if (c0Var.f40310d > j10) {
            return true;
        }
        c0 c0Var2 = this.f48541d;
        if (c0Var2 == null) {
            return false;
        }
        int i10 = c0Var2.f40308b;
        int iB = p0Var.b(c0Var.f40307a);
        int iB2 = p0Var.b(c0Var2.f40307a);
        if (c0Var.f40310d < c0Var2.f40310d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!c0Var.b()) {
            int i11 = c0Var.f40311e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = c0Var.f40308b;
        int i13 = c0Var.f40309c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > c0Var2.f40309c;
        }
        return true;
    }

    public final boolean b(p0 p0Var, p0 p0Var2) {
        c0 c0Var;
        int i10 = this.f48539b;
        if (i10 < p0Var.o()) {
            h hVar = this.f48544g;
            o0 o0Var = hVar.f48547a;
            p0Var.n(i10, o0Var);
            int i11 = o0Var.f42628n;
            while (true) {
                if (i11 > o0Var.f42629o) {
                    i10 = -1;
                    break;
                }
                int iB = p0Var2.b(p0Var.l(i11));
                if (iB != -1) {
                    i10 = p0Var2.f(iB, hVar.f48548b, false).f42584c;
                    break;
                }
                i11++;
            }
        } else if (i10 >= p0Var2.o()) {
            i10 = -1;
            break;
        }
        this.f48539b = i10;
        return i10 != -1 && ((c0Var = this.f48541d) == null || p0Var2.b(c0Var.f40307a) != -1);
    }
}
