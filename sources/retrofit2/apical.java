package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Invocation.java */
/* JADX INFO: loaded from: classes5.dex */
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Method f36449attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<?> f36450saneness;

    public apical(Method method, List<?> list) {
        this.f36449attabal = method;
        this.f36450saneness = Collections.unmodifiableList(list);
    }

    public Method attabal() {
        return this.f36449attabal;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f36449attabal.getDeclaringClass().getName(), this.f36449attabal.getName(), this.f36450saneness);
    }
}
