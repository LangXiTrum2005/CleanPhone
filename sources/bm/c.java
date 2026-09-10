package bm;

import cl.h0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Collection;
import kotlin.jvm.internal.n;
import pm.n0;
import zk.b0;
import zk.j0;
import zk.m0;
import zk.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements qm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5727a = new c();

    public static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static j0 e(zk.b bVar) {
        while (bVar instanceof zk.c) {
            zk.c cVar = (zk.c) bVar;
            if (cVar.getKind() != 2) {
                break;
            }
            Collection overriddenDescriptors = cVar.f();
            n.e(overriddenDescriptors, "overriddenDescriptors");
            bVar = (zk.c) xj.n.G0(overriddenDescriptors);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.c();
    }

    @Override // qm.c
    public boolean a(n0 n0Var, n0 n0Var2) {
        if (n0Var == null) {
            b(0);
            throw null;
        }
        if (n0Var2 != null) {
            return n0Var.equals(n0Var2);
        }
        b(1);
        throw null;
    }

    public boolean c(zk.j jVar, zk.j jVar2, boolean z10) {
        if ((jVar instanceof zk.e) && (jVar2 instanceof zk.e)) {
            return n.a(((zk.e) jVar).n(), ((zk.e) jVar2).n());
        }
        if ((jVar instanceof m0) && (jVar2 instanceof m0)) {
            return d((m0) jVar, (m0) jVar2, z10, b.f5726e);
        }
        if (!(jVar instanceof zk.b) || !(jVar2 instanceof zk.b)) {
            return ((jVar instanceof b0) && (jVar2 instanceof b0)) ? n.a(((h0) ((b0) jVar)).f6518e, ((h0) ((b0) jVar2)).f6518e) : n.a(jVar, jVar2);
        }
        zk.b bVar = (zk.b) jVar;
        zk.b bVar2 = (zk.b) jVar2;
        if (!bVar.equals(bVar2)) {
            if (n.a(bVar.getName(), bVar2.getName()) && ((!(bVar instanceof v) || !(bVar2 instanceof v) || ((v) bVar).f0() == ((v) bVar2).f0()) && ((!n.a(bVar.e(), bVar2.e()) || (z10 && n.a(e(bVar), e(bVar2)))) && !e.o(bVar) && !e.o(bVar2)))) {
                zk.j jVarE = bVar.e();
                zk.j jVarE2 = bVar2.e();
                if (((jVarE instanceof zk.c) || (jVarE2 instanceof zk.c)) ? false : c(jVarE, jVarE2, z10)) {
                    l lVar = new l(new t6.l(z10, bVar, bVar2, 1));
                    if (lVar.m(bVar, bVar2, null, true).c() != 1 || lVar.m(bVar2, bVar, null, true).c() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean d(m0 a8, m0 b10, boolean z10, jk.c cVar) {
        n.f(a8, "a");
        n.f(b10, "b");
        if (a8.equals(b10)) {
            return true;
        }
        if (n.a(a8.e(), b10.e())) {
            return false;
        }
        zk.j jVarE = a8.e();
        zk.j jVarE2 = b10.e();
        return (((jVarE instanceof zk.c) || (jVarE2 instanceof zk.c)) ? ((Boolean) cVar.invoke(jVarE, jVarE2)).booleanValue() : c(jVarE, jVarE2, z10)) && a8.getIndex() == b10.getIndex();
    }
}
