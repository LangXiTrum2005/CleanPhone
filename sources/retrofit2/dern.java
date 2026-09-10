package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: CallAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface dern<R, T> {

    /* JADX INFO: compiled from: CallAdapter.java */
    public static abstract class attabal {
        public static Class<?> dern(Type type) {
            return trm.impromptu(type);
        }

        public static Type saneness(int i, ParameterizedType parameterizedType) {
            return trm.competently(i, parameterizedType);
        }

        @Nullable
        public abstract dern<?, ?> attabal(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar);
    }

    Type attabal();

    T saneness(saneness<R> sanenessVar);
}
