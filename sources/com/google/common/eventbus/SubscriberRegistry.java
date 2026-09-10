package com.google.common.eventbus;

import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class SubscriberRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LoadingCache f19990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LoadingCache f19991b;

    /* JADX INFO: renamed from: com.google.common.eventbus.SubscriberRegistry$1, reason: invalid class name */
    public class AnonymousClass1 extends CacheLoader<Class<?>, ImmutableList<Method>> {
        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            LoadingCache loadingCache = SubscriberRegistry.f19990a;
            Set setB = new TypeToken.TypeSet().B();
            HashMap map = new HashMap();
            Iterator it = setB.iterator();
            while (it.hasNext()) {
                for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                    if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        boolean z2 = parameterTypes.length == 1;
                        int length = parameterTypes.length;
                        if (!z2) {
                            throw new IllegalArgumentException(Strings.a("Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, Integer.valueOf(length)));
                        }
                        boolean zIsPrimitive = parameterTypes[0].isPrimitive();
                        String name = parameterTypes[0].getName();
                        Class<?> cls = parameterTypes[0];
                        Map map2 = Primitives.f20062a;
                        cls.getClass();
                        Class<?> cls2 = (Class) Primitives.f20062a.get(cls);
                        if (cls2 != null) {
                            cls = cls2;
                        }
                        String simpleName = cls.getSimpleName();
                        if (zIsPrimitive) {
                            throw new IllegalArgumentException(Strings.a("@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, name, simpleName));
                        }
                        MethodIdentifier methodIdentifier = new MethodIdentifier(method);
                        if (!map.containsKey(methodIdentifier)) {
                            map.put(methodIdentifier, method);
                        }
                    }
                }
            }
            return ImmutableList.u(map.values());
        }
    }

    /* JADX INFO: renamed from: com.google.common.eventbus.SubscriberRegistry$2, reason: invalid class name */
    public class AnonymousClass2 extends CacheLoader<Class<?>, ImmutableSet<Class<?>>> {
        @Override // com.google.common.cache.CacheLoader
        public final Object a(Object obj) {
            return ImmutableSet.u(new TypeToken.TypeSet().B());
        }
    }

    public static final class MethodIdentifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f19993b;

        public MethodIdentifier(Method method) {
            this.f19992a = method.getName();
            this.f19993b = Arrays.asList(method.getParameterTypes());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof MethodIdentifier) {
                MethodIdentifier methodIdentifier = (MethodIdentifier) obj;
                if (this.f19992a.equals(methodIdentifier.f19992a) && this.f19993b.equals(methodIdentifier.f19993b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f19992a, this.f19993b});
        }
    }

    static {
        CacheBuilder cacheBuilderC = CacheBuilder.c();
        cacheBuilderC.d();
        f19990a = cacheBuilderC.a(new AnonymousClass1());
        CacheBuilder cacheBuilderC2 = CacheBuilder.c();
        cacheBuilderC2.d();
        f19991b = cacheBuilderC2.a(new AnonymousClass2());
    }
}
