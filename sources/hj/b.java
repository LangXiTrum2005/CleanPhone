package hj;

import android.util.Log;
import java.util.List;
import lj.d0;
import lj.k;
import lj.n;
import lj.q;
import lj.x;
import wj.r;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi.b f42362b;

    public /* synthetic */ b(wi.b bVar, int i10) {
        this.f42361a = i10;
        this.f42362b = bVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        List listQ;
        List listQ2;
        List listQ3;
        List listQ4;
        List listQ5;
        List listQ6;
        List listQ7;
        List listQ8;
        List listQ9;
        List listQ10;
        List listQ11;
        List listQ12;
        List listQ13;
        List listQ14;
        List listQ15;
        List listQ16;
        List listQ17;
        List listQ18;
        wj.h hVar = (wj.h) obj;
        switch (this.f42361a) {
            case 0:
                Throwable thA = wj.h.a(hVar.f53286a);
                wi.b bVar = this.f42362b;
                if (thA != null) {
                    if (thA instanceof e) {
                        e eVar = (e) thA;
                        listQ = o.Q(eVar.f42366a, eVar.f42367b, null);
                    } else {
                        listQ = o.Q(thA.getClass().getSimpleName(), thA.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA), thA.getCause()));
                    }
                    bVar.e(listQ);
                } else {
                    bVar.e(j1.f.C(null));
                }
                break;
            case 1:
                Throwable thA2 = wj.h.a(hVar.f53286a);
                wi.b bVar2 = this.f42362b;
                if (thA2 != null) {
                    if (thA2 instanceof e) {
                        e eVar2 = (e) thA2;
                        listQ2 = o.Q(eVar2.f42366a, eVar2.f42367b, null);
                    } else {
                        listQ2 = o.Q(thA2.getClass().getSimpleName(), thA2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA2), thA2.getCause()));
                    }
                    bVar2.e(listQ2);
                } else {
                    Object obj2 = hVar.f53286a;
                    bVar2.e(j1.f.C((Long) (obj2 instanceof wj.g ? null : obj2)));
                }
                break;
            case 2:
                Throwable thA3 = wj.h.a(hVar.f53286a);
                wi.b bVar3 = this.f42362b;
                if (thA3 != null) {
                    if (thA3 instanceof e) {
                        e eVar3 = (e) thA3;
                        listQ3 = o.Q(eVar3.f42366a, eVar3.f42367b, null);
                    } else {
                        listQ3 = o.Q(thA3.getClass().getSimpleName(), thA3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA3), thA3.getCause()));
                    }
                    bVar3.e(listQ3);
                } else {
                    bVar3.e(j1.f.C(null));
                }
                break;
            case 3:
                Throwable thA4 = wj.h.a(hVar.f53286a);
                wi.b bVar4 = this.f42362b;
                if (thA4 != null) {
                    if (thA4 instanceof kj.d) {
                        kj.d dVar = (kj.d) thA4;
                        listQ4 = o.Q(dVar.f44666a, dVar.f44667b, null);
                    } else {
                        listQ4 = o.Q(thA4.getClass().getSimpleName(), thA4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA4), thA4.getCause()));
                    }
                    bVar4.e(listQ4);
                } else {
                    Object obj3 = hVar.f53286a;
                    bVar4.e(j1.f.C((List) (obj3 instanceof wj.g ? null : obj3)));
                }
                break;
            case 4:
                Throwable thA5 = wj.h.a(hVar.f53286a);
                wi.b bVar5 = this.f42362b;
                if (thA5 != null) {
                    if (thA5 instanceof kj.d) {
                        kj.d dVar2 = (kj.d) thA5;
                        listQ5 = o.Q(dVar2.f44666a, dVar2.f44667b, null);
                    } else {
                        listQ5 = o.Q(thA5.getClass().getSimpleName(), thA5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA5), thA5.getCause()));
                    }
                    bVar5.e(listQ5);
                } else {
                    Object obj4 = hVar.f53286a;
                    bVar5.e(j1.f.C((List) (obj4 instanceof wj.g ? null : obj4)));
                }
                break;
            case 5:
                Throwable thA6 = wj.h.a(hVar.f53286a);
                wi.b bVar6 = this.f42362b;
                if (thA6 != null) {
                    if (thA6 instanceof kj.d) {
                        kj.d dVar3 = (kj.d) thA6;
                        listQ6 = o.Q(dVar3.f44666a, dVar3.f44667b, null);
                    } else {
                        listQ6 = o.Q(thA6.getClass().getSimpleName(), thA6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA6), thA6.getCause()));
                    }
                    bVar6.e(listQ6);
                } else {
                    Object obj5 = hVar.f53286a;
                    bVar6.e(j1.f.C((List) (obj5 instanceof wj.g ? null : obj5)));
                }
                break;
            case 6:
                Throwable thA7 = wj.h.a(hVar.f53286a);
                wi.b bVar7 = this.f42362b;
                if (thA7 != null) {
                    if (thA7 instanceof lj.b) {
                        lj.b bVar8 = (lj.b) thA7;
                        listQ7 = o.Q(bVar8.f45344a, bVar8.f45345b, bVar8.f45346c);
                    } else {
                        listQ7 = o.Q(thA7.getClass().getSimpleName(), thA7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA7), thA7.getCause()));
                    }
                    bVar7.e(listQ7);
                } else {
                    Object obj6 = hVar.f53286a;
                    if (obj6 instanceof wj.g) {
                        obj6 = null;
                    }
                    bVar7.e(j1.f.C((q) obj6));
                }
                break;
            case 7:
                Throwable thA8 = wj.h.a(hVar.f53286a);
                wi.b bVar9 = this.f42362b;
                if (thA8 != null) {
                    if (thA8 instanceof lj.b) {
                        lj.b bVar10 = (lj.b) thA8;
                        listQ8 = o.Q(bVar10.f45344a, bVar10.f45345b, bVar10.f45346c);
                    } else {
                        listQ8 = o.Q(thA8.getClass().getSimpleName(), thA8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA8), thA8.getCause()));
                    }
                    bVar9.e(listQ8);
                } else {
                    Object obj7 = hVar.f53286a;
                    if (obj7 instanceof wj.g) {
                        obj7 = null;
                    }
                    bVar9.e(j1.f.C((q) obj7));
                }
                break;
            case 8:
                Throwable thA9 = wj.h.a(hVar.f53286a);
                wi.b bVar11 = this.f42362b;
                if (thA9 != null) {
                    if (thA9 instanceof lj.b) {
                        lj.b bVar12 = (lj.b) thA9;
                        listQ9 = o.Q(bVar12.f45344a, bVar12.f45345b, bVar12.f45346c);
                    } else {
                        listQ9 = o.Q(thA9.getClass().getSimpleName(), thA9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA9), thA9.getCause()));
                    }
                    bVar11.e(listQ9);
                } else {
                    Object obj8 = hVar.f53286a;
                    if (obj8 instanceof wj.g) {
                        obj8 = null;
                    }
                    bVar11.e(j1.f.C((q) obj8));
                }
                break;
            case 9:
                Throwable thA10 = wj.h.a(hVar.f53286a);
                wi.b bVar13 = this.f42362b;
                if (thA10 != null) {
                    if (thA10 instanceof lj.b) {
                        lj.b bVar14 = (lj.b) thA10;
                        listQ10 = o.Q(bVar14.f45344a, bVar14.f45345b, bVar14.f45346c);
                    } else {
                        listQ10 = o.Q(thA10.getClass().getSimpleName(), thA10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA10), thA10.getCause()));
                    }
                    bVar13.e(listQ10);
                } else {
                    Object obj9 = hVar.f53286a;
                    if (obj9 instanceof wj.g) {
                        obj9 = null;
                    }
                    bVar13.e(j1.f.C((k) obj9));
                }
                break;
            case 10:
                Throwable thA11 = wj.h.a(hVar.f53286a);
                wi.b bVar15 = this.f42362b;
                if (thA11 != null) {
                    if (thA11 instanceof lj.b) {
                        lj.b bVar16 = (lj.b) thA11;
                        listQ11 = o.Q(bVar16.f45344a, bVar16.f45345b, bVar16.f45346c);
                    } else {
                        listQ11 = o.Q(thA11.getClass().getSimpleName(), thA11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA11), thA11.getCause()));
                    }
                    bVar15.e(listQ11);
                } else {
                    Object obj10 = hVar.f53286a;
                    if (obj10 instanceof wj.g) {
                        obj10 = null;
                    }
                    bVar15.e(j1.f.C((n) obj10));
                }
                break;
            case 11:
                Throwable thA12 = wj.h.a(hVar.f53286a);
                wi.b bVar17 = this.f42362b;
                if (thA12 != null) {
                    if (thA12 instanceof lj.b) {
                        lj.b bVar18 = (lj.b) thA12;
                        listQ12 = o.Q(bVar18.f45344a, bVar18.f45345b, bVar18.f45346c);
                    } else {
                        listQ12 = o.Q(thA12.getClass().getSimpleName(), thA12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA12), thA12.getCause()));
                    }
                    bVar17.e(listQ12);
                } else {
                    Object obj11 = hVar.f53286a;
                    if (obj11 instanceof wj.g) {
                        obj11 = null;
                    }
                    bVar17.e(j1.f.C((d0) obj11));
                }
                break;
            case 12:
                Throwable thA13 = wj.h.a(hVar.f53286a);
                wi.b bVar19 = this.f42362b;
                if (thA13 != null) {
                    if (thA13 instanceof lj.b) {
                        lj.b bVar20 = (lj.b) thA13;
                        listQ13 = o.Q(bVar20.f45344a, bVar20.f45345b, bVar20.f45346c);
                    } else {
                        listQ13 = o.Q(thA13.getClass().getSimpleName(), thA13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA13), thA13.getCause()));
                    }
                    bVar19.e(listQ13);
                } else {
                    Object obj12 = hVar.f53286a;
                    if (obj12 instanceof wj.g) {
                        obj12 = null;
                    }
                    bVar19.e(j1.f.C((q) obj12));
                }
                break;
            case 13:
                Throwable thA14 = wj.h.a(hVar.f53286a);
                wi.b bVar21 = this.f42362b;
                if (thA14 != null) {
                    if (thA14 instanceof lj.b) {
                        lj.b bVar22 = (lj.b) thA14;
                        listQ14 = o.Q(bVar22.f45344a, bVar22.f45345b, bVar22.f45346c);
                    } else {
                        listQ14 = o.Q(thA14.getClass().getSimpleName(), thA14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA14), thA14.getCause()));
                    }
                    bVar21.e(listQ14);
                } else {
                    Object obj13 = hVar.f53286a;
                    if (obj13 instanceof wj.g) {
                        obj13 = null;
                    }
                    bVar21.e(j1.f.C((x) obj13));
                }
                break;
            case 14:
                Throwable thA15 = wj.h.a(hVar.f53286a);
                wi.b bVar23 = this.f42362b;
                if (thA15 != null) {
                    if (thA15 instanceof lj.b) {
                        lj.b bVar24 = (lj.b) thA15;
                        listQ15 = o.Q(bVar24.f45344a, bVar24.f45345b, bVar24.f45346c);
                    } else {
                        listQ15 = o.Q(thA15.getClass().getSimpleName(), thA15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA15), thA15.getCause()));
                    }
                    bVar23.e(listQ15);
                } else {
                    Object obj14 = hVar.f53286a;
                    if (obj14 instanceof wj.g) {
                        obj14 = null;
                    }
                    bVar23.e(j1.f.C((q) obj14));
                }
                break;
            case 15:
                Throwable thA16 = wj.h.a(hVar.f53286a);
                wi.b bVar25 = this.f42362b;
                if (thA16 != null) {
                    if (thA16 instanceof nj.e) {
                        nj.e eVar4 = (nj.e) thA16;
                        listQ16 = o.Q(eVar4.f46775a, eVar4.f46776b, eVar4.f46777c);
                    } else {
                        listQ16 = o.Q(thA16.getClass().getSimpleName(), thA16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA16), thA16.getCause()));
                    }
                    bVar25.e(listQ16);
                } else {
                    bVar25.e(j1.f.C(null));
                }
                break;
            case 16:
                Throwable thA17 = wj.h.a(hVar.f53286a);
                wi.b bVar26 = this.f42362b;
                if (thA17 != null) {
                    if (thA17 instanceof tj.a) {
                        tj.a aVar = (tj.a) thA17;
                        listQ17 = o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                    } else {
                        listQ17 = o.Q(thA17.getClass().getSimpleName(), thA17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA17), thA17.getCause()));
                    }
                    bVar26.e(listQ17);
                } else {
                    Object obj15 = hVar.f53286a;
                    if (obj15 instanceof wj.g) {
                        obj15 = null;
                    }
                    bVar26.e(j1.f.C((Boolean) obj15));
                }
                break;
            case 17:
                Throwable thA18 = wj.h.a(hVar.f53286a);
                wi.b bVar27 = this.f42362b;
                if (thA18 != null) {
                    if (thA18 instanceof tj.a) {
                        tj.a aVar2 = (tj.a) thA18;
                        listQ18 = o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                    } else {
                        listQ18 = o.Q(thA18.getClass().getSimpleName(), thA18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(thA18), thA18.getCause()));
                    }
                    bVar27.e(listQ18);
                } else {
                    Object obj16 = hVar.f53286a;
                    if (obj16 instanceof wj.g) {
                        obj16 = null;
                    }
                    bVar27.e(j1.f.C((String) obj16));
                }
                break;
            default:
                Throwable thA19 = wj.h.a(hVar.f53286a);
                wi.b bVar28 = this.f42362b;
                if (thA19 != null) {
                    bVar28.e(o.Q(thA19.getClass().getSimpleName(), thA19.toString(), "Cause: " + thA19.getCause() + ", Stacktrace: " + Log.getStackTraceString(thA19)));
                } else {
                    Object obj17 = hVar.f53286a;
                    if (obj17 instanceof wj.g) {
                        obj17 = null;
                    }
                    bVar28.e(j1.f.C((x5.b) obj17));
                }
                break;
        }
        return r.f53297a;
    }
}
