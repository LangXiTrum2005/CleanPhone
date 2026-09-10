package ym;

import com.ironsource.O6;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f54559a = new j();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        n.f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return v.f53866a;
        }
        if (size == 1) {
            return j1.f.C(xj.n.o0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static Object e(Collection collection, a aVar, l lVar) {
        HashSet hashSet = new HashSet();
        ni.k kVar = new ni.k();
        kVar.f46767a = hashSet;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f(it.next(), aVar, kVar, lVar);
        }
        return lVar.i();
    }

    public static void f(Object obj, a aVar, ni.k kVar, l lVar) {
        if (obj != null) {
            if (kVar.f46767a.add(obj) && lVar.c(obj)) {
                Iterator it = aVar.r(obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), aVar, kVar, lVar);
                }
                lVar.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = O6.f26729m;
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Boolean g(Collection collection, a aVar, jk.b bVar) {
        return (Boolean) e(collection, aVar, new fm.c(bVar, new boolean[1]));
    }

    public static final boolean h(Throwable th2) {
        Class<?> superclass = th2.getClass();
        while (!n.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void j(Object obj) throws Throwable {
        if (obj instanceof k) {
            throw ((k) obj).f54558a;
        }
    }

    public abstract boolean c(Object obj);

    public abstract Object i();

    public void b(Object obj) {
    }
}
