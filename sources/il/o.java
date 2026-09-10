package il;

import cl.h0;
import com.ironsource.C0335f8;
import zk.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.a f43095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43096b;

    public o(n.a delegate, int i10) {
        this.f43096b = i10;
        kotlin.jvm.internal.n.f(delegate, "delegate");
        this.f43095a = delegate;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0222 A[ADDED_TO_REGION, LOOP:1: B:120:0x0222->B:132:0x0253, LOOP_START, PHI: r8
  0x0222: PHI (r8v5 zk.j) = (r8v0 zk.j), (r8v6 zk.j) binds: [B:118:0x021f, B:132:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0224  */
    /* JADX WARN: Code duplicated, block: B:123:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x0253 A[LOOP:1: B:120:0x0222->B:132:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x022b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [zk.j] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r7v0, types: [zk.j, zk.m] */
    /* JADX WARN: Type inference failed for: r7v10, types: [zk.j] */
    /* JADX WARN: Type inference failed for: r7v8, types: [zk.j] */
    /* JADX WARN: Type inference failed for: r7v9, types: [zk.j] */
    public final boolean a(jm.d dVar, zk.m mVar, zk.j jVar) {
        zk.j jVarI;
        zk.e eVar;
        switch (this.f43096b) {
            case 0:
                if (jVar != null) {
                    return p.c(mVar, jVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", C0335f8.f28653k));
            case 1:
                if (jVar != null) {
                    return p.b(dVar, mVar, jVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", C0335f8.f28653k));
            case 2:
                if (jVar != null) {
                    return p.b(dVar, mVar, jVar);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", C0335f8.f28653k));
            case 3:
                if (jVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", C0335f8.f28653k));
                }
                if (bm.e.s(mVar) && bm.e.f(jVar) != k0.f54971b) {
                    return zk.n.d(mVar, jVar);
                }
                if (mVar instanceof zk.i) {
                    ((zk.i) mVar).e();
                }
                while (mVar != 0) {
                    mVar = mVar.e();
                    if (((mVar instanceof zk.e) && !bm.e.l(mVar)) || (mVar instanceof zk.b0)) {
                        if (mVar != 0) {
                            while (jVar != null) {
                                if (mVar != jVar) {
                                    if (jVar instanceof zk.b0) {
                                        jVar = jVar.e();
                                    } else if ((mVar instanceof zk.b0) || !((h0) ((zk.b0) mVar)).f6518e.equals(((h0) ((zk.b0) jVar)).f6518e) || !bm.e.d(jVar).equals(bm.e.d(mVar))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (mVar != 0) {
                    while (jVar != null) {
                        if (mVar != jVar) {
                            if (jVar instanceof zk.b0) {
                                jVar = jVar.e();
                            } else if (mVar instanceof zk.b0) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 4:
                if (jVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", C0335f8.f28653k));
                }
                if (zk.n.f54974a.a(dVar, mVar, jVar)) {
                    if (dVar == zk.n.l) {
                        return true;
                    }
                    if (dVar != zk.n.f54984k && (jVarI = bm.e.i(mVar, zk.e.class, true)) != null && (dVar instanceof jm.c)) {
                        return ((jm.c) dVar).f43990a.a().equals(jVarI.a());
                    }
                }
                return false;
            case 5:
                if (jVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", C0335f8.f28653k));
                }
                zk.e eVar2 = (zk.e) bm.e.i(mVar, zk.e.class, true);
                zk.e eVar3 = (zk.e) bm.e.i(jVar, zk.e.class, false);
                if (eVar3 != null) {
                    if (eVar2 != null && bm.e.l(eVar2) && (eVar = (zk.e) bm.e.i(eVar2, zk.e.class, true)) != null && bm.e.r(eVar3.g(), eVar.a())) {
                        return true;
                    }
                    ?? T = mVar instanceof zk.c ? bm.e.t((zk.c) mVar) : mVar;
                    zk.e eVar4 = (zk.e) bm.e.i(T, zk.e.class, true);
                    if (eVar4 != null) {
                        if (bm.e.r(eVar3.g(), eVar4.a()) && dVar != zk.n.f54985m) {
                            if (!(T instanceof zk.c) || (T instanceof zk.i) || dVar == zk.n.l) {
                                return true;
                            }
                            if (dVar != zk.n.f54984k && dVar != null) {
                                pm.y type = dVar.getType();
                                if (bm.e.r(type, eVar3)) {
                                    return true;
                                }
                                type.b0();
                            }
                        }
                        return a(dVar, mVar, eVar3.e());
                    }
                }
                return false;
            case 6:
                if (jVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", C0335f8.f28653k));
                }
                if (!bm.e.d(jVar).w0(bm.e.d(mVar))) {
                    return false;
                }
                zk.n.f54986n.getClass();
                return true;
            case 7:
                if (jVar != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", C0335f8.f28653k));
            case 8:
                if (jVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", C0335f8.f28653k));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 9:
                if (jVar == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", C0335f8.f28653k));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 10:
                if (jVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", C0335f8.f28653k));
            default:
                if (jVar != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", C0335f8.f28653k));
        }
    }

    public final String toString() {
        return this.f43095a.e();
    }
}
