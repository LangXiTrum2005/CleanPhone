package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class dovishness implements saran {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dovishness f22193attabal = new dovishness();

    public static dovishness attabal() {
        return f22193attabal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.saran
    public boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.saran
    public grimness messageInfoFor(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (grimness) GeneratedMessageLite.graveside(cls.asSubclass(GeneratedMessageLite.class)).cutely();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
