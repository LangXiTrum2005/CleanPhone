package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes3.dex */
public final class clubfoot {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final clubfoot f22173dern = new clubfoot();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static boolean f22174wireman = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, premeiotic<?>> f22176saneness = new ConcurrentHashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final timberyard f22175attabal = new supplicat();

    public static clubfoot attabal() {
        return f22173dern;
    }

    public <T> premeiotic<T> dern(Class<T> cls) {
        rotuma.saneness(cls, "messageType");
        premeiotic<T> premeioticVarCreateSchema = (premeiotic) this.f22176saneness.get(cls);
        if (premeioticVarCreateSchema == null) {
            premeioticVarCreateSchema = this.f22175attabal.createSchema(cls);
            premeiotic<T> premeioticVar = (premeiotic<T>) saneness(cls, premeioticVarCreateSchema);
            if (premeioticVar != null) {
                return premeioticVar;
            }
        }
        return premeioticVarCreateSchema;
    }

    public premeiotic<?> saneness(Class<?> cls, premeiotic<?> premeioticVar) {
        rotuma.saneness(cls, "messageType");
        rotuma.saneness(premeioticVar, "schema");
        return this.f22176saneness.putIfAbsent(cls, premeioticVar);
    }

    public <T> premeiotic<T> wireman(T t) {
        return dern(t.getClass());
    }
}
