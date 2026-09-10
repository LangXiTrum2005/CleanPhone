package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class NewInstanceSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NewInstanceSchema f4899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NewInstanceSchemaLite f4900b;

    static {
        NewInstanceSchema newInstanceSchema;
        Protobuf protobuf = Protobuf.f4904c;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            newInstanceSchema = null;
        }
        f4899a = newInstanceSchema;
        f4900b = new NewInstanceSchemaLite();
    }
}
