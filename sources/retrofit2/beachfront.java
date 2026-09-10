package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface beachfront<F, T> {

    /* JADX INFO: compiled from: Converter.java */
    public static abstract class attabal {
        public static Type attabal(int i, ParameterizedType parameterizedType) {
            return trm.competently(i, parameterizedType);
        }

        public static Class<?> saneness(Type type) {
            return trm.impromptu(type);
        }

        @Nullable
        public beachfront<?, okhttp3.cord> dern(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, preprohormone preprohormoneVar) {
            return null;
        }

        @Nullable
        public beachfront<?, String> marial(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar) {
            return null;
        }

        @Nullable
        public beachfront<okhttp3.stratoscope, ?> wireman(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar) {
            return null;
        }
    }

    @Nullable
    T convert(F f) throws IOException;
}
