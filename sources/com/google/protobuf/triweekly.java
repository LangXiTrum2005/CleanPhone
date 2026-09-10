package com.google.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly implements preprohormone {
    private static final triweekly instance = new triweekly();

    private triweekly() {
    }

    public static triweekly getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.preprohormone
    public boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.preprohormone
    public rotuma messageInfoFor(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (rotuma) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
