package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: OptionalConverterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class impassible extends beachfront.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront.attabal f36540attabal = new impassible();

    /* JADX INFO: compiled from: OptionalConverterFactory.java */
    public static final class attabal<T> implements beachfront<okhttp3.stratoscope, Optional<T>> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final beachfront<okhttp3.stratoscope, T> f36541attabal;

        public attabal(beachfront<okhttp3.stratoscope, T> beachfrontVar) {
            this.f36541attabal = beachfrontVar;
        }

        @Override // retrofit2.beachfront
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(okhttp3.stratoscope stratoscopeVar) throws IOException {
            return Optional.ofNullable(this.f36541attabal.convert(stratoscopeVar));
        }
    }

    @Override // retrofit2.beachfront.attabal
    @Nullable
    public beachfront<okhttp3.stratoscope, ?> wireman(Type type, Annotation[] annotationArr, preprohormone preprohormoneVar) {
        if (beachfront.attabal.saneness(type) != Optional.class) {
            return null;
        }
        return new attabal(preprohormoneVar.impromptu(beachfront.attabal.attabal(0, (ParameterizedType) type), annotationArr));
    }
}
