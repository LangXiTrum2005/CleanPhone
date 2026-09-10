package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f4824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ExtensionRegistryLite f4825c = new ExtensionRegistryLite();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4826a = Collections.EMPTY_MAP;

    public static class ExtensionClassHolder {
        static {
            try {
                Class.forName("androidx.datastore.preferences.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static final class ObjectIntPair {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageLite f4827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4828b;

        public ObjectIntPair(int i2, MessageLite messageLite) {
            this.f4827a = messageLite;
            this.f4828b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f4827a == objectIntPair.f4827a && this.f4828b == objectIntPair.f4828b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f4827a) * 65535) + this.f4828b;
        }
    }

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite extensionRegistryLite;
        Protobuf protobuf = Protobuf.f4904c;
        ExtensionRegistryLite extensionRegistryLite2 = f4824b;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = f4824b;
                if (extensionRegistryLite == null) {
                    Class cls = ExtensionRegistryFactory.f4823a;
                    ExtensionRegistryLite extensionRegistryLite3 = null;
                    if (cls != null) {
                        try {
                            extensionRegistryLite3 = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    extensionRegistryLite = extensionRegistryLite3 != null ? extensionRegistryLite3 : f4825c;
                    f4824b = extensionRegistryLite;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionRegistryLite;
    }
}
