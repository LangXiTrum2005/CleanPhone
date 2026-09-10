package zk;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C0335f8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final il.o f54974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final il.o f54975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final il.o f54976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final il.o f54977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final il.o f54978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final il.o f54979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final il.o f54980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final il.o f54981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final il.o f54982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final il.o f54983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k0 f54984k;
    public static final k0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k0 f54985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final vm.o f54986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f54987o;

    static {
        u0 u0Var = u0.f55002d;
        il.o oVar = new il.o(u0Var, 3);
        f54974a = oVar;
        v0 v0Var = v0.f55003d;
        il.o oVar2 = new il.o(v0Var, 4);
        f54975b = oVar2;
        w0 w0Var = w0.f55004d;
        il.o oVar3 = new il.o(w0Var, 5);
        f54976c = oVar3;
        r0 r0Var = r0.f54996d;
        il.o oVar4 = new il.o(r0Var, 6);
        f54977d = oVar4;
        x0 x0Var = x0.f55006d;
        il.o oVar5 = new il.o(x0Var, 7);
        f54978e = oVar5;
        t0 t0Var = t0.f55000d;
        il.o oVar6 = new il.o(t0Var, 8);
        f54979f = oVar6;
        q0 q0Var = q0.f54995d;
        il.o oVar7 = new il.o(q0Var, 9);
        f54980g = oVar7;
        s0 s0Var = s0.f54997d;
        il.o oVar8 = new il.o(s0Var, 10);
        f54981h = oVar8;
        y0 y0Var = y0.f55009d;
        il.o oVar9 = new il.o(y0Var, 11);
        f54982i = oVar9;
        Collections.unmodifiableSet(xj.k.E0(new il.o[]{oVar, oVar2, oVar4, oVar6}));
        HashMap map = new HashMap(6);
        map.put(oVar2, 0);
        map.put(oVar, 0);
        map.put(oVar4, 1);
        map.put(oVar3, 1);
        map.put(oVar5, 2);
        Collections.unmodifiableMap(map);
        f54983j = oVar5;
        f54984k = new k0(2);
        l = new k0(3);
        f54985m = new k0(4);
        try {
            Iterator it = Arrays.asList(new vm.o[0]).iterator();
            f54986n = it.hasNext() ? (vm.o) it.next() : vm.o.f52688a;
            HashMap map2 = new HashMap();
            f54987o = map2;
            map2.put(u0Var, oVar);
            map2.put(v0Var, oVar2);
            map2.put(w0Var, oVar3);
            map2.put(r0Var, oVar4);
            map2.put(x0Var, oVar5);
            map2.put(t0Var, oVar6);
            map2.put(q0Var, oVar7);
            map2.put(s0Var, oVar8);
            map2.put(y0Var, oVar9);
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = C0335f8.f28653k;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(il.o oVar, il.o oVar2) {
        if (oVar == null) {
            a(12);
            throw null;
        }
        n.a aVar = oVar.f43095a;
        if (oVar2 == null) {
            a(13);
            throw null;
        }
        n.a aVar2 = oVar2.f43095a;
        Integer numA = aVar.a(aVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = aVar2.a(aVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static m c(jm.d dVar, m mVar, j jVar) {
        m mVarC;
        if (mVar == null) {
            a(8);
            throw null;
        }
        if (jVar == null) {
            a(9);
            throw null;
        }
        for (m mVar2 = (m) mVar.a(); mVar2 != null && mVar2.getVisibility() != f54979f; mVar2 = (m) bm.e.i(mVar2, m.class, true)) {
            if (!mVar2.getVisibility().a(dVar, mVar2, jVar)) {
                return mVar2;
            }
        }
        if (!(mVar instanceof cl.s0) || (mVarC = c(dVar, ((cl.u0) ((cl.s0) mVar)).F, jVar)) == null) {
            return null;
        }
        return mVarC;
    }

    public static boolean d(m mVar, j jVar) {
        if (jVar == null) {
            a(7);
            throw null;
        }
        k0 k0VarF = bm.e.f(jVar);
        if (k0VarF != k0.f54971b) {
            return k0VarF.equals(bm.e.f(mVar));
        }
        return false;
    }

    public static boolean e(il.o oVar) {
        if (oVar != null) {
            return oVar == f54974a || oVar == f54975b;
        }
        a(14);
        throw null;
    }

    public static il.o f(n.a aVar) {
        if (aVar == null) {
            a(15);
            throw null;
        }
        il.o oVar = (il.o) f54987o.get(aVar);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + aVar);
    }
}
