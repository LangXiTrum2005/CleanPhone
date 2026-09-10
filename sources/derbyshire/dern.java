package derbyshire;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FieldDescriptor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, Object> f25221attabal;
    private final String name;

    /* JADX INFO: compiled from: FieldDescriptor.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Map<Class<?>, Object> f25222attabal = null;
        private final String name;

        public saneness(String str) {
            this.name = str;
        }

        public dern attabal() {
            return new dern(this.name, this.f25222attabal == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f25222attabal)));
        }

        public <T extends Annotation> saneness saneness(T t) {
            if (this.f25222attabal == null) {
                this.f25222attabal = new HashMap();
            }
            this.f25222attabal.put(t.annotationType(), t);
            return this;
        }
    }

    public static saneness attabal(String str) {
        return new saneness(str);
    }

    public static dern wireman(String str) {
        return new dern(str, Collections.EMPTY_MAP);
    }

    public <T extends Annotation> T dern(Class<T> cls) {
        return (T) this.f25221attabal.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dern)) {
            return false;
        }
        dern dernVar = (dern) obj;
        return this.name.equals(dernVar.name) && this.f25221attabal.equals(dernVar.f25221attabal);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.f25221attabal.hashCode();
    }

    public String saneness() {
        return this.name;
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.name + ", properties=" + this.f25221attabal.values() + "}";
    }

    public dern(String str, Map<Class<?>, Object> map) {
        this.name = str;
        this.f25221attabal = map;
    }
}
