package il;

import cl.h0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f43097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f43098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f43099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f43100d;

    static {
        dl.a aVar = dl.a.f38946d;
        o oVar = new o(aVar, 0);
        f43097a = oVar;
        dl.c cVar = dl.c.f38948d;
        o oVar2 = new o(cVar, 1);
        f43098b = oVar2;
        dl.b bVar = dl.b.f38947d;
        o oVar3 = new o(bVar, 2);
        f43099c = oVar3;
        HashMap map = new HashMap();
        f43100d = map;
        map.put(aVar, oVar);
        map.put(cVar, oVar2);
        map.put(bVar, oVar3);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(jm.d dVar, zk.m mVar, zk.j jVar) {
        zk.m mVarT;
        if (jVar == null) {
            a(1);
            throw null;
        }
        if (mVar instanceof zk.c) {
            mVarT = bm.e.t((zk.c) mVar);
        } else {
            int i10 = bm.e.f5728a;
            mVarT = mVar;
        }
        if (c(mVarT, jVar)) {
            return true;
        }
        return zk.n.f54976c.a(dVar, mVar, jVar);
    }

    public static boolean c(zk.m mVar, zk.j jVar) {
        if (mVar == null) {
            a(2);
            throw null;
        }
        if (jVar == null) {
            a(3);
            throw null;
        }
        zk.b0 b0Var = (zk.b0) bm.e.i(mVar, zk.b0.class, false);
        zk.b0 b0Var2 = (zk.b0) bm.e.i(jVar, zk.b0.class, false);
        return (b0Var2 == null || b0Var == null || !((h0) b0Var).f6518e.equals(((h0) b0Var2).f6518e)) ? false : true;
    }
}
