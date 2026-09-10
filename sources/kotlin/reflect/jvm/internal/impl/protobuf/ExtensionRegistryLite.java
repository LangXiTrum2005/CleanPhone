package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f44198b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f44199a;

    public static final class ObjectIntPair {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageLite f44200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44201b;

        public ObjectIntPair(int i2, MessageLite messageLite) {
            this.f44200a = messageLite;
            this.f44201b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f44200a == objectIntPair.f44200a && this.f44201b == objectIntPair.f44201b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f44200a) * 65535) + this.f44201b;
        }
    }

    static {
        new ExtensionRegistryLite(0);
    }

    public ExtensionRegistryLite() {
        this.f44199a = new HashMap();
    }

    public final void a(GeneratedMessageLite.GeneratedExtension generatedExtension) {
        this.f44199a.put(new ObjectIntPair(generatedExtension.d.X, generatedExtension.f44212a), generatedExtension);
    }

    public ExtensionRegistryLite(int i2) {
        this.f44199a = Collections.EMPTY_MAP;
    }
}
