package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class adultoid implements grimness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final adultoid f9688attabal = new adultoid();

    public static adultoid attabal() {
        return f9688attabal;
    }

    @Override // androidx.datastore.preferences.protobuf.grimness
    public boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.grimness
    public seminary messageInfoFor(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (seminary) GeneratedMessageLite.adultoid(cls.asSubclass(GeneratedMessageLite.class)).cutely();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
