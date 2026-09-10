package kotlin.reflect.jvm.internal.impl.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f44635a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f44636b = new AtomicInteger(0);

    public abstract int a(ConcurrentHashMap concurrentHashMap, String str, Function1 function1);

    public final int b(KClass kClass) {
        Intrinsics.f(kClass, "kClass");
        ConcurrentHashMap concurrentHashMap = this.f44635a;
        String strK = kClass.k();
        Intrinsics.c(strK);
        return a(concurrentHashMap, strK, new Function1<String, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.util.TypeRegistry$getId$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                Intrinsics.f(it, "it");
                return Integer.valueOf(this.X.f44636b.getAndIncrement());
            }
        });
    }
}
