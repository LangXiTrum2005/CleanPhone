package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageInfoFactory f4848a = new GeneratedMessageInfoFactory();

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean isSupported(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo messageInfoFor(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (MessageInfo) GeneratedMessageLite.j(cls.asSubclass(GeneratedMessageLite.class)).h(GeneratedMessageLite.MethodToInvoke.Z, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }
}
