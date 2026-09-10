package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface Schema<T> {
    void a(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    int b(AbstractMessageLite abstractMessageLite);

    int c(GeneratedMessageLite generatedMessageLite);

    void d(Object obj, Writer writer);

    boolean e(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, Object obj2);

    Object newInstance();
}
