package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public final class AbstractTypeChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractTypeChecker f44488a = new AbstractTypeChecker();

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final boolean a(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        if (classicTypeSystemContext.U(simpleTypeMarker)) {
            return true;
        }
        if (!(simpleTypeMarker instanceof CapturedTypeMarker)) {
            return false;
        }
        TypeProjection typeProjectionY = classicTypeSystemContext.Y(classicTypeSystemContext.t((CapturedTypeMarker) simpleTypeMarker));
        return !classicTypeSystemContext.j(typeProjectionY) && classicTypeSystemContext.U(classicTypeSystemContext.n(classicTypeSystemContext.n0(typeProjectionY)));
    }

    public static final boolean b(ClassicTypeSystemContext classicTypeSystemContext, TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2, boolean z2) {
        Set<KotlinTypeMarker> setN = classicTypeSystemContext.N(simpleTypeMarker);
        if (setN != null && setN.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : setN) {
            if (Intrinsics.a(classicTypeSystemContext.O(kotlinTypeMarker), classicTypeSystemContext.Z(simpleTypeMarker2))) {
                return true;
            }
            if (z2 && i(f44488a, typeCheckerState, simpleTypeMarker2, kotlinTypeMarker)) {
                return true;
            }
        }
        return false;
    }

    public static List c(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicyS;
        ClassicTypeSystemContext classicTypeSystemContext = typeCheckerState.f44532c;
        classicTypeSystemContext.I(simpleTypeMarker, typeConstructorMarker);
        boolean zC0 = classicTypeSystemContext.c0(typeConstructorMarker);
        EmptyList emptyList = EmptyList.X;
        if (zC0 || !classicTypeSystemContext.z(simpleTypeMarker)) {
            if (!classicTypeSystemContext.m0(typeConstructorMarker)) {
                SmartList smartList = new SmartList();
                typeCheckerState.c();
                ArrayDeque arrayDeque = typeCheckerState.g;
                Intrinsics.c(arrayDeque);
                SmartSet smartSet = typeCheckerState.f44534h;
                Intrinsics.c(smartSet);
                arrayDeque.push(simpleTypeMarker);
                while (!arrayDeque.isEmpty()) {
                    if (smartSet.f44649Y > 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker + ". Supertypes = " + CollectionsKt.D(smartSet, null, null, null, null, 63)).toString());
                    }
                    SimpleTypeMarker current = (SimpleTypeMarker) arrayDeque.pop();
                    Intrinsics.e(current, "current");
                    if (smartSet.add(current)) {
                        SimpleTypeMarker simpleTypeMarkerL = classicTypeSystemContext.l(current);
                        if (simpleTypeMarkerL == null) {
                            simpleTypeMarkerL = current;
                        }
                        boolean zO0 = classicTypeSystemContext.o0(classicTypeSystemContext.Z(simpleTypeMarkerL), typeConstructorMarker);
                        TypeCheckerState.SupertypesPolicy.None none = TypeCheckerState.SupertypesPolicy.None.f44537a;
                        if (zO0) {
                            smartList.add(simpleTypeMarkerL);
                            supertypesPolicyS = none;
                        } else {
                            supertypesPolicyS = classicTypeSystemContext.a(simpleTypeMarkerL) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f44536a : classicTypeSystemContext.S(simpleTypeMarkerL);
                        }
                        if (supertypesPolicyS.equals(none)) {
                            supertypesPolicyS = null;
                        }
                        if (supertypesPolicyS != null) {
                            Iterator it = classicTypeSystemContext.M(classicTypeSystemContext.Z(current)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(supertypesPolicyS.a(typeCheckerState, (KotlinTypeMarker) it.next()));
                            }
                        }
                    }
                }
                typeCheckerState.a();
                return smartList;
            }
            if (classicTypeSystemContext.o0(classicTypeSystemContext.Z(simpleTypeMarker), typeConstructorMarker)) {
                SimpleType simpleTypeL = classicTypeSystemContext.l(simpleTypeMarker);
                if (simpleTypeL != null) {
                    simpleTypeMarker = simpleTypeL;
                }
                return CollectionsKt.H(simpleTypeMarker);
            }
        }
        return emptyList;
    }

    public static List d(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        List listC = c(typeCheckerState, simpleTypeMarker, typeConstructorMarker);
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                ClassicTypeSystemContext classicTypeSystemContext = typeCheckerState.f44532c;
                TypeArgumentListMarker typeArgumentListMarkerD = classicTypeSystemContext.d((SimpleTypeMarker) obj);
                int iM = classicTypeSystemContext.m(typeArgumentListMarkerD);
                int i2 = 0;
                while (true) {
                    if (i2 >= iM) {
                        arrayList.add(obj);
                        break;
                    }
                    if (classicTypeSystemContext.V(classicTypeSystemContext.n0(classicTypeSystemContext.e(typeArgumentListMarkerD, i2))) != null) {
                        break;
                    }
                    i2++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    public static boolean e(TypeCheckerState typeCheckerState, KotlinTypeMarker a2, KotlinTypeMarker b2) {
        Intrinsics.f(a2, "a");
        Intrinsics.f(b2, "b");
        if (a2 == b2) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = f44488a;
        ClassicTypeSystemContext classicTypeSystemContext = typeCheckerState.f44532c;
        if (g(classicTypeSystemContext, a2) && g(classicTypeSystemContext, b2)) {
            KotlinTypeRefiner kotlinTypeRefiner = typeCheckerState.f44533e;
            KotlinTypeMarker kotlinTypeMarkerD = typeCheckerState.d(kotlinTypeRefiner.a(a2));
            KotlinTypeMarker kotlinTypeMarkerD2 = typeCheckerState.d(kotlinTypeRefiner.a(b2));
            SimpleType simpleTypeI0 = classicTypeSystemContext.i0(kotlinTypeMarkerD);
            if (!classicTypeSystemContext.o0(classicTypeSystemContext.O(kotlinTypeMarkerD), classicTypeSystemContext.O(kotlinTypeMarkerD2))) {
                return false;
            }
            if (classicTypeSystemContext.a(simpleTypeI0) == 0) {
                return classicTypeSystemContext.R(kotlinTypeMarkerD) || classicTypeSystemContext.R(kotlinTypeMarkerD2) || classicTypeSystemContext.o(simpleTypeI0) == classicTypeSystemContext.o(classicTypeSystemContext.i0(kotlinTypeMarkerD2));
            }
        }
        return i(abstractTypeChecker, typeCheckerState, a2, b2) && i(abstractTypeChecker, typeCheckerState, b2, a2);
    }

    public static TypeParameterMarker f(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, SimpleTypeMarker simpleTypeMarker) {
        UnwrappedType unwrappedTypeN0;
        int iA = classicTypeSystemContext.a(kotlinTypeMarker);
        int i2 = 0;
        while (true) {
            if (i2 >= iA) {
                return null;
            }
            TypeArgumentMarker typeArgumentMarkerU = classicTypeSystemContext.u(kotlinTypeMarker, i2);
            TypeArgumentMarker typeArgumentMarker = classicTypeSystemContext.j(typeArgumentMarkerU) ? null : typeArgumentMarkerU;
            if (typeArgumentMarker != null && (unwrappedTypeN0 = classicTypeSystemContext.n0(typeArgumentMarker)) != null) {
                boolean z2 = classicTypeSystemContext.a0(classicTypeSystemContext.H(classicTypeSystemContext.i0(unwrappedTypeN0))) && classicTypeSystemContext.a0(classicTypeSystemContext.H(classicTypeSystemContext.i0(simpleTypeMarker)));
                if (unwrappedTypeN0.equals(simpleTypeMarker) || (z2 && Intrinsics.a(classicTypeSystemContext.O(unwrappedTypeN0), classicTypeSystemContext.O(simpleTypeMarker)))) {
                    return classicTypeSystemContext.f(classicTypeSystemContext.O(kotlinTypeMarker), i2);
                }
                TypeParameterMarker typeParameterMarkerF = f(classicTypeSystemContext, unwrappedTypeN0, simpleTypeMarker);
                if (typeParameterMarkerF != null) {
                    return typeParameterMarkerF;
                }
            }
            i2++;
        }
    }

    public static boolean g(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!classicTypeSystemContext.P(classicTypeSystemContext.O(kotlinTypeMarker)) || classicTypeSystemContext.L(kotlinTypeMarker) || classicTypeSystemContext.T(kotlinTypeMarker) || classicTypeSystemContext.i(kotlinTypeMarker) || !Intrinsics.a(classicTypeSystemContext.Z(classicTypeSystemContext.i0(kotlinTypeMarker)), classicTypeSystemContext.Z(classicTypeSystemContext.n(kotlinTypeMarker)))) ? false : true;
    }

    public static boolean h(TypeCheckerState typeCheckerState, TypeArgumentListMarker capturedSubArguments, SimpleTypeMarker simpleTypeMarker) {
        boolean zI;
        Intrinsics.f(capturedSubArguments, "capturedSubArguments");
        ClassicTypeSystemContext classicTypeSystemContext = typeCheckerState.f44532c;
        TypeConstructor typeConstructorZ = classicTypeSystemContext.Z(simpleTypeMarker);
        int iM = classicTypeSystemContext.m(capturedSubArguments);
        int iE = classicTypeSystemContext.E(typeConstructorZ);
        if (iM == iE && iM == classicTypeSystemContext.a(simpleTypeMarker)) {
            for (int i2 = 0; i2 < iE; i2++) {
                TypeArgumentMarker typeArgumentMarkerU = classicTypeSystemContext.u(simpleTypeMarker, i2);
                if (!classicTypeSystemContext.j(typeArgumentMarkerU)) {
                    UnwrappedType unwrappedTypeN0 = classicTypeSystemContext.n0(typeArgumentMarkerU);
                    TypeArgumentMarker typeArgumentMarkerE = classicTypeSystemContext.e(capturedSubArguments, i2);
                    classicTypeSystemContext.j0(typeArgumentMarkerE);
                    UnwrappedType unwrappedTypeN1 = classicTypeSystemContext.n0(typeArgumentMarkerE);
                    TypeVariance typeVarianceK = classicTypeSystemContext.k(classicTypeSystemContext.f(typeConstructorZ, i2));
                    TypeVariance typeVarianceJ0 = classicTypeSystemContext.j0(typeArgumentMarkerU);
                    TypeVariance typeVariance = TypeVariance.INV;
                    if (typeVarianceK == typeVariance) {
                        typeVarianceK = typeVarianceJ0;
                    } else if (typeVarianceJ0 != typeVariance && typeVarianceK != typeVarianceJ0) {
                        typeVarianceK = null;
                    }
                    if (typeVarianceK == null) {
                        return typeCheckerState.f44530a;
                    }
                    AbstractTypeChecker abstractTypeChecker = f44488a;
                    if (typeVarianceK != typeVariance || (!j(classicTypeSystemContext, unwrappedTypeN1, unwrappedTypeN0, typeConstructorZ) && !j(classicTypeSystemContext, unwrappedTypeN0, unwrappedTypeN1, typeConstructorZ))) {
                        int i3 = typeCheckerState.f;
                        if (i3 > 100) {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + unwrappedTypeN1).toString());
                        }
                        typeCheckerState.f = i3 + 1;
                        int iOrdinal = typeVarianceK.ordinal();
                        if (iOrdinal == 0) {
                            zI = i(abstractTypeChecker, typeCheckerState, unwrappedTypeN0, unwrappedTypeN1);
                        } else if (iOrdinal == 1) {
                            zI = i(abstractTypeChecker, typeCheckerState, unwrappedTypeN1, unwrappedTypeN0);
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zI = e(typeCheckerState, unwrappedTypeN1, unwrappedTypeN0);
                        }
                        typeCheckerState.f--;
                        if (!zI) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0179  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:206:0x0330  */
    /* JADX WARN: Code duplicated, block: B:260:0x0460  */
    /* JADX WARN: Code duplicated, block: B:263:0x0471  */
    /* JADX WARN: Code duplicated, block: B:267:0x047c  */
    /* JADX WARN: Code duplicated, block: B:269:0x047f  */
    /* JADX WARN: Code duplicated, block: B:271:0x0491  */
    /* JADX WARN: Code duplicated, block: B:276:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:278:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:281:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:283:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:286:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:301:0x0530  */
    /* JADX WARN: Code duplicated, block: B:303:0x053f  */
    /* JADX WARN: Code duplicated, block: B:305:0x0549  */
    /* JADX WARN: Code duplicated, block: B:307:0x054e  */
    /* JADX WARN: Code duplicated, block: B:311:0x055b  */
    /* JADX WARN: Code duplicated, block: B:314:0x0571  */
    /* JADX WARN: Code duplicated, block: B:316:0x0577  */
    /* JADX WARN: Code duplicated, block: B:318:0x0586  */
    /* JADX WARN: Code duplicated, block: B:320:0x058c  */
    /* JADX WARN: Code duplicated, block: B:321:0x058e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0596  */
    /* JADX WARN: Code duplicated, block: B:331:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:335:0x05c6 A[LOOP:6: B:329:0x05a6->B:335:0x05c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:351:0x0472 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x04dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x059a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x05cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x056b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:? A[LOOP:11: B:77:0x0116->B:386:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:? A[LOOP:12: B:93:0x0155->B:389:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0151  */
    /* JADX WARN: Code duplicated, block: B:95:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0166  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
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
    public static boolean i(AbstractTypeChecker abstractTypeChecker, final TypeCheckerState typeCheckerState, KotlinTypeMarker subType, KotlinTypeMarker superType) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z2;
        List listC;
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        final ArrayList<SimpleTypeMarker> arrayList;
        int i2;
        int size;
        TypeConstructor typeConstructorZ;
        ArrayDeque arrayDeque;
        SmartSet smartSet;
        SimpleTypeMarker current;
        TypeCheckerState.SupertypesPolicy supertypesPolicy2;
        Iterator it;
        SimpleTypeMarker simpleTypeMarkerA;
        ArgumentList argumentList;
        int iE;
        boolean z3;
        boolean z4;
        ?? r8;
        boolean z5;
        TypeArgumentMarker typeArgumentMarkerC;
        UnwrappedType unwrappedTypeN0;
        SimpleType simpleTypeF;
        SimpleType simpleTypeH;
        TypeConstructor typeConstructorZ2;
        TypeConstructor typeConstructorZ3;
        TypeParameterMarker typeParameterMarkerF;
        Collection collectionM;
        Iterator it2;
        Collection collectionM2;
        Iterator it3;
        boolean z6;
        SimpleType simpleTypeH2;
        SimpleType simpleTypeH3;
        abstractTypeChecker.getClass();
        Intrinsics.f(subType, "subType");
        Intrinsics.f(superType, "superType");
        if (subType == superType) {
            return true;
        }
        boolean z7 = false;
        if (typeCheckerState.b(subType, superType)) {
            KotlinTypeRefiner kotlinTypeRefiner = typeCheckerState.f44533e;
            KotlinTypeMarker kotlinTypeMarkerD = typeCheckerState.d(kotlinTypeRefiner.a(subType));
            KotlinTypeMarker kotlinTypeMarkerD2 = typeCheckerState.d(kotlinTypeRefiner.a(superType));
            final ?? r4 = typeCheckerState.f44532c;
            SimpleType simpleTypeI0 = r4.i0(kotlinTypeMarkerD);
            SimpleType simpleTypeN = r4.n(kotlinTypeMarkerD2);
            boolean zQ = r4.q(simpleTypeI0);
            AbstractTypeChecker abstractTypeChecker2 = f44488a;
            if (!zQ && !r4.q(simpleTypeN)) {
                boolean zA = r4.A(simpleTypeI0);
                boolean z8 = typeCheckerState.f44531b;
                if (zA && r4.A(simpleTypeN)) {
                    DefinitelyNotNullType definitelyNotNullTypeL0 = r4.l0(simpleTypeI0);
                    if (definitelyNotNullTypeL0 == null || (simpleTypeH2 = r4.h(definitelyNotNullTypeL0)) == null) {
                        simpleTypeH2 = simpleTypeI0;
                    }
                    DefinitelyNotNullType definitelyNotNullTypeL1 = r4.l0(simpleTypeN);
                    if (definitelyNotNullTypeL1 == null || (simpleTypeH3 = r4.h(definitelyNotNullTypeL1)) == null) {
                        simpleTypeH3 = simpleTypeN;
                    }
                    boolValueOf = Boolean.valueOf((r4.Z(simpleTypeH2) == r4.Z(simpleTypeH3) && ((r4.T(simpleTypeI0) || !r4.T(simpleTypeN)) && (!r4.o(simpleTypeI0) || r4.o(simpleTypeN)))) || z8);
                } else if (r4.w(simpleTypeI0) || r4.w(simpleTypeN)) {
                    boolValueOf = Boolean.valueOf(z8);
                } else {
                    DefinitelyNotNullType definitelyNotNullTypeL2 = r4.l0(simpleTypeN);
                    if (definitelyNotNullTypeL2 == null || (simpleTypeH = r4.h(definitelyNotNullTypeL2)) == null) {
                        simpleTypeH = simpleTypeN;
                    }
                    CapturedTypeMarker capturedTypeMarkerH0 = r4.h0(simpleTypeH);
                    KotlinTypeMarker kotlinTypeMarkerB0 = capturedTypeMarkerH0 != null ? r4.b0(capturedTypeMarkerH0) : null;
                    if (capturedTypeMarkerH0 == null || kotlinTypeMarkerB0 == null) {
                        typeConstructorZ2 = r4.Z(simpleTypeN);
                        if (r4.e0(typeConstructorZ2)) {
                            r4.o(simpleTypeN);
                            collectionM2 = r4.M(typeConstructorZ2);
                            if (!(collectionM2 instanceof Collection) && collectionM2.isEmpty()) {
                                z6 = true;
                                break;
                            }
                            it3 = collectionM2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z6 = true;
                                    break;
                                }
                                if (!i(abstractTypeChecker2, typeCheckerState, simpleTypeI0, (KotlinTypeMarker) it3.next())) {
                                    z6 = false;
                                    break;
                                }
                            }
                            boolValueOf = Boolean.valueOf(z6);
                        } else {
                            typeConstructorZ3 = r4.Z(simpleTypeI0);
                            if (simpleTypeI0 instanceof CapturedTypeMarker) {
                                typeParameterMarkerF = f(r4, simpleTypeN, simpleTypeI0);
                                if (typeParameterMarkerF == null && r4.c(typeParameterMarkerF, r4.Z(simpleTypeN))) {
                                    boolValueOf = Boolean.TRUE;
                                } else {
                                    boolValueOf = null;
                                }
                            } else {
                                if (r4.e0(typeConstructorZ3)) {
                                    collectionM = r4.M(typeConstructorZ3);
                                    if ((collectionM instanceof Collection) || !collectionM.isEmpty()) {
                                        it2 = collectionM.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                typeParameterMarkerF = f(r4, simpleTypeN, simpleTypeI0);
                                                if (typeParameterMarkerF == null) {
                                                }
                                            } else if (!(((KotlinTypeMarker) it2.next()) instanceof CapturedTypeMarker)) {
                                            }
                                        }
                                    } else {
                                        typeParameterMarkerF = f(r4, simpleTypeN, simpleTypeI0);
                                        if (typeParameterMarkerF == null) {
                                        }
                                    }
                                }
                                boolValueOf = null;
                            }
                        }
                    } else {
                        if (r4.o(simpleTypeN)) {
                            kotlinTypeMarkerB0 = r4.G(kotlinTypeMarkerB0);
                        } else if (r4.T(simpleTypeN)) {
                            kotlinTypeMarkerB0 = r4.X(kotlinTypeMarkerB0);
                        }
                        if (i(abstractTypeChecker2, typeCheckerState, simpleTypeI0, kotlinTypeMarkerB0)) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            typeConstructorZ2 = r4.Z(simpleTypeN);
                            if (r4.e0(typeConstructorZ2)) {
                                r4.o(simpleTypeN);
                                collectionM2 = r4.M(typeConstructorZ2);
                                if (!(collectionM2 instanceof Collection)) {
                                    it3 = collectionM2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z6 = true;
                                            break;
                                        }
                                        if (!i(abstractTypeChecker2, typeCheckerState, simpleTypeI0, (KotlinTypeMarker) it3.next())) {
                                            z6 = false;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = collectionM2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z6 = true;
                                            break;
                                        }
                                        if (!i(abstractTypeChecker2, typeCheckerState, simpleTypeI0, (KotlinTypeMarker) it3.next())) {
                                            z6 = false;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z6);
                            } else {
                                typeConstructorZ3 = r4.Z(simpleTypeI0);
                                if (simpleTypeI0 instanceof CapturedTypeMarker) {
                                    typeParameterMarkerF = f(r4, simpleTypeN, simpleTypeI0);
                                    if (typeParameterMarkerF == null) {
                                        boolValueOf = null;
                                    } else {
                                        boolValueOf = null;
                                    }
                                } else {
                                    if (r4.e0(typeConstructorZ3)) {
                                        collectionM = r4.M(typeConstructorZ3);
                                        if (collectionM instanceof Collection) {
                                            it2 = collectionM.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    typeParameterMarkerF = f(r4, simpleTypeN, simpleTypeI0);
                                                    if (typeParameterMarkerF == null) {
                                                    }
                                                } else if (!(((KotlinTypeMarker) it2.next()) instanceof CapturedTypeMarker)) {
                                                }
                                            }
                                        } else {
                                            it2 = collectionM.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    typeParameterMarkerF = f(r4, simpleTypeN, simpleTypeI0);
                                                    if (typeParameterMarkerF == null) {
                                                    }
                                                } else if (!(((KotlinTypeMarker) it2.next()) instanceof CapturedTypeMarker)) {
                                                }
                                            }
                                        }
                                    }
                                    boolValueOf = null;
                                }
                            }
                        }
                    }
                }
            } else if (typeCheckerState.f44530a) {
                boolValueOf = Boolean.TRUE;
            } else if (!r4.o(simpleTypeI0) || r4.o(simpleTypeN)) {
                SimpleType a2 = r4.d0(simpleTypeI0, false);
                SimpleType b2 = r4.d0(simpleTypeN, false);
                Intrinsics.f(a2, "a");
                Intrinsics.f(b2, "b");
                boolValueOf = Boolean.valueOf(AbstractStrictEqualityTypeChecker.b(r4, a2, b2));
            } else {
                boolValueOf = Boolean.FALSE;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            SimpleTypeMarker simpleTypeMarkerI0 = r4.i0(kotlinTypeMarkerD);
            final SimpleType simpleTypeN2 = r4.n(kotlinTypeMarkerD2);
            boolean zO = r4.o(simpleTypeN2);
            TypeCheckerState.SupertypesPolicy.None none = TypeCheckerState.SupertypesPolicy.None.f44537a;
            TypeCheckerState.SupertypesPolicy.LowerIfFlexible lowerIfFlexible = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f44536a;
            int i3 = 1000;
            if (!zO && !r4.T(simpleTypeMarkerI0) && !r4.i(simpleTypeMarkerI0) && ((!(simpleTypeMarkerI0 instanceof CapturedTypeMarker) || !r4.b((CapturedTypeMarker) simpleTypeMarkerI0)) && !AbstractNullabilityChecker.a(typeCheckerState, simpleTypeMarkerI0, lowerIfFlexible))) {
                if (!r4.T(simpleTypeN2) && !AbstractNullabilityChecker.a(typeCheckerState, simpleTypeN2, TypeCheckerState.SupertypesPolicy.UpperIfFlexible.f44538a) && !r4.z(simpleTypeMarkerI0)) {
                    TypeConstructor end = r4.Z(simpleTypeN2);
                    Intrinsics.f(end, "end");
                    if (!AbstractNullabilityChecker.b(typeCheckerState, simpleTypeMarkerI0, end)) {
                        typeCheckerState.c();
                        ArrayDeque arrayDeque2 = typeCheckerState.g;
                        Intrinsics.c(arrayDeque2);
                        SmartSet smartSet2 = typeCheckerState.f44534h;
                        Intrinsics.c(smartSet2);
                        arrayDeque2.push(simpleTypeMarkerI0);
                        loop0: while (true) {
                            if (arrayDeque2.isEmpty()) {
                                typeCheckerState.a();
                                return false;
                            }
                            if (smartSet2.f44649Y > i3) {
                                throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarkerI0 + ". Supertypes = " + CollectionsKt.D(smartSet2, null, null, null, null, 63)).toString());
                            }
                            SimpleTypeMarker current2 = (SimpleTypeMarker) arrayDeque2.pop();
                            Intrinsics.e(current2, "current");
                            if (smartSet2.add(current2)) {
                                TypeCheckerState.SupertypesPolicy supertypesPolicy3 = r4.o(current2) ? none : lowerIfFlexible;
                                if (supertypesPolicy3.equals(none)) {
                                    supertypesPolicy3 = null;
                                }
                                if (supertypesPolicy3 != null) {
                                    Iterator it4 = r4.M(r4.Z(current2)).iterator();
                                    while (it4.hasNext()) {
                                        SimpleTypeMarker simpleTypeMarkerA2 = supertypesPolicy3.a(typeCheckerState, (KotlinTypeMarker) it4.next());
                                        if (AbstractNullabilityChecker.b(typeCheckerState, simpleTypeMarkerA2, end)) {
                                            typeCheckerState.a();
                                            break loop0;
                                        }
                                        arrayDeque2.add(simpleTypeMarkerA2);
                                    }
                                }
                                i3 = 1000;
                            }
                        }
                    }
                }
            }
            SimpleType simpleTypeI1 = r4.i0(simpleTypeMarkerI0);
            SimpleType simpleTypeN3 = r4.n(simpleTypeN2);
            if (!r4.U(simpleTypeI1) && !r4.U(simpleTypeN3)) {
                bool = null;
            } else if (a(r4, simpleTypeI1) && a(r4, simpleTypeN3)) {
                bool = Boolean.TRUE;
            } else if (r4.U(simpleTypeI1)) {
                if (b(r4, typeCheckerState, simpleTypeI1, simpleTypeN3, false)) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
            } else if (r4.U(simpleTypeN3)) {
                TypeConstructor typeConstructorZ4 = r4.Z(simpleTypeI1);
                if (typeConstructorZ4 instanceof IntersectionTypeConstructorMarker) {
                    Collection collectionM3 = r4.M(typeConstructorZ4);
                    if (!(collectionM3 instanceof Collection) || !collectionM3.isEmpty()) {
                        Iterator it5 = collectionM3.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                SimpleType simpleTypeF2 = r4.F((KotlinTypeMarker) it5.next());
                                if (simpleTypeF2 != null && r4.U(simpleTypeF2)) {
                                }
                            } else if (!b(r4, typeCheckerState, simpleTypeN3, simpleTypeI1, true)) {
                                bool = null;
                            }
                        }
                    } else if (!b(r4, typeCheckerState, simpleTypeN3, simpleTypeI1, true)) {
                        bool = null;
                    }
                } else if (!b(r4, typeCheckerState, simpleTypeN3, simpleTypeI1, true)) {
                    bool = null;
                }
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            TypeConstructor superConstructor = r4.Z(simpleTypeN2);
            if ((r4.o0(r4.Z(simpleTypeMarkerI0), superConstructor) && r4.E(superConstructor) == 0) || r4.v(r4.Z(simpleTypeN2))) {
                return true;
            }
            Intrinsics.f(superConstructor, "superConstructor");
            if (!r4.z(simpleTypeMarkerI0)) {
                if (r4.c0(superConstructor) || r4.x(superConstructor)) {
                    SmartList<SimpleTypeMarker> smartList = new SmartList();
                    typeCheckerState.c();
                    ArrayDeque arrayDeque3 = typeCheckerState.g;
                    Intrinsics.c(arrayDeque3);
                    SmartSet smartSet3 = typeCheckerState.f44534h;
                    Intrinsics.c(smartSet3);
                    arrayDeque3.push(simpleTypeMarkerI0);
                    while (!arrayDeque3.isEmpty()) {
                        if (smartSet3.f44649Y > 1000) {
                            throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarkerI0 + ". Supertypes = " + CollectionsKt.D(smartSet3, null, null, null, null, 63)).toString());
                        }
                        SimpleTypeMarker current3 = (SimpleTypeMarker) arrayDeque3.pop();
                        Intrinsics.e(current3, "current");
                        if (smartSet3.add(current3)) {
                            if (r4.z(current3)) {
                                smartList.add(current3);
                                supertypesPolicy = none;
                            } else {
                                supertypesPolicy = lowerIfFlexible;
                            }
                            if (supertypesPolicy.equals(none)) {
                                supertypesPolicy = null;
                            }
                            if (supertypesPolicy != null) {
                                Iterator it6 = r4.M(r4.Z(current3)).iterator();
                                while (it6.hasNext()) {
                                    arrayDeque3.add(supertypesPolicy.a(typeCheckerState, (KotlinTypeMarker) it6.next()));
                                    z7 = z7;
                                }
                            }
                        }
                    }
                    z2 = z7;
                    typeCheckerState.a();
                    ArrayList arrayList2 = new ArrayList();
                    for (SimpleTypeMarker it7 : smartList) {
                        Intrinsics.e(it7, "it");
                        CollectionsKt.g(d(typeCheckerState, it7, superConstructor), arrayList2);
                    }
                    listC = arrayList2;
                } else {
                    listC = c(typeCheckerState, simpleTypeMarkerI0, superConstructor);
                }
                List<SimpleTypeMarker> list = listC;
                i2 = 10;
                arrayList = new ArrayList(CollectionsKt.n(list, 10));
                for (SimpleTypeMarker simpleTypeMarker : list) {
                    simpleTypeF = r4.F(typeCheckerState.d(simpleTypeMarker));
                    if (simpleTypeF == null) {
                        simpleTypeMarker = simpleTypeF;
                    }
                    arrayList.add(simpleTypeMarker);
                }
                size = arrayList.size();
                if (size != 0) {
                    typeConstructorZ = r4.Z(simpleTypeMarkerI0);
                    if (r4.c0(typeConstructorZ)) {
                        return r4.J(typeConstructorZ);
                    }
                    if (r4.J(r4.Z(simpleTypeMarkerI0))) {
                        return true;
                    }
                    typeCheckerState.c();
                    arrayDeque = typeCheckerState.g;
                    Intrinsics.c(arrayDeque);
                    smartSet = typeCheckerState.f44534h;
                    Intrinsics.c(smartSet);
                    arrayDeque.push(simpleTypeMarkerI0);
                    while (!arrayDeque.isEmpty()) {
                        if (smartSet.f44649Y <= 1000) {
                            throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarkerI0 + ". Supertypes = " + CollectionsKt.D(smartSet, null, null, null, null, 63)).toString());
                        }
                        current = (SimpleTypeMarker) arrayDeque.pop();
                        Intrinsics.e(current, "current");
                        if (!smartSet.add(current)) {
                            if (r4.z(current)) {
                                supertypesPolicy2 = none;
                            } else {
                                supertypesPolicy2 = lowerIfFlexible;
                            }
                            if (supertypesPolicy2.equals(none)) {
                                supertypesPolicy2 = null;
                            }
                            if (supertypesPolicy2 == null) {
                                continue;
                            } else {
                                it = r4.M(r4.Z(current)).iterator();
                                while (it.hasNext()) {
                                    simpleTypeMarkerA = supertypesPolicy2.a(typeCheckerState, (KotlinTypeMarker) it.next());
                                    if (r4.J(r4.Z(simpleTypeMarkerA))) {
                                        typeCheckerState.a();
                                        return true;
                                    }
                                    arrayDeque.add(simpleTypeMarkerA);
                                }
                            }
                        }
                    }
                    typeCheckerState.a();
                    return z2;
                }
                if (size != 1) {
                    return h(typeCheckerState, r4.d((SimpleTypeMarker) CollectionsKt.w(arrayList)), simpleTypeN2);
                }
                argumentList = new ArgumentList(r4.E(superConstructor));
                iE = r4.E(superConstructor);
                z3 = z2;
                z4 = z3;
                while (r8 < iE) {
                    if (z4 && r4.k(r4.f(superConstructor, r8)) == TypeVariance.OUT) {
                        z5 = z2;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(arrayList, i2));
                        for (SimpleTypeMarker simpleTypeMarker2 : arrayList) {
                            typeArgumentMarkerC = r4.C(simpleTypeMarker2, r8);
                            if (typeArgumentMarkerC == null) {
                                if (r4.j0(typeArgumentMarkerC) != TypeVariance.INV) {
                                    typeArgumentMarkerC = null;
                                }
                                if (typeArgumentMarkerC == null && (unwrappedTypeN0 = r4.n0(typeArgumentMarkerC)) != null) {
                                    arrayList3.add(unwrappedTypeN0);
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + simpleTypeMarker2 + ", subType: " + simpleTypeMarkerI0 + ", superType: " + simpleTypeN2).toString());
                        }
                        argumentList.add(r4.s(r4.r(arrayList3)));
                    }
                    i2 = 10;
                    r8++;
                    z4 = z5;
                }
                if (z4 && h(typeCheckerState, argumentList, simpleTypeN2)) {
                    r8 = z3;
                    return true;
                }
                r8 = z3;
                r8 = z3;
                Function1<TypeCheckerState.ForkPointContext, Unit> function1 = new Function1<TypeCheckerState.ForkPointContext, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4

                    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4$1, reason: invalid class name */
                    final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
                        public final /* synthetic */ TypeCheckerState X;

                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                        public final /* synthetic */ ClassicTypeSystemContext f44490Y;
                        public final /* synthetic */ SimpleTypeMarker Z;
                        public final /* synthetic */ SimpleTypeMarker e0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TypeCheckerState typeCheckerState, ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
                            super(0);
                            this.X = typeCheckerState;
                            this.f44490Y = classicTypeSystemContext;
                            this.Z = simpleTypeMarker;
                            this.e0 = simpleTypeMarker2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(AbstractTypeChecker.h(this.X, this.f44490Y.d(this.Z), this.e0));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TypeCheckerState.ForkPointContext runForkingPoint = (TypeCheckerState.ForkPointContext) obj;
                        Intrinsics.f(runForkingPoint, "$this$runForkingPoint");
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            runForkingPoint.a(new AnonymousClass1(typeCheckerState, r4, (SimpleTypeMarker) it8.next(), simpleTypeN2));
                        }
                        return Unit.f43263a;
                    }
                };
                TypeCheckerState.ForkPointContext.Default r0 = new TypeCheckerState.ForkPointContext.Default();
                function1.invoke(r0);
                return r0.f44535a;
            }
            listC = d(typeCheckerState, simpleTypeMarkerI0, superConstructor);
            z2 = false;
            List<SimpleTypeMarker> list2 = listC;
            i2 = 10;
            arrayList = new ArrayList(CollectionsKt.n(list2, 10));
            while (r6.hasNext()) {
                simpleTypeF = r4.F(typeCheckerState.d(simpleTypeMarker));
                if (simpleTypeF == null) {
                    simpleTypeMarker = simpleTypeF;
                }
                arrayList.add(simpleTypeMarker);
            }
            size = arrayList.size();
            if (size != 0) {
                typeConstructorZ = r4.Z(simpleTypeMarkerI0);
                if (r4.c0(typeConstructorZ)) {
                    return r4.J(typeConstructorZ);
                }
                if (r4.J(r4.Z(simpleTypeMarkerI0))) {
                    return true;
                }
                typeCheckerState.c();
                arrayDeque = typeCheckerState.g;
                Intrinsics.c(arrayDeque);
                smartSet = typeCheckerState.f44534h;
                Intrinsics.c(smartSet);
                arrayDeque.push(simpleTypeMarkerI0);
                while (!arrayDeque.isEmpty()) {
                    if (smartSet.f44649Y <= 1000) {
                        throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarkerI0 + ". Supertypes = " + CollectionsKt.D(smartSet, null, null, null, null, 63)).toString());
                    }
                    current = (SimpleTypeMarker) arrayDeque.pop();
                    Intrinsics.e(current, "current");
                    if (!smartSet.add(current)) {
                        if (r4.z(current)) {
                            supertypesPolicy2 = none;
                        } else {
                            supertypesPolicy2 = lowerIfFlexible;
                        }
                        if (supertypesPolicy2.equals(none)) {
                            supertypesPolicy2 = null;
                        }
                        if (supertypesPolicy2 == null) {
                            continue;
                        } else {
                            it = r4.M(r4.Z(current)).iterator();
                            while (it.hasNext()) {
                                simpleTypeMarkerA = supertypesPolicy2.a(typeCheckerState, (KotlinTypeMarker) it.next());
                                if (r4.J(r4.Z(simpleTypeMarkerA))) {
                                    typeCheckerState.a();
                                    return true;
                                }
                                arrayDeque.add(simpleTypeMarkerA);
                            }
                        }
                    }
                }
                typeCheckerState.a();
                return z2;
            }
            if (size != 1) {
                return h(typeCheckerState, r4.d((SimpleTypeMarker) CollectionsKt.w(arrayList)), simpleTypeN2);
            }
            argumentList = new ArgumentList(r4.E(superConstructor));
            iE = r4.E(superConstructor);
            z3 = z2;
            z4 = z3;
            while (r8 < iE) {
                if (z4) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.n(arrayList, i2));
                    while (r12.hasNext()) {
                        typeArgumentMarkerC = r4.C(simpleTypeMarker2, r8);
                        if (typeArgumentMarkerC == null) {
                            if (r4.j0(typeArgumentMarkerC) != TypeVariance.INV) {
                                typeArgumentMarkerC = null;
                            }
                            if (typeArgumentMarkerC == null) {
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + simpleTypeMarker2 + ", subType: " + simpleTypeMarkerI0 + ", superType: " + simpleTypeN2).toString());
                    }
                    argumentList.add(r4.s(r4.r(arrayList4)));
                }
                i2 = 10;
                r8++;
                z4 = z5;
            }
            if (z4) {
            }
            r8 = z3;
            r8 = z3;
            Function1<TypeCheckerState.ForkPointContext, Unit> function2 = new Function1<TypeCheckerState.ForkPointContext, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function0<Boolean> {
                    public final /* synthetic */ TypeCheckerState X;

                    /* JADX INFO: renamed from: Y, reason: collision with root package name */
                    public final /* synthetic */ ClassicTypeSystemContext f44490Y;
                    public final /* synthetic */ SimpleTypeMarker Z;
                    public final /* synthetic */ SimpleTypeMarker e0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TypeCheckerState typeCheckerState, ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
                        super(0);
                        this.X = typeCheckerState;
                        this.f44490Y = classicTypeSystemContext;
                        this.Z = simpleTypeMarker;
                        this.e0 = simpleTypeMarker2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(AbstractTypeChecker.h(this.X, this.f44490Y.d(this.Z), this.e0));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TypeCheckerState.ForkPointContext runForkingPoint = (TypeCheckerState.ForkPointContext) obj;
                    Intrinsics.f(runForkingPoint, "$this$runForkingPoint");
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        runForkingPoint.a(new AnonymousClass1(typeCheckerState, r4, (SimpleTypeMarker) it8.next(), simpleTypeN2));
                    }
                    return Unit.f43263a;
                }
            };
            TypeCheckerState.ForkPointContext.Default r1 = new TypeCheckerState.ForkPointContext.Default();
            function2.invoke(r1);
            return r1.f44535a;
        }
        return false;
    }

    public static boolean j(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterDescriptor typeParameterDescriptorK0;
        SimpleTypeMarker simpleTypeMarkerF = classicTypeSystemContext.F(kotlinTypeMarker);
        if (!(simpleTypeMarkerF instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) simpleTypeMarkerF;
        if (classicTypeSystemContext.K(capturedTypeMarker) || !classicTypeSystemContext.j(classicTypeSystemContext.Y(classicTypeSystemContext.t(capturedTypeMarker))) || classicTypeSystemContext.W(capturedTypeMarker) != CaptureStatus.X) {
            return false;
        }
        TypeConstructor typeConstructorO = classicTypeSystemContext.O(kotlinTypeMarker2);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorO instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorO : null;
        return (typeVariableTypeConstructorMarker == null || (typeParameterDescriptorK0 = classicTypeSystemContext.k0(typeVariableTypeConstructorMarker)) == null || !classicTypeSystemContext.c(typeParameterDescriptorK0, typeConstructorMarker)) ? false : true;
    }
}
