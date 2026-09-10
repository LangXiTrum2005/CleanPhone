package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "Cache", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ModuleNameRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Cache f43294a = new Cache(null, null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Cache f43295b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f43296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f43297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f43298c;

        public Cache(Method method, Method method2, Method method3) {
            this.f43296a = method;
            this.f43297b = method2;
            this.f43298c = method3;
        }
    }
}
