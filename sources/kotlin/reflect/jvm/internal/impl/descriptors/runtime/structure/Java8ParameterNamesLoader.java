package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
final class Java8ParameterNamesLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Java8ParameterNamesLoader f43689a = new Java8ParameterNamesLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Cache f43690b;

    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f43691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f43692b;

        public Cache(Method method, Method method2) {
            this.f43691a = method;
            this.f43692b = method2;
        }
    }
}
