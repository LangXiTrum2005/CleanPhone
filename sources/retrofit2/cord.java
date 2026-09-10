package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ServiceMethod.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class cord<T> {
    public static <T> cord<T> saneness(preprohormone preprohormoneVar, Method method) {
        gintrap gintrapVarSaneness = gintrap.saneness(preprohormoneVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (trm.cutely(genericReturnType)) {
            throw trm.impassible(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return cutely.beachfront(preprohormoneVar, method, gintrapVarSaneness);
        }
        throw trm.impassible(method, "Service methods cannot return void.", new Object[0]);
    }

    @Nullable
    public abstract T attabal(Object[] objArr);
}
