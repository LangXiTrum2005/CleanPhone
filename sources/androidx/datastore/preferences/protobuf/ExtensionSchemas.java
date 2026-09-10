package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class ExtensionSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExtensionSchemaLite f4830a = new ExtensionSchemaLite();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExtensionSchema f4831b;

    static {
        ExtensionSchema extensionSchema;
        Protobuf protobuf = Protobuf.f4904c;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            extensionSchema = null;
        }
        f4831b = extensionSchema;
    }
}
