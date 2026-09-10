package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes3.dex */
public final class supplicat {
    private static final supplicat INSTANCE = new supplicat();
    private final ConcurrentMap<Class<?>, seminary<?>> schemaCache = new ConcurrentHashMap();
    private final grimness schemaFactory = new graveside();

    private supplicat() {
    }

    public static supplicat getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int schemaSize = 0;
        for (seminary<?> seminaryVar : this.schemaCache.values()) {
            if (seminaryVar instanceof cuirassed) {
                schemaSize += ((cuirassed) seminaryVar).getSchemaSize();
            }
        }
        return schemaSize;
    }

    public <T> boolean isInitialized(T t) {
        return schemaFor(t).isInitialized(t);
    }

    public <T> void makeImmutable(T t) {
        schemaFor(t).makeImmutable(t);
    }

    public <T> void mergeFrom(T t, polder polderVar) throws IOException {
        mergeFrom(t, polderVar, ExtensionRegistryLite.getEmptyRegistry());
    }

    public seminary<?> registerSchema(Class<?> cls, seminary<?> seminaryVar) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(seminaryVar, "schema");
        return this.schemaCache.putIfAbsent(cls, seminaryVar);
    }

    public seminary<?> registerSchemaOverride(Class<?> cls, seminary<?> seminaryVar) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(seminaryVar, "schema");
        return this.schemaCache.put(cls, seminaryVar);
    }

    public <T> seminary<T> schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        seminary<T> seminaryVarCreateSchema = (seminary) this.schemaCache.get(cls);
        if (seminaryVarCreateSchema == null) {
            seminaryVarCreateSchema = this.schemaFactory.createSchema(cls);
            seminary<T> seminaryVar = (seminary<T>) registerSchema(cls, seminaryVarCreateSchema);
            if (seminaryVar != null) {
                return seminaryVar;
            }
        }
        return seminaryVarCreateSchema;
    }

    public <T> void writeTo(T t, Writer writer) throws IOException {
        schemaFor(t).writeTo(t, writer);
    }

    public <T> void mergeFrom(T t, polder polderVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        schemaFor(t).mergeFrom(t, polderVar, extensionRegistryLite);
    }

    public <T> seminary<T> schemaFor(T t) {
        return schemaFor((Class) t.getClass());
    }
}
