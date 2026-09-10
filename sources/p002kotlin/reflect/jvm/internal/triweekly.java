package p002kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ReflectProperties.java */
/* JADX INFO: loaded from: classes5.dex */
public class triweekly {

    /* JADX INFO: compiled from: ReflectProperties.java */
    public static class attabal<T> extends saneness<T> implements Function0<T> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Function0<T> f31933arytenoidectomy;
        private volatile SoftReference<Object> value;

        public attabal(T t, Function0<T> function0) {
            if (function0 == null) {
                wireman(0);
            }
            this.value = null;
            this.f31933arytenoidectomy = function0;
            if (t != null) {
                this.value = new SoftReference<>(attabal(t));
            }
        }

        public static /* synthetic */ void wireman(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.triweekly.saneness, p002kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.value;
            if (softReference != null && (obj = softReference.get()) != null) {
                return dern(obj);
            }
            T tInvoke = this.f31933arytenoidectomy.invoke();
            this.value = new SoftReference<>(attabal(tInvoke));
            return tInvoke;
        }
    }

    /* JADX INFO: compiled from: ReflectProperties.java */
    public static abstract class saneness<T> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final Object f31934kowloon = new attabal();

        /* JADX INFO: compiled from: ReflectProperties.java */
        public static class attabal {
        }

        public Object attabal(T t) {
            return t == null ? f31934kowloon : t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public T dern(Object obj) {
            if (obj == f31934kowloon) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();

        public final T saneness(Object obj, Object obj2) {
            return invoke();
        }
    }

    public static /* synthetic */ void attabal(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static <T> attabal<T> dern(Function0<T> function0) {
        if (function0 == null) {
            attabal(1);
        }
        return saneness(null, function0);
    }

    public static <T> attabal<T> saneness(T t, Function0<T> function0) {
        if (function0 == null) {
            attabal(0);
        }
        return new attabal<>(t, function0);
    }
}
