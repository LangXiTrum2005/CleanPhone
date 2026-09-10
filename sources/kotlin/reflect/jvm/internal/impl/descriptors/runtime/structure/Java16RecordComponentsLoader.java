package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
final class Java16RecordComponentsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Cache f43682a;

    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f43683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f43684b;

        public Cache(Method method, Method method2) {
            this.f43683a = method;
            this.f43684b = method2;
        }
    }

    public static Cache a(Object obj) {
        Cache cache = f43682a;
        if (cache == null) {
            Class<?> cls = obj.getClass();
            try {
                cache = new Cache(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                cache = new Cache(null, null);
            }
            f43682a = cache;
        }
        return cache;
    }
}
