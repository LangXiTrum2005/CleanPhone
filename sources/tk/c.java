package tk;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m5.k f50955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m5.k f50956b;

    static {
        b bVar = b.f50945f;
        int i10 = a.f50940a;
        f50955a = new m5.k((jk.b) bVar);
        f50956b = new m5.k((jk.b) b.f50946g);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [jk.b, kotlin.jvm.internal.o] */
    public static final z a(Class jClass) {
        Object objPutIfAbsent;
        kotlin.jvm.internal.n.f(jClass, "jClass");
        m5.k kVar = f50955a;
        kVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) kVar.f45903c;
        Object objInvoke = concurrentHashMap.get(jClass);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(jClass, (objInvoke = ((kotlin.jvm.internal.o) kVar.f45902b).invoke(jClass)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (z) objInvoke;
    }
}
