package ch;

import an.q;
import cn.d0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f6431a = new ConcurrentHashMap();

    public static c a(e eVar) {
        final q qVar = new q(eVar, 2);
        Object objCompute = f6431a.compute(eVar, new BiFunction() { // from class: ch.d
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (c) qVar.invoke(obj, obj2);
            }
        });
        n.c(objCompute);
        return (c) objCompute;
    }

    public static void b(e eVar) {
        c cVar;
        ConcurrentHashMap concurrentHashMap = f6431a;
        c cVar2 = (c) concurrentHashMap.get(eVar);
        if (cVar2 == null || cVar2.f6422c.decrementAndGet() != 0 || (cVar = (c) concurrentHashMap.remove(eVar)) == null) {
            return;
        }
        d0.i(cVar.f6421b.f42424a, null);
        cVar.f6420a.close();
    }
}
