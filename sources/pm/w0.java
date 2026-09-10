package pm;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w0 f48482b = new w0(t0.f48476a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f48483a;

    public w0(t0 t0Var) {
        this.f48483a = t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                case 31:
                                case 32:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[0] = "originalProjection";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i10) {
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static int b(int i10, int i11) {
        if (i10 == 0) {
            a(38);
            throw null;
        }
        if (i11 == 0) {
            a(39);
            throw null;
        }
        if (i10 == 1) {
            if (i11 == 0) {
                a(40);
                throw null;
            }
        } else {
            if (i11 == 1) {
                if (i10 != 0) {
                    return i10;
                }
                a(41);
                throw null;
            }
            if (i10 != i11) {
                throw new AssertionError("Variance conflict: type parameter variance '" + l1.d.v(i10) + "' and projection kind '" + l1.d.v(i11) + "' cannot be combined");
            }
            if (i11 == 0) {
                a(42);
                throw null;
            }
        }
        return i11;
    }

    public static int c(int i10, int i11) {
        if (i10 == 2 && i11 == 3) {
            return 3;
        }
        return (i10 == 3 && i11 == 2) ? 2 : 1;
    }

    public static w0 d(y yVar) {
        if (yVar == null) {
            a(6);
            throw null;
        }
        return new w0(o0.f48464b.f(yVar.P(), yVar.t()));
    }

    public static w0 e(t0 t0Var, t0 t0Var2) {
        if (t0Var == null) {
            a(3);
            throw null;
        }
        if (t0Var2 == null) {
            a(4);
            throw null;
        }
        if (t0Var.e()) {
            t0Var = t0Var2;
        } else if (!t0Var2.e()) {
            t0Var = new q(t0Var, t0Var2);
        }
        return new w0(t0Var);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (ym.l.h(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + X3.j.f27836e;
        }
    }

    public final t0 f() {
        t0 t0Var = this.f48483a;
        if (t0Var != null) {
            return t0Var;
        }
        a(8);
        throw null;
    }

    public final y g(int i10, y yVar) {
        if (yVar == null) {
            a(9);
            throw null;
        }
        if (i10 == 0) {
            a(10);
            throw null;
        }
        if (this.f48483a.e()) {
            return yVar;
        }
        try {
            y yVarB = j(new r0(i10, yVar), null, 0).b();
            if (yVarB != null) {
                return yVarB;
            }
            a(12);
            throw null;
        } catch (v0 e10) {
            return rm.i.c(rm.h.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
        }
    }

    public final y i(int i10, y yVar) {
        if (yVar == null) {
            a(14);
            throw null;
        }
        if (i10 == 0) {
            a(15);
            throw null;
        }
        q0 r0Var = new r0(i10, f().f(i10, yVar));
        t0 t0Var = this.f48483a;
        if (!t0Var.e()) {
            try {
                r0Var = j(r0Var, null, 0);
            } catch (v0 unused) {
                r0Var = null;
            }
        }
        if (t0Var.a() || t0Var.b()) {
            boolean zB = t0Var.b();
            if (r0Var == null) {
                r0Var = null;
            } else if (!r0Var.c()) {
                y yVarB = r0Var.b();
                kotlin.jvm.internal.n.e(yVarB, "typeProjection.type");
                if (y0.c(yVarB, um.b.f52269e, null)) {
                    int iA = r0Var.a();
                    d5.u.u(iA, "typeProjection.projectionKind");
                    if (iA == 3) {
                        r0Var = new r0(iA, (y) go.k.b(yVarB).f52268b);
                    } else if (zB) {
                        r0Var = new r0(iA, (y) go.k.b(yVarB).f52267a);
                    } else {
                        um.c cVar = new um.c();
                        w0 w0Var = new w0(cVar);
                        if (!cVar.e()) {
                            try {
                                r0Var = w0Var.j(r0Var, null, 0);
                            } catch (v0 unused2) {
                                r0Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (r0Var == null) {
            return null;
        }
        return r0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x0210  */
    /* JADX WARN: Code duplicated, block: B:107:0x0218  */
    /* JADX WARN: Code duplicated, block: B:108:0x021b  */
    /* JADX WARN: Code duplicated, block: B:110:0x021e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0221  */
    /* JADX WARN: Code duplicated, block: B:113:0x0224  */
    /* JADX WARN: Code duplicated, block: B:115:0x0228  */
    /* JADX WARN: Code duplicated, block: B:118:0x0230  */
    /* JADX WARN: Code duplicated, block: B:119:0x023f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:126:0x0284  */
    /* JADX WARN: Code duplicated, block: B:128:0x0287  */
    /* JADX WARN: Code duplicated, block: B:131:0x028b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0292  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x019c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final q0 j(q0 q0Var, zk.m0 m0Var, int i10) throws v0 {
        y yVarB;
        int iA;
        a1 a1VarB0;
        a aVar;
        c0 c0Var;
        List parameters;
        List newArguments;
        ArrayList arrayList;
        boolean z10;
        y yVarP;
        zk.m0 m0Var2;
        q0 q0Var2;
        q0 q0VarJ;
        int iC;
        char c4;
        int iV;
        boolean z11;
        w0 w0Var;
        u uVar;
        int iC2;
        al.a aVarB0;
        l lVar;
        y yVarH;
        al.j jVarC;
        int iC3;
        y yVarI = null;
        if (q0Var == null) {
            a(18);
            throw null;
        }
        t0 t0Var = this.f48483a;
        if (i10 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(q0Var) + "; substitution: " + h(t0Var));
        }
        if (!q0Var.c()) {
            y yVarB2 = q0Var.b();
            if (yVarB2 instanceof z0) {
                z0 z0Var = (z0) yVarB2;
                a1 origin = z0Var.getOrigin();
                y yVarK = z0Var.k();
                q0 q0VarJ2 = j(new r0(q0Var.a(), origin), m0Var, i10 + 1);
                return q0VarJ2.c() ? q0VarJ2 : new r0(q0VarJ2.a(), c.B(q0VarJ2.b().b0(), i(q0Var.a(), yVarK)));
            }
            kotlin.jvm.internal.n.f(yVarB2, "<this>");
            yVarB2.b0();
            if (!(yVarB2.b0() instanceof nl.f)) {
                q0 q0VarD = t0Var.d(yVarB2);
                if (q0VarD == null) {
                    q0VarD = null;
                } else if (yVarB2.getAnnotations().c(wk.l.f53361y)) {
                    n0 n0VarP = q0VarD.b().P();
                    if (n0VarP instanceof qm.i) {
                        q0 q0Var3 = ((qm.i) n0VarP).f49183a;
                        int iA2 = q0Var3.a();
                        if (c(q0Var.a(), iA2) == 3) {
                            q0VarD = new r0(q0Var3.b());
                        } else if (m0Var != null && c(m0Var.v(), iA2) == 3) {
                            q0VarD = new r0(q0Var3.b());
                        }
                    }
                }
                int iA3 = q0Var.a();
                if (q0VarD == null && c.k(yVarB2)) {
                    al.a aVarB1 = yVarB2.b0();
                    l lVar2 = aVarB1 instanceof l ? (l) aVarB1 : null;
                    if (!(lVar2 != null ? lVar2.s() : false)) {
                        r rVar = (r) yVarB2.b0();
                        c0 c0Var2 = rVar.f48471c;
                        c0 c0Var3 = rVar.f48470b;
                        int i11 = i10 + 1;
                        q0 q0VarJ3 = j(new r0(iA3, c0Var3), m0Var, i11);
                        q0 q0VarJ4 = j(new r0(iA3, c0Var2), m0Var, i11);
                        int iA4 = q0VarJ3.a();
                        if (q0VarJ3.b() != c0Var3 || q0VarJ4.b() != c0Var2) {
                            return new r0(iA4, f.j(c.b(q0VarJ3.b()), c.b(q0VarJ4.b())));
                        }
                    } else if (!wk.h.E(yVarB2)) {
                        if (q0VarD != null) {
                            iC2 = c(iA3, q0VarD.a());
                            if (!(yVarB2.P() instanceof cm.b)) {
                                iC3 = v0.i.c(iC2);
                                if (iC3 != 1) {
                                    return new r0(3, yVarB2.P().d().o());
                                }
                                if (iC3 == 2) {
                                    throw new v0("Out-projection in in-position");
                                }
                            }
                            aVarB0 = yVarB2.b0();
                            if (aVarB0 instanceof l) {
                                lVar = (l) aVarB0;
                            } else {
                                lVar = null;
                            }
                            if (lVar != null) {
                                lVar = null;
                            } else {
                                lVar = null;
                            }
                            if (q0VarD.c()) {
                                return q0VarD;
                            }
                            if (lVar != null) {
                                yVarH = lVar.o(q0VarD.b());
                            } else {
                                yVarH = y0.h(q0VarD.b(), yVarB2.Q());
                            }
                            if (!yVarB2.getAnnotations().isEmpty()) {
                                jVarC = t0Var.c(yVarB2.getAnnotations());
                                if (jVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (jVarC.c(wk.l.f53361y)) {
                                    jVarC = new al.p(jVarC, new u0());
                                }
                                yVarH = qk.i0.g0(yVarH, new al.k(new al.j[]{yVarH.getAnnotations(), jVarC}));
                            }
                            if (iC2 == 1) {
                                iA3 = b(iA3, q0VarD.a());
                            }
                            return new r0(iA3, yVarH);
                        }
                        yVarB = q0Var.b();
                        iA = q0Var.a();
                        if (!(yVarB.P().e() instanceof zk.m0)) {
                            a1VarB0 = yVarB.b0();
                            if (a1VarB0 instanceof a) {
                                aVar = (a) a1VarB0;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                c0Var = aVar.f48409c;
                            } else {
                                c0Var = null;
                            }
                            if (c0Var != null) {
                                if (t0Var instanceof u) {
                                    uVar = (u) t0Var;
                                    if (uVar.f48479d) {
                                        w0Var = new w0(new u(uVar.f48477b, uVar.f48478c, false));
                                    } else {
                                        w0Var = this;
                                    }
                                } else {
                                    w0Var = this;
                                }
                                yVarI = w0Var.i(1, c0Var);
                            }
                            parameters = yVarB.P().getParameters();
                            newArguments = yVarB.t();
                            arrayList = new ArrayList(parameters.size());
                            z10 = false;
                            for (int i12 = 0; i12 < parameters.size(); i12++) {
                                m0Var2 = (zk.m0) parameters.get(i12);
                                q0Var2 = (q0) newArguments.get(i12);
                                q0VarJ = j(q0Var2, m0Var2, i10 + 1);
                                iC = v0.i.c(c(m0Var2.v(), q0VarJ.a()));
                                if (iC != 0) {
                                    if (iC != 1) {
                                        c4 = 2;
                                        if (iC == 2) {
                                        }
                                        z11 = true;
                                    } else {
                                        c4 = 2;
                                    }
                                    q0VarJ = y0.j(m0Var2);
                                    z11 = true;
                                } else {
                                    c4 = 2;
                                    iV = m0Var2.v();
                                    z11 = true;
                                    if (iV != 1) {
                                        q0VarJ = new r0(1, q0VarJ.b());
                                    }
                                }
                                if (q0VarJ != q0Var2) {
                                    z10 = z11;
                                }
                                arrayList.add(q0VarJ);
                            }
                            if (z10) {
                                newArguments = arrayList;
                            }
                            al.j newAnnotations = t0Var.c(yVarB.getAnnotations());
                            kotlin.jvm.internal.n.f(newArguments, "newArguments");
                            kotlin.jvm.internal.n.f(newAnnotations, "newAnnotations");
                            yVarP = c.p(yVarB, newArguments, newAnnotations, 4);
                            if (yVarP instanceof c0) {
                                yVarP = c.A((c0) yVarP, (c0) yVarI);
                            }
                            return new r0(iA, yVarP);
                        }
                    }
                } else if (!wk.h.E(yVarB2) && !c.j(yVarB2)) {
                    if (q0VarD != null) {
                        iC2 = c(iA3, q0VarD.a());
                        if (!(yVarB2.P() instanceof cm.b)) {
                            iC3 = v0.i.c(iC2);
                            if (iC3 != 1) {
                                return new r0(3, yVarB2.P().d().o());
                            }
                            if (iC3 == 2) {
                                throw new v0("Out-projection in in-position");
                            }
                        }
                        aVarB0 = yVarB2.b0();
                        if (aVarB0 instanceof l) {
                            lVar = (l) aVarB0;
                        } else {
                            lVar = null;
                        }
                        if (lVar != null || !lVar.s()) {
                            lVar = null;
                        }
                        if (q0VarD.c()) {
                            return q0VarD;
                        }
                        if (lVar != null) {
                            yVarH = lVar.o(q0VarD.b());
                        } else {
                            yVarH = y0.h(q0VarD.b(), yVarB2.Q());
                        }
                        if (!yVarB2.getAnnotations().isEmpty()) {
                            jVarC = t0Var.c(yVarB2.getAnnotations());
                            if (jVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (jVarC.c(wk.l.f53361y)) {
                                jVarC = new al.p(jVarC, new u0());
                            }
                            yVarH = qk.i0.g0(yVarH, new al.k(new al.j[]{yVarH.getAnnotations(), jVarC}));
                        }
                        if (iC2 == 1) {
                            iA3 = b(iA3, q0VarD.a());
                        }
                        return new r0(iA3, yVarH);
                    }
                    yVarB = q0Var.b();
                    iA = q0Var.a();
                    if (!(yVarB.P().e() instanceof zk.m0)) {
                        a1VarB0 = yVarB.b0();
                        if (a1VarB0 instanceof a) {
                            aVar = (a) a1VarB0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            c0Var = aVar.f48409c;
                        } else {
                            c0Var = null;
                        }
                        if (c0Var != null) {
                            if (t0Var instanceof u) {
                                uVar = (u) t0Var;
                                if (uVar.f48479d) {
                                    w0Var = this;
                                } else {
                                    w0Var = new w0(new u(uVar.f48477b, uVar.f48478c, false));
                                }
                            } else {
                                w0Var = this;
                            }
                            yVarI = w0Var.i(1, c0Var);
                        }
                        parameters = yVarB.P().getParameters();
                        newArguments = yVarB.t();
                        arrayList = new ArrayList(parameters.size());
                        z10 = false;
                        while (i12 < parameters.size()) {
                            m0Var2 = (zk.m0) parameters.get(i12);
                            q0Var2 = (q0) newArguments.get(i12);
                            q0VarJ = j(q0Var2, m0Var2, i10 + 1);
                            iC = v0.i.c(c(m0Var2.v(), q0VarJ.a()));
                            if (iC != 0) {
                                if (iC != 1) {
                                    c4 = 2;
                                    if (iC == 2) {
                                    }
                                    z11 = true;
                                } else {
                                    c4 = 2;
                                }
                                q0VarJ = y0.j(m0Var2);
                                z11 = true;
                            } else {
                                c4 = 2;
                                iV = m0Var2.v();
                                z11 = true;
                                if (iV != 1 && !q0VarJ.c()) {
                                    q0VarJ = new r0(1, q0VarJ.b());
                                }
                            }
                            if (q0VarJ != q0Var2) {
                                z10 = z11;
                            }
                            arrayList.add(q0VarJ);
                        }
                        if (z10) {
                            newArguments = arrayList;
                        }
                        al.j newAnnotations2 = t0Var.c(yVarB.getAnnotations());
                        kotlin.jvm.internal.n.f(newArguments, "newArguments");
                        kotlin.jvm.internal.n.f(newAnnotations2, "newAnnotations");
                        yVarP = c.p(yVarB, newArguments, newAnnotations2, 4);
                        if ((yVarP instanceof c0) && (yVarI instanceof c0)) {
                            yVarP = c.A((c0) yVarP, (c0) yVarI);
                        }
                        return new r0(iA, yVarP);
                    }
                }
            }
        }
        return q0Var;
    }
}
