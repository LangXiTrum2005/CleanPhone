package q1;

import f2.c0;
import i1.n0;
import i1.o0;
import i1.p0;
import java.util.HashMap;
import java.util.Random;
import l1.y;
import l2.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f48545h = new k(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f48546i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f48550d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48552f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f48547a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f48548b = new n0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48549c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f48551e = p0.f42656a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f48553g = -1;

    public final void a(g gVar) {
        long j10 = gVar.f48540c;
        if (j10 != -1 && gVar.f48542e) {
            this.f48553g = j10;
        }
        this.f48552f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final g b(int i10, c0 c0Var) {
        long j10;
        long j11;
        long j12;
        HashMap map = this.f48549c;
        g gVar = null;
        long j13 = Long.MAX_VALUE;
        for (g gVar2 : map.values()) {
            long j14 = gVar2.f48540c;
            c0 c0Var2 = gVar2.f48541d;
            if (j14 == -1 && i10 == gVar2.f48539b && c0Var != null) {
                long j15 = c0Var.f40310d;
                h hVar = gVar2.f48544g;
                j10 = -1;
                g gVar3 = (g) hVar.f48549c.get(hVar.f48552f);
                if (gVar3 != null) {
                    j12 = gVar3.f48540c;
                    if (j12 == -1) {
                        j12 = hVar.f48553g + 1;
                    }
                } else {
                    j12 = hVar.f48553g + 1;
                }
                if (j15 >= j12) {
                    gVar2.f48540c = j15;
                }
            } else {
                j10 = -1;
            }
            if (c0Var != null) {
                long j16 = c0Var.f40310d;
                if (j16 != j10) {
                    if (c0Var2 == null) {
                        if (!c0Var.b() && j16 == gVar2.f48540c) {
                            j11 = gVar2.f48540c;
                            if (j11 != j10 || j11 < j13) {
                                gVar = gVar2;
                                j13 = j11;
                            } else if (j11 == j13) {
                                String str = y.f44830a;
                                if (gVar.f48541d != null && c0Var2 != null) {
                                    gVar = gVar2;
                                }
                            }
                        }
                    } else if (j16 == c0Var2.f40310d && c0Var.f40308b == c0Var2.f40308b && c0Var.f40309c == c0Var2.f40309c) {
                        j11 = gVar2.f48540c;
                        if (j11 != j10) {
                        }
                        gVar = gVar2;
                        j13 = j11;
                    }
                }
            }
            if (i10 == gVar2.f48539b) {
                j11 = gVar2.f48540c;
                if (j11 != j10) {
                }
                gVar = gVar2;
                j13 = j11;
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str2 = (String) f48545h.get();
        g gVar4 = new g(this, str2, i10, c0Var);
        map.put(str2, gVar4);
        return gVar4;
    }

    public final synchronized String c(p0 p0Var, c0 c0Var) {
        return b(p0Var.g(c0Var.f40307a, this.f48548b).f42584c, c0Var).f48538a;
    }

    public final void d(a aVar) {
        c0 c0Var;
        p0 p0Var = aVar.f48516b;
        int i10 = aVar.f48517c;
        c0 c0Var2 = aVar.f48518d;
        boolean zP = p0Var.p();
        HashMap map = this.f48549c;
        if (zP) {
            String str = this.f48552f;
            if (str != null) {
                g gVar = (g) map.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) map.get(this.f48552f);
        this.f48552f = b(i10, c0Var2).f48538a;
        e(aVar);
        if (c0Var2 != null) {
            long j10 = c0Var2.f40310d;
            if (c0Var2.b()) {
                if (gVar2 != null && gVar2.f48540c == j10 && (c0Var = gVar2.f48541d) != null && c0Var.f40308b == c0Var2.f40308b && c0Var.f40309c == c0Var2.f40309c) {
                    return;
                }
                b(i10, new c0(c0Var2.f40307a, j10));
                this.f48550d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0057, B:34:0x0063, B:35:0x0067, B:37:0x006c, B:39:0x0072, B:41:0x0089, B:42:0x00b6, B:44:0x00ba, B:45:0x00c1, B:47:0x00cb, B:49:0x00cf), top: B:54:0x0001 }] */
    public final synchronized void e(a aVar) {
        long j10;
        this.f48550d.getClass();
        if (aVar.f48516b.p()) {
            return;
        }
        c0 c0Var = aVar.f48518d;
        if (c0Var != null) {
            long j11 = c0Var.f40310d;
            if (j11 != -1) {
                g gVar = (g) this.f48549c.get(this.f48552f);
                if (gVar != null) {
                    j10 = gVar.f48540c;
                    if (j10 == -1) {
                        j10 = this.f48553g + 1;
                    }
                } else {
                    j10 = this.f48553g + 1;
                }
                if (j11 < j10) {
                    return;
                }
            }
            g gVar2 = (g) this.f48549c.get(this.f48552f);
            if (gVar2 != null && gVar2.f48540c == -1 && gVar2.f48539b != aVar.f48517c) {
                return;
            }
        }
        g gVarB = b(aVar.f48517c, aVar.f48518d);
        if (this.f48552f == null) {
            this.f48552f = gVarB.f48538a;
        }
        c0 c0Var2 = aVar.f48518d;
        if (c0Var2 != null && c0Var2.b()) {
            c0 c0Var3 = aVar.f48518d;
            g gVarB2 = b(aVar.f48517c, new c0(c0Var3.f40307a, c0Var3.f40310d, c0Var3.f40308b));
            if (!gVarB2.f48542e) {
                gVarB2.f48542e = true;
                aVar.f48516b.g(aVar.f48518d.f40307a, this.f48548b);
                this.f48548b.d(aVar.f48518d.f40308b);
                Math.max(0L, y.Z(0L) + y.Z(this.f48548b.f42586e));
                this.f48550d.getClass();
            }
        }
        if (!gVarB.f48542e) {
            gVarB.f48542e = true;
            this.f48550d.getClass();
        }
        if (gVarB.f48538a.equals(this.f48552f) && !gVarB.f48543f) {
            gVarB.f48543f = true;
            this.f48550d.l(aVar, gVarB.f48538a);
        }
    }
}
