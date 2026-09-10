package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
final class Java16SealedRecordLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Cache f43685a;

    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f43686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f43687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f43688c;
        public final Method d;

        public Cache(Method method, Method method2, Method method3, Method method4) {
            this.f43686a = method;
            this.f43687b = method2;
            this.f43688c = method3;
            this.d = method4;
        }
    }

    public static Cache a() {
        Cache cache;
        Cache cache2 = f43685a;
        if (cache2 != null) {
            return cache2;
        }
        try {
            cache = new Cache(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            cache = new Cache(null, null, null, null);
        }
        f43685a = cache;
        return cache;
    }
}
