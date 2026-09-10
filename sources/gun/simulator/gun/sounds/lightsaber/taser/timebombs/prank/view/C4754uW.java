package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.C2140s0;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4754uW {
    private static final C4754uW INSTANCE = new C4754uW();
    private final ConcurrentMap<Class<?>, InterfaceC3578h30> schemaCache = new ConcurrentHashMap();
    private final InterfaceC3666i30 schemaFactory = new WL();

    private C4754uW() {
    }

    public static C4754uW getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int schemaSize = 0;
        for (InterfaceC3578h30 interfaceC3578h30 : this.schemaCache.values()) {
            if (interfaceC3578h30 instanceof C2140s0) {
                schemaSize = ((C2140s0) interfaceC3578h30).getSchemaSize() + schemaSize;
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

    public <T> void mergeFrom(T t, AX ax) throws IOException {
        mergeFrom(t, ax, ExtensionRegistryLite.getEmptyRegistry());
    }

    public InterfaceC3578h30 registerSchema(Class<?> cls, InterfaceC3578h30 interfaceC3578h30) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(interfaceC3578h30, "schema");
        return this.schemaCache.putIfAbsent(cls, interfaceC3578h30);
    }

    public InterfaceC3578h30 registerSchemaOverride(Class<?> cls, InterfaceC3578h30 interfaceC3578h30) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(interfaceC3578h30, "schema");
        return this.schemaCache.put(cls, interfaceC3578h30);
    }

    public <T> InterfaceC3578h30 schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        InterfaceC3578h30 interfaceC3578h30 = this.schemaCache.get(cls);
        if (interfaceC3578h30 != null) {
            return interfaceC3578h30;
        }
        InterfaceC3578h30 interfaceC3578h30CreateSchema = ((WL) this.schemaFactory).createSchema(cls);
        InterfaceC3578h30 interfaceC3578h30RegisterSchema = registerSchema(cls, interfaceC3578h30CreateSchema);
        return interfaceC3578h30RegisterSchema != null ? interfaceC3578h30RegisterSchema : interfaceC3578h30CreateSchema;
    }

    public <T> void writeTo(T t, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        schemaFor(t).writeTo(t, interfaceC3642hm0);
    }

    public <T> void mergeFrom(T t, AX ax, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        schemaFor(t).mergeFrom(t, ax, extensionRegistryLite);
    }

    public <T> InterfaceC3578h30 schemaFor(T t) {
        return schemaFor((Class) t.getClass());
    }
}
