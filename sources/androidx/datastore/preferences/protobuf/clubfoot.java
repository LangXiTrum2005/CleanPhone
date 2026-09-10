package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes.dex */
public final class clubfoot {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final clubfoot f9693dern = new clubfoot();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static boolean f9694wireman = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, premeiotic<?>> f9696saneness = new ConcurrentHashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final timberyard f9695attabal = new kattegat();

    public static clubfoot attabal() {
        return f9693dern;
    }

    public <T> premeiotic<T> dern(Class<T> cls) {
        gintrap.saneness(cls, "messageType");
        premeiotic<T> premeioticVarCreateSchema = (premeiotic) this.f9696saneness.get(cls);
        if (premeioticVarCreateSchema == null) {
            premeioticVarCreateSchema = this.f9695attabal.createSchema(cls);
            premeiotic<T> premeioticVar = (premeiotic<T>) saneness(cls, premeioticVarCreateSchema);
            if (premeioticVar != null) {
                return premeioticVar;
            }
        }
        return premeioticVarCreateSchema;
    }

    public premeiotic<?> saneness(Class<?> cls, premeiotic<?> premeioticVar) {
        gintrap.saneness(cls, "messageType");
        gintrap.saneness(premeioticVar, "schema");
        return this.f9696saneness.putIfAbsent(cls, premeioticVar);
    }

    public <T> premeiotic<T> wireman(T t) {
        return dern(t.getClass());
    }
}
