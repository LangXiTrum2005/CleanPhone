package bm;

import java.util.Comparator;
import zk.h0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f5729b = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5730a;

    public /* synthetic */ h(int i10) {
        this.f5730a = i10;
    }

    public static int a(zk.j jVar) {
        if (e.m(jVar)) {
            return 8;
        }
        if (jVar instanceof zk.i) {
            return 7;
        }
        if (jVar instanceof h0) {
            return ((h0) jVar).J() == null ? 6 : 5;
        }
        if (jVar instanceof s) {
            return ((s) jVar).J() == null ? 4 : 3;
        }
        if (jVar instanceof zk.e) {
            return 2;
        }
        return jVar instanceof nm.s ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f5730a) {
            case 0:
                zk.j jVar = (zk.j) obj;
                zk.j jVar2 = (zk.j) obj2;
                int iA = a(jVar2) - a(jVar);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (e.n(jVar, 4) && e.n(jVar2, 4)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = jVar.getName().f54514a.compareTo(jVar2.getName().f54514a);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return j1.f.h(fm.e.g((zk.e) obj).b(), fm.e.g((zk.e) obj2).b());
        }
    }
}
